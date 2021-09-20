package core;

public class Materials {

    private String ide;
    private String jdkVersion;
    private String books;

    public Materials( String ide, String jdkVersion, String books) {
        this.ide = ide;
        this.jdkVersion = jdkVersion;
        this.books = books;
    }
    public Materials(){
        this("Java","11.2","OCA");
    }

    @Override
    public String toString() {
        return "Materials{" +
                "ide='" + ide + '\'' +
                ", jdkVersion='" + jdkVersion + '\'' +
                ", books='" + books + '\'' +
                '}';
    }
}
