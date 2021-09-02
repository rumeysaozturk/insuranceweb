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
	background-color:#ffffff;
	font-family: 'Open Sans', sans-serif;
}

table {
	width: 90%;
	margin-left: auto;
	margin-right: auto;
	margin-top: 50px;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 15px;
	text-align: left;
}

#t01 tr:nth-child(even) {
	background-color: #eee;
}

#t01 tr:nth-child(odd) {
	background-color: #fff;
}

#t01 th {
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
	<ul>

		<li><a  href="/">Kayıt</a></li>


		<li><a class="active" href="">Liste</a></li>


	</ul>
	
	<div class="container">
		<div class="col-lg-12 col-md-12 col-xs-12">
			<div class="row">

				<table id="t01"
					style="text-align: center; float: right; margin-right: 50px;">
					<thead>
						<tr>
							<th style="width: 100px;">Ad</th>
							<th style="width: 100px;">Soyad</th>
							<th style="width: 100px;">TC</th>
							<th style="width: 100px;">Telefon Numarası</th>
							<th style="width: 100px;">Cinsiyet</th>
							<th style="width: 100px;">Sigorta Çeşidi</th>
							<th style="width: 100px;">Tarih</th>
							<th style="width: 100px;">Son Tarih</th>

						</tr>
					</thead>
					<tbody>
						<tr th:each="user : ${listUser }">
							<td th:text="${user.name}"></td>
							<td th:text="${user.surname}"></td>
							<td th:text="${user.tc}"></td>
							<td th:text="${user.phoneNumber}"></td>
							<td th:text="${user.gender}"></td>
							<td th:text="${user.insuranceType}"></td>
							<td th:text="${user.date}"></td>
							<td th:text="${user.lastdate}"></td>

						</tr>


					</tbody>

				</table>
				<br>
				<br>
				<br>
			</div>

		</div>
	</div>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>


</body>





</html>