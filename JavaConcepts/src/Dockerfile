FROM openjdk
COPY src JavaConcepts
WORKDIR JavaConcepts
RUN mkdir -p bin
RUN javac -d bin ./abstractClass/FerrariEncp.java
WORKDIR bin
CMD ["java" , "abstractClass.FerrariEncp"]