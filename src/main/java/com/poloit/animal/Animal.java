package com.poloit.animal;

public class Animal 
{
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Condition getCondition()
	{
		return condition;
	}

	public void setCondition(Condition condition)
	{
		this.condition = condition;
	}

	public Species getSpecie()
	{
		return specie;
	}

	public void setSpecie(Species specie)
	{
		this.specie = specie;
	}

	public int getMealTime()
	{
		return mealTime;
	}
	private String name;
	private Condition condition;
	private Species specie;
	
	int mealTime;
	
	public Animal() {}
	
	public Animal(String name, Species specie, Condition condicion, int mealTime)
	{
		setName(name);
		setSpecie(specie);
		setCondition(condicion);
		setMealTime(mealTime);
	}
	
	public void dinnerTime()
	{
		System.out.println(name + " eats " + specie.getAlimento() + " at " + mealTime);
		System.out.println("It's condition is: " + condition + "(" + condition.getMedicamento() + ")");
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
