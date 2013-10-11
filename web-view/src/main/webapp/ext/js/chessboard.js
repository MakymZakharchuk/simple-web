$(document).ready(
    (function () {
        initChessBoard();
        var game = getGame(2);
        initFigures(game.figures);
    })
);

var Position = function (x, y) {
    this.x = x;
    this.y = y;
};

function initFigures(figures) {
    for (var i = 0; i < figures.length; i++) {
        var figure = figures[i];
        paintFigure(figure);
    }
}

function paintFigure(figure) {
    var image = getImage(figure);
    var pos = new Position(figure.position.x, figure.position.y);
    getCellByPosition(pos)[0].innerHTML = '<img src="' + image + '">';

}

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

function getImage(figure) {
    var path = '/ext/icons/';
    if (figure.white) {
        path = path + 'white/';
    } else {
        path = path + 'black/';
    }

    switch (figure.type) {
        case 'KING' :
            return path + 'king.png';
        case 'QUEEN' :
            return path + 'queen.png';
        case 'ROOK' :
            return path + 'rook.png';
        case 'BISHOP' :
            return path + 'bishop.png';
        case 'KNIGHT' :
            return path + 'knight.png';
        case 'PAWN' :
            return path + 'pawn.png';
    }
}


function getGame(id) {
    var url = 'watch/get?id=' + id;
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open("GET", url, false);
    xmlHttp.send(null);
    var resp = xmlHttp.responseText;
    return JSON.parse(resp);
}
