FROM openjdk:17

WORKDIR /aio

COPY . /aio

EXPOSE 80

CMD ["./gradlew", "bootrun"]