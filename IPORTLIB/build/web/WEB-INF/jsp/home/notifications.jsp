<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="main_bg">
    <div class="wrap">
        <div class="main">
            <div class="content">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                List notifications
                            </div>
                            <!-- /.panel-heading -->
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table class="table table-hover">
                                        <thead>
                                            <tr>
                                                <th>Title</th>
                                                <th>Publications</th>
                                                <th>Date Loan</th>
                                                <th>Date Pay</th>
                                                <th>#</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach var="item" items="${notifications}">
                                            <td>${item.name}</td>
                                            <td>${item.pubTitle}</td>
                                            <td>${item.dateLoan}</td>
                                            <td>${item.datePay}</td>
                                            <td><a href="#" ref="${item.loanDetailsID}" data-toggle="modal" data-target="#myModal" class="extend">Extend</a></td>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                                <!-- /.table-responsive -->
                            </div>
                            <!-- /.panel-body -->
                        </div>
                        <!-- /.panel -->
                    </div>
                    <!-- /.col-lg-6 -->
                </div>
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
                <h4 class="modal-title" id="myModalLabel">Extend publication</h4>
            </div>
            <div class="modal-body">
                <input type="datetime" name="extend" id="extend" />
                <input type="hidden" name="LoanDetailsID" id="LoanDetailsID" />
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" data-dismiss="modal" id="extendPost">Save changes</button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal-dialog -->
</div>
<!-- /.modal -->

<script type="text/javascript">
    $(".extend").click(function () {
        $("#LoanDetailsID").val($(this).attr("ref"));
    });
    
    $("#extendPost").click(function () {
        var _data = { LoanDetailsID: $("#LoanDetailsID").val() };
       $.ajax({
           url: '/IPORTLIB/loanDetail/extend',
           type: 'POST',
           dataType: 'json',
           data: _data
       }).success(function (data) {
           console.log('extendPost responsive');
           console.log(data);
       });
    });
</script>