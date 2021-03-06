package cl.dsoft.car.data.entities;
// Generated 17-05-2020 20:45:18 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RevisionTecnica generated by hbm2java
 */
@Entity
@Table(name = "revision_tecnica", catalog = "car2")
public class RevisionTecnica implements java.io.Serializable {

	private Long idRevisionTecnica;
	private byte digito;
	private byte mes;

	public RevisionTecnica() {
	}

	public RevisionTecnica(byte digito, byte mes) {
		this.digito = digito;
		this.mes = mes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_revision_tecnica", unique = true, nullable = false)
	public Long getIdRevisionTecnica() {
		return this.idRevisionTecnica;
	}

	public void setIdRevisionTecnica(Long idRevisionTecnica) {
		this.idRevisionTecnica = idRevisionTecnica;
	}

	@Column(name = "digito", nullable = false)
	public byte getDigito() {
		return this.digito;
	}

	public void setDigito(byte digito) {
		this.digito = digito;
	}

	@Column(name = "mes", nullable = false)
	public byte getMes() {
		return this.mes;
	}

	public void setMes(byte mes) {
		this.mes = mes;
	}

}
