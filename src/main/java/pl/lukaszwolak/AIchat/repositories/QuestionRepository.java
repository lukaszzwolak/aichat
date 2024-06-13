package pl.lukaszwolak.AIchat.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.lukaszwolak.AIchat.etenties.*;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {
}
