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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RespuestaProveedor generated by hbm2java
 */
@Entity
@Table(name = "respuesta_proveedor", catalog = "car2")
public class RespuestaProveedor implements java.io.Serializable {

	private Integer idRespuestaProveedor;
	private ConsultaProveedor consultaProveedor;
	private Proveedor proveedor;
	private Vehiculo vehiculo;
	private Date fechaModificacion;

	public RespuestaProveedor() {
	}

	public RespuestaProveedor(ConsultaProveedor consultaProveedor, Proveedor proveedor, Vehiculo vehiculo,
			Date fechaModificacion) {
		this.consultaProveedor = consultaProveedor;
		this.proveedor = proveedor;
		this.vehiculo = vehiculo;
		this.fechaModificacion = fechaModificacion;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_respuesta_proveedor", unique = true, nullable = false)
	public Integer getIdRespuestaProveedor() {
		return this.idRespuestaProveedor;
	}

	public void setIdRespuestaProveedor(Integer idRespuestaProveedor) {
		this.idRespuestaProveedor = idRespuestaProveedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_consulta_proveedor", nullable = false)
	public ConsultaProveedor getConsultaProveedor() {
		return this.consultaProveedor;
	}

	public void setConsultaProveedor(ConsultaProveedor consultaProveedor) {
		this.consultaProveedor = consultaProveedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_proveedor", nullable = false)
	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "id_vehiculo", referencedColumnName = "id_vehiculo", nullable = false),
			@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", nullable = false) })
	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
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
