package cl.dsoft.car.data.entities;
// Generated 17-05-2020 20:45:18 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoSeguro generated by hbm2java
 */
@Entity
@Table(name = "tipo_seguro", catalog = "car2")
public class TipoSeguro implements java.io.Serializable {

	private int idTipoSeguro;
	private String descripcion;
	private Set<SeguroVehiculo> seguroVehiculos = new HashSet<SeguroVehiculo>(0);

	public TipoSeguro() {
	}

	public TipoSeguro(int idTipoSeguro, String descripcion) {
		this.idTipoSeguro = idTipoSeguro;
		this.descripcion = descripcion;
	}

	public TipoSeguro(int idTipoSeguro, String descripcion, Set<SeguroVehiculo> seguroVehiculos) {
		this.idTipoSeguro = idTipoSeguro;
		this.descripcion = descripcion;
		this.seguroVehiculos = seguroVehiculos;
	}

	@Id

	@Column(name = "id_tipo_seguro", unique = true, nullable = false)
	public int getIdTipoSeguro() {
		return this.idTipoSeguro;
	}

	public void setIdTipoSeguro(int idTipoSeguro) {
		this.idTipoSeguro = idTipoSeguro;
	}

	@Column(name = "descripcion", nullable = false, length = 16)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoSeguro")
	public Set<SeguroVehiculo> getSeguroVehiculos() {
		return this.seguroVehiculos;
	}

	public void setSeguroVehiculos(Set<SeguroVehiculo> seguroVehiculos) {
		this.seguroVehiculos = seguroVehiculos;
	}

}
