package application;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LocatieRepository extends JpaRepository<!-User-!, Integer> {
	User findByProgramNameEquals(String programname);

	User deleteById(int id);

}
