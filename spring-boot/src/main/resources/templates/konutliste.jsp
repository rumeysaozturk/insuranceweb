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
                <li><a href="kullaniciliste">Kişi Listesi</a></li>
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
							<th style="width: 100px;">Mahalle</th>
							<th style="width: 100px;">Cadde/Sokak</th>
							<th style="width: 100px;">Bina Numarası </th>
							<th style="width: 100px;">Kapı Numarası</th>
							<th style="width: 100px;">İlçe</th>
							<th style="width: 100px;">Şehir</th>
							<th style="width: 100px;">Yapım Yılı</th>
							<th style="width: 100px;"></th>
							<th style="width: 100px;"></th>

						</tr>
					</thead>
					<tbody>
						<tr th:each="house : ${listHouse }">
							<td th:text="${house.neighborhood}"></td>
							<td th:text="${house.street}"></td>
							<td th:text="${house.buildingNo}"></td>
							<td th:text="${house.doorNumber}"></td>
							<td th:text="${house.town}"></td>
							<td th:text="${house.city}"></td>
							<td th:text="${house.year}"></td>
							<td><a th:href="@{'updateHouse/'+${house.houseId}}"class="btn btn-info">Update</a></td>
							<td><a th:href="@{'deleteHouse/'+${house.houseId}}"class="btn btn-danger">Delete</a></td>

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
