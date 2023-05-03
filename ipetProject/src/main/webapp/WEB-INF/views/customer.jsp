<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Landing Page - Start Bootstrap Theme</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
    <!-- Bootstrap icons-->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
      rel="stylesheet"
      type="text/css"
    />
    <!-- Google fonts-->
    <link
      href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic"
      rel="stylesheet"
      type="text/css"
    />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="resources/css/styles.css" rel="stylesheet" />
  </head>
  <script src="https://code.jquery.com/jquery-3.6.3.js"></script>
  <script>
    $(document).ready(function () {
      
    });
  </script>
  <body>
    <header class="masthead">
      <div class="container position-relative">
        <div class="row justify-content-center">
          <div class="col-xl-6">
            <div class="text-center text-white">
              <h1 class="mb-5">사용자 정보입력</h1>

              <div class="row">
                <form action="">
                  <div class="col">
                    <label for="name">이름</label>
                    <input
                      type="text"
                      name="name"
                      id="name"
                      class="form-control form-control-lg"
                    />
                    <br />
                    <label for="age">나이</label>
                    <input
                      type="text"
                      name="age"
                      id="age"
                      class="form-control form-control-lg"
                    />
                    <br />
                    <label for="email">이메일</label>
                    <input
                      type="email"
                      name="email"
                      id="email"
                      class="form-control form-control-lg"
                      placeholder="example@example.com"
                    />
                    <br />


                    <div
                      class="invalid-feedback text-white"
                      data-sb-feedback="emailAddress:required"
                    >
                      Email Address is required.
                    </div>
                    <div
                      class="invalid-feedback text-white"
                      data-sb-feedback="emailAddress:email"
                    >
                      Email Address Email is not valid.
                    </div>
                  </div>
                  <button class="btn btn-primary btn-lg" id="sub" type="submit">
                    Submit
                  </button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </header>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Core theme JS-->
    <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
    <!-- * *                               SB Forms JS                               * *-->
    <!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->
    <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
  </body>
</html>
