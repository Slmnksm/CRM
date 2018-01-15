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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "SiparisTeklif")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SiparisTeklif.findAll", query = "SELECT s FROM SiparisTeklif s"),
    @NamedQuery(name = "SiparisTeklif.findByPkteklif", query = "SELECT s FROM SiparisTeklif s WHERE s.pkteklif = :pkteklif"),
    @NamedQuery(name = "SiparisTeklif.findByUstno", query = "SELECT s FROM SiparisTeklif s WHERE s.ustno = :ustno"),
    @NamedQuery(name = "SiparisTeklif.findByTarih", query = "SELECT s FROM SiparisTeklif s WHERE s.tarih = :tarih"),
    @NamedQuery(name = "SiparisTeklif.findByAciklama", query = "SELECT s FROM SiparisTeklif s WHERE s.aciklama = :aciklama"),
    @NamedQuery(name = "SiparisTeklif.findByTutar", query = "SELECT s FROM SiparisTeklif s WHERE s.tutar = :tutar"),
    @NamedQuery(name = "SiparisTeklif.findByTeklifDetay", query = "SELECT s FROM SiparisTeklif s WHERE s.teklifDetay = :teklifDetay")})
public class SiparisTeklif implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkteklif")
    private Integer pkteklif;
    @Column(name = "ustno")
    private Integer ustno;
    @Column(name = "tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    @Size(max = 50)
    @Column(name = "Aciklama")
    private String aciklama;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Tutar")
    private BigDecimal tutar;
    @Size(max = 1073741823)
    @Column(name = "TeklifDetay")
    private String teklifDetay;

    public SiparisTeklif() {
    }

    public SiparisTeklif(Integer pkteklif) {
        this.pkteklif = pkteklif;
    }

    public Integer getPkteklif() {
        return pkteklif;
    }

    public void setPkteklif(Integer pkteklif) {
        this.pkteklif = pkteklif;
    }

    public Integer getUstno() {
        return ustno;
    }

    public void setUstno(Integer ustno) {
        this.ustno = ustno;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public BigDecimal getTutar() {
        return tutar;
    }

    public void setTutar(BigDecimal tutar) {
        this.tutar = tutar;
    }

    public String getTeklifDetay() {
        return teklifDetay;
    }

    public void setTeklifDetay(String teklifDetay) {
        this.teklifDetay = teklifDetay;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkteklif != null ? pkteklif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SiparisTeklif)) {
            return false;
        }
        SiparisTeklif other = (SiparisTeklif) object;
        if ((this.pkteklif == null && other.pkteklif != null) || (this.pkteklif != null && !this.pkteklif.equals(other.pkteklif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SiparisTeklif[ pkteklif=" + pkteklif + " ]";
    }
    
}
