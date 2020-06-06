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
 * CargaCombustible generated by hbm2java
 */
@Entity
@Table(name = "carga_combustible", catalog = "car2")
public class CargaCombustible implements java.io.Serializable {

	private CargaCombustibleId id;
	private Vehiculo vehiculo;
	private Integer km;
	private Integer litros;
	private Date fecha;
	private Boolean estanqueLleno;
	private Integer costo;
	private Double latitud;
	private Double longitud;
	private Date fechaModificacion;
	private boolean borrado;

	public CargaCombustible() {
	}

	public CargaCombustible(CargaCombustibleId id, Vehiculo vehiculo, Date fechaModificacion, boolean borrado) {
		this.id = id;
		this.vehiculo = vehiculo;
		this.fechaModificacion = fechaModificacion;
		this.borrado = borrado;
	}

	public CargaCombustible(CargaCombustibleId id, Vehiculo vehiculo, Integer km, Integer litros, Date fecha,
			Boolean estanqueLleno, Integer costo, Double latitud, Double longitud, Date fechaModificacion,
			boolean borrado) {
		this.id = id;
		this.vehiculo = vehiculo;
		this.km = km;
		this.litros = litros;
		this.fecha = fecha;
		this.estanqueLleno = estanqueLleno;
		this.costo = costo;
		this.latitud = latitud;
		this.longitud = longitud;
		this.fechaModificacion = fechaModificacion;
		this.borrado = borrado;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idCargaCombustible", column = @Column(name = "id_carga_combustible", nullable = false)),
			@AttributeOverride(name = "idUsuario", column = @Column(name = "id_usuario", nullable = false)) })
	public CargaCombustibleId getId() {
		return this.id;
	}

	public void setId(CargaCombustibleId id) {
		this.id = id;
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

	@Column(name = "litros")
	public Integer getLitros() {
		return this.litros;
	}

	public void setLitros(Integer litros) {
		this.litros = litros;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", length = 10)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "estanque_lleno")
	public Boolean getEstanqueLleno() {
		return this.estanqueLleno;
	}

	public void setEstanqueLleno(Boolean estanqueLleno) {
		this.estanqueLleno = estanqueLleno;
	}

	@Column(name = "costo")
	public Integer getCosto() {
		return this.costo;
	}

	public void setCosto(Integer costo) {
		this.costo = costo;
	}

	@Column(name = "latitud", precision = 22, scale = 0)
	public Double getLatitud() {
		return this.latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	@Column(name = "longitud", precision = 22, scale = 0)
	public Double getLongitud() {
		return this.longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
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