# Docker Workshop

This project contains a hello world app written in Java

# Build

To build the project

```
mvn package
```

# Dockerfiles

**Dockerfile**

Simple Dockerfile to get the app running.

Requires you to run `mvn package` locally to create the applications `.jar` file.
With that you can use this Dockerfile to build the image an run it.

```
docker build . -t myfirst-app
docker run -p 8080:8080 myfirst-app
```

**Dockerfile.extra**

Extends the Dockerfile with some labels and the curl library.

Requires you to run `mvn package` locally to create the applications `.jar` file.
With that you can use this Dockerfile to build the image an run it.

```
docker build . -t myfirst-app -f Dockerfile.extra
```

**Dockerfile.hello**

Dockerfile with alpine to showcase CMD and ENTRYPOINT.

```
docker build . -t hello-test-app -f Dockerfile.hello
```

**Dockerfile.ignore**

Dockerfile with a COPY instruction to showcase .dockerignore file

**Dockerfile.single**

Dockerfile with the build step included

**Dockerfile.multi**

Multi stage Dockerfile to build the app, and in the final stage use a minimal base image