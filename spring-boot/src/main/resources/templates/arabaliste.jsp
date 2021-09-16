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
        padding: 0;
        list-style: none;
        background: #666666;
    }
    ul li {
        display: inline-block;
        position: relative;
        line-height: 21px;
        text-align: left;
    }
    ul li a {
        display: block;
        padding: 8px 25px;
        color: white;
        text-decoration: none;
    }
    ul li a:hover {
        color: #fff;
        background: #939393;
    }
    ul li ul.dropdown {
        min-width: 100%; /* Set width of the dropdown */
        background: #black;
        display: none;
        position: absolute;
        z-index: 999;
        left: 0;
    }
    ul li:hover ul.dropdown {
        display: block; /* Display the dropdown */
    }
    ul li ul.dropdown li {
        display: block;
    }
.active {
	background-color: #7F7D7D;
}
</style>
</head>
<body>
<ul>
        
        <li>
            <a href="/">Kayıt ▾</a>
            <ul class="dropdown">
                <li><a href="kullanıcı">Kişi Kaydı</a></li>
                <li><a href="araba">Araba kaydı</a></li>
                <li><a href="house">Konut Kaydı</a></li>
            </ul>
        </li>
        <li><a href="#">Listeler</a>
        <ul class="dropdown">
                <li><a href="kullanıcıliste">Kişi Listesi</a></li>
                <li><a href="arabaliste">Araba Listesi</a></li>
                <li><a href="konutliste">Konut Listesi</a></li>
            </ul>
        </li>
        <li><a href="arabasigorta">Araba Sigortası</a></li>
    </ul>
	
	<div class="container">
		<div class="col-lg-12 col-md-12 col-xs-12">
			<div class="row">

				<table id="t01"
					style="text-align: center; float: right; margin-right: 50px;">
					<thead>
						<tr>
							<th style="width: 100px;">Plaka</th>
							<th style="width: 100px;">Marka</th>
							<th style="width: 100px;">Model</th>
							<th style="width: 100px;">Yıl</th>
							<th style="width: 100px;">Kaza Kaydı</th>

						</tr>
					</thead>
					<tbody>
						<tr th:each="car : ${listCar }">
							<td th:text="${car.plaque}"></td>
							<td th:text="${car.brand}"></td>
							<td th:text="${car.model}"></td>
							<td th:text="${car.year}"></td>
							<td th:text="${car.accident}"></td>

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