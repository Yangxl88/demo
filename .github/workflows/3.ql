/**
 * @kind path-problem
 */

import java
import semmle.code.java.dataflow.FlowSources
import semmle.code.java.dataflow.DataFlow
class Getter extends Method {
  Getter() { this.getName().regexpMatch("get.+") }
}

class Source extends Callable {
  Source() {
    this instanceof Getter and getDeclaringType().getASupertype*() instanceof TypeSerializable
  }
}

class GetConnectionMethod extends Method {
  GetConnectionMethod() {
    this.hasName("getConnection") and
    this.getDeclaringType().hasQualifiedName("java.sql", "DriverManager")
  }
}

class DangerousMethod extends Callable {
  DangerousMethod() { this instanceof GetConnectionMethod }
}

class CallsDangerousMethod extends Callable {
  CallsDangerousMethod() {
    exists(Callable a |
      this.polyCalls(a) and
      a instanceof DangerousMethod
    )
  }
}

query predicate edges(Callable a, Callable b) {
  a.polyCalls(b)
}

from Source source, CallsDangerousMethod sink
where edges+(source, sink)
select source, source, sink, "$@ $@ to $@ $@", source.getDeclaringType(),
  source.getDeclaringType().getName(), source, source.getName(), sink.getDeclaringType(),
  sink.getDeclaringType().getName(), sink, sink.getName()
