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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Comuna generated by hbm2java
 */
@Entity
@Table(name = "comuna", catalog = "car2")
public class Comuna implements java.io.Serializable {

	private Long idComuna;
	private Region region;
	private String comuna;
	private Date fechaModificacion;
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);
	private Set<ProvinciaComuna> provinciaComunas = new HashSet<ProvinciaComuna>(0);

	public Comuna() {
	}

	public Comuna(Region region, String comuna, Date fechaModificacion) {
		this.region = region;
		this.comuna = comuna;
		this.fechaModificacion = fechaModificacion;
	}

	public Comuna(Region region, String comuna, Date fechaModificacion, Set<Usuario> usuarios,
			Set<ProvinciaComuna> provinciaComunas) {
		this.region = region;
		this.comuna = comuna;
		this.fechaModificacion = fechaModificacion;
		this.usuarios = usuarios;
		this.provinciaComunas = provinciaComunas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_comuna", unique = true, nullable = false)
	public Long getIdComuna() {
		return this.idComuna;
	}

	public void setIdComuna(Long idComuna) {
		this.idComuna = idComuna;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_region", nullable = false)
	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Column(name = "comuna", nullable = false, length = 128)
	public String getComuna() {
		return this.comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_modificacion", nullable = false, length = 19)
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "comuna")
	public Set<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "comuna")
	public Set<ProvinciaComuna> getProvinciaComunas() {
		return this.provinciaComunas;
	}

	public void setProvinciaComunas(Set<ProvinciaComuna> provinciaComunas) {
		this.provinciaComunas = provinciaComunas;
	}

	@Override
	public String toString() {
		return "Comuna [idComuna=" + idComuna + ", region=" + region + ", comuna=" + comuna + ", fechaModificacion="
				+ fechaModificacion + ", usuarios=" + usuarios + ", provinciaComunas=" + provinciaComunas + "]";
	}

}