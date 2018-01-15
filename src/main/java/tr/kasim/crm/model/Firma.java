/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "Firma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Firma.findAll", query = "SELECT f FROM Firma f"),
    @NamedQuery(name = "Firma.findByPkFirma", query = "SELECT f FROM Firma f WHERE f.pkFirma = :pkFirma"),
    @NamedQuery(name = "Firma.findByUstNo", query = "SELECT f FROM Firma f WHERE f.ustNo = :ustNo"),
    @NamedQuery(name = "Firma.findByFirmaAd", query = "SELECT f FROM Firma f WHERE f.firmaAd = :firmaAd"),
    @NamedQuery(name = "Firma.findByFirmaKod", query = "SELECT f FROM Firma f WHERE f.firmaKod = :firmaKod"),
    @NamedQuery(name = "Firma.findByYetkili", query = "SELECT f FROM Firma f WHERE f.yetkili = :yetkili"),
    @NamedQuery(name = "Firma.findByYetkiliCep", query = "SELECT f FROM Firma f WHERE f.yetkiliCep = :yetkiliCep"),
    @NamedQuery(name = "Firma.findByAdres", query = "SELECT f FROM Firma f WHERE f.adres = :adres"),
    @NamedQuery(name = "Firma.findByTel1", query = "SELECT f FROM Firma f WHERE f.tel1 = :tel1"),
    @NamedQuery(name = "Firma.findByTel2", query = "SELECT f FROM Firma f WHERE f.tel2 = :tel2"),
    @NamedQuery(name = "Firma.findByFax", query = "SELECT f FROM Firma f WHERE f.fax = :fax"),
    @NamedQuery(name = "Firma.findByFirmaTip", query = "SELECT f FROM Firma f WHERE f.firmaTip = :firmaTip"),
    @NamedQuery(name = "Firma.findByVergiD", query = "SELECT f FROM Firma f WHERE f.vergiD = :vergiD"),
    @NamedQuery(name = "Firma.findByVergiNo", query = "SELECT f FROM Firma f WHERE f.vergiNo = :vergiNo"),
    @NamedQuery(name = "Firma.findByEposta", query = "SELECT f FROM Firma f WHERE f.eposta = :eposta"),
    @NamedQuery(name = "Firma.findByWebAdres", query = "SELECT f FROM Firma f WHERE f.webAdres = :webAdres"),
    @NamedQuery(name = "Firma.findByMuhHesap", query = "SELECT f FROM Firma f WHERE f.muhHesap = :muhHesap"),
    @NamedQuery(name = "Firma.findByNotlar", query = "SELECT f FROM Firma f WHERE f.notlar = :notlar"),
    @NamedQuery(name = "Firma.findByAciklama", query = "SELECT f FROM Firma f WHERE f.aciklama = :aciklama"),
    @NamedQuery(name = "Firma.findByKaraListe", query = "SELECT f FROM Firma f WHERE f.karaListe = :karaListe"),
    @NamedQuery(name = "Firma.findByVipFirma", query = "SELECT f FROM Firma f WHERE f.vipFirma = :vipFirma"),
    @NamedQuery(name = "Firma.findByIskonto", query = "SELECT f FROM Firma f WHERE f.iskonto = :iskonto"),
    @NamedQuery(name = "Firma.findByGuncelleme", query = "SELECT f FROM Firma f WHERE f.guncelleme = :guncelleme"),
    @NamedQuery(name = "Firma.findByKullanici", query = "SELECT f FROM Firma f WHERE f.kullanici = :kullanici"),
    @NamedQuery(name = "Firma.findBySilZaman", query = "SELECT f FROM Firma f WHERE f.silZaman = :silZaman"),
    @NamedQuery(name = "Firma.findBySilKullanici", query = "SELECT f FROM Firma f WHERE f.silKullanici = :silKullanici"),
    @NamedQuery(name = "Firma.findBySil", query = "SELECT f FROM Firma f WHERE f.sil = :sil"),
    @NamedQuery(name = "Firma.findByTur", query = "SELECT f FROM Firma f WHERE f.tur = :tur"),
    @NamedQuery(name = "Firma.findByKisaad", query = "SELECT f FROM Firma f WHERE f.kisaad = :kisaad"),
    @NamedQuery(name = "Firma.findByTip", query = "SELECT f FROM Firma f WHERE f.tip = :tip"),
    @NamedQuery(name = "Firma.findByBanka", query = "SELECT f FROM Firma f WHERE f.banka = :banka"),
    @NamedQuery(name = "Firma.findBySube", query = "SELECT f FROM Firma f WHERE f.sube = :sube"),
    @NamedQuery(name = "Firma.findBySubekod", query = "SELECT f FROM Firma f WHERE f.subekod = :subekod"),
    @NamedQuery(name = "Firma.findByIban", query = "SELECT f FROM Firma f WHERE f.iban = :iban"),
    @NamedQuery(name = "Firma.findByFirmaTur", query = "SELECT f FROM Firma f WHERE f.firmaTur = :firmaTur"),
    @NamedQuery(name = "Firma.findBySadakatDurum", query = "SELECT f FROM Firma f WHERE f.sadakatDurum = :sadakatDurum"),
    @NamedQuery(name = "Firma.findByCiroDurum", query = "SELECT f FROM Firma f WHERE f.ciroDurum = :ciroDurum"),
    @NamedQuery(name = "Firma.findByAdayDurum", query = "SELECT f FROM Firma f WHERE f.adayDurum = :adayDurum"),
    @NamedQuery(name = "Firma.findByAciklamaNot", query = "SELECT f FROM Firma f WHERE f.aciklamaNot = :aciklamaNot"),
    @NamedQuery(name = "Firma.findByAdayMusteri", query = "SELECT f FROM Firma f WHERE f.adayMusteri = :adayMusteri"),
    @NamedQuery(name = "Firma.findByDeko", query = "SELECT f FROM Firma f WHERE f.deko = :deko"),
    @NamedQuery(name = "Firma.findByEndu", query = "SELECT f FROM Firma f WHERE f.endu = :endu"),
    @NamedQuery(name = "Firma.findByUyg", query = "SELECT f FROM Firma f WHERE f.uyg = :uyg"),
    @NamedQuery(name = "Firma.findByIndirim", query = "SELECT f FROM Firma f WHERE f.indirim = :indirim")})
