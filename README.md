# sbt-plugin-simple

1. в sbt shell основного проекта надо написать:

 
```bash
sbt> compile

# создаст публикацию в ~/.m2/repository/ru/dvi
sbt> publishM2

# создаст публикацию в ~/.ivy2/local 
sbt> publishLocal 
```

2. Перейти в терминал 

```bash
# перейти в папку .\src\sbt-test\sbt-hello\test1\
cd .\src\sbt-test\sbt-hello\test1\

# запустить sbt
..\sbt-plugin-simple\src\sbt-test\sbt-hello\test1> sbt
```   

```log
[info] welcome to sbt 1.7.1 (Oracle Corporation Java 11.0.2)
[info] loading global plugins from C:\Users\nonameuser\.sbt\1.0\plugins
[info] loading settings for project test1-build from plugins.sbt ...
[info] loading project definition from C:\Users\nonameuser\IdeaProjects\sbt-plugins\sbt-plugin-simple\src\sbt-test\sbt-hello\test1\Project
[info] loading settings for project root from build.sbt ...
[info] set current project to root (in build file:/C:/Users/nonameuser/IdeaProjects/sbt-plugins/sbt-plugin-simple/src/sbt-test/sbt-hello/test1/)
[info] sbt server started at local:sbt-server-764b9ac079618fe7397c
[info] started sbt server
```

```bash
sbt:root> hello
```
```log
[info] hi
[success] Total time: 0 s, completed 9 ╨╕╤О╨╗. 2024 ╨│., 13:06:43
```

## все работает!



