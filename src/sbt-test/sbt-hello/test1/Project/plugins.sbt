

// через maven тоже работает и плагин подключается
// C:\Users\DmVIvakin\.m2\repository\ru\dvi\sbt-hello_2.12_1.0\
//
// resolvers += Resolver.mavenLocal
// resolvers += MavenCache("local-maven", file("~/.m2/"))


// через ivy подключается плагин
//C:\Users\DmVIvakin\.ivy2\local\ru.dvi\sbt-hello\scala_2.12\sbt_1.0\
//
val ivyLocal = Resolver.file("local", file(Path.userHome.absolutePath + "/.ivy2/local"))(Resolver.ivyStylePatterns)
resolvers +=  ivyLocal


addSbtPlugin("ru.dvi" % "sbt-hello" % "0.1.0-SNAPSHOT")