public class Firma implements Serializable {

    @OneToMany(mappedBy = "fkFirma", fetch = FetchType.LAZY)
    private Collection<Firsat> firsatCollection;

    @OneToMany(mappedBy = "fkFirma", fetch = FetchType.LAZY)
    private Collection<Gorusme> gorusmeCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkFirma")
    private Integer pkFirma;
    @Column(name = "UstNo")
    private Integer ustNo;
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
    @Size(max = 50)
    @Column(name = "FirmaTur")
    private String firmaTur;
    @Size(max = 50)
    @Column(name = "SadakatDurum")
    private String sadakatDurum;
    @Size(max = 50)
    @Column(name = "CiroDurum")
    private String ciroDurum;
    @Size(max = 50)
    @Column(name = "AdayDurum")
    private String adayDurum;
    @Size(max = 250)
    @Column(name = "AciklamaNot")
    private String aciklamaNot;
    @Column(name = "AdayMusteri")
    private Boolean adayMusteri;
    @Column(name = "Deko")
    private Boolean deko;
    @Column(name = "Endu")
    private Boolean endu;
    @Column(name = "Uyg")
    private Boolean uyg;
    @Column(name = "indirim")
    private Integer indirim;
    @JoinColumn(name = "fkTemsilci", referencedColumnName = "pkPersonel")
    @ManyToOne(fetch = FetchType.LAZY)
    private PersonelKart fkTemsilci;
    @JoinColumn(name = "fkSistemKullanici", referencedColumnName = "pkKullanici")
    @ManyToOne(fetch = FetchType.LAZY)
    private SistemKullanici fkSistemKullanici;
    @JoinColumn(name = "Il", referencedColumnName = "KayitNo")
    @ManyToOne(fetch = FetchType.LAZY)
    private Til il;
    @JoinColumn(name = "Ilce", referencedColumnName = "KayitNo")
    @ManyToOne(fetch = FetchType.LAZY)
    private Tilce ilce;

