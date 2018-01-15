/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.services;

import tr.kasim.crm.db.dao.PersonelKartDao;
import tr.kasim.crm.model.PersonelKart;

/**
 *
 * @author SelmanKasim
 */
public class PersonelKartService extends CommonService<PersonelKart>{
    
    public PersonelKartService() {
        super(new PersonelKartDao());
    }
    
}
