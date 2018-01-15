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
@Table(name = "SiparisDurum")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SiparisDurum.findAll", query = "SELECT s FROM SiparisDurum s"),
    @NamedQuery(name = "SiparisDurum.findByPkkayitno", query = "SELECT s FROM SiparisDurum s WHERE s.pkkayitno = :pkkayitno"),
    @NamedQuery(name = "SiparisDurum.findBySiparisno", query = "SELECT s FROM SiparisDurum s WHERE s.siparisno = :siparisno"),
    @NamedQuery(name = "SiparisDurum.findByTarih", query = "SELECT s FROM SiparisDurum s WHERE s.tarih = :tarih"),
    @NamedQuery(name = "SiparisDurum.findByGonderen", query = "SELECT s FROM SiparisDurum s WHERE s.gonderen = :gonderen"),
    @NamedQuery(name = "SiparisDurum.findByGonderilen", query = "SELECT s FROM SiparisDurum s WHERE s.gonderilen = :gonderilen"),
    @NamedQuery(name = "SiparisDurum.findByGonkisi", query = "SELECT s FROM SiparisDurum s WHERE s.gonkisi = :gonkisi"),
    @NamedQuery(name = "SiparisDurum.findByDurum", query = "SELECT s FROM SiparisDurum s WHERE s.durum = :durum"),
    @NamedQuery(name = "SiparisDurum.findByAciklama", query = "SELECT s FROM SiparisDurum s WHERE s.aciklama = :aciklama")})
public class SiparisDurum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkkayitno")
    private Integer pkkayitno;
    @Column(name = "siparisno")
    private Integer siparisno;
    @Column(name = "tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    @Size(max = 50)
    @Column(name = "gonderen")
    private String gonderen;
    @Size(max = 50)
    @Column(name = "gonderilen")
    private String gonderilen;
    @Size(max = 50)
    @Column(name = "gonkisi")
    private String gonkisi;
    @Size(max = 50)
    @Column(name = "durum")
    private String durum;
    @Size(max = 50)
    @Column(name = "aciklama")
    private String aciklama;

    public SiparisDurum() {
    }

    public SiparisDurum(Integer pkkayitno) {
        this.pkkayitno = pkkayitno;
    }

    public Integer getPkkayitno() {
        return pkkayitno;
    }

    public void setPkkayitno(Integer pkkayitno) {
        this.pkkayitno = pkkayitno;
    }

    public Integer getSiparisno() {
        return siparisno;
    }

    public void setSiparisno(Integer siparisno) {
        this.siparisno = siparisno;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getGonderen() {
        return gonderen;
    }

    public void setGonderen(String gonderen) {
        this.gonderen = gonderen;
    }

    public String getGonderilen() {
        return gonderilen;
    }

    public void setGonderilen(String gonderilen) {
        this.gonderilen = gonderilen;
    }

    public String getGonkisi() {
        return gonkisi;
    }

    public void setGonkisi(String gonkisi) {
        this.gonkisi = gonkisi;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
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
        hash += (pkkayitno != null ? pkkayitno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SiparisDurum)) {
            return false;
        }
        SiparisDurum other = (SiparisDurum) object;
        if ((this.pkkayitno == null && other.pkkayitno != null) || (this.pkkayitno != null && !this.pkkayitno.equals(other.pkkayitno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SiparisDurum[ pkkayitno=" + pkkayitno + " ]";
    }
    
}
