package learningtest.org.assertj.core.api;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static java.util.Map.entry;
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

    @Test
    void map() {
        Map<SomeType, List<String>> map = Map.of(SomeType.TYPE_A, List.of("a", "aa"));
        assertThat(map).containsAnyOf(entry(SomeType.TYPE_A, List.of("a", "aa")), entry(SomeType.TYPE_B, List.of("b", "bb")));
        assertThat(map.keySet()).containsAnyOf(SomeType.TYPE_A, SomeType.TYPE_B);
    }

    enum SomeType {
        TYPE_A,
        TYPE_B,
        TYPE_C
    }

}
