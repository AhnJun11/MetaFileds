/**
 * 
 */

function login(){
	if($("#user_id").val() == "admin"){
		if($("#user_password").val() == "admin"){
			location.href="/member/memberManagement";
		}	
	}
	;
	
}

