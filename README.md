# **Practical Exercise - QA Automation**

## Objective

Write e2e automation test cases using Selenium/Cypress _(depending on your job application)_.

## **Guidelines**

- Use different types of assertions while validating.
- Use Chrome browser's latest version.
- Execute tests in ‘headless mode’. (Headless execution)
- Create POM structure - different directories for locators, pages, driver factory, etc.
- Write all test scenarios below in the same program (different page files).
- Use one application to execute all the cases below.

## Test Scenario to create

### Task-1 (Verify file is uploaded successfully)

_Note: Use only CSS_Selectors_

1. Hit the URL - [https://the-internet.herokuapp.com/upload](https://the-internet.herokuapp.com/upload)
2. Drag and drop the pdf file to upload in the area.

### Task-2 (Verify drag and drop is working as expected)

_Note: Use only XPATH locators_

1. Hit the URL- [https://the-internet.herokuapp.com/drag_and_drop](https://the-internet.herokuapp.com/drag_and_drop)
2. Switch the position of ‘A’ and ‘B’ using the offset method.

### Task-3 (Carousal)

1. Hit the URL- [https://auberginesolutions.com/](https://auberginesolutions.com/)
2. Navigate to expertise > python.
3. Verify the first image present on the page is displayed using assertion.
4. Verify the carousel displayed.
5. Open “Talk to our python experts now” button link in the new tab.
6. Switch to the main tab.

### Task-4 (Verify calendar is displayed correctly)

1. Hit the URL - [https://tockify.com/](https://tockify.com/)
2. Select “28 Feb 2040” from the calendar displayed.
3. Verify the date displayed as ‘28/02/40’ in the calendar using assertion.
4. Select the ‘Monthly’ tab.

### Task-5

1. Hit the URL - [https://www.amazon.in/]
2. Search "boat headphones"
3. Fetch all headphones list whose price is below 3000.

## Submission

- Push your code to a this repository only and do not create your own repository.
- Update the `README.md` file with instructions on how to run the suite/cases.

## Evaluation Criteria
Your submission will be evaluated based on the following factors:

- Code quality, reusability, and adherence to best practices.
- Accuracy of the locators used.
- Efficient use of waits.
