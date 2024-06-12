package com.distribuida.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component 
@Entity
@Table (name = "empleado")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Empleado")
	private int id_emplaedo;
	@Column(name = "nombre")
	private	String nombre;
	@Column(name = "apellido_1")
	private String apellido_1;
	@Column(name = "apellido_2")
	private String apellido_2;
	@Column(name = "Dni")
	private	int Dni;
	@Column(name = "fechaNac")
	private Date fechaNac;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "Sexo")
	private String Sexo;
	@Column(name = "sueldo")
	private double sueldo;
	@Column(name = "sueper_Dni")
	private int sueper_Dni;
	@Column(name = "Dno")
	private	int Dno;
	
	public Empleado() {}
	
	
	

	public Empleado(int id_empleado, String nombre, String apellido_1, String apellido_2, int dni, Date fechaNac,
			String direccion, String sexo, double sueldo, int sueper_Dni, int dno) {
		this.id_emplaedo = id_empleado;
		this.nombre = nombre;
		this.apellido_1 = apellido_1;
		this.apellido_2 = apellido_2;
		Dni = dni;
		this.fechaNac = fechaNac;
		this.direccion = direccion;
		Sexo = sexo;
		this.sueldo = sueldo;
		this.sueper_Dni = sueper_Dni;
		Dno = dno;
	}




	public int getId_autor() {
		return id_emplaedo;
	}

	public void setId_autor(int id_autor) {
		this.id_emplaedo = id_autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_1() {
		return apellido_1;
	}

	public void setApellido_1(String apellido_1) {
		this.apellido_1 = apellido_1;
	}

	public String getApellido_2() {
		return apellido_2;
	}

	public void setApellido_2(String apellido_2) {
		this.apellido_2 = apellido_2;
	}

	public int getDni() {
		return Dni;
	}

	public void setDni(int dni) {
		Dni = dni;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getSueper_Dni() {
		return sueper_Dni;
	}

	public void setSueper_Dni(int sueper_Dni) {
		this.sueper_Dni = sueper_Dni;
	}

	public int getDno() {
		return Dno;
	}

	public void setDno(int dno) {
		Dno = dno;
	}

	@Override
	public String toString() {
		return "Empleado [id_autor=" + id_emplaedo + ", nombre=" + nombre + ", apellido_1=" + apellido_1 + ", apellido_2="
				+ apellido_2 + ", Dni=" + Dni + ", fechaNac=" + fechaNac + ", direccion=" + direccion + ", Sexo=" + Sexo
				+ ", sueldo=" + sueldo + ", sueper_Dni=" + sueper_Dni + ", Dno=" + Dno + "]";
	};
	
	
	
	
	
	
	
}
