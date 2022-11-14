package lotto.domain.lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;

/**
 * - `Lotto`에 매개 변수가 없는 생성자를 추가할 수 없다.
 * - `numbers`의 접근 제어자인 private을 변경할 수 없다.
 * - `Lotto`에 필드(인스턴스 변수)를 추가할 수 없다.
 */
public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
        Set<Integer> set = new HashSet<>(numbers);
        if (set.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Lotto.class.getSimpleName() + "[", "]")
                .add("numbers=" + numbers)
                .toString();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
