package com.albo.app.entity;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class HeroesEntity {
	
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private Long usuario_id;
	private int tipo_servicio_id;
	private String tipo_acceso;
	private Date fecha;
	private String foto;
	private String estatus;
	private String observaciones;
	private Timestamp creado;
	private Timestamp update;
	private Timestamp delete;
	private String qr;
	private String ine;
	private String tipo_empleado;

}
