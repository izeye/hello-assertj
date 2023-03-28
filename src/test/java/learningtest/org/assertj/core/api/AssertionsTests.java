package learningtest.org.assertj.core.api;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link org.assertj.core.api.Assertions}.
 *
 * @author Johnny Lim
 */
class AssertionsTests {

    @Test
    void test() {
        assertThat(42).isEqualTo(42);
    }

}
