$(document).ready(
    (function () {
        var game = getGame(2);
        initFigures(game['figures']);
    })
);

var Position = function (x, y) {
    this.pos = y + x;
};

function initFigures(figures) {
    for (var i = 0; i < figures.length; i++) {
        var figure = figures[i];
        paintFigure(figure);
    }
}

function paintFigure(figure) {
    var image = getFigureImage(figure);
    var location = new Position(figure.position.x, figure.position.y);
    var cell = $('#' + location.pos);
    cell.html('<a href="#" class="figure">' + image + '</a>');
}

var whiteFigureMap = {
    KING: '&#9813;',
    QUEEN: '&#9812;',
    ROOK: '&#9814;',
    BISHOP: '&#9815;',
    KNIGHT: '&#9816;',
    PAWN: '&#9817;'
};

var blackFigureMap = {
    KING: '&#9819;',
    QUEEN: '&#9818;',
    ROOK: '&#9820;',
    BISHOP: '&#9821;',
    KNIGHT: '&#9822;',
    PAWN: '&#9823;'
};


function getFigureImage(figure) {
    if (figure.white) {
        return whiteFigureMap[figure.type];
    } else {
        return blackFigureMap[figure.type];
    }
}

function selectFigure(cell) {
    alert(cell.id);
}

function getGame(id) {
    var url = 'watch/get?id=' + id;
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open("GET", url, false);
    xmlHttp.send(null);
    var resp = xmlHttp.responseText;
    return JSON.parse(resp);
}
