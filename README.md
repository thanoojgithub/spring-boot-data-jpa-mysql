# spring-boot-data-jpa-mysql
spring-boot-data-jpa-mysql



PS E:\sourceCode\spring-boot-data-jpa-mysql> mvn clean install spring-boot:run
[INFO] Scanning for projects...
[INFO]
[INFO] -----------< com.springbootmysql:spring-boot-data-jpa-mysql >-----------
[INFO] Building spring-boot-data-jpa-mysql 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ spring-boot-data-jpa-mysql ---
[INFO] Deleting E:\sourceCode\spring-boot-data-jpa-mysql\target
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ spring-boot-data-jpa-mysql ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ spring-boot-data-jpa-mysql ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 5 source files to E:\sourceCode\spring-boot-data-jpa-mysql\target\classes
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ spring-boot-data-jpa-mysql ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory E:\sourceCode\spring-boot-data-jpa-mysql\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ spring-boot-data-jpa-mysql ---
[INFO] No sources to compile
[INFO]
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ spring-boot-data-jpa-mysql ---
[INFO] No tests to run.
[INFO]
[INFO] --- maven-jar-plugin:3.2.0:jar (default-jar) @ spring-boot-data-jpa-mysql ---
[INFO] Building jar: E:\sourceCode\spring-boot-data-jpa-mysql\target\spring-boot-data-jpa-mysql-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- spring-boot-maven-plugin:2.3.1.RELEASE:repackage (repackage) @ spring-boot-data-jpa-mysql ---
[INFO] Replacing main artifact with repackaged archive
[INFO]
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ spring-boot-data-jpa-mysql ---
[INFO] Installing E:\sourceCode\spring-boot-data-jpa-mysql\target\spring-boot-data-jpa-mysql-0.0.1-SNAPSHOT.jar to C:\Users\thanooj\.m2\repository\com\springbootmysql\spring-boot-data-jpa-mysql\0.0.1-SNAPSHOT\spring-boot-data-jpa-mysql-0.0.1-SNAPSHOT.jar
[INFO] Installing E:\sourceCode\spring-boot-data-jpa-mysql\pom.xml to C:\Users\thanooj\.m2\repository\com\springbootmysql\spring-boot-data-jpa-mysql\0.0.1-SNAPSHOT\spring-boot-data-jpa-mysql-0.0.1-SNAPSHOT.pom
[INFO]
[INFO] >>> spring-boot-maven-plugin:2.3.1.RELEASE:run (default-cli) > test-compile @ spring-boot-data-jpa-mysql >>>
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ spring-boot-data-jpa-mysql ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ spring-boot-data-jpa-mysql ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 5 source files to E:\sourceCode\spring-boot-data-jpa-mysql\target\classes
[INFO]
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ spring-boot-data-jpa-mysql ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory E:\sourceCode\spring-boot-data-jpa-mysql\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ spring-boot-data-jpa-mysql ---
[INFO] No sources to compile
[INFO]
[INFO] <<< spring-boot-maven-plugin:2.3.1.RELEASE:run (default-cli) < test-compile @ spring-boot-data-jpa-mysql <<<
[INFO]
[INFO]
[INFO] --- spring-boot-maven-plugin:2.3.1.RELEASE:run (default-cli) @ spring-boot-data-jpa-mysql ---
[INFO] Attaching agents: []
16:08:07.980 [main] INFO com.springbootmysql.springbootdatajpamysql.exception.NotFoundException - SpringBootDataJpaMysqlApplication
16:08:08.414 [restartedMain] INFO com.springbootmysql.springbootdatajpamysql.exception.NotFoundException - SpringBootDataJpaMysqlApplication

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.1.RELEASE)

