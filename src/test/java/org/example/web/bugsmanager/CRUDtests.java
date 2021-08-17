package org.example.web.bugsmanager;


import org.example.infrastructure.utils.StringUtils;
import org.example.infrastructure.utils.TimeUtils;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CRUDtests extends BugsManagerTestBase {

    static final String randomBugName = "Yatsenko_bug" + StringUtils.randomString(StringUtils.Mode.NUMERIC, 5);
    static final String randomBugNotes = "Yatsenko_note" + StringUtils.randomString(StringUtils.Mode.ALPHA, 5);

    @Test
    public void createBugUsingAddInForm() {

        logger.log("Create bug using form");
        bugsManagerWebsite.mainPage().openAndFillForm(randomBugName, randomBugNotes);

        logger.log("Check that bug is created");
        assertTrue(bugsManagerWebsite.mainPage().isBugPresent("Yatsenko"));
        bugsManagerWebsite.mainPage().refreshPage();

        logger.log("Delete a bug");
        bugsManagerWebsite.mainPage().deleteBug();
        TimeUtils.waitFor(2);

        logger.log("Check that bug is deleted");
        assertFalse(bugsManagerWebsite.mainPage().isBugPresent("Yatsenko"));
    }

    @Test
    public void createBugUsingAdd() {

        logger.log("Fill bug name and notes");
        bugsManagerWebsite.mainPage().fillNameAndNotes(randomBugName, randomBugNotes);

        logger.log("Check that bug has been created");
        assertTrue("Bug wasn't created", bugsManagerWebsite.mainPage()
                .isBugPresent("Yatsenko"));
        bugsManagerWebsite.mainPage().refreshPage();

        logger.log("Delete a bug");
        bugsManagerWebsite.mainPage()
                .deleteBug();
        TimeUtils.waitFor(2);

        logger.log("Check that bug is deleted");
        assertFalse(bugsManagerWebsite.mainPage()
                .isBugPresent("Yatsenko"));

        TimeUtils.waitFor(5);
    }

    @Test
    public void checkThatFirstBugIsPresent() {
        logger.log("Check that First Bug is present");
        assertTrue("First Bug is not displayed", bugsManagerWebsite.mainPage().isBugPresent("First Bug"));
    }
}
