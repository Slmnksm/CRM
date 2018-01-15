/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SelmanKasim
 */
@Entity
@Table(name = "Dolab")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dolab.findAll", query = "SELECT d FROM Dolab d"),
    @NamedQuery(name = "Dolab.findByGovde", query = "SELECT d FROM Dolab d WHERE d.govde = :govde"),
    @NamedQuery(name = "Dolab.findByGovdeRenk", query = "SELECT d FROM Dolab d WHERE d.govdeRenk = :govdeRenk"),
    @NamedQuery(name = "Dolab.findByAltKapak", query = "SELECT d FROM Dolab d WHERE d.altKapak = :altKapak"),
    @NamedQuery(name = "Dolab.findByAltKapakRenk", query = "SELECT d FROM Dolab d WHERE d.altKapakRenk = :altKapakRenk"),
    @NamedQuery(name = "Dolab.findByUstKapak", query = "SELECT d FROM Dolab d WHERE d.ustKapak = :ustKapak"),
    @NamedQuery(name = "Dolab.findByUstKapakRenk", query = "SELECT d FROM Dolab d WHERE d.ustKapakRenk = :ustKapakRenk"),
    @NamedQuery(name = "Dolab.findByMentese", query = "SELECT d FROM Dolab d WHERE d.mentese = :mentese"),
    @NamedQuery(name = "Dolab.findByFren", query = "SELECT d FROM Dolab d WHERE d.fren = :fren"),
    @NamedQuery(name = "Dolab.findByKulp", query = "SELECT d FROM Dolab d WHERE d.kulp = :kulp"),
    @NamedQuery(name = "Dolab.findByRaf", query = "SELECT d FROM Dolab d WHERE d.raf = :raf"),
    @NamedQuery(name = "Dolab.findByAyna", query = "SELECT d FROM Dolab d WHERE d.ayna = :ayna"),
    @NamedQuery(name = "Dolab.findById", query = "SELECT d FROM Dolab d WHERE d.id = :id"),
    @NamedQuery(name = "Dolab.findByStatu", query = "SELECT d FROM Dolab d WHERE d.statu = :statu"),
    @NamedQuery(name = "Dolab.findByKirliSepet", query = "SELECT d FROM Dolab d WHERE d.kirliSepet = :kirliSepet"),
    @NamedQuery(name = "Dolab.findByCop", query = "SELECT d FROM Dolab d WHERE d.cop = :cop"),
    @NamedQuery(name = "Dolab.findBySiselik", query = "SELECT d FROM Dolab d WHERE d.siselik = :siselik"),
    @NamedQuery(name = "Dolab.findByBaza", query = "SELECT d FROM Dolab d WHERE d.baza = :baza"),
    @NamedQuery(name = "Dolab.findByEvyeAlti", query = "SELECT d FROM Dolab d WHERE d.evyeAlti = :evyeAlti"),
    @NamedQuery(name = "Dolab.findByKasiklik", query = "SELECT d FROM Dolab d WHERE d.kasiklik = :kasiklik"),
    @NamedQuery(name = "Dolab.findByMasa", query = "SELECT d FROM Dolab d WHERE d.masa = :masa"),
    @NamedQuery(name = "Dolab.findByCekmece", query = "SELECT d FROM Dolab d WHERE d.cekmece = :cekmece"),
    @NamedQuery(name = "Dolab.findBySurgu", query = "SELECT d FROM Dolab d WHERE d.surgu = :surgu"),
    @NamedQuery(name = "Dolab.findByAskiBoru", query = "SELECT d FROM Dolab d WHERE d.askiBoru = :askiBoru"),
    @NamedQuery(name = "Dolab.findByAsansorAski", query = "SELECT d FROM Dolab d WHERE d.asansorAski = :asansorAski"),
    @NamedQuery(name = "Dolab.findByPksipdetay", query = "SELECT d FROM Dolab d WHERE d.pksipdetay = :pksipdetay")})
