/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "Mesac")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesac.findAll", query = "SELECT m FROM Mesac m"),
    @NamedQuery(name = "Mesac.findById", query = "SELECT m FROM Mesac m WHERE m.id = :id"),
    @NamedQuery(name = "Mesac.findByGonderen", query = "SELECT m FROM Mesac m WHERE m.gonderen = :gonderen"),
    @NamedQuery(name = "Mesac.findByGonderilen", query = "SELECT m FROM Mesac m WHERE m.gonderilen = :gonderilen"),
    @NamedQuery(name = "Mesac.findByTarihSaat", query = "SELECT m FROM Mesac m WHERE m.tarihSaat = :tarihSaat"),
    @NamedQuery(name = "Mesac.findByMesaj", query = "SELECT m FROM Mesac m WHERE m.mesaj = :mesaj"),
    @NamedQuery(name = "Mesac.findByOkundu", query = "SELECT m FROM Mesac m WHERE m.okundu = :okundu"),
    @NamedQuery(name = "Mesac.findBySaat", query = "SELECT m FROM Mesac m WHERE m.saat = :saat")})
public class Mesac implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "Gonderen")
    private Integer gonderen;
    @Column(name = "Gonderilen")
    private Integer gonderilen;
    @Column(name = "TarihSaat")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarihSaat;
    @Size(max = 500)
    @Column(name = "Mesaj")
    private String mesaj;
    @Column(name = "Okundu")
    private Integer okundu;
    @Size(max = 50)
    @Column(name = "Saat")
    private String saat;

    public Mesac() {
    }

    public Mesac(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGonderen() {
        return gonderen;
    }

    public void setGonderen(Integer gonderen) {
        this.gonderen = gonderen;
    }

    public Integer getGonderilen() {
        return gonderilen;
    }

    public void setGonderilen(Integer gonderilen) {
        this.gonderilen = gonderilen;
    }

    public Date getTarihSaat() {
        return tarihSaat;
    }

    public void setTarihSaat(Date tarihSaat) {
        this.tarihSaat = tarihSaat;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public Integer getOkundu() {
        return okundu;
    }

    public void setOkundu(Integer okundu) {
        this.okundu = okundu;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
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
        if (!(object instanceof Mesac)) {
            return false;
        }
        Mesac other = (Mesac) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Mesac[ id=" + id + " ]";
    }
    
}
