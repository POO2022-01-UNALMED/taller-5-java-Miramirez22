package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList <Mamifero> listado = new ArrayList<>();
	public static int Caballos;
	public static int Leones;
	private boolean Pelaje;
	private int Patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.Pelaje = pelaje;
        this.Patas = patas;
        listado.add(this);
    }

	public Mamifero() {
		super(null, 0, null, null);
		this.Pelaje = false;
		this.Patas = 0;
		listado.add(this);
		
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero ) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		Caballos++;
		return caballo; 
		
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		Leones++;
		return leon;
		
	}
	
	public boolean isPelaje() {
		return Pelaje;
	}
	
	public void setPelaje(boolean pelaje) {
		this.Pelaje = pelaje;
	}

	public int getPatas() {
		return Patas;
	}

	public void setPatas(int patas) {
		this.Patas = patas;
	}
}	