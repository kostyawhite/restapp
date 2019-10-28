package ru.sberbank.school.repositories;

import ru.sberbank.school.models.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
