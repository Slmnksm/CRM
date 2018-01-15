/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "StokRecete")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StokRecete.findAll", query = "SELECT s FROM StokRecete s"),
    @NamedQuery(name = "StokRecete.findByPkRecete", query = "SELECT s FROM StokRecete s WHERE s.pkRecete = :pkRecete"),
    @NamedQuery(name = "StokRecete.findByFkStok", query = "SELECT s FROM StokRecete s WHERE s.fkStok = :fkStok"),
    @NamedQuery(name = "StokRecete.findByFkstok2", query = "SELECT s FROM StokRecete s WHERE s.fkstok2 = :fkstok2"),
    @NamedQuery(name = "StokRecete.findByIslemKod", query = "SELECT s FROM StokRecete s WHERE s.islemKod = :islemKod"),
    @NamedQuery(name = "StokRecete.findByIslemAd", query = "SELECT s FROM StokRecete s WHERE s.islemAd = :islemAd"),
    @NamedQuery(name = "StokRecete.findByAciklama", query = "SELECT s FROM StokRecete s WHERE s.aciklama = :aciklama"),
    @NamedQuery(name = "StokRecete.findByBirim", query = "SELECT s FROM StokRecete s WHERE s.birim = :birim"),
    @NamedQuery(name = "StokRecete.findByFormul", query = "SELECT s FROM StokRecete s WHERE s.formul = :formul"),
    @NamedQuery(name = "StokRecete.findByMiktar", query = "SELECT s FROM StokRecete s WHERE s.miktar = :miktar")})
public class StokRecete implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkRecete")
    private Integer pkRecete;
    @Column(name = "fkStok")
    private Integer fkStok;
    @Column(name = "fkstok2")
    private Integer fkstok2;
    @Size(max = 10)
    @Column(name = "islemKod")
    private String islemKod;
    @Size(max = 150)
    @Column(name = "islemAd")
    private String islemAd;
    @Size(max = 250)
    @Column(name = "Aciklama")
    private String aciklama;
    @Size(max = 10)
    @Column(name = "Birim")
    private String birim;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Formul")
    private BigDecimal formul;
    @Column(name = "Miktar")
    private BigDecimal miktar;

    public StokRecete() {
    }

    public StokRecete(Integer pkRecete) {
        this.pkRecete = pkRecete;
    }

    public Integer getPkRecete() {
        return pkRecete;
    }

    public void setPkRecete(Integer pkRecete) {
        this.pkRecete = pkRecete;
    }

    public Integer getFkStok() {
        return fkStok;
    }

    public void setFkStok(Integer fkStok) {
        this.fkStok = fkStok;
    }

    public Integer getFkstok2() {
        return fkstok2;
    }

    public void setFkstok2(Integer fkstok2) {
        this.fkstok2 = fkstok2;
    }

    public String getIslemKod() {
        return islemKod;
    }

    public void setIslemKod(String islemKod) {
        this.islemKod = islemKod;
    }

    public String getIslemAd() {
        return islemAd;
    }

    public void setIslemAd(String islemAd) {
        this.islemAd = islemAd;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public BigDecimal getFormul() {
        return formul;
    }

    public void setFormul(BigDecimal formul) {
        this.formul = formul;
    }

    public BigDecimal getMiktar() {
        return miktar;
    }

    public void setMiktar(BigDecimal miktar) {
        this.miktar = miktar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkRecete != null ? pkRecete.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StokRecete)) {
            return false;
        }
        StokRecete other = (StokRecete) object;
        if ((this.pkRecete == null && other.pkRecete != null) || (this.pkRecete != null && !this.pkRecete.equals(other.pkRecete))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.StokRecete[ pkRecete=" + pkRecete + " ]";
    }
    
}
