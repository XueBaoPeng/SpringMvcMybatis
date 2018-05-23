
function isNull(string) {
    return typeof (string) === "undefined" || string == null;
}

function checkCookie() {
    if (isNull($.cookie('userName')) || isNull($.cookie('roleName'))) {
        alert("未登录!");
        window.location.href = "/html/login.html";
    }
}