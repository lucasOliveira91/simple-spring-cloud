package springfive.cms.domain.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import springfive.cms.domain.models.News;

/**
 * Created by loliveira on 02/11/18.
 */
public interface NewsRepository extends ReactiveMongoRepository<News,String> {
}