
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Boxicons -->
    <link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
        integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
    <!-- My CSS -->
    <link rel="stylesheet" href="Manage_Staff_3.css">
    <link rel="stylesheet" type="text/css" href="footer.css">

    <title>DN EXPRESS</title>
</head>

<body>

    <section class="confiq">
        <!-- SIDEBAR -->
        <section id="sidebar">
            <a href="#" class="brand">
                <i class='bx bxs-package'></i>
                <span class="text">DN Express</span>
                <!-- <img src="img/logopage1.png"> -->

            </a>
            <ul class="side-menu top">
                <li class="active">
                    <a href="#">
                        <i class='bx bxs-package'></i>
                        <span class="text">Track Package</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class='bx bxs-truck'></i>
                        <span class="text">Track Driver</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class='bx bxs-doughnut-chart'></i>
                        <span class="text">Manage Post Office</span>
                    </a>
                </li>
                <li>
                    <a href="#" id="showDriver">
                        <i class='bx bxs-doughnut-chart'></i>
                        <span class="text">Driver</span>
                    </a>
 
                </li>
            <c:forEach var="dr_type" items="${drType}">
                <li>               
                    <ul>
                            <li><a href="listStaff?dtId=${dr_type.driv_type_id}">${dr_type.driv_type_value}</a></li>
                    </ul>
                     </li>
            </c:forEach>

                    
               <li>
                    <a href="#"  id="showStaff" >
                        <i class='bx bxs-doughnut-chart'></i>
                        <span class="text">Staff Nội bộ</span>
                    </a>
                </li>
                
                <li>
                    <a href="#">
                        <i class='bx bxs-message-dots'></i>
                        <span class="text">Message</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class='bx bxs-group'></i>
                        <span class="text">Team</span>
                    </a>
                </li>
            </ul>
            <ul class="side-menu" style="position: absolute; bottom: 0;">
                <li>
                    <a href="#">
                        <i class='bx bxs-cog'></i>
                        <span class="text">Settings</span>
                    </a>
                </li>
                <li>
                    <a href="#" class="logout">
                        <i class='bx bxs-log-out-circle'></i>
                        <span class="text">Logout</span>
                    </a>
                </li>
            </ul>
        </section>
        <!-- SIDEBAR -->



        <!-- CONTENT -->
        <section id="content">
            <!-- NAVBAR -->
            <nav>
                <i class='bx bx-menu'></i>
                <a href="#" class="nav-link"><strong>Manage Staff</strong></a>
                <form action="#">
                    <div class="form-input">
                        <input type="search" placeholder="Search">
                        <button type="submit" class="search-btn"><i class='bx bx-search'></i></button>
                    </div>
                </form>


                <input type="checkbox" id="switch-mode" hidden>
                <label for="switch-mode" class="switch-mode"></label>
                <a href="#" class="notification">
                    <i class='bx bxs-bell'></i>
                    <span class="num">8</span>
                </a>
                <a href="#" class="profile">
                    <img src="img/img2.jpg">
                </a>
            </nav>
            <!-- NAVBAR -->

            <!-- MAIN -->
            <main class="table" id="customers_table">


              <!--Popup Form-->

            <div class="dark_bg active">

                <div class="popup active" >
                    <header>
                        <h2 class="modalTitle">Fill the Form</h2>
                        <button class="closeBtn">&times;</button>
                    </header>

                    <div class="body">
                        <form action="createDriver" id="myForm" method="get">
                            <div class="imgholder">
                                <label for="uploadimg" class="upload">
                                    <input type="file" name="image" id="uploadimg" class="picture">
                                    <i class="fa-solid fa-plus"></i>
                                </label>
                                <img src="./img/pic1.png" alt="" width="150" height="150" class="img">
                            </div>

                            <div class="inputFieldContainer">

                                <div class="nameField">
                            <div class="form_control">
                                <label for="fistName">First Name:</label>
                               <input  type="text" name="fistName" id="fName" required>
                            </div>
                            <div class="form_control">
                                <label for="lastName">Last Name:</label>
                                <input  type="text" name="lastName" id="lName" required>
                            </div>
                        </div>
                        <div class="identify">
                 
                            <div class="form_control">
                                <label for="gender">Gender:</label>
                                <input type="text" name="gender" id="gender" required>
                            </div>
                            <div class="form_control">
                            <label for="post_OfficeID">Post Office ID: </label>
                            <input  name="post_OfficeID" type="text" id="post_OfficeID" required>
                        </div>
                        </div>
                        <div class="location">
                            <div class="form_control">
                                <label for="license_numb">License Number:</label>
                                <input type="text" name="license_numb" id="license" required>
                            </div>
                            <div class="form_control">
                                <label for="cccd_numb">Citizen Identity:</label>
                                <input  type="text" name="cccd_numb" id="cid" required>
                            </div>
                        </div>
                        <div class="location">
                            <div class="form_control">
                                <label for="driv_type_id">Driver Type ID:</label>
                                <input  type="text" name="driv_type_id" id="driver_typeID" required>
                            </div>
                           
                        </div>
                        
                        <div class="form_control">
                            <label for="dob">Date of Birth:</label>
                            <input type="date"  name="dob" id="dob" required>
                        </div>

                        <div class="form_control">
                            <label for="email">Email:</label>
                            <input  type="email" name="email" id="email" required>
                        </div>
                        <div class="form_control">
                            <label for="phone_numb">Phone:</label>
                            <input type="number" name="phone_numb" id="phone" required>
                        </div>
                            </div>
                        </form>
                    </div>



                    <footer class="popupFooter">
                        <button form="myForm" class="submitBtn">Submit</button>
                    </footer>
                </div>
            </div>

            <div class="overlay" id="overlay"></div>

            <div class="popup_del" id="deletePopup">
                <div class="popup_del-content">
                    <h2><strong>Confirmation</strong></h2>
                    <p>Are you sure to delete?</p>
                    <button id="cancelDeleteBtn">Cancel</button>
                    <button id="confirmDeleteBtn">Delete</button>
                </div>
            </div>
     <!--Popup Form-->

            </main>
            <!-- MAIN -->
        </section>
    </section>
    <!-- CONTENT -->

    <!-- FOOTER -->
    <footer class="footer">
        <div class="waves">
            <div class="wave" id="wave1"></div>
            <div class="wave" id="wave2"></div>
            <div class="wave" id="wave3"></div>
            <div class="wave" id="wave4"></div>
        </div>
        <ul class="social-icon">
            <li class="social-icon__item"><a class="social-icon__link" href="#">
                    <ion-icon name="logo-facebook"></ion-icon>
                </a></li>
            <li class="social-icon__item"><a class="social-icon__link" href="#">
                    <ion-icon name="logo-twitter"></ion-icon>
                </a></li>
            <li class="social-icon__item"><a class="social-icon__link" href="#">
                    <ion-icon name="logo-linkedin"></ion-icon>
                </a></li>
            <li class="social-icon__item"><a class="social-icon__link" href="#">
                    <ion-icon name="logo-instagram"></ion-icon>
                </a></li>
        </ul>
        <ul class="menu">
            <li class="menu__item"><a class="menu__link" href="#">Home</a></li>
            <li class="menu__item"><a class="menu__link" href="#">About</a></li>
            <li class="menu__item"><a class="menu__link" href="#">Services</a></li>
            <li class="menu__item"><a class="menu__link" href="#">Team</a></li>
            <li class="menu__item"><a class="menu__link" href="#">Contact</a></li>

        </ul>
        <p>&copy;2024 D04 R02 | All Rights Reserved</p>
    </footer>
    <!-- FOOTER -->

    


    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    <script src="Manage_Staff.js"></script>
</body>

</html>