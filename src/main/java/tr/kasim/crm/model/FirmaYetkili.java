/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "FirmaYetkili")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FirmaYetkili.findAll", query = "SELECT f FROM FirmaYetkili f"),
    @NamedQuery(name = "FirmaYetkili.findByPkyetkililer", query = "SELECT f FROM FirmaYetkili f WHERE f.pkyetkililer = :pkyetkililer"),
    @NamedQuery(name = "FirmaYetkili.findByAd", query = "SELECT f FROM FirmaYetkili f WHERE f.ad = :ad"),
    @NamedQuery(name = "FirmaYetkili.findByGorev", query = "SELECT f FROM FirmaYetkili f WHERE f.gorev = :gorev"),
    @NamedQuery(name = "FirmaYetkili.findByTelefon", query = "SELECT f FROM FirmaYetkili f WHERE f.telefon = :telefon"),
    @NamedQuery(name = "FirmaYetkili.findByPkfirma", query = "SELECT f FROM FirmaYetkili f WHERE f.pkfirma = :pkfirma"),
    @NamedQuery(name = "FirmaYetkili.findByEtki", query = "SELECT f FROM FirmaYetkili f WHERE f.etki = :etki")})
public class FirmaYetkili implements Serializable {

    @OneToMany(mappedBy = "fkFirmaYetkili", fetch = FetchType.LAZY)
    private Collection<Gorusme> gorusmeCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkyetkililer")
    private Integer pkyetkililer;
    @Size(max = 50)
    @Column(name = "Ad")
    private String ad;
    @Size(max = 50)
    @Column(name = "Gorev")
    private String gorev;
    @Size(max = 50)
    @Column(name = "Telefon")
    private String telefon;
    @Column(name = "pkfirma")
    private Integer pkfirma;
    @Size(max = 50)
    @Column(name = "Etki")
    private String etki;

    public FirmaYetkili() {
    }

    public FirmaYetkili(Integer pkyetkililer) {
        this.pkyetkililer = pkyetkililer;
    }

    public Integer getPkyetkililer() {
        return pkyetkililer;
    }

    public void setPkyetkililer(Integer pkyetkililer) {
        this.pkyetkililer = pkyetkililer;
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

    public Integer getPkfirma() {
        return pkfirma;
    }

    public void setPkfirma(Integer pkfirma) {
        this.pkfirma = pkfirma;
    }

    public String getEtki() {
        return etki;
    }

    public void setEtki(String etki) {
        this.etki = etki;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkyetkililer != null ? pkyetkililer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FirmaYetkili)) {
            return false;
        }
        FirmaYetkili other = (FirmaYetkili) object;
        if ((this.pkyetkililer == null && other.pkyetkililer != null) || (this.pkyetkililer != null && !this.pkyetkililer.equals(other.pkyetkililer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.FirmaYetkili[ pkyetkililer=" + pkyetkililer + " ]";
    }

    @XmlTransient
    public Collection<Gorusme> getGorusmeCollection() {
        return gorusmeCollection;
    }

    public void setGorusmeCollection(Collection<Gorusme> gorusmeCollection) {
        this.gorusmeCollection = gorusmeCollection;
    }
    
}
