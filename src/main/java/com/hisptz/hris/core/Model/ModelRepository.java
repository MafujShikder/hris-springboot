package com.hisptz.hris.core.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by Guest on 8/20/18.
 */
@NoRepositoryBean
public interface ModelRepository<T extends Model> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {

}
