# Example project for Spring Boot + Apache Kafka + Docker-compose solution

Simple Spring Boot project to send and consume messages with docker compose config to run kafka + zookeeper in containers

Fill with some value `YOUR_BROKER_HOST_PUBLIC_IP` at `KAFKA_ADVERTISED_LISTENERS: INSIDE://kafka:9093,OUTSIDE://YOUR_BROKER_HOST_PUBLIC_IP:9092` 
in ``kafka_conf/docker-compose.yml`` file to call kafka from external hosts.


### Prerequisite

Docker-compose and docker required to run stuff from /kafka_directory


### Avaliable console params 

* ***- - consumer-enabled*** - you can disable/enable consumer if needed. Default is true
* ***- -kafka_bootstrap_servers*** - set your server address here to call kafka from external hosts. Default is localhost:9092
* ***- -kafka_username / --kafka_password*** - you can change default user in kafka_conf/kafka_server_jaas.conf. Default is admin/admin-secret