<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<div><h1>환율 계산</h1></div>
<div><h3>송금국가: 미국(USD)</h3></div>
<input type="hidden" id="transferCurrencyCode" value="USD">
<div>
    <h3>수취국가: <select name="receiveCurrencyCode" id="receiveCurrencyCode">
        <option value="KRW" selected>한국(KRW)</option>
        <option value="JPY">일본(JPY)</option>
        <option value="PHP">필리핀(PHP)</option>
    </select></h3>
</div>
<div><h3>환율 : <span id="rate"></span></h3></div>
<div><h3>송금액: <input type="text" id="sendMoney"> USD</h3></div>
<div>
    <button id="send">submit</button>
</div>
<h3><div id="description"></div></h3>
</body>
<script type="text/javascript">
    document.addEventListener("DOMContentLoaded", function () {
        const receiveCurrencyCode = document.querySelector('#receiveCurrencyCode');
        const transferCurrencyCode = document.querySelector('#transferCurrencyCode');
        getRate(transferCurrencyCode.value, receiveCurrencyCode.value);
        receiveCurrencyCode.addEventListener('change', function () {
            getRate(transferCurrencyCode.value, receiveCurrencyCode.value);
        })
        const send = document.querySelector('#send');
        send.addEventListener('click', function () {
            const total = Number(document.getElementById('sendMoney').value) * Number(document.getElementById('rate').textContent.split(' ')[0].replaceAll(',',''));
            document.getElementById('description').innerText = '수취금액은 ' + addComma(total.toFixed(2)) + ' ' + document.getElementById('receiveCurrencyCode').value +' 입니다.';
        })
    })

    function getRate(transfer, receive) {
        const req = new XMLHttpRequest();
        req.open('get', '/exchangeRate?transfer=' + transfer + '&receive=' + receive);
        req.onreadystatechange = function () {
            if (req.readyState == 4) {
                if (req.status == 200) {
                    document.getElementById('rate').innerText = addComma(Number(JSON.parse(req.responseText)['rate']).toFixed(2)) + ' ' + receive + '/' + transfer;
                }
            }
        }
        req.send();
    }

    function addComma(num) {
        const regexp = /\B(?=(\d{3})+(?!\d))/g;
        return num.toString().replace(regexp, ',');
    }

</script>
</html>