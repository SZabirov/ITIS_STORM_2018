<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
<p>Варианты:</p>
<form>
    <#list optionList as option>
    <input type="radio" name="option" value="${option.id}">${option.text}</input><br>
    </#list>
    <button type="submit">Отправить</button>
</form>
<form action="/cost">
    <input type="text" name="intext">
    <button type="submit">Отправить</button>
</form>
</body>
</html>