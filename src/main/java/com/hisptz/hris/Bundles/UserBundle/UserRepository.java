package com.hisptz.hris.Bundles.UserBundle;

import com.hisptz.hris.core.Model.Model;
import com.hisptz.hris.core.Model.ModelRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Guest on 8/7/18.
 */
@Repository
@Transactional
public interface UserRepository<User extends Model> extends ModelRepository<User> {

}
