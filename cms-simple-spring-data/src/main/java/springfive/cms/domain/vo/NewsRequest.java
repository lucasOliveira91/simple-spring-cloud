package springfive.cms.domain.vo;

import lombok.Data;
import springfive.cms.domain.models.Category;
import springfive.cms.domain.models.Tag;

import java.util.Set;

/**
 * Created by loliveira on 01/11/18.
 */
@Data
public class NewsRequest {

    String title;
    String content;
    Set<Category> categories;
    Set<Tag> tags;
}
