package com.registro.usuarios.controlador.dto;

import java.time.LocalDateTime;

public class UsuarioRegistroDTO {

	private Long id;
	private String nombre;
	private String apellido;
	private String username;
	private String password;
	private LocalDateTime fechaDeRegistro= LocalDateTime.now();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UsuarioRegistroDTO(Long id, String nombre, String apellido, String username, String password, LocalDateTime fechaDeRegistro) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.username = username;
		this.password = password;
		this.fechaDeRegistro= LocalDateTime.now();
	}

	public UsuarioRegistroDTO(String nombre, String apellido, String username, String password, LocalDateTime fechaDeRegistro) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.username = username;
		this.password = password;
		this.fechaDeRegistro= LocalDateTime.now();
	}

	public UsuarioRegistroDTO(String username) {
		super();
		this.username = username;
	}

	public UsuarioRegistroDTO() {

	}

	public LocalDateTime getFechaDeRegistro() {
		return fechaDeRegistro;
	}

	public void setFechaDeRegistro(LocalDateTime fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}
	
	

}
