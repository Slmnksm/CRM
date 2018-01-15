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
@Table(name = "Birim")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Birim.findAll", query = "SELECT b FROM Birim b"),
    @NamedQuery(name = "Birim.findByPkBirim", query = "SELECT b FROM Birim b WHERE b.pkBirim = :pkBirim"),
    @NamedQuery(name = "Birim.findByBirimAd", query = "SELECT b FROM Birim b WHERE b.birimAd = :birimAd"),
    @NamedQuery(name = "Birim.findByTip", query = "SELECT b FROM Birim b WHERE b.tip = :tip")})
public class Birim implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkBirim")
    private Integer pkBirim;
    @Size(max = 50)
    @Column(name = "BirimAd")
    private String birimAd;
    @Column(name = "Tip")
    private Integer tip;

    public Birim() {
    }

    public Birim(Integer pkBirim) {
        this.pkBirim = pkBirim;
    }

    public Integer getPkBirim() {
        return pkBirim;
    }

    public void setPkBirim(Integer pkBirim) {
        this.pkBirim = pkBirim;
    }

    public String getBirimAd() {
        return birimAd;
    }

    public void setBirimAd(String birimAd) {
        this.birimAd = birimAd;
    }

    public Integer getTip() {
        return tip;
    }

    public void setTip(Integer tip) {
        this.tip = tip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkBirim != null ? pkBirim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Birim)) {
            return false;
        }
        Birim other = (Birim) object;
        if ((this.pkBirim == null && other.pkBirim != null) || (this.pkBirim != null && !this.pkBirim.equals(other.pkBirim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Birim[ pkBirim=" + pkBirim + " ]";
    }
    
}
