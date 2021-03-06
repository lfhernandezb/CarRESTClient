package cl.dsoft.car.data.entities;
// Generated 17-05-2020 20:45:18 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RecordatorioId generated by hbm2java
 */
@Embeddable
public class RecordatorioId implements java.io.Serializable {

	private long idRecordatorio;
	private long idUsuario;

	public RecordatorioId() {
	}

	public RecordatorioId(long idRecordatorio, long idUsuario) {
		this.idRecordatorio = idRecordatorio;
		this.idUsuario = idUsuario;
	}

	@Column(name = "id_recordatorio", nullable = false)
	public long getIdRecordatorio() {
		return this.idRecordatorio;
	}

	public void setIdRecordatorio(long idRecordatorio) {
		this.idRecordatorio = idRecordatorio;
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
		if (!(other instanceof RecordatorioId))
			return false;
		RecordatorioId castOther = (RecordatorioId) other;

		return (this.getIdRecordatorio() == castOther.getIdRecordatorio())
				&& (this.getIdUsuario() == castOther.getIdUsuario());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getIdRecordatorio();
		result = 37 * result + (int) this.getIdUsuario();
		return result;
	}

}
