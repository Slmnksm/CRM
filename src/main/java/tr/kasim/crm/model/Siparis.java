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
@Table(name = "Siparis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Siparis.findAll", query = "SELECT s FROM Siparis s"),
    @NamedQuery(name = "Siparis.findByPksiparis", query = "SELECT s FROM Siparis s WHERE s.pksiparis = :pksiparis"),
    @NamedQuery(name = "Siparis.findBySiparisno", query = "SELECT s FROM Siparis s WHERE s.siparisno = :siparisno"),
    @NamedQuery(name = "Siparis.findByFkFirma", query = "SELECT s FROM Siparis s WHERE s.fkFirma = :fkFirma"),
    @NamedQuery(name = "Siparis.findByFkYetkili", query = "SELECT s FROM Siparis s WHERE s.fkYetkili = :fkYetkili"),
    @NamedQuery(name = "Siparis.findByFkProjeKod", query = "SELECT s FROM Siparis s WHERE s.fkProjeKod = :fkProjeKod"),
    @NamedQuery(name = "Siparis.findByFkTeklifVeren", query = "SELECT s FROM Siparis s WHERE s.fkTeklifVeren = :fkTeklifVeren"),
    @NamedQuery(name = "Siparis.findByTekliftar", query = "SELECT s FROM Siparis s WHERE s.tekliftar = :tekliftar"),
    @NamedQuery(name = "Siparis.findByGecerliliktar", query = "SELECT s FROM Siparis s WHERE s.gecerliliktar = :gecerliliktar"),
    @NamedQuery(name = "Siparis.findByTeklifaciklama", query = "SELECT s FROM Siparis s WHERE s.teklifaciklama = :teklifaciklama"),
    @NamedQuery(name = "Siparis.findByOpsiyon", query = "SELECT s FROM Siparis s WHERE s.opsiyon = :opsiyon"),
    @NamedQuery(name = "Siparis.findByIssure", query = "SELECT s FROM Siparis s WHERE s.issure = :issure"),
    @NamedQuery(name = "Siparis.findByVadeTar", query = "SELECT s FROM Siparis s WHERE s.vadeTar = :vadeTar"),
    @NamedQuery(name = "Siparis.findByOdemesekli", query = "SELECT s FROM Siparis s WHERE s.odemesekli = :odemesekli"),
    @NamedQuery(name = "Siparis.findByAvans", query = "SELECT s FROM Siparis s WHERE s.avans = :avans"),
    @NamedQuery(name = "Siparis.findByTeslimyeri", query = "SELECT s FROM Siparis s WHERE s.teslimyeri = :teslimyeri"),
    @NamedQuery(name = "Siparis.findByGaratisuresi", query = "SELECT s FROM Siparis s WHERE s.garatisuresi = :garatisuresi"),
    @NamedQuery(name = "Siparis.findByTeklifno", query = "SELECT s FROM Siparis s WHERE s.teklifno = :teklifno"),
    @NamedQuery(name = "Siparis.findByDoviz", query = "SELECT s FROM Siparis s WHERE s.doviz = :doviz"),
    @NamedQuery(name = "Siparis.findByTeslimsekli", query = "SELECT s FROM Siparis s WHERE s.teslimsekli = :teslimsekli"),
    @NamedQuery(name = "Siparis.findByAratoplam", query = "SELECT s FROM Siparis s WHERE s.aratoplam = :aratoplam"),
    @NamedQuery(name = "Siparis.findByKdv", query = "SELECT s FROM Siparis s WHERE s.kdv = :kdv"),
    @NamedQuery(name = "Siparis.findByGenel", query = "SELECT s FROM Siparis s WHERE s.genel = :genel"),
    @NamedQuery(name = "Siparis.findByTutar", query = "SELECT s FROM Siparis s WHERE s.tutar = :tutar"),
    @NamedQuery(name = "Siparis.findByKur", query = "SELECT s FROM Siparis s WHERE s.kur = :kur"),
    @NamedQuery(name = "Siparis.findByEuro", query = "SELECT s FROM Siparis s WHERE s.euro = :euro"),
    @NamedQuery(name = "Siparis.findByDolar", query = "SELECT s FROM Siparis s WHERE s.dolar = :dolar"),
    @NamedQuery(name = "Siparis.findByAvanstarih", query = "SELECT s FROM Siparis s WHERE s.avanstarih = :avanstarih"),
    @NamedQuery(name = "Siparis.findByAvanstutar", query = "SELECT s FROM Siparis s WHERE s.avanstutar = :avanstutar"),
    @NamedQuery(name = "Siparis.findByAvansaciklama", query = "SELECT s FROM Siparis s WHERE s.avansaciklama = :avansaciklama"),
    @NamedQuery(name = "Siparis.findByKdvdahil", query = "SELECT s FROM Siparis s WHERE s.kdvdahil = :kdvdahil"),
    @NamedQuery(name = "Siparis.findByOdeme", query = "SELECT s FROM Siparis s WHERE s.odeme = :odeme"),
    @NamedQuery(name = "Siparis.findByIsad", query = "SELECT s FROM Siparis s WHERE s.isad = :isad"),
    @NamedQuery(name = "Siparis.findByGaranti", query = "SELECT s FROM Siparis s WHERE s.garanti = :garanti"),
    @NamedQuery(name = "Siparis.findByTeslimyer", query = "SELECT s FROM Siparis s WHERE s.teslimyer = :teslimyer"),
    @NamedQuery(name = "Siparis.findByDgrAciklama", query = "SELECT s FROM Siparis s WHERE s.dgrAciklama = :dgrAciklama"),
    @NamedQuery(name = "Siparis.findByToplam", query = "SELECT s FROM Siparis s WHERE s.toplam = :toplam"),
    @NamedQuery(name = "Siparis.findByFattar", query = "SELECT s FROM Siparis s WHERE s.fattar = :fattar"),
    @NamedQuery(name = "Siparis.findByFaturano", query = "SELECT s FROM Siparis s WHERE s.faturano = :faturano"),
    @NamedQuery(name = "Siparis.findByIccephe", query = "SELECT s FROM Siparis s WHERE s.iccephe = :iccephe"),
    @NamedQuery(name = "Siparis.findByDiscephe", query = "SELECT s FROM Siparis s WHERE s.discephe = :discephe"),
    @NamedQuery(name = "Siparis.findByKayiporan", query = "SELECT s FROM Siparis s WHERE s.kayiporan = :kayiporan"),
    @NamedQuery(name = "Siparis.findByIndirimoran", query = "SELECT s FROM Siparis s WHERE s.indirimoran = :indirimoran"),
    @NamedQuery(name = "Siparis.findByMetraj", query = "SELECT s FROM Siparis s WHERE s.metraj = :metraj"),
    @NamedQuery(name = "Siparis.findByKalinlik", query = "SELECT s FROM Siparis s WHERE s.kalinlik = :kalinlik"),
    @NamedQuery(name = "Siparis.findByUzaklik", query = "SELECT s FROM Siparis s WHERE s.uzaklik = :uzaklik"),
    @NamedQuery(name = "Siparis.findByYevmiye", query = "SELECT s FROM Siparis s WHERE s.yevmiye = :yevmiye"),
    @NamedQuery(name = "Siparis.findByKonaklama", query = "SELECT s FROM Siparis s WHERE s.konaklama = :konaklama"),
    @NamedQuery(name = "Siparis.findByUsta", query = "SELECT s FROM Siparis s WHERE s.usta = :usta"),
    @NamedQuery(name = "Siparis.findByYemek", query = "SELECT s FROM Siparis s WHERE s.yemek = :yemek"),
    @NamedQuery(name = "Siparis.findByKacgun", query = "SELECT s FROM Siparis s WHERE s.kacgun = :kacgun"),
    @NamedQuery(name = "Siparis.findByKar", query = "SELECT s FROM Siparis s WHERE s.kar = :kar"),
    @NamedQuery(name = "Siparis.findBySehiruzaklik", query = "SELECT s FROM Siparis s WHERE s.sehiruzaklik = :sehiruzaklik"),
    @NamedQuery(name = "Siparis.findByUstNo", query = "SELECT s FROM Siparis s WHERE s.ustNo = :ustNo"),
    @NamedQuery(name = "Siparis.findByAciklama", query = "SELECT s FROM Siparis s WHERE s.aciklama = :aciklama"),
    @NamedQuery(name = "Siparis.findByVadeGun", query = "SELECT s FROM Siparis s WHERE s.vadeGun = :vadeGun"),
    @NamedQuery(name = "Siparis.findByDurum", query = "SELECT s FROM Siparis s WHERE s.durum = :durum")})
