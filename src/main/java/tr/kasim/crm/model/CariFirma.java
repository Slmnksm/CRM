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
@Table(name = "CariFirma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CariFirma.findAll", query = "SELECT c FROM CariFirma c"),
    @NamedQuery(name = "CariFirma.findByPkCariFirma", query = "SELECT c FROM CariFirma c WHERE c.pkCariFirma = :pkCariFirma"),
    @NamedQuery(name = "CariFirma.findByFirmaKod", query = "SELECT c FROM CariFirma c WHERE c.firmaKod = :firmaKod"),
    @NamedQuery(name = "CariFirma.findByFirmaAD", query = "SELECT c FROM CariFirma c WHERE c.firmaAD = :firmaAD")})
public class CariFirma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkCariFirma")
    private Integer pkCariFirma;
    @Size(max = 50)
    @Column(name = "FirmaKod")
    private String firmaKod;
    @Size(max = 150)
    @Column(name = "FirmaAD")
    private String firmaAD;

    public CariFirma() {
    }

    public CariFirma(Integer pkCariFirma) {
        this.pkCariFirma = pkCariFirma;
    }

    public Integer getPkCariFirma() {
        return pkCariFirma;
    }

    public void setPkCariFirma(Integer pkCariFirma) {
        this.pkCariFirma = pkCariFirma;
    }

    public String getFirmaKod() {
        return firmaKod;
    }

    public void setFirmaKod(String firmaKod) {
        this.firmaKod = firmaKod;
    }

    public String getFirmaAD() {
        return firmaAD;
    }

    public void setFirmaAD(String firmaAD) {
        this.firmaAD = firmaAD;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkCariFirma != null ? pkCariFirma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CariFirma)) {
            return false;
        }
        CariFirma other = (CariFirma) object;
        if ((this.pkCariFirma == null && other.pkCariFirma != null) || (this.pkCariFirma != null && !this.pkCariFirma.equals(other.pkCariFirma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.CariFirma[ pkCariFirma=" + pkCariFirma + " ]";
    }
    
}
