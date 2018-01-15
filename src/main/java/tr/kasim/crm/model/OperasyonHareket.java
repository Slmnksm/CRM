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
@Table(name = "OperasyonHareket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OperasyonHareket.findAll", query = "SELECT o FROM OperasyonHareket o"),
    @NamedQuery(name = "OperasyonHareket.findByPkOpHareket", query = "SELECT o FROM OperasyonHareket o WHERE o.pkOpHareket = :pkOpHareket"),
    @NamedQuery(name = "OperasyonHareket.findByUstNo", query = "SELECT o FROM OperasyonHareket o WHERE o.ustNo = :ustNo"),
    @NamedQuery(name = "OperasyonHareket.findBySipNo", query = "SELECT o FROM OperasyonHareket o WHERE o.sipNo = :sipNo"),
    @NamedQuery(name = "OperasyonHareket.findByTip", query = "SELECT o FROM OperasyonHareket o WHERE o.tip = :tip"),
    @NamedQuery(name = "OperasyonHareket.findByFkUrun", query = "SELECT o FROM OperasyonHareket o WHERE o.fkUrun = :fkUrun"),
    @NamedQuery(name = "OperasyonHareket.findByUrunKod", query = "SELECT o FROM OperasyonHareket o WHERE o.urunKod = :urunKod"),
    @NamedQuery(name = "OperasyonHareket.findByUrunAd", query = "SELECT o FROM OperasyonHareket o WHERE o.urunAd = :urunAd"),
    @NamedQuery(name = "OperasyonHareket.findByRenk", query = "SELECT o FROM OperasyonHareket o WHERE o.renk = :renk"),
    @NamedQuery(name = "OperasyonHareket.findByRenkMaliyet", query = "SELECT o FROM OperasyonHareket o WHERE o.renkMaliyet = :renkMaliyet"),
    @NamedQuery(name = "OperasyonHareket.findByRenkMaliyetTL", query = "SELECT o FROM OperasyonHareket o WHERE o.renkMaliyetTL = :renkMaliyetTL"),
    @NamedQuery(name = "OperasyonHareket.findByMiktar", query = "SELECT o FROM OperasyonHareket o WHERE o.miktar = :miktar"),
    @NamedQuery(name = "OperasyonHareket.findByBirim", query = "SELECT o FROM OperasyonHareket o WHERE o.birim = :birim"),
    @NamedQuery(name = "OperasyonHareket.findByKur", query = "SELECT o FROM OperasyonHareket o WHERE o.kur = :kur"),
    @NamedQuery(name = "OperasyonHareket.findByNetBFiyat", query = "SELECT o FROM OperasyonHareket o WHERE o.netBFiyat = :netBFiyat"),
    @NamedQuery(name = "OperasyonHareket.findByToplamNetFiyat", query = "SELECT o FROM OperasyonHareket o WHERE o.toplamNetFiyat = :toplamNetFiyat"),
    @NamedQuery(name = "OperasyonHareket.findByNetBFiyatKdv", query = "SELECT o FROM OperasyonHareket o WHERE o.netBFiyatKdv = :netBFiyatKdv"),
    @NamedQuery(name = "OperasyonHareket.findByToplamNetFiyatKdv", query = "SELECT o FROM OperasyonHareket o WHERE o.toplamNetFiyatKdv = :toplamNetFiyatKdv"),
    @NamedQuery(name = "OperasyonHareket.findByIskonto", query = "SELECT o FROM OperasyonHareket o WHERE o.iskonto = :iskonto"),
    @NamedQuery(name = "OperasyonHareket.findByIskontoTutar", query = "SELECT o FROM OperasyonHareket o WHERE o.iskontoTutar = :iskontoTutar"),
    @NamedQuery(name = "OperasyonHareket.findByBirimMetraj", query = "SELECT o FROM OperasyonHareket o WHERE o.birimMetraj = :birimMetraj"),
    @NamedQuery(name = "OperasyonHareket.findByBirimMetrajB", query = "SELECT o FROM OperasyonHareket o WHERE o.birimMetrajB = :birimMetrajB"),
    @NamedQuery(name = "OperasyonHareket.findByAlan", query = "SELECT o FROM OperasyonHareket o WHERE o.alan = :alan"),
    @NamedQuery(name = "OperasyonHareket.findByM2BirimMaliyet", query = "SELECT o FROM OperasyonHareket o WHERE o.m2BirimMaliyet = :m2BirimMaliyet"),
    @NamedQuery(name = "OperasyonHareket.findBySil", query = "SELECT o FROM OperasyonHareket o WHERE o.sil = :sil")})
