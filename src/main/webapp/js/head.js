function tuichu() {
    $.ajax({
        url: "/loginout",
        type: 'GET',
        async: true,
        success: function (data) {
            if(data==true){
                function clearAllCookie() {
                    var date=new Date();
                    date.setTime(date.getTime()-10000);
                    var keys= "name"
                    if (keys) {
                        for (var i =  keys.length; i--;){
                            document.cookie=keys[i]+"=0; expire="+date.toGMTString()+"; path=/";
                        }
                        window.location.href="/login"
                    }
                }
            }
        }
    });
}