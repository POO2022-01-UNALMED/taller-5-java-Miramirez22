package zooAnimales;
import gestion.Zona;

public class Animal{
	private static int totalAnimales;
	private String Nombre;
	private int Edad;
	private String Habitat;
	private String Genero;
	private Zona Zona;
	public Animal(String nombre,int edad,String habitat,String genero){
		Nombre=nombre;
		Edad=edad;
		Habitat=habitat;
		Genero=genero;
		totalAnimales+=1;
	}
	public Animal(){
		totalAnimales+=1;
	}
	public static int getTotalAnimales(){
		return totalAnimales;
	}
	public String getNombre(){
		return Nombre;
	}
	public int getEdad(){
		return Edad;
	}
	public String getHabitat(){
		return Habitat;
	}
	public String getGenero(){
		return Genero;
	}
	public Zona getZona(){
		return Zona;
	}
	public static void setTotalAnimales(int total){
		totalAnimales=total;
	}
	public void setNombre(String nombre){
		Nombre=nombre;
	}
	public void setEdad(int edad){
		Edad=edad;
	}
	public void setHabitat(String habitat){
		Habitat=habitat;
	}
	public void setGenero(String genero){
		Genero=genero;
	}
	public void setZona(Zona zona){
		Zona=zona;
	}
	public String movimiento(){
		return "desplazarse";
	}
	public static String totalPorTipo(){
		return "Mamiferos: "+Mamifero.cantidadMamiferos()+"\nAves: "+Ave.cantidadAves()+"\nReptiles: "+ Reptil.cantidadReptiles()+"\nPeces: "+Pez.cantidadPeces()+"\nAnfibios: "+Anfibio.cantidadAnfibios();
	}
	public String toString(){
		if (Zona==null){
			return "Mi nombre es "+Nombre+", tengo una edad de "+Edad+", habito en "+Habitat+" y mi genero es "+Genero;
		}
		else{
			return "Mi nombre es "+Nombre+", tengo una edad de "+Edad+", habito en "+Habitat+" y mi genero es "+Genero+", la zona donde me ubico es "+Zona+", en el zoo "+Zona.getZoo() ;
		}

	}
}