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
import javax.persistence.Id;
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
@Table(name = "PersonelKart")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonelKart.findAll", query = "SELECT p FROM PersonelKart p"),
    @NamedQuery(name = "PersonelKart.findByPkPersonel", query = "SELECT p FROM PersonelKart p WHERE p.pkPersonel = :pkPersonel"),
    @NamedQuery(name = "PersonelKart.findByAdSoyad", query = "SELECT p FROM PersonelKart p WHERE p.adSoyad = :adSoyad"),
    @NamedQuery(name = "PersonelKart.findByTcKimlik", query = "SELECT p FROM PersonelKart p WHERE p.tcKimlik = :tcKimlik"),
    @NamedQuery(name = "PersonelKart.findByIseBaslama", query = "SELECT p FROM PersonelKart p WHERE p.iseBaslama = :iseBaslama"),
    @NamedQuery(name = "PersonelKart.findByIsAyrilma", query = "SELECT p FROM PersonelKart p WHERE p.isAyrilma = :isAyrilma"),
    @NamedQuery(name = "PersonelKart.findByFkGorev", query = "SELECT p FROM PersonelKart p WHERE p.fkGorev = :fkGorev"),
    @NamedQuery(name = "PersonelKart.findByFkBirim", query = "SELECT p FROM PersonelKart p WHERE p.fkBirim = :fkBirim"),
    @NamedQuery(name = "PersonelKart.findByPersonelTip", query = "SELECT p FROM PersonelKart p WHERE p.personelTip = :personelTip"),
    @NamedQuery(name = "PersonelKart.findByFkServis", query = "SELECT p FROM PersonelKart p WHERE p.fkServis = :fkServis"),
    @NamedQuery(name = "PersonelKart.findByAna", query = "SELECT p FROM PersonelKart p WHERE p.ana = :ana"),
    @NamedQuery(name = "PersonelKart.findByBaba", query = "SELECT p FROM PersonelKart p WHERE p.baba = :baba"),
    @NamedQuery(name = "PersonelKart.findByIl", query = "SELECT p FROM PersonelKart p WHERE p.il = :il"),
    @NamedQuery(name = "PersonelKart.findByIlce", query = "SELECT p FROM PersonelKart p WHERE p.ilce = :ilce"),
    @NamedQuery(name = "PersonelKart.findByCilt", query = "SELECT p FROM PersonelKart p WHERE p.cilt = :cilt"),
    @NamedQuery(name = "PersonelKart.findBySira", query = "SELECT p FROM PersonelKart p WHERE p.sira = :sira"),
    @NamedQuery(name = "PersonelKart.findByDYer", query = "SELECT p FROM PersonelKart p WHERE p.dYer = :dYer"),
    @NamedQuery(name = "PersonelKart.findByDTarih", query = "SELECT p FROM PersonelKart p WHERE p.dTarih = :dTarih"),
    @NamedQuery(name = "PersonelKart.findByMedeniHal", query = "SELECT p FROM PersonelKart p WHERE p.medeniHal = :medeniHal"),
    @NamedQuery(name = "PersonelKart.findByCocuk", query = "SELECT p FROM PersonelKart p WHERE p.cocuk = :cocuk"),
    @NamedQuery(name = "PersonelKart.findByIBan", query = "SELECT p FROM PersonelKart p WHERE p.iBan = :iBan"),
    @NamedQuery(name = "PersonelKart.findByMaas", query = "SELECT p FROM PersonelKart p WHERE p.maas = :maas"),
    @NamedQuery(name = "PersonelKart.findByTaban", query = "SELECT p FROM PersonelKart p WHERE p.taban = :taban"),
    @NamedQuery(name = "PersonelKart.findBySaat", query = "SELECT p FROM PersonelKart p WHERE p.saat = :saat"),
    @NamedQuery(name = "PersonelKart.findByEvAdres", query = "SELECT p FROM PersonelKart p WHERE p.evAdres = :evAdres"),
    @NamedQuery(name = "PersonelKart.findByTel", query = "SELECT p FROM PersonelKart p WHERE p.tel = :tel"),
    @NamedQuery(name = "PersonelKart.findByCep", query = "SELECT p FROM PersonelKart p WHERE p.cep = :cep"),
    @NamedQuery(name = "PersonelKart.findByEgitim", query = "SELECT p FROM PersonelKart p WHERE p.egitim = :egitim"),
    @NamedQuery(name = "PersonelKart.findByKanGrup", query = "SELECT p FROM PersonelKart p WHERE p.kanGrup = :kanGrup"),
    @NamedQuery(name = "PersonelKart.findByAciklama", query = "SELECT p FROM PersonelKart p WHERE p.aciklama = :aciklama"),
    @NamedQuery(name = "PersonelKart.findByResimYol", query = "SELECT p FROM PersonelKart p WHERE p.resimYol = :resimYol"),
    @NamedQuery(name = "PersonelKart.findByMesajOk", query = "SELECT p FROM PersonelKart p WHERE p.mesajOk = :mesajOk"),
    @NamedQuery(name = "PersonelKart.findByAyrildi", query = "SELECT p FROM PersonelKart p WHERE p.ayrildi = :ayrildi")})
