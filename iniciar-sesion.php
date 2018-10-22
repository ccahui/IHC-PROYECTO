<!DOCTYPE html>
<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->
<html>
  <head>
    <title>INICIAR SESIÓN | Colegio ABC</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link  rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <script src="js/jquery-3.3.1.slim.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/all.min.js"></script>
    <style>
.jumb {
  padding: 1rem 1rem;
  margin-bottom: 1rem;
}

                    @media (min-width: 576px) {
                      .jumb {
                        padding: 1rem 2rem;
                      }
                    }
                    .icono-user{
                      font-size: 30px;
                    }
    </style>
  </head>

  <body>


    <nav class="navbar navbar-expand-md navbar-dark bg-dark" >

      <a href="index.html" class="navbar-brand ml-md-3">
        <strong>Inicio</strong>
      </a>
      <a href="iniciar-session.html" class="navbar-brand ">
        <strong> Iniciar Sesión</strong>
      </a>
    </nav>
    <br>
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-md-7 col-xl-5">
          <div class="card">
            <div class="card-body">
              <div>
                <div class="row">
                  <div class="col-sm-3 text-center">
                    <i class="fas fa-user icono-user"></i>
                  </div>
                  <div class="col-sm-9">
                    <h3> Iniciar Sesión </h3>
                  </div>
                </div>
              </div>
              <br>
              <form name=form-iniciar-sesion action=iniciar-sesion.php method=post>
                <div class="form-group form-row">
                  <label class="col-sm-3 col-form-label">Usuario</label>
                  <div class="col-sm-9"> 
                    <input placeholder="Ingrese su gmail" class="form-control" type="email">
                  </div>
                </div>
                <div class="form-group form-row">
                  <label class="col-sm-3 col-form-label">Contraseña</label>
                  <div class="col-sm-9">
                    <input type="password" placeholder="Ingrese su Contraseña" class="form-control">
                  </div>
                </div>
                <div class="text-left">
                  <a href="recuperar-contrasena.html" class="btn btn-link">Ha olvidado su contrase&ntilde;a?</a>
                </div>
                <div class="text-right">
                  <input type=submit value=Ingresar class="btn btn-outline-primary">
                </div>
              </form>
            </div>
          </div>
        </div>

      </div>
    </div>
  </body>
</html>
