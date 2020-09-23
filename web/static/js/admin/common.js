
$(function () {
    //菜单栏变色
    $("nav ul li").each(function () {
        if ($(this).css("background-color")!="rgb(72, 72, 72)") {
            $(this).mouseenter(function () {
                $(this).css("background","#484848");
            })
            $(this).mouseleave(function () {
                $(this).css("background", "#282828");
            })
        }

    })

    //隐藏菜单栏
    $(".nav_hidden").click(function () {
        if ($("nav").css("display") === "block"){
            $("nav").css("display","none");
            $(".main_right").addClass("change_main");
            $(".change_main").removeClass("main_right");
            $(".nav_hidden button").text(">");
        }else{
            $("nav").css("display","block");
            $(".change_main").addClass("main_right");
            $(".main_right").removeClass("change_main");
            $(".nav_hidden button").text("<");
        }
    })



})