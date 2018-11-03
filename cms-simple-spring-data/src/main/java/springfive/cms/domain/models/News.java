package springfive.cms.domain.models;

import lombok.Data;

import java.util.Set;

/**
 * Created by loliveira on 01/11/18.
 */
@Data
public class News {

    String id;
    String titile;
    String content;
    User author;
    Set<User> mandatoryReviewers;
    Set<Review> reviewers;
    Set<Category> categories;
    Set<Tag> tags;

    public Boolean revised() {
        return this.mandatoryReviewers.stream().allMatch(reviewer -> this.reviewers.stream()
                .anyMatch(review -> reviewer.id.equals(review.userId) && "approved".equals(review.status)));
    }

    public Review review(String userId,String status) {
        final Review review = new Review(userId, status);
        this.reviewers.add(review);
        return review;
    }

}
