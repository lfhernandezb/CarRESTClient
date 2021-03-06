package cl.dsoft.car.data.entities;
// Generated 17-05-2020 20:45:18 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CargaCombustibleId generated by hbm2java
 */
@Embeddable
public class CargaCombustibleId implements java.io.Serializable {

	private long idCargaCombustible;
	private long idUsuario;

	public CargaCombustibleId() {
	}

	public CargaCombustibleId(long idCargaCombustible, long idUsuario) {
		this.idCargaCombustible = idCargaCombustible;
		this.idUsuario = idUsuario;
	}

	@Column(name = "id_carga_combustible", nullable = false)
	public long getIdCargaCombustible() {
		return this.idCargaCombustible;
	}

	public void setIdCargaCombustible(long idCargaCombustible) {
		this.idCargaCombustible = idCargaCombustible;
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
		if (!(other instanceof CargaCombustibleId))
			return false;
		CargaCombustibleId castOther = (CargaCombustibleId) other;

		return (this.getIdCargaCombustible() == castOther.getIdCargaCombustible())
				&& (this.getIdUsuario() == castOther.getIdUsuario());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getIdCargaCombustible();
		result = 37 * result + (int) this.getIdUsuario();
		return result;
	}

}
