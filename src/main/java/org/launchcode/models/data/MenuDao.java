package org.launchcode.models.data;

import org.launchcode.models.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by iesheagoree on 4/21/2017.
 */


@Repository
@Transactional
// Menu - the class it will work with, the primary key will be Integer
public interface MenuDao extends CrudRepository <Menu, Integer> {
}
