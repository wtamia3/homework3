public class Staff extends Person {
    public Staff(String name, String id) {
        super(name, id);
    }

    public void registerMember(Library library, Member member) {
        library.addMember(member);
    }

    public void registerBook(Library library, Book book) {
        library.addBook(book);
    }

    @Override
    public String describe() {
        return "Staff";
    }
}
