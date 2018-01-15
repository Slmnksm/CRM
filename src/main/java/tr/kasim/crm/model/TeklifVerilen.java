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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "TeklifVerilen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TeklifVerilen.findAll", query = "SELECT t FROM TeklifVerilen t"),
    @NamedQuery(name = "TeklifVerilen.findByTeklifVerilenId", query = "SELECT t FROM TeklifVerilen t WHERE t.teklifVerilenId = :teklifVerilenId"),
    @NamedQuery(name = "TeklifVerilen.findByFormUIid", query = "SELECT t FROM TeklifVerilen t WHERE t.formUIid = :formUIid"),
    @NamedQuery(name = "TeklifVerilen.findByTip", query = "SELECT t FROM TeklifVerilen t WHERE t.tip = :tip")})
public class TeklifVerilen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "teklifVerilenId")
    private Integer teklifVerilenId;
    @Column(name = "formUIid")
    private Integer formUIid;
    @Column(name = "tip")
    private Integer tip;

    public TeklifVerilen() {
    }

    public TeklifVerilen(Integer teklifVerilenId) {
        this.teklifVerilenId = teklifVerilenId;
    }

    public Integer getTeklifVerilenId() {
        return teklifVerilenId;
    }

    public void setTeklifVerilenId(Integer teklifVerilenId) {
        this.teklifVerilenId = teklifVerilenId;
    }

    public Integer getFormUIid() {
        return formUIid;
    }

    public void setFormUIid(Integer formUIid) {
        this.formUIid = formUIid;
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
        hash += (teklifVerilenId != null ? teklifVerilenId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeklifVerilen)) {
            return false;
        }
        TeklifVerilen other = (TeklifVerilen) object;
        if ((this.teklifVerilenId == null && other.teklifVerilenId != null) || (this.teklifVerilenId != null && !this.teklifVerilenId.equals(other.teklifVerilenId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.TeklifVerilen[ teklifVerilenId=" + teklifVerilenId + " ]";
    }
    
}
