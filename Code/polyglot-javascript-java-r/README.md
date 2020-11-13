# GraalVM demos: Polyglot JavaScript, Java, R application

This repository contains the code for a demo application for [GraalVM](graalvm.org).

## Prerequisites
* [GraalVM](http://graalvm.org)

## Preparation

1. Installing R


2. `npm install`

3. Running the application

```
<Path-to-GraalVM>/bin/node --jvm --polyglot server.js
```

If you would like to run the benchmark on a different instance of Node, you can run it with whatever `node` you have. However, usually the polyglot capability won't be supported and the app won't run successfully.

Open [localhost:3000](localhost:3000) and enjoy the output of the polyglot app. Play with the source code and restart the application to see what else can you do with the mix of JavaScript, Java, and R.

## Debugging Polyglot Applications

GraalVM supports debugging polyglot applications too, add the `--inspect` parameter to the command line, open the url the application prints at the startup in Chrome browser and you can debug, set breakpoints, evaluate expressions in this app in the JavaScript and R code alike.


# Error


```

--polyglot server.js
Example app listening on port 3000!
FastR unexpected failure: error loading libR from: /home/ayman/.sdkman/candidates/java/20.1.0.r11-grl/languages/R/lib/libR.so.
Message: libgfortran.so.3: cannot open shared object file: No such file or directory

Troubleshooting: 

  * Please run /home/ayman/.sdkman/candidates/java/20.1.0.r11-grl/languages/R/bin/configure_fastr. It will check that your system has the necessary dependencies and if not it will suggest how to install them.

  * If this does not help, please open an issue on https://github.com/oracle/fastr/ or reach us on https://graalvm.slack.com.


/home/ayman/Desktop/graalvm/youtube-graalvm/Code/polyglot-javascript-java-r/server.js:19
  text += Polyglot.eval('R',
                   ^

Error
    at Object.eval (native)
    at /home/ayman/Desktop/graalvm/youtube-graalvm/Code/polyglot-javascript-java-r/server.js:19:20
    at Layer.handle (/home/ayman/Desktop/graalvm/youtube-graalvm/Code/polyglot-javascript-java-r/node_modules/express/lib/router/layer.js:95:5)
    at next (/home/ayman/Desktop/graalvm/youtube-graalvm/Code/polyglot-javascript-java-r/node_modules/express/lib/router/route.js:137:13)
    at Route.dispatch (/home/ayman/Desktop/graalvm/youtube-graalvm/Code/polyglot-javascript-java-r/node_modules/express/lib/router/route.js:112:3)
    at Layer.handle (/home/ayman/Desktop/graalvm/youtube-graalvm/Code/polyglot-javascript-java-r/node_modules/express/lib/router/layer.js:95:5)
    at /home/ayman/Desktop/graalvm/youtube-graalvm/Code/polyglot-javascript-java-r/node_modules/express/lib/router/index.js:281:22
    at Function.process_params (/home/ayman/Desktop/graalvm/youtube-graalvm/Code/polyglot-javascript-java-r/node_modules/express/lib/router/index.js:335:12)
    at next (/home/ayman/Desktop/graalvm/youtube-graalvm/Code/polyglot-javascript-java-r/node_modules/express/lib/router/index.js:275:10)
    at expressInit (/home/ayman/Desktop/graalvm/youtube-graalvm/Code/polyglot-javascript-java-r/node_modules/express/lib/middleware/init.js:40:5)

```