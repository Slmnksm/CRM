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
@Table(name = "SiparisDetay")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SiparisDetay.findAll", query = "SELECT s FROM SiparisDetay s"),
    @NamedQuery(name = "SiparisDetay.findByPksipdetay", query = "SELECT s FROM SiparisDetay s WHERE s.pksipdetay = :pksipdetay"),
    @NamedQuery(name = "SiparisDetay.findByUstNo", query = "SELECT s FROM SiparisDetay s WHERE s.ustNo = :ustNo"),
    @NamedQuery(name = "SiparisDetay.findBySipNo", query = "SELECT s FROM SiparisDetay s WHERE s.sipNo = :sipNo"),
    @NamedQuery(name = "SiparisDetay.findByTip", query = "SELECT s FROM SiparisDetay s WHERE s.tip = :tip"),
    @NamedQuery(name = "SiparisDetay.findByFkUrun", query = "SELECT s FROM SiparisDetay s WHERE s.fkUrun = :fkUrun"),
    @NamedQuery(name = "SiparisDetay.findByUrunKod", query = "SELECT s FROM SiparisDetay s WHERE s.urunKod = :urunKod"),
    @NamedQuery(name = "SiparisDetay.findByUrunAd", query = "SELECT s FROM SiparisDetay s WHERE s.urunAd = :urunAd"),
    @NamedQuery(name = "SiparisDetay.findByRenk", query = "SELECT s FROM SiparisDetay s WHERE s.renk = :renk"),
    @NamedQuery(name = "SiparisDetay.findByRenkMaliyet", query = "SELECT s FROM SiparisDetay s WHERE s.renkMaliyet = :renkMaliyet"),
    @NamedQuery(name = "SiparisDetay.findByRenkMaliyetTL", query = "SELECT s FROM SiparisDetay s WHERE s.renkMaliyetTL = :renkMaliyetTL"),
    @NamedQuery(name = "SiparisDetay.findByMiktar", query = "SELECT s FROM SiparisDetay s WHERE s.miktar = :miktar"),
    @NamedQuery(name = "SiparisDetay.findByBirim", query = "SELECT s FROM SiparisDetay s WHERE s.birim = :birim"),
    @NamedQuery(name = "SiparisDetay.findByKur", query = "SELECT s FROM SiparisDetay s WHERE s.kur = :kur"),
    @NamedQuery(name = "SiparisDetay.findByNetBFiyat", query = "SELECT s FROM SiparisDetay s WHERE s.netBFiyat = :netBFiyat"),
    @NamedQuery(name = "SiparisDetay.findByToplamNetFiyat", query = "SELECT s FROM SiparisDetay s WHERE s.toplamNetFiyat = :toplamNetFiyat"),
    @NamedQuery(name = "SiparisDetay.findByNetBFiyatKdv", query = "SELECT s FROM SiparisDetay s WHERE s.netBFiyatKdv = :netBFiyatKdv"),
    @NamedQuery(name = "SiparisDetay.findByToplamNetFiyatKdv", query = "SELECT s FROM SiparisDetay s WHERE s.toplamNetFiyatKdv = :toplamNetFiyatKdv"),
    @NamedQuery(name = "SiparisDetay.findByIskonto", query = "SELECT s FROM SiparisDetay s WHERE s.iskonto = :iskonto"),
    @NamedQuery(name = "SiparisDetay.findByIskontoTutar", query = "SELECT s FROM SiparisDetay s WHERE s.iskontoTutar = :iskontoTutar"),
    @NamedQuery(name = "SiparisDetay.findByBirimMetraj", query = "SELECT s FROM SiparisDetay s WHERE s.birimMetraj = :birimMetraj"),
    @NamedQuery(name = "SiparisDetay.findByBirimMetrajB", query = "SELECT s FROM SiparisDetay s WHERE s.birimMetrajB = :birimMetrajB"),
    @NamedQuery(name = "SiparisDetay.findByAlan", query = "SELECT s FROM SiparisDetay s WHERE s.alan = :alan"),
    @NamedQuery(name = "SiparisDetay.findByM2BirimMaliyet", query = "SELECT s FROM SiparisDetay s WHERE s.m2BirimMaliyet = :m2BirimMaliyet"),
    @NamedQuery(name = "SiparisDetay.findBySil", query = "SELECT s FROM SiparisDetay s WHERE s.sil = :sil"),
    @NamedQuery(name = "SiparisDetay.findByKat", query = "SELECT s FROM SiparisDetay s WHERE s.kat = :kat"),
    @NamedQuery(name = "SiparisDetay.findByAciklama", query = "SELECT s FROM SiparisDetay s WHERE s.aciklama = :aciklama"),
    @NamedQuery(name = "SiparisDetay.findByKatiMadde", query = "SELECT s FROM SiparisDetay s WHERE s.katiMadde = :katiMadde"),
    @NamedQuery(name = "SiparisDetay.findByKuruFilm", query = "SELECT s FROM SiparisDetay s WHERE s.kuruFilm = :kuruFilm"),
    @NamedQuery(name = "SiparisDetay.findByTeorikYayilma", query = "SELECT s FROM SiparisDetay s WHERE s.teorikYayilma = :teorikYayilma"),
    @NamedQuery(name = "SiparisDetay.findByPratikYayilma", query = "SELECT s FROM SiparisDetay s WHERE s.pratikYayilma = :pratikYayilma"),
    @NamedQuery(name = "SiparisDetay.findByKayipFaktor", query = "SELECT s FROM SiparisDetay s WHERE s.kayipFaktor = :kayipFaktor"),
    @NamedQuery(name = "SiparisDetay.findByTinerOran", query = "SELECT s FROM SiparisDetay s WHERE s.tinerOran = :tinerOran")})
