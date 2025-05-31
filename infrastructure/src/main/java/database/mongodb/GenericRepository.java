package database.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericRepository<T> extends MongoRepository<T, String> {
}
