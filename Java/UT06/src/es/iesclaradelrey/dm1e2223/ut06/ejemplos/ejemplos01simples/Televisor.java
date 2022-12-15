package es.iesclaradelrey.dm1e2223.ut06.ejemplos.ejemplos01simples;

public class Televisor {

	private static final String NOMBRE_DEF = "Tele sin nombre";
	private static final int VOLUMEN_DEF = 30;
	private static final int CANAL_DEF = 15;
	private static final int MAX_VOLUMEN = 100;

	// Atributos --> Estado
	private boolean encendida = true;
	private int canal = CANAL_DEF;
	private int volumen = VOLUMEN_DEF;
	private String nombre = NOMBRE_DEF;

	// Constructores
	public Televisor(String nombre, int canal, int volumen, boolean encendido) {
		this.nombre = nombre;
		this.canal = canal;
		this.volumen = volumen;
		this.encendida = encendido;
	}

	public Televisor(String nombre, boolean encendido) {
//		this.nombre = nombre;
//		this.canal = CANAL_DEF;
//		this.volumen = VOLUMEN_DEF;
//		this.encendida = encendido;
		this(nombre, CANAL_DEF, VOLUMEN_DEF, encendido);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Métodos --> Comportamiento
	public boolean isEncendida() {
		return encendida;
	}

	public void encender() {
		setEncendida(true);
	}

	public void apagar() {
		setEncendida(false);
	}

	private void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
		if (this.volumen > MAX_VOLUMEN) {
			this.volumen = MAX_VOLUMEN;
		}
	}

	public void subirVolumen(int cuanto) {
		this.setVolumen(this.getVolumen() + cuanto);
	}
	
	public void subirVolumen() {
		//this.setVolumen(this.getVolumen() + 1);
		this.subirVolumen(1);
	}

}
//f//f//f
//f//f//f
//f//f//f
//f//f//f
//f//f//f
//f//f//f
//f//f//f
//f//f//f
