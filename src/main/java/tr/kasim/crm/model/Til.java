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
@Table(name = "T_il")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Til.findAll", query = "SELECT t FROM Til t"),
    @NamedQuery(name = "Til.findByKayitNo", query = "SELECT t FROM Til t WHERE t.kayitNo = :kayitNo"),
    @NamedQuery(name = "Til.findByIlKod", query = "SELECT t FROM Til t WHERE t.ilKod = :ilKod"),
    @NamedQuery(name = "Til.findByIlAd", query = "SELECT t FROM Til t WHERE t.ilAd = :ilAd")})
public class Til implements Serializable {

    @OneToMany(mappedBy = "il", fetch = FetchType.LAZY)
    private Collection<Firma> firmaCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "KayitNo")
    private Integer kayitNo;
    @Column(name = "IlKod")
    private Integer ilKod;
    @Size(max = 50)
    @Column(name = "IlAd")
    private String ilAd;

    public Til() {
    }

    public Til(Integer kayitNo) {
        this.kayitNo = kayitNo;
    }

    public Integer getKayitNo() {
        return kayitNo;
    }

    public void setKayitNo(Integer kayitNo) {
        this.kayitNo = kayitNo;
    }

    public Integer getIlKod() {
        return ilKod;
    }

    public void setIlKod(Integer ilKod) {
        this.ilKod = ilKod;
    }

    public String getIlAd() {
        return ilAd;
    }

    public void setIlAd(String ilAd) {
        this.ilAd = ilAd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kayitNo != null ? kayitNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Til)) {
            return false;
        }
        Til other = (Til) object;
        if ((this.kayitNo == null && other.kayitNo != null) || (this.kayitNo != null && !this.kayitNo.equals(other.kayitNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Til[ kayitNo=" + kayitNo + " ]";
    }

    @XmlTransient
    public Collection<Firma> getFirmaCollection() {
        return firmaCollection;
    }

    public void setFirmaCollection(Collection<Firma> firmaCollection) {
        this.firmaCollection = firmaCollection;
    }
    
}
