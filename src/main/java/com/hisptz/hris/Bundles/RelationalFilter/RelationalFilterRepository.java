package com.hisptz.hris.Bundles.RelationalFilter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Guest on 8/14/18.
 */
@Repository
public interface RelationalFilterRepository extends JpaRepository<RelationalFilter, Long> {
}
