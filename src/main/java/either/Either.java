package either;

import java.util.Optional;

public class Either<L, R> {
    private final L left;
    private final R right;

    private Either(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public Optional<L> getLeft() {
        return left != null ? Optional.of(left) : Optional.empty();
    }

    public Optional<R> getRight() {
        return right != null ? Optional.of(right) : Optional.empty();
    }

    public static <L, R> Either<L, R> left(L value) {
        return new Either<>(value, null);
    }

    public static <L, R> Either<L, R> right(R value) {
        return new Either<>(null, value);
    }
}
