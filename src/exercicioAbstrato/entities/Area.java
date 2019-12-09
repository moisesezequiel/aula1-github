package exercicioAbstrato.entities;

import exercicioAbstrato.enuns.Cores;

public abstract class Area {

	private Cores cores;
	
	public Area(){
		
	}

	public Area(Cores cores) {
		this.cores = cores;
	}

	public Cores getCores() {
		return cores;
	}

	public void setCores(Cores cores) {
		this.cores = cores;
	}
	
	public abstract double area();
}
