package cl.dsoft.car.data.entities;
// Generated 17-05-2020 20:45:18 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Vehiculo generated by hbm2java
 */
@Entity
@Table(name = "vehiculo", catalog = "car2")
public class Vehiculo implements java.io.Serializable {

	private VehiculoId id;
	private Combustible combustible;
	private Modelo modelo;
	private TipoTransmision tipoTransmision;
	private Traccion traccion;
	private Usuario usuario;
	private String alias;
	private Integer kmAnuales;
	private Date fechaUltimoKm;
	private Integer kmCalibrados;
	private Date fechaUltimaCalibracion;
	private String patente;
	private Integer anio;
	private Integer km;
	private Boolean aireAcondicionado;
	private Boolean alzaVidrios;
	private Date fechaModificacion;
	private boolean borrado;
	private Set<CargaCombustible> cargaCombustibles = new HashSet<CargaCombustible>(0);
	private Set<MantencionPospuesta> mantencionPospuestas = new HashSet<MantencionPospuesta>(0);
	private Set<Reparacion> reparacions = new HashSet<Reparacion>(0);
	private Set<Recordatorio> recordatorios = new HashSet<Recordatorio>(0);
	private Set<SeguroVehiculo> seguroVehiculos = new HashSet<SeguroVehiculo>(0);
	private Set<Alerta> alertas = new HashSet<Alerta>(0);
	private Set<MantencionUsuarioHecha> mantencionUsuarioHechas = new HashSet<MantencionUsuarioHecha>(0);
	private Set<MantencionBaseHecha> mantencionBaseHechas = new HashSet<MantencionBaseHecha>(0);
	private Set<ConsultaProveedor> consultaProveedors = new HashSet<ConsultaProveedor>(0);
	private Set<RespuestaProveedor> respuestaProveedors = new HashSet<RespuestaProveedor>(0);

	public Vehiculo() {
	}

	public Vehiculo(VehiculoId id, Combustible combustible, Modelo modelo, TipoTransmision tipoTransmision,
			Traccion traccion, Usuario usuario, String alias, Date fechaModificacion, boolean borrado) {
		this.id = id;
		this.combustible = combustible;
		this.modelo = modelo;
		this.tipoTransmision = tipoTransmision;
		this.traccion = traccion;
		this.usuario = usuario;
		this.alias = alias;
		this.fechaModificacion = fechaModificacion;
		this.borrado = borrado;
	}

