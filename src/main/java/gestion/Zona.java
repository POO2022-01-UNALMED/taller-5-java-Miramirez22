package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	private String Nombre;
	private Zoologico Zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona(String nombre, Zoologico zoo) {
		Nombre = nombre;
		Zoo = zoo;
		
	}
	
	public Zona() {
		
	}
	
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setZoo(Zoologico zoo) {
		this.Zoo = zoo;
	}
	
	public Zoologico getZoo() {
		return Zoo;
	}
	
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public ArrayList<Animal> getAnimales(){
		return animales;
	}
	
	public void agregarAnimales(Animal nuevoA) {
		animales.add(nuevoA);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}

}
