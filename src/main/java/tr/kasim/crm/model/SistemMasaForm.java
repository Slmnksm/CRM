/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "SistemMasaForm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SistemMasaForm.findAll", query = "SELECT s FROM SistemMasaForm s"),
    @NamedQuery(name = "SistemMasaForm.findByPkSKulForm", query = "SELECT s FROM SistemMasaForm s WHERE s.pkSKulForm = :pkSKulForm"),
    @NamedQuery(name = "SistemMasaForm.findByFkmasa", query = "SELECT s FROM SistemMasaForm s WHERE s.fkmasa = :fkmasa"),
    @NamedQuery(name = "SistemMasaForm.findByFkForm", query = "SELECT s FROM SistemMasaForm s WHERE s.fkForm = :fkForm")})
public class SistemMasaForm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkSKulForm")
    private Integer pkSKulForm;
    @Column(name = "fkmasa")
    private Integer fkmasa;
    @Column(name = "fkForm")
    private Integer fkForm;

    public SistemMasaForm() {
    }

    public SistemMasaForm(Integer pkSKulForm) {
        this.pkSKulForm = pkSKulForm;
    }

    public Integer getPkSKulForm() {
        return pkSKulForm;
    }

    public void setPkSKulForm(Integer pkSKulForm) {
        this.pkSKulForm = pkSKulForm;
    }

    public Integer getFkmasa() {
        return fkmasa;
    }

    public void setFkmasa(Integer fkmasa) {
        this.fkmasa = fkmasa;
    }

    public Integer getFkForm() {
        return fkForm;
    }

    public void setFkForm(Integer fkForm) {
        this.fkForm = fkForm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkSKulForm != null ? pkSKulForm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SistemMasaForm)) {
            return false;
        }
        SistemMasaForm other = (SistemMasaForm) object;
        if ((this.pkSKulForm == null && other.pkSKulForm != null) || (this.pkSKulForm != null && !this.pkSKulForm.equals(other.pkSKulForm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SistemMasaForm[ pkSKulForm=" + pkSKulForm + " ]";
    }
    
}
