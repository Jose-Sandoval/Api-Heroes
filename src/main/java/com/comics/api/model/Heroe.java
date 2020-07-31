package com.comics.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="heroes")
public class Heroe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_heroe;
	private String nombre;
	private String bio;
	private String img;
	private String aparicion;
	private String casa;

	public int getId_heroe() {
		return id_heroe;
	}

	public void setId_heroe(int id_heroe) {
		this.id_heroe = id_heroe;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getAparicion() {
		return aparicion;
	}

	public void setAparicion(String aparicion) {
		this.aparicion = aparicion;
	}

	public String getCasa() {
		return casa;
	}

	public void setCasa(String casa) {
		this.casa = casa;
	}

	@Override
	public String toString() {
		return "heroe [id_heroe=" + id_heroe + ", nombre=" + nombre + ", bio=" + bio + ", img=" + img + ", aparicion="
				+ aparicion + ", casa=" + casa + "]";
	}
}
