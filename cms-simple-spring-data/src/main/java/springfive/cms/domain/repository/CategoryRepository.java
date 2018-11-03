package springfive.cms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springfive.cms.domain.models.Category;

import java.util.List;

/**
 * Created by loliveira on 01/11/18.
 */
public interface CategoryRepository extends JpaRepository<Category, String> {
    List<Category> findByName(String name);
    List<Category> findByNameIgnoreCaseStartingWith(String name);
}