package modelo;

public class LugarProximo {
	
	private String nomeDoLugar;
	private String tipoDeLugar;
	private double distanciaLugarKM;
	
	public LugarProximo() {}
	public LugarProximo(String nomeDoLugar, String tipoDeLugar, double distanciaLugarKM) {
		
		this.nomeDoLugar = nomeDoLugar;
		this.tipoDeLugar = tipoDeLugar;
		this.distanciaLugarKM = distanciaLugarKM;
	}
	
	public double calcularDistancia(double kmlugar, double kmHotel) {
		
		return Math.abs(kmlugar-kmHotel);
	}
	public String getNomeDoLugar() {
		return nomeDoLugar;
	}
	public void setNomeDoLugar(String nomeDoLugar) {
		this.nomeDoLugar = nomeDoLugar;
	}
	@Override
	public String toString() {
		return nomeDoLugar + "\n" + tipoDeLugar + "\n"
				+ distanciaLugarKM;
	}
	public String getTipoDeLugar() {
		return tipoDeLugar;
	}
	public void setTipoDeLugar(String tipoDeLugar) {
		this.tipoDeLugar = tipoDeLugar;
	}
	public double getDistanciaLugarKM() {
		return distanciaLugarKM;
	}
	public void setDistanciaLugarKM(double distanciaLugarKM) {
		this.distanciaLugarKM = distanciaLugarKM;
	}
}
