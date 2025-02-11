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
package io.clownfish.clownfish.dbrepository;

import io.clownfish.clownfish.daointerface.CfAssetkeywordDAO;
import io.clownfish.clownfish.dbentities.CfAssetkeyword;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sulzbachr
 */
@Repository
public class CfAssetKeywordDAOImpl implements CfAssetkeywordDAO {

    private final SessionFactory sessionFactory;
    
    @Autowired 
    public CfAssetKeywordDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    

    @Override
    public CfAssetkeyword create(CfAssetkeyword entity) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(entity);
        return entity;
    }

    @Override
    public boolean delete(CfAssetkeyword entity) {
        Session session = this.sessionFactory.getCurrentSession();
        session.delete(entity);
        return true;
    }

    @Override
    public CfAssetkeyword edit(CfAssetkeyword entity) {
        Session session = this.sessionFactory.getCurrentSession();
        session.merge(entity);
        return entity;
    }

    @Override
    public List<CfAssetkeyword> findAll() {
        Session session = this.sessionFactory.getCurrentSession();
        TypedQuery query = (TypedQuery) session.getNamedQuery("CfAssetkeyword.findAll");
        List<CfAssetkeyword> cfassetkeywordlist = query.getResultList();
        return cfassetkeywordlist;
    }

    @Override
    public List<CfAssetkeyword> findByAssetRef(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        TypedQuery query = (TypedQuery) session.getNamedQuery("CfAssetkeyword.findByAssetref");
        query.setParameter("assetref", id);
        List<CfAssetkeyword> cfassetkeywordlist = query.getResultList();
        return cfassetkeywordlist;
    }

    @Override
    public List<CfAssetkeyword> findByKeywordRef(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        TypedQuery query = (TypedQuery) session.getNamedQuery("CfAssetkeyword.findByKeywordref");
        query.setParameter("keywordref", id);
        List<CfAssetkeyword> cfassetkeywordlist = query.getResultList();
        return cfassetkeywordlist;
    }

    @Override
    public CfAssetkeyword findByAssetRefAndKeywordRef(Long assetref, Long keywordref) {
        Session session = this.sessionFactory.getCurrentSession();
        TypedQuery query = (TypedQuery) session.getNamedQuery("CfAssetkeyword.findByAssetrefAndKeywordref");
        query.setParameter("assetref", assetref);
        query.setParameter("keywordref", keywordref);
        CfAssetkeyword cfcontent = (CfAssetkeyword) query.getSingleResult();
        return cfcontent;
    }
}
