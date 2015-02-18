<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="es-ar" xml:lang="es-ar">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="https://catedras.linti.unlp.edu.ar/theme/standard/styles.php" />
<link rel="stylesheet" type="text/css" href="https://catedras.linti.unlp.edu.ar/theme/linti/styles.php" />

<!--[if IE 7]>
    <link rel="stylesheet" type="text/css" href="https://catedras.linti.unlp.edu.ar/theme/standard/styles_ie7.css" />
<![endif]-->
<!--[if IE 6]>
    <link rel="stylesheet" type="text/css" href="https://catedras.linti.unlp.edu.ar/theme/standard/styles_ie6.css" />
<![endif]-->
<!--[if IE 7]>
    <link rel="stylesheet" type="text/css" href="https://catedras.linti.unlp.edu.ar/theme/custom_corners/styles_ie7.css" />
<![endif]-->
<!--[if IE 6]>
    <link rel="stylesheet" type="text/css" href="https://catedras.linti.unlp.edu.ar/theme/custom_corners/styles_ie6.css" />
<![endif]-->


    <meta name="keywords" content="moodle, AyED-2011: AyED-2011: Librerias " />
    <title>AyED-2011: AyED-2011: Librerias</title>
    <link rel="shortcut icon" href="https://catedras.linti.unlp.edu.ar/theme/linti/favicon.ico" />

    <!--<style type="text/css">/*<![CDATA[*/ body{behavior:url(https://catedras.linti.unlp.edu.ar/lib/csshover.htc);} /*]]>*/</style>-->

<script type="text/javascript" src="https://catedras.linti.unlp.edu.ar/lib/javascript-static.js"></script>
<script type="text/javascript" src="https://catedras.linti.unlp.edu.ar/lib/javascript-mod.php"></script>
<script type="text/javascript" src="https://catedras.linti.unlp.edu.ar/lib/overlib/overlib.js"></script>
<script type="text/javascript" src="https://catedras.linti.unlp.edu.ar/lib/overlib/overlib_cssstyle.js"></script>
<script type="text/javascript" src="https://catedras.linti.unlp.edu.ar/lib/cookies.js"></script>
<script type="text/javascript" src="https://catedras.linti.unlp.edu.ar/lib/ufo.js"></script>
<script type="text/javascript" src="https://catedras.linti.unlp.edu.ar/lib/dropdown.js"></script>  

<script type="text/javascript" defer="defer">
//<![CDATA[
setTimeout('fix_column_widths()', 20);
//]]>
</script>
<script type="text/javascript">
//<![CDATA[
function openpopup(url, name, options, fullscreen) {
    var fullurl = "https://catedras.linti.unlp.edu.ar" + url;
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
<script type="text/javascript" charset="utf-8">
/* <![CDATA[ */
    var CSSClass={};CSSClass.is=function(e,c){if(typeof e=="string")e=document.getElementById(e);var classes=e.className;if(!classes)return false;if(classes==c)return true;return e.className.search("\\b"+c+"\\b")!=-1;};CSSClass.add=function(e,c){if(typeof e=="string")e=document.getElementById(e);if(CSSClass.is(e,c))return;if(e.className)c=" "+c;e.className+=c;};CSSClass.remove=function(e,c){if(typeof e=="string")e=document.getElementById(e);e.className=e.className.replace(new RegExp("\\b"+c+"\\b\\s*","g"),"");};
    
    var script = {
        corrections: function () {
            if (top.user) {
                top.document.getElementsByTagName('frameset')[0].rows = "117,30%,0,200";
            }
            
            // check for layouttabel and add layouttable classes to body
            var tagname = 'nolayouttable';
            if (document.getElementById('middle-column')) {
                var lc = document.getElementById('left-column');
                var rc = document.getElementById('right-column');
                if ( lc && rc ) {
                    tagname = 'haslayouttable rightandleftcolumn';
                } else if (lc) {
                    tagname = 'haslayouttable onlyleftcolumn';
                } else if (rc) {
                    tagname = 'haslayouttable onlyrightcolumn';
                } else {
                    tagname = 'haslayouttable onlymiddlecolumn';
                }
            }
            
            function setbodytag (tagname) {
                var bd = document.getElementsByTagName('body')[0];
                if (bd) {
                    CSSClass.add(bd, tagname);
                } else {
                    setTimeout(function() { setbodytag(tagname) }, 30);
                }
            }
            
            setTimeout(function() { setbodytag(tagname) }, 30);
        },
        
        init: function() {
            script.corrections();
        }
    };
/* ]]> */
</script></head>

<body  class="mod-resource course-169 dir-ltr lang-es_ar_utf8 notinpopup" id="mod-resource-view">

    <div id="page">

    <div id="header" class="wrap wraplevel1 ">
<div id="header-bt" class="bt"><div>&nbsp;</div></div>
<div id="header-i1" class="i1"><div id="header-i2" class="i2"><div id="header-i3" class="i3 clearfix">        <h1 class="headermain">Algoritmos y Estructuras de Datos - 2011 </h1>
       
        <div class="navbar clearfix">
                        <div class="breadcrumb"><h2 class="accesshide " >Usted está aquí</h2> <ul>
<li class="first"><a  onclick="this.target='_top'" href="https://catedras.linti.unlp.edu.ar/">Cátedras</a></li><li> <span class="accesshide " >/&nbsp;</span><span class="arrow sep">&#x25BA;</span> <a  onclick="this.target='_top'" href="https://catedras.linti.unlp.edu.ar/course/view.php?id=169">AyED-2011</a></li><li> <span class="accesshide " >/&nbsp;</span><span class="arrow sep">&#x25BA;</span> <a  onclick="this.target='_top'" href="https://catedras.linti.unlp.edu.ar/mod/resource/index.php?id=169">Recursos</a></li><li> <span class="accesshide " >/&nbsp;</span><span class="arrow sep">&#x25BA;</span> Librerias</li></ul></div>
            <div class="navbutton">&nbsp;</div>
             <div class="headermenu"><div class="navigation">
<ul><li><form action="https://catedras.linti.unlp.edu.ar/mod/resource/view.php"  onclick="this.target='_top';"><fieldset class="invisiblefieldset"><input type="hidden" name="id" value="6299" /><button type="submit" title="Actividad anterior"><span class="arrow ">&#x25C4;</span><span class="accesshide " >&nbsp;Actividad anterior</span></button></fieldset></form></li><li><form action="https://catedras.linti.unlp.edu.ar/course/jumpto.php" method="get"  id="navmenupopup" class="popupform"><div><select id="navmenupopup_jump" name="jump" onchange="self.location=document.getElementById('navmenupopup').jump.options[document.getElementById('navmenupopup').jump.selectedIndex].value;">
   <option value="https://catedras.linti.unlp.edu.ar/mod/forum/view.php?id=6185" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/forum/icon.gif);">Novedades</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/forum/view.php?id=6362" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/forum/icon.gif);">Consultas sobre temas teóricos y/o prácticos</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/forum/view.php?id=6363" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/forum/icon.gif);">Consultas Administrativas</option>
   <optgroup label=" 
