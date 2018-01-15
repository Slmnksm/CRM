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
@Table(name = "Personelizin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personelizin.findAll", query = "SELECT p FROM Personelizin p"),
    @NamedQuery(name = "Personelizin.findByPkizin", query = "SELECT p FROM Personelizin p WHERE p.pkizin = :pkizin"),
    @NamedQuery(name = "Personelizin.findByFkpersonel", query = "SELECT p FROM Personelizin p WHERE p.fkpersonel = :fkpersonel"),
    @NamedQuery(name = "Personelizin.findByGun", query = "SELECT p FROM Personelizin p WHERE p.gun = :gun"),
    @NamedQuery(name = "Personelizin.findByKalan", query = "SELECT p FROM Personelizin p WHERE p.kalan = :kalan"),
    @NamedQuery(name = "Personelizin.findByBaslama", query = "SELECT p FROM Personelizin p WHERE p.baslama = :baslama"),
    @NamedQuery(name = "Personelizin.findByBitis", query = "SELECT p FROM Personelizin p WHERE p.bitis = :bitis"),
    @NamedQuery(name = "Personelizin.findByDonus", query = "SELECT p FROM Personelizin p WHERE p.donus = :donus"),
    @NamedQuery(name = "Personelizin.findByAdres", query = "SELECT p FROM Personelizin p WHERE p.adres = :adres"),
    @NamedQuery(name = "Personelizin.findByTur", query = "SELECT p FROM Personelizin p WHERE p.tur = :tur"),
    @NamedQuery(name = "Personelizin.findByAciklama", query = "SELECT p FROM Personelizin p WHERE p.aciklama = :aciklama"),
    @NamedQuery(name = "Personelizin.findByDurum", query = "SELECT p FROM Personelizin p WHERE p.durum = :durum")})
public class Personelizin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkizin")
    private Integer pkizin;
    @Column(name = "fkpersonel")
    private Integer fkpersonel;
    @Column(name = "Gun")
    private Integer gun;
    @Column(name = "Kalan")
    private Integer kalan;
    @Column(name = "Baslama")
    @Temporal(TemporalType.TIMESTAMP)
    private Date baslama;
    @Column(name = "Bitis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bitis;
    @Column(name = "Donus")
    @Temporal(TemporalType.TIMESTAMP)
    private Date donus;
    @Size(max = 50)
    @Column(name = "Adres")
    private String adres;
    @Size(max = 50)
    @Column(name = "Tur")
    private String tur;
    @Size(max = 250)
    @Column(name = "Aciklama")
    private String aciklama;
    @Size(max = 50)
    @Column(name = "Durum")
    private String durum;

    public Personelizin() {
    }

    public Personelizin(Integer pkizin) {
        this.pkizin = pkizin;
    }

    public Integer getPkizin() {
        return pkizin;
    }

    public void setPkizin(Integer pkizin) {
        this.pkizin = pkizin;
    }

    public Integer getFkpersonel() {
        return fkpersonel;
    }

    public void setFkpersonel(Integer fkpersonel) {
        this.fkpersonel = fkpersonel;
    }

    public Integer getGun() {
        return gun;
    }

    public void setGun(Integer gun) {
        this.gun = gun;
    }

    public Integer getKalan() {
        return kalan;
    }

    public void setKalan(Integer kalan) {
        this.kalan = kalan;
    }

    public Date getBaslama() {
        return baslama;
    }

    public void setBaslama(Date baslama) {
        this.baslama = baslama;
    }

    public Date getBitis() {
        return bitis;
    }

    public void setBitis(Date bitis) {
        this.bitis = bitis;
    }

    public Date getDonus() {
        return donus;
    }

    public void setDonus(Date donus) {
        this.donus = donus;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkizin != null ? pkizin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personelizin)) {
            return false;
        }
        Personelizin other = (Personelizin) object;
        if ((this.pkizin == null && other.pkizin != null) || (this.pkizin != null && !this.pkizin.equals(other.pkizin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Personelizin[ pkizin=" + pkizin + " ]";
    }
    
}
