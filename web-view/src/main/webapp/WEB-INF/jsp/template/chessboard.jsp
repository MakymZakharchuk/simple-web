<table id="chess_board" cellpadding="0" cellspacing="0">
    <%
        for (int i = 8; i > 0; i--) {
            out.write("<tr>\n");
            for (char c = 'a'; c <= 'h'; c++) {
                out.write("\t<td id=\"" + c + "" + i + "\" class=\"cell\" onclick=\"selectFigure(this)\"></td>\n");
            }
            out.write("</tr>\n");
        }
    %>
</table>