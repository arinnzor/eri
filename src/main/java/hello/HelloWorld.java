package hello;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.*;

public class HelloWorld {
  public static void main(String[] args) {
    try (CqlSession session = CqlSession.builder().build()) {                                  // (1)
        ResultSet rs = session.execute("select release_version from system.local");              // (2)
        Row row = rs.one();
        System.out.println(row.getString("release_version"));                                    // (3)
      }
  }
}