←[30m2020-06-20 16:08:09,111←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.springframework.boot.StartupInfoLogger←[0;39m: Starting SpringBootDataJpaMysqlApplication on DESKTOP-4NSRVRR with PID 8372 (E:\sourceCode\spring-boot-data-jpa-mysql\target\classes started by thanooj in E:\sourceCode\spring-boot-data-jpa-mysql)
←[30m2020-06-20 16:08:09,115←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.springframework.boot.SpringApplication←[0;39m: No active profile set, falling back to default profiles: default
←[30m2020-06-20 16:08:09,190←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.springframework.boot.logging.DeferredLog←[0;39m: Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
←[30m2020-06-20 16:08:09,191←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.springframework.boot.logging.DeferredLog←[0;39m: For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
←[30m2020-06-20 16:08:10,257←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.springframework.data.repository.config.RepositoryConfigurationDelegate←[0;39m: Bootstrapping Spring Data JPA repositories in DEFERRED mode.
←[30m2020-06-20 16:08:10,345←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.springframework.data.repository.config.RepositoryConfigurationDelegate←[0;39m: Finished Spring Data repository scanning in 74ms. Found 1 JPA repository interfaces.
←[30m2020-06-20 16:08:11,515←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.springframework.boot.web.embedded.tomcat.TomcatWebServer←[0;39m: Tomcat initialized with port(s): 8080 (http)
←[30m2020-06-20 16:08:11,532←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.apache.juli.logging.DirectJDKLog←[0;39m: Initializing ProtocolHandler ["http-nio-8080"]
←[30m2020-06-20 16:08:11,533←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.apache.juli.logging.DirectJDKLog←[0;39m: Starting service [Tomcat]
←[30m2020-06-20 16:08:11,534←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.apache.juli.logging.DirectJDKLog←[0;39m: Starting Servlet engine: [Apache Tomcat/9.0.36]
←[30m2020-06-20 16:08:11,680←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.apache.juli.logging.DirectJDKLog←[0;39m: Initializing Spring embedded WebApplicationContext
←[30m2020-06-20 16:08:11,680←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.springframework.boot.web.servlet.context.ServletWebServerApplicationContext←[0;39m: Root WebApplicationContext: initialization completed in 2487 ms
←[30m2020-06-20 16:08:11,924←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.springframework.scheduling.concurrent.ExecutorConfigurationSupport←[0;39m: Initializing ExecutorService 'applicationTaskExecutor'
←[30m2020-06-20 16:08:11,969←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33mcom.springbootmysql.springbootdatajpamysql.exception.NotFoundException←[0;39m: NotFoundException
←[30m2020-06-20 16:08:11,982←[0;39m ←[34mINFO ←[0;39m [←[34mtask-1←[0;39m] ←[33morg.hibernate.jpa.internal.util.LogHelper←[0;39m: HHH000204: Processing PersistenceUnitInfo [name: default]
←[30m2020-06-20 16:08:12,060←[0;39m ←[34mINFO ←[0;39m [←[34mtask-1←[0;39m] ←[33morg.hibernate.Version←[0;39m: HHH000412: Hibernate ORM core version 5.4.17.Final
←[30m2020-06-20 16:08:12,233←[0;39m ←[34mINFO ←[0;39m [←[34mtask-1←[0;39m] ←[33morg.hibernate.annotations.common.reflection.java.JavaReflectionManager←[0;39m: HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
←[30m2020-06-20 16:08:12,356←[0;39m ←[34mINFO ←[0;39m [←[34mtask-1←[0;39m] ←[33mcom.zaxxer.hikari.HikariDataSource←[0;39m: HikariPool-1 - Starting...
←[30m2020-06-20 16:08:12,951←[0;39m ←[34mINFO ←[0;39m [←[34mtask-1←[0;39m] ←[33mcom.zaxxer.hikari.HikariDataSource←[0;39m: HikariPool-1 - Start completed.
←[30m2020-06-20 16:08:12,981←[0;39m ←[34mINFO ←[0;39m [←[34mtask-1←[0;39m] ←[33morg.hibernate.dialect.Dialect←[0;39m: HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
Hibernate: drop table if exists customer
Hibernate: drop table if exists hibernate_sequence
Hibernate: create table customer (id bigint not null, location varchar(255), name varchar(255), primary key (id)) engine=InnoDB
Hibernate: create table hibernate_sequence (next_val bigint) engine=InnoDB
Hibernate: insert into hibernate_sequence values ( 1 )
←[30m2020-06-20 16:08:14,253←[0;39m ←[34mINFO ←[0;39m [←[34mtask-1←[0;39m] ←[33morg.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator←[0;39m: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
←[30m2020-06-20 16:08:14,269←[0;39m ←[34mINFO ←[0;39m [←[34mtask-1←[0;39m] ←[33morg.springframework.orm.jpa.AbstractEntityManagerFactoryBean←[0;39m: Initialized JPA EntityManagerFactory for persistence unit 'default'
Hibernate: select next_val as id_val from hibernate_sequence for update
Hibernate: update hibernate_sequence set next_val= ? where next_val=?
Hibernate: insert into customer (location, name, id) values (?, ?, ?)
Hibernate: select next_val as id_val from hibernate_sequence for update
Hibernate: update hibernate_sequence set next_val= ? where next_val=?
Hibernate: insert into customer (location, name, id) values (?, ?, ?)
←[30m2020-06-20 16:08:14,740←[0;39m ←[34mINFO ←[0;39m [←[34mtask-2←[0;39m] ←[33morg.springframework.boot.devtools.autoconfigure.OptionalLiveReloadServer←[0;39m: LiveReload server is running on port 35729
←[30m2020-06-20 16:08:14,798←[0;39m ←[31mWARN ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration$JpaWebConfiguration←[0;39m: spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
←[30m2020-06-20 16:08:15,216←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.apache.juli.logging.DirectJDKLog←[0;39m: Starting ProtocolHandler ["http-nio-8080"]
←[30m2020-06-20 16:08:15,250←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.springframework.boot.web.embedded.tomcat.TomcatWebServer←[0;39m: Tomcat started on port(s): 8080 (http) with context path ''
←[30m2020-06-20 16:08:15,253←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.springframework.data.repository.config.DeferredRepositoryInitializationListener←[0;39m: Triggering deferred initialization of Spring Data repositoriesà
←[30m2020-06-20 16:08:15,254←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.springframework.data.repository.config.DeferredRepositoryInitializationListener←[0;39m: Spring Data repositories initialized!
←[30m2020-06-20 16:08:15,269←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33morg.springframework.boot.StartupInfoLogger←[0;39m: Started SpringBootDataJpaMysqlApplication in 6.838 seconds (JVM running for 7.81)
←[30m2020-06-20 16:08:15,274←[0;39m ←[34mINFO ←[0;39m [←[34mrestartedMain←[0;39m] ←[33mcom.springbootmysql.springbootdatajpamysql.SpringBootDataJpaMysqlApplication←[0;39m: SpringBootDataJpaMysqlApplication
←[30m2020-06-20 16:08:50,204←[0;39m ←[34mINFO ←[0;39m [←[34mhttp-nio-8080-exec-1←[0;39m] ←[33morg.apache.juli.logging.DirectJDKLog←[0;39m: Initializing Spring DispatcherServlet 'dispatcherServlet'
←[30m2020-06-20 16:08:50,205←[0;39m ←[34mINFO ←[0;39m [←[34mhttp-nio-8080-exec-1←[0;39m] ←[33morg.springframework.web.servlet.FrameworkServlet←[0;39m: Initializing Servlet 'dispatcherServlet'
←[30m2020-06-20 16:08:50,222←[0;39m ←[34mINFO ←[0;39m [←[34mhttp-nio-8080-exec-1←[0;39m] ←[33morg.springframework.web.servlet.FrameworkServlet←[0;39m: Completed initialization in 14 ms
←[30m2020-06-20 16:08:50,261←[0;39m ←[34mINFO ←[0;39m [←[34mhttp-nio-8080-exec-1←[0;39m] ←[33mcom.springbootmysql.springbootdatajpamysql.resources.CustomerController←[0;39m: getAll
Hibernate: select customer0_.id as id1_0_, customer0_.location as location2_0_, customer0_.name as name3_0_ from customer customer0_
←[30m2020-06-20 16:09:16,934←[0;39m ←[34mINFO ←[0;39m [←[34mhttp-nio-8080-exec-3←[0;39m] ←[33mcom.springbootmysql.springbootdatajpamysql.resources.CustomerController←[0;39m: getAll
Hibernate: select customer0_.id as id1_0_, customer0_.location as location2_0_, customer0_.name as name3_0_ from customer customer0_
←[30m2020-06-20 16:09:21,032←[0;39m ←[34mINFO ←[0;39m [←[34mhttp-nio-8080-exec-4←[0;39m] ←[33mcom.springbootmysql.springbootdatajpamysql.resources.CustomerController←[0;39m: getCustomer for 1
Hibernate: select customer0_.id as id1_0_0_, customer0_.location as location2_0_0_, customer0_.name as name3_0_0_ from customer customer0_ where customer0_.id=?


