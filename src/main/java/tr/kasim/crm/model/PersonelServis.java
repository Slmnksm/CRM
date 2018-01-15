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
@Table(name = "PersonelServis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonelServis.findAll", query = "SELECT p FROM PersonelServis p"),
    @NamedQuery(name = "PersonelServis.findByPkServis", query = "SELECT p FROM PersonelServis p WHERE p.pkServis = :pkServis"),
    @NamedQuery(name = "PersonelServis.findByServisAd", query = "SELECT p FROM PersonelServis p WHERE p.servisAd = :servisAd")})
public class PersonelServis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkServis")
    private Integer pkServis;
    @Size(max = 50)
    @Column(name = "ServisAd")
    private String servisAd;

    public PersonelServis() {
    }

    public PersonelServis(Integer pkServis) {
        this.pkServis = pkServis;
    }

    public Integer getPkServis() {
        return pkServis;
    }

    public void setPkServis(Integer pkServis) {
        this.pkServis = pkServis;
    }

    public String getServisAd() {
        return servisAd;
    }

    public void setServisAd(String servisAd) {
        this.servisAd = servisAd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkServis != null ? pkServis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonelServis)) {
            return false;
        }
        PersonelServis other = (PersonelServis) object;
        if ((this.pkServis == null && other.pkServis != null) || (this.pkServis != null && !this.pkServis.equals(other.pkServis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.PersonelServis[ pkServis=" + pkServis + " ]";
    }
    
}
