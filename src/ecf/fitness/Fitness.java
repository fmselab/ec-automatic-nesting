package ecf.fitness;

import org.w3c.dom.Element;

import ecf.Individual;


public abstract class Fitness implements Comparable<Fitness> {

	private boolean valid = true;
	

	private double value;

	private Individual individual;
	
	
	public abstract Fitness copy();

	public abstract void write(Element element);


	public abstract void read(Element element);


	public void evaluate(IEvaluate ievaluate){	
		ievaluate.evaluate(this);
	}


	public boolean isValid() {
		return valid;
	}


	public void setValid(boolean valid) {
		this.valid = valid;
	}


	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}


	public Individual getIndividual() {
		return individual;
	}


	public void setIndividual(Individual individual) {
		this.individual = individual;
	}
}
