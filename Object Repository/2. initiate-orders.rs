<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>2. initiate-orders</name>
   <tag></tag>
   <elementGuidId>e7478617-0f4e-494f-90c6-aa323bffe692</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;InitiateOrderRequest\&quot;: {\n        \&quot;OrderDate\&quot;: \&quot;2022-07-04\&quot;,\n        \&quot;Maskapai\&quot;: \&quot;BCA Insurance\&quot;\n    },\n    \&quot;Source\&quot;: \&quot;BCAI\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${s_key_init}</value>
   </httpHeaderProperties>
   <katalonVersion>8.2.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://api-dev.bcaf.id:8445/initiateordercarins</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'ZfprlC7a6szTfElMMKL6OdfLTUZt'</defaultValue>
      <description></description>
      <id>24f5947e-584c-444d-8006-148773fa0cfa</id>
      <masked>false</masked>
      <name>s_key_init</name>
   </variables>
   <variables>
      <defaultValue>'2022-07-03'</defaultValue>
      <description></description>
      <id>c5062e92-fb21-4b0c-8be0-92ed1d3679a8</id>
      <masked>false</masked>
      <name>order_date</name>
   </variables>
   <variables>
      <defaultValue>'BCA Insurance'</defaultValue>
      <description></description>
      <id>2870d9c0-5f51-47aa-94ed-fb40470c2387</id>
      <masked>false</masked>
      <name>maskapai_id</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
