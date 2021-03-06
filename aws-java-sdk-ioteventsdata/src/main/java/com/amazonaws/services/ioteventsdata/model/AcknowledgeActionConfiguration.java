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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the configuration information of an acknowledge action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/AcknowledgeActionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcknowledgeActionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The note that you can leave when you acknowledge the alarm.
     * </p>
     */
    private String note;

    /**
     * <p>
     * The note that you can leave when you acknowledge the alarm.
     * </p>
     * 
     * @param note
     *        The note that you can leave when you acknowledge the alarm.
     */

    public void setNote(String note) {
        this.note = note;
    }

    /**
     * <p>
     * The note that you can leave when you acknowledge the alarm.
     * </p>
     * 
     * @return The note that you can leave when you acknowledge the alarm.
     */

    public String getNote() {
        return this.note;
    }

    /**
     * <p>
     * The note that you can leave when you acknowledge the alarm.
     * </p>
     * 
     * @param note
     *        The note that you can leave when you acknowledge the alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcknowledgeActionConfiguration withNote(String note) {
        setNote(note);
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
        if (getNote() != null)
            sb.append("Note: ").append(getNote());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcknowledgeActionConfiguration == false)
            return false;
        AcknowledgeActionConfiguration other = (AcknowledgeActionConfiguration) obj;
        if (other.getNote() == null ^ this.getNote() == null)
            return false;
        if (other.getNote() != null && other.getNote().equals(this.getNote()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNote() == null) ? 0 : getNote().hashCode());
        return hashCode;
    }

    @Override
    public AcknowledgeActionConfiguration clone() {
        try {
            return (AcknowledgeActionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.AcknowledgeActionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
