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
@Table(name = "SiparisSurec")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SiparisSurec.findAll", query = "SELECT s FROM SiparisSurec s"),
    @NamedQuery(name = "SiparisSurec.findByPksurec", query = "SELECT s FROM SiparisSurec s WHERE s.pksurec = :pksurec"),
    @NamedQuery(name = "SiparisSurec.findBySiparisno", query = "SELECT s FROM SiparisSurec s WHERE s.siparisno = :siparisno"),
    @NamedQuery(name = "SiparisSurec.findBySurecbaslama", query = "SELECT s FROM SiparisSurec s WHERE s.surecbaslama = :surecbaslama"),
    @NamedQuery(name = "SiparisSurec.findBySurecislemzaman", query = "SELECT s FROM SiparisSurec s WHERE s.surecislemzaman = :surecislemzaman"),
    @NamedQuery(name = "SiparisSurec.findByFksurecbaslatan", query = "SELECT s FROM SiparisSurec s WHERE s.fksurecbaslatan = :fksurecbaslatan"),
    @NamedQuery(name = "SiparisSurec.findBySurecbaslatan", query = "SELECT s FROM SiparisSurec s WHERE s.surecbaslatan = :surecbaslatan"),
    @NamedQuery(name = "SiparisSurec.findByBaslatan", query = "SELECT s FROM SiparisSurec s WHERE s.baslatan = :baslatan"),
    @NamedQuery(name = "SiparisSurec.findBySurecgonderen", query = "SELECT s FROM SiparisSurec s WHERE s.surecgonderen = :surecgonderen"),
    @NamedQuery(name = "SiparisSurec.findByGonderen", query = "SELECT s FROM SiparisSurec s WHERE s.gonderen = :gonderen"),
    @NamedQuery(name = "SiparisSurec.findBySurecgonderilen", query = "SELECT s FROM SiparisSurec s WHERE s.surecgonderilen = :surecgonderilen"),
    @NamedQuery(name = "SiparisSurec.findByGonderilen", query = "SELECT s FROM SiparisSurec s WHERE s.gonderilen = :gonderilen"),
    @NamedQuery(name = "SiparisSurec.findByDurum", query = "SELECT s FROM SiparisSurec s WHERE s.durum = :durum"),
    @NamedQuery(name = "SiparisSurec.findByAciklama", query = "SELECT s FROM SiparisSurec s WHERE s.aciklama = :aciklama")})
public class SiparisSurec implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pksurec")
    private Integer pksurec;
    @Column(name = "siparisno")
    private Integer siparisno;
    @Column(name = "surecbaslama")
    @Temporal(TemporalType.TIMESTAMP)
    private Date surecbaslama;
    @Column(name = "surecislemzaman")
    @Temporal(TemporalType.TIMESTAMP)
    private Date surecislemzaman;
    @Column(name = "fksurecbaslatan")
    private Integer fksurecbaslatan;
    @Size(max = 50)
    @Column(name = "surecbaslatan")
    private String surecbaslatan;
    @Size(max = 50)
    @Column(name = "baslatan")
    private String baslatan;
    @Size(max = 50)
    @Column(name = "surecgonderen")
    private String surecgonderen;
    @Size(max = 50)
    @Column(name = "gonderen")
    private String gonderen;
    @Size(max = 50)
    @Column(name = "surecgonderilen")
    private String surecgonderilen;
    @Size(max = 50)
    @Column(name = "gonderilen")
    private String gonderilen;
    @Column(name = "durum")
    private Integer durum;
    @Size(max = 50)
    @Column(name = "aciklama")
    private String aciklama;

    public SiparisSurec() {
    }

    public SiparisSurec(Integer pksurec) {
        this.pksurec = pksurec;
    }

    public Integer getPksurec() {
        return pksurec;
    }

    public void setPksurec(Integer pksurec) {
        this.pksurec = pksurec;
    }

    public Integer getSiparisno() {
        return siparisno;
    }

    public void setSiparisno(Integer siparisno) {
        this.siparisno = siparisno;
    }

    public Date getSurecbaslama() {
        return surecbaslama;
    }

    public void setSurecbaslama(Date surecbaslama) {
        this.surecbaslama = surecbaslama;
    }

    public Date getSurecislemzaman() {
        return surecislemzaman;
    }

    public void setSurecislemzaman(Date surecislemzaman) {
        this.surecislemzaman = surecislemzaman;
    }

    public Integer getFksurecbaslatan() {
        return fksurecbaslatan;
    }

    public void setFksurecbaslatan(Integer fksurecbaslatan) {
        this.fksurecbaslatan = fksurecbaslatan;
    }

    public String getSurecbaslatan() {
        return surecbaslatan;
    }

    public void setSurecbaslatan(String surecbaslatan) {
        this.surecbaslatan = surecbaslatan;
    }

    public String getBaslatan() {
        return baslatan;
    }

    public void setBaslatan(String baslatan) {
        this.baslatan = baslatan;
    }

    public String getSurecgonderen() {
        return surecgonderen;
    }

    public void setSurecgonderen(String surecgonderen) {
        this.surecgonderen = surecgonderen;
    }

    public String getGonderen() {
        return gonderen;
    }

    public void setGonderen(String gonderen) {
        this.gonderen = gonderen;
    }

    public String getSurecgonderilen() {
        return surecgonderilen;
    }

    public void setSurecgonderilen(String surecgonderilen) {
        this.surecgonderilen = surecgonderilen;
    }

    public String getGonderilen() {
        return gonderilen;
    }

    public void setGonderilen(String gonderilen) {
        this.gonderilen = gonderilen;
    }

    public Integer getDurum() {
        return durum;
    }

    public void setDurum(Integer durum) {
        this.durum = durum;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pksurec != null ? pksurec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SiparisSurec)) {
            return false;
        }
        SiparisSurec other = (SiparisSurec) object;
        if ((this.pksurec == null && other.pksurec != null) || (this.pksurec != null && !this.pksurec.equals(other.pksurec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SiparisSurec[ pksurec=" + pksurec + " ]";
    }
    
}
