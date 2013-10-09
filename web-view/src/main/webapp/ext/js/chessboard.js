$(document).ready(
    (function () {
        initChessBoard();
        getCellByPosition(new Position('1', 'b'))[0].innerHTML = '<img id="king" src="/ext/icons/black/king.png">';
    })
);

var Position = function (x, y) {
    this.x = x;
    this.y = y;
};

function initChessBoard() {
    var chars = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'];
    var c = 0;
    for (var i = 1; i < 9; i++) {
        for (var j = 0; j <= 8; j++) {
            var line = $('.' + i + ' .' + chars[j]);
            if (c % 2 == 0) {
                $(line).addClass('dark');
            } else {
                $(line).addClass('white');
            }
            c++;
        }
    }
}

function getCellByPosition(pos) {
    return $('.' + pos.x + ' .' + pos.y);
}


