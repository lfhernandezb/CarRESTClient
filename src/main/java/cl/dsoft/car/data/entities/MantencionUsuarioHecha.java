package cl.dsoft.car.data.entities;
// Generated 17-05-2020 20:45:18 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MantencionUsuarioHecha generated by hbm2java
 */
@Entity
@Table(name = "mantencion_usuario_hecha", catalog = "car2")
public class MantencionUsuarioHecha implements java.io.Serializable {

	private MantencionUsuarioHechaId id;
	private MantencionUsuario mantencionUsuario;
	private Vehiculo vehiculo;
	private Integer km;
	private Date fecha;
	private Integer costo;
	private Date fechaModificacion;
	private boolean borrado;

	public MantencionUsuarioHecha() {
	}

	public MantencionUsuarioHecha(MantencionUsuarioHechaId id, MantencionUsuario mantencionUsuario, Vehiculo vehiculo,
			Date fechaModificacion, boolean borrado) {
		this.id = id;
		this.mantencionUsuario = mantencionUsuario;
		this.vehiculo = vehiculo;
		this.fechaModificacion = fechaModificacion;
		this.borrado = borrado;
	}

	public MantencionUsuarioHecha(MantencionUsuarioHechaId id, MantencionUsuario mantencionUsuario, Vehiculo vehiculo,
			Integer km, Date fecha, Integer costo, Date fechaModificacion, boolean borrado) {
		this.id = id;
		this.mantencionUsuario = mantencionUsuario;
		this.vehiculo = vehiculo;
		this.km = km;
		this.fecha = fecha;
		this.costo = costo;
		this.fechaModificacion = fechaModificacion;
		this.borrado = borrado;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idMantencionUsuarioHecha", column = @Column(name = "id_mantencion_usuario_hecha", nullable = false)),
			@AttributeOverride(name = "idUsuario", column = @Column(name = "id_usuario", nullable = false)) })
	public MantencionUsuarioHechaId getId() {
		return this.id;
	}

	public void setId(MantencionUsuarioHechaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "id_mantencion_usuario", referencedColumnName = "id_mantencion_usuario", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", nullable = false, insertable = false, updatable = false) })
	public MantencionUsuario getMantencionUsuario() {
		return this.mantencionUsuario;
	}

	public void setMantencionUsuario(MantencionUsuario mantencionUsuario) {
		this.mantencionUsuario = mantencionUsuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "id_vehiculo", referencedColumnName = "id_vehiculo", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", nullable = false, insertable = false, updatable = false) })
	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Column(name = "km")
	public Integer getKm() {
		return this.km;
	}

	public void setKm(Integer km) {
		this.km = km;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", length = 10)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "costo")
	public Integer getCosto() {
		return this.costo;
	}

	public void setCosto(Integer costo) {
		this.costo = costo;
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
