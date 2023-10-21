FROM openjdk:8
EXPOSE 9099
ADD target/docker-github-actions.jar docker-github-actions.jar
ENTRYPOINT [ "java","-jar","/docker-github-actions.jar" ]