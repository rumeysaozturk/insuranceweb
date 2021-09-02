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
					<form th:action="@{/process_register}" th:object="${user}"
						method="post">

						<div style="margin-left: 83px; font-weight: bolder; float: left;">Ad:</div>
						<br> <input class="bilgi form-control" type="text"
							th:field="*{name}" name="name" required maxlength="50" /><br>

						<div style="margin-left: 83px; font-weight: bolder; float: left;">Soyad:</div>
						<br> <input class="bilgi" type="text" th:field="*{surname}"
							name="surname" required maxlength="50" /><br>
						<div style="margin-left: 83px; font-weight: bolder; float: left;">Tc
							Kimlik No:</div>
						<br> <input class="bilgi" type="text" th:field="*{tc}"
							name="surname" required maxlength="50" /><br>
						<div style="margin-left: 83px; font-weight: bolder; float: left;">Telefon
							Numarası:</div>
						<br> <input class="bilgi" type="tel"
							th:field="*{phoneNumber}" name="phoneNumber" required
							maxlength="11" /><br>

						<div style="margin-left: 83px; font-weight: bolder; float: left;">Cinsiyet:</div>
						<br> <input type="radio" th:field="*{gender}" name="gender"
							value="K" />Kadın <input type="radio" name="gender"
							th:field="*{gender}" value="E" />Erkek<br>

						<div style="margin-left: 83px; font-weight: bolder; float: left;">Sigorta
							Çeşidi:</div>
						<br> <select th:field="*{insuranceType}" class="bilgi" name="insurance" style="weight:1500px;" >
							<option class="bilgi" value="Konut">Konut</option>
							<option class="bilgi"value="Trafik">Trafik</option>
						</select><br>
						<div style="margin-left: 83px; font-weight: bolder; float: left;">Tarih:</div>
						<br> <input class="bilgi" th:field="*{date}"
							style="margin-left: 30px;" required type="date" name="date" /> <br>
						<br>

						<button class="buton" type="submit" style="margin-left: -20px;">KAYDET</button>
						<br> <br>
					</form>
				</div>
			</div>
		</div>
	</div>





</body>





</html>