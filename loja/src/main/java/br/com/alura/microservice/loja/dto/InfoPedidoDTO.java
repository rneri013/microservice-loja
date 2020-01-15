package br.com.alura.microservice.loja.dto;

public class InfoPedidoDTO {

	private long id;
	
	private int tempoDePreparo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(int tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}
	
	
	
}
