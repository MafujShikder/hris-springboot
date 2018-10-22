package com.hisptz.hris.Bundles.MessageMetadataBundle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MessageMetadataRepository extends JpaRepository<MessageMetadata, Long>, JpaSpecificationExecutor<Long>, PagingAndSortingRepository<MessageMetadata, Long> {

}