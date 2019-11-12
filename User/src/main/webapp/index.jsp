<html>
<body>
<h2>Hello World!</h2>

<form action="/User/save" method ="get" modelAttribute = "user">

UserId 		: <input type="text" name="userId"/>
UserName	: <input type="text" name="userName"/>
UserPass	: <input type="text" name="userPass"/>
UserEmail   : <input type="text" name="userEmail"/>
<input type="submit" value="save"/>
</form>

<form action="/User/delete" method ="get" modelAttribute = "user">

UserId 		: <input type="text" name="userId"/>

<input type="submit" value="delete"/>
</form>

<form action="/User/update" method ="get" modelAttribute = "user">

UserId 		: <input type="text" name="userId"/>
<input type="submit" value="update"/>
</form>

<form action="/User/fetch" method ="get" modelAttribute = "user">

UserId 		: <input type="text" name="userId"/>
<input type="submit" value="FetchByID"/>
</form>


</body>
</html>
