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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListEulaAcceptances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEulaAcceptancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A collection of EULA acceptances.
     * </p>
     */
    private java.util.List<EulaAcceptance> eulaAcceptances;
    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A collection of EULA acceptances.
     * </p>
     * 
     * @return A collection of EULA acceptances.
     */

    public java.util.List<EulaAcceptance> getEulaAcceptances() {
        return eulaAcceptances;
    }

    /**
     * <p>
     * A collection of EULA acceptances.
     * </p>
     * 
     * @param eulaAcceptances
     *        A collection of EULA acceptances.
     */

    public void setEulaAcceptances(java.util.Collection<EulaAcceptance> eulaAcceptances) {
        if (eulaAcceptances == null) {
            this.eulaAcceptances = null;
            return;
        }

        this.eulaAcceptances = new java.util.ArrayList<EulaAcceptance>(eulaAcceptances);
    }

    /**
     * <p>
     * A collection of EULA acceptances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEulaAcceptances(java.util.Collection)} or {@link #withEulaAcceptances(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eulaAcceptances
     *        A collection of EULA acceptances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEulaAcceptancesResult withEulaAcceptances(EulaAcceptance... eulaAcceptances) {
        if (this.eulaAcceptances == null) {
            setEulaAcceptances(new java.util.ArrayList<EulaAcceptance>(eulaAcceptances.length));
        }
        for (EulaAcceptance ele : eulaAcceptances) {
            this.eulaAcceptances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of EULA acceptances.
     * </p>
     * 
     * @param eulaAcceptances
     *        A collection of EULA acceptances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEulaAcceptancesResult withEulaAcceptances(java.util.Collection<EulaAcceptance> eulaAcceptances) {
        setEulaAcceptances(eulaAcceptances);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEulaAcceptancesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getEulaAcceptances() != null)
            sb.append("EulaAcceptances: ").append(getEulaAcceptances()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEulaAcceptancesResult == false)
            return false;
        ListEulaAcceptancesResult other = (ListEulaAcceptancesResult) obj;
        if (other.getEulaAcceptances() == null ^ this.getEulaAcceptances() == null)
            return false;
        if (other.getEulaAcceptances() != null && other.getEulaAcceptances().equals(this.getEulaAcceptances()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEulaAcceptances() == null) ? 0 : getEulaAcceptances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEulaAcceptancesResult clone() {
        try {
            return (ListEulaAcceptancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
