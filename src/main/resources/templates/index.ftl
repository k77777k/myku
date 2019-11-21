<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>首页</title>
</head>
<body>
    <h1>aaaaa</h1>
${name}
<#list all as detail>
    <#if detail.id gt 5> 
    ${detail.createdate?datetime}
    </#if>
</#list>
</body>
</html>