    public Firma() {
    }

    public Firma(Integer pkFirma) {
        this.pkFirma = pkFirma;
    }

    public Integer getPkFirma() {
        return pkFirma;
    }

    public void setPkFirma(Integer pkFirma) {
        this.pkFirma = pkFirma;
    }

    public Integer getUstNo() {
        return ustNo;
    }

    public void setUstNo(Integer ustNo) {
        this.ustNo = ustNo;
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

    public String getFirmaTur() {
        return firmaTur;
    }

    public void setFirmaTur(String firmaTur) {
        this.firmaTur = firmaTur;
    }

    public String getSadakatDurum() {
        return sadakatDurum;
    }

    public void setSadakatDurum(String sadakatDurum) {
        this.sadakatDurum = sadakatDurum;
    }

    public String getCiroDurum() {
        return ciroDurum;
    }

    public void setCiroDurum(String ciroDurum) {
        this.ciroDurum = ciroDurum;
    }

    public String getAdayDurum() {
        return adayDurum;
    }

    public void setAdayDurum(String adayDurum) {
        this.adayDurum = adayDurum;
    }

    public String getAciklamaNot() {
        return aciklamaNot;
    }

    public void setAciklamaNot(String aciklamaNot) {
        this.aciklamaNot = aciklamaNot;
    }

    public Boolean getAdayMusteri() {
        return adayMusteri;
    }

    public void setAdayMusteri(Boolean adayMusteri) {
        this.adayMusteri = adayMusteri;
    }

    public Boolean getDeko() {
        return deko;
    }

    public void setDeko(Boolean deko) {
        this.deko = deko;
    }

    public Boolean getEndu() {
        return endu;
    }

    public void setEndu(Boolean endu) {
        this.endu = endu;
    }

    public Boolean getUyg() {
        return uyg;
    }

    public void setUyg(Boolean uyg) {
        this.uyg = uyg;
    }

    public Integer getIndirim() {
        return indirim;
    }

    public void setIndirim(Integer indirim) {
        this.indirim = indirim;
    }

    public PersonelKart getFkTemsilci() {
        return fkTemsilci;
    }

    public void setFkTemsilci(PersonelKart fkTemsilci) {
        this.fkTemsilci = fkTemsilci;
    }

    public SistemKullanici getFkSistemKullanici() {
        return fkSistemKullanici;
    }

    public void setFkSistemKullanici(SistemKullanici fkSistemKullanici) {
        this.fkSistemKullanici = fkSistemKullanici;
    }

    public Til getIl() {
        return il;
    }

    public void setIl(Til il) {
        this.il = il;
    }

    public Tilce getIlce() {
        return ilce;
    }

    public void setIlce(Tilce ilce) {
        this.ilce = ilce;
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
        if (!(object instanceof Firma)) {
            return false;
        }
        Firma other = (Firma) object;
        if ((this.pkFirma == null && other.pkFirma != null) || (this.pkFirma != null && !this.pkFirma.equals(other.pkFirma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Firma[ pkFirma=" + pkFirma + " ]";
    }

    @XmlTransient
    public Collection<Gorusme> getGorusmeCollection() {
        return gorusmeCollection;
    }

    public void setGorusmeCollection(Collection<Gorusme> gorusmeCollection) {
        this.gorusmeCollection = gorusmeCollection;
    }

    @XmlTransient
    public Collection<Firsat> getFirsatCollection() {
        return firsatCollection;
    }

    public void setFirsatCollection(Collection<Firsat> firsatCollection) {
        this.firsatCollection = firsatCollection;
    }
    
}
