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
@Table(name = "Sube")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sube.findAll", query = "SELECT s FROM Sube s"),
    @NamedQuery(name = "Sube.findByPksube", query = "SELECT s FROM Sube s WHERE s.pksube = :pksube"),
    @NamedQuery(name = "Sube.findBySubeAd", query = "SELECT s FROM Sube s WHERE s.subeAd = :subeAd"),
    @NamedQuery(name = "Sube.findByAdres", query = "SELECT s FROM Sube s WHERE s.adres = :adres"),
    @NamedQuery(name = "Sube.findByTel1", query = "SELECT s FROM Sube s WHERE s.tel1 = :tel1"),
    @NamedQuery(name = "Sube.findByTel2", query = "SELECT s FROM Sube s WHERE s.tel2 = :tel2"),
    @NamedQuery(name = "Sube.findByFax", query = "SELECT s FROM Sube s WHERE s.fax = :fax"),
    @NamedQuery(name = "Sube.findByYetkiliKisi", query = "SELECT s FROM Sube s WHERE s.yetkiliKisi = :yetkiliKisi")})
public class Sube implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pksube")
    private Integer pksube;
    @Size(max = 250)
    @Column(name = "SubeAd")
    private String subeAd;
    @Size(max = 250)
    @Column(name = "Adres")
    private String adres;
    @Size(max = 50)
    @Column(name = "Tel1")
    private String tel1;
    @Size(max = 50)
    @Column(name = "Tel2")
    private String tel2;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "Fax")
    private String fax;
    @Size(max = 50)
    @Column(name = "YetkiliKisi")
    private String yetkiliKisi;

    public Sube() {
    }

    public Sube(Integer pksube) {
        this.pksube = pksube;
    }

    public Integer getPksube() {
        return pksube;
    }

    public void setPksube(Integer pksube) {
        this.pksube = pksube;
    }

    public String getSubeAd() {
        return subeAd;
    }

    public void setSubeAd(String subeAd) {
        this.subeAd = subeAd;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getYetkiliKisi() {
        return yetkiliKisi;
    }

    public void setYetkiliKisi(String yetkiliKisi) {
        this.yetkiliKisi = yetkiliKisi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pksube != null ? pksube.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sube)) {
            return false;
        }
        Sube other = (Sube) object;
        if ((this.pksube == null && other.pksube != null) || (this.pksube != null && !this.pksube.equals(other.pksube))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Sube[ pksube=" + pksube + " ]";
    }
    
}
