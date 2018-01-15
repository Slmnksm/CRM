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
@Table(name = "TanimFirmaTip")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TanimFirmaTip.findAll", query = "SELECT t FROM TanimFirmaTip t"),
    @NamedQuery(name = "TanimFirmaTip.findByPkfirmatip", query = "SELECT t FROM TanimFirmaTip t WHERE t.pkfirmatip = :pkfirmatip"),
    @NamedQuery(name = "TanimFirmaTip.findByFirmaTip", query = "SELECT t FROM TanimFirmaTip t WHERE t.firmaTip = :firmaTip")})
public class TanimFirmaTip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkfirmatip")
    private Integer pkfirmatip;
    @Size(max = 50)
    @Column(name = "FirmaTip")
    private String firmaTip;

    public TanimFirmaTip() {
    }

    public TanimFirmaTip(Integer pkfirmatip) {
        this.pkfirmatip = pkfirmatip;
    }

    public Integer getPkfirmatip() {
        return pkfirmatip;
    }

    public void setPkfirmatip(Integer pkfirmatip) {
        this.pkfirmatip = pkfirmatip;
    }

    public String getFirmaTip() {
        return firmaTip;
    }

    public void setFirmaTip(String firmaTip) {
        this.firmaTip = firmaTip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkfirmatip != null ? pkfirmatip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TanimFirmaTip)) {
            return false;
        }
        TanimFirmaTip other = (TanimFirmaTip) object;
        if ((this.pkfirmatip == null && other.pkfirmatip != null) || (this.pkfirmatip != null && !this.pkfirmatip.equals(other.pkfirmatip))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.TanimFirmaTip[ pkfirmatip=" + pkfirmatip + " ]";
    }
    
}
