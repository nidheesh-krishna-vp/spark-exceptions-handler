package com.sparkexception.utils;

public class SparkConsumer {
    public static void main(String[] args) 
	/*
	 * throws StreamingQueryException, TimeoutException,
	 * java.util.concurrent.TimeoutException
	 */ {
       /* System.setProperty("hadoop.home.dir", "D:\\hadoop");
        SparkConf conf = new SparkConf().setAppName("Spark Streaming Consumer").setMaster("local[*]");
        SparkContext sparkContext = new SparkContext(conf);
        sparkContext.setCheckpointDir("C:\\Users\\165253\\Downloads\\spark-demo\\checkpoint");

        SparkSession sparkSession = SparkSession
                .builder()
                .appName("Spark Streaming Consumer")
                .config("spark.master", "local")
                .config("spark.sql.warehouse.dir", "C:\\tmp")
                .getOrCreate();

        Dataset<Row> dataset = sparkSession
                .readStream()
                .format("kafka")
                .option("kafka.bootstrap.servers", "localhost:9092")
                .option("kafka.group.id", "test-group3")
                .option("subscribe", "new-topic")
                .load();

        dataset.selectExpr("CAST(key AS STRING)", "CAST(value AS STRING)")
                .writeStream()
                .format("console")
                .option("numRows", 10000)
                .start()
                .awaitTermination();
                */
    }
}
