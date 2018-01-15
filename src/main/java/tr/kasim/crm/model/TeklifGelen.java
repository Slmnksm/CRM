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
@Table(name = "TeklifGelen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TeklifGelen.findAll", query = "SELECT t FROM TeklifGelen t"),
    @NamedQuery(name = "TeklifGelen.findByPkgelenteklif", query = "SELECT t FROM TeklifGelen t WHERE t.pkgelenteklif = :pkgelenteklif"),
    @NamedQuery(name = "TeklifGelen.findByTeklifKullanici", query = "SELECT t FROM TeklifGelen t WHERE t.teklifKullanici = :teklifKullanici"),
    @NamedQuery(name = "TeklifGelen.findByGelenTeklifTarihi", query = "SELECT t FROM TeklifGelen t WHERE t.gelenTeklifTarihi = :gelenTeklifTarihi"),
    @NamedQuery(name = "TeklifGelen.findByGidenTeklifId", query = "SELECT t FROM TeklifGelen t WHERE t.gidenTeklifId = :gidenTeklifId"),
    @NamedQuery(name = "TeklifGelen.findByDigerNotlar", query = "SELECT t FROM TeklifGelen t WHERE t.digerNotlar = :digerNotlar"),
    @NamedQuery(name = "TeklifGelen.findByDurum", query = "SELECT t FROM TeklifGelen t WHERE t.durum = :durum"),
    @NamedQuery(name = "TeklifGelen.findByTeklifTutar", query = "SELECT t FROM TeklifGelen t WHERE t.teklifTutar = :teklifTutar"),
    @NamedQuery(name = "TeklifGelen.findByTutarParaBirimi", query = "SELECT t FROM TeklifGelen t WHERE t.tutarParaBirimi = :tutarParaBirimi"),
    @NamedQuery(name = "TeklifGelen.findByTutarKur", query = "SELECT t FROM TeklifGelen t WHERE t.tutarKur = :tutarKur"),
    @NamedQuery(name = "TeklifGelen.findBySil", query = "SELECT t FROM TeklifGelen t WHERE t.sil = :sil")})
public class TeklifGelen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkgelenteklif")
    private Integer pkgelenteklif;
    @Basic(optional = false)
    @NotNull
    @Column(name = "teklif_kullanici")
    private int teklifKullanici;
    @Basic(optional = false)
    @NotNull
    @Column(name = "gelen_teklif_tarihi")
    @Temporal(TemporalType.DATE)
    private Date gelenTeklifTarihi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "giden_teklif_id")
    private int gidenTeklifId;
    @Size(max = 400)
    @Column(name = "diger_notlar")
    private String digerNotlar;
    @Size(max = 50)
    @Column(name = "durum")
    private String durum;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "talep_list")
    private String talepList;
    @Size(max = 50)
    @Column(name = "teklif_tutar")
    private String teklifTutar;
    @Size(max = 50)
    @Column(name = "tutar_para_birimi")
    private String tutarParaBirimi;
    @Size(max = 50)
    @Column(name = "tutar_kur")
    private String tutarKur;
    @Column(name = "sil")
    private Integer sil;

    public TeklifGelen() {
    }

    public TeklifGelen(Integer pkgelenteklif) {
        this.pkgelenteklif = pkgelenteklif;
    }

    public TeklifGelen(Integer pkgelenteklif, int teklifKullanici, Date gelenTeklifTarihi, int gidenTeklifId, String talepList) {
        this.pkgelenteklif = pkgelenteklif;
        this.teklifKullanici = teklifKullanici;
        this.gelenTeklifTarihi = gelenTeklifTarihi;
        this.gidenTeklifId = gidenTeklifId;
        this.talepList = talepList;
    }

    public Integer getPkgelenteklif() {
        return pkgelenteklif;
    }

    public void setPkgelenteklif(Integer pkgelenteklif) {
        this.pkgelenteklif = pkgelenteklif;
    }

    public int getTeklifKullanici() {
        return teklifKullanici;
    }

    public void setTeklifKullanici(int teklifKullanici) {
        this.teklifKullanici = teklifKullanici;
    }

    public Date getGelenTeklifTarihi() {
        return gelenTeklifTarihi;
    }

    public void setGelenTeklifTarihi(Date gelenTeklifTarihi) {
        this.gelenTeklifTarihi = gelenTeklifTarihi;
    }

    public int getGidenTeklifId() {
        return gidenTeklifId;
    }

    public void setGidenTeklifId(int gidenTeklifId) {
        this.gidenTeklifId = gidenTeklifId;
    }

    public String getDigerNotlar() {
        return digerNotlar;
    }

    public void setDigerNotlar(String digerNotlar) {
        this.digerNotlar = digerNotlar;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public String getTalepList() {
        return talepList;
    }

    public void setTalepList(String talepList) {
        this.talepList = talepList;
    }

    public String getTeklifTutar() {
        return teklifTutar;
    }

    public void setTeklifTutar(String teklifTutar) {
        this.teklifTutar = teklifTutar;
    }

    public String getTutarParaBirimi() {
        return tutarParaBirimi;
    }

    public void setTutarParaBirimi(String tutarParaBirimi) {
        this.tutarParaBirimi = tutarParaBirimi;
    }

    public String getTutarKur() {
        return tutarKur;
    }

    public void setTutarKur(String tutarKur) {
        this.tutarKur = tutarKur;
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
        hash += (pkgelenteklif != null ? pkgelenteklif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeklifGelen)) {
            return false;
        }
        TeklifGelen other = (TeklifGelen) object;
        if ((this.pkgelenteklif == null && other.pkgelenteklif != null) || (this.pkgelenteklif != null && !this.pkgelenteklif.equals(other.pkgelenteklif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.TeklifGelen[ pkgelenteklif=" + pkgelenteklif + " ]";
    }
    
}
