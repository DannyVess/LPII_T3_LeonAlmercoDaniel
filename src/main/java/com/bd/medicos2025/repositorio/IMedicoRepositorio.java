package com.bd.medicos2025.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.bd.medicos2025.modelo.TblMedico;

public interface IMedicoRepositorio extends CrudRepository<TblMedico,Integer> {
	
	
}  // fin de la interface repositorio
