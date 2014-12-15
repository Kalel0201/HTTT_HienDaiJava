<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="main_bg">
    <div class="wrap">
        <div class="main">
            <div class="content">
                <div class="row">
                    <div class="">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                List notifications
                            </div>
                            <!-- /.panel-heading -->
                            <div class="panel-body">
                                <c:forEach var="item" items="${notifications}">
                                    <div class="alert alert-danger">
                                        ${item.name}. <a href="#" data-toggle="modal" data-target="#myModal" class="alert-link pull-right">Extend</a>
                                    </div>
                                </c:forEach>
<!--                                <div class="alert alert-success">
                                    The book is over day. <a href="#" data-toggle="modal" data-target="#myModal" class="alert-link pull-right">Extend</a>
                                </div>
                                <div class="alert alert-info">
                                    The book is over day. <a href="#" data-toggle="modal" data-target="#myModal" class="alert-link pull-right">Extend</a>
                                </div>
                                <div class="alert alert-warning">
                                    The book is over day. <a href="#" data-toggle="modal" data-target="#myModal" class="alert-link pull-right">Extend</a>
                                </div>
                                <div class="alert alert-danger">
                                    The book is over day. <a href="#" data-toggle="modal" data-target="#myModal" class="alert-link pull-right">Extend</a>
                                </div>-->
                            </div>
                            <!-- .panel-body -->
                        </div>
                        <!-- /.panel -->
                    </div>
                    <!-- /.col-lg-6 -->
                </div>
                <div class="clear"></div>
            </div>
        </div>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">Extend book</h4>
            </div>
            <div class="modal-body">
                Dropdown list to choose the time extend
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal-dialog -->
</div>
<!-- /.modal -->