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
@Table(name = "MalTeslim")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MalTeslim.findAll", query = "SELECT m FROM MalTeslim m"),
    @NamedQuery(name = "MalTeslim.findByPkmalteslim", query = "SELECT m FROM MalTeslim m WHERE m.pkmalteslim = :pkmalteslim"),
    @NamedQuery(name = "MalTeslim.findByMalkabulKodu", query = "SELECT m FROM MalTeslim m WHERE m.malkabulKodu = :malkabulKodu"),
    @NamedQuery(name = "MalTeslim.findByTeslimEdilenTalepId", query = "SELECT m FROM MalTeslim m WHERE m.teslimEdilenTalepId = :teslimEdilenTalepId"),
    @NamedQuery(name = "MalTeslim.findByKullanici", query = "SELECT m FROM MalTeslim m WHERE m.kullanici = :kullanici"),
    @NamedQuery(name = "MalTeslim.findByTeslimTarihi", query = "SELECT m FROM MalTeslim m WHERE m.teslimTarihi = :teslimTarihi"),
    @NamedQuery(name = "MalTeslim.findByTeslimEdilenMiktar", query = "SELECT m FROM MalTeslim m WHERE m.teslimEdilenMiktar = :teslimEdilenMiktar"),
    @NamedQuery(name = "MalTeslim.findByTeslimEdilenBirim", query = "SELECT m FROM MalTeslim m WHERE m.teslimEdilenBirim = :teslimEdilenBirim"),
    @NamedQuery(name = "MalTeslim.findByAciklama", query = "SELECT m FROM MalTeslim m WHERE m.aciklama = :aciklama"),
    @NamedQuery(name = "MalTeslim.findBySil", query = "SELECT m FROM MalTeslim m WHERE m.sil = :sil")})
public class MalTeslim implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkmalteslim")
    private Integer pkmalteslim;
    @Column(name = "malkabul_kodu")
    private Integer malkabulKodu;
    @Column(name = "teslim_edilen_talep_id")
    private Integer teslimEdilenTalepId;
    @Size(max = 50)
    @Column(name = "kullanici")
    private String kullanici;
    @Column(name = "teslim_tarihi")
    @Temporal(TemporalType.DATE)
    private Date teslimTarihi;
    @Size(max = 50)
    @Column(name = "teslim_edilen_miktar")
    private String teslimEdilenMiktar;
    @Size(max = 50)
    @Column(name = "teslim_edilen_birim")
    private String teslimEdilenBirim;
    @Size(max = 500)
    @Column(name = "aciklama")
    private String aciklama;
    @Column(name = "sil")
    private Integer sil;

    public MalTeslim() {
    }

    public MalTeslim(Integer pkmalteslim) {
        this.pkmalteslim = pkmalteslim;
    }

    public Integer getPkmalteslim() {
        return pkmalteslim;
    }

    public void setPkmalteslim(Integer pkmalteslim) {
        this.pkmalteslim = pkmalteslim;
    }

    public Integer getMalkabulKodu() {
        return malkabulKodu;
    }

    public void setMalkabulKodu(Integer malkabulKodu) {
        this.malkabulKodu = malkabulKodu;
    }

    public Integer getTeslimEdilenTalepId() {
        return teslimEdilenTalepId;
    }

    public void setTeslimEdilenTalepId(Integer teslimEdilenTalepId) {
        this.teslimEdilenTalepId = teslimEdilenTalepId;
    }

    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public Date getTeslimTarihi() {
        return teslimTarihi;
    }

    public void setTeslimTarihi(Date teslimTarihi) {
        this.teslimTarihi = teslimTarihi;
    }

    public String getTeslimEdilenMiktar() {
        return teslimEdilenMiktar;
    }

    public void setTeslimEdilenMiktar(String teslimEdilenMiktar) {
        this.teslimEdilenMiktar = teslimEdilenMiktar;
    }

    public String getTeslimEdilenBirim() {
        return teslimEdilenBirim;
    }

    public void setTeslimEdilenBirim(String teslimEdilenBirim) {
        this.teslimEdilenBirim = teslimEdilenBirim;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
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
        hash += (pkmalteslim != null ? pkmalteslim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MalTeslim)) {
            return false;
        }
        MalTeslim other = (MalTeslim) object;
        if ((this.pkmalteslim == null && other.pkmalteslim != null) || (this.pkmalteslim != null && !this.pkmalteslim.equals(other.pkmalteslim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.MalTeslim[ pkmalteslim=" + pkmalteslim + " ]";
    }
    
}
