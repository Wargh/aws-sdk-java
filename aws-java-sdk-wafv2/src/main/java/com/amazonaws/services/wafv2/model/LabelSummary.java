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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List of labels used by one or more of the rules of a <a>RuleGroup</a>. This summary object is used for the following
 * rule group lists:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>AvailableLabels</code> - Labels that rules add to matching requests. These labels are defined in the
 * <code>RuleLabels</code> for a <a>Rule</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ConsumedLabels</code> - Labels that rules match against. These labels are defined in a
 * <code>LabelMatchStatement</code> specification, in the <a>Statement</a> definition of a rule.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/LabelSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An individual label specification.
     * </p>
     */
    private String name;

    /**
     * <p>
     * An individual label specification.
     * </p>
     * 
     * @param name
     *        An individual label specification.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * An individual label specification.
     * </p>
     * 
     * @return An individual label specification.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * An individual label specification.
     * </p>
     * 
     * @param name
     *        An individual label specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelSummary withName(String name) {
        setName(name);
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
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelSummary == false)
            return false;
        LabelSummary other = (LabelSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public LabelSummary clone() {
        try {
            return (LabelSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.LabelSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
