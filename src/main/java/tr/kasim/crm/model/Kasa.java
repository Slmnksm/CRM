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
@Table(name = "Kasa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kasa.findAll", query = "SELECT k FROM Kasa k"),
    @NamedQuery(name = "Kasa.findByPkKasa", query = "SELECT k FROM Kasa k WHERE k.pkKasa = :pkKasa"),
    @NamedQuery(name = "Kasa.findByKasaKodu", query = "SELECT k FROM Kasa k WHERE k.kasaKodu = :kasaKodu"),
    @NamedQuery(name = "Kasa.findByKasaAdi", query = "SELECT k FROM Kasa k WHERE k.kasaAdi = :kasaAdi"),
    @NamedQuery(name = "Kasa.findByMuhKod", query = "SELECT k FROM Kasa k WHERE k.muhKod = :muhKod"),
    @NamedQuery(name = "Kasa.findByMuhAdi", query = "SELECT k FROM Kasa k WHERE k.muhAdi = :muhAdi"),
    @NamedQuery(name = "Kasa.findByFkIsYeri", query = "SELECT k FROM Kasa k WHERE k.fkIsYeri = :fkIsYeri"),
    @NamedQuery(name = "Kasa.findBySil", query = "SELECT k FROM Kasa k WHERE k.sil = :sil")})
public class Kasa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkKasa")
    private Integer pkKasa;
    @Size(max = 50)
    @Column(name = "KasaKodu")
    private String kasaKodu;
    @Size(max = 50)
    @Column(name = "KasaAdi")
    private String kasaAdi;
    @Size(max = 50)
    @Column(name = "MuhKod")
    private String muhKod;
    @Size(max = 150)
    @Column(name = "MuhAdi")
    private String muhAdi;
    @Column(name = "fkIsYeri")
    private Integer fkIsYeri;
    @Column(name = "sil")
    private Boolean sil;

    public Kasa() {
    }

    public Kasa(Integer pkKasa) {
        this.pkKasa = pkKasa;
    }

    public Integer getPkKasa() {
        return pkKasa;
    }

    public void setPkKasa(Integer pkKasa) {
        this.pkKasa = pkKasa;
    }

    public String getKasaKodu() {
        return kasaKodu;
    }

    public void setKasaKodu(String kasaKodu) {
        this.kasaKodu = kasaKodu;
    }

    public String getKasaAdi() {
        return kasaAdi;
    }

    public void setKasaAdi(String kasaAdi) {
        this.kasaAdi = kasaAdi;
    }

    public String getMuhKod() {
        return muhKod;
    }

    public void setMuhKod(String muhKod) {
        this.muhKod = muhKod;
    }

    public String getMuhAdi() {
        return muhAdi;
    }

    public void setMuhAdi(String muhAdi) {
        this.muhAdi = muhAdi;
    }

    public Integer getFkIsYeri() {
        return fkIsYeri;
    }

    public void setFkIsYeri(Integer fkIsYeri) {
        this.fkIsYeri = fkIsYeri;
    }

    public Boolean getSil() {
        return sil;
    }

    public void setSil(Boolean sil) {
        this.sil = sil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkKasa != null ? pkKasa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kasa)) {
            return false;
        }
        Kasa other = (Kasa) object;
        if ((this.pkKasa == null && other.pkKasa != null) || (this.pkKasa != null && !this.pkKasa.equals(other.pkKasa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Kasa[ pkKasa=" + pkKasa + " ]";
    }
    
}
