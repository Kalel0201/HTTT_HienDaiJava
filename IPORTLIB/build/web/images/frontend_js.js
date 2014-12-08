
$(function () {
    $(".cssmenu ul li").click(function () {
        $.each($(".cssmenu ul li"), function (key, value) {
            if ($(this).hasClass("active")) {
            	$(this).removeClass("active");
            }
        });
        $(this).addClass("active");
    });
});