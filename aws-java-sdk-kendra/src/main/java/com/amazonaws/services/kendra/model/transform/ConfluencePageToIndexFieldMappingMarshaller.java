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
package com.amazonaws.services.kendra.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfluencePageToIndexFieldMappingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfluencePageToIndexFieldMappingMarshaller {

    private static final MarshallingInfo<String> DATASOURCEFIELDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSourceFieldName").build();
    private static final MarshallingInfo<String> DATEFIELDFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateFieldFormat").build();
    private static final MarshallingInfo<String> INDEXFIELDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IndexFieldName").build();

    private static final ConfluencePageToIndexFieldMappingMarshaller instance = new ConfluencePageToIndexFieldMappingMarshaller();

    public static ConfluencePageToIndexFieldMappingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfluencePageToIndexFieldMapping confluencePageToIndexFieldMapping, ProtocolMarshaller protocolMarshaller) {

        if (confluencePageToIndexFieldMapping == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(confluencePageToIndexFieldMapping.getDataSourceFieldName(), DATASOURCEFIELDNAME_BINDING);
            protocolMarshaller.marshall(confluencePageToIndexFieldMapping.getDateFieldFormat(), DATEFIELDFORMAT_BINDING);
            protocolMarshaller.marshall(confluencePageToIndexFieldMapping.getIndexFieldName(), INDEXFIELDNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
