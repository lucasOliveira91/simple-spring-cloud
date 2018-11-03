package springfive.cms.domain.models;

import lombok.Data;

/**
 * Created by loliveira on 01/11/18.
 */
@Data
public class User {

    String id;
    String identity;
    String name;
    Role role;
}
