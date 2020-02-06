$(function() {
	var currentUser = JSON.parse(sessionStorage.getItem("currentUser"));
	console.log(currentUser);
	/*
	 * 登录状态
	 * */
	console.log(currentUser);
	if(currentUser != null) {
		var useraccount = currentUser.useraccount;
		if(useraccount != null) {
			$("#useraccount").text(useraccount);
		}
	} else {
		if(confirm("您还没有登录，是否前往登录？")) {
			location.href = "login.html";
		} else {
			location.href = "index.html";
		}
	}
});