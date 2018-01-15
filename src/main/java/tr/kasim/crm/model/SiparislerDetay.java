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
@Table(name = "SiparislerDetay")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SiparislerDetay.findAll", query = "SELECT s FROM SiparislerDetay s"),
    @NamedQuery(name = "SiparislerDetay.findByPksiparislerdetay", query = "SELECT s FROM SiparislerDetay s WHERE s.pksiparislerdetay = :pksiparislerdetay"),
    @NamedQuery(name = "SiparislerDetay.findBySiparisUstNo", query = "SELECT s FROM SiparislerDetay s WHERE s.siparisUstNo = :siparisUstNo"),
    @NamedQuery(name = "SiparislerDetay.findByUstNo", query = "SELECT s FROM SiparislerDetay s WHERE s.ustNo = :ustNo"),
    @NamedQuery(name = "SiparislerDetay.findBySipNo", query = "SELECT s FROM SiparislerDetay s WHERE s.sipNo = :sipNo"),
    @NamedQuery(name = "SiparislerDetay.findByTip", query = "SELECT s FROM SiparislerDetay s WHERE s.tip = :tip"),
    @NamedQuery(name = "SiparislerDetay.findByFkUrun", query = "SELECT s FROM SiparislerDetay s WHERE s.fkUrun = :fkUrun"),
    @NamedQuery(name = "SiparislerDetay.findByUrunKod", query = "SELECT s FROM SiparislerDetay s WHERE s.urunKod = :urunKod"),
    @NamedQuery(name = "SiparislerDetay.findByUrunAd", query = "SELECT s FROM SiparislerDetay s WHERE s.urunAd = :urunAd"),
    @NamedQuery(name = "SiparislerDetay.findByRenk", query = "SELECT s FROM SiparislerDetay s WHERE s.renk = :renk"),
    @NamedQuery(name = "SiparislerDetay.findByRenkMaliyet", query = "SELECT s FROM SiparislerDetay s WHERE s.renkMaliyet = :renkMaliyet"),
    @NamedQuery(name = "SiparislerDetay.findByRenkMaliyetTL", query = "SELECT s FROM SiparislerDetay s WHERE s.renkMaliyetTL = :renkMaliyetTL"),
    @NamedQuery(name = "SiparislerDetay.findByMiktar", query = "SELECT s FROM SiparislerDetay s WHERE s.miktar = :miktar"),
    @NamedQuery(name = "SiparislerDetay.findBySiparisMiktar", query = "SELECT s FROM SiparislerDetay s WHERE s.siparisMiktar = :siparisMiktar"),
    @NamedQuery(name = "SiparislerDetay.findByBirim", query = "SELECT s FROM SiparislerDetay s WHERE s.birim = :birim"),
    @NamedQuery(name = "SiparislerDetay.findByKur", query = "SELECT s FROM SiparislerDetay s WHERE s.kur = :kur"),
    @NamedQuery(name = "SiparislerDetay.findByNetBFiyat", query = "SELECT s FROM SiparislerDetay s WHERE s.netBFiyat = :netBFiyat"),
    @NamedQuery(name = "SiparislerDetay.findByToplamNetFiyat", query = "SELECT s FROM SiparislerDetay s WHERE s.toplamNetFiyat = :toplamNetFiyat"),
    @NamedQuery(name = "SiparislerDetay.findByNetBFiyatKdv", query = "SELECT s FROM SiparislerDetay s WHERE s.netBFiyatKdv = :netBFiyatKdv"),
    @NamedQuery(name = "SiparislerDetay.findByToplamNetFiyatKdv", query = "SELECT s FROM SiparislerDetay s WHERE s.toplamNetFiyatKdv = :toplamNetFiyatKdv"),
    @NamedQuery(name = "SiparislerDetay.findByIskonto", query = "SELECT s FROM SiparislerDetay s WHERE s.iskonto = :iskonto"),
    @NamedQuery(name = "SiparislerDetay.findByIskontoTutar", query = "SELECT s FROM SiparislerDetay s WHERE s.iskontoTutar = :iskontoTutar"),
    @NamedQuery(name = "SiparislerDetay.findByBirimMetraj", query = "SELECT s FROM SiparislerDetay s WHERE s.birimMetraj = :birimMetraj"),
    @NamedQuery(name = "SiparislerDetay.findByBirimMetrajB", query = "SELECT s FROM SiparislerDetay s WHERE s.birimMetrajB = :birimMetrajB"),
    @NamedQuery(name = "SiparislerDetay.findByAlan", query = "SELECT s FROM SiparislerDetay s WHERE s.alan = :alan"),
    @NamedQuery(name = "SiparislerDetay.findByM2BirimMaliyet", query = "SELECT s FROM SiparislerDetay s WHERE s.m2BirimMaliyet = :m2BirimMaliyet"),
    @NamedQuery(name = "SiparislerDetay.findBySil", query = "SELECT s FROM SiparislerDetay s WHERE s.sil = :sil"),
    @NamedQuery(name = "SiparislerDetay.findByKat", query = "SELECT s FROM SiparislerDetay s WHERE s.kat = :kat")})
public class SiparislerDetay implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pksiparislerdetay")
    private Integer pksiparislerdetay;
    @Column(name = "SiparisUstNo")
    private Integer siparisUstNo;
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
    @Column(name = "SiparisMiktar")
    private BigDecimal siparisMiktar;
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
    @Column(name = "Kat")
    private Integer kat;

    public SiparislerDetay() {
    }

    public SiparislerDetay(Integer pksiparislerdetay) {
        this.pksiparislerdetay = pksiparislerdetay;
    }

    public Integer getPksiparislerdetay() {
        return pksiparislerdetay;
    }

    public void setPksiparislerdetay(Integer pksiparislerdetay) {
        this.pksiparislerdetay = pksiparislerdetay;
    }

    public Integer getSiparisUstNo() {
        return siparisUstNo;
    }

    public void setSiparisUstNo(Integer siparisUstNo) {
        this.siparisUstNo = siparisUstNo;
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

    public BigDecimal getSiparisMiktar() {
        return siparisMiktar;
    }

    public void setSiparisMiktar(BigDecimal siparisMiktar) {
        this.siparisMiktar = siparisMiktar;
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

    public Integer getKat() {
        return kat;
    }

    public void setKat(Integer kat) {
        this.kat = kat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pksiparislerdetay != null ? pksiparislerdetay.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SiparislerDetay)) {
            return false;
        }
        SiparislerDetay other = (SiparislerDetay) object;
        if ((this.pksiparislerdetay == null && other.pksiparislerdetay != null) || (this.pksiparislerdetay != null && !this.pksiparislerdetay.equals(other.pksiparislerdetay))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SiparislerDetay[ pksiparislerdetay=" + pksiparislerdetay + " ]";
    }
    
}
