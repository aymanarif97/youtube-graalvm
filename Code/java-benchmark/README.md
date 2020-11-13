# GraalVM Benchmark 


## With Graal VM

```
$GRAALVM_HOME/bin/java -jar target/benchmarks.jar
```

Benchmark                     Mode  Cnt    Score     Error  Units
JavaBenchmarkMain.testMethod  avgt    3  110.511 ± 103.141  ns/op

## Without GraalVM

Simply add the `-XX:-UseJVMCICompiler` flag to disable GraalVM" 

```
$GRAALVM_HOME/bin/java -XX:-UseJVMCICompiler -jar target/benchmarks.jar
```

Benchmark                     Mode  Cnt    Score   Error  Units
JavaBenchmarkMain.testMethod  avgt    3  110.953 ± 4.471  ns/op