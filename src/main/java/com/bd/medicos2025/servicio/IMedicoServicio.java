package com.bd.medicos2025.servicio;

import java.util.List;

import com.bd.medicos2025.modelo.TblMedico;

public interface IMedicoServicio {
	//declaramos los metodos...
	void RegistrarMedico(TblMedico tblmedico);
	void EliminarMedico(TblMedico tblmedico);
	List<TblMedico> ListadoMedicos();
	TblMedico buscarporId(Integer id);
}
 