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
@Table(name = "SistemKasa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SistemKasa.findAll", query = "SELECT s FROM SistemKasa s"),
    @NamedQuery(name = "SistemKasa.findByPkkasa", query = "SELECT s FROM SistemKasa s WHERE s.pkkasa = :pkkasa"),
    @NamedQuery(name = "SistemKasa.findByKasaNo", query = "SELECT s FROM SistemKasa s WHERE s.kasaNo = :kasaNo"),
    @NamedQuery(name = "SistemKasa.findByKasaAd", query = "SELECT s FROM SistemKasa s WHERE s.kasaAd = :kasaAd")})
public class SistemKasa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkkasa")
    private Integer pkkasa;
    @Size(max = 10)
    @Column(name = "KasaNo")
    private String kasaNo;
    @Size(max = 50)
    @Column(name = "KasaAd")
    private String kasaAd;

    public SistemKasa() {
    }

    public SistemKasa(Integer pkkasa) {
        this.pkkasa = pkkasa;
    }

    public Integer getPkkasa() {
        return pkkasa;
    }

    public void setPkkasa(Integer pkkasa) {
        this.pkkasa = pkkasa;
    }

    public String getKasaNo() {
        return kasaNo;
    }

    public void setKasaNo(String kasaNo) {
        this.kasaNo = kasaNo;
    }

    public String getKasaAd() {
        return kasaAd;
    }

    public void setKasaAd(String kasaAd) {
        this.kasaAd = kasaAd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkkasa != null ? pkkasa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SistemKasa)) {
            return false;
        }
        SistemKasa other = (SistemKasa) object;
        if ((this.pkkasa == null && other.pkkasa != null) || (this.pkkasa != null && !this.pkkasa.equals(other.pkkasa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SistemKasa[ pkkasa=" + pkkasa + " ]";
    }
    
}
