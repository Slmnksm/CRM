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
@Table(name = "MalKabul")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MalKabul.findAll", query = "SELECT m FROM MalKabul m"),
    @NamedQuery(name = "MalKabul.findByPkmalkabul", query = "SELECT m FROM MalKabul m WHERE m.pkmalkabul = :pkmalkabul"),
    @NamedQuery(name = "MalKabul.findBySiparisKodu", query = "SELECT m FROM MalKabul m WHERE m.siparisKodu = :siparisKodu"),
    @NamedQuery(name = "MalKabul.findByKullanici", query = "SELECT m FROM MalKabul m WHERE m.kullanici = :kullanici"),
    @NamedQuery(name = "MalKabul.findByTarih", query = "SELECT m FROM MalKabul m WHERE m.tarih = :tarih"),
    @NamedQuery(name = "MalKabul.findByUrunAdi", query = "SELECT m FROM MalKabul m WHERE m.urunAdi = :urunAdi"),
    @NamedQuery(name = "MalKabul.findByMiktarBirim", query = "SELECT m FROM MalKabul m WHERE m.miktarBirim = :miktarBirim"),
    @NamedQuery(name = "MalKabul.findByIstenenMiktar", query = "SELECT m FROM MalKabul m WHERE m.istenenMiktar = :istenenMiktar"),
    @NamedQuery(name = "MalKabul.findByGelenMiktar", query = "SELECT m FROM MalKabul m WHERE m.gelenMiktar = :gelenMiktar"),
    @NamedQuery(name = "MalKabul.findByDurum", query = "SELECT m FROM MalKabul m WHERE m.durum = :durum"),
    @NamedQuery(name = "MalKabul.findByAciklama", query = "SELECT m FROM MalKabul m WHERE m.aciklama = :aciklama"),
    @NamedQuery(name = "MalKabul.findByFirmaKodu", query = "SELECT m FROM MalKabul m WHERE m.firmaKodu = :firmaKodu"),
    @NamedQuery(name = "MalKabul.findByUrunKodu", query = "SELECT m FROM MalKabul m WHERE m.urunKodu = :urunKodu"),
    @NamedQuery(name = "MalKabul.findBySil", query = "SELECT m FROM MalKabul m WHERE m.sil = :sil")})
public class MalKabul implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkmalkabul")
    private Integer pkmalkabul;
    @Basic(optional = false)
    @NotNull
    @Column(name = "siparis_kodu")
    private int siparisKodu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "kullanici")
    private String kullanici;
    @Column(name = "tarih")
    @Temporal(TemporalType.DATE)
    private Date tarih;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "urun_adi")
    private String urunAdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "miktar_birim")
    private String miktarBirim;
    @Size(max = 50)
    @Column(name = "istenen_miktar")
    private String istenenMiktar;
    @Size(max = 50)
    @Column(name = "gelen_miktar")
    private String gelenMiktar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "durum")
    private String durum;
    @Size(max = 400)
    @Column(name = "aciklama")
    private String aciklama;
    @Basic(optional = false)
    @NotNull
    @Column(name = "firma_kodu")
    private int firmaKodu;
    @Size(max = 100)
    @Column(name = "urun_kodu")
    private String urunKodu;
    @Column(name = "sil")
    private Integer sil;

    public MalKabul() {
    }

    public MalKabul(Integer pkmalkabul) {
        this.pkmalkabul = pkmalkabul;
    }

    public MalKabul(Integer pkmalkabul, int siparisKodu, String kullanici, String urunAdi, String miktarBirim, String durum, int firmaKodu) {
        this.pkmalkabul = pkmalkabul;
        this.siparisKodu = siparisKodu;
        this.kullanici = kullanici;
        this.urunAdi = urunAdi;
        this.miktarBirim = miktarBirim;
        this.durum = durum;
        this.firmaKodu = firmaKodu;
    }

    public Integer getPkmalkabul() {
        return pkmalkabul;
    }

    public void setPkmalkabul(Integer pkmalkabul) {
        this.pkmalkabul = pkmalkabul;
    }

    public int getSiparisKodu() {
        return siparisKodu;
    }

    public void setSiparisKodu(int siparisKodu) {
        this.siparisKodu = siparisKodu;
    }

    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getMiktarBirim() {
        return miktarBirim;
    }

    public void setMiktarBirim(String miktarBirim) {
        this.miktarBirim = miktarBirim;
    }

    public String getIstenenMiktar() {
        return istenenMiktar;
    }

    public void setIstenenMiktar(String istenenMiktar) {
        this.istenenMiktar = istenenMiktar;
    }

    public String getGelenMiktar() {
        return gelenMiktar;
    }

    public void setGelenMiktar(String gelenMiktar) {
        this.gelenMiktar = gelenMiktar;
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

    public int getFirmaKodu() {
        return firmaKodu;
    }

    public void setFirmaKodu(int firmaKodu) {
        this.firmaKodu = firmaKodu;
    }

    public String getUrunKodu() {
        return urunKodu;
    }

    public void setUrunKodu(String urunKodu) {
        this.urunKodu = urunKodu;
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
        hash += (pkmalkabul != null ? pkmalkabul.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MalKabul)) {
            return false;
        }
        MalKabul other = (MalKabul) object;
        if ((this.pkmalkabul == null && other.pkmalkabul != null) || (this.pkmalkabul != null && !this.pkmalkabul.equals(other.pkmalkabul))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.MalKabul[ pkmalkabul=" + pkmalkabul + " ]";
    }
    
}
