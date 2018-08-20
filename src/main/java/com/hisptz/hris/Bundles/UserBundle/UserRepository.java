package com.hisptz.hris.Bundles.UserBundle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Guest on 8/7/18.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
