package com.confiz.lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamStatisticsExample {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Highest number in List : " + stats.toString());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());

	}

}
