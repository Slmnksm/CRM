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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "SistemForm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SistemForm.findAll", query = "SELECT s FROM SistemForm s"),
    @NamedQuery(name = "SistemForm.findByPkForm", query = "SELECT s FROM SistemForm s WHERE s.pkForm = :pkForm"),
    @NamedQuery(name = "SistemForm.findByFormAd", query = "SELECT s FROM SistemForm s WHERE s.formAd = :formAd"),
    @NamedQuery(name = "SistemForm.findByFormNo", query = "SELECT s FROM SistemForm s WHERE s.formNo = :formNo")})
public class SistemForm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkForm")
    private Integer pkForm;
    @Size(max = 50)
    @Column(name = "FormAd")
    private String formAd;
    @Column(name = "FormNo")
    private Integer formNo;

    public SistemForm() {
    }

    public SistemForm(Integer pkForm) {
        this.pkForm = pkForm;
    }

    public Integer getPkForm() {
        return pkForm;
    }

    public void setPkForm(Integer pkForm) {
        this.pkForm = pkForm;
    }

    public String getFormAd() {
        return formAd;
    }

    public void setFormAd(String formAd) {
        this.formAd = formAd;
    }

    public Integer getFormNo() {
        return formNo;
    }

    public void setFormNo(Integer formNo) {
        this.formNo = formNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkForm != null ? pkForm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SistemForm)) {
            return false;
        }
        SistemForm other = (SistemForm) object;
        if ((this.pkForm == null && other.pkForm != null) || (this.pkForm != null && !this.pkForm.equals(other.pkForm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SistemForm[ pkForm=" + pkForm + " ]";
    }
    
}
