package cl.dsoft.car.data.entities;
// Generated 17-05-2020 20:45:18 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ProveedorMantencionBase generated by hbm2java
 */
@Entity
@Table(name = "proveedor_mantencion_base", catalog = "car2")
public class ProveedorMantencionBase implements java.io.Serializable {

	private Integer idProveedorMantencionBase;
	private MantencionBase mantencionBase;
	private Proveedor proveedor;
	private Date fechaModificacion;

	public ProveedorMantencionBase() {
	}

	public ProveedorMantencionBase(MantencionBase mantencionBase, Proveedor proveedor, Date fechaModificacion) {
		this.mantencionBase = mantencionBase;
		this.proveedor = proveedor;
		this.fechaModificacion = fechaModificacion;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_proveedor_mantencion_base", unique = true, nullable = false)
	public Integer getIdProveedorMantencionBase() {
		return this.idProveedorMantencionBase;
	}

	public void setIdProveedorMantencionBase(Integer idProveedorMantencionBase) {
		this.idProveedorMantencionBase = idProveedorMantencionBase;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_mantencion_base", nullable = false)
	public MantencionBase getMantencionBase() {
		return this.mantencionBase;
	}

	public void setMantencionBase(MantencionBase mantencionBase) {
		this.mantencionBase = mantencionBase;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_proveedor", nullable = false)
	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_modificacion", nullable = false, length = 19)
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

}
