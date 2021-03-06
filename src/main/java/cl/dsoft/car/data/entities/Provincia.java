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
 * Provincia generated by hbm2java
 */
@Entity
@Table(name = "provincia", catalog = "car2")
public class Provincia implements java.io.Serializable {

	private Long idProvincia;
	private Region region;
	private String provincia;
	private Date fechaModificacion;
	private Set<ProvinciaComuna> provinciaComunas = new HashSet<ProvinciaComuna>(0);

	public Provincia() {
	}

	public Provincia(Region region, String provincia, Date fechaModificacion) {
		this.region = region;
		this.provincia = provincia;
		this.fechaModificacion = fechaModificacion;
	}

	public Provincia(Region region, String provincia, Date fechaModificacion, Set<ProvinciaComuna> provinciaComunas) {
		this.region = region;
		this.provincia = provincia;
		this.fechaModificacion = fechaModificacion;
		this.provinciaComunas = provinciaComunas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_provincia", unique = true, nullable = false)
	public Long getIdProvincia() {
		return this.idProvincia;
	}

	public void setIdProvincia(Long idProvincia) {
		this.idProvincia = idProvincia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_region", nullable = false)
	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Column(name = "provincia", nullable = false, length = 128)
	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_modificacion", nullable = false, length = 19)
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "provincia")
	public Set<ProvinciaComuna> getProvinciaComunas() {
		return this.provinciaComunas;
	}

	public void setProvinciaComunas(Set<ProvinciaComuna> provinciaComunas) {
		this.provinciaComunas = provinciaComunas;
	}

}
