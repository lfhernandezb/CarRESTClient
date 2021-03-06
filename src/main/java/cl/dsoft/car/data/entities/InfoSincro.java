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
 * InfoSincro generated by hbm2java
 */
@Entity
@Table(name = "info_sincro", catalog = "car2")
public class InfoSincro implements java.io.Serializable {

	private Integer idInfoSincro;
	private long usuarioIdUsuario;
	private byte sentido;
	private Date fecha;

	public InfoSincro() {
	}

	public InfoSincro(long usuarioIdUsuario, byte sentido, Date fecha) {
		this.usuarioIdUsuario = usuarioIdUsuario;
		this.sentido = sentido;
		this.fecha = fecha;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_info_sincro", unique = true, nullable = false)
	public Integer getIdInfoSincro() {
		return this.idInfoSincro;
	}

	public void setIdInfoSincro(Integer idInfoSincro) {
		this.idInfoSincro = idInfoSincro;
	}

	@Column(name = "usuario_id_usuario", nullable = false)
	public long getUsuarioIdUsuario() {
		return this.usuarioIdUsuario;
	}

	public void setUsuarioIdUsuario(long usuarioIdUsuario) {
		this.usuarioIdUsuario = usuarioIdUsuario;
	}

	@Column(name = "sentido", nullable = false)
	public byte getSentido() {
		return this.sentido;
	}

	public void setSentido(byte sentido) {
		this.sentido = sentido;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
