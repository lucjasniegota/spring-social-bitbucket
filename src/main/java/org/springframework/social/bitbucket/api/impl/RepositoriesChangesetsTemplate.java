package org.springframework.social.bitbucket.api.impl;

import org.springframework.social.bitbucket.api.BitBucketChangeset;
import org.springframework.social.bitbucket.api.BitBucketChangesets;
import org.springframework.social.bitbucket.api.BitBucketComment;
import org.springframework.social.bitbucket.api.BitBucketDiff;
import org.springframework.social.bitbucket.api.BitBucketRepositoryStatistics;
import org.springframework.social.bitbucket.api.RepositoriesChangesetsOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Cyprian Śniegota
 * @since 2.0.0
 */
public class RepositoriesChangesetsTemplate extends AbstractBitBucketOperations implements RepositoriesChangesetsOperations {
    public RepositoriesChangesetsTemplate(RestTemplate restTemplate, boolean authorized) {
        super(restTemplate, authorized, V1);
    }

    @Override
    public final List<BitBucketChangeset> getChangesets(String accountName, String repoSlug, String start, int limit) {
        return null;
    }

    @Override
    public  final BitBucketChangeset getChangeset(String accountName, String repoSlug, String node) {
        return null;
    }

    @Override
    public  final List<BitBucketRepositoryStatistics> getStatistics(String accountName, String repoSlug, String node) {
        return null;
    }

    @Override
    public  final List<BitBucketDiff> getDiff(String accountName, String repoSlug, String node) {
        return null;
    }

    @Override
    public  final List<BitBucketComment> getComments(String accountName, String repoSlug, String node) {
        return null;
    }

    @Override
    public  final void removeComment(String accountName, String repoSlug, String node, Long commentId) {

    }

    @Override
    public  final BitBucketComment postComment(String accountName, String repoSlug, String node, BitBucketComment comment) {
        return null;
    }

    @Override
    public  final BitBucketComment updateComment(String accountName, String repoSlug, String node, Long commentId) {
        return null;
    }

    @Override
    public  final BitBucketChangeset toggleSpamComment(String accountName, String repoSlug, String node, Long commentId) {
        return null;
    }
}
