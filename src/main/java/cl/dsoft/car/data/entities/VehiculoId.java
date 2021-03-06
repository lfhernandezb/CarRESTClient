package cl.dsoft.car.data.entities;
// Generated 17-05-2020 20:45:18 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VehiculoId generated by hbm2java
 */
@Embeddable
public class VehiculoId implements java.io.Serializable {

	private long idVehiculo;
	private long idUsuario;

	public VehiculoId() {
	}

	public VehiculoId(long idVehiculo, long idUsuario) {
		this.idVehiculo = idVehiculo;
		this.idUsuario = idUsuario;
	}

	@Column(name = "id_vehiculo", nullable = false)
	public long getIdVehiculo() {
		return this.idVehiculo;
	}

	public void setIdVehiculo(long idVehiculo) {
		this.idVehiculo = idVehiculo;
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
		if (!(other instanceof VehiculoId))
			return false;
		VehiculoId castOther = (VehiculoId) other;

		return (this.getIdVehiculo() == castOther.getIdVehiculo()) && (this.getIdUsuario() == castOther.getIdUsuario());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getIdVehiculo();
		result = 37 * result + (int) this.getIdUsuario();
		return result;
	}

}
