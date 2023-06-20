<template>
    <div>
        <span style="font-size: 24px"><b>&nbsp;销售系统</b></span>
        <div style="font-size: 16px">
            <p>
                一销售系统，如果销售员的年销售额大于200万RMB且请假天数不超过10天的情况下，现金到帐大于等于60%，则佣金（提成）系数为7，即佣金值为销售额除以佣金系数；现金到帐小于60%，佣金不予计算。所有其他情况且现金到帐小于等于85%，则按佣金系数均为6计算佣金，现金到账大于85%，佣金系数按5处理。
            </p>
            <p>
                根据题意设计流程图并设计测试用例实现白盒测试（White Box
                Test）的1）语句覆盖，2）判断覆盖，3）条件覆盖，4）判断—条件覆盖，5）条件组合覆盖（测试用例及覆盖表示要清晰）。
            </p>
        </div>
        <img src="./13.png" />
        <p style="margin: 6px 610px 0px 0px; text-align: left;">
            <strong><span
                    style="font-size:13px;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:0">测试⽤例设计
                </span></strong><span style="font-size:13px;color:#333333;letter-spacing: -1px">:</span>
        </p>
        <p style="margin: 6px 610px 0px 0px; text-align: left;">
            <span
                style="font-size: 13px; font-family: Arial, sans-serif; color: rgb(51, 51, 51); letter-spacing: 0px;">1.<span
                    style="font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-stretch: normal; font-size: 9px; line-height: normal; font-family: &quot;Times New Roman&quot;;">&nbsp;&nbsp;&nbsp;
                </span></span><span style="font-size: 13px; color: rgb(51, 51, 51); letter-spacing: 0px;">语句覆盖 </span><span
                style="font-size: 13px; font-family: Arial, sans-serif; color: rgb(51, 51, 51); letter-spacing: -1px;">:</span>
        </p>
        <p style="margin: 6px 610px 0px 0px; text-align: left;">
            <span
                style="font-size: 13px; font-family: Arial, sans-serif; color: rgb(51, 51, 51); letter-spacing: -1px;"><br /></span>
        </p>
        <table>
            <tbody>
                <tr style=";height:34px" class="firstRow">
                    <td width="82" valign="top"
                        style="border: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:8px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">No.</span></strong>
                        </p>
                    </td>
                    <td width="103" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">路径</span></strong>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:8px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">Sales</span></strong>
                        </p>
                    </td>
                    <td width="97" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:8px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">Days</span></strong>
                        </p>
                    </td>
                    <td width="146" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:8px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">CashRate</span></strong>
                        </p>
                    </td>
                    <td width="131" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">预期结果</span></strong>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="82" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS1</span>
                        </p>
                    </td>
                    <td width="103" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="97" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">0</span>
                        </p>
                    </td>
                    <td width="146" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">0</span>
                        </p>
                    </td>
                    <td width="131" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="82" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS2</span>
                        </p>
                    </td>
                    <td width="103" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">acdfj</span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">700</span>
                        </p>
                    </td>
                    <td width="97" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">5</span>
                        </p>
                    </td>
                    <td width="146" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.8</span>
                        </p>
                    </td>
                    <td width="131" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">100</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="82" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS3</span>
                        </p>
                    </td>
                    <td width="103" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">acdgk</span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">300</span>
                        </p>
                    </td>
                    <td width="97" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">5</span>
                        </p>
                    </td>
                    <td width="146" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.5</span>
                        </p>
                    </td>
                    <td width="131" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">0</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="82" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS4</span>
                        </p>
                    </td>
                    <td width="103" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">acehj</span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">300</span>
                        </p>
                    </td>
                    <td width="97" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">20</span>
                        </p>
                    </td>
                    <td width="146" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.9</span>
                        </p>
                    </td>
                    <td width="131" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">60</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="82" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS5</span>
                        </p>
                    </td>
                    <td width="103" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">aceij</span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">300</span>
                        </p>
                    </td>
                    <td width="97" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">20</span>
                        </p>
                    </td>
                    <td width="146" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.5</span>
                        </p>
                    </td>
                    <td width="131" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">50</span>
                        </p>
                    </td>
                </tr>
            </tbody>
        </table><span
            style="font-size: 13px; font-family: Arial, sans-serif; color: rgb(51, 51, 51); letter-spacing: 0px;">2.<span
                style="font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-stretch: normal; font-size: 9px; line-height: normal; font-family: &quot;Times New Roman&quot;;">&nbsp;&nbsp;&nbsp;
            </span></span><span style="font-size: 13px; color: rgb(51, 51, 51); letter-spacing: 0px;">判断覆盖 </span><span
            style="font-size: 13px; font-family: Arial, sans-serif; color: rgb(51, 51, 51); letter-spacing: -1px;">:</span>
        <p style="margin-top:1px">
            <span style="font-size: 13px">&nbsp;</span>
        </p>
        <table>
            <tbody>
                <tr style=";height:34px" class="firstRow">
                    <td width="82" valign="top"
                        style="border: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:8px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">No.</span></strong>
                        </p>
                    </td>
                    <td width="103" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">路径</span></strong>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:8px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">Sales</span></strong>
                        </p>
                    </td>
                    <td width="97" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:8px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">Days</span></strong>
                        </p>
                    </td>
                    <td width="146" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:8px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">CashRate</span></strong>
                        </p>
                    </td>
                    <td width="131" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">预期结果</span></strong>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="82" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS1</span>
                        </p>
                    </td>
                    <td width="103" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="97" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">0</span>
                        </p>
                    </td>
                    <td width="146" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">0</span>
                        </p>
                    </td>
                    <td width="131" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="82" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS2</span>
                        </p>
                    </td>
                    <td width="103" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">acdfj</span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">700</span>
                        </p>
                    </td>
                    <td width="97" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">5</span>
                        </p>
                    </td>
                    <td width="146" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.8</span>
                        </p>
                    </td>
                    <td width="131" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">100</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="82" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS3</span>
                        </p>
                    </td>
                    <td width="103" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">acdgk</span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">300</span>
                        </p>
                    </td>
                    <td width="97" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">5</span>
                        </p>
                    </td>
                    <td width="146" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.5</span>
                        </p>
                    </td>
                    <td width="131" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">0</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="82" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS4</span>
                        </p>
                    </td>
                    <td width="103" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">acehj</span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">300</span>
                        </p>
                    </td>
                    <td width="97" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">20</span>
                        </p>
                    </td>
                    <td width="146" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.9</span>
                        </p>
                    </td>
                    <td width="131" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">60</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="82" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS5</span>
                        </p>
                    </td>
                    <td width="103" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">aceij</span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">300</span>
                        </p>
                    </td>
                    <td width="97" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">20</span>
                        </p>
                    </td>
                    <td width="146" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.5</span>
                        </p>
                    </td>
                    <td width="131" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">50</span>
                        </p>
                    </td>
                </tr>
            </tbody>
        </table><span
            style="font-size: 13px; font-family: Arial, sans-serif; color: rgb(51, 51, 51); letter-spacing: 0px;">3.<span
                style="font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-stretch: normal; font-size: 9px; line-height: normal; font-family: &quot;Times New Roman&quot;;">&nbsp;&nbsp;&nbsp;
            </span></span><span style="font-size: 13px; color: rgb(51, 51, 51); letter-spacing: 0px;">条件覆盖 </span><span
            style="font-size: 13px; font-family: Arial, sans-serif; color: rgb(51, 51, 51); letter-spacing: -1px;">:</span>
        <p style="margin: 5px 424px 0px 71px; text-align: left; line-height: 118%;">
            <span
                style="position: absolute; z-index: 15738880; left: 0px; margin-left: 127px; margin-top: 241px; width: 10px; height: 11px; text-align: left;"><img
                    width="8" height="9"
                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">由流程图可知</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height: 118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">本程序共有
            </span><span style="font-size:13px;line-height:118%;color:#333333">4 </span><span
                style="font-size:13px;line-height:118%;font-family: &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">个判断语句对于第⼀个判断语句</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">有以下取值
            </span><span style="font-size:13px;line-height:118%;color:#333333">: Sales&lt;0</span><span
                style="font-size:13px;line-height:118%;font-family: &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为真</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;line-height:118%;color:#333333">T1</span>
        </p>
        <p style="margin: 0px 439px 0px 71px; line-height: 118%; text-align: left;">
            <span style="font-size:13px;line-height:118%;color:#333333">Sales&lt;0</span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为假</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height: 118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;line-height:118%;color:#333333">F1 CashRate&lt;0</span><span
                style="font-size:13px;line-height:118%;font-family: &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为真</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;line-height:118%;color:#333333">T2 CashRate&lt;0</span><span
                style="font-size:13px;line-height:118%;font-family: &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为假</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;line-height:118%;color:#333333">F2 CashRate&gt;1</span><span
                style="font-size:13px;line-height:118%;font-family: &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为真</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;line-height:118%;color:#333333">T3 CashRate&gt;1</span><span
                style="font-size:13px;line-height:118%;font-family: &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为假</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;line-height:118%;color:#333333">F3 LeaveDays&lt;0</span><span
                style="font-size:13px;line-height:118%;font-family: &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为真</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;line-height:118%;color:#333333">T4 LeaveDays&lt;0</span><span
                style="font-size:13px;line-height:118%;font-family: &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为假</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;line-height:118%;color:#333333">F4 LeaveDays&gt;366</span><span
                style="font-size:13px;line-height:118%;font-family: &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为真</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;line-height:118%;color:#333333">T5 LeaveDays&gt;366</span><span
                style="font-size:13px;line-height:118%;font-family: &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为假</span><span
                style="font-size:13px;line-height:118%;color:#333333;letter-spacing:2px">, </span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;line-height:118%;color:#333333;letter-spacing:-0">F5</span>
        </p>
        <p style="margin: 0px 419px 0px 71px; line-height: 118%; text-align: left;">
            <span
                style="position: absolute; z-index: 15739392; left: 0px; margin-left: 127px; margin-top: 441px; width: 10px; height: 11px; text-align: left;"><img
                    width="8" height="9"
                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">对于第⼆个判断语句，有以下取值</span><span
                style="font-size:13px;line-height:118%;color:#333333;letter-spacing:-0">: </span><span
                style="font-size: 13px;line-height:118%;color:#333333">Sales&gt;200</span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为真</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;line-height:118%;color:#333333">T6 Sales&lt;=200</span><span
                style="font-size:13px;line-height:118%;font-family: &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为假</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height: 118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size: 13px;line-height:118%;color:#333333">F6 Days&lt;=10</span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为真</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;line-height:118%;color:#333333">T7</span>
        </p>
        <p style="margin: 0px 0px 0px 71px; text-align: left;">
            <span style="font-size: 13px;color:#333333">Days&gt;10</span><span
                style="font-size:13px;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为假</span><span
                style="font-size:13px;color:#333333;letter-spacing: 1px">,, </span><span
                style="font-size:13px;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;color:#333333;letter-spacing:-0">F7</span>
        </p>
        <p style="text-align: left;">
            <span style="font-size:13px;font-family: &#39;Arial&#39;,sans-serif"><br /> </span> &nbsp;
        </p>
        <p style="margin: 3px 419px 0px 71px; line-height: 118%; text-align: left;">
            <span
                style="position: absolute; z-index: 15739904; left: 0px; margin-left: 127px; margin-top: 533px; width: 10px; height: 10px; text-align: left;"><img
                    width="8" height="8"
                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">对于第三个判断语句</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height: 118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">有以下取值
            </span><span style="font-size:13px;line-height:118%;color:#333333">: R&gt;=0.6</span><span
                style="font-size:13px;line-height:118%;font-family: &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为真</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;line-height:118%;color:#333333">T8</span>
        </p>
        <p style="margin: 0px 0px 0px 71px; text-align: left;">
            <span style="font-size: 13px;color:#333333">R&gt;=0.6</span><span
                style="font-size:13px;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为假</span><span
                style="font-size:13px;color:#333333;letter-spacing: 0">, </span><span
                style="font-size:13px;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;color:#333333;letter-spacing:-0">F8</span>
        </p>
        <p style="margin: 5px 419px 0px 71px; line-height: 118%; text-align: left;">
            <span
                style="position: absolute; z-index: 15740416; left: 0px; margin-left: 127px; margin-top: 587px; width: 10px; height: 11px; text-align: left;"><img
                    width="8" height="9"
                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">对于第四个判断语句</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height: 118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">有以下取值
            </span><span style="font-size:13px;line-height:118%;color:#333333">: R&gt;0.85</span><span
                style="font-size:13px;line-height:118%;font-family: &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为真</span><span
                style="font-size:13px;line-height:118%;color:#333333">, </span><span
                style="font-size:13px;line-height:118%;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;line-height:118%;color:#333333">T9</span>
        </p>
        <p style="margin: 0px 0px 0px 71px; text-align: left;">
            <span style="font-size: 13px;color:#333333">R&gt;0.85</span><span
                style="font-size:13px;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">为假</span><span
                style="font-size:13px;color:#333333;letter-spacing: 1px">, </span><span
                style="font-size:13px;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">记为</span><span
                style="font-size:13px;color:#333333;letter-spacing:-0">F9</span>
        </p>
        <p style="margin: 5px 0px 0px 39px; text-align: left;">
            <span
                style="font-size:13px;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:0">⽤例设计如下
            </span><span style="font-size:13px;color:#333333;letter-spacing:-1px">:</span>
        </p>
        <p style="margin-top:0">
            <span style="font-size: 13px">&nbsp;</span>
        </p>
        <table>
            <tbody>
                <tr style=";height:33px" class="firstRow">
                    <td width="57" valign="top"
                        style="border: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:8px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">No.</span></strong>
                        </p>
                    </td>
                    <td width="69" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:8px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">Sales</span></strong>
                        </p>
                    </td>
                    <td width="67" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:8px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">Days</span></strong>
                        </p>
                    </td>
                    <td width="102" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:8px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">CashRate</span></strong>
                        </p>
                    </td>
                    <td width="61" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">路径</span></strong>
                        </p>
                    </td>
                    <td width="213" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">覆盖条件</span></strong>
                        </p>
                    </td>
                    <td width="91" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">预期结果</span></strong>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="57" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS1</span>
                        </p>
                    </td>
                    <td width="69" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="67" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="102" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="61" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:13px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                        </p>
                    </td>
                    <td width="213" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">T1 T2 F3 T4 F5 F6 T7 F8 <span
                                    style="letter-spacing:-0">T9</span></span>
                        </p>
                    </td>
                    <td width="91" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:33px">
                    <td width="57" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS2</span>
                        </p>
                    </td>
                    <td width="69" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">400</span>
                        </p>
                    </td>
                    <td width="67" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">400</span>
                        </p>
                    </td>
                    <td width="102" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">400</span>
                        </p>
                    </td>
                    <td width="61" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                        </p>
                    </td>
                    <td width="213" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">F1 F2 T3 F4 T5 T6 F7 T8 <span
                                    style="letter-spacing:-0">T9</span></span>
                        </p>
                    </td>
                    <td width="91" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                        </p>
                    </td>
                </tr>
            </tbody>
        </table>
        <p class="MsoListParagraph" style="margin-left:39px">
            <span style="font-size:13px;font-family:&#39;Arial&#39;,sans-serif;color:#333333;letter-spacing:-0">4.<span
                    style="font:9px &#39;Times New Roman&#39;">&nbsp;&nbsp;&nbsp; </span></span><span
                style="font-size:13px;color:#333333">判断</span><span
                style="font-size:13px;font-family:&#39;Arial&#39;,sans-serif;color:#333333">-</span><span
                style="font-size:13px;color:#333333;letter-spacing: 1px">条件覆盖 </span><span
                style="font-size:13px;font-family:&#39;Arial&#39;,sans-serif;color:#333333;letter-spacing:-1px">:</span>
        </p>
        <p style="margin-top:5px;margin-right:0;margin-bottom:0;margin-left:39px;margin-bottom:0">
            <span
                style="font-size:13px;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:1px">由
            </span><span style="font-size:13px;color:#333333">3<span style="letter-spacing:1px">. </span></span><span
                style="font-size:13px;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:0">中对判断语句的分析
            </span><span style="font-size:13px;color:#333333;letter-spacing:-1px">:</span>
        </p>
        <p style="margin-top:0;margin-right:0;margin-bottom:0;margin-left:0">
            <span style="font-size:13px">&nbsp;</span>
        </p>
        <table>
            <tbody>
                <tr style=";height:32px" class="firstRow">
                    <td width="56" valign="top"
                        style="border: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:7px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">No.</span></strong>
                        </p>
                    </td>
                    <td width="68" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:7px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">Sales</span></strong>
                        </p>
                    </td>
                    <td width="67" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:7px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">Days</span></strong>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:7px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">CashRate</span></strong>
                        </p>
                    </td>
                    <td width="71" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">路径</span></strong>
                        </p>
                    </td>
                    <td width="209" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">覆盖条件</span></strong>
                        </p>
                    </td>
                    <td width="90" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">预期结果</span></strong>
                        </p>
                    </td>
                </tr>
                <tr style=";height:32px">
                    <td width="56" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS1</span>
                        </p>
                    </td>
                    <td width="68" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="67" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="71" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                        </p>
                    </td>
                    <td width="209" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">T1 T2 F3 T4 F5 F6 T7 F8 <span
                                    style="letter-spacing:-0">T9</span></span>
                        </p>
                    </td>
                    <td width="90" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:32px">
                    <td width="56" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS2</span>
                        </p>
                    </td>
                    <td width="68" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">400</span>
                        </p>
                    </td>
                    <td width="67" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">400</span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">400</span>
                        </p>
                    </td>
                    <td width="71" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                        </p>
                    </td>
                    <td width="209" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">F1 F2 T3 F4 T5 T6 F7 T8 <span
                                    style="letter-spacing:-0">T9</span></span>
                        </p>
                    </td>
                    <td width="90" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:32px">
                    <td width="56" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS3</span>
                        </p>
                    </td>
                    <td width="68" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">700</span>
                        </p>
                    </td>
                    <td width="67" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">5</span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.8</span>
                        </p>
                    </td>
                    <td width="71" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">acdfj</span>
                        </p>
                    </td>
                    <td width="209" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">F1</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F2</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F3</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F4</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F5</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">T6</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">T7</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">T8</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F9</span>
                        </p>
                    </td>
                    <td width="90" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">100</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:32px">
                    <td width="56" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS4</span>
                        </p>
                    </td>
                    <td width="68" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">300</span>
                        </p>
                    </td>
                    <td width="67" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">5</span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.5</span>
                        </p>
                    </td>
                    <td width="71" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">acdgk</span>
                        </p>
                    </td>
                    <td width="209" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">F1</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F2</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F3</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F4</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F5</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">T6</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">T7</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F8</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F9</span>
                        </p>
                    </td>
                    <td width="90" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">0</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:32px">
                    <td width="56" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS5</span>
                        </p>
                    </td>
                    <td width="68" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">300</span>
                        </p>
                    </td>
                    <td width="67" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">20</span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.9</span>
                        </p>
                    </td>
                    <td width="71" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">acehj</span>
                        </p>
                    </td>
                    <td width="209" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">F1</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F2</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F3</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F4</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F5</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">T6</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F7</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">T8</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">T9</span>
                        </p>
                    </td>
                    <td width="90" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">60</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:32px">
                    <td width="56" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">TS6</span>
                        </p>
                    </td>
                    <td width="68" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">300</span>
                        </p>
                    </td>
                    <td width="67" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">20</span>
                        </p>
                    </td>
                    <td width="100" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.5</span>
                        </p>
                    </td>
                    <td width="71" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">aceij</span>
                        </p>
                    </td>
                    <td width="209" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">F1</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F2</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F3</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F4</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F5</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">T6</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F7</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F8</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">F9</span>
                        </p>
                    </td>
                    <td width="90" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">50</span>
                        </p>
                    </td>
                </tr>
            </tbody>
        </table>
        <p class="MsoListParagraph" style="margin-top:6px;margin-right:0;margin-bottom: 0;margin-left:39px;margin-bottom:0">
            <span style="font-size:13px;font-family:&#39;Arial&#39;,sans-serif;color:#333333;letter-spacing:-0">5.<span
                    style="font:9px &#39;Times New Roman&#39;">&nbsp;&nbsp;&nbsp; </span></span><span
                style="font-size:13px;color:#333333;letter-spacing: 0">条件组合覆盖 </span><span
                style="font-size:13px;font-family:&#39;Arial&#39;,sans-serif;color:#333333;letter-spacing:-1px">:</span>
        </p>
        <p style="margin-top:5px;margin-right:0;margin-bottom:0;margin-left:39px;margin-bottom:0">
            <span
                style="font-size:13px;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:1px">综上
            </span><span style="font-size:13px;color:#333333;letter-spacing:1px">: </span><span
                style="font-size:13px;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:0">在本场景中存在条件组合如下
            </span><span style="font-size:13px;color:#333333;letter-spacing: -1px">:</span>
        </p>
        <p>
            <span style="font-size:13px;font-family: &#39;Arial&#39;,sans-serif"><br /> </span> &nbsp;
        </p>
        <table>
            <tbody>
                <tr style=";height:34px" class="firstRow">
                    <td width="115" valign="top"
                        style="border: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">组合编号</span></strong>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">条件组合</span></strong>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">覆盖</span></strong>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">1</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">Sales&lt;0 Days&lt;0 <span
                                    style="letter-spacing:-0">CashRate&lt;0</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">T1 T2 F3 T4<span style="letter-spacing:-0"> &nbsp;
                                    F5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">2</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:15751168;left:0px;margin-left:199px;margin-top:   799px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:15751680;left:0px;margin-left:291px;margin-top:   799px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales&lt;0 Days&lt;0 0</span> <span
                                style="font-size:13px;color:#333333">CashRate<span style="letter-spacing:2px">&nbsp;
                                </span><span style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">T1 T2 F3 F4 <span
                                    style="letter-spacing:-0">F5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">3</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">Sales&lt;0 Days&lt;0 <span
                                    style="letter-spacing:-0">CashRate&gt;1</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">T1 T2 F3 F4 <span
                                    style="letter-spacing:-0">T5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">4</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:15752192;left:0px;margin-left:191px;margin-top:   817px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:15752704;left:0px;margin-left:135px;margin-top:   817px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales&lt;0 0<span style="letter-spacing:2px">&nbsp;
                                </span>Days<span style="letter-spacing:2px">&nbsp; </span>366 <span
                                    style="letter-spacing:-0">CashRate&lt;0</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">T1 F2 F3 T4 <span
                                    style="letter-spacing:-0">F5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">5</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:-1660948992;left:0px;margin-left:135px;margin-top:   826px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:-1660948480;left:0px;margin-left:251px;margin-top:   826px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:-1660947968;left:0px;margin-left:191px;margin-top:   826px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:-1660947456;left:0px;margin-left:343px;margin-top:   826px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales&lt;0 0<span style="letter-spacing:2px">&nbsp;
                                </span>Days<span style="letter-spacing:2px">&nbsp; </span>366 0<span
                                    style="letter-spacing:2px">&nbsp; </span>CashRate<span
                                    style="letter-spacing:   2px">&nbsp; </span><span
                                    style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">T1 F2 F3 F4 <span
                                    style="letter-spacing:-0">F5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">6</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:15753216;left:0px;margin-left:135px;margin-top:   835px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:15753728;left:0px;margin-left:191px;margin-top:   835px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales&lt;0 0<span style="letter-spacing:2px">&nbsp;
                                </span>Days<span style="letter-spacing:2px">&nbsp; </span>366 <span
                                    style="letter-spacing:-0">CashRate&gt;1</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">T1 F2 F3 F4 <span
                                    style="letter-spacing:-0">T5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">7</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">Sales&lt;0 Days&gt;366 <span
                                    style="letter-spacing:-0">CashRate&lt;0</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">T1 F2 T3 T4<span style="letter-spacing:-0"> &nbsp;
                                    F5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">8</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:15754240;left:0px;margin-left:311px;margin-top:   851px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:15754752;left:0px;margin-left:219px;margin-top:   851px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales&lt;0 Days&gt;366 0<span
                                    style="letter-spacing:2px">&nbsp; </span>CashRate<span
                                    style="letter-spacing:   2px">&nbsp; </span><span
                                    style="letter-spacing:   -1px">1</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">T1 F2 T3 F4 <span
                                    style="letter-spacing:-0">F5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">9</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">Sales&lt;0 Days&gt;366 <span
                                    style="letter-spacing:-0">CashRate&gt;1</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">T1 F2 T3 F4 <span
                                    style="letter-spacing:-0">T5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">10</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:15755264;left:0px;margin-left:101px;margin-top:   869px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales<span style="letter-spacing:2px">&nbsp; </span>0
                                Days&lt;0 <span style="letter-spacing:-0">CashRate&lt;0</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">F1 T2 F3 T4 <span
                                    style="letter-spacing:-0">F5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">11</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:-1660946944;left:0px;margin-left:206px;margin-top:   878px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:-1660946432;left:0px;margin-left:101px;margin-top:   878px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:-1660945920;left:0px;margin-left:298px;margin-top:   878px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales<span style="letter-spacing:2px">&nbsp; </span>0
                                Days&lt;0 0<span style="letter-spacing:2px">&nbsp; </span>CashRate<span
                                    style="letter-spacing:2px">&nbsp; </span><span
                                    style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">F1 T2 F3 F4 <span
                                    style="letter-spacing:-0">F5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">12</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:15755776;left:0px;margin-left:101px;margin-top:   887px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales<span style="letter-spacing:2px">&nbsp; </span>0
                                Days&lt;0 <span style="letter-spacing:-0">CashRate&gt;1</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">F1 T2 F3 F4 <span
                                    style="letter-spacing:-0">T5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">13</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:-1660945408;left:0px;margin-left:101px;margin-top:   896px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:-1660944896;left:0px;margin-left:142px;margin-top:   896px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:-1660944384;left:0px;margin-left:198px;margin-top:   896px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales<span style="letter-spacing:2px">&nbsp; </span>0
                                0<span style="letter-spacing:2px">&nbsp; &nbsp; </span>Days<span
                                    style="letter-spacing:2px">&nbsp; </span>366 <span
                                    style="letter-spacing:-0">CashRate&lt;0</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">F1 F2 F3 T4 <span
                                    style="letter-spacing:-0">F5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">14</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:15756288;left:0px;margin-left:101px;margin-top:   905px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:15756800;left:0px;margin-left:142px;margin-top:   905px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:15757312;left:0px;margin-left:258px;margin-top:   905px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:15757824;left:0px;margin-left:198px;margin-top:   905px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:15758336;left:0px;margin-left:350px;margin-top:   905px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales<span style="letter-spacing:2px">&nbsp; </span>0
                                0<span style="letter-spacing:2px">&nbsp; &nbsp; </span>Days<span
                                    style="letter-spacing:2px">&nbsp; </span>366 0<span style="letter-spacing:2px">&nbsp;
                                    &nbsp; </span>CashRate<span style="letter-spacing:2px">&nbsp; </span><span
                                    style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">F1 F2 F3 F4 <span
                                    style="letter-spacing:-0">F5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">15</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:-1660943872;left:0px;margin-left:101px;margin-top:   916px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:-1660943360;left:0px;margin-left:142px;margin-top:   916px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:-1660942848;left:0px;margin-left:198px;margin-top:   916px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales<span style="letter-spacing:2px">&nbsp; </span>0
                                0<span style="letter-spacing:2px">&nbsp; &nbsp; </span>Days<span
                                    style="letter-spacing:2px">&nbsp; </span>366 <span
                                    style="letter-spacing:-0">CashRate&gt;1</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">F1 F2 F3 T4 <span
                                    style="letter-spacing:-0">F5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">16</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:15758848;left:0px;margin-left:101px;margin-top:   924px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales<span style="letter-spacing:2px">&nbsp; </span>0
                                Days&gt;366 <span style="letter-spacing:-0">CashRate&lt;0</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">F1 F2 T3 T4 <span
                                    style="letter-spacing:-0">F5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">17</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:-1660942336;left:0px;margin-left:101px;margin-top:   932px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:-1660941824;left:0px;margin-left:225px;margin-top:   932px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:-1660941312;left:0px;margin-left:317px;margin-top:   932px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales<span style="letter-spacing:2px">&nbsp; </span>0
                                Days&gt;366 0<span style="letter-spacing:2px">&nbsp; </span>CashRate<span
                                    style="letter-spacing:2px">&nbsp; </span><span
                                    style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">F1 F2 T3 F4 <span
                                    style="letter-spacing:-0">F5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">18</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:15759360;left:0px;margin-left:101px;margin-top:   941px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales<span style="letter-spacing:2px">&nbsp; </span>0
                                Days&gt;366 <span style="letter-spacing:-0">CashRate&gt;1</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">F1 F2 T3 F4 <span
                                    style="letter-spacing:-0">T5</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">19</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:-1660940800;left:0px;margin-left:185px;margin-top:   950px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales&gt;200 Days</span> <span
                                style="font-size:13px;color:#333333;letter-spacing:   -0">10</span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">T6 <span style="letter-spacing:-0">T7</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">20</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">Sales&gt;200 <span
                                    style="letter-spacing:-0">Days&gt;10</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">T6 <span style="letter-spacing:-0">F7</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">21</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:-1660940288;left:0px;margin-left:101px;margin-top:   968px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style=";position:absolute;z-index:-1660939776;left:0px;margin-left:191px;margin-top:   968px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales<span style="letter-spacing:2px">&nbsp; </span>200
                                Days<span style="letter-spacing:2px">&nbsp; </span><span
                                    style="letter-spacing:-0">10</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">F6 <span style="letter-spacing:-0">T7</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">22</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:15759872;left:0px;margin-left:101px;margin-top:   977px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">Sales<span style="letter-spacing:2px">&nbsp; </span>200
                                <span style="letter-spacing:-0">Days&gt;10</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333">F6 <span style="letter-spacing:-0">F7</span></span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">23</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:-1660939264;left:0px;margin-left:70px;margin-top:   986px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">R<span style="letter-spacing:2px">&nbsp; </span><span
                                    style="letter-spacing:-0">0.6</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">T8</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">24</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">R&lt;0.6</span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">F8</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">25</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">R&gt;0.85</span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">T9</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:34px">
                    <td width="115" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">26</span>
                        </p>
                    </td>
                    <td width="382" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span
                                style=";position:absolute;z-index:15760384;left:0px;margin-left:70px;margin-top:1012px;width:13px;height:16px"><img
                                    width="10" height="13"
                                    src="https://cdn.uukit.com/vendor/ueditor/me/themes/default/images/spacer.gif" /></span><span
                                style="font-size:13px;color:#333333">R<span style="letter-spacing:2px">&nbsp; </span><span
                                    style="letter-spacing:-0">0.85</span></span>
                        </p>
                    </td>
                    <td width="163" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-left:14px">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">F9</span>
                        </p>
                    </td>
                </tr>
            </tbody>
        </table>
        <p style="margin-top:1px">
            <span style="font-size: 11px">&nbsp;</span>
        </p>
        <p style="margin-top:5px;margin-right:0;margin-bottom:0;margin-left:39px;margin-bottom:0">
            <span
                style="font-size:13px;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333">根据以上组合</span><span
                style="font-size:13px;color:#333333;letter-spacing: 1px">, </span><span
                style="font-size:13px;font-family:&#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:0">设计出以下测试⽤例
            </span><span style="font-size:13px;color:#333333;letter-spacing: -1px">:</span>
        </p>
        <p>
            <span style="font-size:13px;font-family: &#39;Arial&#39;,sans-serif"><br /> </span>
        </p>
        <table>
            <tbody>
                <tr style=";height:32px" class="firstRow">
                    <td width="99" valign="top"
                        style="border: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">⽤例编号</span></strong>
                        </p>
                    </td>
                    <td width="76" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:7px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">Sales</span></strong>
                        </p>
                    </td>
                    <td width="74" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:7px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">Days</span></strong>
                        </p>
                    </td>
                    <td width="110" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:7px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:&#39;Noto Sans&#39;,sans-serif;color:#333333;letter-spacing:-0">CashRate</span></strong>
                        </p>
                    </td>
                    <td width="133" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">覆盖组合</span></strong>
                        </p>
                    </td>
                    <td width="69" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">路径</span></strong>
                        </p>
                    </td>
                    <td width="99" valign="top"
                        style="border-top: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-image: initial; border-left: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:5px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <strong><span
                                    style="font-size:13px;font-family:   &#39;Microsoft JhengHei UI&#39;,sans-serif;color:#333333;letter-spacing:-0">预测结果</span></strong>
                        </p>
                    </td>
                </tr>
                <tr style=";height:32px">
                    <td width="99" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">1</span>
                        </p>
                    </td>
                    <td width="76" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="74" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="110" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="133" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">1, 21, 24, <span
                                    style="letter-spacing:-0">26</span></span>
                        </p>
                    </td>
                    <td width="69" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                        </p>
                    </td>
                    <td width="99" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:32px">
                    <td width="99" valign="top"
                        style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">2</span>
                        </p>
                    </td>
                    <td width="76" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="74" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                        </p>
                    </td>
                    <td width="110" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.5</span>
                        </p>
                    </td>
                    <td width="133" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333">2, 21, 24, <span
                                    style="letter-spacing:-0">26</span></span>
                        </p>
                    </td>
                    <td width="69" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                        </p>
                    </td>
                    <td width="99" valign="top"
                        style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                        <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                            <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                        </p>
                    </td>
                </tr>
                <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">3</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">2</span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">3, 21, 23, <span
                                style="letter-spacing:-0">25</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                    </p>
                </td>
            </tr>
            <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">4</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">15</span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">4, 22, 24, <span
                                style="letter-spacing:-0">26</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                    </p>
                </td>
            </tr>
            <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">5</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">15</span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.5</span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">5, 22, 24, <span
                                style="letter-spacing:-0">26</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                    </p>
                </td>
            </tr>
            <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">6</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">15</span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">2</span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">6, 22, 23, <span
                                style="letter-spacing:-0">25</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                    </p>
                </td>
            </tr>
            <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">7</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">400</span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">7, 22, 24, <span
                                style="letter-spacing:-0">26</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                    </p>
                </td>
            </tr>
            <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">8</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">400</span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.5</span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">8, 22, 24, <span
                                style="letter-spacing:-0">26</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                    </p>
                </td>
            </tr>
            <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">9</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">400</span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">2</span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">9, 22, 23, <span
                                style="letter-spacing:-0">25</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                    </p>
                </td>
            </tr>
            <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">10</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">700</span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">10, 19, 24, <span
                                style="letter-spacing:   -0">26</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                    </p>
                </td>
            </tr>
            <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">11</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">700</span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.5</span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">11, 19, 24, <span
                                style="letter-spacing:   -0">26</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px; word-break: break-all;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                    </p>
                </td>
            </tr>
            <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">12</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">700</span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">2</span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">12, 19, 23, <span
                                style="letter-spacing:   -0">25</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                    </p>
                </td>
            </tr>
            <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">13</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">700</span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">15</span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">13, 20, 24, <span
                                style="letter-spacing:   -0">26</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                    </p>
                </td>
            </tr>
            <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">14</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">300</span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">15</span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.5</span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">14, 20, 24, <span
                                style="letter-spacing:   -0">26</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">aceij</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">50</span>
                    </p>
                </td>
            </tr>
            <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">15</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">700</span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">15</span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">2</span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">15, 20, 23, <span
                                style="letter-spacing:   -0">25</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                    </p>
                </td>
            </tr>
            <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">16</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">700</span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">400</span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">-<span style="letter-spacing:-1px">1</span></span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">16, 20, 24, <span
                                style="letter-spacing:   -0">26</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                    </p>
                </td>
            </tr>
            <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">17</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">700</span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">400</span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">0.5</span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">17, 20, 24, <span
                                style="letter-spacing:   -0">26</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                    </p>
                </td>
            </tr>
            <tr style=";height:32px">
                <td width="99" valign="top"
                    style="border-right: 1px solid rgb(223, 226, 229); border-bottom: 1px solid rgb(223, 226, 229); border-left: 1px solid rgb(223, 226, 229); border-image: initial; border-top: none; background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">18</span>
                    </p>
                </td>
                <td width="76" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">700</span>
                    </p>
                </td>
                <td width="74" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">400</span>
                    </p>
                </td>
                <td width="110" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">2</span>
                    </p>
                </td>
                <td width="133" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:13px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333">18, 20, 23, <span
                                style="letter-spacing:   -0">25</span></span>
                    </p>
                </td>
                <td width="69" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">ab</span>
                    </p>
                </td>
                <td width="99" valign="top"
                    style="border-top: none; border-left: none; border-bottom: 1px solid rgb(223, 226, 229); border-right: 1px solid rgb(223, 226, 229); background: rgb(248, 248, 248); padding: 0px;">
                    <p style="margin-top:9px;margin-right:0;margin-bottom:   0;margin-left:14px;margin-bottom:0">
                        <span style="font-size:13px;color:#333333;letter-spacing:   -0">&quot;False&quot;</span>
                    </p>
                </td>
            </tr>
        </tbody>
    </table>
    <p>
        <br />
    </p>
</div></template>

<script>
export default {
    name: 'SalesQuestion',
    components: {},
    props: {},
    data() {
        return {
            questionData: [
                {
                    con: '销售额>2000000',
                    t: 'T1',
                    f: 'F1',
                },
                {
                    con: '请假天数<=10 ',
                    t: 'T2',
                    f: 'F2',
                },
                {
                    con: '现金到账<=0.85',
                    t: 'T3',
                    f: 'F3',
                },
                {
                    con: '现金到账>=0.6',
                    t: 'T4',
                    f: 'F4',
                },
                {
                    con: '销售额<0',
                    t: 'T5',
                    f: 'F5',
                },
                {
                    con: '请假天数<0',
                    t: 'T6',
                    f: 'F6',
                },
                {
                    con: '现金到账<0',
                    t: 'T7',
                    f: 'F7',
                },
            ],
        }
    },
    computed: {},
    watch: {},
    created() { },
    mounted() { },
    methods: {},
}
</script>

<style scoped lang="less"></style>
