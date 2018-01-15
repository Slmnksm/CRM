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
@Table(name = "FirsatListe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FirsatListe.findAll", query = "SELECT f FROM FirsatListe f"),
    @NamedQuery(name = "FirsatListe.findByFirsatAdi", query = "SELECT f FROM FirsatListe f WHERE f.firsatAdi = :firsatAdi"),
    @NamedQuery(name = "FirsatListe.findByFirsatNo", query = "SELECT f FROM FirsatListe f WHERE f.firsatNo = :firsatNo"),
    @NamedQuery(name = "FirsatListe.findById", query = "SELECT f FROM FirsatListe f WHERE f.id = :id")})
public class FirsatListe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "FirsatAdi")
    private String firsatAdi;
    @Column(name = "FirsatNo")
    private Integer firsatNo;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;

    public FirsatListe() {
    }

    public FirsatListe(Integer id) {
        this.id = id;
    }

    public String getFirsatAdi() {
        return firsatAdi;
    }

    public void setFirsatAdi(String firsatAdi) {
        this.firsatAdi = firsatAdi;
    }

    public Integer getFirsatNo() {
        return firsatNo;
    }

    public void setFirsatNo(Integer firsatNo) {
        this.firsatNo = firsatNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FirsatListe)) {
            return false;
        }
        FirsatListe other = (FirsatListe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.FirsatListe[ id=" + id + " ]";
    }
    
}
