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
@Table(name = "Sozlesme")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sozlesme.findAll", query = "SELECT s FROM Sozlesme s"),
    @NamedQuery(name = "Sozlesme.findByPkSozlesme", query = "SELECT s FROM Sozlesme s WHERE s.pkSozlesme = :pkSozlesme"),
    @NamedQuery(name = "Sozlesme.findBySozlesmeTarihi", query = "SELECT s FROM Sozlesme s WHERE s.sozlesmeTarihi = :sozlesmeTarihi"),
    @NamedQuery(name = "Sozlesme.findByBitisTarihi", query = "SELECT s FROM Sozlesme s WHERE s.bitisTarihi = :bitisTarihi"),
    @NamedQuery(name = "Sozlesme.findByFkFirma", query = "SELECT s FROM Sozlesme s WHERE s.fkFirma = :fkFirma"),
    @NamedQuery(name = "Sozlesme.findByFkProje", query = "SELECT s FROM Sozlesme s WHERE s.fkProje = :fkProje"),
    @NamedQuery(name = "Sozlesme.findByFkTeklif", query = "SELECT s FROM Sozlesme s WHERE s.fkTeklif = :fkTeklif"),
    @NamedQuery(name = "Sozlesme.findByTeslimYer", query = "SELECT s FROM Sozlesme s WHERE s.teslimYer = :teslimYer"),
    @NamedQuery(name = "Sozlesme.findByTeslimSekli", query = "SELECT s FROM Sozlesme s WHERE s.teslimSekli = :teslimSekli"),
    @NamedQuery(name = "Sozlesme.findByParaBirimi", query = "SELECT s FROM Sozlesme s WHERE s.paraBirimi = :paraBirimi"),
    @NamedQuery(name = "Sozlesme.findByOdemeSekli", query = "SELECT s FROM Sozlesme s WHERE s.odemeSekli = :odemeSekli"),
    @NamedQuery(name = "Sozlesme.findByVadeGun", query = "SELECT s FROM Sozlesme s WHERE s.vadeGun = :vadeGun"),
    @NamedQuery(name = "Sozlesme.findByVadeTarih", query = "SELECT s FROM Sozlesme s WHERE s.vadeTarih = :vadeTarih")})
public class Sozlesme implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkSozlesme")
    private Integer pkSozlesme;
    @Column(name = "SozlesmeTarihi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sozlesmeTarihi;
    @Column(name = "BitisTarihi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bitisTarihi;
    @Column(name = "fkFirma")
    private Integer fkFirma;
    @Column(name = "fkProje")
    private Integer fkProje;
    @Column(name = "fkTeklif")
    private Integer fkTeklif;
    @Size(max = 50)
    @Column(name = "TeslimYer")
    private String teslimYer;
    @Size(max = 50)
    @Column(name = "TeslimSekli")
    private String teslimSekli;
    @Size(max = 50)
    @Column(name = "ParaBirimi")
    private String paraBirimi;
    @Size(max = 50)
    @Column(name = "OdemeSekli")
    private String odemeSekli;
    @Column(name = "VadeGun")
    private Integer vadeGun;
    @Column(name = "VadeTarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vadeTarih;

    public Sozlesme() {
    }

    public Sozlesme(Integer pkSozlesme) {
        this.pkSozlesme = pkSozlesme;
    }

    public Integer getPkSozlesme() {
        return pkSozlesme;
    }

    public void setPkSozlesme(Integer pkSozlesme) {
        this.pkSozlesme = pkSozlesme;
    }

    public Date getSozlesmeTarihi() {
        return sozlesmeTarihi;
    }

    public void setSozlesmeTarihi(Date sozlesmeTarihi) {
        this.sozlesmeTarihi = sozlesmeTarihi;
    }

    public Date getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(Date bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }

    public Integer getFkFirma() {
        return fkFirma;
    }

    public void setFkFirma(Integer fkFirma) {
        this.fkFirma = fkFirma;
    }

    public Integer getFkProje() {
        return fkProje;
    }

    public void setFkProje(Integer fkProje) {
        this.fkProje = fkProje;
    }

    public Integer getFkTeklif() {
        return fkTeklif;
    }

    public void setFkTeklif(Integer fkTeklif) {
        this.fkTeklif = fkTeklif;
    }

    public String getTeslimYer() {
        return teslimYer;
    }

    public void setTeslimYer(String teslimYer) {
        this.teslimYer = teslimYer;
    }

    public String getTeslimSekli() {
        return teslimSekli;
    }

    public void setTeslimSekli(String teslimSekli) {
        this.teslimSekli = teslimSekli;
    }

    public String getParaBirimi() {
        return paraBirimi;
    }

    public void setParaBirimi(String paraBirimi) {
        this.paraBirimi = paraBirimi;
    }

    public String getOdemeSekli() {
        return odemeSekli;
    }

    public void setOdemeSekli(String odemeSekli) {
        this.odemeSekli = odemeSekli;
    }

    public Integer getVadeGun() {
        return vadeGun;
    }

    public void setVadeGun(Integer vadeGun) {
        this.vadeGun = vadeGun;
    }

    public Date getVadeTarih() {
        return vadeTarih;
    }

    public void setVadeTarih(Date vadeTarih) {
        this.vadeTarih = vadeTarih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkSozlesme != null ? pkSozlesme.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sozlesme)) {
            return false;
        }
        Sozlesme other = (Sozlesme) object;
        if ((this.pkSozlesme == null && other.pkSozlesme != null) || (this.pkSozlesme != null && !this.pkSozlesme.equals(other.pkSozlesme))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Sozlesme[ pkSozlesme=" + pkSozlesme + " ]";
    }
    
}
