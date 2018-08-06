package com.example.sprinboot.repos;

import com.example.sprinboot.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {



    List<Message> findByTag (String tag);
}
