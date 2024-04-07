package tp1.ejercicio3;

import java.util.Objects;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private String email;
	
	public Persona () {
	}
	
	public Persona(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(email, other.email)
				&& Objects.equals(nombre, other.nombre);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String tusDatos () {
		return "Nombre: " + this.getNombre() + "\nApellido: " + this.getApellido() + "\nEmail: " + this.getEmail();
	}
}
