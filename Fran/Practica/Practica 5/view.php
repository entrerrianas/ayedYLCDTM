<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="es-ar" xml:lang="es-ar">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="https://catedras.info.unlp.edu.ar/theme/standard/styles.php" />
<link rel="stylesheet" type="text/css" href="https://catedras.info.unlp.edu.ar/theme/info/styles.php" />

<!--[if IE 7]>
    <link rel="stylesheet" type="text/css" href="https://catedras.info.unlp.edu.ar/theme/standard/styles_ie7.css" />
<![endif]-->
<!--[if IE 6]>
    <link rel="stylesheet" type="text/css" href="https://catedras.info.unlp.edu.ar/theme/standard/styles_ie6.css" />
<![endif]-->


    <meta name="keywords" content="moodle, AyED-2011: AyED-2011: JUnits para el TP Nro. 5 " />
    <title>Cátedras de la Facultad de Informática de la UNLP</title>
    <link rel="shortcut icon" href="https://catedras.info.unlp.edu.ar/theme/info/img/favicon.png" />
    <!--<style type="text/css">/*<![CDATA[*/ body{behavior:url(https://catedras.info.unlp.edu.ar/lib/csshover.htc);} /*]]>*/</style>-->

<script type="text/javascript" src="https://catedras.info.unlp.edu.ar/lib/javascript-static.js"></script>
<script type="text/javascript" src="https://catedras.info.unlp.edu.ar/lib/javascript-mod.php"></script>
<script type="text/javascript" src="https://catedras.info.unlp.edu.ar/lib/overlib/overlib.js"></script>
<script type="text/javascript" src="https://catedras.info.unlp.edu.ar/lib/overlib/overlib_cssstyle.js"></script>
<script type="text/javascript" src="https://catedras.info.unlp.edu.ar/lib/cookies.js"></script>
<script type="text/javascript" src="https://catedras.info.unlp.edu.ar/lib/ufo.js"></script>
<script type="text/javascript" src="https://catedras.info.unlp.edu.ar/lib/dropdown.js"></script>  

<script type="text/javascript" defer="defer">
//<![CDATA[
setTimeout('fix_column_widths()', 20);
//]]>
</script>
<script type="text/javascript">
//<![CDATA[
function openpopup(url, name, options, fullscreen) {
    var fullurl = "https://catedras.info.unlp.edu.ar" + url;
    var windowobj = window.open(fullurl, name, options);
    if (!windowobj) {
        return true;
    }
    if (fullscreen) {
        windowobj.moveTo(0, 0);
        windowobj.resizeTo(screen.availWidth, screen.availHeight);
    }
    windowobj.focus();
    return false;
}

function uncheckall() {
    var inputs = document.getElementsByTagName('input');
    for(var i = 0; i < inputs.length; i++) {
        inputs[i].checked = false;
    }
}

function checkall() {
    var inputs = document.getElementsByTagName('input');
    for(var i = 0; i < inputs.length; i++) {
        inputs[i].checked = true;
    }
}

function inserttext(text) {
  text = ' ' + text + ' ';
  if ( opener.document.forms['theform'].message.createTextRange && opener.document.forms['theform'].message.caretPos) {
    var caretPos = opener.document.forms['theform'].message.caretPos;
    caretPos.text = caretPos.text.charAt(caretPos.text.length - 1) == ' ' ? text + ' ' : text;
  } else {
    opener.document.forms['theform'].message.value  += text;
  }
  opener.document.forms['theform'].message.focus();
}

function getElementsByClassName(oElm, strTagName, oClassNames){
	var arrElements = (strTagName == "*" && oElm.all)? oElm.all : oElm.getElementsByTagName(strTagName);
	var arrReturnElements = new Array();
	var arrRegExpClassNames = new Array();
	if(typeof oClassNames == "object"){
		for(var i=0; i<oClassNames.length; i++){
			arrRegExpClassNames.push(new RegExp("(^|\\s)" + oClassNames[i].replace(/\-/g, "\\-") + "(\\s|$)"));
		}
	}
	else{
		arrRegExpClassNames.push(new RegExp("(^|\\s)" + oClassNames.replace(/\-/g, "\\-") + "(\\s|$)"));
	}
	var oElement;
	var bMatchesAll;
	for(var j=0; j<arrElements.length; j++){
		oElement = arrElements[j];
		bMatchesAll = true;
		for(var k=0; k<arrRegExpClassNames.length; k++){
			if(!arrRegExpClassNames[k].test(oElement.className)){
				bMatchesAll = false;
				break;
			}
		}
		if(bMatchesAll){
			arrReturnElements.push(oElement);
		}
	}
	return (arrReturnElements)
}
//]]>
</script>
</head>

<body  class="mod-resource course-169 dir-ltr lang-es_ar_utf8" id="mod-resource-view">

<div id="page">
<div class="container_16">
    <div id="header" class=" clearfix">        <div class="grid_10" id="logo">
			<h1><a href="https://catedras.info.unlp.edu.ar/"><img src="https://catedras.info.unlp.edu.ar/theme/info/img/logo.png" title="CLSC FPMIPA UPI" alt="CLSC FPMIPA UPI" /></a></h1>
			</div>
 <div class="headermenu"><div class="navigation">
<ul><li><form action="https://catedras.info.unlp.edu.ar/mod/resource/view.php"  onclick="this.target='_top';"><fieldset class="invisiblefieldset"><input type="hidden" name="id" value="6518" /><button type="submit" title="Actividad anterior"><span class="arrow ">&#x25C4;</span><span class="accesshide " >&nbsp;Actividad anterior</span></button></fieldset></form></li><li><form action="https://catedras.info.unlp.edu.ar/course/jumpto.php" method="get"  id="navmenupopup" class="popupform"><div><select id="navmenupopup_jump" name="jump" onchange="self.location=document.getElementById('navmenupopup').jump.options[document.getElementById('navmenupopup').jump.selectedIndex].value;">
   <option value="https://catedras.info.unlp.edu.ar/mod/forum/view.php?id=6185" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/forum/icon.gif);">Novedades</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/forum/view.php?id=6362" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/forum/icon.gif);">Consultas sobre temas teóricos y/o prácticos</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/forum/view.php?id=6363" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/forum/icon.gif);">Consultas Administrativas</option>
   <optgroup label=" 
