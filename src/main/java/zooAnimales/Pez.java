package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado=new ArrayList<Pez>();
	public static int Salmones=0;
	public static int Bacalaos=0;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre,int edad,String habitat,String genero ,String colorPiel,int venenoso){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas=colorPiel;
		this.cantidadAletas=venenoso;
		listado.add(this);
		Animal.setTotalAnimales(1+Animal.getTotalAnimales());
	}
	
	public Pez(){
		listado.add(this);
		Animal.setTotalAnimales(1+Animal.getTotalAnimales());
	}
	
	public static ArrayList<Pez> getListado(){
		return listado;
	}
	
	public String getColorEscamas(){
		return colorEscamas;
	}
	
	public int getCantidadAletas(){
		return cantidadAletas;
	}
	
	public static void setListado(ArrayList<Pez> l){
		listado=l;
	}
	
	public void setColorEscamas(String c){
		colorEscamas=c;
	}
	
	public void setCantidadAletas(int v){
		cantidadAletas=v;
	}
	
	public static int cantidadPeces(){
		return Pez.listado.size();
	}
	
	public static Pez crearSalmon(String nombre,int edad,String genero ){
		Salmones+=1;
		return new Pez(nombre,edad,"oceano",genero,"rojo",6);
	}
	
	public static Pez crearBacalao(String nombre,int edad,String genero){
		Bacalaos+=1;
		return new Pez(nombre,edad,"oceano",genero,"gris",6);
	}
	
	public String movimiento(){
		return "nadar";
	}
}