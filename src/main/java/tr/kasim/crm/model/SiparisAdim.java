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
@Table(name = "SiparisAdim")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SiparisAdim.findAll", query = "SELECT s FROM SiparisAdim s"),
    @NamedQuery(name = "SiparisAdim.findByPksipadim", query = "SELECT s FROM SiparisAdim s WHERE s.pksipadim = :pksipadim"),
    @NamedQuery(name = "SiparisAdim.findBySiparisno", query = "SELECT s FROM SiparisAdim s WHERE s.siparisno = :siparisno"),
    @NamedQuery(name = "SiparisAdim.findByUrunkod", query = "SELECT s FROM SiparisAdim s WHERE s.urunkod = :urunkod"),
    @NamedQuery(name = "SiparisAdim.findByUrunad", query = "SELECT s FROM SiparisAdim s WHERE s.urunad = :urunad"),
    @NamedQuery(name = "SiparisAdim.findByAciklama", query = "SELECT s FROM SiparisAdim s WHERE s.aciklama = :aciklama"),
    @NamedQuery(name = "SiparisAdim.findByMiktar", query = "SELECT s FROM SiparisAdim s WHERE s.miktar = :miktar"),
    @NamedQuery(name = "SiparisAdim.findByBirim", query = "SELECT s FROM SiparisAdim s WHERE s.birim = :birim"),
    @NamedQuery(name = "SiparisAdim.findByEn", query = "SELECT s FROM SiparisAdim s WHERE s.en = :en"),
    @NamedQuery(name = "SiparisAdim.findByBoy", query = "SELECT s FROM SiparisAdim s WHERE s.boy = :boy"),
    @NamedQuery(name = "SiparisAdim.findByYukseklik", query = "SELECT s FROM SiparisAdim s WHERE s.yukseklik = :yukseklik"),
    @NamedQuery(name = "SiparisAdim.findByBaslama", query = "SELECT s FROM SiparisAdim s WHERE s.baslama = :baslama"),
    @NamedQuery(name = "SiparisAdim.findByBitis", query = "SELECT s FROM SiparisAdim s WHERE s.bitis = :bitis")})
public class SiparisAdim implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pksipadim")
    private Integer pksipadim;
    @Column(name = "siparisno")
    private Integer siparisno;
    @Size(max = 20)
    @Column(name = "urunkod")
    private String urunkod;
    @Size(max = 100)
    @Column(name = "urunad")
    private String urunad;
    @Size(max = 150)
    @Column(name = "Aciklama")
    private String aciklama;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Miktar")
    private BigDecimal miktar;
    @Size(max = 50)
    @Column(name = "Birim")
    private String birim;
    @Column(name = "En")
    private BigDecimal en;
    @Column(name = "Boy")
    private BigDecimal boy;
    @Column(name = "Yukseklik")
    private BigDecimal yukseklik;
    @Column(name = "Baslama")
    @Temporal(TemporalType.TIMESTAMP)
    private Date baslama;
    @Column(name = "Bitis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bitis;

    public SiparisAdim() {
    }

    public SiparisAdim(Integer pksipadim) {
        this.pksipadim = pksipadim;
    }

    public Integer getPksipadim() {
        return pksipadim;
    }

    public void setPksipadim(Integer pksipadim) {
        this.pksipadim = pksipadim;
    }

    public Integer getSiparisno() {
        return siparisno;
    }

    public void setSiparisno(Integer siparisno) {
        this.siparisno = siparisno;
    }

    public String getUrunkod() {
        return urunkod;
    }

    public void setUrunkod(String urunkod) {
        this.urunkod = urunkod;
    }

    public String getUrunad() {
        return urunad;
    }

    public void setUrunad(String urunad) {
        this.urunad = urunad;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public BigDecimal getMiktar() {
        return miktar;
    }

    public void setMiktar(BigDecimal miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public BigDecimal getEn() {
        return en;
    }

    public void setEn(BigDecimal en) {
        this.en = en;
    }

    public BigDecimal getBoy() {
        return boy;
    }

    public void setBoy(BigDecimal boy) {
        this.boy = boy;
    }

    public BigDecimal getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(BigDecimal yukseklik) {
        this.yukseklik = yukseklik;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pksipadim != null ? pksipadim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SiparisAdim)) {
            return false;
        }
        SiparisAdim other = (SiparisAdim) object;
        if ((this.pksipadim == null && other.pksipadim != null) || (this.pksipadim != null && !this.pksipadim.equals(other.pksipadim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SiparisAdim[ pksipadim=" + pksipadim + " ]";
    }
    
}