public class PersonelKart implements Serializable {

    @OneToMany(mappedBy = "fkKatilimci", fetch = FetchType.LAZY)
    private Collection<Gorusme> gorusmeCollection;

    @OneToMany(mappedBy = "fkTemsilci", fetch = FetchType.LAZY)
    private Collection<Firma> firmaCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkPersonel")
    private Integer pkPersonel;
    @Size(max = 50)
    @Column(name = "AdSoyad")
    private String adSoyad;
    @Size(max = 11)
    @Column(name = "TcKimlik")
    private String tcKimlik;
    @Column(name = "IseBaslama")
    @Temporal(TemporalType.TIMESTAMP)
    private Date iseBaslama;
    @Column(name = "IsAyrilma")
    @Temporal(TemporalType.TIMESTAMP)
    private Date isAyrilma;
    @Column(name = "fkGorev")
    private Integer fkGorev;
    @Column(name = "fkBirim")
    private Integer fkBirim;
    @Size(max = 12)
    @Column(name = "PersonelTip")
    private String personelTip;
    @Column(name = "fkServis")
    private Integer fkServis;
    @Size(max = 50)
    @Column(name = "Ana")
    private String ana;
    @Size(max = 50)
    @Column(name = "Baba")
    private String baba;
    @Size(max = 50)
    @Column(name = "Il")
    private String il;
    @Size(max = 50)
    @Column(name = "Ilce")
    private String ilce;
    @Size(max = 50)
    @Column(name = "Cilt")
    private String cilt;
    @Size(max = 50)
    @Column(name = "Sira")
    private String sira;
    @Size(max = 50)
    @Column(name = "DYer")
    private String dYer;
    @Column(name = "DTarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dTarih;
    @Size(max = 8)
    @Column(name = "MedeniHal")
    private String medeniHal;
    @Column(name = "Cocuk")
    private Integer cocuk;
    @Size(max = 50)
    @Column(name = "IBan")
    private String iBan;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Maas")
    private BigDecimal maas;
    @Column(name = "Taban")
    private BigDecimal taban;
    @Column(name = "Saat")
    private BigDecimal saat;
    @Size(max = 250)
    @Column(name = "EvAdres")
    private String evAdres;
    @Size(max = 50)
    @Column(name = "Tel")
    private String tel;
    @Size(max = 50)
    @Column(name = "Cep")
    private String cep;
    @Size(max = 50)
    @Column(name = "Egitim")
    private String egitim;
    @Size(max = 50)
    @Column(name = "KanGrup")
    private String kanGrup;
    @Size(max = 1073741823)
    @Column(name = "Aciklama")
    private String aciklama;
    @Size(max = 150)
    @Column(name = "ResimYol")
    private String resimYol;
    @Column(name = "MesajOk")
    private Short mesajOk;
    @Column(name = "Ayrildi")
    private Boolean ayrildi;

    public PersonelKart() {
    }

    public PersonelKart(Integer pkPersonel) {
        this.pkPersonel = pkPersonel;
    }

    public Integer getPkPersonel() {
        return pkPersonel;
    }

    public void setPkPersonel(Integer pkPersonel) {
        this.pkPersonel = pkPersonel;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public Date getIseBaslama() {
        return iseBaslama;
    }

    public void setIseBaslama(Date iseBaslama) {
        this.iseBaslama = iseBaslama;
    }

    public Date getIsAyrilma() {
        return isAyrilma;
    }

    public void setIsAyrilma(Date isAyrilma) {
        this.isAyrilma = isAyrilma;
    }

    public Integer getFkGorev() {
        return fkGorev;
    }

    public void setFkGorev(Integer fkGorev) {
        this.fkGorev = fkGorev;
    }

    public Integer getFkBirim() {
        return fkBirim;
    }

    public void setFkBirim(Integer fkBirim) {
        this.fkBirim = fkBirim;
    }

    public String getPersonelTip() {
        return personelTip;
    }

    public void setPersonelTip(String personelTip) {
        this.personelTip = personelTip;
    }

    public Integer getFkServis() {
        return fkServis;
    }

    public void setFkServis(Integer fkServis) {
        this.fkServis = fkServis;
    }

    public String getAna() {
        return ana;
    }

    public void setAna(String ana) {
        this.ana = ana;
    }

    public String getBaba() {
        return baba;
    }

    public void setBaba(String baba) {
        this.baba = baba;
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

    public String getCilt() {
        return cilt;
    }

    public void setCilt(String cilt) {
        this.cilt = cilt;
    }

    public String getSira() {
        return sira;
    }

    public void setSira(String sira) {
        this.sira = sira;
    }

    public String getDYer() {
        return dYer;
    }

    public void setDYer(String dYer) {
        this.dYer = dYer;
    }

    public Date getDTarih() {
        return dTarih;
    }

    public void setDTarih(Date dTarih) {
        this.dTarih = dTarih;
    }

    public String getMedeniHal() {
        return medeniHal;
    }

    public void setMedeniHal(String medeniHal) {
        this.medeniHal = medeniHal;
    }

    public Integer getCocuk() {
        return cocuk;
    }

    public void setCocuk(Integer cocuk) {
        this.cocuk = cocuk;
    }

    public String getIBan() {
        return iBan;
    }

    public void setIBan(String iBan) {
        this.iBan = iBan;
    }

    public BigDecimal getMaas() {
        return maas;
    }

    public void setMaas(BigDecimal maas) {
        this.maas = maas;
    }

    public BigDecimal getTaban() {
        return taban;
    }

    public void setTaban(BigDecimal taban) {
        this.taban = taban;
    }

    public BigDecimal getSaat() {
        return saat;
    }

    public void setSaat(BigDecimal saat) {
        this.saat = saat;
    }

    public String getEvAdres() {
        return evAdres;
    }

    public void setEvAdres(String evAdres) {
        this.evAdres = evAdres;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEgitim() {
        return egitim;
    }

    public void setEgitim(String egitim) {
        this.egitim = egitim;
    }

    public String getKanGrup() {
        return kanGrup;
    }

    public void setKanGrup(String kanGrup) {
        this.kanGrup = kanGrup;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getResimYol() {
        return resimYol;
    }

    public void setResimYol(String resimYol) {
        this.resimYol = resimYol;
    }

    public Short getMesajOk() {
        return mesajOk;
    }

    public void setMesajOk(Short mesajOk) {
        this.mesajOk = mesajOk;
    }

    public Boolean getAyrildi() {
        return ayrildi;
    }

    public void setAyrildi(Boolean ayrildi) {
        this.ayrildi = ayrildi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkPersonel != null ? pkPersonel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonelKart)) {
            return false;
        }
        PersonelKart other = (PersonelKart) object;
        if ((this.pkPersonel == null && other.pkPersonel != null) || (this.pkPersonel != null && !this.pkPersonel.equals(other.pkPersonel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.PersonelKart[ pkPersonel=" + pkPersonel + " ]";
    }

    @XmlTransient
    public Collection<Firma> getFirmaCollection() {
        return firmaCollection;
    }

    public void setFirmaCollection(Collection<Firma> firmaCollection) {
        this.firmaCollection = firmaCollection;
    }

    @XmlTransient
    public Collection<Gorusme> getGorusmeCollection() {
        return gorusmeCollection;
    }

    public void setGorusmeCollection(Collection<Gorusme> gorusmeCollection) {
        this.gorusmeCollection = gorusmeCollection;
    }
    
}
