<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <link rel="stylesheet" href="styles.css" type="text/css">
    <title>Docente: iniciar seisón</title>
</head>
<body style="height:auto;">
    <form action="" class="card container-md">
        <div class="cbody">
            <p class="titles" style="text-align:center;">Iniciar sesión </p> 
            <p class="titles">Correo Institucional</p>
            <input type="text" class="form-control">
            <p class="titles">Contraseña</p>
            <input type="text" class="form-control">
  
            <label for="validationDefault04" class="form-label"></label>
            <p class="">Iniciar sesión como</p>
            <select class="form-select" id="validationDefault04" required>
                <option hidden selected>Selecciona una opción</option>
              <option>Docente</option>
              <option>Estudiante</option>
            </select>
        </div>
        <br>
        <div class="row row-cols-12 cfoot">
            <button class="btn" type="submit">Iniciar sesión</button>

            <a href="#" style="font-size:.8em;">Registrarse</a>
            <div class=" col-8">
                <img src="/img/Datic.png" class="logosI" style="margin-top: .5em;" alt="">
            </div>
            <div class="col-4 " style="text-align:right;">
                <img src="/img/Logo-utez.png" class="logosI" style="height:auto;" alt="">
            </div>
    
        </div></form>



</body>
</html>