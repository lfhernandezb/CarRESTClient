package cl.dsoft.car.data.entities;
// Generated 17-05-2020 20:45:18 by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VwCampaniaUsuario generated by hbm2java
 */
@Entity
@Table(name = "vw_campania_usuario", catalog = "car2")
public class VwCampaniaUsuario implements java.io.Serializable {

	private VwCampaniaUsuarioId id;

	public VwCampaniaUsuario() {
	}

	public VwCampaniaUsuario(VwCampaniaUsuarioId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "idUsuario", column = @Column(name = "id_usuario", nullable = false)),
			@AttributeOverride(name = "fechaInicio", column = @Column(name = "fecha_inicio", length = 10)),
			@AttributeOverride(name = "fechaFin", column = @Column(name = "fecha_fin", length = 10)),
			@AttributeOverride(name = "periodicidad", column = @Column(name = "periodicidad")),
			@AttributeOverride(name = "numeroImpresiones", column = @Column(name = "numero_impresiones")),
			@AttributeOverride(name = "detalle", column = @Column(name = "detalle", nullable = false, length = 65535)),
			@AttributeOverride(name = "fechaModificacion", column = @Column(name = "fecha_modificacion", nullable = false, length = 19)) })
	public VwCampaniaUsuarioId getId() {
		return this.id;
	}

	public void setId(VwCampaniaUsuarioId id) {
		this.id = id;
	}

}
