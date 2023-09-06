$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FB.feature");
formatter.feature({
  "name": "To validate the login functionality of github application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "To validate login with valid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "name": "To launch the chrome browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveandNegativeFb.to_launch_the_chrome_browser_and_maximize_the_window()"
});
formatter.result({
  "error_message": "io.github.bonigarcia.wdm.config.WebDriverManagerException: io.github.bonigarcia.wdm.config.WebDriverManagerException: java.net.UnknownHostException: chromedriver.storage.googleapis.com\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:1140)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:933)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.fallback(WebDriverManager.java:1156)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:1137)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:933)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:1130)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:933)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.setup(WebDriverManager.java:337)\r\n\tat org.base.BaseClass.launchBrowser(BaseClass.java:32)\r\n\tat org.stepdefinition.PositiveandNegativeFb.to_launch_the_chrome_browser_and_maximize_the_window(PositiveandNegativeFb.java:14)\r\n\tat ✽.To launch the chrome browser and maximize the window(file:src/test/resources/FB.feature:8)\r\nCaused by: io.github.bonigarcia.wdm.config.WebDriverManagerException: java.net.UnknownHostException: chromedriver.storage.googleapis.com\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.getDriversFromXml(WebDriverManager.java:1286)\r\n\tat io.github.bonigarcia.wdm.managers.ChromeDriverManager.getDriverUrls(ChromeDriverManager.java:105)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.createUrlHandler(WebDriverManager.java:1161)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.download(WebDriverManager.java:1009)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:927)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.fallback(WebDriverManager.java:1156)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:1137)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:933)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:1130)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:933)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.setup(WebDriverManager.java:337)\r\n\tat org.base.BaseClass.launchBrowser(BaseClass.java:32)\r\n\tat org.stepdefinition.PositiveandNegativeFb.to_launch_the_chrome_browser_and_maximize_the_window(PositiveandNegativeFb.java:14)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:529)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:756)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:452)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\nCaused by: java.net.UnknownHostException: chromedriver.storage.googleapis.com\r\n\tat java.base/java.net.InetAddress$CachedAddresses.get(InetAddress.java:801)\r\n\tat java.base/java.net.InetAddress.getAllByName0(InetAddress.java:1524)\r\n\tat java.base/java.net.InetAddress.getAllByName(InetAddress.java:1381)\r\n\tat java.base/java.net.InetAddress.getAllByName(InetAddress.java:1305)\r\n\tat org.apache.hc.client5.http.SystemDefaultDnsResolver.resolve(SystemDefaultDnsResolver.java:43)\r\n\tat org.apache.hc.client5.http.impl.io.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:118)\r\n\tat org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:409)\r\n\tat org.apache.hc.client5.http.impl.classic.InternalExecRuntime.connectEndpoint(InternalExecRuntime.java:164)\r\n\tat org.apache.hc.client5.http.impl.classic.InternalExecRuntime.connectEndpoint(InternalExecRuntime.java:174)\r\n\tat org.apache.hc.client5.http.impl.classic.ConnectExec.execute(ConnectExec.java:135)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement.execute(ExecChainElement.java:51)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement$1.proceed(ExecChainElement.java:57)\r\n\tat org.apache.hc.client5.http.impl.classic.ProtocolExec.execute(ProtocolExec.java:172)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement.execute(ExecChainElement.java:51)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement$1.proceed(ExecChainElement.java:57)\r\n\tat org.apache.hc.client5.http.impl.classic.HttpRequestRetryExec.execute(HttpRequestRetryExec.java:93)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement.execute(ExecChainElement.java:51)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement$1.proceed(ExecChainElement.java:57)\r\n\tat org.apache.hc.client5.http.impl.classic.ContentCompressionExec.execute(ContentCompressionExec.java:128)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement.execute(ExecChainElement.java:51)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement$1.proceed(ExecChainElement.java:57)\r\n\tat org.apache.hc.client5.http.impl.classic.RedirectExec.execute(RedirectExec.java:116)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement.execute(ExecChainElement.java:51)\r\n\tat org.apache.hc.client5.http.impl.classic.InternalHttpClient.doExecute(InternalHttpClient.java:178)\r\n\tat org.apache.hc.client5.http.impl.classic.CloseableHttpClient.execute(CloseableHttpClient.java:75)\r\n\tat org.apache.hc.client5.http.impl.classic.CloseableHttpClient.execute(CloseableHttpClient.java:89)\r\n\tat io.github.bonigarcia.wdm.online.HttpClient.execute(HttpClient.java:158)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.getDriversFromXml(WebDriverManager.java:1271)\r\n\t... 50 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To launch the url of the facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveandNegativeFb.to_launch_the_url_of_the_facebook_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To pass valid username in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeFb.to_pass_valid_username_in_email_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To pass invalid password in password field",
  "keyword": "But "
});
formatter.match({
  "location": "PositiveandNegativeFb.to_pass_invalid_password_in_password_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeFb.to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To check whether navigate to homepage or not",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveandNegativeFb.to_check_whether_navigate_to_homepage_or_not()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveandNegativeFb.to_Close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});