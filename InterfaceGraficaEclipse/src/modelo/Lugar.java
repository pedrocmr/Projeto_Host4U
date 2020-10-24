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
	
	public double distance(Lugar lugar) {

	    final int R = 6371;

	    double latDistance = Math.toRadians(lugar.getLatitude() - latitude);
	    double lonDistance = Math.toRadians(lugar.getLongitude() - longitude);
	    double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
	            + Math.cos(Math.toRadians(latitude)) * Math.cos(Math.toRadians(lugar.getLatitude()))
	            * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	    double distance = R * c * 1000;

	    distance = Math.pow(distance, 2);

	    return Math.sqrt(distance);
	}


	@Override
	public String toString() {
		return "Lugar: " + tipoDeLugar + ", Nome: " + nomeDoLugar + ", Longitude: " + longitude + ", Latitude: "
				+ latitude;
	}

}
