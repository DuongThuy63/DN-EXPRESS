<%-- 
    Document   : Manage_Staff
    Created on : 23-Jun-2024, 14:25:23
    Author     : DuongPhan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Boxicons -->
    <link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
        integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
    <!-- My CSS -->
    <link rel="stylesheet" href="Manage_Staff.css">
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
            <main class="table"  id="mainContent" >
                    

                <section class="table__body" id="driverTable">
                    <table>
                        <header>
                            <div class="filterEntries">
                                <div class="addMemberBtn">
                                    <button>New Staff</button>
                                </div>

                                <div class="filter">
                                    <label for="search" style="color: #083c3e;"><strong>Search:</strong></label>
                                    <input type="search" name="" id="search" placeholder="Enter here">

                                    <select class="filter">
                                        <option value="" disabled selected>Search type</option>
                                        <option value="byId">By Id</option>
                                        <option value="byName">By Name</option>
                                        <option value="byId">By Post Office</option>
                                    </select>

                                </div>

                            </div>

                        </header>
                        <thead>

                            <tr>
                                <th> STT <span class="icon-arrow"></span></th>
                                <th> Driver Name <span class="icon-arrow"></span></th>
                                <th> Driver ID <span class="icon-arrow"></span></th>
                                <th> Service <span class="icon-arrow"></span></th>
                                <th> Status <span class="icon-arrow"></span></th>
                                <th> Action <span class="icon-arrow"></span></th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- <tr><td class="empty" colspan="11" align="center">No data available in table</td></tr> -->
                             
                            <c:forEach var="driver" items="${dList}" varStatus="loop">
                                <tr>
                                    <td>${loop.index + 1}</td>
                                    <td>${driver.account.getFistName()} ${driver.account.getLastName()}</td>
                                    <td>${driver.account.getAccount_id()}</td>
                                    <td>${driver.account.getEmail()}</td>
                                    <td>${driver.isStatus() ? "Active" : "Inactive"}</td>
                                   <td>
                                        <button class="action-btn view-btn"   data-id="${driver.account.getAccount_id()}"><i class="fa-regular fa-eye"></i></button>
                                        <button class="action-btn edit-btn"><i class="fa-regular fa-pen-to-square"></i></button>
                                        <button class="action-btn delete-btn"><i class="fa-regular fa-trash-can"></i></button>
                                    </td>
                                </tr>
                            </c:forEach>
                            

                        </tbody>
                    </table>
                </section>
                    <section class="table__body" id="staffTable" style="display:none;" >
                    <table>
                        <header>
                            <div class="filterEntries">
                                <div class="addMemberBtn">
                                    <button>New Staff</button>
                                </div>

                                <div class="filter">
                                    <label for="search" style="color: #083c3e;"><strong>Search:</strong></label>
                                    <input type="search" name="" id="search" placeholder="Enter here">

                                    <select class="filter">
                                        <option value="" disabled selected>Search type</option>
                                        <option value="byId">By Id</option>
                                        <option value="byName">By Name</option>
                                        <option value="byId">By Post Office</option>
                                    </select>

                                </div>

                            </div>

                        </header>
                        <thead>

                            <tr>
                                <th> STT <span class="icon-arrow"></span></th>
                                <th> Staff Name <span class="icon-arrow"></span></th>
                                <th> Staff ID <span class="icon-arrow"></span></th>
                                <th> Post_Office <span class="icon-arrow"></span></th>
                                <th> Status <span class="icon-arrow"></span></th>
                                <th> Action <span class="icon-arrow"></span></th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- <tr><td class="empty" colspan="11" align="center">No data available in table</td></tr> -->
                             
                            <c:forEach var="staff" items="${sList}" varStatus="loop">
                                <tr>
                                    <td>${loop.index + 1}</td>
                                    <td>${staff.account.getFistName()} ${staff.account.getLastName()}</td>
                                    <td>${staff.account.getAccount_id()}</td>
                                    <td>${staff.account.getEmail()}</td>
                                    <td>${staff.post_office.post_office_id}</td>
                                    <td>
                                       <button class="action-btn view-btn"><i class="fa-regular fa-eye"></i></button>
                                       <button class="action-btn edit-btn"><i class="fa-regular fa-pen-to-square"></i></button>
                                       <button class="action-btn delete-btn"><i class="fa-regular fa-trash-can"></i></button>

                                    </td>
                                </tr>
                            </c:forEach>
                            

                        </tbody>
                    </table>
                </section>
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

    <!--Popup Form-->

    <div class="dark_bg">

        <div class="popup">
            <header>
                <h2 class="modalTitle">Fill the Form</h2>
                <button class="closeBtn">&times;</button>
            </header>

            <div class="body">
                <form action="#" id="myForm">
                    <div class="imgholder">
                        <label for="uploadimg" class="upload">
                            <input type="file" name="" id="uploadimg" class="picture">
                            <i class="fa-solid fa-plus"></i>
                        </label>
                        <img src="./img/pic1.png" alt="" width="150" height="150" class="img">
                    </div>

                    <div class="inputFieldContainer">

                        <div class="nameField">
                            <div class="form_control">
                                <label for="fName">First Name:</label>
                                <input type="text" name="" id="fName" required>
                            </div>

                            <div class="form_control">
                                <label for="lName">Last Name:</label>
                                <input type="text" name="" id="lName" required>
                            </div>
                        </div>

                        <div class="identify">
                            <div class="form_control">
                                <label for="cid">Citizen identity:</label>
                                <input type="text" name="" id="cid" required>
                            </div>

                            <div class="form_control">
                                <label for="gender">Gender:</label>
                                <input type="text" name="" id="gender" required>
                            </div>
                        </div>

                        <div class="location">
                            <div class="form_control">
                                <label for="post_office">Post office:</label>
                                <input type="text" name="" id="position" required>
                            </div>

                            <div class="form_control">
                                <label for="city">City:</label>
                                <input type="text" name="" id="city" required>
                            </div>
                        </div>

                        <div class="form_control">
                            <label for="dob">Date of birth:</label>
                            <input type="date" name="" id="dob" required>
                        </div>

                        <div class="form_control">
                            <label for="email">Email:</label>
                            <input type="email" name="" id="email" required>
                        </div>

                        <div class="form_control">
                            <label for="phone">Phone:</label>
                            <input type="number" name="" id="phone" required>
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



    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    <script src="Manage_Staff.js"></script>
    <script>document.addEventListener('DOMContentLoaded', function () {
    const showDriver = document.getElementById('showDriver');
    const showStaff = document.getElementById('showStaff');
    const driverTable = document.getElementById('driverTable');
    const staffTable = document.getElementById('staffTable');

    showDriver.addEventListener('click', function () {
        driverTable.style.display = 'block';
        staffTable.style.display = 'none';
    });

    showStaff.addEventListener('click', function () {
        staffTable.style.display = 'block';
        driverTable.style.display = 'none';
    });
});
</script>

