package com.hisptz.hris.Bundles.FieldBundle;

import com.hisptz.hris.core.Model.ModelRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by Guest on 8/10/18.
 */
//@Repository
//public interface FieldRepository extends JpaRepository<Field, Long>, JpaSpecificationExecutor<Field> {
//}

@Repository
public interface  FieldRepository extends ModelRepository<Field>{

}
