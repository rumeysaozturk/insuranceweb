<html>
<head>

<meta charset="utf-8">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+JP:wght@100&display=swap"
	rel="stylesheet">

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&display=swap"
	rel="stylesheet">
<style>
body {
	background-color: #ffffff;
	font-family: 'Open Sans', sans-serif;
}
 select{
      width:45%;
      box-sizing:border-box;
    }
.baslik {
	text-align: center;
	padding: 30px;
	font-weight: normal;
}

.kayıt {
	margin: 50px auto;
	position: relative;
	border-radius: 10px;
	background: #ECEDF3;
	width: 400px;
	height: 550px;
	border-style: ridge;
}

.bilgi {
	border-style: solid;
	border-width: 2px;
	border-color: grey;
	margin-left: 60px;
}

.buton {
	background-color: #555555;
	color: white;
	border: 2px solid #555555;
	padding: 12px 45px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	font-weight: bold;
	margin: 4px 2px;
	transition-duration: 0.4s;
	cursor: pointer;
	border-radius: 5px;
}

.buton:hover {
	background-color: #7F7D7D;
	color: white;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #555555;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover:not(.active) {
	background-color: #111;
}

.active {
	background-color: #7F7D7D;
}
</style>
</head>
<body>

	<div class="container">
		<ul>

			<li><a class="active" href="">Kayıt</a></li>


			<li><a href="liste">Liste</a></li>


		</ul>
		<div class="col-lg-12 col-md-12 col-xs-12">
			<div class="row">
				<div class="kayıt" style="text-align: center;">
					<h2 class="baslik">Yeni Kayıt</h2>
					<form th:action="@{/addCar}" th:object="${car}"
						method="post">

						<div style="margin-left: 83px; font-weight: bolder; float: left;">Plaka</div>
						<br> <input class="bilgi form-control" type="text"
							th:field="*{plaque}" name="plaque" required maxlength="50" /><br>

						<div style="margin-left: 83px; font-weight: bolder; float: left;">Marka:</div>
						<br> <input class="bilgi" type="text" th:field="*{brand}"
							name="brand" required maxlength="50" /><br>
						<div style="margin-left: 83px; font-weight: bolder; float: left;">Model:</div>
						<br> <input class="bilgi" type="text" th:field="*{model}"
							name="model" required maxlength="50" /><br>
						<div style="margin-left: 83px; font-weight: bolder; float: left;">Yıl:</div>
						<br> <input class="bilgi" type="tel"
							th:field="*{year}" name="year" required
							maxlength="11" /><br>

						

						<button class="buton" type="submit" style="margin-left: -20px;">KAYDET</button>
						<br> <br>
					</form>
				</div>
			</div>
		</div>
	</div>





</body>





</html>