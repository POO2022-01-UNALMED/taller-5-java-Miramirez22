package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String ColorEscamas;
	private int LargoCola;
	
	public Reptil() {
		super(null, 0, null, null);
		this.ColorEscamas = null;
		this.LargoCola = 0;
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorescamas, int largocola) {
		super(nombre, edad, habitat, genero);
		this.ColorEscamas = colorescamas;
		this.LargoCola = largocola;
		listado.add(this);
	}
	
	public static int cantidadReptiles() {
		return listado.size();
		
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil Iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas++;
		return Iguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil Serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		serpientes++;
		return Serpiente;
	}
	
	
	public static ArrayList<Reptil> getListado(){
		return listado;
	}
	
	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}
	
	public void setColorEscamas(String color) {
		this.ColorEscamas = color;
	}
	
	public String getColorEscamas() {
		return ColorEscamas;
	}
	
	public void setLargoCola(int largo) {
		this.LargoCola = largo;
	}
	
	public int getLargoCola() {
		return LargoCola;
	}
	
	

}
