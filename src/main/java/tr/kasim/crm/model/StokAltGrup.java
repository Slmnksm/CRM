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
@Table(name = "StokAltGrup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StokAltGrup.findAll", query = "SELECT s FROM StokAltGrup s"),
    @NamedQuery(name = "StokAltGrup.findByPkStokAltGrup", query = "SELECT s FROM StokAltGrup s WHERE s.pkStokAltGrup = :pkStokAltGrup"),
    @NamedQuery(name = "StokAltGrup.findByAd", query = "SELECT s FROM StokAltGrup s WHERE s.ad = :ad"),
    @NamedQuery(name = "StokAltGrup.findByFkAna", query = "SELECT s FROM StokAltGrup s WHERE s.fkAna = :fkAna"),
    @NamedQuery(name = "StokAltGrup.findByFkAlt", query = "SELECT s FROM StokAltGrup s WHERE s.fkAlt = :fkAlt")})
public class StokAltGrup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkStokAltGrup")
    private Integer pkStokAltGrup;
    @Size(max = 50)
    @Column(name = "Ad")
    private String ad;
    @Column(name = "fkAna")
    private Integer fkAna;
    @Column(name = "fkAlt")
    private Integer fkAlt;

    public StokAltGrup() {
    }

    public StokAltGrup(Integer pkStokAltGrup) {
        this.pkStokAltGrup = pkStokAltGrup;
    }

    public Integer getPkStokAltGrup() {
        return pkStokAltGrup;
    }

    public void setPkStokAltGrup(Integer pkStokAltGrup) {
        this.pkStokAltGrup = pkStokAltGrup;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Integer getFkAna() {
        return fkAna;
    }

    public void setFkAna(Integer fkAna) {
        this.fkAna = fkAna;
    }

    public Integer getFkAlt() {
        return fkAlt;
    }

    public void setFkAlt(Integer fkAlt) {
        this.fkAlt = fkAlt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkStokAltGrup != null ? pkStokAltGrup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StokAltGrup)) {
            return false;
        }
        StokAltGrup other = (StokAltGrup) object;
        if ((this.pkStokAltGrup == null && other.pkStokAltGrup != null) || (this.pkStokAltGrup != null && !this.pkStokAltGrup.equals(other.pkStokAltGrup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.StokAltGrup[ pkStokAltGrup=" + pkStokAltGrup + " ]";
    }
    
}
