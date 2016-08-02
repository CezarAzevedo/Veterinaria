public class Especie
{
	String nombre;
	Alimento alimento;
	
	
	Especie(){}
	
	Especie(String nombre, Condicion condicion)
	{
		this.nombre = nombre;
		if(condicion.nombre.equalsIgnoreCase("Enfermo"))
		{
			alimento = new AlimentoEnfermos();
		}
		else if(condicion.nombre.equalsIgnoreCase("Sano"))
		{
			alimento = new AlimentoSanos();
		}
	}
}
