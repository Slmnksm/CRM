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
@Table(name = "TanimKasa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TanimKasa.findAll", query = "SELECT t FROM TanimKasa t"),
    @NamedQuery(name = "TanimKasa.findByPkkasa", query = "SELECT t FROM TanimKasa t WHERE t.pkkasa = :pkkasa"),
    @NamedQuery(name = "TanimKasa.findByKasaKodu", query = "SELECT t FROM TanimKasa t WHERE t.kasaKodu = :kasaKodu"),
    @NamedQuery(name = "TanimKasa.findByKasaAd", query = "SELECT t FROM TanimKasa t WHERE t.kasaAd = :kasaAd")})
public class TanimKasa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkkasa")
    private Integer pkkasa;
    @Size(max = 20)
    @Column(name = "KasaKodu")
    private String kasaKodu;
    @Size(max = 150)
    @Column(name = "KasaAd")
    private String kasaAd;

    public TanimKasa() {
    }

    public TanimKasa(Integer pkkasa) {
        this.pkkasa = pkkasa;
    }

    public Integer getPkkasa() {
        return pkkasa;
    }

    public void setPkkasa(Integer pkkasa) {
        this.pkkasa = pkkasa;
    }

    public String getKasaKodu() {
        return kasaKodu;
    }

    public void setKasaKodu(String kasaKodu) {
        this.kasaKodu = kasaKodu;
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
        if (!(object instanceof TanimKasa)) {
            return false;
        }
        TanimKasa other = (TanimKasa) object;
        if ((this.pkkasa == null && other.pkkasa != null) || (this.pkkasa != null && !this.pkkasa.equals(other.pkkasa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.TanimKasa[ pkkasa=" + pkkasa + " ]";
    }
    
}
