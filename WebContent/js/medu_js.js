var Medu = {

	Action : "ui.action.UITestAction",
	Form:"ui.form.PersonForm",
	
	testcallback : function(result) {
		var str = "";
		for(var i=0;i<result.length;i++){
			str +=result[i].name;
			str +=" : ";
			str +=result[i].age;
			str +=result[i].girlfriends;
			str +=" || ";
		}
		alert(str);
	},

	sendAjaxRequest : function() {
		var kw = {
			name : "陈冠西",
			age : "40",
			girlfriends:["阿娇","张柏芝"]
		};
		
		var data = Util.preparePostData(this.Action,this.Form,kw);
		Util.ajaxPost(data, this.testcallback);
	}
};