Cursada 2011 - Horarios
 
  
    
      Teo...">   <option value="https://catedras.linti.unlp.edu.ar/mod/choice/view.php?id=6187" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/choice/icon.gif);">Teoría de Alg y ED</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/choice/view.php?id=6193" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/choice/icon.gif);"> Teoria de JAVA</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/choice/view.php?id=6194" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/choice/icon.gif);">Práctica</option>
   </optgroup>   <optgroup label=" Teorías de Algoritmos y Estructuras de Datos ...">   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6290" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Análisis de algoritmos</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6346" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Árboles Binarios y Generales</option>
   </optgroup>   <optgroup label=" Teorías de JAVA ">   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6284" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Conceptos de POO y Plataforma Java</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6309" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Mi primera clase en JAVA (actualizada) </option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6308" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Definición de clases e instanciación de objetos</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6310" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Lista de enteros con JAVA (actualizada)</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6338" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Herencia y clases abstractas. </option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6372" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Constructores</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6373" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Paquetes y especificadores de acceso</option>
   </optgroup>   <optgroup label=" Trabajos Prácticos ">   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6299" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Trabajo Práctico Nro. 1 - Análisis de algoritmos</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6357" selected="selected" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Ir a...</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6303" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Trabajo Practico Nro. 1 - explicación</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6341" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Trabajo Práctico Nro. 1 2da explicación</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6300" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Tutorial de JDK y Eclipse</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6383" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Practica1.zip</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6342" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Trabajo Práctico Nro. 2 - Encapsulamiento y Abstracción</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6343" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">Trabajo Practico Nro. 2 - explicación</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6344" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">JUnits para el TP2</option>
   <option value="https://catedras.linti.unlp.edu.ar/mod/resource/view.php?id=6345" style="background-image: url(https://catedras.linti.unlp.edu.ar/pix/smartpix.php/linti/mod/resource/icon.gif);">EditDistance.java</option>
    </optgroup></select><input type="hidden" name="sesskey" value="b5zhzrt9CX" /><div id="noscriptnavmenupopup" style="display: inline;"><input type="submit" value="Ir" /></div><script type="text/javascript">
