package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Empleado;
import com.example.demo.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarClientes(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	//listar Clientes por campo nombre
	@GetMapping("/empleados/trabajo/{trabajo}")
	public List<Empleado> listarEmpleadoTrabajo(@PathVariable(name="trabajo") String trabajo) {
	    return empleadoServiceImpl.listarEmpleadoTrabajo(trabajo);
	}
	
	
	@PostMapping("/empleados")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {
		
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	
	@GetMapping("/empleados/{id}")
	public Empleado empleado_ID(@PathVariable(name="id") Long id) {
		
		Empleado empleado_id= new Empleado();
		
		empleado_id=empleadoServiceImpl.empleado_ID(id);
		
		System.out.println("Empleado_ID: "+empleado_id);
		
		return empleado_id;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id")Long id,@RequestBody Empleado empleado) {
		
		Empleado empleado_seleccionado= new Empleado();
		Empleado empleado_actualizado= new Empleado();
		
		empleado_seleccionado= empleadoServiceImpl.empleado_ID(id);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setTrabajo(empleado.getTrabajo());
		
		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);
		
		System.out.println("El empleado actualizado es: "+ empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/clientes/{id}")
	public void eliminarEmpleado(@PathVariable(name="id")Long id) {
		empleadoServiceImpl.eliminarEmpleado(id);
	}
}
