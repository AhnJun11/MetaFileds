function ticketSelect(ticketId){
	//이용권 상품 들록
	if(ticketId == "passTicket"){
		$('#ticketName').html("이용권명");
		$('#ticketDescription').html("이용권 설명");	
	}
	//레슨권 상품 등록
	else if(ticketId == "lessonTicket"){
		$('#ticketName').html("레슨권명");
		$('#ticketDescription').html("레슨권 설명");	
	}
}
$(document).ready(function(){
});