//<![CDATA[
document.getElementById("noscriptnavmenupopup").style.display = "none";
//]]>
</script></div></form></li><li><form action="https://catedras.linti.unlp.edu.ar/mod/resource/view.php"   onclick="this.target='_top';"><fieldset class="invisiblefieldset"><input type="hidden" name="id" value="6303" /><button type="submit" title="Actividad siguiente"><span class="accesshide " >Actividad siguiente&nbsp;</span><span class="arrow ">&#x25BA;</span></button></fieldset></form></li></ul>
</div></div>
                    </div>
         
    </div></div></div>
<div id="header-bb" class="bb"><div>&nbsp;</div></div>
</div>    <!-- END OF HEADER -->
<div id="content" class="wrap wraplevel1 ">
<div id="content-bt" class="bt"><div>&nbsp;</div></div>
<div id="content-i1" class="i1"><div id="content-i2" class="i2"><div id="content-i3" class="i3"><div class="resourcepdf">Para abrir este documento, haga clic en este enlace:<a href="https://catedras.linti.unlp.edu.ar/file.php/169/Trabajos_Practicos/librerias.zip">Librerias</a></div><div class="box generalbox generalboxcontent boxaligncenter"><p> </p></div><img class="spacer" height="20" width="20" src="https://catedras.linti.unlp.edu.ar/pix/spacer.gif" alt="" /><br />
</div></div></div>
<div id="content-bb" class="bb"><div>&nbsp;</div></div>
</div><!-- end container Content -->
<!-- START OF FOOTER -->
<div id="footer" class="wrap wraplevel1 ">
<div id="footer-bt" class="bt"><div>&nbsp;</div></div>
<div id="footer-i1" class="i1"><div id="footer-i2" class="i2"><div id="footer-i3" class="i3"><p class="direccion"><div class="footer_title"></div>UNLP|Facultad de Informática|LINTI|Catedras</p><p class="helplink"></p><div class="homelink"><a  href="https://catedras.linti.unlp.edu.ar/course/view.php?id=169">AyED-2011</a></div></div></div></div>
<div id="footer-bb" class="bb"><div>&nbsp;</div></div>
</div></div> <!-- end page div -->
<div class="internea"></div>
<script type="text/javascript">
/* <![CDATA[ */
    script.init();
/* ]]> */
</script>
</body>
</html>