public class SiparisDetay implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pksipdetay")
    private Integer pksipdetay;
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
    @Column(name = "Kat")
    private Integer kat;
    @Size(max = 150)
    @Column(name = "Aciklama")
    private String aciklama;
    @Column(name = "KatiMadde")
    private BigDecimal katiMadde;
    @Column(name = "KuruFilm")
    private BigDecimal kuruFilm;
    @Column(name = "TeorikYayilma")
    private BigDecimal teorikYayilma;
    @Column(name = "PratikYayilma")
    private BigDecimal pratikYayilma;
    @Column(name = "KayipFaktor")
    private BigDecimal kayipFaktor;
    @Column(name = "TinerOran")
    private BigDecimal tinerOran;

    public SiparisDetay() {
    }

    public SiparisDetay(Integer pksipdetay) {
        this.pksipdetay = pksipdetay;
    }

    public Integer getPksipdetay() {
        return pksipdetay;
    }

    public void setPksipdetay(Integer pksipdetay) {
        this.pksipdetay = pksipdetay;
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

    public Integer getKat() {
        return kat;
    }

    public void setKat(Integer kat) {
        this.kat = kat;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public BigDecimal getKatiMadde() {
        return katiMadde;
    }

    public void setKatiMadde(BigDecimal katiMadde) {
        this.katiMadde = katiMadde;
    }

    public BigDecimal getKuruFilm() {
        return kuruFilm;
    }

    public void setKuruFilm(BigDecimal kuruFilm) {
        this.kuruFilm = kuruFilm;
    }

    public BigDecimal getTeorikYayilma() {
        return teorikYayilma;
    }

    public void setTeorikYayilma(BigDecimal teorikYayilma) {
        this.teorikYayilma = teorikYayilma;
    }

    public BigDecimal getPratikYayilma() {
        return pratikYayilma;
    }

    public void setPratikYayilma(BigDecimal pratikYayilma) {
        this.pratikYayilma = pratikYayilma;
    }

    public BigDecimal getKayipFaktor() {
        return kayipFaktor;
    }

    public void setKayipFaktor(BigDecimal kayipFaktor) {
        this.kayipFaktor = kayipFaktor;
    }

    public BigDecimal getTinerOran() {
        return tinerOran;
    }

    public void setTinerOran(BigDecimal tinerOran) {
        this.tinerOran = tinerOran;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pksipdetay != null ? pksipdetay.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SiparisDetay)) {
            return false;
        }
        SiparisDetay other = (SiparisDetay) object;
        if ((this.pksipdetay == null && other.pksipdetay != null) || (this.pksipdetay != null && !this.pksipdetay.equals(other.pksipdetay))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SiparisDetay[ pksipdetay=" + pksipdetay + " ]";
    }
    
}
