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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * MediaLive will perform a failover if content is not detected in this input for the specified period.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputLossFailoverSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputLossFailoverSettings implements Serializable, Cloneable, StructuredPojo {

    /** The amount of time (in milliseconds) that no input is detected. After that time, an input failover will occur. */
    private Integer inputLossThresholdMsec;

    /**
     * The amount of time (in milliseconds) that no input is detected. After that time, an input failover will occur.
     * 
     * @param inputLossThresholdMsec
     *        The amount of time (in milliseconds) that no input is detected. After that time, an input failover will
     *        occur.
     */

    public void setInputLossThresholdMsec(Integer inputLossThresholdMsec) {
        this.inputLossThresholdMsec = inputLossThresholdMsec;
    }

    /**
     * The amount of time (in milliseconds) that no input is detected. After that time, an input failover will occur.
     * 
     * @return The amount of time (in milliseconds) that no input is detected. After that time, an input failover will
     *         occur.
     */

    public Integer getInputLossThresholdMsec() {
        return this.inputLossThresholdMsec;
    }

    /**
     * The amount of time (in milliseconds) that no input is detected. After that time, an input failover will occur.
     * 
     * @param inputLossThresholdMsec
     *        The amount of time (in milliseconds) that no input is detected. After that time, an input failover will
     *        occur.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputLossFailoverSettings withInputLossThresholdMsec(Integer inputLossThresholdMsec) {
        setInputLossThresholdMsec(inputLossThresholdMsec);
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
        if (getInputLossThresholdMsec() != null)
            sb.append("InputLossThresholdMsec: ").append(getInputLossThresholdMsec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputLossFailoverSettings == false)
            return false;
        InputLossFailoverSettings other = (InputLossFailoverSettings) obj;
        if (other.getInputLossThresholdMsec() == null ^ this.getInputLossThresholdMsec() == null)
            return false;
        if (other.getInputLossThresholdMsec() != null && other.getInputLossThresholdMsec().equals(this.getInputLossThresholdMsec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputLossThresholdMsec() == null) ? 0 : getInputLossThresholdMsec().hashCode());
        return hashCode;
    }

    @Override
    public InputLossFailoverSettings clone() {
        try {
            return (InputLossFailoverSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputLossFailoverSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
