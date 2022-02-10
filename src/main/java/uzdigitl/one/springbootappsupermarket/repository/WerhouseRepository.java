package uzdigitl.one.springbootappsupermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uzdigitl.one.springbootappsupermarket.entity.Werhouse;

@Repository
public interface WerhouseRepository extends JpaRepository<Werhouse, Long> {
}
