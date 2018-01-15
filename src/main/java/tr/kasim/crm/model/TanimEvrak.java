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
@Table(name = "TanimEvrak")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TanimEvrak.findAll", query = "SELECT t FROM TanimEvrak t"),
    @NamedQuery(name = "TanimEvrak.findByPkEvrak", query = "SELECT t FROM TanimEvrak t WHERE t.pkEvrak = :pkEvrak"),
    @NamedQuery(name = "TanimEvrak.findByEvrakTip", query = "SELECT t FROM TanimEvrak t WHERE t.evrakTip = :evrakTip")})
public class TanimEvrak implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkEvrak")
    private Integer pkEvrak;
    @Size(max = 50)
    @Column(name = "EvrakTip")
    private String evrakTip;

    public TanimEvrak() {
    }

    public TanimEvrak(Integer pkEvrak) {
        this.pkEvrak = pkEvrak;
    }

    public Integer getPkEvrak() {
        return pkEvrak;
    }

    public void setPkEvrak(Integer pkEvrak) {
        this.pkEvrak = pkEvrak;
    }

    public String getEvrakTip() {
        return evrakTip;
    }

    public void setEvrakTip(String evrakTip) {
        this.evrakTip = evrakTip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkEvrak != null ? pkEvrak.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TanimEvrak)) {
            return false;
        }
        TanimEvrak other = (TanimEvrak) object;
        if ((this.pkEvrak == null && other.pkEvrak != null) || (this.pkEvrak != null && !this.pkEvrak.equals(other.pkEvrak))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.TanimEvrak[ pkEvrak=" + pkEvrak + " ]";
    }
    
}
