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
@Table(name = "SiparisSurecIDMap")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SiparisSurecIDMap.findAll", query = "SELECT s FROM SiparisSurecIDMap s"),
    @NamedQuery(name = "SiparisSurecIDMap.findByPksatinalmasurec", query = "SELECT s FROM SiparisSurecIDMap s WHERE s.pksatinalmasurec = :pksatinalmasurec"),
    @NamedQuery(name = "SiparisSurecIDMap.findByTalepId", query = "SELECT s FROM SiparisSurecIDMap s WHERE s.talepId = :talepId"),
    @NamedQuery(name = "SiparisSurecIDMap.findByGidenTeklifId", query = "SELECT s FROM SiparisSurecIDMap s WHERE s.gidenTeklifId = :gidenTeklifId"),
    @NamedQuery(name = "SiparisSurecIDMap.findByGelenTeklifId", query = "SELECT s FROM SiparisSurecIDMap s WHERE s.gelenTeklifId = :gelenTeklifId"),
    @NamedQuery(name = "SiparisSurecIDMap.findBySiparisId", query = "SELECT s FROM SiparisSurecIDMap s WHERE s.siparisId = :siparisId"),
    @NamedQuery(name = "SiparisSurecIDMap.findByMalkabulId", query = "SELECT s FROM SiparisSurecIDMap s WHERE s.malkabulId = :malkabulId"),
    @NamedQuery(name = "SiparisSurecIDMap.findByMalTeslimId", query = "SELECT s FROM SiparisSurecIDMap s WHERE s.malTeslimId = :malTeslimId"),
    @NamedQuery(name = "SiparisSurecIDMap.findByTalepEdilenMiktar", query = "SELECT s FROM SiparisSurecIDMap s WHERE s.talepEdilenMiktar = :talepEdilenMiktar"),
    @NamedQuery(name = "SiparisSurecIDMap.findByTalepEdilenMiktarBirim", query = "SELECT s FROM SiparisSurecIDMap s WHERE s.talepEdilenMiktarBirim = :talepEdilenMiktarBirim"),
    @NamedQuery(name = "SiparisSurecIDMap.findByGelenTeklifMiktar", query = "SELECT s FROM SiparisSurecIDMap s WHERE s.gelenTeklifMiktar = :gelenTeklifMiktar"),
    @NamedQuery(name = "SiparisSurecIDMap.findByGelenTeklifFiyat", query = "SELECT s FROM SiparisSurecIDMap s WHERE s.gelenTeklifFiyat = :gelenTeklifFiyat"),
    @NamedQuery(name = "SiparisSurecIDMap.findByGelenTeklifKdvYuzde", query = "SELECT s FROM SiparisSurecIDMap s WHERE s.gelenTeklifKdvYuzde = :gelenTeklifKdvYuzde"),
    @NamedQuery(name = "SiparisSurecIDMap.findByGelenTeklifUrunTeslimTarihi", query = "SELECT s FROM SiparisSurecIDMap s WHERE s.gelenTeklifUrunTeslimTarihi = :gelenTeklifUrunTeslimTarihi"),
    @NamedQuery(name = "SiparisSurecIDMap.findByMalKabulMiktar", query = "SELECT s FROM SiparisSurecIDMap s WHERE s.malKabulMiktar = :malKabulMiktar"),
    @NamedQuery(name = "SiparisSurecIDMap.findByMalTeslimMiktar", query = "SELECT s FROM SiparisSurecIDMap s WHERE s.malTeslimMiktar = :malTeslimMiktar")})
