package com.sparkexception.utils;

import java.util.concurrent.TimeoutException;

public class Producer {
	public static void main(String[] args) throws TimeoutException/* , StreamingQueryException */ {
		/*final Encoder<TransactionDetails> encoder = Encoders.bean(TransactionDetails.class);
        System.setProperty("hadoop.home.dir", "D:\\hadoop");
        SparkConf conf = new SparkConf().setAppName("Spark Streaming").setMaster("local[*]");
        SparkContext sparkContext = new SparkContext(conf);
        sparkContext.setCheckpointDir("C:\\Users\\165253\\Downloads\\spark-demo\\checkpoint");

        try (SparkSession sparkSession = SparkSession
                .builder()
                .appName("Spark Streaming")
                .config("spark.master", "local")
                .config("spark.sql.warehouse.dir", "C:\\tmp")
                .getOrCreate()) {
            Dataset<TransactionDetails> csvData = sparkSession
                    .readStream()
                    .option("header", false)
                    .format("csv")
                    .schema(encoder.schema())
                    .csv("C:\\Users\\165253\\Downloads\\5m-Sales-Records\\*.csv")
                    .as(encoder);

            csvData.selectExpr("CAST(country AS STRING) AS key", "to_json(struct(*)) AS value").writeStream()
                    .outputMode(OutputMode.Append())
                    .format("kafka")
                    .option("kafka.bootstrap.servers", "localhost:9092")
                    .option("checkpointLocation", "C:\\Users\\165253\\Downloads\\spark-demo\\checkpoint")
                    .option("kafka.group.id", "test-group3")
                    .option("topic", "new-topic")
                    .option("failOnDataLoss", false)
                    .start()
                    .awaitTermination();
        }*/
    }
}
