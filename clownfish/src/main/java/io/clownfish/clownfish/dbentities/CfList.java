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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cf_list", catalog = "clownfish", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CfList.findAll", query = "SELECT c FROM CfList c"),
    @NamedQuery(name = "CfList.findById", query = "SELECT c FROM CfList c WHERE c.id = :id"),
    @NamedQuery(name = "CfList.findByName", query = "SELECT c FROM CfList c WHERE c.name = :name"),
    @NamedQuery(name = "CfList.findByClassref", query = "SELECT c FROM CfList c WHERE c.classref = :classref"),
    @NamedQuery(name = "CfList.findByClassrefAndName", query = "SELECT c FROM CfList c WHERE c.classref = :classref AND c.name = :name"),
    @NamedQuery(name = "CfList.findByMaintenance", query = "SELECT l FROM CfList l INNER JOIN CfClass c ON l.classref = c.id WHERE c.maintenance = :maintenance")
})
public class CfList implements Serializable {

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
    @JoinColumn(name = "classref", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private CfClass classref;

    public CfList() {
    }

    public CfList(Long id) {
        this.id = id;
    }

    public CfList(Long id, String name, CfClass classref) {
        this.id = id;
        this.name = name;
        this.classref = classref;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CfClass getClassref() {
        return classref;
    }

    public void setClassref(CfClass classref) {
        this.classref = classref;
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
        if (!(object instanceof CfList)) {
            return false;
        }
        CfList other = (CfList) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "io.clownfish.clownfish.dbentities.CfList[ id=" + id + " ]";
    }
    
}