public class OperasyonHareket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkOpHareket")
    private Integer pkOpHareket;
    @Column(name = "UstNo")
    private Integer ustNo;
    @Column(name = "SipNo")
    private Integer sipNo;
    @Column(name = "Tip")
    private Integer tip;
    @Column(name = "fkUrun")
    private Integer fkUrun;
    @Size(max = 250)
    @Column(name = "UrunKod")
    private String urunKod;
    @Size(max = 250)
    @Column(name = "UrunAd")
    private String urunAd;
    @Size(max = 50)
    @Column(name = "Renk")
    private String renk;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RenkMaliyet")
    private BigDecimal renkMaliyet;
    @Column(name = "RenkMaliyetTL")
    private BigDecimal renkMaliyetTL;
    @Column(name = "Miktar")
    private BigDecimal miktar;
    @Column(name = "Birim")
    private Integer birim;
    @Column(name = "Kur")
    private BigDecimal kur;
    @Column(name = "NetBFiyat")
    private BigDecimal netBFiyat;
    @Column(name = "ToplamNetFiyat")
    private BigDecimal toplamNetFiyat;
    @Column(name = "NetBFiyatKdv")
    private BigDecimal netBFiyatKdv;
    @Column(name = "ToplamNetFiyatKdv")
    private BigDecimal toplamNetFiyatKdv;
    @Column(name = "Iskonto")
    private BigDecimal iskonto;
    @Column(name = "IskontoTutar")
    private BigDecimal iskontoTutar;
    @Column(name = "BirimMetraj")
    private BigDecimal birimMetraj;
    @Column(name = "BirimMetrajB")
    private Integer birimMetrajB;
    @Column(name = "Alan")
    private BigDecimal alan;
    @Column(name = "m2BirimMaliyet")
    private BigDecimal m2BirimMaliyet;
    @Column(name = "Sil")
    private Boolean sil;

    public OperasyonHareket() {
    }

    public OperasyonHareket(Integer pkOpHareket) {
        this.pkOpHareket = pkOpHareket;
    }

    public Integer getPkOpHareket() {
        return pkOpHareket;
    }

    public void setPkOpHareket(Integer pkOpHareket) {
        this.pkOpHareket = pkOpHareket;
    }

    public Integer getUstNo() {
        return ustNo;
    }

    public void setUstNo(Integer ustNo) {
        this.ustNo = ustNo;
    }

    public Integer getSipNo() {
        return sipNo;
    }

    public void setSipNo(Integer sipNo) {
        this.sipNo = sipNo;
    }

    public Integer getTip() {
        return tip;
    }

    public void setTip(Integer tip) {
        this.tip = tip;
    }

    public Integer getFkUrun() {
        return fkUrun;
    }

    public void setFkUrun(Integer fkUrun) {
        this.fkUrun = fkUrun;
    }

    public String getUrunKod() {
        return urunKod;
    }

    public void setUrunKod(String urunKod) {
        this.urunKod = urunKod;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public BigDecimal getRenkMaliyet() {
        return renkMaliyet;
    }

    public void setRenkMaliyet(BigDecimal renkMaliyet) {
        this.renkMaliyet = renkMaliyet;
    }

    public BigDecimal getRenkMaliyetTL() {
        return renkMaliyetTL;
    }

    public void setRenkMaliyetTL(BigDecimal renkMaliyetTL) {
        this.renkMaliyetTL = renkMaliyetTL;
    }

    public BigDecimal getMiktar() {
        return miktar;
    }

    public void setMiktar(BigDecimal miktar) {
        this.miktar = miktar;
    }

    public Integer getBirim() {
        return birim;
    }

    public void setBirim(Integer birim) {
        this.birim = birim;
    }

    public BigDecimal getKur() {
        return kur;
    }

    public void setKur(BigDecimal kur) {
        this.kur = kur;
    }

    public BigDecimal getNetBFiyat() {
        return netBFiyat;
    }

    public void setNetBFiyat(BigDecimal netBFiyat) {
        this.netBFiyat = netBFiyat;
    }

    public BigDecimal getToplamNetFiyat() {
        return toplamNetFiyat;
    }

    public void setToplamNetFiyat(BigDecimal toplamNetFiyat) {
        this.toplamNetFiyat = toplamNetFiyat;
    }

    public BigDecimal getNetBFiyatKdv() {
        return netBFiyatKdv;
    }

    public void setNetBFiyatKdv(BigDecimal netBFiyatKdv) {
        this.netBFiyatKdv = netBFiyatKdv;
    }

    public BigDecimal getToplamNetFiyatKdv() {
        return toplamNetFiyatKdv;
    }

    public void setToplamNetFiyatKdv(BigDecimal toplamNetFiyatKdv) {
        this.toplamNetFiyatKdv = toplamNetFiyatKdv;
    }

    public BigDecimal getIskonto() {
        return iskonto;
    }

    public void setIskonto(BigDecimal iskonto) {
        this.iskonto = iskonto;
    }

    public BigDecimal getIskontoTutar() {
        return iskontoTutar;
    }

    public void setIskontoTutar(BigDecimal iskontoTutar) {
        this.iskontoTutar = iskontoTutar;
    }

    public BigDecimal getBirimMetraj() {
        return birimMetraj;
    }

    public void setBirimMetraj(BigDecimal birimMetraj) {
        this.birimMetraj = birimMetraj;
    }

    public Integer getBirimMetrajB() {
        return birimMetrajB;
    }

    public void setBirimMetrajB(Integer birimMetrajB) {
        this.birimMetrajB = birimMetrajB;
    }

    public BigDecimal getAlan() {
        return alan;
    }

    public void setAlan(BigDecimal alan) {
        this.alan = alan;
    }

    public BigDecimal getM2BirimMaliyet() {
        return m2BirimMaliyet;
    }

    public void setM2BirimMaliyet(BigDecimal m2BirimMaliyet) {
        this.m2BirimMaliyet = m2BirimMaliyet;
    }

    public Boolean getSil() {
        return sil;
    }

    public void setSil(Boolean sil) {
        this.sil = sil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkOpHareket != null ? pkOpHareket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OperasyonHareket)) {
            return false;
        }
        OperasyonHareket other = (OperasyonHareket) object;
        if ((this.pkOpHareket == null && other.pkOpHareket != null) || (this.pkOpHareket != null && !this.pkOpHareket.equals(other.pkOpHareket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.OperasyonHareket[ pkOpHareket=" + pkOpHareket + " ]";
    }
    
}
