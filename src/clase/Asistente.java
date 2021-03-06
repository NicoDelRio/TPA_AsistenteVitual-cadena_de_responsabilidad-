package clase;

import operacion.Interpretacion;

//public class Asistente extends Interpretar{
public class Asistente{
	
	private static final String USUARIO = "delucas";
	
	private String nameAsistente;
	private String nameUsuario = "@"+USUARIO;
	private int contador = 0;
	private int numeroPensado;
	private int min = 1;
	private int max = 100;
	private int numeroCalculado;
	private boolean estoyPensando = false;
	private boolean estoyAdivinando = false;
	private int contadorChuck = 0;
	
	public Asistente(String nameAsistente) {
		this.nameAsistente = "@"+nameAsistente;
	}
	
	public String escuchar(String mensaje) {
		
		Interpretacion interpretacion = new Interpretacion();
		
		Pedido pedido = new Pedido(mensaje, nameUsuario, nameAsistente, contador, numeroPensado, min, max,
							numeroCalculado, estoyPensando, estoyAdivinando, contadorChuck);
		
		String respuesta = interpretacion.calcular(pedido);

		this.contador = pedido.getContador();
		this.numeroPensado = pedido.getNumeroPensado();
		this.min = pedido.getMin();
		this.max = pedido.getMax();
		this.numeroCalculado = pedido.getNumeroCalculado();
		this.estoyPensando = pedido.isEstoyPensando();
		this.estoyAdivinando = pedido.isEstoyAdivinando();
		this.contadorChuck = pedido.getContadorChuck();
		
		return respuesta;
	}

}
