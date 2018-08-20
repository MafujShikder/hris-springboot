package com.hisptz.hris.Bundles.FormSectionBundle;

import com.hisptz.hris.core.Model.ModelRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Guest on 8/14/18.
 */
@Repository
public interface FormSectionRepository extends ModelRepository<FormSection> {
}
