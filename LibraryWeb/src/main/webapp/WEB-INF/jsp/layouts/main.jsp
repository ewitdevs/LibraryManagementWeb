<%--
  Created by IntelliJ IDEA.
  User: vinay
  Date: 10/31/2020
  Time: 05:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertAttribute name="header"/>

<tiles:insertAttribute name="nav"/>
<div class="container-fluid">
    <tiles:insertAttribute name="content"/>
</div>

<tiles:insertAttribute name="footer"/>

