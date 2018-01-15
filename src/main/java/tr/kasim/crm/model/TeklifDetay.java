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
@Table(name = "TeklifDetay")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TeklifDetay.findAll", query = "SELECT t FROM TeklifDetay t"),
    @NamedQuery(name = "TeklifDetay.findByPktekdetay", query = "SELECT t FROM TeklifDetay t WHERE t.pktekdetay = :pktekdetay"),
    @NamedQuery(name = "TeklifDetay.findBySipno", query = "SELECT t FROM TeklifDetay t WHERE t.sipno = :sipno"),
    @NamedQuery(name = "TeklifDetay.findBySipdetay", query = "SELECT t FROM TeklifDetay t WHERE t.sipdetay = :sipdetay"),
    @NamedQuery(name = "TeklifDetay.findByTeklifkonu", query = "SELECT t FROM TeklifDetay t WHERE t.teklifkonu = :teklifkonu"),
    @NamedQuery(name = "TeklifDetay.findByTeklifAciklama", query = "SELECT t FROM TeklifDetay t WHERE t.teklifAciklama = :teklifAciklama"),
    @NamedQuery(name = "TeklifDetay.findByAdet", query = "SELECT t FROM TeklifDetay t WHERE t.adet = :adet"),
    @NamedQuery(name = "TeklifDetay.findByBirim", query = "SELECT t FROM TeklifDetay t WHERE t.birim = :birim"),
    @NamedQuery(name = "TeklifDetay.findByFiyat", query = "SELECT t FROM TeklifDetay t WHERE t.fiyat = :fiyat"),
    @NamedQuery(name = "TeklifDetay.findByToplam", query = "SELECT t FROM TeklifDetay t WHERE t.toplam = :toplam")})
public class TeklifDetay implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pktekdetay")
    private Integer pktekdetay;
    @Column(name = "sipno")
    private Integer sipno;
    @Column(name = "sipdetay")
    private Integer sipdetay;
    @Size(max = 250)
    @Column(name = "teklifkonu")
    private String teklifkonu;
    @Size(max = 1073741823)
    @Column(name = "teklifAciklama")
    private String teklifAciklama;
    @Column(name = "Adet")
    private Integer adet;
    @Size(max = 50)
    @Column(name = "Birim")
    private String birim;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Fiyat")
    private BigDecimal fiyat;
    @Column(name = "Toplam")
    private BigDecimal toplam;

    public TeklifDetay() {
    }

    public TeklifDetay(Integer pktekdetay) {
        this.pktekdetay = pktekdetay;
    }

    public Integer getPktekdetay() {
        return pktekdetay;
    }

    public void setPktekdetay(Integer pktekdetay) {
        this.pktekdetay = pktekdetay;
    }

    public Integer getSipno() {
        return sipno;
    }

    public void setSipno(Integer sipno) {
        this.sipno = sipno;
    }

    public Integer getSipdetay() {
        return sipdetay;
    }

    public void setSipdetay(Integer sipdetay) {
        this.sipdetay = sipdetay;
    }

    public String getTeklifkonu() {
        return teklifkonu;
    }

    public void setTeklifkonu(String teklifkonu) {
        this.teklifkonu = teklifkonu;
    }

    public String getTeklifAciklama() {
        return teklifAciklama;
    }

    public void setTeklifAciklama(String teklifAciklama) {
        this.teklifAciklama = teklifAciklama;
    }

    public Integer getAdet() {
        return adet;
    }

    public void setAdet(Integer adet) {
        this.adet = adet;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public BigDecimal getToplam() {
        return toplam;
    }

    public void setToplam(BigDecimal toplam) {
        this.toplam = toplam;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pktekdetay != null ? pktekdetay.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeklifDetay)) {
            return false;
        }
        TeklifDetay other = (TeklifDetay) object;
        if ((this.pktekdetay == null && other.pktekdetay != null) || (this.pktekdetay != null && !this.pktekdetay.equals(other.pktekdetay))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.TeklifDetay[ pktekdetay=" + pktekdetay + " ]";
    }
    
}
