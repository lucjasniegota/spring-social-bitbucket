package org.springframework.social.bitbucket.api;

import java.util.List;

/**
 * Links connect your commit messages and code comments directly to your JIRA issue tracker or Bamboo build server.
 * You can also create custom link resources.
 * The links resource supplies functionality for adding, updating, removing, and viewing links associated with your repositories.
 *
 * @author Cyprian Śniegota
 * @see "https://confluence.atlassian.com/display/BITBUCKET/links+Resources"
 * @since 2.0.0
 */
public interface RepositoriesLinksOperations {

    /**
     * Gets an array containing the links associated with a repository.
     * The caller must authenticate as a user with administrative access to the repository.
     * API call: GET https://bitbucket.org/api/1.0/repositories/{accountname}/{repo_slug}/links
     *
     * @param accountName The team or individual account owning the repository.
     * @param repoSlug The repository identifier.
     * @return List of links.
     */
    List<BitBucketLink> getLinks(String accountName, String repoSlug);

    /**
     * Gets an individual link on a repository. The caller must authenticate as a user with administrative access to the repository.
     * API call: GET https://bitbucket.org/api/1.0/repositories/{accountname}/{repo_slug}/links/{object_id}
     *
     * @param accountName The team or individual account owning the repository.
     * @param repoSlug The repository identifier.
     * @param linkId The component identifier.
     * @return Specified link object.
     */
    BitBucketLink getLink(String accountName, String repoSlug, Long linkId);

    /**
     * Creates a new link on the repository.
     * API call: POST https://bitbucket.org/api/1.0/repositories/{accountname}/{repo_slug}/links --data "handler=value"
     * --data "link_url= http://somesite.com " –data "link_key=value"
     *
     * @param accountName The team or individual account owning the repository.
     * @param repoSlug The repository identifier.
     * @param link Object to post.
     * @return Created object.
     */
    BitBucketLink postNewLink(String accountName, String repoSlug, BitBucketLink link);

    /**
     * Update a repository link.
     * API call: PUT https://bitbucket.org/api/1.0/repositories/{accountname}/{repo_slug}/links/{object_id} --data "link_key=value" --data "link_url= http://somesite.com "
     *
     * @param accountName The team or individual account owning the repository.
     * @param repoSlug The repository identifier.
     * @param linkId The component identifier.
     * @param link Object to post.
     * @return Updated object.
     */
    BitBucketLink updateLink(String accountName, String repoSlug, Long linkId, BitBucketLink link);

    /**
     * Deletes the repository link identified by the object_id. The caller must authenticate as a user with administrative access to the repository.
     * API call: DELETE https://bitbucket.org/api/1.0/repositories/{accountname}/{repo_slug}/links/{object_id}
     *
     * @param accountName The team or individual account owning the repository.
     * @param repoSlug The repository identifier.
     * @param linkId The component identifier.
     */
    void removeLink(String accountName, String repoSlug, Long linkId);
}