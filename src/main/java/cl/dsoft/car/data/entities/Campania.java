package cl.dsoft.car.data.entities;
// Generated 17-05-2020 20:45:18 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Campania generated by hbm2java
 */
@Entity
@Table(name = "campania", catalog = "car2")
public class Campania implements java.io.Serializable {

	private Integer idCampania;
	private String descripcion;
	private boolean activa;
	private String condicion;
	private String detalle;
	private Date fechaInicio;
	private Date fechaFin;
	private Short periodicidad;
	private Short numeroImpresiones;
	private boolean manual;
	private Date fechaModificacion;
	private Set<CampaniaUsuario> campaniaUsuarios = new HashSet<CampaniaUsuario>(0);

	public Campania() {
	}

	public Campania(String descripcion, boolean activa, String detalle, boolean manual, Date fechaModificacion) {
		this.descripcion = descripcion;
		this.activa = activa;
		this.detalle = detalle;
		this.manual = manual;
		this.fechaModificacion = fechaModificacion;
	}

	public Campania(String descripcion, boolean activa, String condicion, String detalle, Date fechaInicio,
			Date fechaFin, Short periodicidad, Short numeroImpresiones, boolean manual, Date fechaModificacion,
			Set<CampaniaUsuario> campaniaUsuarios) {
		this.descripcion = descripcion;
		this.activa = activa;
		this.condicion = condicion;
		this.detalle = detalle;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.periodicidad = periodicidad;
		this.numeroImpresiones = numeroImpresiones;
		this.manual = manual;
		this.fechaModificacion = fechaModificacion;
		this.campaniaUsuarios = campaniaUsuarios;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_campania", unique = true, nullable = false)
	public Integer getIdCampania() {
		return this.idCampania;
	}

	public void setIdCampania(Integer idCampania) {
		this.idCampania = idCampania;
	}

	@Column(name = "descripcion", nullable = false, length = 64)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "activa", nullable = false)
	public boolean isActiva() {
		return this.activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	@Column(name = "condicion", length = 65535)
	public String getCondicion() {
		return this.condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}

	@Column(name = "detalle", nullable = false, length = 65535)
	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_inicio", length = 10)
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_fin", length = 10)
	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Column(name = "periodicidad")
	public Short getPeriodicidad() {
		return this.periodicidad;
	}

	public void setPeriodicidad(Short periodicidad) {
		this.periodicidad = periodicidad;
	}

	@Column(name = "numero_impresiones")
	public Short getNumeroImpresiones() {
		return this.numeroImpresiones;
	}

	public void setNumeroImpresiones(Short numeroImpresiones) {
		this.numeroImpresiones = numeroImpresiones;
	}

	@Column(name = "manual", nullable = false)
	public boolean isManual() {
		return this.manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_modificacion", nullable = false, length = 19)
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "campania")
	public Set<CampaniaUsuario> getCampaniaUsuarios() {
		return this.campaniaUsuarios;
	}

	public void setCampaniaUsuarios(Set<CampaniaUsuario> campaniaUsuarios) {
		this.campaniaUsuarios = campaniaUsuarios;
	}

}
