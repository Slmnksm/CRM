/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
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
@Table(name = "Gorusme")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gorusme.findAll", query = "SELECT g FROM Gorusme g"),
    @NamedQuery(name = "Gorusme.findByPkGorusme", query = "SELECT g FROM Gorusme g WHERE g.pkGorusme = :pkGorusme"),
    @NamedQuery(name = "Gorusme.findByFkpazarlama", query = "SELECT g FROM Gorusme g WHERE g.fkpazarlama = :fkpazarlama"),
    @NamedQuery(name = "Gorusme.findByTarih", query = "SELECT g FROM Gorusme g WHERE g.tarih = :tarih"),
    @NamedQuery(name = "Gorusme.findByGorusulenKisi", query = "SELECT g FROM Gorusme g WHERE g.gorusulenKisi = :gorusulenKisi"),
    @NamedQuery(name = "Gorusme.findByGorev", query = "SELECT g FROM Gorusme g WHERE g.gorev = :gorev"),
    @NamedQuery(name = "Gorusme.findByGorusen", query = "SELECT g FROM Gorusme g WHERE g.gorusen = :gorusen"),
    @NamedQuery(name = "Gorusme.findByEtkisi", query = "SELECT g FROM Gorusme g WHERE g.etkisi = :etkisi"),
    @NamedQuery(name = "Gorusme.findByIsinTanimi", query = "SELECT g FROM Gorusme g WHERE g.isinTanimi = :isinTanimi"),
    @NamedQuery(name = "Gorusme.findByIsinNotu", query = "SELECT g FROM Gorusme g WHERE g.isinNotu = :isinNotu"),
    @NamedQuery(name = "Gorusme.findBySonuc", query = "SELECT g FROM Gorusme g WHERE g.sonuc = :sonuc"),
    @NamedQuery(name = "Gorusme.findByTeklifDurumu", query = "SELECT g FROM Gorusme g WHERE g.teklifDurumu = :teklifDurumu"),
    @NamedQuery(name = "Gorusme.findByKatilimci", query = "SELECT g FROM Gorusme g WHERE g.katilimci = :katilimci"),
    @NamedQuery(name = "Gorusme.findByProje", query = "SELECT g FROM Gorusme g WHERE g.proje = :proje"),
    @NamedQuery(name = "Gorusme.findByGorusmeTip", query = "SELECT g FROM Gorusme g WHERE g.gorusmeTip = :gorusmeTip"),
    @NamedQuery(name = "Gorusme.findByYorum", query = "SELECT g FROM Gorusme g WHERE g.yorum = :yorum"),
    @NamedQuery(name = "Gorusme.findByVerimli", query = "SELECT g FROM Gorusme g WHERE g.verimli = :verimli"),
    @NamedQuery(name = "Gorusme.findByFirmaKatilim", query = "SELECT g FROM Gorusme g WHERE g.firmaKatilim = :firmaKatilim"),
    @NamedQuery(name = "Gorusme.findByKayitTar", query = "SELECT g FROM Gorusme g WHERE g.kayitTar = :kayitTar")})
