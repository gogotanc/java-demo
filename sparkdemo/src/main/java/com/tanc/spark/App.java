package com.tanc.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        example(args);
    }

    /**
     * 示例代码 会报错
     *
     * @param args 命令行参数，两个，一个输入文件，一个输出文件
     */
    private static void example(String[] args) throws Exception {
        String inputFile = "file:///root/" + args[0];
        String outputFile = "file:///root/" + args[1];
        // Create a Java Spark Context.
        SparkConf conf = new SparkConf().setAppName("wordCount");
        JavaSparkContext sc = new JavaSparkContext(conf);
        // Load our input data.
        JavaRDD<String> input = sc.textFile(inputFile);
        // Split up into words.
        JavaRDD<String> words = input.flatMap(
                new FlatMapFunction<String, String>() {
                    public Iterable<String> call(String x) {
                        return Arrays.asList(x.split(" "));
                    }
                });
        // Transform into word and count.
        JavaPairRDD<String, Integer> counts = words.mapToPair(
                new PairFunction<String, String, Integer>() {
                    public Tuple2<String, Integer> call(String x) {
                        return new Tuple2(x, 1);
                    }
                }).reduceByKey(new Function2<Integer, Integer, Integer>() {
            public Integer call(Integer x, Integer y) {
                return x + y;
            }
        });
        // Save the word count back out to a text file, causing evaluation.
        counts.saveAsTextFile(outputFile);
    }

    /**
     * 自己根据上面的代码写的
     */
    private static void start(String[] args) {

        String inputFile = "file:///root/" + args[0];
        String outputFile = "file:///root/" + args[1];

        SparkConf conf = new SparkConf().setMaster("master").setAppName("tanc App"); // 应用名

        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> file = sc.textFile(inputFile);

        JavaRDD<String> words = file.flatMap((FlatMapFunction<String, String>) s -> Arrays.asList(s.split(" ")));

        JavaPairRDD<String, Integer> counts = words.mapToPair((PairFunction<String, String, Integer>) s -> new Tuple2<>(s, 1))
                .reduceByKey((Function2<Integer, Integer, Integer>) (x, y) -> x + y);

        counts.saveAsTextFile(outputFile);
    }

    /*
     * 打包
     * mvn clean compile package
     *
     * 运行
     * $SPARK_HOME/bin/spark-submit --class com.tanc.spark.App tanc-spark-demo-1.0-SNAPSHOT.jar ./input.md ./output.md
     */
}
