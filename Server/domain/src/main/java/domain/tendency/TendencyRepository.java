package domain.tendency;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TendencyRepository extends CrudRepository<Tendency, Long> {
}
