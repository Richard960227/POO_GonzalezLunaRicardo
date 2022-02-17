//tarea problema 1

function problema1(){

    var palabra = document.querySelector('#p1-input').value;

    var palabrainvertida = palabra.split('').reverse().join('');

    document.querySelector('#p1-output').textContent = palabrainvertida.replace(/ /g, '');

}

//problema 2

    /*
     para encontrar el minimo producto escalar entre los vectores tenemos que realizar
    las operaciones correspondientes con el maximo valor de un vector por el minimo
      valor del otro vector, con esto encontraremos el minimo producto escalar
     */

function problema2(){

    var p2_x1 = document.querySelector('#p2-x1').value;
    var p2_x2 = document.querySelector('#p2-x2').value;
    var p2_x3 = document.querySelector('#p2-x3').value;
    var p2_x4 = document.querySelector('#p2-x4').value;
    var p2_x5 = document.querySelector('#p2-x5').value;

    var p2_y1 = document.querySelector('#p2-y1').value;
    var p2_y2 = document.querySelector('#p2-y2').value;
    var p2_y3 = document.querySelector('#p2-y3').value;
    var p2_y4 = document.querySelector('#p2-y4').value;
    var p2_y5 = document.querySelector('#p2-y5').value;

    // construir el vector

    var v1 = [p2_x1, p2_x2, p2_x3, p2_x4, p2_x5];
    var v2 = [p2_y1, p2_y2, p2_y3, p2_y4, p2_y5];

    v1 = v1.sort(function(a, b) {
        return b-a;
    });

    v2 = v2.sort(function(a, b) {
        return b-a;
    });

    v2 = v2.reverse();

    var p2_product = 0;

    for(var i = 0; i < v1.length; i++){
        p2_product += v1[i]*v2[i];
    }

    document.querySelector('#p2-output').textContent = 'Producto Escalar Minimo ' + p2_product;
}

//tarea problema 3

function problema3(){

    var checkOk = "ABCDEFGHIJKLMNOPQRSTUVW" + "abcdefghijklmnopqrstuvwxyz";
    var checkStr = document.querySelector('#p3-input').value;
    var allvalid = true;
    
    for(var i=0; i<checkStr.length; i++){
        var ch = checkStr.charAt(i);

        for(var j=0; j<checkOk.length; j++){
            if(ch == checkOk.charAt(j))
                break;
        }
            if(j == checkOk.length){
                allvalid = false;
                break;
            }
    }
    if(!allvalid){
        alert("Escribe solo letras en el campo Nombre");
        return (false);
    }

    var palabrasdivididas = checkStr.split('');

    document.querySelector('#p3-output').textContent = palabrasdivididas.length();
}


    