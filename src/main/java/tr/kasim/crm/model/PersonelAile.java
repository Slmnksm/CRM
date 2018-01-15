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
@Table(name = "PersonelAile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonelAile.findAll", query = "SELECT p FROM PersonelAile p"),
    @NamedQuery(name = "PersonelAile.findByPkBirey", query = "SELECT p FROM PersonelAile p WHERE p.pkBirey = :pkBirey"),
    @NamedQuery(name = "PersonelAile.findByFkpersonel", query = "SELECT p FROM PersonelAile p WHERE p.fkpersonel = :fkpersonel"),
    @NamedQuery(name = "PersonelAile.findByAdsoyad", query = "SELECT p FROM PersonelAile p WHERE p.adsoyad = :adsoyad"),
    @NamedQuery(name = "PersonelAile.findByDTarih", query = "SELECT p FROM PersonelAile p WHERE p.dTarih = :dTarih"),
    @NamedQuery(name = "PersonelAile.findByYakinlik", query = "SELECT p FROM PersonelAile p WHERE p.yakinlik = :yakinlik"),
    @NamedQuery(name = "PersonelAile.findByEgitim", query = "SELECT p FROM PersonelAile p WHERE p.egitim = :egitim"),
    @NamedQuery(name = "PersonelAile.findByKanGrup", query = "SELECT p FROM PersonelAile p WHERE p.kanGrup = :kanGrup"),
    @NamedQuery(name = "PersonelAile.findByCalisma", query = "SELECT p FROM PersonelAile p WHERE p.calisma = :calisma"),
    @NamedQuery(name = "PersonelAile.findByTCKimlik", query = "SELECT p FROM PersonelAile p WHERE p.tCKimlik = :tCKimlik"),
    @NamedQuery(name = "PersonelAile.findByAciklama", query = "SELECT p FROM PersonelAile p WHERE p.aciklama = :aciklama")})
public class PersonelAile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkBirey")
    private Integer pkBirey;
    @Column(name = "fkpersonel")
    private Integer fkpersonel;
    @Size(max = 50)
    @Column(name = "adsoyad")
    private String adsoyad;
    @Column(name = "DTarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dTarih;
    @Size(max = 50)
    @Column(name = "Yakinlik")
    private String yakinlik;
    @Size(max = 50)
    @Column(name = "Egitim")
    private String egitim;
    @Size(max = 50)
    @Column(name = "KanGrup")
    private String kanGrup;
    @Size(max = 50)
    @Column(name = "Calisma")
    private String calisma;
    @Size(max = 50)
    @Column(name = "TCKimlik")
    private String tCKimlik;
    @Size(max = 250)
    @Column(name = "Aciklama")
    private String aciklama;

    public PersonelAile() {
    }

    public PersonelAile(Integer pkBirey) {
        this.pkBirey = pkBirey;
    }

    public Integer getPkBirey() {
        return pkBirey;
    }

    public void setPkBirey(Integer pkBirey) {
        this.pkBirey = pkBirey;
    }

    public Integer getFkpersonel() {
        return fkpersonel;
    }

    public void setFkpersonel(Integer fkpersonel) {
        this.fkpersonel = fkpersonel;
    }

    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public Date getDTarih() {
        return dTarih;
    }

    public void setDTarih(Date dTarih) {
        this.dTarih = dTarih;
    }

    public String getYakinlik() {
        return yakinlik;
    }

    public void setYakinlik(String yakinlik) {
        this.yakinlik = yakinlik;
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

    public String getCalisma() {
        return calisma;
    }

    public void setCalisma(String calisma) {
        this.calisma = calisma;
    }

    public String getTCKimlik() {
        return tCKimlik;
    }

    public void setTCKimlik(String tCKimlik) {
        this.tCKimlik = tCKimlik;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkBirey != null ? pkBirey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonelAile)) {
            return false;
        }
        PersonelAile other = (PersonelAile) object;
        if ((this.pkBirey == null && other.pkBirey != null) || (this.pkBirey != null && !this.pkBirey.equals(other.pkBirey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.PersonelAile[ pkBirey=" + pkBirey + " ]";
    }
    
}
