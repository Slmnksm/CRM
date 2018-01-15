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
@Table(name = "Plans")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plans.findAll", query = "SELECT p FROM Plans p"),
    @NamedQuery(name = "Plans.findByUniqueId", query = "SELECT p FROM Plans p WHERE p.uniqueId = :uniqueId"),
    @NamedQuery(name = "Plans.findByType", query = "SELECT p FROM Plans p WHERE p.type = :type"),
    @NamedQuery(name = "Plans.findByStartDate", query = "SELECT p FROM Plans p WHERE p.startDate = :startDate"),
    @NamedQuery(name = "Plans.findByEndDate", query = "SELECT p FROM Plans p WHERE p.endDate = :endDate"),
    @NamedQuery(name = "Plans.findByAllday", query = "SELECT p FROM Plans p WHERE p.allday = :allday"),
    @NamedQuery(name = "Plans.findBySubject", query = "SELECT p FROM Plans p WHERE p.subject = :subject"),
    @NamedQuery(name = "Plans.findByLocation", query = "SELECT p FROM Plans p WHERE p.location = :location"),
    @NamedQuery(name = "Plans.findByDescription", query = "SELECT p FROM Plans p WHERE p.description = :description"),
    @NamedQuery(name = "Plans.findByStatus", query = "SELECT p FROM Plans p WHERE p.status = :status"),
    @NamedQuery(name = "Plans.findByLabel", query = "SELECT p FROM Plans p WHERE p.label = :label"),
    @NamedQuery(name = "Plans.findByResourceId", query = "SELECT p FROM Plans p WHERE p.resourceId = :resourceId"),
    @NamedQuery(name = "Plans.findByResourceIDs", query = "SELECT p FROM Plans p WHERE p.resourceIDs = :resourceIDs"),
    @NamedQuery(name = "Plans.findByRemindInfo", query = "SELECT p FROM Plans p WHERE p.remindInfo = :remindInfo"),
    @NamedQuery(name = "Plans.findByCustomField1", query = "SELECT p FROM Plans p WHERE p.customField1 = :customField1"),
    @NamedQuery(name = "Plans.findByFark", query = "SELECT p FROM Plans p WHERE p.fark = :fark"),
    @NamedQuery(name = "Plans.findByKgDakika", query = "SELECT p FROM Plans p WHERE p.kgDakika = :kgDakika"),
    @NamedQuery(name = "Plans.findByKgPlan", query = "SELECT p FROM Plans p WHERE p.kgPlan = :kgPlan"),
    @NamedQuery(name = "Plans.findByKafa", query = "SELECT p FROM Plans p WHERE p.kafa = :kafa"),
    @NamedQuery(name = "Plans.findByMiktar", query = "SELECT p FROM Plans p WHERE p.miktar = :miktar"),
    @NamedQuery(name = "Plans.findByTermin", query = "SELECT p FROM Plans p WHERE p.termin = :termin"),
    @NamedQuery(name = "Plans.findByEskiTip", query = "SELECT p FROM Plans p WHERE p.eskiTip = :eskiTip"),
    @NamedQuery(name = "Plans.findByTip", query = "SELECT p FROM Plans p WHERE p.tip = :tip"),
    @NamedQuery(name = "Plans.findByDurum", query = "SELECT p FROM Plans p WHERE p.durum = :durum"),
    @NamedQuery(name = "Plans.findByUretimBasla", query = "SELECT p FROM Plans p WHERE p.uretimBasla = :uretimBasla"),
    @NamedQuery(name = "Plans.findByUretimBitir", query = "SELECT p FROM Plans p WHERE p.uretimBitir = :uretimBitir"),
    @NamedQuery(name = "Plans.findByUretilen", query = "SELECT p FROM Plans p WHERE p.uretilen = :uretilen"),
    @NamedQuery(name = "Plans.findByBaslik", query = "SELECT p FROM Plans p WHERE p.baslik = :baslik"),
    @NamedQuery(name = "Plans.findByTatilGun", query = "SELECT p FROM Plans p WHERE p.tatilGun = :tatilGun"),
    @NamedQuery(name = "Plans.findByUretimBaslama", query = "SELECT p FROM Plans p WHERE p.uretimBaslama = :uretimBaslama"),
    @NamedQuery(name = "Plans.findByUretimBitis", query = "SELECT p FROM Plans p WHERE p.uretimBitis = :uretimBitis"),
    @NamedQuery(name = "Plans.findByPlanKGTamam", query = "SELECT p FROM Plans p WHERE p.planKGTamam = :planKGTamam")})
