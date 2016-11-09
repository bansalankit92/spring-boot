<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Spring Boot Note Application</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js" ></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li>
                    <a href="/notes">notes</a>
                </li>
                <li>
                    <a href="/">home</a>
                </li>

            </ul>
        </div>
    </div>
</nav>

<br><br><br>
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <h2>Add</h2>
            <form class="form" action="/notes" method="post">
                <textarea name="note" value="note" maxlength="200"></textarea>
                <input type="submit" class="btn btn-info" value="add">
            </form>
            <c:if test="${not empty noteAdded }">
                <strong>Id :</strong> ${noteAdded.id}
                <strong>Note :</strong> ${noteAdded.note}
            </c:if>
            <c:if test="${ empty noteAdded }">
                <strong>not added</strong>
            </c:if>
            <br><br>
            <a class="btn" href="/notes"> get all notes </a>
            <table class="table">
                <tr>
                    <th>Id</th>
                    <th>Note</th>
                    <th>Timestamp</th>
                </tr>
                <c:forEach items="${notes}" var="current">
                    <tr>
                        <td><c:out value="${current.id}" /><td>
                        <td><c:out value="${current.note}" /><td>
                        <td><c:out value="${current.createdAt}" /><td>
                    </tr>
                </c:forEach>
            </table>
            <br><br>

            <h2>Get by id</h2>
            <form class="form" action="/notes/id" method="get">
                <input type="number" name="id" >
                <input type="submit" class="btn btn-info" value="get">
            </form>
            <c:if test="${not empty note }">
                <strong>Id :</strong> ${note.id}
                <strong>Note :</strong> ${note.note}
            </c:if>
            <c:if test="${ empty note }">
                <strong> not found</strong>
            </c:if>
            <br><br>

            <h2>Update</h2>
            <form class="form" action="/notes/update" method="post">
               ID : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" name="id" placeholder="1" >
             <br>   New Note :<textarea name="note" value="note" maxlength="200"></textarea>
                <input type="submit" class="btn btn-info" value="update">
            </form>
            <c:if test="${not empty noteUpdated }">
                <strong>Id :</strong> ${noteUpdated.id}
                <strong>Note :</strong> ${noteUpdated.note}
            </c:if>
            <c:if test="${ empty noteUpdated }">
                <strong>not  updated</strong>
            </c:if>
            <br><br>

            <h2>Deleted</h2>
            <form class="form" action="/notes/delete" method="delete">
                <input type="number" name="id" >
                <input type="submit" class="btn btn-info" value="delete">
            </form>
            <c:if test="${not empty noteDeleted }">
                <strong>Id :</strong> ${noteDeleted.id}
                <strong>Note :</strong> ${noteDeleted.note}
            </c:if>
            <c:if test="${ empty noteDeleted }">
                <strong>not  deleted</strong>
            </c:if>
            <br><Br>

            @ 2016 <a href="http://codevik.com">codevik</a>

        </div>
    </div>
</div>




</body>

</html>