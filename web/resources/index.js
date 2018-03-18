function fetchBTC(){
$.ajax({
    url:'http://localhost:8080/BITCOIN',
    type:'GET',
    datatype:'json',
    success: function (response) {
        response=parseFloat(response)
        $('#BTCDiv').html(response);
    }

});
}
function fetchDOGE(){
    $.ajax({
        url:'http://localhost:8080/DOGECOIN',
        type:'GET',
        datatype:'json',
        success: function (response) {
            $('#DogeDiv').html(response);
        }

    });
}
function fetchETH(){
    $.ajax({
        url:'http://localhost:8080/ETHEREUMCOIN',
        type:'GET',
        datatype:'json',
        success: function (response) {
            $('#ETHDiv').html(response);
        }

    });
}
function fetchLTC(){
    $.ajax({
        url:'http://localhost:8080/LITECOIN',
        type:'GET',
        datatype:'json',
        success: function (response) {
            $('#LTCDiv').html(response);
        }

    });
}

function fetchCurrentBTC(){
    $.ajax({
        url:'https://www.alphavantage.co/documentation/#digital-currency',
        type:'GET',
        datatype:'json',
        success: function (response) {
            $('#LTCDiv').html(response);
        }

    });
}
function fetchCurrentDOGE(){
    $.ajax({
        url:'https://www.alphavantage.co/documentation/#digital-currency',
        type:'GET',
        datatype:'json',
        success: function (response) {
            $('#LTCDiv').html(response);
        }

    });
}
function fetchCurrentETH(){
    $.ajax({
        url:'https://www.alphavantage.co/documentation/#digital-currency',
        type:'GET',
        datatype:'json',
        success: function (response) {
            $('#LTCDiv').html(response);
        }

    });
}
function fetchCurrentLTC(){
    $.ajax({
        url:'https://www.alphavantage.co/documentation/#digital-currency',
        type:'GET',
        datatype:'json',
        success: function (response) {
            $('#LTCDiv').html(response);
        }

    });
}
