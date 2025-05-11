package com.moduhomeweb.ModuHome.repository;

import com.moduhomeweb.ModuHome.model.MessageThread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageThreadRepository extends JpaRepository<MessageThread, Long> {
}
