package oop.search.infrastructure;

import oop.search.application.NewsPublisher;
import oop.search.domain.NewsResult;

import java.util.List;

public class GitHubNewsPublisher extends AbstractHttpClient implements NewsPublisher {

    private static final String GITHUB_API_URL = "https://api.github.com/repos/%s/%s/issues";

    public GitHubNewsPublisher() {
        super(GITHUB_API_URL);
    }

    @Override
    public void publish(String topic, List<NewsResult> newsResults) {

    }
}
