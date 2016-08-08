package com.poloit.animal;

public enum Condition
{
	SICK(new Medication("Pastillas", 5)),
	HEALTHY(new Medication("Ninguno", 0));
	
	private Medication medicamento;
	
	private Condition(){}
	private Condition(Medication medicamento)
	{
		this.medicamento = medicamento;
	}
	
	public Medication getMedicamento()
	{
		return medicamento;
	}
}
