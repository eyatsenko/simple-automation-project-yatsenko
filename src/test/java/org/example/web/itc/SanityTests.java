package org.example.web.itc;

import org.example.projects.itc.entities.Post;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SanityTests extends ItcTestBase {

    @Test
    public void testRandomTopicOnEachPage() {
        logger.log("Open random article");
        Post randomNewsPost= itc.mainPage().openRandomArticle();
        Post openedNewsPost = itc.postPage().getGeneralPostInfo();

        logger.log("Check article page");
        assertTrue (openedNewsPost.equals(randomNewsPost));

        logger.log("Check Review tab");
        itc.menu().openReviewMenu();


    }
}