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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateProgram" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProgramRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ad break configuration settings.
     * </p>
     */
    private java.util.List<AdBreak> adBreaks;
    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The identifier for the program you are working on.
     * </p>
     */
    private String programName;
    /**
     * <p>
     * The schedule configuration settings.
     * </p>
     */
    private ScheduleConfiguration scheduleConfiguration;
    /**
     * <p>
     * The name of the source location.
     * </p>
     */
    private String sourceLocationName;
    /**
     * <p>
     * The name that's used to refer to a VOD source.
     * </p>
     */
    private String vodSourceName;

    /**
     * <p>
     * The ad break configuration settings.
     * </p>
     * 
     * @return The ad break configuration settings.
     */

    public java.util.List<AdBreak> getAdBreaks() {
        return adBreaks;
    }

    /**
     * <p>
     * The ad break configuration settings.
     * </p>
     * 
     * @param adBreaks
     *        The ad break configuration settings.
     */

    public void setAdBreaks(java.util.Collection<AdBreak> adBreaks) {
        if (adBreaks == null) {
            this.adBreaks = null;
            return;
        }

        this.adBreaks = new java.util.ArrayList<AdBreak>(adBreaks);
    }

    /**
     * <p>
     * The ad break configuration settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdBreaks(java.util.Collection)} or {@link #withAdBreaks(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param adBreaks
     *        The ad break configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProgramRequest withAdBreaks(AdBreak... adBreaks) {
        if (this.adBreaks == null) {
            setAdBreaks(new java.util.ArrayList<AdBreak>(adBreaks.length));
        }
        for (AdBreak ele : adBreaks) {
            this.adBreaks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ad break configuration settings.
     * </p>
     * 
     * @param adBreaks
     *        The ad break configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProgramRequest withAdBreaks(java.util.Collection<AdBreak> adBreaks) {
        setAdBreaks(adBreaks);
        return this;
    }

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     * 
     * @param channelName
     *        The identifier for the channel you are working on.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     * 
     * @return The identifier for the channel you are working on.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     * 
     * @param channelName
     *        The identifier for the channel you are working on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProgramRequest withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The identifier for the program you are working on.
     * </p>
     * 
     * @param programName
     *        The identifier for the program you are working on.
     */

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * <p>
     * The identifier for the program you are working on.
     * </p>
     * 
     * @return The identifier for the program you are working on.
     */

    public String getProgramName() {
        return this.programName;
    }

    /**
     * <p>
     * The identifier for the program you are working on.
     * </p>
     * 
     * @param programName
     *        The identifier for the program you are working on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProgramRequest withProgramName(String programName) {
        setProgramName(programName);
        return this;
    }

    /**
     * <p>
     * The schedule configuration settings.
     * </p>
     * 
     * @param scheduleConfiguration
     *        The schedule configuration settings.
     */

    public void setScheduleConfiguration(ScheduleConfiguration scheduleConfiguration) {
        this.scheduleConfiguration = scheduleConfiguration;
    }

    /**
     * <p>
     * The schedule configuration settings.
     * </p>
     * 
     * @return The schedule configuration settings.
     */

    public ScheduleConfiguration getScheduleConfiguration() {
        return this.scheduleConfiguration;
    }

    /**
     * <p>
     * The schedule configuration settings.
     * </p>
     * 
     * @param scheduleConfiguration
     *        The schedule configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProgramRequest withScheduleConfiguration(ScheduleConfiguration scheduleConfiguration) {
        setScheduleConfiguration(scheduleConfiguration);
        return this;
    }

    /**
     * <p>
     * The name of the source location.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location.
     */

    public void setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location.
     * </p>
     * 
     * @return The name of the source location.
     */

    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProgramRequest withSourceLocationName(String sourceLocationName) {
        setSourceLocationName(sourceLocationName);
        return this;
    }

    /**
     * <p>
     * The name that's used to refer to a VOD source.
     * </p>
     * 
     * @param vodSourceName
     *        The name that's used to refer to a VOD source.
     */

    public void setVodSourceName(String vodSourceName) {
        this.vodSourceName = vodSourceName;
    }

    /**
     * <p>
     * The name that's used to refer to a VOD source.
     * </p>
     * 
     * @return The name that's used to refer to a VOD source.
     */

    public String getVodSourceName() {
        return this.vodSourceName;
    }

    /**
     * <p>
     * The name that's used to refer to a VOD source.
     * </p>
     * 
     * @param vodSourceName
     *        The name that's used to refer to a VOD source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProgramRequest withVodSourceName(String vodSourceName) {
        setVodSourceName(vodSourceName);
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
        if (getAdBreaks() != null)
            sb.append("AdBreaks: ").append(getAdBreaks()).append(",");
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getProgramName() != null)
            sb.append("ProgramName: ").append(getProgramName()).append(",");
        if (getScheduleConfiguration() != null)
            sb.append("ScheduleConfiguration: ").append(getScheduleConfiguration()).append(",");
        if (getSourceLocationName() != null)
            sb.append("SourceLocationName: ").append(getSourceLocationName()).append(",");
        if (getVodSourceName() != null)
            sb.append("VodSourceName: ").append(getVodSourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProgramRequest == false)
            return false;
        CreateProgramRequest other = (CreateProgramRequest) obj;
        if (other.getAdBreaks() == null ^ this.getAdBreaks() == null)
            return false;
        if (other.getAdBreaks() != null && other.getAdBreaks().equals(this.getAdBreaks()) == false)
            return false;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getProgramName() == null ^ this.getProgramName() == null)
            return false;
        if (other.getProgramName() != null && other.getProgramName().equals(this.getProgramName()) == false)
            return false;
        if (other.getScheduleConfiguration() == null ^ this.getScheduleConfiguration() == null)
            return false;
        if (other.getScheduleConfiguration() != null && other.getScheduleConfiguration().equals(this.getScheduleConfiguration()) == false)
            return false;
        if (other.getSourceLocationName() == null ^ this.getSourceLocationName() == null)
            return false;
        if (other.getSourceLocationName() != null && other.getSourceLocationName().equals(this.getSourceLocationName()) == false)
            return false;
        if (other.getVodSourceName() == null ^ this.getVodSourceName() == null)
            return false;
        if (other.getVodSourceName() != null && other.getVodSourceName().equals(this.getVodSourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdBreaks() == null) ? 0 : getAdBreaks().hashCode());
        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getProgramName() == null) ? 0 : getProgramName().hashCode());
        hashCode = prime * hashCode + ((getScheduleConfiguration() == null) ? 0 : getScheduleConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSourceLocationName() == null) ? 0 : getSourceLocationName().hashCode());
        hashCode = prime * hashCode + ((getVodSourceName() == null) ? 0 : getVodSourceName().hashCode());
        return hashCode;
    }

    @Override
    public CreateProgramRequest clone() {
        return (CreateProgramRequest) super.clone();
    }

}
