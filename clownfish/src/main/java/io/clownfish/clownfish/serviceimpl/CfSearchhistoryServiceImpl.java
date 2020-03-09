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
package io.clownfish.clownfish.serviceimpl;

import io.clownfish.clownfish.daointerface.CfSearchhistoryDAO;
import io.clownfish.clownfish.dbentities.CfSearchhistory;
import io.clownfish.clownfish.serviceinterface.CfSearchhistoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sulzbachr
 */
@Service
@Transactional
public class CfSearchhistoryServiceImpl implements CfSearchhistoryService {
    private final CfSearchhistoryDAO cfsearchhistoryDAO;
    
    @Autowired
    public CfSearchhistoryServiceImpl(CfSearchhistoryDAO cfsearchhistoryDAO) {
        this.cfsearchhistoryDAO = cfsearchhistoryDAO;
    }
    
    @Override
    public boolean create(CfSearchhistory entity) {
        return this.cfsearchhistoryDAO.create(entity);
    }

    @Override
    public boolean delete(CfSearchhistory entity) {
        return this.cfsearchhistoryDAO.delete(entity);
    }

    @Override
    public boolean edit(CfSearchhistory entity) {
        return this.cfsearchhistoryDAO.edit(entity);
    }    

    @Override
    public List<CfSearchhistory> findAll() {
        return this.cfsearchhistoryDAO.findAll();
    }

    @Override
    public CfSearchhistory findById(Long id) {
        return this.cfsearchhistoryDAO.findById(id);
    }

    @Override
    public CfSearchhistory findByExpression(String expression) {
        return this.cfsearchhistoryDAO.findByExpression(expression);
    }

    @Override
    public List<CfSearchhistory> findByExpressionBeginning(String expression) {
        return this.cfsearchhistoryDAO.findByExpressionBeginning(expression);
    }

}
