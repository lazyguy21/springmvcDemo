<%--
  Created by IntelliJ IDEA.
  User: lazyguy
  Date: 2016-3-14
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    I'm test
${sessionScope}
    <br/>
${sessionScope.memberInfo}

    <div class="chknumber">
        <label>验证码：
            <input name="kaptcha" type="text" id="kaptcha" maxlength="4" class="chknumber_input" />
        </label>
        <img src="/captcha/captcha-image" width="55" height="20" id="kaptchaImage"  style="margin-bottom: -3px"/>

    </div>

    <script type="text/javascript">
        $(function(){
            $('#kaptchaImage').click(function () {//生成验证码
                $(this).hide().attr('src', '/captcha/captcha-image?' + Math.floor(Math.random()*100) ).fadeIn(); })
        });
        function changeCode() {
            $('#kaptchaImage').hide().attr('src', './captcha/captcha-image' + Math.floor(Math.random()*100) ).fadeIn();
            event.cancelBubble=true;
        }
    </script>

</body>
</html>
