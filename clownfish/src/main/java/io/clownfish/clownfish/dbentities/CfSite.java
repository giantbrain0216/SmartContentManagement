/*
 * Copyright 2019 sulzbachr.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.clownfish.clownfish.dbentities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sulzbachr
 */
@Entity
@Table(name = "cf_site", catalog = "clownfish", schema = "")
@Cacheable(false)
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CfSite.findAll", query = "SELECT c FROM CfSite c"),
    @NamedQuery(name = "CfSite.findById", query = "SELECT c FROM CfSite c WHERE c.id = :id"),
    @NamedQuery(name = "CfSite.findByName", query = "SELECT c FROM CfSite c WHERE c.name = :name"),
    @NamedQuery(name = "CfSite.findByTemplateref", query = "SELECT c FROM CfSite c WHERE c.templateref = :templateref"),
    @NamedQuery(name = "CfSite.findByParentref", query = "SELECT c FROM CfSite c WHERE c.parentref = :parentref"),
    @NamedQuery(name = "CfSite.findByStylesheetref", query = "SELECT c FROM CfSite c WHERE c.stylesheetref = :stylesheetref"),
    @NamedQuery(name = "CfSite.findByJavascriptref", query = "SELECT c FROM CfSite c WHERE c.javascriptref = :javascriptref"),
    @NamedQuery(name = "CfSite.findByHtmlcompression", query = "SELECT c FROM CfSite c WHERE c.htmlcompression = :htmlcompression"),
    @NamedQuery(name = "CfSite.findByCharacterencoding", query = "SELECT c FROM CfSite c WHERE c.characterencoding = :characterencoding"),
    @NamedQuery(name = "CfSite.findByContenttype", query = "SELECT c FROM CfSite c WHERE c.contenttype = :contenttype"),
    @NamedQuery(name = "CfSite.findByLocale", query = "SELECT c FROM CfSite c WHERE c.locale = :locale"),
    @NamedQuery(name = "CfSite.findByAliaspath", query = "SELECT c FROM CfSite c WHERE c.aliaspath = :aliaspath"),
    @NamedQuery(name = "CfSite.findBySitemap", query = "SELECT c FROM CfSite c WHERE c.sitemap = :sitemap"),
    @NamedQuery(name = "CfSite.findBySearchresult", query = "SELECT c FROM CfSite c WHERE c.searchresult = :searchresult"),
    @NamedQuery(name = "CfSite.findByShorturl", query = "SELECT c FROM CfSite c WHERE c.shorturl = :shorturl")
})
public class CfSite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "name")
    private String name;
    @Column(name = "templateref")
    private BigInteger templateref;
    @Column(name = "parentref")
    private BigInteger parentref;
    @Column(name = "stylesheetref")
    private BigInteger stylesheetref;
    @Column(name = "javascriptref")
    private BigInteger javascriptref;
    @Basic(optional = false)
    @NotNull
    @Column(name = "htmlcompression")
    private int htmlcompression;
    @Size(max = 16)
    @Column(name = "characterencoding")
    private String characterencoding;
    @Size(max = 16)
    @Column(name = "contenttype")
    private String contenttype;
    @Size(max = 16)
    @Column(name = "locale")
    private String locale;
    @Size(max = 255)
    @Column(name = "aliaspath")
    private String aliaspath;
    @Basic(optional = false)
    @NotNull
    @Column(name = "gzip")
    private int gzip;
    @Size(max = 255)
    @Column(name = "title")
    private String title;
    @Column(name = "job")
    private boolean job;
    @Column(name = "description")
    private String description;
    @Column(name = "staticsite")
    private boolean staticsite;
    @Column(name = "searchrelevant")
    private boolean searchrelevant;
    @Column(name = "hitcounter")
    private BigInteger hitcounter;
    @Column(name = "sitemap")
    private boolean sitemap;
    @Column(name = "searchresult")
    private boolean searchresult;
    @Column(name = "shorturl")
    private String shorturl;

    public CfSite() {
    }

    public CfSite(Long id) {
        this.id = id;
    }

    public CfSite(Long id, String name, int htmlcompression) {
        this.id = id;
        this.name = name;
        this.htmlcompression = htmlcompression;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        if (null != name) {
            return name;
        } else {
            return "";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getTemplateref() {
        return templateref;
    }

    public void setTemplateref(BigInteger templateref) {
        this.templateref = templateref;
    }

    public BigInteger getParentref() {
        return parentref;
    }

    public void setParentref(BigInteger parentref) {
        this.parentref = parentref;
    }

    public BigInteger getStylesheetref() {
        return stylesheetref;
    }

    public void setStylesheetref(BigInteger stylesheetref) {
        this.stylesheetref = stylesheetref;
    }

    public BigInteger getJavascriptref() {
        return javascriptref;
    }

    public void setJavascriptref(BigInteger javascriptref) {
        this.javascriptref = javascriptref;
    }

    public int getHtmlcompression() {
        return htmlcompression;
    }

    public void setHtmlcompression(int htmlcompression) {
        this.htmlcompression = htmlcompression;
    }

    public String getCharacterencoding() {
        if (null != characterencoding) {
            return characterencoding;
        } else {
            return "";
        }
    }

    public void setCharacterencoding(String characterencoding) {
        this.characterencoding = characterencoding;
    }

    public String getContenttype() {
        if (null != contenttype) {
            return contenttype;
        } else {
            return "";
        }
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }

    public String getLocale() {
        if (null != locale) {
            return locale;
        } else {
            return "";
        }
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getAliaspath() {
        if (null != aliaspath) {
            return aliaspath;
        } else {
            return "";
        }
    }

    public void setAliaspath(String aliaspath) {
        this.aliaspath = aliaspath;
    }

    public int getGzip() {
        return gzip;
    }

    public void setGzip(int gzip) {
        this.gzip = gzip;
    }

    public String getTitle() {
        if (null != title) {
            return title;
        } else {
            return "";
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isJob() {
        return job;
    }

    public void setJob(boolean job) {
        this.job = job;
    }

    public String getDescription() {
        if (null != description) {
            return description;
        } else {
            return "";
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStaticsite() {
        return staticsite;
    }

    public void setStaticsite(boolean staticsite) {
        this.staticsite = staticsite;
    }

    public boolean isSearchrelevant() {
        return searchrelevant;
    }

    public void setSearchrelevant(boolean searchrelevant) {
        this.searchrelevant = searchrelevant;
    }

    public BigInteger getHitcounter() {
        return hitcounter;
    }

    public void setHitcounter(BigInteger hitcounter) {
        this.hitcounter = hitcounter;
    }

    public boolean isSitemap() {
        return sitemap;
    }

    public void setSitemap(boolean sitemap) {
        this.sitemap = sitemap;
    }

    public boolean isSearchresult() {
        return searchresult;
    }

    public void setSearchresult(boolean searchresult) {
        this.searchresult = searchresult;
    }

    public String getShorturl() {
        return shorturl;
    }

    public void setShorturl(String shorturl) {
        this.shorturl = shorturl;
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
        if (!(object instanceof CfSite)) {
            return false;
        }
        CfSite other = (CfSite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
