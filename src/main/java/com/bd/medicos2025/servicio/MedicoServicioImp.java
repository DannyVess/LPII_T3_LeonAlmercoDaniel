package com.bd.medicos2025.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.medicos2025.modelo.TblMedico;
import com.bd.medicos2025.repositorio.IMedicoRepositorio;

@Service
public class MedicoServicioImp implements IMedicoServicio {
@Autowired
private IMedicoRepositorio imedicorepositorio;
	
	
	@Override
	public void RegistrarMedico(TblMedico tblmedico) {
		imedicorepositorio.save(tblmedico);
		
	}

	@Override
	public void EliminarMedico(TblMedico tblmedico) {
		imedicorepositorio.deleteById(tblmedico.getIdmed());
		
	}

	@Override
	public List<TblMedico> ListadoMedicos() {
		return (List<TblMedico>) imedicorepositorio.findAll();
	}

	@Override
	public TblMedico buscarporId(Integer id) {
		return imedicorepositorio.findById(id).orElse(null);
	}
	


}
