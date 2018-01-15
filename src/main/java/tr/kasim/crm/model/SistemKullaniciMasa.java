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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "SistemKullaniciMasa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SistemKullaniciMasa.findAll", query = "SELECT s FROM SistemKullaniciMasa s"),
    @NamedQuery(name = "SistemKullaniciMasa.findByPkkulmasa", query = "SELECT s FROM SistemKullaniciMasa s WHERE s.pkkulmasa = :pkkulmasa"),
    @NamedQuery(name = "SistemKullaniciMasa.findByFkkullanici", query = "SELECT s FROM SistemKullaniciMasa s WHERE s.fkkullanici = :fkkullanici"),
    @NamedQuery(name = "SistemKullaniciMasa.findByFkmasa", query = "SELECT s FROM SistemKullaniciMasa s WHERE s.fkmasa = :fkmasa")})
public class SistemKullaniciMasa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkkulmasa")
    private Integer pkkulmasa;
    @Column(name = "fkkullanici")
    private Integer fkkullanici;
    @Column(name = "fkmasa")
    private Integer fkmasa;

    public SistemKullaniciMasa() {
    }

    public SistemKullaniciMasa(Integer pkkulmasa) {
        this.pkkulmasa = pkkulmasa;
    }

    public Integer getPkkulmasa() {
        return pkkulmasa;
    }

    public void setPkkulmasa(Integer pkkulmasa) {
        this.pkkulmasa = pkkulmasa;
    }

    public Integer getFkkullanici() {
        return fkkullanici;
    }

    public void setFkkullanici(Integer fkkullanici) {
        this.fkkullanici = fkkullanici;
    }

    public Integer getFkmasa() {
        return fkmasa;
    }

    public void setFkmasa(Integer fkmasa) {
        this.fkmasa = fkmasa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkkulmasa != null ? pkkulmasa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SistemKullaniciMasa)) {
            return false;
        }
        SistemKullaniciMasa other = (SistemKullaniciMasa) object;
        if ((this.pkkulmasa == null && other.pkkulmasa != null) || (this.pkkulmasa != null && !this.pkkulmasa.equals(other.pkkulmasa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SistemKullaniciMasa[ pkkulmasa=" + pkkulmasa + " ]";
    }
    
}
