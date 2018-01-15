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
@Table(name = "Taseron")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Taseron.findAll", query = "SELECT t FROM Taseron t"),
    @NamedQuery(name = "Taseron.findByPkFirma", query = "SELECT t FROM Taseron t WHERE t.pkFirma = :pkFirma"),
    @NamedQuery(name = "Taseron.findByFirmaAd", query = "SELECT t FROM Taseron t WHERE t.firmaAd = :firmaAd"),
    @NamedQuery(name = "Taseron.findByFirmaKod", query = "SELECT t FROM Taseron t WHERE t.firmaKod = :firmaKod"),
    @NamedQuery(name = "Taseron.findByYetkili", query = "SELECT t FROM Taseron t WHERE t.yetkili = :yetkili"),
    @NamedQuery(name = "Taseron.findByYetkiliCep", query = "SELECT t FROM Taseron t WHERE t.yetkiliCep = :yetkiliCep"),
    @NamedQuery(name = "Taseron.findByAdres", query = "SELECT t FROM Taseron t WHERE t.adres = :adres"),
    @NamedQuery(name = "Taseron.findByTel1", query = "SELECT t FROM Taseron t WHERE t.tel1 = :tel1"),
    @NamedQuery(name = "Taseron.findByTel2", query = "SELECT t FROM Taseron t WHERE t.tel2 = :tel2"),
    @NamedQuery(name = "Taseron.findByFax", query = "SELECT t FROM Taseron t WHERE t.fax = :fax"),
    @NamedQuery(name = "Taseron.findByFirmaTip", query = "SELECT t FROM Taseron t WHERE t.firmaTip = :firmaTip"),
    @NamedQuery(name = "Taseron.findByVergiD", query = "SELECT t FROM Taseron t WHERE t.vergiD = :vergiD"),
    @NamedQuery(name = "Taseron.findByVergiNo", query = "SELECT t FROM Taseron t WHERE t.vergiNo = :vergiNo"),
    @NamedQuery(name = "Taseron.findByEposta", query = "SELECT t FROM Taseron t WHERE t.eposta = :eposta"),
    @NamedQuery(name = "Taseron.findByWebAdres", query = "SELECT t FROM Taseron t WHERE t.webAdres = :webAdres"),
    @NamedQuery(name = "Taseron.findByMuhHesap", query = "SELECT t FROM Taseron t WHERE t.muhHesap = :muhHesap"),
    @NamedQuery(name = "Taseron.findByIl", query = "SELECT t FROM Taseron t WHERE t.il = :il"),
    @NamedQuery(name = "Taseron.findByIlce", query = "SELECT t FROM Taseron t WHERE t.ilce = :ilce"),
    @NamedQuery(name = "Taseron.findByNotlar", query = "SELECT t FROM Taseron t WHERE t.notlar = :notlar"),
    @NamedQuery(name = "Taseron.findByAciklama", query = "SELECT t FROM Taseron t WHERE t.aciklama = :aciklama"),
    @NamedQuery(name = "Taseron.findByKaraListe", query = "SELECT t FROM Taseron t WHERE t.karaListe = :karaListe"),
    @NamedQuery(name = "Taseron.findByVipFirma", query = "SELECT t FROM Taseron t WHERE t.vipFirma = :vipFirma"),
    @NamedQuery(name = "Taseron.findByIskonto", query = "SELECT t FROM Taseron t WHERE t.iskonto = :iskonto"),
    @NamedQuery(name = "Taseron.findByGuncelleme", query = "SELECT t FROM Taseron t WHERE t.guncelleme = :guncelleme"),
    @NamedQuery(name = "Taseron.findByKullanici", query = "SELECT t FROM Taseron t WHERE t.kullanici = :kullanici"),
    @NamedQuery(name = "Taseron.findBySilZaman", query = "SELECT t FROM Taseron t WHERE t.silZaman = :silZaman"),
    @NamedQuery(name = "Taseron.findBySilKullanici", query = "SELECT t FROM Taseron t WHERE t.silKullanici = :silKullanici"),
    @NamedQuery(name = "Taseron.findBySil", query = "SELECT t FROM Taseron t WHERE t.sil = :sil"),
    @NamedQuery(name = "Taseron.findByTur", query = "SELECT t FROM Taseron t WHERE t.tur = :tur"),
    @NamedQuery(name = "Taseron.findByKisaad", query = "SELECT t FROM Taseron t WHERE t.kisaad = :kisaad"),
    @NamedQuery(name = "Taseron.findByTip", query = "SELECT t FROM Taseron t WHERE t.tip = :tip"),
    @NamedQuery(name = "Taseron.findByBanka", query = "SELECT t FROM Taseron t WHERE t.banka = :banka"),
    @NamedQuery(name = "Taseron.findBySube", query = "SELECT t FROM Taseron t WHERE t.sube = :sube"),
    @NamedQuery(name = "Taseron.findBySubekod", query = "SELECT t FROM Taseron t WHERE t.subekod = :subekod"),
    @NamedQuery(name = "Taseron.findByIban", query = "SELECT t FROM Taseron t WHERE t.iban = :iban")})
