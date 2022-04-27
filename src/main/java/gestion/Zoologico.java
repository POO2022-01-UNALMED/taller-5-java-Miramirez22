package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String Nombre;
	private String Ubicacion;
	private ArrayList<Zona> Zonas = new ArrayList<Zona>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.Nombre = nombre;
		this.Ubicacion = ubicacion;
	}
	
	public Zoologico( ) {
		
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		this.Nombre=nombre;
	}
	
	public String getUbicacion() {
		return Ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.Ubicacion = ubicacion;
	}
	
	public ArrayList<Zona> getZona(){
		return Zonas;
	}
	
	public void setZona(ArrayList<Zona> zonas) {
		this.Zonas = zonas;
	}
	
	public void agregarZonas(Zona zona) {
		Zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int x=0;
		for(Zona i:Zonas) {
			x+= i.cantidadAnimales();
		}
		return x;
	}

}
