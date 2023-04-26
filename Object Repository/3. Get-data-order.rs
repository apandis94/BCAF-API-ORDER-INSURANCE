<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>3. Get-data-order</name>
   <tag></tag>
   <elementGuidId>3684b5fb-3ac3-4542-a4ae-527101a958fe</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;GetDataOrderRequest\&quot; : \n    { \n        \&quot;MaskapaiID\&quot; \t: \&quot;${c_id}\&quot;, \n        \&quot;OrderDate\&quot; \t: \&quot;${order_date}\&quot;,\n        \&quot;Page\&quot;\t\t\t: \&quot;${page}\&quot;,\n        \&quot;RowsPerPage\&quot; \t: \&quot;${rows}\&quot; \n        },\n        \&quot;Source\&quot; : \&quot;RAKSA\&quot; \n        }&quot;,
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
      <value>Bearer ${s_key}</value>
   </httpHeaderProperties>
   <katalonVersion>8.2.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://api-dev.bcaf.id:8445/getdataordercarins</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.global_token</defaultValue>
      <description></description>
      <id>07252e46-760a-46e0-b3b1-b75d7bc873df</id>
      <masked>false</masked>
      <name>s_key</name>
   </variables>
   <variables>
      <defaultValue>'NEWTRKS'</defaultValue>
      <description></description>
      <id>e296c137-249d-43ec-9d84-2083cab4ffa3</id>
      <masked>false</masked>
      <name>c_id</name>
   </variables>
   <variables>
      <defaultValue>'2022-07-08'</defaultValue>
      <description></description>
      <id>79dc059c-9892-4075-9fa2-409d864ff396</id>
      <masked>false</masked>
      <name>order_date</name>
   </variables>
   <variables>
      <defaultValue>1</defaultValue>
      <description></description>
      <id>1925ca12-1a4d-417a-a877-9688f604b3d7</id>
      <masked>false</masked>
      <name>page</name>
   </variables>
   <variables>
      <defaultValue>100</defaultValue>
      <description></description>
      <id>ddc722a6-a08e-4523-98bc-2ee2954f24e5</id>
      <masked>false</masked>
      <name>rows</name>
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
