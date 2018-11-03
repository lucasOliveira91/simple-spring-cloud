package springfive.cms.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by loliveira on 01/11/18.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    String userId;
    String status;
}
