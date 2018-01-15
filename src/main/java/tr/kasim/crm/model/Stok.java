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
@Table(name = "Stok")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stok.findAll", query = "SELECT s FROM Stok s"),
    @NamedQuery(name = "Stok.findByPkUrun", query = "SELECT s FROM Stok s WHERE s.pkUrun = :pkUrun"),
    @NamedQuery(name = "Stok.findByUrunKod", query = "SELECT s FROM Stok s WHERE s.urunKod = :urunKod"),
    @NamedQuery(name = "Stok.findByUrunAd", query = "SELECT s FROM Stok s WHERE s.urunAd = :urunAd"),
    @NamedQuery(name = "Stok.findByKisaAd", query = "SELECT s FROM Stok s WHERE s.kisaAd = :kisaAd"),
    @NamedQuery(name = "Stok.findByBirim", query = "SELECT s FROM Stok s WHERE s.birim = :birim"),
    @NamedQuery(name = "Stok.findByBirimFiyat", query = "SELECT s FROM Stok s WHERE s.birimFiyat = :birimFiyat"),
    @NamedQuery(name = "Stok.findByMBirimFiyat", query = "SELECT s FROM Stok s WHERE s.mBirimFiyat = :mBirimFiyat"),
    @NamedQuery(name = "Stok.findByTeorikMetraj", query = "SELECT s FROM Stok s WHERE s.teorikMetraj = :teorikMetraj"),
    @NamedQuery(name = "Stok.findByPratikMetraj", query = "SELECT s FROM Stok s WHERE s.pratikMetraj = :pratikMetraj"),
    @NamedQuery(name = "Stok.findByAmbalaj", query = "SELECT s FROM Stok s WHERE s.ambalaj = :ambalaj"),
    @NamedQuery(name = "Stok.findByUrunGrup", query = "SELECT s FROM Stok s WHERE s.urunGrup = :urunGrup"),
    @NamedQuery(name = "Stok.findByKdvOran", query = "SELECT s FROM Stok s WHERE s.kdvOran = :kdvOran"),
    @NamedQuery(name = "Stok.findByFkFirma", query = "SELECT s FROM Stok s WHERE s.fkFirma = :fkFirma"),
    @NamedQuery(name = "Stok.findByMarka", query = "SELECT s FROM Stok s WHERE s.marka = :marka"),
    @NamedQuery(name = "Stok.findByModel", query = "SELECT s FROM Stok s WHERE s.model = :model"),
    @NamedQuery(name = "Stok.findByKritikLimit", query = "SELECT s FROM Stok s WHERE s.kritikLimit = :kritikLimit"),
    @NamedQuery(name = "Stok.findByAciklama", query = "SELECT s FROM Stok s WHERE s.aciklama = :aciklama"),
    @NamedQuery(name = "Stok.findBySonAlis", query = "SELECT s FROM Stok s WHERE s.sonAlis = :sonAlis"),
    @NamedQuery(name = "Stok.findBySonSatis", query = "SELECT s FROM Stok s WHERE s.sonSatis = :sonSatis"),
    @NamedQuery(name = "Stok.findByOrtalamaAlis", query = "SELECT s FROM Stok s WHERE s.ortalamaAlis = :ortalamaAlis"),
    @NamedQuery(name = "Stok.findByOrtalamaSatis", query = "SELECT s FROM Stok s WHERE s.ortalamaSatis = :ortalamaSatis"),
    @NamedQuery(name = "Stok.findByTip", query = "SELECT s FROM Stok s WHERE s.tip = :tip"),
    @NamedQuery(name = "Stok.findByRenk", query = "SELECT s FROM Stok s WHERE s.renk = :renk"),
    @NamedQuery(name = "Stok.findByTarih", query = "SELECT s FROM Stok s WHERE s.tarih = :tarih"),
    @NamedQuery(name = "Stok.findByDoviz", query = "SELECT s FROM Stok s WHERE s.doviz = :doviz"),
    @NamedQuery(name = "Stok.findByUrunAGrup", query = "SELECT s FROM Stok s WHERE s.urunAGrup = :urunAGrup"),
    @NamedQuery(name = "Stok.findByMiktar", query = "SELECT s FROM Stok s WHERE s.miktar = :miktar"),
    @NamedQuery(name = "Stok.findBySegment", query = "SELECT s FROM Stok s WHERE s.segment = :segment"),
    @NamedQuery(name = "Stok.findByBarkod", query = "SELECT s FROM Stok s WHERE s.barkod = :barkod"),
    @NamedQuery(name = "Stok.findByKatiMadde", query = "SELECT s FROM Stok s WHERE s.katiMadde = :katiMadde"),
    @NamedQuery(name = "Stok.findByTiner", query = "SELECT s FROM Stok s WHERE s.tiner = :tiner")})
