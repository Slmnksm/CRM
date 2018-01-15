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
@Table(name = "Dosyalar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dosyalar.findAll", query = "SELECT d FROM Dosyalar d"),
    @NamedQuery(name = "Dosyalar.findByPkDosya", query = "SELECT d FROM Dosyalar d WHERE d.pkDosya = :pkDosya"),
    @NamedQuery(name = "Dosyalar.findByFkYukleyen", query = "SELECT d FROM Dosyalar d WHERE d.fkYukleyen = :fkYukleyen"),
    @NamedQuery(name = "Dosyalar.findByDosyaAd", query = "SELECT d FROM Dosyalar d WHERE d.dosyaAd = :dosyaAd"),
    @NamedQuery(name = "Dosyalar.findByAciklama", query = "SELECT d FROM Dosyalar d WHERE d.aciklama = :aciklama"),
    @NamedQuery(name = "Dosyalar.findByFkProje", query = "SELECT d FROM Dosyalar d WHERE d.fkProje = :fkProje"),
    @NamedQuery(name = "Dosyalar.findByDosyaYolu", query = "SELECT d FROM Dosyalar d WHERE d.dosyaYolu = :dosyaYolu"),
    @NamedQuery(name = "Dosyalar.findByTarih", query = "SELECT d FROM Dosyalar d WHERE d.tarih = :tarih"),
    @NamedQuery(name = "Dosyalar.findByDosyaTuru", query = "SELECT d FROM Dosyalar d WHERE d.dosyaTuru = :dosyaTuru"),
    @NamedQuery(name = "Dosyalar.findByDosyaGrubu", query = "SELECT d FROM Dosyalar d WHERE d.dosyaGrubu = :dosyaGrubu"),
    @NamedQuery(name = "Dosyalar.findByFkFirma", query = "SELECT d FROM Dosyalar d WHERE d.fkFirma = :fkFirma")})
public class Dosyalar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkDosya")
    private Integer pkDosya;
    @Column(name = "fkYukleyen")
    private Integer fkYukleyen;
    @Size(max = 50)
    @Column(name = "DosyaAd")
    private String dosyaAd;
    @Size(max = 250)
    @Column(name = "Aciklama")
    private String aciklama;
    @Column(name = "fkProje")
    private Integer fkProje;
    @Size(max = 100)
    @Column(name = "DosyaYolu")
    private String dosyaYolu;
    @Column(name = "Tarih")
    @Temporal(TemporalType.DATE)
    private Date tarih;
    @Size(max = 50)
    @Column(name = "DosyaTuru")
    private String dosyaTuru;
    @Size(max = 50)
    @Column(name = "DosyaGrubu")
    private String dosyaGrubu;
    @Column(name = "fkFirma")
    private Integer fkFirma;

    public Dosyalar() {
    }

    public Dosyalar(Integer pkDosya) {
        this.pkDosya = pkDosya;
    }

    public Integer getPkDosya() {
        return pkDosya;
    }

    public void setPkDosya(Integer pkDosya) {
        this.pkDosya = pkDosya;
    }

    public Integer getFkYukleyen() {
        return fkYukleyen;
    }

    public void setFkYukleyen(Integer fkYukleyen) {
        this.fkYukleyen = fkYukleyen;
    }

    public String getDosyaAd() {
        return dosyaAd;
    }

    public void setDosyaAd(String dosyaAd) {
        this.dosyaAd = dosyaAd;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Integer getFkProje() {
        return fkProje;
    }

    public void setFkProje(Integer fkProje) {
        this.fkProje = fkProje;
    }

    public String getDosyaYolu() {
        return dosyaYolu;
    }

    public void setDosyaYolu(String dosyaYolu) {
        this.dosyaYolu = dosyaYolu;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getDosyaTuru() {
        return dosyaTuru;
    }

    public void setDosyaTuru(String dosyaTuru) {
        this.dosyaTuru = dosyaTuru;
    }

    public String getDosyaGrubu() {
        return dosyaGrubu;
    }

    public void setDosyaGrubu(String dosyaGrubu) {
        this.dosyaGrubu = dosyaGrubu;
    }

    public Integer getFkFirma() {
        return fkFirma;
    }

    public void setFkFirma(Integer fkFirma) {
        this.fkFirma = fkFirma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkDosya != null ? pkDosya.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dosyalar)) {
            return false;
        }
        Dosyalar other = (Dosyalar) object;
        if ((this.pkDosya == null && other.pkDosya != null) || (this.pkDosya != null && !this.pkDosya.equals(other.pkDosya))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Dosyalar[ pkDosya=" + pkDosya + " ]";
    }
    
}