public class Siparis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pksiparis")
    private Integer pksiparis;
    @Column(name = "siparisno")
    private Integer siparisno;
    @Column(name = "fkFirma")
    private Integer fkFirma;
    @Size(max = 50)
    @Column(name = "fkYetkili")
    private String fkYetkili;
    @Column(name = "fkProjeKod")
    private Integer fkProjeKod;
    @Column(name = "fkTeklifVeren")
    private Integer fkTeklifVeren;
    @Column(name = "tekliftar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tekliftar;
    @Column(name = "gecerliliktar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gecerliliktar;
    @Size(max = 50)
    @Column(name = "teklifaciklama")
    private String teklifaciklama;
    @Size(max = 50)
    @Column(name = "opsiyon")
    private String opsiyon;
    @Size(max = 50)
    @Column(name = "issure")
    private String issure;
    @Column(name = "VadeTar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vadeTar;
    @Size(max = 50)
    @Column(name = "odemesekli")
    private String odemesekli;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Avans")
    private BigDecimal avans;
    @Size(max = 50)
    @Column(name = "teslimyeri")
    private String teslimyeri;
    @Size(max = 50)
    @Column(name = "garatisuresi")
    private String garatisuresi;
    @Size(max = 50)
    @Column(name = "teklifno")
    private String teklifno;
    @Size(max = 50)
    @Column(name = "doviz")
    private String doviz;
    @Size(max = 50)
    @Column(name = "teslimsekli")
    private String teslimsekli;
    @Column(name = "aratoplam")
    private BigDecimal aratoplam;
    @Column(name = "kdv")
    private BigDecimal kdv;
    @Column(name = "genel")
    private BigDecimal genel;
    @Column(name = "tutar")
    private BigDecimal tutar;
    @Size(max = 50)
    @Column(name = "kur")
    private String kur;
    @Column(name = "euro")
    private BigDecimal euro;
    @Column(name = "dolar")
    private BigDecimal dolar;
    @Column(name = "avanstarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date avanstarih;
    @Column(name = "avanstutar")
    private BigDecimal avanstutar;
    @Size(max = 250)
    @Column(name = "avansaciklama")
    private String avansaciklama;
    @Size(max = 50)
    @Column(name = "kdvdahil")
    private String kdvdahil;
    @Size(max = 150)
    @Column(name = "odeme")
    private String odeme;
    @Size(max = 250)
    @Column(name = "isad")
    private String isad;
    @Size(max = 50)
    @Column(name = "garanti")
    private String garanti;
    @Size(max = 50)
    @Column(name = "teslimyer")
    private String teslimyer;
    @Size(max = 150)
    @Column(name = "dgrAciklama")
    private String dgrAciklama;
    @Column(name = "Toplam")
    private BigDecimal toplam;
    @Column(name = "fattar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fattar;
    @Size(max = 50)
    @Column(name = "faturano")
    private String faturano;
    @Column(name = "iccephe")
    private BigDecimal iccephe;
    @Column(name = "discephe")
    private BigDecimal discephe;
    @Column(name = "kayiporan")
    private BigDecimal kayiporan;
    @Column(name = "indirimoran")
    private BigDecimal indirimoran;
    @Column(name = "metraj")
    private BigDecimal metraj;
    @Column(name = "kalinlik")
    private BigDecimal kalinlik;
    @Column(name = "uzaklik")
    private BigDecimal uzaklik;
    @Column(name = "yevmiye")
    private BigDecimal yevmiye;
    @Column(name = "konaklama")
    private BigDecimal konaklama;
    @Column(name = "usta")
    private BigDecimal usta;
    @Column(name = "yemek")
    private BigDecimal yemek;
    @Column(name = "kacgun")
    private BigDecimal kacgun;
    @Column(name = "kar")
    private BigDecimal kar;
    @Column(name = "sehiruzaklik")
    private BigDecimal sehiruzaklik;
    @Column(name = "UstNo")
    private Integer ustNo;
    @Size(max = 250)
    @Column(name = "Aciklama")
    private String aciklama;
    @Column(name = "VadeGun")
    private Integer vadeGun;
    @Size(max = 50)
    @Column(name = "Durum")
    private String durum;

    public Siparis() {
    }

    public Siparis(Integer pksiparis) {
        this.pksiparis = pksiparis;
    }

    public Integer getPksiparis() {
        return pksiparis;
    }

    public void setPksiparis(Integer pksiparis) {
        this.pksiparis = pksiparis;
    }

    public Integer getSiparisno() {
        return siparisno;
    }

    public void setSiparisno(Integer siparisno) {
        this.siparisno = siparisno;
    }

    public Integer getFkFirma() {
        return fkFirma;
    }

    public void setFkFirma(Integer fkFirma) {
        this.fkFirma = fkFirma;
    }

    public String getFkYetkili() {
        return fkYetkili;
    }

    public void setFkYetkili(String fkYetkili) {
        this.fkYetkili = fkYetkili;
    }

    public Integer getFkProjeKod() {
        return fkProjeKod;
    }

    public void setFkProjeKod(Integer fkProjeKod) {
        this.fkProjeKod = fkProjeKod;
    }

    public Integer getFkTeklifVeren() {
        return fkTeklifVeren;
    }

    public void setFkTeklifVeren(Integer fkTeklifVeren) {
        this.fkTeklifVeren = fkTeklifVeren;
    }

    public Date getTekliftar() {
        return tekliftar;
    }

    public void setTekliftar(Date tekliftar) {
        this.tekliftar = tekliftar;
    }

    public Date getGecerliliktar() {
        return gecerliliktar;
    }

    public void setGecerliliktar(Date gecerliliktar) {
        this.gecerliliktar = gecerliliktar;
    }

    public String getTeklifaciklama() {
        return teklifaciklama;
    }

    public void setTeklifaciklama(String teklifaciklama) {
        this.teklifaciklama = teklifaciklama;
    }

    public String getOpsiyon() {
        return opsiyon;
    }

    public void setOpsiyon(String opsiyon) {
        this.opsiyon = opsiyon;
    }

    public String getIssure() {
        return issure;
    }

    public void setIssure(String issure) {
        this.issure = issure;
    }

    public Date getVadeTar() {
        return vadeTar;
    }

    public void setVadeTar(Date vadeTar) {
        this.vadeTar = vadeTar;
    }

    public String getOdemesekli() {
        return odemesekli;
    }

    public void setOdemesekli(String odemesekli) {
        this.odemesekli = odemesekli;
    }

    public BigDecimal getAvans() {
        return avans;
    }

    public void setAvans(BigDecimal avans) {
        this.avans = avans;
    }

    public String getTeslimyeri() {
        return teslimyeri;
    }

    public void setTeslimyeri(String teslimyeri) {
        this.teslimyeri = teslimyeri;
    }

    public String getGaratisuresi() {
        return garatisuresi;
    }

    public void setGaratisuresi(String garatisuresi) {
        this.garatisuresi = garatisuresi;
    }

    public String getTeklifno() {
        return teklifno;
    }

    public void setTeklifno(String teklifno) {
        this.teklifno = teklifno;
    }

    public String getDoviz() {
        return doviz;
    }

    public void setDoviz(String doviz) {
        this.doviz = doviz;
    }

    public String getTeslimsekli() {
        return teslimsekli;
    }

    public void setTeslimsekli(String teslimsekli) {
        this.teslimsekli = teslimsekli;
    }

    public BigDecimal getAratoplam() {
        return aratoplam;
    }

    public void setAratoplam(BigDecimal aratoplam) {
        this.aratoplam = aratoplam;
    }

    public BigDecimal getKdv() {
        return kdv;
    }

    public void setKdv(BigDecimal kdv) {
        this.kdv = kdv;
    }

    public BigDecimal getGenel() {
        return genel;
    }

    public void setGenel(BigDecimal genel) {
        this.genel = genel;
    }

    public BigDecimal getTutar() {
        return tutar;
    }

    public void setTutar(BigDecimal tutar) {
        this.tutar = tutar;
    }

    public String getKur() {
        return kur;
    }

    public void setKur(String kur) {
        this.kur = kur;
    }

    public BigDecimal getEuro() {
        return euro;
    }

    public void setEuro(BigDecimal euro) {
        this.euro = euro;
    }

    public BigDecimal getDolar() {
        return dolar;
    }

    public void setDolar(BigDecimal dolar) {
        this.dolar = dolar;
    }

    public Date getAvanstarih() {
        return avanstarih;
    }

    public void setAvanstarih(Date avanstarih) {
        this.avanstarih = avanstarih;
    }

    public BigDecimal getAvanstutar() {
        return avanstutar;
    }

    public void setAvanstutar(BigDecimal avanstutar) {
        this.avanstutar = avanstutar;
    }

    public String getAvansaciklama() {
        return avansaciklama;
    }

    public void setAvansaciklama(String avansaciklama) {
        this.avansaciklama = avansaciklama;
    }

    public String getKdvdahil() {
        return kdvdahil;
    }

    public void setKdvdahil(String kdvdahil) {
        this.kdvdahil = kdvdahil;
    }

    public String getOdeme() {
        return odeme;
    }

    public void setOdeme(String odeme) {
        this.odeme = odeme;
    }

    public String getIsad() {
        return isad;
    }

    public void setIsad(String isad) {
        this.isad = isad;
    }

    public String getGaranti() {
        return garanti;
    }

    public void setGaranti(String garanti) {
        this.garanti = garanti;
    }

    public String getTeslimyer() {
        return teslimyer;
    }

    public void setTeslimyer(String teslimyer) {
        this.teslimyer = teslimyer;
    }

    public String getDgrAciklama() {
        return dgrAciklama;
    }

    public void setDgrAciklama(String dgrAciklama) {
        this.dgrAciklama = dgrAciklama;
    }

    public BigDecimal getToplam() {
        return toplam;
    }

    public void setToplam(BigDecimal toplam) {
        this.toplam = toplam;
    }

    public Date getFattar() {
        return fattar;
    }

    public void setFattar(Date fattar) {
        this.fattar = fattar;
    }

    public String getFaturano() {
        return faturano;
    }

    public void setFaturano(String faturano) {
        this.faturano = faturano;
    }

    public BigDecimal getIccephe() {
        return iccephe;
    }

    public void setIccephe(BigDecimal iccephe) {
        this.iccephe = iccephe;
    }

    public BigDecimal getDiscephe() {
        return discephe;
    }

    public void setDiscephe(BigDecimal discephe) {
        this.discephe = discephe;
    }

    public BigDecimal getKayiporan() {
        return kayiporan;
    }

    public void setKayiporan(BigDecimal kayiporan) {
        this.kayiporan = kayiporan;
    }

    public BigDecimal getIndirimoran() {
        return indirimoran;
    }

    public void setIndirimoran(BigDecimal indirimoran) {
        this.indirimoran = indirimoran;
    }

    public BigDecimal getMetraj() {
        return metraj;
    }

    public void setMetraj(BigDecimal metraj) {
        this.metraj = metraj;
    }

    public BigDecimal getKalinlik() {
        return kalinlik;
    }

    public void setKalinlik(BigDecimal kalinlik) {
        this.kalinlik = kalinlik;
    }

    public BigDecimal getUzaklik() {
        return uzaklik;
    }

    public void setUzaklik(BigDecimal uzaklik) {
        this.uzaklik = uzaklik;
    }

    public BigDecimal getYevmiye() {
        return yevmiye;
    }

    public void setYevmiye(BigDecimal yevmiye) {
        this.yevmiye = yevmiye;
    }

    public BigDecimal getKonaklama() {
        return konaklama;
    }

    public void setKonaklama(BigDecimal konaklama) {
        this.konaklama = konaklama;
    }

    public BigDecimal getUsta() {
        return usta;
    }

    public void setUsta(BigDecimal usta) {
        this.usta = usta;
    }

    public BigDecimal getYemek() {
        return yemek;
    }

    public void setYemek(BigDecimal yemek) {
        this.yemek = yemek;
    }

    public BigDecimal getKacgun() {
        return kacgun;
    }

    public void setKacgun(BigDecimal kacgun) {
        this.kacgun = kacgun;
    }

    public BigDecimal getKar() {
        return kar;
    }

    public void setKar(BigDecimal kar) {
        this.kar = kar;
    }

    public BigDecimal getSehiruzaklik() {
        return sehiruzaklik;
    }

    public void setSehiruzaklik(BigDecimal sehiruzaklik) {
        this.sehiruzaklik = sehiruzaklik;
    }

    public Integer getUstNo() {
        return ustNo;
    }

    public void setUstNo(Integer ustNo) {
        this.ustNo = ustNo;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Integer getVadeGun() {
        return vadeGun;
    }

    public void setVadeGun(Integer vadeGun) {
        this.vadeGun = vadeGun;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pksiparis != null ? pksiparis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Siparis)) {
            return false;
        }
        Siparis other = (Siparis) object;
        if ((this.pksiparis == null && other.pksiparis != null) || (this.pksiparis != null && !this.pksiparis.equals(other.pksiparis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Siparis[ pksiparis=" + pksiparis + " ]";
    }
    
}
