package com.hisptz.hris.Bundles.UserBundle;

import com.hisptz.hris.core.Model;
import com.hisptz.hris.core.ModelRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.io.Serializable;

/**
 * Created by Guest on 8/7/18.
 */
@Repository
@Transactional
public interface UserRepository<User extends Model> extends ModelRepository<User> {

}
