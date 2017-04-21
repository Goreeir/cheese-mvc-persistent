package org.launchcode.models.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Locale.Category;

/**
 * Created by iesheagoree on 4/20/17.
 */
public interface CategoryDAO {

    @Repository
    @Transactional
    public interface CategoryDao extends CrudRepository<Category, Integer> {
    }
}
