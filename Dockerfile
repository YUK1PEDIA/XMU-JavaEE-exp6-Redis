FROM swr.cn-north-4.myhuaweicloud.com/oomall-javaee/openjdk:17-alpine
MAINTAINER YUKIPEDIA
WORKDIR /app
ARG JAR_FILE
# 直接使用 COPY 复制构建的 .jar 文件
COPY target/exp6-Redis-0.0.1-SNAPSHOT.jar /app/exp6-redis.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/app/exp6-redis.jar"]
CMD ["--spring.datasource.url=jdbc:mysql://mysql:3306/oomall_demo?serverTimezone=Asia/Shanghai", "--spring.datasource.username=demouser", "--spring.datasource.password=123456"]
