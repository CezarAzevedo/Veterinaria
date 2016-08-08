
public class Food
{
	private String name;
	
	public String getName()
	{
		return name;
	}

	public void setName(String nombre)
	{
		this.name = nombre;
	}

	public Food(){}
	
	public Food(String nombre)
	{
		setName(nombre);
	}
	
	@Override
	public String toString()
	{
		String str = name;
		return str;
	}
}

