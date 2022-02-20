var btnAbrirPopup0 = document.getElementById('btn-abrir-popuppersonal'),
	overlay0 = document.getElementById('overlaypersonal'),
	popup0 = document.getElementById('popuppersonal'),
	btnCerrarPopup0 = document.getElementById('btn-cerrar-popuppersonal');

btnAbrirPopup0.addEventListener('click', function(){
	overlay0.classList.add('active');
	popup0.classList.add('active');
	
});

btnCerrarPopup0.addEventListener('click', function(e){
	e.preventDefault();
	overlay0.classList.remove('active');
	popup0.classList.remove('active');
});

var btnAbrirPopup = document.getElementById('btn-abrir-popupformation'),
	overlay = document.getElementById('overlayformation'),
	popup = document.getElementById('popupformation'),
	btnCerrarPopup = document.getElementById('btn-cerrar-popupformation');

btnAbrirPopup.addEventListener('click', function(){
	overlay.classList.add('active');
	popup.classList.add('active');
});

btnCerrarPopup.addEventListener('click', function(e){
	e.preventDefault();
	overlay.classList.remove('active');
	popup.classList.remove('active');
});

var btnAbrirPopup1 = document.getElementById('btn-abrir-popupexperience'),
	overlay1 = document.getElementById('overlayexperience'),
	popup1 = document.getElementById('popupexperience'),
	btnCerrarPopup1 = document.getElementById('btn-cerrar-popupexperience');

btnAbrirPopup1.addEventListener('click', function(){
	overlay1.classList.add('active');
	popup1.classList.add('active');
});

btnCerrarPopup1.addEventListener('click', function(e){
	e.preventDefault();
	overlay1.classList.remove('active');
	popup1.classList.remove('active');
});

var btnAbrirPopup2 = document.getElementById('btn-abrir-popupcourses'),
	overlay2 = document.getElementById('overlaycourses'),
	popup2 = document.getElementById('popupcourses'),
	btnCerrarPopup2 = document.getElementById('btn-cerrar-popupcourses');

btnAbrirPopup2.addEventListener('click', function(){
	overlay2.classList.add('active');
	popup2.classList.add('active');
});

btnCerrarPopup2.addEventListener('click', function(e){
	e.preventDefault();
	overlay2.classList.remove('active');
	popup2.classList.remove('active');
});

var btnAbrirPopup3 = document.getElementById('btn-abrir-popupcompe'),
	overlay3 = document.getElementById('overlaycompe'),
	popup3 = document.getElementById('popupcompe'),
	btnCerrarPopup3 = document.getElementById('btn-cerrar-popupcompe');

btnAbrirPopup3.addEventListener('click', function(){
	overlay3.classList.add('active');
	popup3.classList.add('active');
});

btnCerrarPopup3.addEventListener('click', function(e){
	e.preventDefault();
	overlay3.classList.remove('active');
	popup3.classList.remove('active');
});

var btnAbrirPopup4 = document.getElementById('btn-abrir-popupskills'),
	overlay4 = document.getElementById('overlayskills'),
	popup4 = document.getElementById('popupskills'),
	btnCerrarPopup4 = document.getElementById('btn-cerrar-popupskills');

btnAbrirPopup4.addEventListener('click', function(){
	overlay4.classList.add('active');
	popup4.classList.add('active');
});

btnCerrarPopup4.addEventListener('click', function(e){
	e.preventDefault();
	overlay4.classList.remove('active');
	popup4.classList.remove('active');
});