package modelo;

import java.time.LocalDateTime;

import javafx.util.converter.LocalDateTimeStringConverter;

public class Teste {

	public static void main(String[] args) {
		
	
		Usuario u = new Usuario("renanlll","renan1234","nom123e","1231412314","masculino");
		
		LocalDateTime h = LocalDateTime.now();
		
		Reserva r = new Reserva(u,h,h);
		
		System.out.println(r);
	}

}
