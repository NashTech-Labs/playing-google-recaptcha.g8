# Playing with Google reCAPTCHA
Basic example to integrate Google reCAPTCHA in Play Application with the help of play-recaptcha module

###[Play reCAPTCHA Module](http://chrisnappin.github.io/play-recaptcha/)
This is a Play Framework module, for Scala and Play 2.x, to provide integration with Google reCAPTCHA (version 1 or 2) in a reactive (non-blocking) manner.

![alt tag](/public/images/google-recaptcha-example-v1.png) ![alt tag](/public/images/google-recaptcha-example-v2.png)

- Used [Play reCAPTCHA](http://chrisnappin.github.io/play-recaptcha/) module to integrate Google reCAPTCHA API
- Embedded JS & CSS libraries with [WebJars](http://www.webjars.org/).
- Integrating with a CSS framework (Twitter Bootstrap)
- Bootswatch-Darkly with Twitter Bootstrap to improve the look and feel of the application

###Registration Form Screen
![alt tag](/public/images/google_recaptcha_form.png)

###Result Screen
![alt tag](/public/images/google_rechptcha_result.png)

-----------------------------------------------------------------------
###Dependency
-----------------------------------------------------------------------
The play-recaptcha module is distributed using Maven Central so it can be easily added as a library dependency in your Play Application's SBT build scripts, as follows:

```
"com.nappin" %% "play-recaptcha" % "1.0"
```

-----------------------------------------------------------------------
###Configuration
-----------------------------------------------------------------------
The play-recaptcha module supports the following basic configuration settings in your application.conf file:
```
recaptcha.apiVersion=2
recaptcha.privateKey=<YOUR Google reCAPTCHA privateKey>
recaptcha.publicKey=<YOUR Google reCAPTCHA publicKey>
#recpatcha.requestTimeout=10 seconds
recaptcha.theme=light
recaptcha.type=image
```
for more info check [here](https://github.com/chrisnappin/play-recaptcha/wiki/high-level-api#configuration)

-----------------------------------------------------------------------
###Build Instructions
-----------------------------------------------------------------------
* To run the Play Framework, you need JDK 6 or later
* Install Typesafe Activator if you do not have it already. You can get it from [here](http://www.playframework.com/download) 
* Execute `./activator clean compile` to build the product
* Execute `./activator run` to execute the product
* playing-google-recaptcha should now be accessible at localhost:9000

-----------------------------------------------------------------------
###References
-----------------------------------------------------------------------
* [Play Framework](http://www.playframework.com/)
* [Play reCAPTCHA](http://chrisnappin.github.io/play-recaptcha/)
* [Bootstrap](http://getbootstrap.com/css/)
* [Bootswatch](http://bootswatch.com/darkly/)
* [WebJars](http://www.webjars.org/)
