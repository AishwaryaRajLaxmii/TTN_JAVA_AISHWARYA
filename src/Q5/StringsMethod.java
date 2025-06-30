package Q5;

public class StringsMethod {
    public static void main(String[] args) {
        System.out.println("Aishwarya ".repeat(4));
        System.out.println(" Raj ".strip());
        System.out.println(" Raj ".trim());
        System.out.println("  ".isBlank());
        String multipleLine="Aishwarya\nRaj\nLaxmi";
        System.out.println(multipleLine.indent(4));

        String transformed="Aishwarya".transform(str->new StringBuilder(str).reverse().toString());
        System.out.println(transformed);

        String texts= """
                first line
                    second line
                 third line
                """;
        System.out.println(texts.stripIndent());

        String escaped = "A\\nB\\tC";
        System.out.println(escaped.translateEscapes());

        String block= """
                Hi, This is 
                Aishwarya
                    Raj
                Laxmi
                """;
        System.out.println(block);

        String format="Hello, %s".formatted("Aishwarya");
        System.out.println(format);


    }
}
