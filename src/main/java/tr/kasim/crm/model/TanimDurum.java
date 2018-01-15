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
@Table(name = "TanimDurum")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TanimDurum.findAll", query = "SELECT t FROM TanimDurum t"),
    @NamedQuery(name = "TanimDurum.findByPkDurum", query = "SELECT t FROM TanimDurum t WHERE t.pkDurum = :pkDurum"),
    @NamedQuery(name = "TanimDurum.findByDurumAd", query = "SELECT t FROM TanimDurum t WHERE t.durumAd = :durumAd"),
    @NamedQuery(name = "TanimDurum.findByTip", query = "SELECT t FROM TanimDurum t WHERE t.tip = :tip")})
public class TanimDurum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkDurum")
    private Integer pkDurum;
    @Size(max = 50)
    @Column(name = "DurumAd")
    private String durumAd;
    @Column(name = "Tip")
    private Integer tip;

    public TanimDurum() {
    }

    public TanimDurum(Integer pkDurum) {
        this.pkDurum = pkDurum;
    }

    public Integer getPkDurum() {
        return pkDurum;
    }

    public void setPkDurum(Integer pkDurum) {
        this.pkDurum = pkDurum;
    }

    public String getDurumAd() {
        return durumAd;
    }

    public void setDurumAd(String durumAd) {
        this.durumAd = durumAd;
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
        hash += (pkDurum != null ? pkDurum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TanimDurum)) {
            return false;
        }
        TanimDurum other = (TanimDurum) object;
        if ((this.pkDurum == null && other.pkDurum != null) || (this.pkDurum != null && !this.pkDurum.equals(other.pkDurum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.TanimDurum[ pkDurum=" + pkDurum + " ]";
    }
    
}
