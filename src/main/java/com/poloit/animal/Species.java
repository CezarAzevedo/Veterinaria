package com.poloit.animal;
public class Species
{
	private String name;
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Food getAlimento()
	{
		return alimento;
	}

	public void setAlimento(Food alimento)
	{
		this.alimento = alimento;
	}

	private Food alimento;
	
	public Species(){}

	public Species(String nombre, Food alimento)
	{
		setAlimento(alimento);
		setName(nombre);
	}
}
