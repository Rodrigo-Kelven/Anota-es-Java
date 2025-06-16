package interfaces;

public class Carro implements Motor, Veiculo{
	
	String nameCar;
	
	
	public String setNome(String nomeCar) {
		this.nameCar = nomeCar;
	}
	
	@Override
    public String getNome() { 
		return nameCar; 
	}
	
	@Override
	public int getAno() { 
		return 1995;
	}
	
	@Override
	public double getPotencia() { 
		return 156.5;
	}
	
	@Override
	public double getCavalos() { 
		return 200;
	}
	
	
}
