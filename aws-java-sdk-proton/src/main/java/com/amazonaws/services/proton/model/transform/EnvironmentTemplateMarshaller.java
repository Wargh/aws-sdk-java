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
package com.amazonaws.services.proton.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.proton.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EnvironmentTemplateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EnvironmentTemplateMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();
    private static final MarshallingInfo<String> ENCRYPTIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionKey").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PROVISIONING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("provisioning").build();
    private static final MarshallingInfo<String> RECOMMENDEDVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendedVersion").build();

    private static final EnvironmentTemplateMarshaller instance = new EnvironmentTemplateMarshaller();

    public static EnvironmentTemplateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EnvironmentTemplate environmentTemplate, ProtocolMarshaller protocolMarshaller) {

        if (environmentTemplate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(environmentTemplate.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(environmentTemplate.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(environmentTemplate.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(environmentTemplate.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(environmentTemplate.getEncryptionKey(), ENCRYPTIONKEY_BINDING);
            protocolMarshaller.marshall(environmentTemplate.getLastModifiedAt(), LASTMODIFIEDAT_BINDING);
            protocolMarshaller.marshall(environmentTemplate.getName(), NAME_BINDING);
            protocolMarshaller.marshall(environmentTemplate.getProvisioning(), PROVISIONING_BINDING);
            protocolMarshaller.marshall(environmentTemplate.getRecommendedVersion(), RECOMMENDEDVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
