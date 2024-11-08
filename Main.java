public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create staff
        Staff staff1 = new Staff("John Doe", "S123");

        // Create members
        Member member1 = new Member("Jane Smith", "M456");

        // Register member and books through staff
        staff1.registerMember(library, member1);
        staff1.registerBook(library, new Fiction("The Great Gatsby", "F. Scott Fitzgerald", "1234567890"));
        staff1.registerBook(library, new NonFiction("Sapiens", "Yuval Noah Harari", "0987654321"));

        // List all books, members, and staff
        library.listBooks();
        library.listMembers();
        library.listStaff();
    }
}
