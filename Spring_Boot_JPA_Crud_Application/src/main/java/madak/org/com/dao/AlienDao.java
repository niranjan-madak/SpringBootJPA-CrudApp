package madak.org.com.dao;

import org.springframework.data.repository.CrudRepository;

import madak.org.com.model.Alien;

public interface AlienDao extends CrudRepository<Alien,Integer> {

}
