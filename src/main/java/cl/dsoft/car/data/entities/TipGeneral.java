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
 * TipGeneral generated by hbm2java
 */
@Entity
@Table(name = "tip_general", catalog = "car2")
public class TipGeneral implements java.io.Serializable {

	private Long idTipGeneral;
	private String tipHtml;
	private String regiones;
	private Date fechaModificacion;

	public TipGeneral() {
	}

	public TipGeneral(String tipHtml, String regiones, Date fechaModificacion) {
		this.tipHtml = tipHtml;
		this.regiones = regiones;
		this.fechaModificacion = fechaModificacion;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_tip_general", unique = true, nullable = false)
	public Long getIdTipGeneral() {
		return this.idTipGeneral;
	}

	public void setIdTipGeneral(Long idTipGeneral) {
		this.idTipGeneral = idTipGeneral;
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