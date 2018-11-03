package springfive.cms.domain.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import springfive.cms.domain.models.Category;

/**
 * Created by loliveira on 01/11/18.
 */
public interface CategoryRepository extends ReactiveMongoRepository<Category,String> {
}