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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The environment template version data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/EnvironmentTemplateVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentTemplateVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the version of an environment template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time when the version of an environment template was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * A description of the minor version of an environment template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time when the version of an environment template was last modified.
     * </p>
     */
    private java.util.Date lastModifiedAt;
    /**
     * <p>
     * The ID of the latest major version that's associated with the version of an environment template.
     * </p>
     */
    private String majorVersion;
    /**
     * <p>
     * The ID of the minor version of an environment template.
     * </p>
     */
    private String minorVersion;
    /**
     * <p>
     * The ID of the recommended minor version of the environment template.
     * </p>
     */
    private String recommendedMinorVersion;
    /**
     * <p>
     * The schema of the version of an environment template.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * The status of the version of an environment template.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message of the version of an environment template.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The name of the version of an environment template.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the version of an environment template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the version of an environment template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the version of an environment template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the version of an environment template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the version of an environment template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the version of an environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplateVersion withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time when the version of an environment template was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the version of an environment template was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the version of an environment template was created.
     * </p>
     * 
     * @return The time when the version of an environment template was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the version of an environment template was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the version of an environment template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplateVersion withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * A description of the minor version of an environment template.
     * </p>
     * 
     * @param description
     *        A description of the minor version of an environment template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the minor version of an environment template.
     * </p>
     * 
     * @return A description of the minor version of an environment template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the minor version of an environment template.
     * </p>
     * 
     * @param description
     *        A description of the minor version of an environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplateVersion withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time when the version of an environment template was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The time when the version of an environment template was last modified.
     */

    public void setLastModifiedAt(java.util.Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * <p>
     * The time when the version of an environment template was last modified.
     * </p>
     * 
     * @return The time when the version of an environment template was last modified.
     */

    public java.util.Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * <p>
     * The time when the version of an environment template was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The time when the version of an environment template was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplateVersion withLastModifiedAt(java.util.Date lastModifiedAt) {
        setLastModifiedAt(lastModifiedAt);
        return this;
    }

    /**
     * <p>
     * The ID of the latest major version that's associated with the version of an environment template.
     * </p>
     * 
     * @param majorVersion
     *        The ID of the latest major version that's associated with the version of an environment template.
     */

    public void setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
    }

    /**
     * <p>
     * The ID of the latest major version that's associated with the version of an environment template.
     * </p>
     * 
     * @return The ID of the latest major version that's associated with the version of an environment template.
     */

    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * <p>
     * The ID of the latest major version that's associated with the version of an environment template.
     * </p>
     * 
     * @param majorVersion
     *        The ID of the latest major version that's associated with the version of an environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplateVersion withMajorVersion(String majorVersion) {
        setMajorVersion(majorVersion);
        return this;
    }

    /**
     * <p>
     * The ID of the minor version of an environment template.
     * </p>
     * 
     * @param minorVersion
     *        The ID of the minor version of an environment template.
     */

    public void setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
    }

    /**
     * <p>
     * The ID of the minor version of an environment template.
     * </p>
     * 
     * @return The ID of the minor version of an environment template.
     */

    public String getMinorVersion() {
        return this.minorVersion;
    }

    /**
     * <p>
     * The ID of the minor version of an environment template.
     * </p>
     * 
     * @param minorVersion
     *        The ID of the minor version of an environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplateVersion withMinorVersion(String minorVersion) {
        setMinorVersion(minorVersion);
        return this;
    }

    /**
     * <p>
     * The ID of the recommended minor version of the environment template.
     * </p>
     * 
     * @param recommendedMinorVersion
     *        The ID of the recommended minor version of the environment template.
     */

    public void setRecommendedMinorVersion(String recommendedMinorVersion) {
        this.recommendedMinorVersion = recommendedMinorVersion;
    }

    /**
     * <p>
     * The ID of the recommended minor version of the environment template.
     * </p>
     * 
     * @return The ID of the recommended minor version of the environment template.
     */

    public String getRecommendedMinorVersion() {
        return this.recommendedMinorVersion;
    }

    /**
     * <p>
     * The ID of the recommended minor version of the environment template.
     * </p>
     * 
     * @param recommendedMinorVersion
     *        The ID of the recommended minor version of the environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplateVersion withRecommendedMinorVersion(String recommendedMinorVersion) {
        setRecommendedMinorVersion(recommendedMinorVersion);
        return this;
    }

    /**
     * <p>
     * The schema of the version of an environment template.
     * </p>
     * 
     * @param schema
     *        The schema of the version of an environment template.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema of the version of an environment template.
     * </p>
     * 
     * @return The schema of the version of an environment template.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The schema of the version of an environment template.
     * </p>
     * 
     * @param schema
     *        The schema of the version of an environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplateVersion withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The status of the version of an environment template.
     * </p>
     * 
     * @param status
     *        The status of the version of an environment template.
     * @see TemplateVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the version of an environment template.
     * </p>
     * 
     * @return The status of the version of an environment template.
     * @see TemplateVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the version of an environment template.
     * </p>
     * 
     * @param status
     *        The status of the version of an environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateVersionStatus
     */

    public EnvironmentTemplateVersion withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the version of an environment template.
     * </p>
     * 
     * @param status
     *        The status of the version of an environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateVersionStatus
     */

    public EnvironmentTemplateVersion withStatus(TemplateVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message of the version of an environment template.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the version of an environment template.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message of the version of an environment template.
     * </p>
     * 
     * @return The status message of the version of an environment template.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message of the version of an environment template.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the version of an environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplateVersion withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The name of the version of an environment template.
     * </p>
     * 
     * @param templateName
     *        The name of the version of an environment template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the version of an environment template.
     * </p>
     * 
     * @return The name of the version of an environment template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the version of an environment template.
     * </p>
     * 
     * @param templateName
     *        The name of the version of an environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplateVersion withTemplateName(String templateName) {
        setTemplateName(templateName);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getLastModifiedAt() != null)
            sb.append("LastModifiedAt: ").append(getLastModifiedAt()).append(",");
        if (getMajorVersion() != null)
            sb.append("MajorVersion: ").append(getMajorVersion()).append(",");
        if (getMinorVersion() != null)
            sb.append("MinorVersion: ").append(getMinorVersion()).append(",");
        if (getRecommendedMinorVersion() != null)
            sb.append("RecommendedMinorVersion: ").append(getRecommendedMinorVersion()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append("***Sensitive Data Redacted***").append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentTemplateVersion == false)
            return false;
        EnvironmentTemplateVersion other = (EnvironmentTemplateVersion) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastModifiedAt() == null ^ this.getLastModifiedAt() == null)
            return false;
        if (other.getLastModifiedAt() != null && other.getLastModifiedAt().equals(this.getLastModifiedAt()) == false)
            return false;
        if (other.getMajorVersion() == null ^ this.getMajorVersion() == null)
            return false;
        if (other.getMajorVersion() != null && other.getMajorVersion().equals(this.getMajorVersion()) == false)
            return false;
        if (other.getMinorVersion() == null ^ this.getMinorVersion() == null)
            return false;
        if (other.getMinorVersion() != null && other.getMinorVersion().equals(this.getMinorVersion()) == false)
            return false;
        if (other.getRecommendedMinorVersion() == null ^ this.getRecommendedMinorVersion() == null)
            return false;
        if (other.getRecommendedMinorVersion() != null && other.getRecommendedMinorVersion().equals(this.getRecommendedMinorVersion()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAt() == null) ? 0 : getLastModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getMajorVersion() == null) ? 0 : getMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getMinorVersion() == null) ? 0 : getMinorVersion().hashCode());
        hashCode = prime * hashCode + ((getRecommendedMinorVersion() == null) ? 0 : getRecommendedMinorVersion().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentTemplateVersion clone() {
        try {
            return (EnvironmentTemplateVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.EnvironmentTemplateVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
