package modelo;

public class Lugar {
	
	private String tipoDeLugar;
	private String nomeDoLugar;
	private float longitude;
	private float latitude;
	
	public Lugar(String tipoLugar, String nomeLugar, float lat, float longet) {
		this.tipoDeLugar = tipoLugar;
		this.nomeDoLugar = nomeLugar;
		this.longitude = longet;
		this.latitude = lat;
	}
	
	public String getTipoDeLugar() {
		return this.tipoDeLugar;
	}
	
	public void setTipoDeLugar(String novoTipoLugar) {
		this.tipoDeLugar = novoTipoLugar;
	}
	
	public String GetNomeDoLugar() {
		return this.nomeDoLugar;
	}
	
	public void setNomeDoLugar(String novoNome) {
		this.nomeDoLugar = novoNome;
	}
	
	public float getLatitude() {
		return this.latitude;
	}
	public void setLatitude(float novaLati) {
		this.latitude = novaLati;
	}
	public float getLongetude() {
		return this.longitude;
	}
	
	public void setLongetude(float novaLongetude) {
		this.longitude = novaLongetude;
	}

}
