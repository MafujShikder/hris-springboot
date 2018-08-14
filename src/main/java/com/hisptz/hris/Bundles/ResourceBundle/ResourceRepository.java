package com.hisptz.hris.Bundles.ResourceBundle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Guest on 8/14/18.
 */
@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long>{
}
