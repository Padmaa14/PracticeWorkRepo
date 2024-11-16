package RegularPractice;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClassPractice {
    public static void main(String ag[]) {
        List<String> tokens = new ArrayList<>();
        tokens.add("active");
        TestImmutable test = new TestImmutable(23, tokens);
        System.out.println(test);

        test.getTokens().add("tokens new");
        System.out.println(test);
    }
}

final class TestImmutable {
    private final int id;
    private final List<String> tokens;

    public TestImmutable(int id, List<String> tokens) {
        this.id = id;
        this.tokens = tokens;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "TestImmutable{" +
                "id=" + id +
                ", tokens=" + tokens +
                '}';
    }

    public List<String> getTokens() {
        return new ArrayList<>(tokens);
    }
}