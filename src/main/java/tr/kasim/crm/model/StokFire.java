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
@Table(name = "StokFire")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StokFire.findAll", query = "SELECT s FROM StokFire s"),
    @NamedQuery(name = "StokFire.findByPkfire", query = "SELECT s FROM StokFire s WHERE s.pkfire = :pkfire"),
    @NamedQuery(name = "StokFire.findByFkstok", query = "SELECT s FROM StokFire s WHERE s.fkstok = :fkstok"),
    @NamedQuery(name = "StokFire.findByKullanilan", query = "SELECT s FROM StokFire s WHERE s.kullanilan = :kullanilan"),
    @NamedQuery(name = "StokFire.findByKalan", query = "SELECT s FROM StokFire s WHERE s.kalan = :kalan"),
    @NamedQuery(name = "StokFire.findByAciklama", query = "SELECT s FROM StokFire s WHERE s.aciklama = :aciklama"),
    @NamedQuery(name = "StokFire.findByTarih", query = "SELECT s FROM StokFire s WHERE s.tarih = :tarih")})
public class StokFire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkfire")
    private Integer pkfire;
    @Column(name = "fkstok")
    private Integer fkstok;
    @Size(max = 50)
    @Column(name = "kullanilan")
    private String kullanilan;
    @Size(max = 50)
    @Column(name = "kalan")
    private String kalan;
    @Size(max = 250)
    @Column(name = "aciklama")
    private String aciklama;
    @Column(name = "tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;

    public StokFire() {
    }

    public StokFire(Integer pkfire) {
        this.pkfire = pkfire;
    }

    public Integer getPkfire() {
        return pkfire;
    }

    public void setPkfire(Integer pkfire) {
        this.pkfire = pkfire;
    }

    public Integer getFkstok() {
        return fkstok;
    }

    public void setFkstok(Integer fkstok) {
        this.fkstok = fkstok;
    }

    public String getKullanilan() {
        return kullanilan;
    }

    public void setKullanilan(String kullanilan) {
        this.kullanilan = kullanilan;
    }

    public String getKalan() {
        return kalan;
    }

    public void setKalan(String kalan) {
        this.kalan = kalan;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkfire != null ? pkfire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StokFire)) {
            return false;
        }
        StokFire other = (StokFire) object;
        if ((this.pkfire == null && other.pkfire != null) || (this.pkfire != null && !this.pkfire.equals(other.pkfire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.StokFire[ pkfire=" + pkfire + " ]";
    }
    
}
