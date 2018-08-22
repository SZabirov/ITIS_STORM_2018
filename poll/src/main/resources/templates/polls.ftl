<html>
    <head>
        <meta charset="UTF-8">
    </head>
    <body>
        <p>Доступные голосования:</p>
        <ol>
            <#list pollList as poll>
                <li><a href="/options?pollId=${poll.id}">${poll.question}</a></li>
            </#list>
        </ol>
    </body>
</html>