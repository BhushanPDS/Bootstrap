<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>


    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <style>
        .row {
            text-align: center;
            font-family: Arial, Helvetica, sans-serif;
            font-size: 19px;
            font-weight: bold;
            margin-top: 5%;
        }
        
        .form {
            padding: 50px 60px;
            border: 1px seagreen;
            box-shadow: 5px 5px 21px 5px #000000;
        }
        
        h1 {
            padding-bottom: 20px;
            margin-top: 2px
        }
        
        body {}
    </style>
</head>

<body>
    <div class="row">




        <div class="col-md-4"></div>
        <div class="col-md-4 mt-5 container-fluid  form">
            <h1 class="p-b-10">Login Formjsjsj

            </h1>
            <form  action="login" method="post">
                <label><i class="fa fa-user" aria-hidden="true"></i>
                    Username</label>
                <input type="text" placeholder="username" name="username" class="form-control text-md-center p-lg-4 text-center">
                <br/>
                <label><i class="fa fa-key" aria-hidden="true"></i>
                    Password</label>
                <input type="password" name="password" class="form-control p-lg-4 text-center">
                <br>

                <button type="submit" style="font-size:24px" class="btn-block btn-success p-lg-2 pl-4 ">Submit<span class="fa fa-sign-in " style="font-size:24px"></span>


                </button>
        </div>

        <div class="col-md-4"></div>

    </div>
</body>

</html>

<%
Integer msg=(Integer)request.getAttribute("message");
if(msg!=null)
{
	out.println(msg);
}
String msg1=(String)request.getAttribute("counter");

response.getWriter().println("SEVLET ONE VISITOR:" +msg1);

%>
</body>
</html>