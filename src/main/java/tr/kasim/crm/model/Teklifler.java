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
import javax.persistence.Lob;
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
@Table(name = "Teklifler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teklifler.findAll", query = "SELECT t FROM Teklifler t"),
    @NamedQuery(name = "Teklifler.findByPkteklif", query = "SELECT t FROM Teklifler t WHERE t.pkteklif = :pkteklif"),
    @NamedQuery(name = "Teklifler.findByTeklifKullanici", query = "SELECT t FROM Teklifler t WHERE t.teklifKullanici = :teklifKullanici"),
    @NamedQuery(name = "Teklifler.findByTeklifTalepTarihi", query = "SELECT t FROM Teklifler t WHERE t.teklifTalepTarihi = :teklifTalepTarihi"),
    @NamedQuery(name = "Teklifler.findByTeklifVerilenFirma", query = "SELECT t FROM Teklifler t WHERE t.teklifVerilenFirma = :teklifVerilenFirma"),
    @NamedQuery(name = "Teklifler.findByDurum", query = "SELECT t FROM Teklifler t WHERE t.durum = :durum"),
    @NamedQuery(name = "Teklifler.findByAciklama", query = "SELECT t FROM Teklifler t WHERE t.aciklama = :aciklama"),
    @NamedQuery(name = "Teklifler.findByTeklifSurecAsama", query = "SELECT t FROM Teklifler t WHERE t.teklifSurecAsama = :teklifSurecAsama"),
    @NamedQuery(name = "Teklifler.findBySil", query = "SELECT t FROM Teklifler t WHERE t.sil = :sil")})
public class Teklifler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkteklif")
    private Integer pkteklif;
    @Column(name = "teklif_kullanici")
    private Integer teklifKullanici;
    @Basic(optional = false)
    @NotNull
    @Column(name = "teklif_talep_tarihi")
    @Temporal(TemporalType.DATE)
    private Date teklifTalepTarihi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "teklif_verilen_firma")
    private int teklifVerilenFirma;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "talep_list")
    private String talepList;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "durum")
    private String durum;
    @Size(max = 400)
    @Column(name = "aciklama")
    private String aciklama;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "teklif_surec_asama")
    private String teklifSurecAsama;
    @Column(name = "sil")
    private Integer sil;

    public Teklifler() {
    }

    public Teklifler(Integer pkteklif) {
        this.pkteklif = pkteklif;
    }

    public Teklifler(Integer pkteklif, Date teklifTalepTarihi, int teklifVerilenFirma, String talepList, String durum, String teklifSurecAsama) {
        this.pkteklif = pkteklif;
        this.teklifTalepTarihi = teklifTalepTarihi;
        this.teklifVerilenFirma = teklifVerilenFirma;
        this.talepList = talepList;
        this.durum = durum;
        this.teklifSurecAsama = teklifSurecAsama;
    }

    public Integer getPkteklif() {
        return pkteklif;
    }

    public void setPkteklif(Integer pkteklif) {
        this.pkteklif = pkteklif;
    }

    public Integer getTeklifKullanici() {
        return teklifKullanici;
    }

    public void setTeklifKullanici(Integer teklifKullanici) {
        this.teklifKullanici = teklifKullanici;
    }

    public Date getTeklifTalepTarihi() {
        return teklifTalepTarihi;
    }

    public void setTeklifTalepTarihi(Date teklifTalepTarihi) {
        this.teklifTalepTarihi = teklifTalepTarihi;
    }

    public int getTeklifVerilenFirma() {
        return teklifVerilenFirma;
    }

    public void setTeklifVerilenFirma(int teklifVerilenFirma) {
        this.teklifVerilenFirma = teklifVerilenFirma;
    }

    public String getTalepList() {
        return talepList;
    }

    public void setTalepList(String talepList) {
        this.talepList = talepList;
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

    public String getTeklifSurecAsama() {
        return teklifSurecAsama;
    }

    public void setTeklifSurecAsama(String teklifSurecAsama) {
        this.teklifSurecAsama = teklifSurecAsama;
    }

    public Integer getSil() {
        return sil;
    }

    public void setSil(Integer sil) {
        this.sil = sil;
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
        if (!(object instanceof Teklifler)) {
            return false;
        }
        Teklifler other = (Teklifler) object;
        if ((this.pkteklif == null && other.pkteklif != null) || (this.pkteklif != null && !this.pkteklif.equals(other.pkteklif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Teklifler[ pkteklif=" + pkteklif + " ]";
    }
    
}
