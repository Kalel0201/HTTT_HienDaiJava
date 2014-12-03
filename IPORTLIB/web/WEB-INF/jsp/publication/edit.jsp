<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<form method="post" action="${pageContext.request.contextPath}/publication/add" class="frm">
		<p><label>TopicId</label><input type="text" name="topicId" id="topicId" class="txtdate" /></p>
		<p><label>AuthorId</label><input type="text" name="authorId" id="authorId" class="txtdate" /></p>
		<p><label>PublisherId</label><input type="text" name="publisherId" id="publisherId" class="txtdate" /></p>
		<p><label>PublicationTypeId</label><input type="text" name="publicationTypeId" id="publicationTypeId" class="txtdate" /></p>
		<p><label>MajorId</label><input type="text" name="majorId" id="majorId" class="txtdate" /></p>
		<p><label>LanguageId</label><input type="text" name="languageId" id="languageId" class="txtdate" /></p>
		<p><label>Title</label><input type="text" name="title" id="title" class="txtlarge" /></p>
		<p><label>SubTitle</label><input type="text" name="subTitle" id="subTitle" class="txtlarge" /></p>
		<p><label>PublisherYear</label><input type="text" name="publisherYear" id="publisherYear" class="txtdate" /></p>
		<p><label>Edition</label><input type="text" name="edition" id="edition" class="txtdate" /></p>
		<p><label>Copyright</label><input type="text" name="copyright" id="copyright" class="txtlarge" /></p>
		<p><label>Description</label><input type="text" name="description" id="description" class="txtlarge" /></p>
		<p><label>Size</label><input type="text" name="size" id="size" /></p>
		<p><label>UnitId</label><input type="text" name="unitId" id="unitId" class="txtdate" /></p>
		<p><label>Price</label><input type="text" name="price" id="price" class="txtdate" /></p>
		<p><label>CurrencyId</label><input type="text" name="currencyId" id="currencyId" class="txtdate" /></p>
		<p><label>Quantity</label><input type="text" name="quantity" id="quantity" class="txtdate" /></p>
		<p><label>NumberDewey</label><input type="text" name="numberDewey" id="numberDewey" /></p>
		<p><label>ISBN</label><input type="text" name="iSBN" id="iSBN" /></p>
		<p><label>Note</label><input type="text" name="note" id="note" class="txtlarge" /></p>
		<p>
			<label>&nbsp;</label>
			<input type="submit" value="Save" class="btn" />
		</p>
	</form>
