
public class Animal 
{
	String name;
	Condicion condition;
	Especie specie;
	int mealTime;
	
	public Animal() {}
	
	public Animal(String nombre, String especie, Condicion condicion, int mealTime)
	{
		this.name = nombre;
		this.specie = new Especie(especie, condicion);
		this.condition = condicion;
		setMealTime(mealTime);
	}
	
	public void DinnerTime()
	{
		System.out.println(name + " come " + specie.alimento + " a las " + mealTime);
	}
	
	public void setMealTime(int mealTime)
	{
		if(mealTime >= 0 && mealTime < 24)
			this.mealTime = mealTime;
		else
			// Just having fun with maths :)
			this.mealTime = Math.abs(mealTime) % 24; 
	}
}
