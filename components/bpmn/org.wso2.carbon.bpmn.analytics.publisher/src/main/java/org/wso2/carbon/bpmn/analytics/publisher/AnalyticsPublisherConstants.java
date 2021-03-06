/**
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.bpmn.analytics.publisher;

public class AnalyticsPublisherConstants {
    public static final String USER_NAME = "admin";
    public static final String PASSWORD = "admin";
    public static final String LOCAL_THRIFT_URL = "tcp://localhost:7611";
    public static final int DELAY = 15000;
    public static final int REPEATEDLY_DELAY = 6000;

    public static final String LAST_PROCESS_INSTANCE_PUBLISH_TIME = "lastBPMNProcessInstanceTime";
    public static final String LAST_TASK_INSTANCE_END_TIME = "lastBPMNTaskInstanceTime";

    public static final String PROCESS_STREAM_NAME = "BPMN_Process_Instance_Data_Publish";
    public static final String TASK_STREAM_NAME = "BPMN_Task_Instance_Data_Publish";
    public static final String STREAM_VERSION = "1.0.0";
    public static final String PROCESS_STREAM_DESCRIPTION = "BPMN process instances data";
    public static final String TASK_STREAM_DESCRIPTION = "BPMN user tasks data";

    public static final String PROCESS_DEFINITION_ID = "processDefinitionId";
    public static final String PROCESS_INSTANCE_ID = "processInstanceId";
    public static final String START_TIME = "startTime";
    public static final String START_ACTIVITY_ID = "startActivityId";
    public static final String START_USER_ID = "startUserId";
    public static final String END_TIME = "endTime";
    public static final String DURATION = "duration";
    public static final String ASSIGNEE = "assignee";
    public static final String TENANT_ID = "tenantId";

    public static final String TASK_DEFINITION_ID = "taskDefinitionKey";
    public static final String TASK_INSTANCE_ID = "taskInstanceId";
    public static final String CREATE_TIME = "createTime";

    public static final String PROCESS_RESOURCE_PATH = "resource_process_instance_time_location";
    public static final String TASK_RESOURCE_PATH = "resource_task_instance_time_location";

    public static final String DATA_RECEIVER_RESOURCE_PATH = "bpmn/data_analytics_publisher/thrift_configuration";
    public static final String THRIFT_URL_PROPERTY = "data_receiver_thrift_url";
    public static final String USER_NAME_PROPERTY = "username";
    public static final String PASSWORD_PROPERTY = "password";

    public static final String SPRING_NAMESPACE = "http://www.springframework.org/schema/beans";
    public static final String BEAN = "bean";
    public static final String BEAN_ID = "id";
    public static final String BEAN_ID_VALUE = "bpmnDataPublisherConfiguration";
    public static final String ACTIVATE = "dataPublishingEnabled";
    public static final String NAME = "name";
    public static final String TRUE = "true";
    public static final String VALUE = "value";
    public static final String PROPERTY = "property";
}
