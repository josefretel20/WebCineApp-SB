package com.empresariales.app.service;

import com.empresariales.app.model.Detalle;

public interface IDetallesService {
	void insertar(Detalle detalle);
	void eliminar(int idDetalle);
}