public class Dolab implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "Govde")
    private String govde;
    @Size(max = 50)
    @Column(name = "GovdeRenk")
    private String govdeRenk;
    @Size(max = 50)
    @Column(name = "AltKapak")
    private String altKapak;
    @Size(max = 50)
    @Column(name = "AltKapakRenk")
    private String altKapakRenk;
    @Size(max = 50)
    @Column(name = "UstKapak")
    private String ustKapak;
    @Size(max = 50)
    @Column(name = "UstKapakRenk")
    private String ustKapakRenk;
    @Size(max = 50)
    @Column(name = "Mentese")
    private String mentese;
    @Size(max = 50)
    @Column(name = "Fren")
    private String fren;
    @Size(max = 50)
    @Column(name = "Kulp")
    private String kulp;
    @Size(max = 50)
    @Column(name = "Raf")
    private String raf;
    @Size(max = 50)
    @Column(name = "Ayna")
    private String ayna;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "Statu")
    private String statu;
    @Size(max = 50)
    @Column(name = "KirliSepet")
    private String kirliSepet;
    @Size(max = 50)
    @Column(name = "Cop")
    private String cop;
    @Size(max = 50)
    @Column(name = "Siselik")
    private String siselik;
    @Size(max = 50)
    @Column(name = "Baza")
    private String baza;
    @Size(max = 50)
    @Column(name = "EvyeAlti")
    private String evyeAlti;
    @Size(max = 50)
    @Column(name = "Kasiklik")
    private String kasiklik;
    @Size(max = 50)
    @Column(name = "Masa")
    private String masa;
    @Size(max = 50)
    @Column(name = "Cekmece")
    private String cekmece;
    @Size(max = 50)
    @Column(name = "Surgu")
    private String surgu;
    @Size(max = 50)
    @Column(name = "AskiBoru")
    private String askiBoru;
    @Size(max = 50)
    @Column(name = "AsansorAski")
    private String asansorAski;
    @Column(name = "pksipdetay")
    private Integer pksipdetay;

    public Dolab() {
    }

    public Dolab(Integer id) {
        this.id = id;
    }

    public String getGovde() {
        return govde;
    }

    public void setGovde(String govde) {
        this.govde = govde;
    }

    public String getGovdeRenk() {
        return govdeRenk;
    }

    public void setGovdeRenk(String govdeRenk) {
        this.govdeRenk = govdeRenk;
    }

    public String getAltKapak() {
        return altKapak;
    }

    public void setAltKapak(String altKapak) {
        this.altKapak = altKapak;
    }

    public String getAltKapakRenk() {
        return altKapakRenk;
    }

    public void setAltKapakRenk(String altKapakRenk) {
        this.altKapakRenk = altKapakRenk;
    }

    public String getUstKapak() {
        return ustKapak;
    }

    public void setUstKapak(String ustKapak) {
        this.ustKapak = ustKapak;
    }

    public String getUstKapakRenk() {
        return ustKapakRenk;
    }

    public void setUstKapakRenk(String ustKapakRenk) {
        this.ustKapakRenk = ustKapakRenk;
    }

    public String getMentese() {
        return mentese;
    }

    public void setMentese(String mentese) {
        this.mentese = mentese;
    }

    public String getFren() {
        return fren;
    }

    public void setFren(String fren) {
        this.fren = fren;
    }

    public String getKulp() {
        return kulp;
    }

    public void setKulp(String kulp) {
        this.kulp = kulp;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    public String getAyna() {
        return ayna;
    }

    public void setAyna(String ayna) {
        this.ayna = ayna;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public String getKirliSepet() {
        return kirliSepet;
    }

    public void setKirliSepet(String kirliSepet) {
        this.kirliSepet = kirliSepet;
    }

    public String getCop() {
        return cop;
    }

    public void setCop(String cop) {
        this.cop = cop;
    }

    public String getSiselik() {
        return siselik;
    }

    public void setSiselik(String siselik) {
        this.siselik = siselik;
    }

    public String getBaza() {
        return baza;
    }

    public void setBaza(String baza) {
        this.baza = baza;
    }

    public String getEvyeAlti() {
        return evyeAlti;
    }

    public void setEvyeAlti(String evyeAlti) {
        this.evyeAlti = evyeAlti;
    }

    public String getKasiklik() {
        return kasiklik;
    }

    public void setKasiklik(String kasiklik) {
        this.kasiklik = kasiklik;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getCekmece() {
        return cekmece;
    }

    public void setCekmece(String cekmece) {
        this.cekmece = cekmece;
    }

    public String getSurgu() {
        return surgu;
    }

    public void setSurgu(String surgu) {
        this.surgu = surgu;
    }

    public String getAskiBoru() {
        return askiBoru;
    }

    public void setAskiBoru(String askiBoru) {
        this.askiBoru = askiBoru;
    }

    public String getAsansorAski() {
        return asansorAski;
    }

    public void setAsansorAski(String asansorAski) {
        this.asansorAski = asansorAski;
    }

    public Integer getPksipdetay() {
        return pksipdetay;
    }

    public void setPksipdetay(Integer pksipdetay) {
        this.pksipdetay = pksipdetay;
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
        if (!(object instanceof Dolab)) {
            return false;
        }
        Dolab other = (Dolab) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Dolab[ id=" + id + " ]";
    }
    
}
