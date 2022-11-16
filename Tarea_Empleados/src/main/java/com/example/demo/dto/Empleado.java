package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="empleado")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="trabajo")
	private String trabajo;
	
	@Column(name="salario")
	private double salario;
	
	public Empleado() {
		
	}
	
	public Empleado(String trabajo, String nombre) {
		this.nombre=nombre;
		
		if(trabajo.equalsIgnoreCase(Trabajos.Director.toString())) {
			this.trabajo="Director";
			this.salario=25000.0;
		}
		
		if(trabajo.equalsIgnoreCase(Trabajos.Informatico.toString())) {
			this.trabajo="Informatico";
			this.salario=18000.0;
		}
		
		if(trabajo.equalsIgnoreCase(Trabajos.Pintor.toString())) {
			this.trabajo="Pintor";
			this.salario=15000.0;
		}
		
		if(trabajo.equalsIgnoreCase(Trabajos.Secretario.toString())) {
			this.trabajo="Pintor";
			this.salario=22000.0;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}

}
