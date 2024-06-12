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
@Table (name = "departamento")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_numeroDpto")
	private int id_numeroDpto;
	@Column(name = "NombreDpto")
	private String NombreDpto; 
	@Column(name = "NumeroDpto")
	private int NumeroDpto;
	@Column(name = "DniDirector")
	private String DniDirector;
	@Column(name = "FechaIngresoDirector")
	private Date  FechaIngresoDirector;
	public Departamento(int id_numeroDpto, String nombreDpto, int numeroDpto, String dniDirector,
			Date fechaIngresoDirector) {
		this.id_numeroDpto = id_numeroDpto;
		NombreDpto = nombreDpto;
		NumeroDpto = numeroDpto;
		DniDirector = dniDirector;
		FechaIngresoDirector = fechaIngresoDirector;
	}
	public int getId_numeroDpto() {
		return id_numeroDpto;
	}
	public void setId_numeroDpto(int id_numeroDpto) {
		this.id_numeroDpto = id_numeroDpto;
	}
	public String getNombreDpto() {
		return NombreDpto;
	}
	public void setNombreDpto(String nombreDpto) {
		NombreDpto = nombreDpto;
	}
	public int getNumeroDpto() {
		return NumeroDpto;
	}
	public void setNumeroDpto(int numeroDpto) {
		NumeroDpto = numeroDpto;
	}
	public String getDniDirector() {
		return DniDirector;
	}
	public void setDniDirector(String dniDirector) {
		DniDirector = dniDirector;
	}
	public Date getFechaIngresoDirector() {
		return FechaIngresoDirector;
	}
	public void setFechaIngresoDirector(Date fechaIngresoDirector) {
		FechaIngresoDirector = fechaIngresoDirector;
	}
	@Override
	public String toString() {
		return "Departamento [id_numeroDpto=" + id_numeroDpto + ", NombreDpto=" + NombreDpto + ", NumeroDpto="
				+ NumeroDpto + ", DniDirector=" + DniDirector + ", FechaIngresoDirector=" + FechaIngresoDirector + "]";
	}
	
	
	
	

}
