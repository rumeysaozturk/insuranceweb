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
				<div class="kayıt" style="text-align: center;">
					<h2 class="baslik">Yeni Kişi Kaydı</h2>
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