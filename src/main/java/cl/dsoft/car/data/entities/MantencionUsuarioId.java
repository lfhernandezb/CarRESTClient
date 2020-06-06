package cl.dsoft.car.data.entities;
// Generated 17-05-2020 20:45:18 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MantencionUsuarioId generated by hbm2java
 */
@Embeddable
public class MantencionUsuarioId implements java.io.Serializable {

	private long idMantencionUsuario;
	private long idUsuario;

	public MantencionUsuarioId() {
	}

	public MantencionUsuarioId(long idMantencionUsuario, long idUsuario) {
		this.idMantencionUsuario = idMantencionUsuario;
		this.idUsuario = idUsuario;
	}

	@Column(name = "id_mantencion_usuario", nullable = false)
	public long getIdMantencionUsuario() {
		return this.idMantencionUsuario;
	}

	public void setIdMantencionUsuario(long idMantencionUsuario) {
		this.idMantencionUsuario = idMantencionUsuario;
	}

	@Column(name = "id_usuario", nullable = false)
	public long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MantencionUsuarioId))
			return false;
		MantencionUsuarioId castOther = (MantencionUsuarioId) other;

		return (this.getIdMantencionUsuario() == castOther.getIdMantencionUsuario())
				&& (this.getIdUsuario() == castOther.getIdUsuario());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getIdMantencionUsuario();
		result = 37 * result + (int) this.getIdUsuario();
		return result;
	}

}