<script>
    $(document).ready(function() {
        $('.view-btn').click(function() {
            var accountId = $(this).data('account-id');
            $.ajax({
                type: 'GET',
                url: 'Manager_getDriverDetails_Servlet',
                data: { accountId: accountId },
                success: function(data) {
                    // Xử lý dữ liệu nhận được từ Servlet
                    console.log(data); // Hiển thị dữ liệu trong console để kiểm tra
                    // Sau khi xử lý, bạn có thể hiển thị dữ liệu trong modal, popover, hoặc một vùng khác trên giao diện
                },
                error: function() {
                    alert('Error fetching driver details');
                }
            });
        });
    });
</script>
<script>
<script>
    // Đoạn mã JavaScript để xử lý sự kiện click vào nút "view-btn"
    document.querySelectorAll('.view-btn').forEach(button => {
        button.addEventListener('click', function() {
            // Lấy accountId từ thuộc tính data-id của nút
            var accountId = this.getAttribute('data-id');
            
            // Gửi yêu cầu AJAX tới Servlet để lấy thông tin Driver
            var xhr = new XMLHttpRequest();
            xhr.open('GET', 'getDriverDetails?accountId=' + encodeURIComponent(accountId), true);
            xhr.onload = function() {
                if (xhr.status >= 200 && xhr.status < 400) {
                    // Xử lý phản hồi từ Servlet
                    var data = JSON.parse(xhr.responseText);
                    // Hiển thị thông tin Driver lấy được vào pop-up hoặc bất kỳ thành phần nào trên trang của bạn
                    console.log(data); // Để debug, bạn có thể thay đổi cách hiển thị dữ liệu ở đây
                } else {
                    console.error('Failed to fetch data: ' + xhr.status);
                }
            };
            xhr.onerror = function() {
                console.error('Request failed');
            };
            xhr.send();
        });
    });
</script>
<script>
document.addEventListener('DOMContentLoaded', function() {
    var viewBtns = document.querySelectorAll('.view-btn');
    var overlay = document.getElementById('overlay');
    var popup = document.querySelector('.popup');

    viewBtns.forEach(function(btn) {
        btn.addEventListener('click', function() {
            // Lấy accountId từ thuộc tính data-id của nút
            var accountId = btn.getAttribute('data-id');

            // Gửi yêu cầu lấy thông tin driver bằng AJAX
            var xhr = new XMLHttpRequest();
            xhr.onreadystatechange = function() {
                if (xhr.readyState === XMLHttpRequest.DONE) {
                    if (xhr.status === 200) {
                        var driver = JSON.parse(xhr.responseText);

                        // Hiển thị thông tin driver lên popup
                        document.getElementById('fName').value = driver.firstName;
                        document.getElementById('lName').value = driver.lastName;
                        document.getElementById('cid').value = driver.cccdNumber;
                        document.getElementById('gender').value = driver.gender;
                        document.getElementById('position').value = driver.postOffice;
                        document.getElementById('city').value = driver.city;
                        document.getElementById('dob').value = driver.dob;
                        document.getElementById('email').value = driver.email;
                        document.getElementById('phone').value = driver.phone;

                        // Mở popup và overlay
                        overlay.style.display = 'block';
                        popup.style.display = 'block';
                    } else {
                        console.error('Failed to fetch driver information.');
                    }
                }
            };

            xhr.open('GET', '/getDriverDetails?accountId=' + accountId);
            xhr.send();
        });
    });

    // Đóng popup khi nhấn vào nút closeBtn hoặc overlay
    document.querySelector('.closeBtn').addEventListener('click', function() {
        overlay.style.display = 'none';
        popup.style.display = 'none';
    });

    overlay.addEventListener('click', function() {
        overlay.style.display = 'none';
        popup.style.display = 'none';
    });
});
</script>

    </body>
</html>
