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
@Table(name = "SistemBirim")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SistemBirim.findAll", query = "SELECT s FROM SistemBirim s"),
    @NamedQuery(name = "SistemBirim.findByPkBirimler", query = "SELECT s FROM SistemBirim s WHERE s.pkBirimler = :pkBirimler"),
    @NamedQuery(name = "SistemBirim.findByBirimAd", query = "SELECT s FROM SistemBirim s WHERE s.birimAd = :birimAd")})
public class SistemBirim implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkBirimler")
    private Integer pkBirimler;
    @Size(max = 50)
    @Column(name = "BirimAd")
    private String birimAd;

    public SistemBirim() {
    }

    public SistemBirim(Integer pkBirimler) {
        this.pkBirimler = pkBirimler;
    }

    public Integer getPkBirimler() {
        return pkBirimler;
    }

    public void setPkBirimler(Integer pkBirimler) {
        this.pkBirimler = pkBirimler;
    }

    public String getBirimAd() {
        return birimAd;
    }

    public void setBirimAd(String birimAd) {
        this.birimAd = birimAd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkBirimler != null ? pkBirimler.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SistemBirim)) {
            return false;
        }
        SistemBirim other = (SistemBirim) object;
        if ((this.pkBirimler == null && other.pkBirimler != null) || (this.pkBirimler != null && !this.pkBirimler.equals(other.pkBirimler))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SistemBirim[ pkBirimler=" + pkBirimler + " ]";
    }
    
}
