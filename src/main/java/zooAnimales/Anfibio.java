package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList <Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean Venenoso;

	public Anfibio () {
		super(null, 0, null, null);
		this.colorPiel = null;
		this.Venenoso = false;
		listado.add(this);

	}

	public Anfibio (String nombre, int edad, String habitat, String genero, String colorPiel , boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.Venenoso = venenoso;
		listado.add(this);

	}

	public static int cantidadAnfibios() {
		return listado.size();
	}

	public String movimiento() {
		return "saltar";
	}

	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		listado.add(rana);
		return rana;
	}


	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		listado.add(salamandra);
		return salamandra;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public boolean isVenenoso() {
		return Venenoso;
	}

}