	public Vehiculo(VehiculoId id, Combustible combustible, Modelo modelo, TipoTransmision tipoTransmision,
			Traccion traccion, Usuario usuario, String alias, Integer kmAnuales, Date fechaUltimoKm,
			Integer kmCalibrados, Date fechaUltimaCalibracion, String patente, Integer anio, Integer km,
			Boolean aireAcondicionado, Boolean alzaVidrios, Date fechaModificacion, boolean borrado,
			Set<CargaCombustible> cargaCombustibles, Set<MantencionPospuesta> mantencionPospuestas,
			Set<Reparacion> reparacions, Set<Recordatorio> recordatorios, Set<SeguroVehiculo> seguroVehiculos,
			Set<Alerta> alertas, Set<MantencionUsuarioHecha> mantencionUsuarioHechas,
			Set<MantencionBaseHecha> mantencionBaseHechas, Set<ConsultaProveedor> consultaProveedors,
			Set<RespuestaProveedor> respuestaProveedors) {
		this.id = id;
		this.combustible = combustible;
		this.modelo = modelo;
		this.tipoTransmision = tipoTransmision;
		this.traccion = traccion;
		this.usuario = usuario;
		this.alias = alias;
		this.kmAnuales = kmAnuales;
		this.fechaUltimoKm = fechaUltimoKm;
		this.kmCalibrados = kmCalibrados;
		this.fechaUltimaCalibracion = fechaUltimaCalibracion;
		this.patente = patente;
		this.anio = anio;
		this.km = km;
		this.aireAcondicionado = aireAcondicionado;
		this.alzaVidrios = alzaVidrios;
		this.fechaModificacion = fechaModificacion;
		this.borrado = borrado;
		this.cargaCombustibles = cargaCombustibles;
		this.mantencionPospuestas = mantencionPospuestas;
		this.reparacions = reparacions;
		this.recordatorios = recordatorios;
		this.seguroVehiculos = seguroVehiculos;
		this.alertas = alertas;
		this.mantencionUsuarioHechas = mantencionUsuarioHechas;
		this.mantencionBaseHechas = mantencionBaseHechas;
		this.consultaProveedors = consultaProveedors;
		this.respuestaProveedors = respuestaProveedors;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idVehiculo", column = @Column(name = "id_vehiculo", nullable = false)),
			@AttributeOverride(name = "idUsuario", column = @Column(name = "id_usuario", nullable = false)) })
	public VehiculoId getId() {
		return this.id;
	}

	public void setId(VehiculoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_combustible", nullable = false)
	public Combustible getCombustible() {
		return this.combustible;
	}

	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_modelo", nullable = false)
	public Modelo getModelo() {
		return this.modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_transmision", nullable = false)
	public TipoTransmision getTipoTransmision() {
		return this.tipoTransmision;
	}

	public void setTipoTransmision(TipoTransmision tipoTransmision) {
		this.tipoTransmision = tipoTransmision;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_traccion", nullable = false)
	public Traccion getTraccion() {
		return this.traccion;
	}

	public void setTraccion(Traccion traccion) {
		this.traccion = traccion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario", nullable = false, insertable = false, updatable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Column(name = "alias", nullable = false, length = 20)
	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Column(name = "km_anuales")
	public Integer getKmAnuales() {
		return this.kmAnuales;
	}

	public void setKmAnuales(Integer kmAnuales) {
		this.kmAnuales = kmAnuales;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_ultimo_km", length = 10)
	public Date getFechaUltimoKm() {
		return this.fechaUltimoKm;
	}

	public void setFechaUltimoKm(Date fechaUltimoKm) {
		this.fechaUltimoKm = fechaUltimoKm;
	}

	@Column(name = "km_calibrados")
	public Integer getKmCalibrados() {
		return this.kmCalibrados;
	}

	public void setKmCalibrados(Integer kmCalibrados) {
		this.kmCalibrados = kmCalibrados;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_ultima_calibracion", length = 10)
	public Date getFechaUltimaCalibracion() {
		return this.fechaUltimaCalibracion;
	}

	public void setFechaUltimaCalibracion(Date fechaUltimaCalibracion) {
		this.fechaUltimaCalibracion = fechaUltimaCalibracion;
	}

	@Column(name = "patente", length = 10)
	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	@Column(name = "anio")
	public Integer getAnio() {
		return this.anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	@Column(name = "km")
	public Integer getKm() {
		return this.km;
	}

	public void setKm(Integer km) {
		this.km = km;
	}

	@Column(name = "aire_acondicionado")
	public Boolean getAireAcondicionado() {
		return this.aireAcondicionado;
	}

	public void setAireAcondicionado(Boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	@Column(name = "alza_vidrios")
	public Boolean getAlzaVidrios() {
		return this.alzaVidrios;
	}

	public void setAlzaVidrios(Boolean alzaVidrios) {
		this.alzaVidrios = alzaVidrios;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehiculo")
	public Set<CargaCombustible> getCargaCombustibles() {
		return this.cargaCombustibles;
	}

	public void setCargaCombustibles(Set<CargaCombustible> cargaCombustibles) {
		this.cargaCombustibles = cargaCombustibles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehiculo")
	public Set<MantencionPospuesta> getMantencionPospuestas() {
		return this.mantencionPospuestas;
	}

	public void setMantencionPospuestas(Set<MantencionPospuesta> mantencionPospuestas) {
		this.mantencionPospuestas = mantencionPospuestas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehiculo")
	public Set<Reparacion> getReparacions() {
		return this.reparacions;
	}

	public void setReparacions(Set<Reparacion> reparacions) {
		this.reparacions = reparacions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehiculo")
	public Set<Recordatorio> getRecordatorios() {
		return this.recordatorios;
	}

	public void setRecordatorios(Set<Recordatorio> recordatorios) {
		this.recordatorios = recordatorios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehiculo")
	public Set<SeguroVehiculo> getSeguroVehiculos() {
		return this.seguroVehiculos;
	}

	public void setSeguroVehiculos(Set<SeguroVehiculo> seguroVehiculos) {
		this.seguroVehiculos = seguroVehiculos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehiculo")
	public Set<Alerta> getAlertas() {
		return this.alertas;
	}

	public void setAlertas(Set<Alerta> alertas) {
		this.alertas = alertas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehiculo")
	public Set<MantencionUsuarioHecha> getMantencionUsuarioHechas() {
		return this.mantencionUsuarioHechas;
	}

	public void setMantencionUsuarioHechas(Set<MantencionUsuarioHecha> mantencionUsuarioHechas) {
		this.mantencionUsuarioHechas = mantencionUsuarioHechas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehiculo")
	public Set<MantencionBaseHecha> getMantencionBaseHechas() {
		return this.mantencionBaseHechas;
	}

	public void setMantencionBaseHechas(Set<MantencionBaseHecha> mantencionBaseHechas) {
		this.mantencionBaseHechas = mantencionBaseHechas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehiculo")
	public Set<ConsultaProveedor> getConsultaProveedors() {
		return this.consultaProveedors;
	}

	public void setConsultaProveedors(Set<ConsultaProveedor> consultaProveedors) {
		this.consultaProveedors = consultaProveedors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehiculo")
	public Set<RespuestaProveedor> getRespuestaProveedors() {
		return this.respuestaProveedors;
	}

	public void setRespuestaProveedors(Set<RespuestaProveedor> respuestaProveedors) {
		this.respuestaProveedors = respuestaProveedors;
	}

}