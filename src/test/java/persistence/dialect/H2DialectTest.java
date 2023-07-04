package persistence.dialect;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class H2DialectTest {

    @Test
    void create_table() {
        H2Dialect h2Dialect = new H2Dialect();

        assertThat(h2Dialect.getCreateTableString()).isEqualTo("create table");
    }

    @Test
    void generated_identity() {
        H2Dialect h2Dialect = new H2Dialect();

        assertThat(h2Dialect.getNativeIdentifierGeneratorStrategy()).isEqualTo(" generated by default as identity");
    }
}
