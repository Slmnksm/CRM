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
@Table(name = "T_ilce")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tilce.findAll", query = "SELECT t FROM Tilce t"),
    @NamedQuery(name = "Tilce.findByKayitNo", query = "SELECT t FROM Tilce t WHERE t.kayitNo = :kayitNo"),
    @NamedQuery(name = "Tilce.findByIlKod", query = "SELECT t FROM Tilce t WHERE t.ilKod = :ilKod"),
    @NamedQuery(name = "Tilce.findByIlceKod", query = "SELECT t FROM Tilce t WHERE t.ilceKod = :ilceKod"),
    @NamedQuery(name = "Tilce.findByIlce", query = "SELECT t FROM Tilce t WHERE t.ilce = :ilce")})
public class Tilce implements Serializable {

    @OneToMany(mappedBy = "ilce", fetch = FetchType.LAZY)
    private Collection<Firma> firmaCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "KayitNo")
    private Integer kayitNo;
    @Column(name = "IlKod")
    private Integer ilKod;
    @Column(name = "IlceKod")
    private Integer ilceKod;
    @Size(max = 50)
    @Column(name = "Ilce")
    private String ilce;

    public Tilce() {
    }

    public Tilce(Integer kayitNo) {
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

    public Integer getIlceKod() {
        return ilceKod;
    }

    public void setIlceKod(Integer ilceKod) {
        this.ilceKod = ilceKod;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
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
        if (!(object instanceof Tilce)) {
            return false;
        }
        Tilce other = (Tilce) object;
        if ((this.kayitNo == null && other.kayitNo != null) || (this.kayitNo != null && !this.kayitNo.equals(other.kayitNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Tilce[ kayitNo=" + kayitNo + " ]";
    }

    @XmlTransient
    public Collection<Firma> getFirmaCollection() {
        return firmaCollection;
    }

    public void setFirmaCollection(Collection<Firma> firmaCollection) {
        this.firmaCollection = firmaCollection;
    }
    
}
