<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="slider_bg">
    <div class="wrap">
        <div class="slider">
            <div class="slider-wrapper theme-default">
                <div id="slider" class="nivoSlider">
                    <img src="${pageContext.request.contextPath}/images/slider/banner1.jpg" data-thumb="" alt="" />
                    <img src="${pageContext.request.contextPath}/images/slider/banner2.jpg" data-thumb="" alt="" />
                    <img src="${pageContext.request.contextPath}/images/slider/banner3.jpg" data-thumb="" alt="" />
                </div>
            </div>
        </div>
        <div class="grids_1_of_3">
            <div class="grid_1_of_3 images_1_of_3">
                  <img src="${pageContext.request.contextPath}/images/icon1.jpg">
                  <h3>Lorem Ipsum is simply</h3>
                  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore pariatur.</p>
            </div>
            <div class="grid_1_of_3 images_1_of_3">
                  <img src="${pageContext.request.contextPath}/images/icon2.jpg">
                  <h3>Lorem Ipsum is simply</h3>
                  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore pariatur.</p>
            </div>
            <div class="grid_1_of_3 images_1_of_3">
                  <img src="${pageContext.request.contextPath}/images/icon3.jpg">
                  <h3>Lorem Ipsum is simply</h3>
                  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore pariatur.</p>
            </div>
            <div class="clear"></div>
        </div>
    </div>
</div>

<div class="main_bg">
    <div class="wrap">
        <div class="main">
            <div class="content">
                <h2>what our customer says</h2>
                <h3>Lorem ipsum dolor sit amet, consectetur adipisicing</h3>
                <p><a href="#"><img src="${pageContext.request.contextPath}/images/pic1.jpg"></a> Cadipisicing elit,Nam ornare vulputate risus,id volutpat elit porttitor non.In consequat nisi vel lectus dapibus sodales.Nam ornare vulputate risus, id volutpat elit porttitor non. In consequat nisi vel lectus dapibus sodales.Nam ornare vulputate risus, id volutpat elit porttitor non. In consequat nisi vel lectus dapibus sodales.Nam ornare vulputate risus, id volutpat elit porttitor non. In consequat nisi vel lectus dapibus sodales. Pellentesque habitant morbi tristique senectus Nam ornare vulputate risus, id volutpat elit porttitor non. In consequat nisi vel lectus dapibus sodales. PellentesqueNam ornare vulputate risus, id volutpat elit porttitor non. In consequat nisi vel lectus dapibus sodales. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas Pellentesque habitant morbi tristique senectus et netus et malesuada fames. sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.Nam ornare vulputate risus,id volutpat elit porttitor non. In consequat nisi vel lectus dapibus sodales.Nam ornare vulputate risus, id volutpat elit porttitor non.</p>
                <div class="clear"></div>
            </div>
        </div>
    </div>
    <div class="main_btm">
        <div class="wrap">
            <div class="main">
                <div class="gallery">
                    <h3>Our latest projects</h3>
                    <ul>
                        <li><a href="${pageContext.request.contextPath}/images/gallery1.jpg"><img src="${pageContext.request.contextPath}/images/gallery1.jpg" alt=""></a><a href="#"></a></li>
                        <li><a href="${pageContext.request.contextPath}/images/gallery2.jpg"><img src="${pageContext.request.contextPath}/images/gallery2.jpg" alt=""></a><a href="#"></a></li>
                        <li><a href="${pageContext.request.contextPath}/images/gallery3.jpg"><img src="${pageContext.request.contextPath}/images/gallery3.jpg" alt=""></a><a href="#"></a></li>
                        <li><a href="${pageContext.request.contextPath}/images/gallery4.jpg"><img src="${pageContext.request.contextPath}/images/gallery4.jpg" alt=""></a><a href="#"></a></li>
                        <li><a href="${pageContext.request.contextPath}/images/gallery4.jpg"><img src="${pageContext.request.contextPath}/images/gallery4.jpg" alt=""></a><a href="#"></a></li>
                        <li><a href="${pageContext.request.contextPath}/images/gallery3.jpg"><img src="${pageContext.request.contextPath}/images/gallery3.jpg" alt=""></a><a href="#"></a></li>
                        <li><a href="${pageContext.request.contextPath}/images/gallery5.jpg"><img src="${pageContext.request.contextPath}/images/gallery5.jpg" alt=""></a><a href="#"></a></li>
                        <li><a href="${pageContext.request.contextPath}/images/gallery6.jpg"><img src="${pageContext.request.contextPath}/images/gallery6.jpg" alt=""></a><a href="#"></a></li>
                    </ul>
                </div>
                <script type="text/javascript" src="${pageContext.request.contextPath}/images/jquery.lightbox.js"></script>
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/images/lightbox.css" media="screen">
                <script type="text/javascript">
                    $(function () {
                        $('.gallery a').lightBox();
                    });
                </script>
                <div class="terminals">
                    <h3>Testimonials</h3>
                    <p>sed tempor ipsum dolor sit amet,Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt aliqua. Ut enim ad minim veniam,consectetur adipisicing elit,sed do eiusmod tempor incididunt magna aliqua. </p>
                    <p>sed tempor Ipsum dolor sit amet,Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt aliqua. Ut enim ad minim veniam,consectetur adipisicing elit,sed do eiusmod tempor incididunt magna aliqua. </p>
                    <span><a href="#">- Lorem ipsum</a> USA.</span>
                </div>
                <div class="clear"> </div>
            </div>
        </div>
    </div>
</div>
