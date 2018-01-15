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
@Table(name = "StokAsama")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StokAsama.findAll", query = "SELECT s FROM StokAsama s"),
    @NamedQuery(name = "StokAsama.findByPkAsama", query = "SELECT s FROM StokAsama s WHERE s.pkAsama = :pkAsama"),
    @NamedQuery(name = "StokAsama.findByFkStok", query = "SELECT s FROM StokAsama s WHERE s.fkStok = :fkStok"),
    @NamedQuery(name = "StokAsama.findByAsama", query = "SELECT s FROM StokAsama s WHERE s.asama = :asama")})
public class StokAsama implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkAsama")
    private Integer pkAsama;
    @Column(name = "fkStok")
    private Integer fkStok;
    @Size(max = 50)
    @Column(name = "Asama")
    private String asama;

    public StokAsama() {
    }

    public StokAsama(Integer pkAsama) {
        this.pkAsama = pkAsama;
    }

    public Integer getPkAsama() {
        return pkAsama;
    }

    public void setPkAsama(Integer pkAsama) {
        this.pkAsama = pkAsama;
    }

    public Integer getFkStok() {
        return fkStok;
    }

    public void setFkStok(Integer fkStok) {
        this.fkStok = fkStok;
    }

    public String getAsama() {
        return asama;
    }

    public void setAsama(String asama) {
        this.asama = asama;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkAsama != null ? pkAsama.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StokAsama)) {
            return false;
        }
        StokAsama other = (StokAsama) object;
        if ((this.pkAsama == null && other.pkAsama != null) || (this.pkAsama != null && !this.pkAsama.equals(other.pkAsama))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.StokAsama[ pkAsama=" + pkAsama + " ]";
    }
    
}
