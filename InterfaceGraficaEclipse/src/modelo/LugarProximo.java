package modelo;

public class LugarProximo {
	
	private Hotel hotel;
	private Lugar lugar;
	private double distancia;
	
	
	
	public LugarProximo(Hotel h, Lugar l, double dist) {
		this.hotel = h;
		this.lugar = l;
		this.distancia = dist;
		
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
		return this.distancia;
	}
	
	public void setDistancia(double dist) {
		this.distancia = dist;
	}
	
	
}
