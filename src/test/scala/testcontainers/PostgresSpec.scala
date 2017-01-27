import org.scalatest.{BeforeAndAfter, Matchers, WordSpec}
import org.testcontainers.containers.PostgreSQLContainer

class PostgresSpec extends WordSpec with BeforeAndAfter with Matchers {
  var container = new PostgreSQLContainer

  before {
    container.start()
  }

  after {
    container.stop()
  }

  "Testcontainers postgres module" should {
    "load jdbc driver and connect to postgres" in {
      val conn = container.createConnection("")
      conn should not be null
      conn.close()
    }
  }
}