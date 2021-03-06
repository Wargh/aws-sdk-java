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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about additional route preferences for requests that specify <code>TravelMode</code> as
 * <code>Car</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CalculateRouteCarModeOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CalculateRouteCarModeOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Avoids ferries when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     */
    private Boolean avoidFerries;
    /**
     * <p>
     * Avoids tolls when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     */
    private Boolean avoidTolls;

    /**
     * <p>
     * Avoids ferries when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @param avoidFerries
     *        Avoids ferries when calculating routes.</p>
     *        <p>
     *        Default Value: <code>false</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>false</code> | <code>true</code>
     */

    public void setAvoidFerries(Boolean avoidFerries) {
        this.avoidFerries = avoidFerries;
    }

    /**
     * <p>
     * Avoids ferries when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @return Avoids ferries when calculating routes.</p>
     *         <p>
     *         Default Value: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>false</code> | <code>true</code>
     */

    public Boolean getAvoidFerries() {
        return this.avoidFerries;
    }

    /**
     * <p>
     * Avoids ferries when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @param avoidFerries
     *        Avoids ferries when calculating routes.</p>
     *        <p>
     *        Default Value: <code>false</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>false</code> | <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteCarModeOptions withAvoidFerries(Boolean avoidFerries) {
        setAvoidFerries(avoidFerries);
        return this;
    }

    /**
     * <p>
     * Avoids ferries when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @return Avoids ferries when calculating routes.</p>
     *         <p>
     *         Default Value: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>false</code> | <code>true</code>
     */

    public Boolean isAvoidFerries() {
        return this.avoidFerries;
    }

    /**
     * <p>
     * Avoids tolls when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @param avoidTolls
     *        Avoids tolls when calculating routes.</p>
     *        <p>
     *        Default Value: <code>false</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>false</code> | <code>true</code>
     */

    public void setAvoidTolls(Boolean avoidTolls) {
        this.avoidTolls = avoidTolls;
    }

    /**
     * <p>
     * Avoids tolls when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @return Avoids tolls when calculating routes.</p>
     *         <p>
     *         Default Value: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>false</code> | <code>true</code>
     */

    public Boolean getAvoidTolls() {
        return this.avoidTolls;
    }

    /**
     * <p>
     * Avoids tolls when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @param avoidTolls
     *        Avoids tolls when calculating routes.</p>
     *        <p>
     *        Default Value: <code>false</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>false</code> | <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculateRouteCarModeOptions withAvoidTolls(Boolean avoidTolls) {
        setAvoidTolls(avoidTolls);
        return this;
    }

    /**
     * <p>
     * Avoids tolls when calculating routes.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * 
     * @return Avoids tolls when calculating routes.</p>
     *         <p>
     *         Default Value: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>false</code> | <code>true</code>
     */

    public Boolean isAvoidTolls() {
        return this.avoidTolls;
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
        if (getAvoidFerries() != null)
            sb.append("AvoidFerries: ").append(getAvoidFerries()).append(",");
        if (getAvoidTolls() != null)
            sb.append("AvoidTolls: ").append(getAvoidTolls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculateRouteCarModeOptions == false)
            return false;
        CalculateRouteCarModeOptions other = (CalculateRouteCarModeOptions) obj;
        if (other.getAvoidFerries() == null ^ this.getAvoidFerries() == null)
            return false;
        if (other.getAvoidFerries() != null && other.getAvoidFerries().equals(this.getAvoidFerries()) == false)
            return false;
        if (other.getAvoidTolls() == null ^ this.getAvoidTolls() == null)
            return false;
        if (other.getAvoidTolls() != null && other.getAvoidTolls().equals(this.getAvoidTolls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvoidFerries() == null) ? 0 : getAvoidFerries().hashCode());
        hashCode = prime * hashCode + ((getAvoidTolls() == null) ? 0 : getAvoidTolls().hashCode());
        return hashCode;
    }

    @Override
    public CalculateRouteCarModeOptions clone() {
        try {
            return (CalculateRouteCarModeOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.CalculateRouteCarModeOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
