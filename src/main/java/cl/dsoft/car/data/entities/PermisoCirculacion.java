package cl.dsoft.car.data.entities;
// Generated 17-05-2020 20:45:18 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PermisoCirculacion generated by hbm2java
 */
@Entity
@Table(name = "permiso_circulacion", catalog = "car2")
public class PermisoCirculacion implements java.io.Serializable {

	private Long idPermisoCirculacion;
	private byte mes;
	private String alertaHtml;
	private String tipHtml;
	private String regiones;
	private Date fechaModificacion;

	public PermisoCirculacion() {
	}

	public PermisoCirculacion(byte mes, String alertaHtml, String tipHtml, String regiones, Date fechaModificacion) {
		this.mes = mes;
		this.alertaHtml = alertaHtml;
		this.tipHtml = tipHtml;
		this.regiones = regiones;
		this.fechaModificacion = fechaModificacion;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_permiso_circulacion", unique = true, nullable = false)
	public Long getIdPermisoCirculacion() {
		return this.idPermisoCirculacion;
	}

	public void setIdPermisoCirculacion(Long idPermisoCirculacion) {
		this.idPermisoCirculacion = idPermisoCirculacion;
	}

	@Column(name = "mes", nullable = false)
	public byte getMes() {
		return this.mes;
	}

	public void setMes(byte mes) {
		this.mes = mes;
	}

	@Column(name = "alerta_html", nullable = false, length = 65535)
	public String getAlertaHtml() {
		return this.alertaHtml;
	}

	public void setAlertaHtml(String alertaHtml) {
		this.alertaHtml = alertaHtml;
	}

	@Column(name = "tip_html", nullable = false, length = 65535)
	public String getTipHtml() {
		return this.tipHtml;
	}

	public void setTipHtml(String tipHtml) {
		this.tipHtml = tipHtml;
	}

	@Column(name = "regiones", nullable = false, length = 64)
	public String getRegiones() {
		return this.regiones;
	}

	public void setRegiones(String regiones) {
		this.regiones = regiones;
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
