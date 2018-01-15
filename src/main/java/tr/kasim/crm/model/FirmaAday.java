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
@Table(name = "FirmaAday")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FirmaAday.findAll", query = "SELECT f FROM FirmaAday f"),
    @NamedQuery(name = "FirmaAday.findByPkfirmaaday", query = "SELECT f FROM FirmaAday f WHERE f.pkfirmaaday = :pkfirmaaday"),
    @NamedQuery(name = "FirmaAday.findBySirketKod", query = "SELECT f FROM FirmaAday f WHERE f.sirketKod = :sirketKod"),
    @NamedQuery(name = "FirmaAday.findBySirketAd", query = "SELECT f FROM FirmaAday f WHERE f.sirketAd = :sirketAd"),
    @NamedQuery(name = "FirmaAday.findByAdres", query = "SELECT f FROM FirmaAday f WHERE f.adres = :adres"),
    @NamedQuery(name = "FirmaAday.findByHesapNo", query = "SELECT f FROM FirmaAday f WHERE f.hesapNo = :hesapNo"),
    @NamedQuery(name = "FirmaAday.findBySiccode", query = "SELECT f FROM FirmaAday f WHERE f.siccode = :siccode"),
    @NamedQuery(name = "FirmaAday.findByFaaliyet", query = "SELECT f FROM FirmaAday f WHERE f.faaliyet = :faaliyet"),
    @NamedQuery(name = "FirmaAday.findByUlke", query = "SELECT f FROM FirmaAday f WHERE f.ulke = :ulke"),
    @NamedQuery(name = "FirmaAday.findByTelefon", query = "SELECT f FROM FirmaAday f WHERE f.telefon = :telefon"),
    @NamedQuery(name = "FirmaAday.findByFax", query = "SELECT f FROM FirmaAday f WHERE f.fax = :fax"),
    @NamedQuery(name = "FirmaAday.findByWebAders", query = "SELECT f FROM FirmaAday f WHERE f.webAders = :webAders"),
    @NamedQuery(name = "FirmaAday.findByPostaKod", query = "SELECT f FROM FirmaAday f WHERE f.postaKod = :postaKod"),
    @NamedQuery(name = "FirmaAday.findByVergiDaire", query = "SELECT f FROM FirmaAday f WHERE f.vergiDaire = :vergiDaire"),
    @NamedQuery(name = "FirmaAday.findByVergiNo", query = "SELECT f FROM FirmaAday f WHERE f.vergiNo = :vergiNo"),
    @NamedQuery(name = "FirmaAday.findByYasamDongu", query = "SELECT f FROM FirmaAday f WHERE f.yasamDongu = :yasamDongu"),
    @NamedQuery(name = "FirmaAday.findByBorcDurum", query = "SELECT f FROM FirmaAday f WHERE f.borcDurum = :borcDurum"),
    @NamedQuery(name = "FirmaAday.findByImp", query = "SELECT f FROM FirmaAday f WHERE f.imp = :imp"),
    @NamedQuery(name = "FirmaAday.findByCITCozum", query = "SELECT f FROM FirmaAday f WHERE f.cITCozum = :cITCozum")})
public class FirmaAday implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkfirmaaday")
    private Integer pkfirmaaday;
    @Size(max = 50)
    @Column(name = "SirketKod")
    private String sirketKod;
    @Size(max = 150)
    @Column(name = "SirketAd")
    private String sirketAd;
    @Size(max = 250)
    @Column(name = "adres")
    private String adres;
    @Size(max = 50)
    @Column(name = "HesapNo")
    private String hesapNo;
    @Size(max = 50)
    @Column(name = "siccode")
    private String siccode;
    @Size(max = 250)
    @Column(name = "faaliyet")
    private String faaliyet;
    @Size(max = 50)
    @Column(name = "ulke")
    private String ulke;
    @Size(max = 50)
    @Column(name = "Telefon")
    private String telefon;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "Fax")
    private String fax;
    @Size(max = 50)
    @Column(name = "WebAders")
    private String webAders;
    @Size(max = 50)
    @Column(name = "PostaKod")
    private String postaKod;
    @Size(max = 50)
    @Column(name = "VergiDaire")
    private String vergiDaire;
    @Size(max = 50)
    @Column(name = "VergiNo")
    private String vergiNo;
    @Size(max = 50)
    @Column(name = "YasamDongu")
    private String yasamDongu;
    @Size(max = 50)
    @Column(name = "BorcDurum")
    private String borcDurum;
    @Size(max = 250)
    @Column(name = "IMP")
    private String imp;
    @Size(max = 250)
    @Column(name = "CITCozum")
    private String cITCozum;

    public FirmaAday() {
    }

    public FirmaAday(Integer pkfirmaaday) {
        this.pkfirmaaday = pkfirmaaday;
    }

    public Integer getPkfirmaaday() {
        return pkfirmaaday;
    }

    public void setPkfirmaaday(Integer pkfirmaaday) {
        this.pkfirmaaday = pkfirmaaday;
    }

    public String getSirketKod() {
        return sirketKod;
    }

    public void setSirketKod(String sirketKod) {
        this.sirketKod = sirketKod;
    }

    public String getSirketAd() {
        return sirketAd;
    }

    public void setSirketAd(String sirketAd) {
        this.sirketAd = sirketAd;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getSiccode() {
        return siccode;
    }

    public void setSiccode(String siccode) {
        this.siccode = siccode;
    }

    public String getFaaliyet() {
        return faaliyet;
    }

    public void setFaaliyet(String faaliyet) {
        this.faaliyet = faaliyet;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebAders() {
        return webAders;
    }

    public void setWebAders(String webAders) {
        this.webAders = webAders;
    }

    public String getPostaKod() {
        return postaKod;
    }

    public void setPostaKod(String postaKod) {
        this.postaKod = postaKod;
    }

    public String getVergiDaire() {
        return vergiDaire;
    }

    public void setVergiDaire(String vergiDaire) {
        this.vergiDaire = vergiDaire;
    }

    public String getVergiNo() {
        return vergiNo;
    }

    public void setVergiNo(String vergiNo) {
        this.vergiNo = vergiNo;
    }

    public String getYasamDongu() {
        return yasamDongu;
    }

    public void setYasamDongu(String yasamDongu) {
        this.yasamDongu = yasamDongu;
    }

    public String getBorcDurum() {
        return borcDurum;
    }

    public void setBorcDurum(String borcDurum) {
        this.borcDurum = borcDurum;
    }

    public String getImp() {
        return imp;
    }

    public void setImp(String imp) {
        this.imp = imp;
    }

    public String getCITCozum() {
        return cITCozum;
    }

    public void setCITCozum(String cITCozum) {
        this.cITCozum = cITCozum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkfirmaaday != null ? pkfirmaaday.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FirmaAday)) {
            return false;
        }
        FirmaAday other = (FirmaAday) object;
        if ((this.pkfirmaaday == null && other.pkfirmaaday != null) || (this.pkfirmaaday != null && !this.pkfirmaaday.equals(other.pkfirmaaday))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.FirmaAday[ pkfirmaaday=" + pkfirmaaday + " ]";
    }
    
}
