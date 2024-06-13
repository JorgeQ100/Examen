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
@Table (name = "subordinado")
public class Subordinado {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_subordinado")
	private int id_subordinado;
	@Column(name = "DniEmpleado")
	private int DniEmpleado;
	@Column(name = "NomSubordinado")
	private String NomSubordinado;
	@Column(name = "sexo")
	private String sexo;
	@Column(name = "FechaNac")
	private Date FechaNac;
	@Column(name = "Relacion")
	private String Relacion;
	
	public Subordinado () {}

	public Subordinado(int id_subordinado, int dniEmpleado, String nomSubordinado, String sexo, Date fechaNac,
			String relacion) {
		
		this.id_subordinado = id_subordinado;
		DniEmpleado = dniEmpleado;
		NomSubordinado = nomSubordinado;
		this.sexo = sexo;
		FechaNac = fechaNac;
		Relacion = relacion;
	}

	public int getId_subordinado() {
		return id_subordinado;
	}

	public void setId_subordinado(int id_subordinado) {
		this.id_subordinado = id_subordinado;
	}

	public int getDniEmpleado() {
		return DniEmpleado;
	}

	public void setDniEmpleado(int dniEmpleado) {
		DniEmpleado = dniEmpleado;
	}

	public String getNomSubordinado() {
		return NomSubordinado;
	}

	public void setNomSubordinado(String nomSubordinado) {
		NomSubordinado = nomSubordinado;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getFechaNac() {
		return FechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		FechaNac = fechaNac;
	}

	public String getRelacion() {
		return Relacion;
	}

	public void setRelacion(String relacion) {
		Relacion = relacion;
	}

	@Override
	public String toString() {
		return "Subordinado [id_subordinado=" + id_subordinado + ", DniEmpleado=" + DniEmpleado + ", NomSubordinado="
				+ NomSubordinado + ", sexo=" + sexo + ", FechaNac=" + FechaNac + ", Relacion=" + Relacion + "]";
	}
	
	
	
	
}