public class Gorusme implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkGorusme")
    private Integer pkGorusme;
    @Column(name = "fkpazarlama")
    private Integer fkpazarlama;
    @Column(name = "tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    @Size(max = 50)
    @Column(name = "GorusulenKisi")
    private String gorusulenKisi;
    @Size(max = 50)
    @Column(name = "Gorev")
    private String gorev;
    @Size(max = 50)
    @Column(name = "Gorusen")
    private String gorusen;
    @Size(max = 50)
    @Column(name = "Etkisi")
    private String etkisi;
    @Size(max = 50)
    @Column(name = "isinTanimi")
    private String isinTanimi;
    @Size(max = 1073741823)
    @Column(name = "isinNotu")
    private String isinNotu;
    @Size(max = 50)
    @Column(name = "Sonuc")
    private String sonuc;
    @Size(max = 50)
    @Column(name = "TeklifDurumu")
    private String teklifDurumu;
    @Size(max = 50)
    @Column(name = "Katilimci")
    private String katilimci;
    @Size(max = 50)
    @Column(name = "proje")
    private String proje;
    @Size(max = 50)
    @Column(name = "GorusmeTip")
    private String gorusmeTip;
    @Size(max = 50)
    @Column(name = "Yorum")
    private String yorum;
    @Column(name = "Verimli")
    private Boolean verimli;
    @Size(max = 250)
    @Column(name = "FirmaKatilim")
    private String firmaKatilim;
    @Column(name = "KayitTar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kayitTar;
    @JoinColumn(name = "fkFirma", referencedColumnName = "pkFirma")
    @ManyToOne(fetch = FetchType.LAZY)
    private Firma fkFirma;
    @JoinColumn(name = "fkFirmaYetkili", referencedColumnName = "pkyetkililer")
    @ManyToOne(fetch = FetchType.LAZY)
    private FirmaYetkili fkFirmaYetkili;
    @JoinColumn(name = "fkKatilimci", referencedColumnName = "pkPersonel")
    @ManyToOne(fetch = FetchType.LAZY)
    private PersonelKart fkKatilimci;
    @JoinColumn(name = "fkProjeProje", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ProjeDetay fkProjeProje;

    public Gorusme() {
    }

    public Gorusme(Integer pkGorusme) {
        this.pkGorusme = pkGorusme;
    }

    public Integer getPkGorusme() {
        return pkGorusme;
    }

    public void setPkGorusme(Integer pkGorusme) {
        this.pkGorusme = pkGorusme;
    }

    public Integer getFkpazarlama() {
        return fkpazarlama;
    }

    public void setFkpazarlama(Integer fkpazarlama) {
        this.fkpazarlama = fkpazarlama;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getGorusulenKisi() {
        return gorusulenKisi;
    }

    public void setGorusulenKisi(String gorusulenKisi) {
        this.gorusulenKisi = gorusulenKisi;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public String getGorusen() {
        return gorusen;
    }

    public void setGorusen(String gorusen) {
        this.gorusen = gorusen;
    }

    public String getEtkisi() {
        return etkisi;
    }

    public void setEtkisi(String etkisi) {
        this.etkisi = etkisi;
    }

    public String getIsinTanimi() {
        return isinTanimi;
    }

    public void setIsinTanimi(String isinTanimi) {
        this.isinTanimi = isinTanimi;
    }

    public String getIsinNotu() {
        return isinNotu;
    }

    public void setIsinNotu(String isinNotu) {
        this.isinNotu = isinNotu;
    }

    public String getSonuc() {
        return sonuc;
    }

    public void setSonuc(String sonuc) {
        this.sonuc = sonuc;
    }

    public String getTeklifDurumu() {
        return teklifDurumu;
    }

    public void setTeklifDurumu(String teklifDurumu) {
        this.teklifDurumu = teklifDurumu;
    }

    public String getKatilimci() {
        return katilimci;
    }

    public void setKatilimci(String katilimci) {
        this.katilimci = katilimci;
    }

    public String getProje() {
        return proje;
    }

    public void setProje(String proje) {
        this.proje = proje;
    }

    public String getGorusmeTip() {
        return gorusmeTip;
    }

    public void setGorusmeTip(String gorusmeTip) {
        this.gorusmeTip = gorusmeTip;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public Boolean getVerimli() {
        return verimli;
    }

    public void setVerimli(Boolean verimli) {
        this.verimli = verimli;
    }

    public String getFirmaKatilim() {
        return firmaKatilim;
    }

    public void setFirmaKatilim(String firmaKatilim) {
        this.firmaKatilim = firmaKatilim;
    }

    public Date getKayitTar() {
        return kayitTar;
    }

    public void setKayitTar(Date kayitTar) {
        this.kayitTar = kayitTar;
    }

    public Firma getFkFirma() {
        return fkFirma;
    }

    public void setFkFirma(Firma fkFirma) {
        this.fkFirma = fkFirma;
    }

    public FirmaYetkili getFkFirmaYetkili() {
        return fkFirmaYetkili;
    }

    public void setFkFirmaYetkili(FirmaYetkili fkFirmaYetkili) {
        this.fkFirmaYetkili = fkFirmaYetkili;
    }

    public PersonelKart getFkKatilimci() {
        return fkKatilimci;
    }

    public void setFkKatilimci(PersonelKart fkKatilimci) {
        this.fkKatilimci = fkKatilimci;
    }

    public ProjeDetay getFkProjeProje() {
        return fkProjeProje;
    }

    public void setFkProjeProje(ProjeDetay fkProjeProje) {
        this.fkProjeProje = fkProjeProje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkGorusme != null ? pkGorusme.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gorusme)) {
            return false;
        }
        Gorusme other = (Gorusme) object;
        if ((this.pkGorusme == null && other.pkGorusme != null) || (this.pkGorusme != null && !this.pkGorusme.equals(other.pkGorusme))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Gorusme[ pkGorusme=" + pkGorusme + " ]";
    }
    
}
