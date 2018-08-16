package com.hisptz.hris.core;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

/**
 * Created by vincent on 8/16/18.
 */

@NoRepositoryBean
public interface ModelRepository<T extends Model> extends JpaRepository<T, Long> {

}
