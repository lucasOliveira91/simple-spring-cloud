package springfive.cms.domain.vo;

import lombok.Data;
import springfive.cms.domain.models.Role;

/**
 * Created by loliveira on 01/11/18.
 */
@Data
public class UserRequest {

    String identity;
    String name;
    Role role;
}
