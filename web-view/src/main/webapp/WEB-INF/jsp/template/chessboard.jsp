<%@ page import="java.io.IOException" %>
<%@ page import="java.io.Writer" %>
<table class="chessboard">
    <tr>
        <%
            printCoordinates(out);
        %>
    </tr>
    <%
        for (int i = 8; i > 0; i--) {
            out.write("<tr class=\"" + i + "\"><td>" + i + "</td>");
            for (char c = 'a'; c <= 'h'; c++) {
                out.write("<td class=" + c + " cell\"></td>");
            }
            out.write("</tr>");
        }
    %>
    <tr>
        <%
            printCoordinates(out);
        %>
    </tr>
</table>
<%!
    private void printCoordinates(Writer out) throws IOException {
        out.write("<td></td>");
        for (char c = 'a'; c <= 'h'; c++) {
            out.write("<td>" + c + "</td>");
        }
    }
%>