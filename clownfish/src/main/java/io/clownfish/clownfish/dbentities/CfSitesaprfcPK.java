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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 *
 * @author sulzbachr
 */
@Embeddable
public class CfSitesaprfcPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "siteref")
    private long siteref;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "rfcgroup")
    private String rfcgroup;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "rfcfunction")
    private String rfcfunction;

    public CfSitesaprfcPK() {
    }

    public CfSitesaprfcPK(long siteref, String rfcgroup, String rfcfunction) {
        this.siteref = siteref;
        this.rfcgroup = rfcgroup;
        this.rfcfunction = rfcfunction;
    }

    public long getSiteref() {
        return siteref;
    }

    public void setSiteref(long siteref) {
        this.siteref = siteref;
    }

    public String getRfcgroup() {
        return rfcgroup;
    }

    public void setRfcgroup(String rfcgroup) {
        this.rfcgroup = rfcgroup;
    }

    public String getRfcfunction() {
        return rfcfunction;
    }

    public void setRfcfunction(String rfcfunction) {
        this.rfcfunction = rfcfunction;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) siteref;
        hash += (rfcgroup != null ? rfcgroup.hashCode() : 0);
        hash += (rfcfunction != null ? rfcfunction.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CfSitesaprfcPK)) {
            return false;
        }
        CfSitesaprfcPK other = (CfSitesaprfcPK) object;
        if (this.siteref != other.siteref) {
            return false;
        }
        if ((this.rfcgroup == null && other.rfcgroup != null) || (this.rfcgroup != null && !this.rfcgroup.equals(other.rfcgroup))) {
            return false;
        }
        if ((this.rfcfunction == null && other.rfcfunction != null) || (this.rfcfunction != null && !this.rfcfunction.equals(other.rfcfunction))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "io.clownfish.clownfish.dbentities.CfSitesaprfcPK[ siteref=" + siteref + ", rfcgroup=" + rfcgroup + ", rfcfunction=" + rfcfunction + " ]";
    }
    
}