Cursada 2011 - Horarios
 
  
    
      Teo...">   <option value="https://catedras.info.unlp.edu.ar/mod/choice/view.php?id=6187" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/choice/icon.gif);">Teoría de Alg y ED</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/choice/view.php?id=6193" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/choice/icon.gif);"> Teoria de JAVA</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/choice/view.php?id=6194" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/choice/icon.gif);">Práctica</option>
   </optgroup>   <optgroup label=" Teorías de Algoritmos y Estructuras de Datos ...">   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6290" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Análisis de algoritmos</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6346" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Árboles Binarios y Generales</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6396" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Árboles Binarios de Búsqueda - Árboles AVL</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6397" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Anexo - Implementaciones de las operaciones de AVL</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6423" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Grafos: Definiciones y Recorridos</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6489" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Grafos: Ordenación Topológica</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6566" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Cola de Prioridades</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6593" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Grafos: Caminos mínimos - Árbol de expansión mínima</option>
   </optgroup>   <optgroup label=" Teorías de JAVA ">   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6284" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Conceptos de POO y Plataforma Java</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6309" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Mi primera clase en JAVA (actualizada) </option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6308" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Definición de clases e instanciación de objetos</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6310" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Lista de enteros con JAVA (actualizada)</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6338" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Herencia y clases abstractas. </option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6387" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Listas con Integer, Object y Tipos Genéricos </option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6372" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Constructores</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6373" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Paquetes y especificadores de acceso</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6495" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Arboles Binarios y Generales</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6496" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Polimorfismo </option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6547" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Interfaces en JAVA - La interface comparable y Com...</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6548" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">La interface Comparable con Arboles Binarios de Bú...</option>
   </optgroup>   <optgroup label=" Trabajos Prácticos ">   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6299" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Trabajo Práctico Nro. 1 - Análisis de algoritmos</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6357" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Librerias</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6303" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Trabajo Practico Nro. 1 - explicación</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6341" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Trabajo Práctico Nro. 1 2da explicación</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6300" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Tutorial de JDK y Eclipse</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6383" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Practica1.zip</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6342" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Trabajo Práctico Nro. 2 - Encapsulamiento y Abstracción</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6343" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Trabajo Practico Nro. 2 - explicación</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6344" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">JUnits para el TP2</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6345" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">EditDistance.java</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6422" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Implementación de Lista Generica (Catedra )</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6419" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Trabajo Práctico Nro. 3 - Arboles Binarios</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6420" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Trabajo Practico Nro. 3 - explicación</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6421" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">JUnits para el TP3</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6483" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Trabajo Práctico Nro. 4 - Arboles Generales</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6484" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Trabajo Practico Nro. 4 - explicación</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6485" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">JUnits para el TP4</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6517" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Trabajo Practico Nro. 5 - ABB y AVL</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6518" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Trabajo Práctico Nro. 5 - Explicación</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6520" selected="selected" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Ir a...</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6577" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Trabajo Practico Nro. 6 - Grafos 1era. parte</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6578" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Trabajo Practico Nro. 6 - Explicacion de Practica</option>
   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6580" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">JUnits para el Trabajo Practico Nro. 6</option>
   </optgroup>   <optgroup label=" Bibliografía ">   <option value="https://catedras.info.unlp.edu.ar/mod/resource/view.php?id=6429" style="background-image: url(https://catedras.info.unlp.edu.ar/pix/smartpix.php/info/mod/resource/icon.gif);">Bibliografía sugerida</option>
    </optgroup></select><input type="hidden" name="sesskey" value="TUKnSg0UOZ" /><div id="noscriptnavmenupopup" style="display: inline;"><input type="submit" value="Ir" /></div><script type="text/javascript">
