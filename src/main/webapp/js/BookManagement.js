function addbookinfo() {
    var form = new FormData($("#bookinfo")[0]);
    $.ajax({
        url: "/addbookinfo",
        type: 'POST',
        data: form,
        processData : false,  //必须false才会避开jQuery对 formdata 的默认处理
        contentType : false,  //必须false才会自动加上正确的Content-Type
        async: true,
        success: function (data) {
            if(data==true){
                alert("添加成功")
                window.location.reload()
            }else {
                alert("添加失败")
            }
        }
    });
}

function deletebookinfo(BID) {
    $.ajax({
        url: "/deletebookinfo?BID="+BID,
        type: 'POST',
        async: true,
        success: function (data) {
            if(data==true){
                alert("删除成功")
                window.location.reload()
            }else {
                alert("删除失败")
            }
        }
    });
}