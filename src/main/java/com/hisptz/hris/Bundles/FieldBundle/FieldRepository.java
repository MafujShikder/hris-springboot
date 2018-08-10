package com.hisptz.hris.Bundles.FieldBundle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Guest on 8/10/18.
 */
@Repository
public interface FieldRepository extends JpaRepository<Field, Long> {
}
