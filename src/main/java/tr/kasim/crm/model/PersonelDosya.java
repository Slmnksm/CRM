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
@Table(name = "PersonelDosya")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonelDosya.findAll", query = "SELECT p FROM PersonelDosya p"),
    @NamedQuery(name = "PersonelDosya.findByPkPerDosya", query = "SELECT p FROM PersonelDosya p WHERE p.pkPerDosya = :pkPerDosya"),
    @NamedQuery(name = "PersonelDosya.findByFkPersonel", query = "SELECT p FROM PersonelDosya p WHERE p.fkPersonel = :fkPersonel"),
    @NamedQuery(name = "PersonelDosya.findByDosyaAd", query = "SELECT p FROM PersonelDosya p WHERE p.dosyaAd = :dosyaAd")})
public class PersonelDosya implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkPerDosya")
    private Integer pkPerDosya;
    @Column(name = "fkPersonel")
    private Integer fkPersonel;
    @Size(max = 150)
    @Column(name = "DosyaAd")
    private String dosyaAd;

    public PersonelDosya() {
    }

    public PersonelDosya(Integer pkPerDosya) {
        this.pkPerDosya = pkPerDosya;
    }

    public Integer getPkPerDosya() {
        return pkPerDosya;
    }

    public void setPkPerDosya(Integer pkPerDosya) {
        this.pkPerDosya = pkPerDosya;
    }

    public Integer getFkPersonel() {
        return fkPersonel;
    }

    public void setFkPersonel(Integer fkPersonel) {
        this.fkPersonel = fkPersonel;
    }

    public String getDosyaAd() {
        return dosyaAd;
    }

    public void setDosyaAd(String dosyaAd) {
        this.dosyaAd = dosyaAd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkPerDosya != null ? pkPerDosya.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonelDosya)) {
            return false;
        }
        PersonelDosya other = (PersonelDosya) object;
        if ((this.pkPerDosya == null && other.pkPerDosya != null) || (this.pkPerDosya != null && !this.pkPerDosya.equals(other.pkPerDosya))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.PersonelDosya[ pkPerDosya=" + pkPerDosya + " ]";
    }
    
}
