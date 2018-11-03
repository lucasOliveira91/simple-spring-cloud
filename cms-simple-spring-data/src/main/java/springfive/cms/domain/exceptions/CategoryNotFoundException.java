package springfive.cms.domain.exceptions;

import lombok.Getter;

/**
 * Created by loliveira on 01/11/18.
 */
public class CategoryNotFoundException extends RuntimeException {
    @Getter
    private final String id;

    public CategoryNotFoundException(String id) {
        this.id = id;
    }
}
