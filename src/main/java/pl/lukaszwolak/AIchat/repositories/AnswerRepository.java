package pl.lukaszwolak.AIchat.repositories;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lukaszwolak.AIchat.etenties.*;

import java.util.Comparator;
import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    default List<Answer> findLastN(int n) {
        return findAll(PageRequest.of(0, n, Sort.by(Sort.Direction.DESC,"id")))
                .stream()
                .sorted(Comparator.comparing(Answer::getId))
                .toList();
    }
}
