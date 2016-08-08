
public class Medication
{
	private String nombre;
	private int dose;
	Medication(){}
	
	Medication(String nombre, int dose)
	{
		setNombre(nombre);
		setDose(dose);
	}
	
	public int getDose()
	{
		return dose;
	}

	public void setDose(int dose)
	{
		this.dose = dose;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}

	@Override
	public String toString()
	{
		String str = "";
		if(!getNombre().equalsIgnoreCase("Ninguno"))
			str = getDose() + " " + getNombre();
		return str;
	}
}
