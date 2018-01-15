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
@Table(name = "PersonelRapor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonelRapor.findAll", query = "SELECT p FROM PersonelRapor p"),
    @NamedQuery(name = "PersonelRapor.findByPkrapor", query = "SELECT p FROM PersonelRapor p WHERE p.pkrapor = :pkrapor"),
    @NamedQuery(name = "PersonelRapor.findByFkpersonel", query = "SELECT p FROM PersonelRapor p WHERE p.fkpersonel = :fkpersonel"),
    @NamedQuery(name = "PersonelRapor.findByBaslama", query = "SELECT p FROM PersonelRapor p WHERE p.baslama = :baslama"),
    @NamedQuery(name = "PersonelRapor.findByBitis", query = "SELECT p FROM PersonelRapor p WHERE p.bitis = :bitis"),
    @NamedQuery(name = "PersonelRapor.findByGun", query = "SELECT p FROM PersonelRapor p WHERE p.gun = :gun"),
    @NamedQuery(name = "PersonelRapor.findByKurum", query = "SELECT p FROM PersonelRapor p WHERE p.kurum = :kurum"),
    @NamedQuery(name = "PersonelRapor.findBySaglik", query = "SELECT p FROM PersonelRapor p WHERE p.saglik = :saglik"),
    @NamedQuery(name = "PersonelRapor.findByDurum", query = "SELECT p FROM PersonelRapor p WHERE p.durum = :durum")})
public class PersonelRapor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkrapor")
    private Integer pkrapor;
    @Column(name = "fkpersonel")
    private Integer fkpersonel;
    @Column(name = "Baslama")
    @Temporal(TemporalType.TIMESTAMP)
    private Date baslama;
    @Column(name = "Bitis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bitis;
    @Column(name = "Gun")
    private Integer gun;
    @Size(max = 50)
    @Column(name = "Kurum")
    private String kurum;
    @Size(max = 250)
    @Column(name = "Saglik")
    private String saglik;
    @Size(max = 50)
    @Column(name = "Durum")
    private String durum;

    public PersonelRapor() {
    }

    public PersonelRapor(Integer pkrapor) {
        this.pkrapor = pkrapor;
    }

    public Integer getPkrapor() {
        return pkrapor;
    }

    public void setPkrapor(Integer pkrapor) {
        this.pkrapor = pkrapor;
    }

    public Integer getFkpersonel() {
        return fkpersonel;
    }

    public void setFkpersonel(Integer fkpersonel) {
        this.fkpersonel = fkpersonel;
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

    public Integer getGun() {
        return gun;
    }

    public void setGun(Integer gun) {
        this.gun = gun;
    }

    public String getKurum() {
        return kurum;
    }

    public void setKurum(String kurum) {
        this.kurum = kurum;
    }

    public String getSaglik() {
        return saglik;
    }

    public void setSaglik(String saglik) {
        this.saglik = saglik;
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
        hash += (pkrapor != null ? pkrapor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonelRapor)) {
            return false;
        }
        PersonelRapor other = (PersonelRapor) object;
        if ((this.pkrapor == null && other.pkrapor != null) || (this.pkrapor != null && !this.pkrapor.equals(other.pkrapor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.PersonelRapor[ pkrapor=" + pkrapor + " ]";
    }
    
}
