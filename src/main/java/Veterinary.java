import java.util.ArrayList;
public class Veterinary 
{

	static ArrayList<Animal> animales = new ArrayList<Animal>();
	public static void main(String[] args) 
	{
		
		animales.add(new Animal("Tommy", new Species("Perro", new Food("Pro plan")), Condition.HEALTHY, 4));
		animales.add(new Animal("Roy", new Species("Perro", new Food("Dog chow")), Condition.SICK, 6));
		animales.add(new Animal("Uri", new Species("Perro", new Food("Royal")), Condition.HEALTHY, 27));

		ShowAll();
		
	}
	
	public static void ShowAll()
	{
		for (Animal animal : animales)
		{
			animal.dinnerTime();
		}
	}
}