public class SiparisSurecIDMap implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pksatinalmasurec")
    private Integer pksatinalmasurec;
    @Column(name = "talep_id")
    private Integer talepId;
    @Column(name = "giden_teklif_id")
    private Integer gidenTeklifId;
    @Column(name = "gelen_teklif_id")
    private Integer gelenTeklifId;
    @Column(name = "siparis_id")
    private Integer siparisId;
    @Column(name = "malkabul_id")
    private Integer malkabulId;
    @Column(name = "mal_teslim_id")
    private Integer malTeslimId;
    @Size(max = 20)
    @Column(name = "talep_edilen_miktar")
    private String talepEdilenMiktar;
    @Size(max = 50)
    @Column(name = "talep_edilen_miktar_birim")
    private String talepEdilenMiktarBirim;
    @Size(max = 20)
    @Column(name = "gelen_teklif_miktar")
    private String gelenTeklifMiktar;
    @Size(max = 20)
    @Column(name = "gelen_teklif_fiyat")
    private String gelenTeklifFiyat;
    @Size(max = 20)
    @Column(name = "gelen_teklif_kdv_yuzde")
    private String gelenTeklifKdvYuzde;
    @Column(name = "gelen_teklif_urun_teslim_tarihi")
    @Temporal(TemporalType.DATE)
    private Date gelenTeklifUrunTeslimTarihi;
    @Size(max = 20)
    @Column(name = "mal_kabul_miktar")
    private String malKabulMiktar;
    @Size(max = 20)
    @Column(name = "mal_teslim_miktar")
    private String malTeslimMiktar;

    public SiparisSurecIDMap() {
    }

    public SiparisSurecIDMap(Integer pksatinalmasurec) {
        this.pksatinalmasurec = pksatinalmasurec;
    }

    public Integer getPksatinalmasurec() {
        return pksatinalmasurec;
    }

    public void setPksatinalmasurec(Integer pksatinalmasurec) {
        this.pksatinalmasurec = pksatinalmasurec;
    }

    public Integer getTalepId() {
        return talepId;
    }

    public void setTalepId(Integer talepId) {
        this.talepId = talepId;
    }

    public Integer getGidenTeklifId() {
        return gidenTeklifId;
    }

    public void setGidenTeklifId(Integer gidenTeklifId) {
        this.gidenTeklifId = gidenTeklifId;
    }

    public Integer getGelenTeklifId() {
        return gelenTeklifId;
    }

    public void setGelenTeklifId(Integer gelenTeklifId) {
        this.gelenTeklifId = gelenTeklifId;
    }

    public Integer getSiparisId() {
        return siparisId;
    }

    public void setSiparisId(Integer siparisId) {
        this.siparisId = siparisId;
    }

    public Integer getMalkabulId() {
        return malkabulId;
    }

    public void setMalkabulId(Integer malkabulId) {
        this.malkabulId = malkabulId;
    }

    public Integer getMalTeslimId() {
        return malTeslimId;
    }

    public void setMalTeslimId(Integer malTeslimId) {
        this.malTeslimId = malTeslimId;
    }

    public String getTalepEdilenMiktar() {
        return talepEdilenMiktar;
    }

    public void setTalepEdilenMiktar(String talepEdilenMiktar) {
        this.talepEdilenMiktar = talepEdilenMiktar;
    }

    public String getTalepEdilenMiktarBirim() {
        return talepEdilenMiktarBirim;
    }

    public void setTalepEdilenMiktarBirim(String talepEdilenMiktarBirim) {
        this.talepEdilenMiktarBirim = talepEdilenMiktarBirim;
    }

    public String getGelenTeklifMiktar() {
        return gelenTeklifMiktar;
    }

    public void setGelenTeklifMiktar(String gelenTeklifMiktar) {
        this.gelenTeklifMiktar = gelenTeklifMiktar;
    }

    public String getGelenTeklifFiyat() {
        return gelenTeklifFiyat;
    }

    public void setGelenTeklifFiyat(String gelenTeklifFiyat) {
        this.gelenTeklifFiyat = gelenTeklifFiyat;
    }

    public String getGelenTeklifKdvYuzde() {
        return gelenTeklifKdvYuzde;
    }

    public void setGelenTeklifKdvYuzde(String gelenTeklifKdvYuzde) {
        this.gelenTeklifKdvYuzde = gelenTeklifKdvYuzde;
    }

    public Date getGelenTeklifUrunTeslimTarihi() {
        return gelenTeklifUrunTeslimTarihi;
    }

    public void setGelenTeklifUrunTeslimTarihi(Date gelenTeklifUrunTeslimTarihi) {
        this.gelenTeklifUrunTeslimTarihi = gelenTeklifUrunTeslimTarihi;
    }

    public String getMalKabulMiktar() {
        return malKabulMiktar;
    }

    public void setMalKabulMiktar(String malKabulMiktar) {
        this.malKabulMiktar = malKabulMiktar;
    }

    public String getMalTeslimMiktar() {
        return malTeslimMiktar;
    }

    public void setMalTeslimMiktar(String malTeslimMiktar) {
        this.malTeslimMiktar = malTeslimMiktar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pksatinalmasurec != null ? pksatinalmasurec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SiparisSurecIDMap)) {
            return false;
        }
        SiparisSurecIDMap other = (SiparisSurecIDMap) object;
        if ((this.pksatinalmasurec == null && other.pksatinalmasurec != null) || (this.pksatinalmasurec != null && !this.pksatinalmasurec.equals(other.pksatinalmasurec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.SiparisSurecIDMap[ pksatinalmasurec=" + pksatinalmasurec + " ]";
    }
    
}
