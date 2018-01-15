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
@Table(name = "ArizaDosya")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ArizaDosya.findAll", query = "SELECT a FROM ArizaDosya a"),
    @NamedQuery(name = "ArizaDosya.findByPkdosyalar", query = "SELECT a FROM ArizaDosya a WHERE a.pkdosyalar = :pkdosyalar"),
    @NamedQuery(name = "ArizaDosya.findByUstno", query = "SELECT a FROM ArizaDosya a WHERE a.ustno = :ustno"),
    @NamedQuery(name = "ArizaDosya.findByDosyaad", query = "SELECT a FROM ArizaDosya a WHERE a.dosyaad = :dosyaad")})
public class ArizaDosya implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkdosyalar")
    private Integer pkdosyalar;
    @Column(name = "Ustno")
    private Integer ustno;
    @Size(max = 250)
    @Column(name = "dosyaad")
    private String dosyaad;

    public ArizaDosya() {
    }

    public ArizaDosya(Integer pkdosyalar) {
        this.pkdosyalar = pkdosyalar;
    }

    public Integer getPkdosyalar() {
        return pkdosyalar;
    }

    public void setPkdosyalar(Integer pkdosyalar) {
        this.pkdosyalar = pkdosyalar;
    }

    public Integer getUstno() {
        return ustno;
    }

    public void setUstno(Integer ustno) {
        this.ustno = ustno;
    }

    public String getDosyaad() {
        return dosyaad;
    }

    public void setDosyaad(String dosyaad) {
        this.dosyaad = dosyaad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkdosyalar != null ? pkdosyalar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArizaDosya)) {
            return false;
        }
        ArizaDosya other = (ArizaDosya) object;
        if ((this.pkdosyalar == null && other.pkdosyalar != null) || (this.pkdosyalar != null && !this.pkdosyalar.equals(other.pkdosyalar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.ArizaDosya[ pkdosyalar=" + pkdosyalar + " ]";
    }
    
}
