package br.com.arq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.arq.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long>{

	   //MongoRepository<Users,String>
	
	
}
