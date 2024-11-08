import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Staff> staff;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
    }

    public void listBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            System.out.println(book.describe() + ": " + book.title + " by " + book.author);
        }
    }

    public void listMembers() {
        System.out.println("Library Members:");
        for (Member member : members) {
            System.out.println(member.describe() + ": " + member.name + " (ID: " + member.id + ")");
        }
    }

    public void listStaff() {
        System.out.println("Library Staff:");
        for (Staff staffMember : staff) {
            System.out.println(staffMember.describe() + ": " + staffMember.name + " (ID: " + staffMember.id + ")");
        }
    }
}
