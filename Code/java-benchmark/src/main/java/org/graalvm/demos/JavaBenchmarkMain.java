/**

  @author Ayman Patel
 */

package org.graalvm.demos;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;

import org.openjdk.jmh.annotations.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@Warmup(iterations = 1)
@Measurement(iterations = 3)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(1)
public class JavaBenchmarkMain {

  static int[] values = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  @Benchmark
  public int testMethod() {
    return Arrays.stream(values)
      .map(x -> x + 1)
      .map(x -> x * 2)
      .map(x -> x + 2)
      .reduce(0, Integer::sum);
  }
}
