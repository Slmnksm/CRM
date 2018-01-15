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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Firsat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Firsat.findAll", query = "SELECT f FROM Firsat f"),
    @NamedQuery(name = "Firsat.findByPkFirsat", query = "SELECT f FROM Firsat f WHERE f.pkFirsat = :pkFirsat"),
    @NamedQuery(name = "Firsat.findByTarih", query = "SELECT f FROM Firsat f WHERE f.tarih = :tarih"),
    @NamedQuery(name = "Firsat.findByAciklama", query = "SELECT f FROM Firsat f WHERE f.aciklama = :aciklama"),
    @NamedQuery(name = "Firsat.findByDurum", query = "SELECT f FROM Firsat f WHERE f.durum = :durum")})
public class Firsat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkFirsat")
    private Integer pkFirsat;
    @Column(name = "Tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    @Size(max = 250)
    @Column(name = "Aciklama")
    private String aciklama;
    @Size(max = 50)
    @Column(name = "Durum")
    private String durum;
    @JoinColumn(name = "fkFirma", referencedColumnName = "pkFirma")
    @ManyToOne(fetch = FetchType.LAZY)
    private Firma fkFirma;
    @JoinColumn(name = "fkProje", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ProjeDetay fkProje;

    public Firsat() {
    }

    public Firsat(Integer pkFirsat) {
        this.pkFirsat = pkFirsat;
    }

    public Integer getPkFirsat() {
        return pkFirsat;
    }

    public void setPkFirsat(Integer pkFirsat) {
        this.pkFirsat = pkFirsat;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
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

    public Firma getFkFirma() {
        return fkFirma;
    }

    public void setFkFirma(Firma fkFirma) {
        this.fkFirma = fkFirma;
    }

    public ProjeDetay getFkProje() {
        return fkProje;
    }

    public void setFkProje(ProjeDetay fkProje) {
        this.fkProje = fkProje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkFirsat != null ? pkFirsat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Firsat)) {
            return false;
        }
        Firsat other = (Firsat) object;
        if ((this.pkFirsat == null && other.pkFirsat != null) || (this.pkFirsat != null && !this.pkFirsat.equals(other.pkFirsat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Firsat[ pkFirsat=" + pkFirsat + " ]";
    }
    
}
