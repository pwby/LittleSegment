<?xml version="1.0" encoding="UTF-8"?>
<project  xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <groupId>com.pwby</groupId>
    <artifactId>AnalyzeOfPoem</artifactId>
    <version>1.0-SNAPSHOT</version>

    <packaging>jar</packaging>
    <name>AnalyzeOfPoem</name>

    <description>
        这是一个关于唐诗分析的项目
    </description>

    <developers>
        <developer>
            <id>01</id>
            <name>pwby</name>
            <email>wbyjuly@163.com</email>
            <roles>
                <role>Creator</role>
                <role>developer</role>
            </roles>
        </developer>
    </developers>
    <properties>
        <encoding>UTF-8</encoding>
        <java.version>1.8</java.version>
        <maven.compiler.source>${java.version}</maven.compiler.source>
        <maven.compiler.targer>${java.version}</maven.compiler.targer>
    </properties>


    <dependencies>
        <!--配置数据库驱动-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.47</version>
        </dependency>
  
        <!--配置数据库连接池-->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
            <version>1.1.13</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.ansj/ansj_seg -->
        <!--文本分词-->
        <dependency>
            <groupId>org.ansj</groupId>
            <artifactId>ansj_seg</artifactId>
            <version>5.1.1</version>
        </dependency>

      <!--编译时自动生成代码的库-->
        <!--1.安装lombok插件  2.设置中启用注解处理器-->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.16.22</version>
            <scope>provided</scope>
        </dependency>

        <!--基于jetty嵌入式javaWeb容器开发的web应用工具-->
        <dependency>
            <groupId>com.sparkjava</groupId>
            <artifactId>spark-core</artifactId>
            <version>2.3</version>
        </dependency>

        <!--网页解析工具-->
        <dependency>
            <groupId>net.sourceforge.htmlunit</groupId>
            <artifactId>htmlunit</artifactId>
            <version>2.18</version>
            <exclusions>
                <exclusion>
                    <groupId>org.eclipse.jetty</groupId>
                    <artifactId>jetty-util</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

    </dependencies>

    <build>
        <plugins>
            <!--配置打包插件,设置主类和classpath-->
            <plugin>
                <!-- https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-jar-plugin -->
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-jar-plugin</artifactId>
                    <version>3.1.0</version>
                <configuration>
                    <archive>
                        <manifest>
                          <addClasspath>true</addClasspath>
                          <classpathPrefix>lib</classpathPrefix>
                            <mainClass>com.pwby.application</mainClass>
                        </manifest>>
                    </archive>
                </configuration>
            </plugin>

            <plugin>
                <!--配置依赖插件,复制程序依赖的jar包-->
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-dependency-plugin</artifactId>
                <version>3.1.1</version>
                <executions>
                    <execution>
                        <id>copy-dependency</id>
                        <goals>
                            <goal>copy-dependencies</goal>
                        </goals>
                        <phase>package</phase>
                        <configuration>
                            <outputDirectory>${project.build.directory}/lib</outputDirectory>
                           
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>

</project>