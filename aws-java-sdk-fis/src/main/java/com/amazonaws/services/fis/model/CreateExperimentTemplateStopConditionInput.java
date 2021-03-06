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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a stop condition for an experiment template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/CreateExperimentTemplateStopConditionInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExperimentTemplateStopConditionInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source for the stop condition. Specify <code>aws:cloudwatch:alarm</code> if the stop condition is defined by
     * a CloudWatch alarm. Specify <code>none</code> if there is no stop condition.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch alarm. This is required if the source is a CloudWatch alarm.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The source for the stop condition. Specify <code>aws:cloudwatch:alarm</code> if the stop condition is defined by
     * a CloudWatch alarm. Specify <code>none</code> if there is no stop condition.
     * </p>
     * 
     * @param source
     *        The source for the stop condition. Specify <code>aws:cloudwatch:alarm</code> if the stop condition is
     *        defined by a CloudWatch alarm. Specify <code>none</code> if there is no stop condition.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source for the stop condition. Specify <code>aws:cloudwatch:alarm</code> if the stop condition is defined by
     * a CloudWatch alarm. Specify <code>none</code> if there is no stop condition.
     * </p>
     * 
     * @return The source for the stop condition. Specify <code>aws:cloudwatch:alarm</code> if the stop condition is
     *         defined by a CloudWatch alarm. Specify <code>none</code> if there is no stop condition.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source for the stop condition. Specify <code>aws:cloudwatch:alarm</code> if the stop condition is defined by
     * a CloudWatch alarm. Specify <code>none</code> if there is no stop condition.
     * </p>
     * 
     * @param source
     *        The source for the stop condition. Specify <code>aws:cloudwatch:alarm</code> if the stop condition is
     *        defined by a CloudWatch alarm. Specify <code>none</code> if there is no stop condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateStopConditionInput withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch alarm. This is required if the source is a CloudWatch alarm.
     * </p>
     * 
     * @param value
     *        The Amazon Resource Name (ARN) of the CloudWatch alarm. This is required if the source is a CloudWatch
     *        alarm.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch alarm. This is required if the source is a CloudWatch alarm.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the CloudWatch alarm. This is required if the source is a CloudWatch
     *         alarm.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch alarm. This is required if the source is a CloudWatch alarm.
     * </p>
     * 
     * @param value
     *        The Amazon Resource Name (ARN) of the CloudWatch alarm. This is required if the source is a CloudWatch
     *        alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateStopConditionInput withValue(String value) {
        setValue(value);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExperimentTemplateStopConditionInput == false)
            return false;
        CreateExperimentTemplateStopConditionInput other = (CreateExperimentTemplateStopConditionInput) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public CreateExperimentTemplateStopConditionInput clone() {
        try {
            return (CreateExperimentTemplateStopConditionInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.CreateExperimentTemplateStopConditionInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
