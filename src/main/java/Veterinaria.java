import java.util.*;
public class Veterinaria 
{

	static ArrayList<Animal> animales = new ArrayList<Animal>();
	public static void main(String[] args) 
	{
		
		animales.add(new Animal("Tommy", "Perro", new Condicion("Sano"), 4));
		animales.add(new Animal("Roy", "Perro", new Condicion("Enfermo"), 6));
		animales.add(new Animal("Uri", "Perro", new Condicion("Sano"), 27));
		
		ShowAll();
		
	}
	
	public static void ShowAll()
	{
		for (Animal animal : animales)
		{
			animal.DinnerTime();
		}
	}
}