public class Plans implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "UniqueId")
    private Integer uniqueId;
    @Column(name = "Type")
    private Integer type;
    @Column(name = "StartDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "EndDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "Allday")
    private Boolean allday;
    @Size(max = 100)
    @Column(name = "Subject")
    private String subject;
    @Size(max = 100)
    @Column(name = "Location")
    private String location;
    @Size(max = 100)
    @Column(name = "Description")
    private String description;
    @Column(name = "Status")
    private Integer status;
    @Column(name = "Label")
    private Integer label;
    @Column(name = "ResourceId")
    private Integer resourceId;
    @Size(max = 2147483647)
    @Column(name = "ResourceIDs")
    private String resourceIDs;
    @Size(max = 2147483647)
    @Column(name = "RemindInfo")
    private String remindInfo;
    @Size(max = 2147483647)
    @Column(name = "CustomField1")
    private String customField1;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Fark")
    private BigDecimal fark;
    @Column(name = "KgDakika")
    private BigDecimal kgDakika;
    @Column(name = "KgPlan")
    private BigDecimal kgPlan;
    @Column(name = "Kafa")
    private Integer kafa;
    @Column(name = "Miktar")
    private BigDecimal miktar;
    @Column(name = "Termin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date termin;
    @Column(name = "EskiTip")
    private Integer eskiTip;
    @Column(name = "Tip")
    private Integer tip;
    @Column(name = "Durum")
    private Integer durum;
    @Column(name = "UretimBasla")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uretimBasla;
    @Column(name = "UretimBitir")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uretimBitir;
    @Column(name = "Uretilen")
    private BigDecimal uretilen;
    @Size(max = 50)
    @Column(name = "Baslik")
    private String baslik;
    @Column(name = "TatilGun")
    private Integer tatilGun;
    @Column(name = "UretimBaslama")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uretimBaslama;
    @Column(name = "UretimBitis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uretimBitis;
    @Column(name = "PlanKGTamam")
    private Short planKGTamam;

    public Plans() {
    }

    public Plans(Integer uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Integer getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Integer uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getAllday() {
        return allday;
    }

    public void setAllday(Boolean allday) {
        this.allday = allday;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceIDs() {
        return resourceIDs;
    }

    public void setResourceIDs(String resourceIDs) {
        this.resourceIDs = resourceIDs;
    }

    public String getRemindInfo() {
        return remindInfo;
    }

    public void setRemindInfo(String remindInfo) {
        this.remindInfo = remindInfo;
    }

    public String getCustomField1() {
        return customField1;
    }

    public void setCustomField1(String customField1) {
        this.customField1 = customField1;
    }

    public BigDecimal getFark() {
        return fark;
    }

    public void setFark(BigDecimal fark) {
        this.fark = fark;
    }

    public BigDecimal getKgDakika() {
        return kgDakika;
    }

    public void setKgDakika(BigDecimal kgDakika) {
        this.kgDakika = kgDakika;
    }

    public BigDecimal getKgPlan() {
        return kgPlan;
    }

    public void setKgPlan(BigDecimal kgPlan) {
        this.kgPlan = kgPlan;
    }

    public Integer getKafa() {
        return kafa;
    }

    public void setKafa(Integer kafa) {
        this.kafa = kafa;
    }

    public BigDecimal getMiktar() {
        return miktar;
    }

    public void setMiktar(BigDecimal miktar) {
        this.miktar = miktar;
    }

    public Date getTermin() {
        return termin;
    }

    public void setTermin(Date termin) {
        this.termin = termin;
    }

    public Integer getEskiTip() {
        return eskiTip;
    }

    public void setEskiTip(Integer eskiTip) {
        this.eskiTip = eskiTip;
    }

    public Integer getTip() {
        return tip;
    }

    public void setTip(Integer tip) {
        this.tip = tip;
    }

    public Integer getDurum() {
        return durum;
    }

    public void setDurum(Integer durum) {
        this.durum = durum;
    }

    public Date getUretimBasla() {
        return uretimBasla;
    }

    public void setUretimBasla(Date uretimBasla) {
        this.uretimBasla = uretimBasla;
    }

    public Date getUretimBitir() {
        return uretimBitir;
    }

    public void setUretimBitir(Date uretimBitir) {
        this.uretimBitir = uretimBitir;
    }

    public BigDecimal getUretilen() {
        return uretilen;
    }

    public void setUretilen(BigDecimal uretilen) {
        this.uretilen = uretilen;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public Integer getTatilGun() {
        return tatilGun;
    }

    public void setTatilGun(Integer tatilGun) {
        this.tatilGun = tatilGun;
    }

    public Date getUretimBaslama() {
        return uretimBaslama;
    }

    public void setUretimBaslama(Date uretimBaslama) {
        this.uretimBaslama = uretimBaslama;
    }

    public Date getUretimBitis() {
        return uretimBitis;
    }

    public void setUretimBitis(Date uretimBitis) {
        this.uretimBitis = uretimBitis;
    }

    public Short getPlanKGTamam() {
        return planKGTamam;
    }

    public void setPlanKGTamam(Short planKGTamam) {
        this.planKGTamam = planKGTamam;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uniqueId != null ? uniqueId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plans)) {
            return false;
        }
        Plans other = (Plans) object;
        if ((this.uniqueId == null && other.uniqueId != null) || (this.uniqueId != null && !this.uniqueId.equals(other.uniqueId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.Plans[ uniqueId=" + uniqueId + " ]";
    }
    
}
