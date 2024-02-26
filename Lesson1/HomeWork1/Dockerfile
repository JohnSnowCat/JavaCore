FROM openjdk:latest

WORKDIR /usr/src/app

COPY ./src/main/java .

RUN javac -sourcepath . -d out ./ru/gb/hw1/Program.java

WORKDIR /usr/src/app/out

CMD java -classpath . ru.gb.hw1.Program
#ENTRYPOINT ["java", "ru.gb.hw1.Program"]