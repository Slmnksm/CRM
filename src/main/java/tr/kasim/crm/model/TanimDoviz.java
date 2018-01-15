/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "TanimDoviz")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TanimDoviz.findAll", query = "SELECT t FROM TanimDoviz t"),
    @NamedQuery(name = "TanimDoviz.findByPkdoviz", query = "SELECT t FROM TanimDoviz t WHERE t.pkdoviz = :pkdoviz"),
    @NamedQuery(name = "TanimDoviz.findByTarih", query = "SELECT t FROM TanimDoviz t WHERE t.tarih = :tarih"),
    @NamedQuery(name = "TanimDoviz.findByUsd", query = "SELECT t FROM TanimDoviz t WHERE t.usd = :usd"),
    @NamedQuery(name = "TanimDoviz.findByEuro", query = "SELECT t FROM TanimDoviz t WHERE t.euro = :euro")})
public class TanimDoviz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkdoviz")
    private Integer pkdoviz;
    @Column(name = "Tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "USD")
    private BigDecimal usd;
    @Column(name = "EURO")
    private BigDecimal euro;

    public TanimDoviz() {
    }

    public TanimDoviz(Integer pkdoviz) {
        this.pkdoviz = pkdoviz;
    }

    public Integer getPkdoviz() {
        return pkdoviz;
    }

    public void setPkdoviz(Integer pkdoviz) {
        this.pkdoviz = pkdoviz;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public BigDecimal getUsd() {
        return usd;
    }

    public void setUsd(BigDecimal usd) {
        this.usd = usd;
    }

    public BigDecimal getEuro() {
        return euro;
    }

    public void setEuro(BigDecimal euro) {
        this.euro = euro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkdoviz != null ? pkdoviz.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TanimDoviz)) {
            return false;
        }
        TanimDoviz other = (TanimDoviz) object;
        if ((this.pkdoviz == null && other.pkdoviz != null) || (this.pkdoviz != null && !this.pkdoviz.equals(other.pkdoviz))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.TanimDoviz[ pkdoviz=" + pkdoviz + " ]";
    }
    
}
