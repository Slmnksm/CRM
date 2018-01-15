/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "Kampanya")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kampanya.findAll", query = "SELECT k FROM Kampanya k"),
    @NamedQuery(name = "Kampanya.findByPkKampanya", query = "SELECT k FROM Kampanya k WHERE k.pkKampanya = :pkKampanya"),
    @NamedQuery(name = "Kampanya.findByKampanyaAd", query = "SELECT k FROM Kampanya k WHERE k.kampanyaAd = :kampanyaAd"),
    @NamedQuery(name = "Kampanya.findByBaslama", query = "SELECT k FROM Kampanya k WHERE k.baslama = :baslama"),
    @NamedQuery(name = "Kampanya.findByBitis", query = "SELECT k FROM Kampanya k WHERE k.bitis = :bitis"),
    @NamedQuery(name = "Kampanya.findByIskonto", query = "SELECT k FROM Kampanya k WHERE k.iskonto = :iskonto"),
    @NamedQuery(name = "Kampanya.findBySegment", query = "SELECT k FROM Kampanya k WHERE k.segment = :segment"),
    @NamedQuery(name = "Kampanya.findByTur", query = "SELECT k FROM Kampanya k WHERE k.tur = :tur")})
public class Kampanya implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkKampanya")
    private Integer pkKampanya;
    @Size(max = 50)
    @Column(name = "KampanyaAd")
    private String kampanyaAd;
    @Column(name = "Baslama")
    @Temporal(TemporalType.TIMESTAMP)
    private Date baslama;
    @Column(name = "Bitis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bitis;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Iskonto")
    private BigDecimal iskonto;
    @Size(max = 50)
    @Column(name = "Segment")
    private String segment;
    @Size(max = 50)
    @Column(name = "Tur")
    private String tur;

    public Kampanya() {
    }

    public Kampanya(Integer pkKampanya) {
        this.pkKampanya = pkKampanya;
    }

    public Integer getPkKampanya() {
        return pkKampanya;
    }

    public void setPkKampanya(Integer pkKampanya) {
        this.pkKampanya = pkKampanya;
    }

    public String getKampanyaAd() {
        return kampanyaAd;
    }

    public void setKampanyaAd(String kampanyaAd) {
        this.kampanyaAd = kampanyaAd;
    }

    public Date getBaslama() {
        return baslama;
    }

    public void setBaslama(Date baslama) {
        this.baslama = baslama;
    }

    public Date getBitis() {
        return bitis;
    }

    public void setBitis(Date bitis) {
        this.bitis = bitis;
    }

    public BigDecimal getIskonto() {
        return iskonto;
    }

    public void setIskonto(BigDecimal iskonto) {
        this.iskonto = iskonto;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkKampanya != null ? pkKampanya.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kampanya)) {
            return false;
        }
        Kampanya other = (Kampanya) object;
        if ((this.pkKampanya == null && other.pkKampanya != null) || (this.pkKampanya != null && !this.pkKampanya.equals(other.pkKampanya))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Kampanya[ pkKampanya=" + pkKampanya + " ]";
    }
    
}
