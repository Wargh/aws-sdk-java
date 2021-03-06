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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for a render farm that is associated with a studio resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ComputeFarmConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeFarmConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an Active Directory user that is used on ComputeFarm worker instances.
     * </p>
     */
    private String activeDirectoryUser;
    /**
     * <p>
     * The endpoint of the ComputeFarm that is accessed by the studio component resource.
     * </p>
     */
    private String endpoint;

    /**
     * <p>
     * The name of an Active Directory user that is used on ComputeFarm worker instances.
     * </p>
     * 
     * @param activeDirectoryUser
     *        The name of an Active Directory user that is used on ComputeFarm worker instances.
     */

    public void setActiveDirectoryUser(String activeDirectoryUser) {
        this.activeDirectoryUser = activeDirectoryUser;
    }

    /**
     * <p>
     * The name of an Active Directory user that is used on ComputeFarm worker instances.
     * </p>
     * 
     * @return The name of an Active Directory user that is used on ComputeFarm worker instances.
     */

    public String getActiveDirectoryUser() {
        return this.activeDirectoryUser;
    }

    /**
     * <p>
     * The name of an Active Directory user that is used on ComputeFarm worker instances.
     * </p>
     * 
     * @param activeDirectoryUser
     *        The name of an Active Directory user that is used on ComputeFarm worker instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeFarmConfiguration withActiveDirectoryUser(String activeDirectoryUser) {
        setActiveDirectoryUser(activeDirectoryUser);
        return this;
    }

    /**
     * <p>
     * The endpoint of the ComputeFarm that is accessed by the studio component resource.
     * </p>
     * 
     * @param endpoint
     *        The endpoint of the ComputeFarm that is accessed by the studio component resource.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint of the ComputeFarm that is accessed by the studio component resource.
     * </p>
     * 
     * @return The endpoint of the ComputeFarm that is accessed by the studio component resource.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint of the ComputeFarm that is accessed by the studio component resource.
     * </p>
     * 
     * @param endpoint
     *        The endpoint of the ComputeFarm that is accessed by the studio component resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeFarmConfiguration withEndpoint(String endpoint) {
        setEndpoint(endpoint);
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
        if (getActiveDirectoryUser() != null)
            sb.append("ActiveDirectoryUser: ").append(getActiveDirectoryUser()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeFarmConfiguration == false)
            return false;
        ComputeFarmConfiguration other = (ComputeFarmConfiguration) obj;
        if (other.getActiveDirectoryUser() == null ^ this.getActiveDirectoryUser() == null)
            return false;
        if (other.getActiveDirectoryUser() != null && other.getActiveDirectoryUser().equals(this.getActiveDirectoryUser()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveDirectoryUser() == null) ? 0 : getActiveDirectoryUser().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public ComputeFarmConfiguration clone() {
        try {
            return (ComputeFarmConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.ComputeFarmConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
