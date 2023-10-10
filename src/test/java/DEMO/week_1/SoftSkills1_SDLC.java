package DEMO.week_1;
// HOMEWORK - DemoQA - Login - create test cases
public class SoftSkills1_SDLC {

    // Testing - process of researching soft or app in order to get information about product quality
    // Bug - defect, when soft or app is not working as per the requirement

    // TESTING TYPES:

    // UI (User interface) testing
    // 1.Functional testing - checking functions:
    // - Positive scenario
    // - Negative scenario
    // - Smoke testing - conducts 5-7 hours - testing most important functions - main pages, registration, payment
    // (Smoke suite is set of tools) conducts everytime when added new functions
    // - Regression testing - conduct fast 30min - test common product, not detailed testing

    // 2.Non-functional testing - early step testing
    // - design; - requirement testing (checking documentation); - checking everything before test case writing

    // 3. Load testing
    // - load testing - quality of performance, intensive, expected quantity of users;
    // - stress testing - stress loading, how product regenerates, evaluation of degradation of performance;
    // - volume testing - time of operations and quantity of users
    // - stability/reliability testing - long time performance with normal loading, check leaking of memory during this test etc.

    // ENVIRONMENTS:
    // dev environment
    // QA environment
    // production - final version of soft or app

    // SDLC Models:
    // Waterfall - cannot change requirements and return to previous step
    // Agile     - anytime can change requirements and return to any step

    // AGILE frameworks: 1.Scrum - Challenge style; 2.Kanban - Toyota style
    // SCRUM ceremonies:
    // 1. Backlog grooming - 1 time before Sprint, (Product Owner) - 30-60 min
    // 2. Sprint planning  - 1 time before Sprint, (PO,SM) - 30-60 min
    // 3. Daily StandUp    - every day (SC) - 15 min
    // 4. Sprint Demo      - 1 time, (SC,PO), 30-60 min
    // 5. Retrospective    - 1 time, wrapping up done work, (SM) - 30-60 min

    // FIRST TESTING PROCESS:
    // 1. Verification - checking if input fields, texts, buttons, links exist
    // 2. Validation - how input, button, links etc. work

    // Testing documentation:

    // 1. TEST PLAN (strategy):
    // a.Approach to testing;
    // b.Testing types;
    // c.OS,Cross browser,Testing models,components,testers,priority,sample forms for workers etc.

    // 2. TEST CASE (should remember positive, negative, smoke testing) -> Sample steps:
    // a.Open the login page
    // b.Verify login - username and password input fields are presented on the page...
    // Test case consist of: ID, name, steps, expected result. Good test case - no need to make it too detailed

    // 3. BUG REPORT: a.Name (user can login with invalid pass); b.Precondition (Go to login page);
    // c.Steps to reproduce (enter valid username and invalid pass and click login); d.Actual result (user is able to login);
    // e.Expected result (system should show the error and user should not login); f.Attachment (screenshot or video);
    // g.Severity level - Critical,Major,Medium,Low (Critical); h.Priority queue - High,Medium,Low (High); j.Environment (QA); 10.Submit to developer

    // EXCEPTIONS: NoSuchWindowException.
    //NoSuchFrameException.
    //NoSuchElementException.
    //NpSuchSelectorException. (use driver after closing session - driver.quit)
    //NoAlertPresentException.
    //InvalidSelectorException. (wrong selector/locator)
    //TimeoutException.
    //ElementNotVisibleException.
    //ElementNotSelectableException.
    //StaleElementReferenceException. (out date element if window refreshed and elements moved) -biggest disadvantage of selenium
}
