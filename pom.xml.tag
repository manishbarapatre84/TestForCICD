<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.6.6</version>
	</parent>
	<groupId>com.example</groupId>
	<artifactId>easy-notes</artifactId>
	<version>2.1-RC02</version>
	<name>spring-boot-rest-jpa</name>
	<description>Rest API for a Comments Application</description>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<java.version>1.8</java.version>
	</properties>


	<scm>
		<connection>scm:git:git@github.com:manishbarapatre84/TestForCICD.git</connection>
		<url>scm:git:git@github.com:manishbarapatre84/TestForCICD.git</url>
		<developerConnection>scm:git:git@github.com:manishbarapatre84/TestForCICD.git</developerConnection>
		<tag>solocal-refentreprive-2.1-RC02</tag>
	</scm>


	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>

		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>



	</dependencies>

	<build>
		<!-- <finalName>${project.artifactId}</finalName> -->
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>

			<plugin>
				<artifactId>maven-release-plugin</artifactId>
				<executions>
					<execution>
						<id>default</id>
						<goals>
							<goal>perform</goal>
						</goals>
						<configuration>
							<pomFileName>${project.name}/pom.xml</pomFileName>
						</configuration>
					</execution>
				</executions>
			</plugin>

		</plugins>

		<resources>
			<resource>
				<directory>src/main/resources/</directory>
				<filtering>true</filtering>
			</resource>
		</resources>

	</build>

	<profiles>
		<profile>
			<id>dev</id>
			<build>
				<finalName>${project.artifactId}-dev</finalName>
				<filters>
					<filter>src/main/resources/dev.properties</filter>
				</filters>
			</build>
		</profile>

		<profile>
			<id>qa</id>
			<build>
				<finalName>${project.artifactId}-qa</finalName>
				<filters>
					<filter>src/main/resources/qa.properties</filter>
				</filters>
			</build>
		</profile>

	</profiles>


</project>