<%@taglib uri="http://struts.apache.org/tags-bean" prefix="b"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="l"%>
<center>
<table>
	<tr>
		<th>userName</th>
		<th>Password</th>
	</tr>
	<l:iterate id="u" name="userForm" property="list">
		<tr>
			<td> <b:write name="u" property="username"/> </td>
			<td> <b:write name="u" property="password"/> </td>
		</tr>
	</l:iterate>
</table>
</center>