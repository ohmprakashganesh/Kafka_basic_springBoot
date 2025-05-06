steps to start are :
install the kafka zip file from officaial website (less then 4.0 version)
extract the zip
start zookeeper
bin\windows\zookeeper-server-start.bat config\zookeeper.properties

start kafka server
bin\windows\kafka-server-start.bat config\server.properties

create the producer in cli
 bin\windows\kafka-console-producer.bat --topic User-topic --bootstrap-server localhost:9092


create the consumer  in cli
 bin\windows\kafka-console-consumer.bat --topic location-update-topic --from-beginning --bootstrap-server localhost:9092
