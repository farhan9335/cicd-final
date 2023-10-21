FROM opendjdk:8
EXPOSE 8087
ADD target/docker-github-actions.jar docker-github-actions.jar
ENTRYPOINT [ "java","-jar","/docker-github-actions.jar" ]