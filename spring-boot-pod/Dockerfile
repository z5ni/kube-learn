# 1. Base image 선택 (OpenJDK 17 사용 예시)
FROM openjdk:17-jdk

# 2. 환경 변수
ENV TZ=Asia/Seoul

# 3. JAR 파일을 컨테이너 내부로 복사
ARG JAR_FILE=build/libs/*SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# 4. 포트 노출 (예: 8080)
EXPOSE 8080

# 5. 실행 명령어
ENTRYPOINT ["java", "-jar", "/app.jar"]