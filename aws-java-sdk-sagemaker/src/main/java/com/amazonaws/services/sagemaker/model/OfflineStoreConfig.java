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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of an <code>OfflineStore</code>.
 * </p>
 * <p>
 * Provide an <code>OfflineStoreConfig</code> in a request to <code>CreateFeatureGroup</code> to create an
 * <code>OfflineStore</code>.
 * </p>
 * <p>
 * To encrypt an <code>OfflineStore</code> using at rest data encryption, specify Amazon Web Services Key Management
 * Service (KMS) key ID, or <code>KMSKeyId</code>, in <code>S3StorageConfig</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/OfflineStoreConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OfflineStoreConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Simple Storage (Amazon S3) location of <code>OfflineStore</code>.
     * </p>
     */
    private S3StorageConfig s3StorageConfig;
    /**
     * <p>
     * Set to <code>True</code> to disable the automatic creation of an Amazon Web Services Glue table when configuring
     * an <code>OfflineStore</code>.
     * </p>
     */
    private Boolean disableGlueTableCreation;
    /**
     * <p>
     * The meta data of the Glue table that is autogenerated when an <code>OfflineStore</code> is created.
     * </p>
     */
    private DataCatalogConfig dataCatalogConfig;

    /**
     * <p>
     * The Amazon Simple Storage (Amazon S3) location of <code>OfflineStore</code>.
     * </p>
     * 
     * @param s3StorageConfig
     *        The Amazon Simple Storage (Amazon S3) location of <code>OfflineStore</code>.
     */

    public void setS3StorageConfig(S3StorageConfig s3StorageConfig) {
        this.s3StorageConfig = s3StorageConfig;
    }

    /**
     * <p>
     * The Amazon Simple Storage (Amazon S3) location of <code>OfflineStore</code>.
     * </p>
     * 
     * @return The Amazon Simple Storage (Amazon S3) location of <code>OfflineStore</code>.
     */

    public S3StorageConfig getS3StorageConfig() {
        return this.s3StorageConfig;
    }

    /**
     * <p>
     * The Amazon Simple Storage (Amazon S3) location of <code>OfflineStore</code>.
     * </p>
     * 
     * @param s3StorageConfig
     *        The Amazon Simple Storage (Amazon S3) location of <code>OfflineStore</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfflineStoreConfig withS3StorageConfig(S3StorageConfig s3StorageConfig) {
        setS3StorageConfig(s3StorageConfig);
        return this;
    }

    /**
     * <p>
     * Set to <code>True</code> to disable the automatic creation of an Amazon Web Services Glue table when configuring
     * an <code>OfflineStore</code>.
     * </p>
     * 
     * @param disableGlueTableCreation
     *        Set to <code>True</code> to disable the automatic creation of an Amazon Web Services Glue table when
     *        configuring an <code>OfflineStore</code>.
     */

    public void setDisableGlueTableCreation(Boolean disableGlueTableCreation) {
        this.disableGlueTableCreation = disableGlueTableCreation;
    }

    /**
     * <p>
     * Set to <code>True</code> to disable the automatic creation of an Amazon Web Services Glue table when configuring
     * an <code>OfflineStore</code>.
     * </p>
     * 
     * @return Set to <code>True</code> to disable the automatic creation of an Amazon Web Services Glue table when
     *         configuring an <code>OfflineStore</code>.
     */

    public Boolean getDisableGlueTableCreation() {
        return this.disableGlueTableCreation;
    }

    /**
     * <p>
     * Set to <code>True</code> to disable the automatic creation of an Amazon Web Services Glue table when configuring
     * an <code>OfflineStore</code>.
     * </p>
     * 
     * @param disableGlueTableCreation
     *        Set to <code>True</code> to disable the automatic creation of an Amazon Web Services Glue table when
     *        configuring an <code>OfflineStore</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfflineStoreConfig withDisableGlueTableCreation(Boolean disableGlueTableCreation) {
        setDisableGlueTableCreation(disableGlueTableCreation);
        return this;
    }

    /**
     * <p>
     * Set to <code>True</code> to disable the automatic creation of an Amazon Web Services Glue table when configuring
     * an <code>OfflineStore</code>.
     * </p>
     * 
     * @return Set to <code>True</code> to disable the automatic creation of an Amazon Web Services Glue table when
     *         configuring an <code>OfflineStore</code>.
     */

    public Boolean isDisableGlueTableCreation() {
        return this.disableGlueTableCreation;
    }

    /**
     * <p>
     * The meta data of the Glue table that is autogenerated when an <code>OfflineStore</code> is created.
     * </p>
     * 
     * @param dataCatalogConfig
     *        The meta data of the Glue table that is autogenerated when an <code>OfflineStore</code> is created.
     */

    public void setDataCatalogConfig(DataCatalogConfig dataCatalogConfig) {
        this.dataCatalogConfig = dataCatalogConfig;
    }

    /**
     * <p>
     * The meta data of the Glue table that is autogenerated when an <code>OfflineStore</code> is created.
     * </p>
     * 
     * @return The meta data of the Glue table that is autogenerated when an <code>OfflineStore</code> is created.
     */

    public DataCatalogConfig getDataCatalogConfig() {
        return this.dataCatalogConfig;
    }

    /**
     * <p>
     * The meta data of the Glue table that is autogenerated when an <code>OfflineStore</code> is created.
     * </p>
     * 
     * @param dataCatalogConfig
     *        The meta data of the Glue table that is autogenerated when an <code>OfflineStore</code> is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfflineStoreConfig withDataCatalogConfig(DataCatalogConfig dataCatalogConfig) {
        setDataCatalogConfig(dataCatalogConfig);
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
        if (getS3StorageConfig() != null)
            sb.append("S3StorageConfig: ").append(getS3StorageConfig()).append(",");
        if (getDisableGlueTableCreation() != null)
            sb.append("DisableGlueTableCreation: ").append(getDisableGlueTableCreation()).append(",");
        if (getDataCatalogConfig() != null)
            sb.append("DataCatalogConfig: ").append(getDataCatalogConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OfflineStoreConfig == false)
            return false;
        OfflineStoreConfig other = (OfflineStoreConfig) obj;
        if (other.getS3StorageConfig() == null ^ this.getS3StorageConfig() == null)
            return false;
        if (other.getS3StorageConfig() != null && other.getS3StorageConfig().equals(this.getS3StorageConfig()) == false)
            return false;
        if (other.getDisableGlueTableCreation() == null ^ this.getDisableGlueTableCreation() == null)
            return false;
        if (other.getDisableGlueTableCreation() != null && other.getDisableGlueTableCreation().equals(this.getDisableGlueTableCreation()) == false)
            return false;
        if (other.getDataCatalogConfig() == null ^ this.getDataCatalogConfig() == null)
            return false;
        if (other.getDataCatalogConfig() != null && other.getDataCatalogConfig().equals(this.getDataCatalogConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3StorageConfig() == null) ? 0 : getS3StorageConfig().hashCode());
        hashCode = prime * hashCode + ((getDisableGlueTableCreation() == null) ? 0 : getDisableGlueTableCreation().hashCode());
        hashCode = prime * hashCode + ((getDataCatalogConfig() == null) ? 0 : getDataCatalogConfig().hashCode());
        return hashCode;
    }

    @Override
    public OfflineStoreConfig clone() {
        try {
            return (OfflineStoreConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.OfflineStoreConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