public class Taseron implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkFirma")
    private Integer pkFirma;
    @Size(max = 150)
    @Column(name = "FirmaAd")
    private String firmaAd;
    @Size(max = 50)
    @Column(name = "FirmaKod")
    private String firmaKod;
    @Size(max = 50)
    @Column(name = "Yetkili")
    private String yetkili;
    @Size(max = 15)
    @Column(name = "YetkiliCep")
    private String yetkiliCep;
    @Size(max = 250)
    @Column(name = "Adres")
    private String adres;
    @Size(max = 15)
    @Column(name = "Tel1")
    private String tel1;
    @Size(max = 15)
    @Column(name = "Tel2")
    private String tel2;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 15)
    @Column(name = "Fax")
    private String fax;
    @Size(max = 50)
    @Column(name = "FirmaTip")
    private String firmaTip;
    @Size(max = 50)
    @Column(name = "VergiD")
    private String vergiD;
    @Size(max = 15)
    @Column(name = "VergiNo")
    private String vergiNo;
    @Size(max = 50)
    @Column(name = "Eposta")
    private String eposta;
    @Size(max = 50)
    @Column(name = "WebAdres")
    private String webAdres;
    @Size(max = 50)
    @Column(name = "MuhHesap")
    private String muhHesap;
    @Size(max = 50)
    @Column(name = "Il")
    private String il;
    @Size(max = 50)
    @Column(name = "Ilce")
    private String ilce;
    @Size(max = 150)
    @Column(name = "Notlar")
    private String notlar;
    @Size(max = 250)
    @Column(name = "Aciklama")
    private String aciklama;
    @Column(name = "KaraListe")
    private Boolean karaListe;
    @Column(name = "VipFirma")
    private Boolean vipFirma;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Iskonto")
    private BigDecimal iskonto;
    @Column(name = "Guncelleme")
    @Temporal(TemporalType.TIMESTAMP)
    private Date guncelleme;
    @Column(name = "Kullanici")
    private Integer kullanici;
    @Column(name = "SilZaman")
    @Temporal(TemporalType.TIMESTAMP)
    private Date silZaman;
    @Column(name = "SilKullanici")
    private Integer silKullanici;
    @Column(name = "Sil")
    private Boolean sil;
    @Size(max = 50)
    @Column(name = "tur")
    private String tur;
    @Size(max = 50)
    @Column(name = "kisaad")
    private String kisaad;
    @Column(name = "tip")
    private Short tip;
    @Size(max = 100)
    @Column(name = "banka")
    private String banka;
    @Size(max = 50)
    @Column(name = "sube")
    private String sube;
    @Size(max = 50)
    @Column(name = "subekod")
    private String subekod;
    @Size(max = 50)
    @Column(name = "IBAN")
    private String iban;

    public Taseron() {
    }

    public Taseron(Integer pkFirma) {
        this.pkFirma = pkFirma;
    }

    public Integer getPkFirma() {
        return pkFirma;
    }

    public void setPkFirma(Integer pkFirma) {
        this.pkFirma = pkFirma;
    }

    public String getFirmaAd() {
        return firmaAd;
    }

    public void setFirmaAd(String firmaAd) {
        this.firmaAd = firmaAd;
    }

    public String getFirmaKod() {
        return firmaKod;
    }

    public void setFirmaKod(String firmaKod) {
        this.firmaKod = firmaKod;
    }

    public String getYetkili() {
        return yetkili;
    }

    public void setYetkili(String yetkili) {
        this.yetkili = yetkili;
    }

    public String getYetkiliCep() {
        return yetkiliCep;
    }

    public void setYetkiliCep(String yetkiliCep) {
        this.yetkiliCep = yetkiliCep;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getFirmaTip() {
        return firmaTip;
    }

    public void setFirmaTip(String firmaTip) {
        this.firmaTip = firmaTip;
    }

    public String getVergiD() {
        return vergiD;
    }

    public void setVergiD(String vergiD) {
        this.vergiD = vergiD;
    }

    public String getVergiNo() {
        return vergiNo;
    }

    public void setVergiNo(String vergiNo) {
        this.vergiNo = vergiNo;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getWebAdres() {
        return webAdres;
    }

    public void setWebAdres(String webAdres) {
        this.webAdres = webAdres;
    }

    public String getMuhHesap() {
        return muhHesap;
    }

    public void setMuhHesap(String muhHesap) {
        this.muhHesap = muhHesap;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getNotlar() {
        return notlar;
    }

    public void setNotlar(String notlar) {
        this.notlar = notlar;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Boolean getKaraListe() {
        return karaListe;
    }

    public void setKaraListe(Boolean karaListe) {
        this.karaListe = karaListe;
    }

    public Boolean getVipFirma() {
        return vipFirma;
    }

    public void setVipFirma(Boolean vipFirma) {
        this.vipFirma = vipFirma;
    }

    public BigDecimal getIskonto() {
        return iskonto;
    }

    public void setIskonto(BigDecimal iskonto) {
        this.iskonto = iskonto;
    }

    public Date getGuncelleme() {
        return guncelleme;
    }

    public void setGuncelleme(Date guncelleme) {
        this.guncelleme = guncelleme;
    }

    public Integer getKullanici() {
        return kullanici;
    }

    public void setKullanici(Integer kullanici) {
        this.kullanici = kullanici;
    }

    public Date getSilZaman() {
        return silZaman;
    }

    public void setSilZaman(Date silZaman) {
        this.silZaman = silZaman;
    }

    public Integer getSilKullanici() {
        return silKullanici;
    }

    public void setSilKullanici(Integer silKullanici) {
        this.silKullanici = silKullanici;
    }

    public Boolean getSil() {
        return sil;
    }

    public void setSil(Boolean sil) {
        this.sil = sil;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getKisaad() {
        return kisaad;
    }

    public void setKisaad(String kisaad) {
        this.kisaad = kisaad;
    }

    public Short getTip() {
        return tip;
    }

    public void setTip(Short tip) {
        this.tip = tip;
    }

    public String getBanka() {
        return banka;
    }

    public void setBanka(String banka) {
        this.banka = banka;
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }

    public String getSubekod() {
        return subekod;
    }

    public void setSubekod(String subekod) {
        this.subekod = subekod;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkFirma != null ? pkFirma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Taseron)) {
            return false;
        }
        Taseron other = (Taseron) object;
        if ((this.pkFirma == null && other.pkFirma != null) || (this.pkFirma != null && !this.pkFirma.equals(other.pkFirma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Taseron[ pkFirma=" + pkFirma + " ]";
    }
    
}