//<![CDATA[
document.getElementById("noscriptnavmenupopup").style.display = "none";
//]]>
</script></div></form></li><li><form action="https://catedras.info.unlp.edu.ar/mod/resource/view.php"   onclick="this.target='_top';"><fieldset class="invisiblefieldset"><input type="hidden" name="id" value="6577" /><button type="submit" title="Actividad siguiente"><span class="accesshide " >Actividad siguiente&nbsp;</span><span class="arrow ">&#x25BA;</span></button></fieldset></form></li></ul>
</div></div>
		<div class="clear">&nbsp;</div>



		<div class="grid_12 topnav"></div>
		<div class="grid_4" id="top-date">
Martes 24 de Mayo de 2011
		</div>
		<div class="clear">&nbsp;</div>
    </div>	
		<div class="navbar clearfix" id="breadcrumb">
			<div class="padderlittle">
			<div class="breadcrumb"><h2 class="accesshide " >Usted está aquí</h2> <ul>
<li class="first"><a  onclick="this.target='_top'" href="https://catedras.info.unlp.edu.ar/">Cátedras</a></li><li> <span class="accesshide " >/&nbsp;</span><span class="arrow sep">&#x25BA;</span> <a  onclick="this.target='_top'" href="https://catedras.info.unlp.edu.ar/course/view.php?id=169">AyED-2011</a></li><li> <span class="accesshide " >/&nbsp;</span><span class="arrow sep">&#x25BA;</span> <a  onclick="this.target='_top'" href="https://catedras.info.unlp.edu.ar/mod/resource/index.php?id=169">Recursos</a></li><li> <span class="accesshide " >/&nbsp;</span><span class="arrow sep">&#x25BA;</span> JUnits para el TP Nro. 5</li></ul></div>
			<div class="navbutton">&nbsp;</div>
	    </div>
	    </div>
	
    <!-- END OF HEADER -->
    <div id="content"><div class="resourcepdf">Para abrir este documento, haga clic en este enlace:<a href="https://catedras.info.unlp.edu.ar/file.php/169/Trabajos_Practicos/TP_5.zip">JUnits para el TP Nro. 5</a></div><img class="spacer" height="20" width="20" src="https://catedras.info.unlp.edu.ar/pix/spacer.gif" alt="" /><br />
</div><div id="footer"><p class="helplink"></p><div class="logininfo">Usted se ha autentificado como <a  href="https://catedras.info.unlp.edu.ar/user/view.php?id=3861&amp;course=169">Francisco Carbone</a>  (<a  href="https://catedras.info.unlp.edu.ar/login/logout.php?sesskey=TUKnSg0UOZ">Salir</a>)</div><div class="homelink"><a  href="https://catedras.info.unlp.edu.ar/course/view.php?id=169">AyED-2011</a></div></div>
</div>
</div>
</body>
</html>
