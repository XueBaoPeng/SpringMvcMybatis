
function login() {
    var userName=$("#userName").val();
    var password=$("#password").val();
    var roleName=$("#roleName").val();
    if (userName==null|| userName==""){
        alert("用户名不能为空");
        return;
    }

    if (password==null|| password==""){
        alert("密码不能为空！");
        return;
    }
    $.ajax({
        type:"POST",
        dataType:"json",
        url: "/users/cookie",
        data: $('#adminlogin').serialize(),
        success: function (result) {
            if (result.resultCode == 200) {
                $.cookie('userName',result.data.currentUser.userName);
                $.cookie('roleName',result.data.currentUser.roleName);
                var Days = 30;
                var exp = new Date();
                exp.setTime(exp.getTime() + Days * 24 * 60 * 60 * 1000);
                $.cookie('expires', exp.toGMTString());
                window.location.href = "/views/main.html";
            };

        },
        error: function () {
            alert("异常！");
        }
    });

}