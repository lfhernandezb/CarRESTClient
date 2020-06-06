package cl.dsoft.car.data.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", catalog = "car2")
public class Usuario implements java.io.Serializable {

	private Long idUsuario;
	private Comuna comuna;
	private String nombre;
	private String correo;
	private Date fechaNacimiento;
	private Boolean hombre;
	private String telefono;
	private Date fechaVencimientoLicencia;
	private Date fechaModificacion;
	private boolean borrado;
	private Set<Vehiculo> vehiculos = new HashSet<Vehiculo>(0);
	private Set<Autenticacion> autenticacions = new HashSet<Autenticacion>(0);
	private Set<CampaniaUsuario> campaniaUsuarios = new HashSet<CampaniaUsuario>(0);
	private Set<UsuarioCreacion> usuarioCreacions = new HashSet<UsuarioCreacion>(0);
	private Set<UsuarioInfo> usuarioInfos = new HashSet<UsuarioInfo>(0);
	private Set<MantencionUsuario> mantencionUsuarios = new HashSet<MantencionUsuario>(0);

	public Usuario() {
	}

	public Usuario(Comuna comuna, Date fechaModificacion, boolean borrado) {
		this.comuna = comuna;
		this.fechaModificacion = fechaModificacion;
		this.borrado = borrado;
	}

	public Usuario(Comuna comuna, String nombre, String correo, Date fechaNacimiento, Boolean hombre, String telefono,
			Date fechaVencimientoLicencia, Date fechaModificacion, boolean borrado, Set<Vehiculo> vehiculos,
			Set<Autenticacion> autenticacions, Set<CampaniaUsuario> campaniaUsuarios,
			Set<UsuarioCreacion> usuarioCreacions, Set<UsuarioInfo> usuarioInfos,
			Set<MantencionUsuario> mantencionUsuarios) {
		this.comuna = comuna;
		this.nombre = nombre;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
		this.hombre = hombre;
		this.telefono = telefono;
		this.fechaVencimientoLicencia = fechaVencimientoLicencia;
		this.fechaModificacion = fechaModificacion;
		this.borrado = borrado;
		this.vehiculos = vehiculos;
		this.autenticacions = autenticacions;
		this.campaniaUsuarios = campaniaUsuarios;
		this.usuarioCreacions = usuarioCreacions;
		this.usuarioInfos = usuarioInfos;
		this.mantencionUsuarios = mantencionUsuarios;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_usuario", unique = true, nullable = false)
	public Long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_comuna", nullable = false)
	public Comuna getComuna() {
		return this.comuna;
	}

	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}

	@Column(name = "nombre", length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "correo", length = 45)
	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento", length = 10)
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "hombre")
	public Boolean getHombre() {
		return this.hombre;
	}

	public void setHombre(Boolean hombre) {
		this.hombre = hombre;
	}

	@Column(name = "telefono", length = 20)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_vencimiento_licencia", length = 10)
	public Date getFechaVencimientoLicencia() {
		return this.fechaVencimientoLicencia;
	}

	public void setFechaVencimientoLicencia(Date fechaVencimientoLicencia) {
		this.fechaVencimientoLicencia = fechaVencimientoLicencia;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Vehiculo> getVehiculos() {
		return this.vehiculos;
	}

	public void setVehiculos(Set<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Autenticacion> getAutenticacions() {
		return this.autenticacions;
	}

	public void setAutenticacions(Set<Autenticacion> autenticacions) {
		this.autenticacions = autenticacions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<CampaniaUsuario> getCampaniaUsuarios() {
		return this.campaniaUsuarios;
	}

	public void setCampaniaUsuarios(Set<CampaniaUsuario> campaniaUsuarios) {
		this.campaniaUsuarios = campaniaUsuarios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<UsuarioCreacion> getUsuarioCreacions() {
		return this.usuarioCreacions;
	}

	public void setUsuarioCreacions(Set<UsuarioCreacion> usuarioCreacions) {
		this.usuarioCreacions = usuarioCreacions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<UsuarioInfo> getUsuarioInfos() {
		return this.usuarioInfos;
	}

	public void setUsuarioInfos(Set<UsuarioInfo> usuarioInfos) {
		this.usuarioInfos = usuarioInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<MantencionUsuario> getMantencionUsuarios() {
		return this.mantencionUsuarios;
	}

	public void setMantencionUsuarios(Set<MantencionUsuario> mantencionUsuarios) {
		this.mantencionUsuarios = mantencionUsuarios;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", comuna=" + comuna + ", nombre=" + nombre + ", correo=" + correo
				+ ", fechaNacimiento=" + fechaNacimiento + ", hombre=" + hombre + ", telefono=" + telefono
				+ ", fechaVencimientoLicencia=" + fechaVencimientoLicencia + ", fechaModificacion=" + fechaModificacion
				+ ", borrado=" + borrado + ", vehiculos=" + vehiculos + ", autenticacions=" + autenticacions
				+ ", campaniaUsuarios=" + campaniaUsuarios + ", usuarioCreacions=" + usuarioCreacions
				+ ", usuarioInfos=" + usuarioInfos + ", mantencionUsuarios=" + mantencionUsuarios + "]";
	}

}
