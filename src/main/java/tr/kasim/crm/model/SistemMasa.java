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
@Table(name = "SistemMasa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SistemMasa.findAll", query = "SELECT s FROM SistemMasa s"),
    @NamedQuery(name = "SistemMasa.findByPkmasa", query = "SELECT s FROM SistemMasa s WHERE s.pkmasa = :pkmasa"),
    @NamedQuery(name = "SistemMasa.findByMasaAd", query = "SELECT s FROM SistemMasa s WHERE s.masaAd = :masaAd"),
    @NamedQuery(name = "SistemMasa.findBySira", query = "SELECT s FROM SistemMasa s WHERE s.sira = :sira")})
public class SistemMasa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkmasa")
    private Integer pkmasa;
    @Size(max = 50)
    @Column(name = "MasaAd")
    private String masaAd;
    @Column(name = "Sira")
    private Integer sira;

    public SistemMasa() {
    }

    public SistemMasa(Integer pkmasa) {
        this.pkmasa = pkmasa;
    }

    public Integer getPkmasa() {
        return pkmasa;
    }

    public void setPkmasa(Integer pkmasa) {
        this.pkmasa = pkmasa;
    }

    public String getMasaAd() {
        return masaAd;
    }

    public void setMasaAd(String masaAd) {
        this.masaAd = masaAd;
    }

    public Integer getSira() {
        return sira;
    }

    public void setSira(Integer sira) {
        this.sira = sira;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkmasa != null ? pkmasa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SistemMasa)) {
            return false;
        }
        SistemMasa other = (SistemMasa) object;
        if ((this.pkmasa == null && other.pkmasa != null) || (this.pkmasa != null && !this.pkmasa.equals(other.pkmasa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SistemMasa[ pkmasa=" + pkmasa + " ]";
    }
    
}
