/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
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
@Table(name = "ProjeDetay")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProjeDetay.findAll", query = "SELECT p FROM ProjeDetay p"),
    @NamedQuery(name = "ProjeDetay.findById", query = "SELECT p FROM ProjeDetay p WHERE p.id = :id"),
    @NamedQuery(name = "ProjeDetay.findByPkFirma", query = "SELECT p FROM ProjeDetay p WHERE p.pkFirma = :pkFirma"),
    @NamedQuery(name = "ProjeDetay.findByProjeAd\u0131", query = "SELECT p FROM ProjeDetay p WHERE p.projeAd\u0131 = :projeAd\u0131"),
    @NamedQuery(name = "ProjeDetay.findByTarih", query = "SELECT p FROM ProjeDetay p WHERE p.tarih = :tarih"),
    @NamedQuery(name = "ProjeDetay.findByProjeYetkilisi", query = "SELECT p FROM ProjeDetay p WHERE p.projeYetkilisi = :projeYetkilisi"),
    @NamedQuery(name = "ProjeDetay.findByTahminiMetraj", query = "SELECT p FROM ProjeDetay p WHERE p.tahminiMetraj = :tahminiMetraj"),
    @NamedQuery(name = "ProjeDetay.findByTahminiBuyce", query = "SELECT p FROM ProjeDetay p WHERE p.tahminiBuyce = :tahminiBuyce"),
    @NamedQuery(name = "ProjeDetay.findByBaslangicSuresi", query = "SELECT p FROM ProjeDetay p WHERE p.baslangicSuresi = :baslangicSuresi"),
    @NamedQuery(name = "ProjeDetay.findByDekoratif", query = "SELECT p FROM ProjeDetay p WHERE p.dekoratif = :dekoratif"),
    @NamedQuery(name = "ProjeDetay.findByEndustriyel", query = "SELECT p FROM ProjeDetay p WHERE p.endustriyel = :endustriyel"),
    @NamedQuery(name = "ProjeDetay.findByUygulamaTaah", query = "SELECT p FROM ProjeDetay p WHERE p.uygulamaTaah = :uygulamaTaah"),
    @NamedQuery(name = "ProjeDetay.findByAciklama", query = "SELECT p FROM ProjeDetay p WHERE p.aciklama = :aciklama"),
    @NamedQuery(name = "ProjeDetay.findByDurum", query = "SELECT p FROM ProjeDetay p WHERE p.durum = :durum"),
    @NamedQuery(name = "ProjeDetay.findByBitDeko", query = "SELECT p FROM ProjeDetay p WHERE p.bitDeko = :bitDeko"),
    @NamedQuery(name = "ProjeDetay.findByBitEndus", query = "SELECT p FROM ProjeDetay p WHERE p.bitEndus = :bitEndus"),
    @NamedQuery(name = "ProjeDetay.findByBitUygu", query = "SELECT p FROM ProjeDetay p WHERE p.bitUygu = :bitUygu"),
    @NamedQuery(name = "ProjeDetay.findByProjeGrup", query = "SELECT p FROM ProjeDetay p WHERE p.projeGrup = :projeGrup"),
    @NamedQuery(name = "ProjeDetay.findByKat", query = "SELECT p FROM ProjeDetay p WHERE p.kat = :kat"),
    @NamedQuery(name = "ProjeDetay.findByBlok", query = "SELECT p FROM ProjeDetay p WHERE p.blok = :blok"),
    @NamedQuery(name = "ProjeDetay.findByUrunGrup", query = "SELECT p FROM ProjeDetay p WHERE p.urunGrup = :urunGrup"),
    @NamedQuery(name = "ProjeDetay.findByDoviz", query = "SELECT p FROM ProjeDetay p WHERE p.doviz = :doviz"),
    @NamedQuery(name = "ProjeDetay.findByBirim", query = "SELECT p FROM ProjeDetay p WHERE p.birim = :birim"),
    @NamedQuery(name = "ProjeDetay.findByProjeUstNo", query = "SELECT p FROM ProjeDetay p WHERE p.projeUstNo = :projeUstNo"),
    @NamedQuery(name = "ProjeDetay.findByProjeSorumlu", query = "SELECT p FROM ProjeDetay p WHERE p.projeSorumlu = :projeSorumlu")})
public class ProjeDetay implements Serializable {

    @OneToMany(mappedBy = "fkProje", fetch = FetchType.LAZY)
    private Collection<Firsat> firsatCollection;

