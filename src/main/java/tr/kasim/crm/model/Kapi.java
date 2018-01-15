/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
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
@Table(name = "Kapi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kapi.findAll", query = "SELECT k FROM Kapi k"),
    @NamedQuery(name = "Kapi.findByKapiNo", query = "SELECT k FROM Kapi k WHERE k.kapiNo = :kapiNo"),
    @NamedQuery(name = "Kapi.findByMekan", query = "SELECT k FROM Kapi k WHERE k.mekan = :mekan"),
    @NamedQuery(name = "Kapi.findByEn", query = "SELECT k FROM Kapi k WHERE k.en = :en"),
    @NamedQuery(name = "Kapi.findByBoy", query = "SELECT k FROM Kapi k WHERE k.boy = :boy"),
    @NamedQuery(name = "Kapi.findByKalinlik", query = "SELECT k FROM Kapi k WHERE k.kalinlik = :kalinlik"),
    @NamedQuery(name = "Kapi.findByModel", query = "SELECT k FROM Kapi k WHERE k.model = :model"),
    @NamedQuery(name = "Kapi.findByPervaz", query = "SELECT k FROM Kapi k WHERE k.pervaz = :pervaz"),
    @NamedQuery(name = "Kapi.findByKasaPervazBirlestirme", query = "SELECT k FROM Kapi k WHERE k.kasaPervazBirlestirme = :kasaPervazBirlestirme"),
    @NamedQuery(name = "Kapi.findByCam", query = "SELECT k FROM Kapi k WHERE k.cam = :cam"),
    @NamedQuery(name = "Kapi.findByYon", query = "SELECT k FROM Kapi k WHERE k.yon = :yon"),
    @NamedQuery(name = "Kapi.findByKapiRengi", query = "SELECT k FROM Kapi k WHERE k.kapiRengi = :kapiRengi"),
    @NamedQuery(name = "Kapi.findByKanatRengi", query = "SELECT k FROM Kapi k WHERE k.kanatRengi = :kanatRengi"),
    @NamedQuery(name = "Kapi.findByPervazRengi", query = "SELECT k FROM Kapi k WHERE k.pervazRengi = :pervazRengi"),
    @NamedQuery(name = "Kapi.findByMasifKaplama", query = "SELECT k FROM Kapi k WHERE k.masifKaplama = :masifKaplama"),
    @NamedQuery(name = "Kapi.findByKolMarka", query = "SELECT k FROM Kapi k WHERE k.kolMarka = :kolMarka"),
    @NamedQuery(name = "Kapi.findByKilitMarka", query = "SELECT k FROM Kapi k WHERE k.kilitMarka = :kilitMarka"),
    @NamedQuery(name = "Kapi.findByMenteseMarka", query = "SELECT k FROM Kapi k WHERE k.menteseMarka = :menteseMarka"),
    @NamedQuery(name = "Kapi.findById", query = "SELECT k FROM Kapi k WHERE k.id = :id"),
    @NamedQuery(name = "Kapi.findByPksipdetay", query = "SELECT k FROM Kapi k WHERE k.pksipdetay = :pksipdetay")})
public class Kapi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "KapiNo")
    private String kapiNo;
    @Size(max = 50)
    @Column(name = "Mekan")
    private String mekan;
    @Size(max = 50)
    @Column(name = "En")
    private String en;
    @Size(max = 50)
    @Column(name = "Boy")
    private String boy;
    @Size(max = 50)
    @Column(name = "Kalinlik")
    private String kalinlik;
    @Size(max = 50)
    @Column(name = "Model")
    private String model;
    @Size(max = 50)
    @Column(name = "Pervaz")
    private String pervaz;
    @Size(max = 50)
    @Column(name = "KasaPervazBirlestirme")
    private String kasaPervazBirlestirme;
    @Size(max = 50)
    @Column(name = "Cam")
    private String cam;
    @Size(max = 50)
    @Column(name = "Yon")
    private String yon;
    @Size(max = 50)
    @Column(name = "KapiRengi")
    private String kapiRengi;
    @Size(max = 50)
    @Column(name = "KanatRengi")
    private String kanatRengi;
    @Size(max = 50)
    @Column(name = "PervazRengi")
    private String pervazRengi;
    @Size(max = 50)
    @Column(name = "MasifKaplama")
    private String masifKaplama;
    @Size(max = 50)
    @Column(name = "KolMarka")
    private String kolMarka;
    @Size(max = 50)
    @Column(name = "KilitMarka")
    private String kilitMarka;
    @Size(max = 50)
    @Column(name = "MenteseMarka")
    private String menteseMarka;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "pksipdetay")
    private Integer pksipdetay;

    public Kapi() {
    }

    public Kapi(Integer id) {
        this.id = id;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public String getMekan() {
        return mekan;
    }

    public void setMekan(String mekan) {
        this.mekan = mekan;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getBoy() {
        return boy;
    }

    public void setBoy(String boy) {
        this.boy = boy;
    }

    public String getKalinlik() {
        return kalinlik;
    }

    public void setKalinlik(String kalinlik) {
        this.kalinlik = kalinlik;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPervaz() {
        return pervaz;
    }

    public void setPervaz(String pervaz) {
        this.pervaz = pervaz;
    }

    public String getKasaPervazBirlestirme() {
        return kasaPervazBirlestirme;
    }

    public void setKasaPervazBirlestirme(String kasaPervazBirlestirme) {
        this.kasaPervazBirlestirme = kasaPervazBirlestirme;
    }

    public String getCam() {
        return cam;
    }

    public void setCam(String cam) {
        this.cam = cam;
    }

    public String getYon() {
        return yon;
    }

    public void setYon(String yon) {
        this.yon = yon;
    }

    public String getKapiRengi() {
        return kapiRengi;
    }

    public void setKapiRengi(String kapiRengi) {
        this.kapiRengi = kapiRengi;
    }

    public String getKanatRengi() {
        return kanatRengi;
    }

    public void setKanatRengi(String kanatRengi) {
        this.kanatRengi = kanatRengi;
    }

    public String getPervazRengi() {
        return pervazRengi;
    }

    public void setPervazRengi(String pervazRengi) {
        this.pervazRengi = pervazRengi;
    }

    public String getMasifKaplama() {
        return masifKaplama;
    }

    public void setMasifKaplama(String masifKaplama) {
        this.masifKaplama = masifKaplama;
    }

    public String getKolMarka() {
        return kolMarka;
    }

    public void setKolMarka(String kolMarka) {
        this.kolMarka = kolMarka;
    }

    public String getKilitMarka() {
        return kilitMarka;
    }

    public void setKilitMarka(String kilitMarka) {
        this.kilitMarka = kilitMarka;
    }

    public String getMenteseMarka() {
        return menteseMarka;
    }

    public void setMenteseMarka(String menteseMarka) {
        this.menteseMarka = menteseMarka;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPksipdetay() {
        return pksipdetay;
    }

    public void setPksipdetay(Integer pksipdetay) {
        this.pksipdetay = pksipdetay;
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
        if (!(object instanceof Kapi)) {
            return false;
        }
        Kapi other = (Kapi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Kapi[ id=" + id + " ]";
    }
    
}
