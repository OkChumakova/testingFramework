package steps;

import pages.SearchResultsPage;

public class SearchResultsSteps {

    private SearchResultsPage searchResultPage = new SearchResultsPage();

    public SearchResultsSteps verifyThatTopResultContainsCorrectText(String text) {
        searchResultPage.assertThatResultsContainCorrectText(text);
        return this;
    }

    public SearchResultsSteps verifyThatTopResultContainsProperAttributeText(String text) {
        searchResultPage.assertThatTopResultTagContainsProperText(text);
        return this;
    }
}
