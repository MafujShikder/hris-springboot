package com.hisptz.hris.Bundles.LeaveRelativeBundle;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LeaveRelativeRepository extends JpaRepository<LeaveRelative, Long>, JpaSpecificationExecutor<LeaveRelative>, PagingAndSortingRepository<LeaveRelative, Long> {

}