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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A hostname and IP address mapping to append to the <b>/etc/hosts</b> file on the container.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The hostname to use in the <b>/etc/hosts</b> entry.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * The IP address to use in the <b>/etc/hosts</b> entry.
     * </p>
     */
    private String ipAddress;

    /**
     * <p>
     * The hostname to use in the <b>/etc/hosts</b> entry.
     * </p>
     * 
     * @param hostname
     *        The hostname to use in the <b>/etc/hosts</b> entry.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The hostname to use in the <b>/etc/hosts</b> entry.
     * </p>
     * 
     * @return The hostname to use in the <b>/etc/hosts</b> entry.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The hostname to use in the <b>/etc/hosts</b> entry.
     * </p>
     * 
     * @param hostname
     *        The hostname to use in the <b>/etc/hosts</b> entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The IP address to use in the <b>/etc/hosts</b> entry.
     * </p>
     * 
     * @param ipAddress
     *        The IP address to use in the <b>/etc/hosts</b> entry.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address to use in the <b>/etc/hosts</b> entry.
     * </p>
     * 
     * @return The IP address to use in the <b>/etc/hosts</b> entry.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address to use in the <b>/etc/hosts</b> entry.
     * </p>
     * 
     * @param ipAddress
     *        The IP address to use in the <b>/etc/hosts</b> entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
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
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails == false)
            return false;
        AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails other = (AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails) obj;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails clone() {
        try {
            return (AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
