package com.hisptz.hris.core.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by vincent on 8/16/18.
 */

@NoRepositoryBean
public interface ModelRepository<T extends Model> extends JpaRepository<T, Long>,JpaSpecificationExecutor {

}
