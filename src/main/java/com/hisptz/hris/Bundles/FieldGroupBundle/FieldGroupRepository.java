package com.hisptz.hris.Bundles.FieldGroupBundle;

import com.hisptz.hris.Bundles.FieldBundle.Field;
import com.hisptz.hris.core.Model.ModelRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Guest on 8/10/18.
 */
@Repository
public interface FieldGroupRepository extends ModelRepository<FieldGroup> {

}
