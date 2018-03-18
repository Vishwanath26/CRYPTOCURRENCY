<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cryptocurrency</title>

    <script src="/resources/jquery-3.3.1.min.js"></script>
    <script src="/resources/index.js"></script>
</head>
<body>
<div id="ContentDiv">
    <div id="BTCDiv" class="CoinIcon">btc</div>
    <input type="button"  id="BTC" value="BTC" onclick="fetchBTC();"/>
    <input type="button" id="currentBTC" value="GetCurrentValue" onclick="fetchCurrentBTC();"/>
    <div id="DogeDiv" class="CoinIcon">doge</div>
    <input type="button" id="DOGE" value="DOGE" onclick="fetchDOGE();"/>
    <input type="button" id="currentDOGE" value="GetCurrentValue" onclick="fetchCurrentDOGE();"/>
    <div id="ETHDiv" class="CoinIcon">eth</div>
    <input type="button" value="ETH" id="ETH" onclick="fetchETH();"/>
    <input type="button" id="currentETH" value="GetCurrentValue" onclick="fetchCurrentETH();"/>
    <div id="LTCDiv" class="CoinIcon">ltc</div>
    <input type="button" value="LTC" id="LTC" onclick="fetchLTC();"/>
    <input type="button" id="currentLTC" value="GetCurrentValue" onclick="fetchCurrentLTC();"/>
    <div id="FooterDiv">Made With Love By Vishwanath Sharma</div>
</div>

</body>
</html>