/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeUserProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain ID.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The user profile name. This value is not case sensitive.
     * </p>
     */
    private String userProfileName;

    /**
     * <p>
     * The domain ID.
     * </p>
     * 
     * @param domainId
     *        The domain ID.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * 
     * @return The domain ID.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * 
     * @param domainId
     *        The domain ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserProfileRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The user profile name. This value is not case sensitive.
     * </p>
     * 
     * @param userProfileName
     *        The user profile name. This value is not case sensitive.
     */

    public void setUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
    }

    /**
     * <p>
     * The user profile name. This value is not case sensitive.
     * </p>
     * 
     * @return The user profile name. This value is not case sensitive.
     */

    public String getUserProfileName() {
        return this.userProfileName;
    }

    /**
     * <p>
     * The user profile name. This value is not case sensitive.
     * </p>
     * 
     * @param userProfileName
     *        The user profile name. This value is not case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserProfileRequest withUserProfileName(String userProfileName) {
        setUserProfileName(userProfileName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getUserProfileName() != null)
            sb.append("UserProfileName: ").append(getUserProfileName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserProfileRequest == false)
            return false;
        DescribeUserProfileRequest other = (DescribeUserProfileRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getUserProfileName() == null ^ this.getUserProfileName() == null)
            return false;
        if (other.getUserProfileName() != null && other.getUserProfileName().equals(this.getUserProfileName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getUserProfileName() == null) ? 0 : getUserProfileName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUserProfileRequest clone() {
        return (DescribeUserProfileRequest) super.clone();
    }

}
