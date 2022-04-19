FROM adoptopenjdk/openjdk11:ubi
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENV BOT_NAME=BorisBDay_bot
ENV BOT_TOKEN=5229040491:AAE24EGFxrDgcHahZNgaaro52pfTNTsvIL0
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "app.jar"]