public class Stok implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkUrun")
    private Integer pkUrun;
    @Size(max = 250)
    @Column(name = "UrunKod")
    private String urunKod;
    @Size(max = 250)
    @Column(name = "UrunAd")
    private String urunAd;
    @Size(max = 250)
    @Column(name = "KisaAd")
    private String kisaAd;
    @Size(max = 50)
    @Column(name = "Birim")
    private String birim;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BirimFiyat")
    private BigDecimal birimFiyat;
    @Column(name = "MBirimFiyat")
    private BigDecimal mBirimFiyat;
    @Column(name = "TeorikMetraj")
    private BigDecimal teorikMetraj;
    @Column(name = "PratikMetraj")
    private BigDecimal pratikMetraj;
    @Size(max = 50)
    @Column(name = "Ambalaj")
    private String ambalaj;
    @Size(max = 50)
    @Column(name = "UrunGrup")
    private String urunGrup;
    @Column(name = "KdvOran")
    private Integer kdvOran;
    @Column(name = "fkFirma")
    private Integer fkFirma;
    @Size(max = 50)
    @Column(name = "Marka")
    private String marka;
    @Size(max = 50)
    @Column(name = "Model")
    private String model;
    @Column(name = "KritikLimit")
    private BigDecimal kritikLimit;
    @Size(max = 250)
    @Column(name = "Aciklama")
    private String aciklama;
    @Column(name = "SonAlis")
    private BigDecimal sonAlis;
    @Column(name = "SonSatis")
    private BigDecimal sonSatis;
    @Column(name = "OrtalamaAlis")
    private BigDecimal ortalamaAlis;
    @Column(name = "OrtalamaSatis")
    private BigDecimal ortalamaSatis;
    @Size(max = 10)
    @Column(name = "Tip")
    private String tip;
    @Size(max = 150)
    @Column(name = "Renk")
    private String renk;
    @Column(name = "Tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    @Column(name = "doviz")
    private Integer doviz;
    @Size(max = 50)
    @Column(name = "UrunAGrup")
    private String urunAGrup;
    @Column(name = "Miktar")
    private BigDecimal miktar;
    @Size(max = 50)
    @Column(name = "Segment")
    private String segment;
    @Size(max = 50)
    @Column(name = "Barkod")
    private String barkod;
    @Column(name = "KatiMadde")
    private Integer katiMadde;
    @Column(name = "Tiner")
    private Integer tiner;

    public Stok() {
    }

    public Stok(Integer pkUrun) {
        this.pkUrun = pkUrun;
    }

    public Integer getPkUrun() {
        return pkUrun;
    }

    public void setPkUrun(Integer pkUrun) {
        this.pkUrun = pkUrun;
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

    public String getKisaAd() {
        return kisaAd;
    }

    public void setKisaAd(String kisaAd) {
        this.kisaAd = kisaAd;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public BigDecimal getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(BigDecimal birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public BigDecimal getMBirimFiyat() {
        return mBirimFiyat;
    }

    public void setMBirimFiyat(BigDecimal mBirimFiyat) {
        this.mBirimFiyat = mBirimFiyat;
    }

    public BigDecimal getTeorikMetraj() {
        return teorikMetraj;
    }

    public void setTeorikMetraj(BigDecimal teorikMetraj) {
        this.teorikMetraj = teorikMetraj;
    }

    public BigDecimal getPratikMetraj() {
        return pratikMetraj;
    }

    public void setPratikMetraj(BigDecimal pratikMetraj) {
        this.pratikMetraj = pratikMetraj;
    }

    public String getAmbalaj() {
        return ambalaj;
    }

    public void setAmbalaj(String ambalaj) {
        this.ambalaj = ambalaj;
    }

    public String getUrunGrup() {
        return urunGrup;
    }

    public void setUrunGrup(String urunGrup) {
        this.urunGrup = urunGrup;
    }

    public Integer getKdvOran() {
        return kdvOran;
    }

    public void setKdvOran(Integer kdvOran) {
        this.kdvOran = kdvOran;
    }

    public Integer getFkFirma() {
        return fkFirma;
    }

    public void setFkFirma(Integer fkFirma) {
        this.fkFirma = fkFirma;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getKritikLimit() {
        return kritikLimit;
    }

    public void setKritikLimit(BigDecimal kritikLimit) {
        this.kritikLimit = kritikLimit;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public BigDecimal getSonAlis() {
        return sonAlis;
    }

    public void setSonAlis(BigDecimal sonAlis) {
        this.sonAlis = sonAlis;
    }

    public BigDecimal getSonSatis() {
        return sonSatis;
    }

    public void setSonSatis(BigDecimal sonSatis) {
        this.sonSatis = sonSatis;
    }

    public BigDecimal getOrtalamaAlis() {
        return ortalamaAlis;
    }

    public void setOrtalamaAlis(BigDecimal ortalamaAlis) {
        this.ortalamaAlis = ortalamaAlis;
    }

    public BigDecimal getOrtalamaSatis() {
        return ortalamaSatis;
    }

    public void setOrtalamaSatis(BigDecimal ortalamaSatis) {
        this.ortalamaSatis = ortalamaSatis;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public Integer getDoviz() {
        return doviz;
    }

    public void setDoviz(Integer doviz) {
        this.doviz = doviz;
    }

    public String getUrunAGrup() {
        return urunAGrup;
    }

    public void setUrunAGrup(String urunAGrup) {
        this.urunAGrup = urunAGrup;
    }

    public BigDecimal getMiktar() {
        return miktar;
    }

    public void setMiktar(BigDecimal miktar) {
        this.miktar = miktar;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public Integer getKatiMadde() {
        return katiMadde;
    }

    public void setKatiMadde(Integer katiMadde) {
        this.katiMadde = katiMadde;
    }

    public Integer getTiner() {
        return tiner;
    }

    public void setTiner(Integer tiner) {
        this.tiner = tiner;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkUrun != null ? pkUrun.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stok)) {
            return false;
        }
        Stok other = (Stok) object;
        if ((this.pkUrun == null && other.pkUrun != null) || (this.pkUrun != null && !this.pkUrun.equals(other.pkUrun))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Stok[ pkUrun=" + pkUrun + " ]";
    }
    
}