    @OneToMany(mappedBy = "fkProjeProje", fetch = FetchType.LAZY)
    private Collection<Gorusme> gorusmeCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "pkFirma")
    private Integer pkFirma;
    @Size(max = 50)
    @Column(name = "ProjeAd\u0131")
    private String projeAdı;
    @Column(name = "Tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    @Size(max = 50)
    @Column(name = "ProjeYetkilisi")
    private String projeYetkilisi;
    @Size(max = 50)
    @Column(name = "TahminiMetraj")
    private String tahminiMetraj;
    @Size(max = 50)
    @Column(name = "TahminiBuyce")
    private String tahminiBuyce;
    @Size(max = 50)
    @Column(name = "BaslangicSuresi")
    private String baslangicSuresi;
    @Size(max = 50)
    @Column(name = "Dekoratif")
    private String dekoratif;
    @Size(max = 50)
    @Column(name = "Endustriyel")
    private String endustriyel;
    @Size(max = 250)
    @Column(name = "UygulamaTaah")
    private String uygulamaTaah;
    @Size(max = 250)
    @Column(name = "Aciklama")
    private String aciklama;
    @Size(max = 50)
    @Column(name = "Durum")
    private String durum;
    @Column(name = "bitDeko")
    private Boolean bitDeko;
    @Column(name = "bitEndus")
    private Boolean bitEndus;
    @Column(name = "bitUygu")
    private Boolean bitUygu;
    @Size(max = 50)
    @Column(name = "ProjeGrup")
    private String projeGrup;
    @Size(max = 50)
    @Column(name = "Kat")
    private String kat;
    @Size(max = 50)
    @Column(name = "Blok")
    private String blok;
    @Size(max = 50)
    @Column(name = "UrunGrup")
    private String urunGrup;
    @Size(max = 50)
    @Column(name = "Doviz")
    private String doviz;
    @Size(max = 50)
    @Column(name = "Birim")
    private String birim;
    @Column(name = "ProjeUstNo")
    private Integer projeUstNo;
    @Column(name = "ProjeSorumlu")
    private Integer projeSorumlu;

    public ProjeDetay() {
    }

    public ProjeDetay(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPkFirma() {
        return pkFirma;
    }

    public void setPkFirma(Integer pkFirma) {
        this.pkFirma = pkFirma;
    }

    public String getProjeAdı() {
        return projeAdı;
    }

    public void setProjeAdı(String projeAdı) {
        this.projeAdı = projeAdı;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getProjeYetkilisi() {
        return projeYetkilisi;
    }

    public void setProjeYetkilisi(String projeYetkilisi) {
        this.projeYetkilisi = projeYetkilisi;
    }

    public String getTahminiMetraj() {
        return tahminiMetraj;
    }

    public void setTahminiMetraj(String tahminiMetraj) {
        this.tahminiMetraj = tahminiMetraj;
    }

    public String getTahminiBuyce() {
        return tahminiBuyce;
    }

    public void setTahminiBuyce(String tahminiBuyce) {
        this.tahminiBuyce = tahminiBuyce;
    }

    public String getBaslangicSuresi() {
        return baslangicSuresi;
    }

    public void setBaslangicSuresi(String baslangicSuresi) {
        this.baslangicSuresi = baslangicSuresi;
    }

    public String getDekoratif() {
        return dekoratif;
    }

    public void setDekoratif(String dekoratif) {
        this.dekoratif = dekoratif;
    }

    public String getEndustriyel() {
        return endustriyel;
    }

    public void setEndustriyel(String endustriyel) {
        this.endustriyel = endustriyel;
    }

    public String getUygulamaTaah() {
        return uygulamaTaah;
    }

    public void setUygulamaTaah(String uygulamaTaah) {
        this.uygulamaTaah = uygulamaTaah;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public Boolean getBitDeko() {
        return bitDeko;
    }

    public void setBitDeko(Boolean bitDeko) {
        this.bitDeko = bitDeko;
    }

    public Boolean getBitEndus() {
        return bitEndus;
    }

    public void setBitEndus(Boolean bitEndus) {
        this.bitEndus = bitEndus;
    }

    public Boolean getBitUygu() {
        return bitUygu;
    }

    public void setBitUygu(Boolean bitUygu) {
        this.bitUygu = bitUygu;
    }

    public String getProjeGrup() {
        return projeGrup;
    }

    public void setProjeGrup(String projeGrup) {
        this.projeGrup = projeGrup;
    }

    public String getKat() {
        return kat;
    }

    public void setKat(String kat) {
        this.kat = kat;
    }

    public String getBlok() {
        return blok;
    }

    public void setBlok(String blok) {
        this.blok = blok;
    }

    public String getUrunGrup() {
        return urunGrup;
    }

    public void setUrunGrup(String urunGrup) {
        this.urunGrup = urunGrup;
    }

    public String getDoviz() {
        return doviz;
    }

    public void setDoviz(String doviz) {
        this.doviz = doviz;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public Integer getProjeUstNo() {
        return projeUstNo;
    }

    public void setProjeUstNo(Integer projeUstNo) {
        this.projeUstNo = projeUstNo;
    }

    public Integer getProjeSorumlu() {
        return projeSorumlu;
    }

    public void setProjeSorumlu(Integer projeSorumlu) {
        this.projeSorumlu = projeSorumlu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProjeDetay)) {
            return false;
        }
        ProjeDetay other = (ProjeDetay) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.ProjeDetay[ id=" + id + " ]";
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
