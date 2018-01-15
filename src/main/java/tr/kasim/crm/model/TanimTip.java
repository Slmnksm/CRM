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
@Table(name = "TanimTip")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TanimTip.findAll", query = "SELECT t FROM TanimTip t"),
    @NamedQuery(name = "TanimTip.findByPkTip", query = "SELECT t FROM TanimTip t WHERE t.pkTip = :pkTip"),
    @NamedQuery(name = "TanimTip.findByTipAd", query = "SELECT t FROM TanimTip t WHERE t.tipAd = :tipAd"),
    @NamedQuery(name = "TanimTip.findByTip", query = "SELECT t FROM TanimTip t WHERE t.tip = :tip")})
public class TanimTip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkTip")
    private Integer pkTip;
    @Size(max = 50)
    @Column(name = "TipAd")
    private String tipAd;
    @Column(name = "Tip")
    private Short tip;

    public TanimTip() {
    }

    public TanimTip(Integer pkTip) {
        this.pkTip = pkTip;
    }

    public Integer getPkTip() {
        return pkTip;
    }

    public void setPkTip(Integer pkTip) {
        this.pkTip = pkTip;
    }

    public String getTipAd() {
        return tipAd;
    }

    public void setTipAd(String tipAd) {
        this.tipAd = tipAd;
    }

    public Short getTip() {
        return tip;
    }

    public void setTip(Short tip) {
        this.tip = tip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkTip != null ? pkTip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TanimTip)) {
            return false;
        }
        TanimTip other = (TanimTip) object;
        if ((this.pkTip == null && other.pkTip != null) || (this.pkTip != null && !this.pkTip.equals(other.pkTip))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.TanimTip[ pkTip=" + pkTip + " ]";
    }
    
}
