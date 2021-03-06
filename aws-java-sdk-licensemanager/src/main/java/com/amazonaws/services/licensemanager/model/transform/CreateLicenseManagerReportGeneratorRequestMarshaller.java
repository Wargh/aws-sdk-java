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
package com.amazonaws.services.licensemanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.licensemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateLicenseManagerReportGeneratorRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLicenseManagerReportGeneratorRequestMarshaller {

    private static final MarshallingInfo<String> REPORTGENERATORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportGeneratorName").build();
    private static final MarshallingInfo<List> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<StructuredPojo> REPORTCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportContext").build();
    private static final MarshallingInfo<StructuredPojo> REPORTFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportFrequency").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final CreateLicenseManagerReportGeneratorRequestMarshaller instance = new CreateLicenseManagerReportGeneratorRequestMarshaller();

    public static CreateLicenseManagerReportGeneratorRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLicenseManagerReportGeneratorRequest createLicenseManagerReportGeneratorRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLicenseManagerReportGeneratorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLicenseManagerReportGeneratorRequest.getReportGeneratorName(), REPORTGENERATORNAME_BINDING);
            protocolMarshaller.marshall(createLicenseManagerReportGeneratorRequest.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(createLicenseManagerReportGeneratorRequest.getReportContext(), REPORTCONTEXT_BINDING);
            protocolMarshaller.marshall(createLicenseManagerReportGeneratorRequest.getReportFrequency(), REPORTFREQUENCY_BINDING);
            protocolMarshaller.marshall(createLicenseManagerReportGeneratorRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createLicenseManagerReportGeneratorRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createLicenseManagerReportGeneratorRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
