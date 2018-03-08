<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%--
    Licensed to the Apache Software Foundation (ASF) under one or more
    contributor license agreements.  See the NOTICE file distributed with
    this work for additional information regarding copyright ownership.
    The ASF licenses this file to You under the Apache License, Version 2.0
    (the "License"); you may not use this file except in compliance with
    the License.  You may obtain a copy of the License at
   
         http://www.apache.org/licenses/LICENSE-2.0
   
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
--%>

<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Continent Table Detail</title>
<html:xhtml/>
<html:base/>
<link href="css/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h2>Choose Contenent</h2>

<table border="0" cellspacing="5" width="85%" >
  <tr valign="top">
    <td width="30"><img alt="" src="images/execute.gif" /></td>
    <td>Press icon like this to show data in next page.</td>
  </tr>
</table>
<br />
<table width="85%" border="0" cellpadding="2" cellspacing="5">
  <tr valign="top">
    <td>Continent Table Detail using ActionForm</td>
    <td>
		<html:link action="/prepareSimple">
		  <img src="images/execute.gif" alt="" hspace="4" border="0"  align="top" class="inline" />
		</html:link>
		<html:link action="/prepareSimple">Execute</html:link>
	</td>
  </tr>
    <tr valign="top">
    <td>Continent Table Detail using DynaActionForm</td>
    <td>
		<html:link action="/prepareDyna">
		  <img src="images/execute.gif" alt="" hspace="4" border="0"  align="top" class="inline" />
		</html:link>
		<html:link action="/prepareDyna">Execute</html:link>
	</td>
  </tr>
</table>
</body>



</html>