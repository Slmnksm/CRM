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
@Table(name = "StokFiyat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StokFiyat.findAll", query = "SELECT s FROM StokFiyat s"),
    @NamedQuery(name = "StokFiyat.findByPkFiyat", query = "SELECT s FROM StokFiyat s WHERE s.pkFiyat = :pkFiyat"),
    @NamedQuery(name = "StokFiyat.findByFkStok", query = "SELECT s FROM StokFiyat s WHERE s.fkStok = :fkStok"),
    @NamedQuery(name = "StokFiyat.findByAlis", query = "SELECT s FROM StokFiyat s WHERE s.alis = :alis"),
    @NamedQuery(name = "StokFiyat.findByFiyatAd", query = "SELECT s FROM StokFiyat s WHERE s.fiyatAd = :fiyatAd"),
    @NamedQuery(name = "StokFiyat.findByFiyat", query = "SELECT s FROM StokFiyat s WHERE s.fiyat = :fiyat"),
    @NamedQuery(name = "StokFiyat.findByIskonto", query = "SELECT s FROM StokFiyat s WHERE s.iskonto = :iskonto")})
public class StokFiyat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkFiyat")
    private Integer pkFiyat;
    @Column(name = "fkStok")
    private Integer fkStok;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Alis")
    private BigDecimal alis;
    @Size(max = 50)
    @Column(name = "FiyatAd")
    private String fiyatAd;
    @Column(name = "Fiyat")
    private BigDecimal fiyat;
    @Column(name = "Iskonto")
    private BigDecimal iskonto;

    public StokFiyat() {
    }

    public StokFiyat(Integer pkFiyat) {
        this.pkFiyat = pkFiyat;
    }

    public Integer getPkFiyat() {
        return pkFiyat;
    }

    public void setPkFiyat(Integer pkFiyat) {
        this.pkFiyat = pkFiyat;
    }

    public Integer getFkStok() {
        return fkStok;
    }

    public void setFkStok(Integer fkStok) {
        this.fkStok = fkStok;
    }

    public BigDecimal getAlis() {
        return alis;
    }

    public void setAlis(BigDecimal alis) {
        this.alis = alis;
    }

    public String getFiyatAd() {
        return fiyatAd;
    }

    public void setFiyatAd(String fiyatAd) {
        this.fiyatAd = fiyatAd;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public BigDecimal getIskonto() {
        return iskonto;
    }

    public void setIskonto(BigDecimal iskonto) {
        this.iskonto = iskonto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkFiyat != null ? pkFiyat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StokFiyat)) {
            return false;
        }
        StokFiyat other = (StokFiyat) object;
        if ((this.pkFiyat == null && other.pkFiyat != null) || (this.pkFiyat != null && !this.pkFiyat.equals(other.pkFiyat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.StokFiyat[ pkFiyat=" + pkFiyat + " ]";
    }
    
}
