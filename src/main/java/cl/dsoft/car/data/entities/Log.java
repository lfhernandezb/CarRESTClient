package cl.dsoft.car.data.entities;
// Generated 17-05-2020 20:45:18 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Log generated by hbm2java
 */
@Entity
@Table(name = "log", catalog = "car2")
public class Log implements java.io.Serializable {

	private LogId id;
	private double latitud;
	private double longitud;
	private String data;
	private Date fechaModificacion;
	private boolean borrado;

	public Log() {
	}

	public Log(LogId id, double latitud, double longitud, String data, Date fechaModificacion, boolean borrado) {
		this.id = id;
		this.latitud = latitud;
		this.longitud = longitud;
		this.data = data;
		this.fechaModificacion = fechaModificacion;
		this.borrado = borrado;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idUsuario", column = @Column(name = "id_usuario", nullable = false)),
			@AttributeOverride(name = "idLog", column = @Column(name = "id_log", nullable = false)) })
	public LogId getId() {
		return this.id;
	}

	public void setId(LogId id) {
		this.id = id;
	}

	@Column(name = "latitud", nullable = false, precision = 22, scale = 0)
	public double getLatitud() {
		return this.latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	@Column(name = "longitud", nullable = false, precision = 22, scale = 0)
	public double getLongitud() {
		return this.longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Column(name = "data", nullable = false, length = 65535)
	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_modificacion", nullable = false, length = 19)
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@Column(name = "borrado", nullable = false)
	public boolean isBorrado() {
		return this.borrado;
	}

	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}

}