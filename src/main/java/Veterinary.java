import java.util.ArrayList;
import java.util.Scanner;

import com.poloit.animal.Animal;
import com.poloit.database.DataBaseConnector;
public class Veterinary 
{

	static ArrayList<Animal> animales = new ArrayList<Animal>();
	public static void main(String[] args) 
	{
		String query;
		DataBaseConnector.openConnection();
		String cmd;
		do
		{
			cmd = new Scanner(System.in).next();
			if(cmd.equalsIgnoreCase("CHECK"))
			{
				DataBaseConnector.selectionQuery();
			}
			else if(cmd.equalsIgnoreCase("ADD"))
			{
				System.out.print("ID: ");
				int id = new Scanner(System.in).nextInt();
				System.out.print("NAME: ");
				String name = new Scanner(System.in).next();
				
				DataBaseConnector.tableModificationQuery(id, name);
			}
			else if(!cmd.equalsIgnoreCase("EXIT"))
			{
				System.out.println("Opcion incorrecta");
			}
		}while(!cmd.equalsIgnoreCase("EXIT"));
		DataBaseConnector.closeConnection();

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
