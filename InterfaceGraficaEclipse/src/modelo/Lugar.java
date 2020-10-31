package modelo;

public class Lugar {

	private String tipoDeLugar;
	private String nomeDoLugar;
	private double longitude;
	private double latitude;

	public Lugar(String tipoLugar, String nomeLugar, double lat, double longet) {
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

	public String getNomeDoLugar() {
		return this.nomeDoLugar;
	}

	public void setNomeDoLugar(String novoNome) {
		this.nomeDoLugar = novoNome;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(float novaLati) {
		this.latitude = novaLati;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
	@Override
	public String toString() {
		return "Lugar: " + tipoDeLugar + ", Nome: " + nomeDoLugar + ", Longitude: " + longitude + ", Latitude: "
				+ latitude;
	}

}
