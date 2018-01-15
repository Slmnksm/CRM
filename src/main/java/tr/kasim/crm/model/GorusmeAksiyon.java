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
@Table(name = "GorusmeAksiyon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GorusmeAksiyon.findAll", query = "SELECT g FROM GorusmeAksiyon g"),
    @NamedQuery(name = "GorusmeAksiyon.findByPkAksiyon", query = "SELECT g FROM GorusmeAksiyon g WHERE g.pkAksiyon = :pkAksiyon"),
    @NamedQuery(name = "GorusmeAksiyon.findByFkgorusme", query = "SELECT g FROM GorusmeAksiyon g WHERE g.fkgorusme = :fkgorusme"),
    @NamedQuery(name = "GorusmeAksiyon.findByAksiyon", query = "SELECT g FROM GorusmeAksiyon g WHERE g.aksiyon = :aksiyon"),
    @NamedQuery(name = "GorusmeAksiyon.findByKisi", query = "SELECT g FROM GorusmeAksiyon g WHERE g.kisi = :kisi"),
    @NamedQuery(name = "GorusmeAksiyon.findByAciklama", query = "SELECT g FROM GorusmeAksiyon g WHERE g.aciklama = :aciklama"),
    @NamedQuery(name = "GorusmeAksiyon.findBySonTarih", query = "SELECT g FROM GorusmeAksiyon g WHERE g.sonTarih = :sonTarih"),
    @NamedQuery(name = "GorusmeAksiyon.findByFkproje", query = "SELECT g FROM GorusmeAksiyon g WHERE g.fkproje = :fkproje")})
public class GorusmeAksiyon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkAksiyon")
    private Integer pkAksiyon;
    @Column(name = "fkgorusme")
    private Integer fkgorusme;
    @Size(max = 50)
    @Column(name = "Aksiyon")
    private String aksiyon;
    @Size(max = 50)
    @Column(name = "Kisi")
    private String kisi;
    @Size(max = 150)
    @Column(name = "Aciklama")
    private String aciklama;
    @Column(name = "SonTarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sonTarih;
    @Size(max = 10)
    @Column(name = "fkproje")
    private String fkproje;

    public GorusmeAksiyon() {
    }

    public GorusmeAksiyon(Integer pkAksiyon) {
        this.pkAksiyon = pkAksiyon;
    }

    public Integer getPkAksiyon() {
        return pkAksiyon;
    }

    public void setPkAksiyon(Integer pkAksiyon) {
        this.pkAksiyon = pkAksiyon;
    }

    public Integer getFkgorusme() {
        return fkgorusme;
    }

    public void setFkgorusme(Integer fkgorusme) {
        this.fkgorusme = fkgorusme;
    }

    public String getAksiyon() {
        return aksiyon;
    }

    public void setAksiyon(String aksiyon) {
        this.aksiyon = aksiyon;
    }

    public String getKisi() {
        return kisi;
    }

    public void setKisi(String kisi) {
        this.kisi = kisi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Date getSonTarih() {
        return sonTarih;
    }

    public void setSonTarih(Date sonTarih) {
        this.sonTarih = sonTarih;
    }

    public String getFkproje() {
        return fkproje;
    }

    public void setFkproje(String fkproje) {
        this.fkproje = fkproje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkAksiyon != null ? pkAksiyon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GorusmeAksiyon)) {
            return false;
        }
        GorusmeAksiyon other = (GorusmeAksiyon) object;
        if ((this.pkAksiyon == null && other.pkAksiyon != null) || (this.pkAksiyon != null && !this.pkAksiyon.equals(other.pkAksiyon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.GorusmeAksiyon[ pkAksiyon=" + pkAksiyon + " ]";
    }
    
}
