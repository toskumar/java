<html>
<h1>Rest Service</h1>

<br><a href="rest/employee"> Display all employee</a>

<br><br><a href="rest/employee/11242510">Display single Employee</a>

<br><br>Query Param <a href="rest/employee/id/11242510?format=json">Json, </a><a href="rest/employee/id/11242510?format=xml">Xml</a>

<br><br><a href="rest/param/id/11242506">Path Param</a>

<br><br>Default Param <a href="rest/param/default"> Json </a> , <a href="rest/param/default?format=xml">Xml</a> 

<br><br><a href="rest/param/context">Context Param</a>


<br><br><a href="rest/param/cookieParam">Cookies Params</a>

<br><br><a href="rest/param/cookies">Cookies</a>

<br><br><a href="rest/param/headers">Http Headers</a>

<br><br><a href="rest/param/matrix;a1=1000;a2=2000">Matrix Param</a>

<br><br>Form param <form action="rest/form/urlencoded" method="post" enctype="application/x-www-form-urlencoded"><input name="email" /><input type="submit"></form>

<br><br>File upload <form action="rest/form/multipart2" method="post" enctype="multipart/form-data"><input type="file" name="file"><input type="submit"></form>

<br><br><a href="rest/application.wadl">Web Application Definition Language(WADL)</a>

<br><br><a href="rest/application.wadl?detail=true">WADL Details</a>
</html>