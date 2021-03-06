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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a property- or tag-based filter condition for including or excluding Amazon Web Services resources from the
 * query results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SearchResourcesCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchResourcesCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A property-based condition that defines a property, operator, and one or more values for including or excluding
     * resources from the results.
     * </p>
     */
    private SearchResourcesSimpleCriterion simpleCriterion;
    /**
     * <p>
     * A tag-based condition that defines an operator and tag keys, tag values, or tag key and value pairs for including
     * or excluding resources from the results.
     * </p>
     */
    private SearchResourcesTagCriterion tagCriterion;

    /**
     * <p>
     * A property-based condition that defines a property, operator, and one or more values for including or excluding
     * resources from the results.
     * </p>
     * 
     * @param simpleCriterion
     *        A property-based condition that defines a property, operator, and one or more values for including or
     *        excluding resources from the results.
     */

    public void setSimpleCriterion(SearchResourcesSimpleCriterion simpleCriterion) {
        this.simpleCriterion = simpleCriterion;
    }

    /**
     * <p>
     * A property-based condition that defines a property, operator, and one or more values for including or excluding
     * resources from the results.
     * </p>
     * 
     * @return A property-based condition that defines a property, operator, and one or more values for including or
     *         excluding resources from the results.
     */

    public SearchResourcesSimpleCriterion getSimpleCriterion() {
        return this.simpleCriterion;
    }

    /**
     * <p>
     * A property-based condition that defines a property, operator, and one or more values for including or excluding
     * resources from the results.
     * </p>
     * 
     * @param simpleCriterion
     *        A property-based condition that defines a property, operator, and one or more values for including or
     *        excluding resources from the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesCriteria withSimpleCriterion(SearchResourcesSimpleCriterion simpleCriterion) {
        setSimpleCriterion(simpleCriterion);
        return this;
    }

    /**
     * <p>
     * A tag-based condition that defines an operator and tag keys, tag values, or tag key and value pairs for including
     * or excluding resources from the results.
     * </p>
     * 
     * @param tagCriterion
     *        A tag-based condition that defines an operator and tag keys, tag values, or tag key and value pairs for
     *        including or excluding resources from the results.
     */

    public void setTagCriterion(SearchResourcesTagCriterion tagCriterion) {
        this.tagCriterion = tagCriterion;
    }

    /**
     * <p>
     * A tag-based condition that defines an operator and tag keys, tag values, or tag key and value pairs for including
     * or excluding resources from the results.
     * </p>
     * 
     * @return A tag-based condition that defines an operator and tag keys, tag values, or tag key and value pairs for
     *         including or excluding resources from the results.
     */

    public SearchResourcesTagCriterion getTagCriterion() {
        return this.tagCriterion;
    }

    /**
     * <p>
     * A tag-based condition that defines an operator and tag keys, tag values, or tag key and value pairs for including
     * or excluding resources from the results.
     * </p>
     * 
     * @param tagCriterion
     *        A tag-based condition that defines an operator and tag keys, tag values, or tag key and value pairs for
     *        including or excluding resources from the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchResourcesCriteria withTagCriterion(SearchResourcesTagCriterion tagCriterion) {
        setTagCriterion(tagCriterion);
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
        if (getSimpleCriterion() != null)
            sb.append("SimpleCriterion: ").append(getSimpleCriterion()).append(",");
        if (getTagCriterion() != null)
            sb.append("TagCriterion: ").append(getTagCriterion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchResourcesCriteria == false)
            return false;
        SearchResourcesCriteria other = (SearchResourcesCriteria) obj;
        if (other.getSimpleCriterion() == null ^ this.getSimpleCriterion() == null)
            return false;
        if (other.getSimpleCriterion() != null && other.getSimpleCriterion().equals(this.getSimpleCriterion()) == false)
            return false;
        if (other.getTagCriterion() == null ^ this.getTagCriterion() == null)
            return false;
        if (other.getTagCriterion() != null && other.getTagCriterion().equals(this.getTagCriterion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimpleCriterion() == null) ? 0 : getSimpleCriterion().hashCode());
        hashCode = prime * hashCode + ((getTagCriterion() == null) ? 0 : getTagCriterion().hashCode());
        return hashCode;
    }

    @Override
    public SearchResourcesCriteria clone() {
        try {
            return (SearchResourcesCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SearchResourcesCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
