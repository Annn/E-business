# Pull base image
FROM openjdk:8u151

# Env variables
ENV SCALA_VERSION 2.12.4
ENV SBT_VERSION 1.1.1

# Scala expects this file
RUN touch /usr/lib/jvm/java-8-openjdk-amd64/release

# Install Scala
## Piping curl directly in tar
RUN \
  curl -fsL https://downloads.typesafe.com/scala/$SCALA_VERSION/scala-$SCALA_VERSION.tgz | tar xfz - -C /root/ && \
  echo >> /root/.bashrc && \
  echo "export PATH=~/scala-$SCALA_VERSION/bin:$PATH" >> /root/.bashrc

# Install sbt
RUN \
  curl -L -o sbt-$SBT_VERSION.deb https://dl.bintray.com/sbt/debian/sbt-$SBT_VERSION.deb && \
  dpkg -i sbt-$SBT_VERSION.deb && \
  rm sbt-$SBT_VERSION.deb && \
  apt-get update && \
  apt-get install sbt && \
  sbt sbtVersion

# Download and Install Play
RUN \
	cd /opt && \
	wget http://downloads.typesafe.com/typesafe-activator/1.3.2/typesafe-activator-1.3.2-minimal.zip && \
	unzip typesafe-activator-1.3.2-minimal.zip && \
	mv activator-1.3.2-minimal activator 

# Get Slick
RUN \
	cd /opt && \
	mkdir slick && \
	cd slick && \
	wget -O slick.jar http://search.maven.org/remotecontent?filepath=com/typesafe/slick/slick-testkit_2.12/3.2.1/slick-testkit_2.12-3.2.1.jar && \
	jar -xvf slick.jar && \
	rm slick.jar
