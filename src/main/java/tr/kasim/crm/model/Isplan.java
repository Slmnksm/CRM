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
@Table(name = "Isplan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Isplan.findAll", query = "SELECT \u0131 FROM Isplan \u0131"),
    @NamedQuery(name = "Isplan.findByPkisplan", query = "SELECT \u0131 FROM Isplan \u0131 WHERE \u0131.pkisplan = :pkisplan"),
    @NamedQuery(name = "Isplan.findByTarih", query = "SELECT \u0131 FROM Isplan \u0131 WHERE \u0131.tarih = :tarih"),
    @NamedQuery(name = "Isplan.findByIsAd", query = "SELECT \u0131 FROM Isplan \u0131 WHERE \u0131.isAd = :isAd"),
    @NamedQuery(name = "Isplan.findByIsAdres", query = "SELECT \u0131 FROM Isplan \u0131 WHERE \u0131.isAdres = :isAdres"),
    @NamedQuery(name = "Isplan.findByAciklama", query = "SELECT \u0131 FROM Isplan \u0131 WHERE \u0131.aciklama = :aciklama"),
    @NamedQuery(name = "Isplan.findByPersonel", query = "SELECT \u0131 FROM Isplan \u0131 WHERE \u0131.personel = :personel"),
    @NamedQuery(name = "Isplan.findByTip", query = "SELECT \u0131 FROM Isplan \u0131 WHERE \u0131.tip = :tip")})
public class Isplan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkisplan")
    private Integer pkisplan;
    @Column(name = "Tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    @Size(max = 150)
    @Column(name = "isAd")
    private String isAd;
    @Size(max = 150)
    @Column(name = "isAdres")
    private String isAdres;
    @Size(max = 250)
    @Column(name = "aciklama")
    private String aciklama;
    @Size(max = 250)
    @Column(name = "Personel")
    private String personel;
    @Size(max = 50)
    @Column(name = "Tip")
    private String tip;

    public Isplan() {
    }

    public Isplan(Integer pkisplan) {
        this.pkisplan = pkisplan;
    }

    public Integer getPkisplan() {
        return pkisplan;
    }

    public void setPkisplan(Integer pkisplan) {
        this.pkisplan = pkisplan;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getIsAd() {
        return isAd;
    }

    public void setIsAd(String isAd) {
        this.isAd = isAd;
    }

    public String getIsAdres() {
        return isAdres;
    }

    public void setIsAdres(String isAdres) {
        this.isAdres = isAdres;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getPersonel() {
        return personel;
    }

    public void setPersonel(String personel) {
        this.personel = personel;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkisplan != null ? pkisplan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Isplan)) {
            return false;
        }
        Isplan other = (Isplan) object;
        if ((this.pkisplan == null && other.pkisplan != null) || (this.pkisplan != null && !this.pkisplan.equals(other.pkisplan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Isplan[ pkisplan=" + pkisplan + " ]";
    }
    
}
