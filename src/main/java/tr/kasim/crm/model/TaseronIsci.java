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
@Table(name = "TaseronIsci")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TaseronIsci.findAll", query = "SELECT t FROM TaseronIsci t"),
    @NamedQuery(name = "TaseronIsci.findByPkcalisan", query = "SELECT t FROM TaseronIsci t WHERE t.pkcalisan = :pkcalisan"),
    @NamedQuery(name = "TaseronIsci.findByAd", query = "SELECT t FROM TaseronIsci t WHERE t.ad = :ad"),
    @NamedQuery(name = "TaseronIsci.findByGorev", query = "SELECT t FROM TaseronIsci t WHERE t.gorev = :gorev"),
    @NamedQuery(name = "TaseronIsci.findByTelefon", query = "SELECT t FROM TaseronIsci t WHERE t.telefon = :telefon")})
public class TaseronIsci implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkcalisan")
    private Integer pkcalisan;
    @Size(max = 50)
    @Column(name = "Ad")
    private String ad;
    @Size(max = 50)
    @Column(name = "Gorev")
    private String gorev;
    @Size(max = 50)
    @Column(name = "Telefon")
    private String telefon;

    public TaseronIsci() {
    }

    public TaseronIsci(Integer pkcalisan) {
        this.pkcalisan = pkcalisan;
    }

    public Integer getPkcalisan() {
        return pkcalisan;
    }

    public void setPkcalisan(Integer pkcalisan) {
        this.pkcalisan = pkcalisan;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkcalisan != null ? pkcalisan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaseronIsci)) {
            return false;
        }
        TaseronIsci other = (TaseronIsci) object;
        if ((this.pkcalisan == null && other.pkcalisan != null) || (this.pkcalisan != null && !this.pkcalisan.equals(other.pkcalisan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.TaseronIsci[ pkcalisan=" + pkcalisan + " ]";
    }
    
}
