package com.sparkexception.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class Consumer {
	private static final String TOPIC_NAME = "new-topic";

	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.put("bootstrap.servers", "localhost:9092");
		properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		properties.put("group.id", "test-group3");

		KafkaConsumer kafkaConsumer = new KafkaConsumer(properties);
		List topics = new ArrayList();
		topics.add(TOPIC_NAME);
		kafkaConsumer.subscribe(topics);
		try {

			while (true) {
				ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(10);
				consumerRecords.forEach(record -> {
					System.out.println("Getting data from Topic ------------------------------------>");
					System.out.println(String.format("Topic - %s, Partition - %d, Value: %s", record.topic(),
							record.partition(), record.value()));
				});
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			kafkaConsumer.close();
		}
	}
}
