
public abstract class Alimento
{
	String nombre;
	
	public Alimento(){}
	
	public Alimento(String nombre)
	{
		this.nombre = nombre;
	}
	
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		String str = nombre;
		return str;
	}
}

