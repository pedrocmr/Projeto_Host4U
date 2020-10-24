package modelo;

public class LugarProximo {

	private Hotel hotel;
	private Lugar lugar;
	private double distanciaEmKm;

	public LugarProximo(Hotel h, Lugar l) {
		this.hotel = h;
		this.lugar = l;
		this.distanciaEmKm = h.getLugar().distance(l);

	}

	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel h) {
		this.hotel = h;
	}

	public Lugar getLugar() {
		return this.lugar;
	}

	public void setLugar(Lugar l) {
		this.lugar = l;
	}

	public double getDistancia() {
		return this.distanciaEmKm;
	}

	public void setDistancia(double dist) {
		this.distanciaEmKm = dist;
	}

	@Override
	public String toString() {
		return "LugarProximo [Hotel: " + hotel.getNome() + ", Lugar: " + lugar.getNomeDoLugar()
				+ ", Distância para om Hotel: " + distanciaEmKm + "]";
	}

}
