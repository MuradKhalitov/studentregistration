# Используем базовый образ с Java 23
FROM openjdk:23

# Установка рабочей директории внутри контейнера
#WORKDIR /app

# Копируем JAR файл вашего приложения в контейнер
COPY target/student-registration-0.0.1-SNAPSHOT.jar app.jar

# Команда для запуска приложения при старте контейнера
CMD ["java", "-jar", "app.jar"]
