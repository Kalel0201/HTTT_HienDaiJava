<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/user/add" class="frm">
		<p><label>DepartmentId</label><input type="text" name="departmentId" id="departmentId" class="txtdate" /></p>
		<p><label>ProvinceId</label><input type="text" name="provinceId" id="provinceId" class="txtdate" /></p>
		<p><label>GroupId</label><input type="text" name="groupId" id="groupId" class="txtdate" /></p>
		<p><label>AttachmentId</label><input type="text" name="attachmentId" id="attachmentId" class="txtdate" /></p>
		<p><label>UserNo</label><input type="text" name="userNo" id="userNo" /></p>
		<p><label>FirstName</label><input type="text" name="firstName" id="firstName" class="txtlarge" /></p>
		<p><label>LastName</label><input type="text" name="lastName" id="lastName" class="txtlarge" /></p>
		<p><label>Gender</label><input type="text" name="gender" id="gender" /></p>
		<p><label>BirthDay</label><input type="text" name="birthDay" id="birthDay" /></p>
		<p><label>Address</label><input type="text" name="address" id="address" class="txtlarge" /></p>
		<p><label>Phone</label><input type="text" name="phone" id="phone" /></p>
		<p><label>IdentityCard</label><input type="text" name="identityCard" id="identityCard" /></p>
		<p><label>Email</label><input type="text" name="email" id="email" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
