<#macro registrationLayout bodyClass="" displayInfo=false displayMessage=true displayRequiredFields=false showAnotherWayIfPresent=true>
    <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
    <html xmlns="http://www.w3.org/1999/xhtml" class="${properties.kcHtmlClass!}">
        <head>
            <meta charset="utf-8">
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <meta name="robots" content="noindex, nofollow">
            <#if properties.meta?has_content>
                <#list properties.meta?split(' ') as meta>
                    <meta name="${meta?split('==')[0]}" content="${meta?split('==')[1]}"/>
                </#list>
            </#if>
            <title>
                ${msg("loginTitle",(realm.displayName!''))}
            </title>
            <link rel="icon" href="${url.resourcesPath}/img/favicon.ico" />
            <#if properties.stylesCommon?has_content>
                <#list properties.stylesCommon?split(' ') as style>
                    <link href="${url.resourcesCommonPath}/${style}" rel="stylesheet" />
                </#list>
            </#if>
            <#if properties.styles?has_content>
                <#list properties.styles?split(' ') as style>
                    <link href="${url.resourcesPath}/${style}" rel="stylesheet" />
                </#list>
            </#if>
            <#if properties.scripts?has_content>
                <#list properties.scripts?split(' ') as script>
                    <script src="${url.resourcesPath}/${script}" type="text/javascript"></script>
                </#list>
            </#if>
            <#if scripts??>
                <#list scripts as script>
                    <script src="${script}" type="text/javascript"></script>
                </#list>
            </#if>
        </head>
        <body class="${properties.kcBodyClass!}">
            <div class="${properties.kcLoginClass!}">
                <div id="kc-header" class="${properties.kcHeaderClass!}">
                <a onclick="window.location.href = window.document.referrer">
                        <img id="header-logo-desktop" src="${url.resourcesPath}/img/digital-sofia-logo.svg" class="logo desktop-logo" width="380px" height="240px" alt="digitall sofia logo">
                    </a>
                </div>
            <div class="sm-content">
                    <div class="sm-language">
                        <#--  <#if realm.internationalizationEnabled  && locale.supported?size gt 1>
                            <div class="${properties.kcLocaleMainClass!}" id="kc-locale">
                                <div id="kc-locale-wrapper" class="${properties.kcLocaleWrapperClass!}">
                                    <div id="kc-locale-dropdown" class="${properties.kcLocaleDropDownClass!}">
                                        <a href="#" id="kc-current-locale-link">
                                            ${locale.current}
                                        </a>
                                        <ul class="${properties.kcLocaleListClass!}">
                                            <#list locale.supported as l>
                                                <li class="${properties.kcLocaleListItemClass!}">
                                                    <a class="${properties.kcLocaleItemClass!}" href="${l.url}">
                                                        ${l.label}
                                                    </a>
                                                </li>
                                            </#list>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </#if>  -->
                    </div>
                    <div id="sm-back-button-container">
                        <button class="sm-back-button" 
                            aria-label="Назад бутон. Натиснете за да се върнете на предишната страница"
                            onclick="goBack()">
                            ${msg("doBack")}
                        </button>
                    </div>
                    <div class="${properties.kcFormCardClass!}">
                        <header class="${properties.kcFormHeaderClass!}">
                            <h1 id="kc-page-title"><#nested "header"></h1>
                        </header>
                        <div id="kc-content">
                            <div id="kc-content-wrapper">
                                <#-- App-initiated actions should not see warning messages about the need to complete the action -->
                                <#-- during login.                                                                               -->
                                <#if displayMessage && message?has_content && (message.type != ' warning' || !isAppInitiatedAction??) && message.type !='info'>
                    <div id="pf-c-alert" class="alert-${message.type} ${properties.kcAlertClass!} pf-m-<#if message.type = 'error'>danger<#else> ${message.type}</#if>">
                        <div class="alert-heading">
                            ${msg("alertHeading-${message.type}")}
                        </div>
                        <p class="${properties.kcAlertTitleClass!}">
                            ${kcSanitize(message.summary)?no_esc}
                        </p>
                    </div>
            </#if>
            <#nested "form">
                <#if auth?has_content && auth.showTryAnotherWayLink() && showAnotherWayIfPresent>
                    <form id="kc-select-try-another-way-form" action="${url.loginAction}" method="post">
                        <div class="${properties.kcFormGroupClass!}">
                            <input type="hidden" name="tryAnotherWay" value="on" />
                            <a href="#" id="try-another-way"
                                onclick="document.forms['kc-select-try-another-way-form'].submit();return false;">
                                ${msg("doTryAnotherWay")}
                            </a>
                        </div>
                    </form>
                </#if>
                <#if displayInfo>
                    <div id="kc-info" class="${properties.kcSignUpClass!}">
                        <div id="kc-info-wrapper" class="${properties.kcInfoAreaWrapperClass!}">
                            <#nested "info">
                        </div>
                    </div>
                </#if>
                </div>
                </div>
                </div>
                </div>
                </div>
        </body>
    </html>
</#macro>