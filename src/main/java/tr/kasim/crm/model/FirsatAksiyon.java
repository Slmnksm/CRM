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
@Table(name = "FirsatAksiyon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FirsatAksiyon.findAll", query = "SELECT f FROM FirsatAksiyon f"),
    @NamedQuery(name = "FirsatAksiyon.findByPkFirsatAks", query = "SELECT f FROM FirsatAksiyon f WHERE f.pkFirsatAks = :pkFirsatAks"),
    @NamedQuery(name = "FirsatAksiyon.findByFkfirsat", query = "SELECT f FROM FirsatAksiyon f WHERE f.fkfirsat = :fkfirsat"),
    @NamedQuery(name = "FirsatAksiyon.findByAksiyon", query = "SELECT f FROM FirsatAksiyon f WHERE f.aksiyon = :aksiyon"),
    @NamedQuery(name = "FirsatAksiyon.findByKisi", query = "SELECT f FROM FirsatAksiyon f WHERE f.kisi = :kisi"),
    @NamedQuery(name = "FirsatAksiyon.findByAciklama", query = "SELECT f FROM FirsatAksiyon f WHERE f.aciklama = :aciklama"),
    @NamedQuery(name = "FirsatAksiyon.findByTarih", query = "SELECT f FROM FirsatAksiyon f WHERE f.tarih = :tarih")})
public class FirsatAksiyon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkFirsatAks")
    private Integer pkFirsatAks;
    @Column(name = "fkfirsat")
    private Integer fkfirsat;
    @Size(max = 50)
    @Column(name = "Aksiyon")
    private String aksiyon;
    @Size(max = 50)
    @Column(name = "Kisi")
    private String kisi;
    @Size(max = 150)
    @Column(name = "Aciklama")
    private String aciklama;
    @Column(name = "Tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;

    public FirsatAksiyon() {
    }

    public FirsatAksiyon(Integer pkFirsatAks) {
        this.pkFirsatAks = pkFirsatAks;
    }

    public Integer getPkFirsatAks() {
        return pkFirsatAks;
    }

    public void setPkFirsatAks(Integer pkFirsatAks) {
        this.pkFirsatAks = pkFirsatAks;
    }

    public Integer getFkfirsat() {
        return fkfirsat;
    }

    public void setFkfirsat(Integer fkfirsat) {
        this.fkfirsat = fkfirsat;
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

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkFirsatAks != null ? pkFirsatAks.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FirsatAksiyon)) {
            return false;
        }
        FirsatAksiyon other = (FirsatAksiyon) object;
        if ((this.pkFirsatAks == null && other.pkFirsatAks != null) || (this.pkFirsatAks != null && !this.pkFirsatAks.equals(other.pkFirsatAks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.FirsatAksiyon[ pkFirsatAks=" + pkFirsatAks + " ]";
    }
    
}
