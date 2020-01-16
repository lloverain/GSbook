function deletebookzl(CID) {
    $.ajax({
        url: "/deletebookzl?CID="+CID,
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

function baocun() {
    var booktitle = $("#bookzl").val()
    $.ajax({
        url: "/addbookzl?bookname="+booktitle,
        type: 'POST',
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

