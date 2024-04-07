package tp1.ejercicio3;

import java.util.Objects;

public class Estudiante extends Persona {
	private String comision;
	private String direccion;
	
	public Estudiante() {
		super();
	}
	
	public Estudiante(String nombre, String apellido, String email, String comision, String direccion) {
		super(nombre, apellido, email);
		this.comision = comision;
		this.direccion = direccion;
	}
	
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String tusDatos () {
		return super.tusDatos() + "\nComision: " + this.getComision() + "\nDireccion: " + this.getDireccion();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(comision, other.comision) && Objects.equals(direccion, other.direccion);
	}
}
