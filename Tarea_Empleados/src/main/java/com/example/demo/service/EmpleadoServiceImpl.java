package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	
	@Autowired
	IEmpleadoDAO iempleadodao;
	
	@Override
	public List<Empleado> listarEmpleados() {
		// TODO Auto-generated method stub
		return iempleadodao.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return iempleadodao.save(empleado);
	}

	@Override
	public Empleado empleado_ID(Long id) {
		// TODO Auto-generated method stub
		return iempleadodao.findById(id).get();
	}

	@Override
	public List<Empleado> listarEmpleadoTrabajo(String trabajo) {
		// TODO Auto-generated method stub
		return iempleadodao.findByTrabajo(trabajo);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return iempleadodao.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		// TODO Auto-generated method stub
			iempleadodao.deleteById(id);
		
	}

}
