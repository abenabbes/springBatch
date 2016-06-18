/**
 * 
 */
package aba.spring.batch.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe d'objet valeur pour tester.<br>
 * ----------------------------------<br>
 * @author ali
 *
 */
public class Model1Vo implements Serializable{

	/**
	 * Serialisation.
	 */
	private static final long serialVersionUID = -5489117960857906013L;
	
	private long id;
	
	private String nom;
	
	private Date uneDate;
	
	private String val;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getUneDate() {
		return uneDate;
	}

	public void setUneDate(Date uneDate) {
		this.uneDate = uneDate;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return "Model1 [id=" + id + ", nom=" + nom + ", uneDate=" + uneDate
				+ ", val=" + val + "]";
	}

}
