<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="modal fade" id="joinModal" tabindex="-1" role="dialog" aria-labelledby="joinModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
     
     <form name="joinfrm" id="joinfrm" action="/member/join" method="post">	
      
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        	<span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="joinModalLabel">JOIN US</h4>
      </div>
      <div class="modal-body">
          <div class="form-group">
            <label for="email" class="control-label">E-Mail</label>
            <input type="text" class="form-control" id="email" name="email">
          </div>
          <div class="form-group">
            <label for="passwd" class="control-label">PASSWORD</label>
           	<input type="password" class="form-control" id="passwd" name="passwd">
          </div>
          <div class="form-group">
            <label for="nickname" class="control-label">NICK NAME</label>
            <input type="text" class="form-control" id="nickname" name="nickname">
          </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
        <button type="submit" class="btn btn-primary">가입하기</button>
      </div>
      </form>
    </div>
  </div>
</div>