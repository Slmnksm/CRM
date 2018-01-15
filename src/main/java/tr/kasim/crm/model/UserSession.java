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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "UserSession")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserSession.findAll", query = "SELECT u FROM UserSession u"),
    @NamedQuery(name = "UserSession.findById", query = "SELECT u FROM UserSession u WHERE u.id = :id"),
    @NamedQuery(name = "UserSession.findByIp", query = "SELECT u FROM UserSession u WHERE u.ip = :ip"),
    @NamedQuery(name = "UserSession.findByGirisZamani", query = "SELECT u FROM UserSession u WHERE u.girisZamani = :girisZamani")})
public class UserSession implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "ip")
    private String ip;
    @Column(name = "girisZamani")
    @Temporal(TemporalType.DATE)
    private Date girisZamani;
    @JoinColumn(name = "fkKullanici", referencedColumnName = "pkKullanici")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SistemKullanici fkKullanici;

    public UserSession() {
    }

    public UserSession(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getGirisZamani() {
        return girisZamani;
    }

    public void setGirisZamani(Date girisZamani) {
        this.girisZamani = girisZamani;
    }

    public SistemKullanici getFkKullanici() {
        return fkKullanici;
    }

    public void setFkKullanici(SistemKullanici fkKullanici) {
        this.fkKullanici = fkKullanici;
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
        if (!(object instanceof UserSession)) {
            return false;
        }
        UserSession other = (UserSession) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.kasim.crm.model.UserSession[ id=" + id + " ]";
    }
    
}
