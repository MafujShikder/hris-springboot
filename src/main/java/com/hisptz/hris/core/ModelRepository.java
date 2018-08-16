package com.hisptz.hris.core;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.io.Serializable;
import java.util.List;

/**
 * Created by vincent on 8/16/18.
 */

@NoRepositoryBean
public interface ModelRepository<T extends Model> extends JpaRepository<T, Long>,JpaSpecificationExecutor {

}
