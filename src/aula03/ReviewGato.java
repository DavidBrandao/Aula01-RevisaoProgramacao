package aula03;

public class ReviewGato extends ReviewAnimal{
	

	private String temperamento;
	private String corRabo;
	
	ReviewGato(String cor, double peso, String raca, double altura, String temperamento, String corRabo){
		
		super(cor,peso,raca,altura);
		
		this.temperamento = temperamento;
		this.corRabo = corRabo;
	}
	
	
	public String getTemperamento() {
		return temperamento;
	}
	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}
	public String getCorRabo() {
		return corRabo;
	}
	public void setCorRabo(String corRabo) {
		this.corRabo = corRabo;
	}
	
	
}
