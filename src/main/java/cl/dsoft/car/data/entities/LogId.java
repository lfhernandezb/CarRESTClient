package cl.dsoft.car.data.entities;
// Generated 17-05-2020 20:45:18 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LogId generated by hbm2java
 */
@Embeddable
public class LogId implements java.io.Serializable {

	private long idUsuario;
	private long idLog;

	public LogId() {
	}

	public LogId(long idUsuario, long idLog) {
		this.idUsuario = idUsuario;
		this.idLog = idLog;
	}

	@Column(name = "id_usuario", nullable = false)
	public long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Column(name = "id_log", nullable = false)
	public long getIdLog() {
		return this.idLog;
	}

	public void setIdLog(long idLog) {
		this.idLog = idLog;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LogId))
			return false;
		LogId castOther = (LogId) other;

		return (this.getIdUsuario() == castOther.getIdUsuario()) && (this.getIdLog() == castOther.getIdLog());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getIdUsuario();
		result = 37 * result + (int) this.getIdLog();
		return result;
	}

}
