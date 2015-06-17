/**
 * Copyright (C) 2012 Eric Bottard / Guillaume Lederrey (eric.bottard+ghpublic@gmail.com / guillaume.lederrey@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.bitbucket.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import org.springframework.social.bitbucket.api.impl.UTCDateDeserializer;

import java.io.Serializable;
import java.util.Date;

/**
 * BitBucket invitation data
 *
 * @author Cyprian Śniegota
 * @since 2.0.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BitBucketInvitation implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("sent_on")
    @JsonDeserialize(using = UTCDateDeserializer.class)
    private Date sentOn;

    @JsonProperty
    @Getter
    private BitBucketPrivilege permission;

    @JsonProperty("invited_by")
    @Getter
    private BitBucketUser invitedBy;

    @JsonProperty
    @Getter
    private BitBucketRepository repository;

    @JsonProperty
    @Getter
    private String email;

    public final Date getSentOn() {
        if (sentOn == null) {
            return null;
        }
        return (Date) sentOn.clone();
    }

}