public static void main(String[] args) {
    ArrayList<String> passedStudents = new ArrayList<>();
    passedStudents.add("Alice");
    passedStudents.add("Bob");
    passedStudents.add("Charlie");

    HashMap<Integer, String> StudentDirectory = new HashMap<>();
    StudentDirectory.put(101, "David");
    StudentDirectory.put(102, "Eve");

    System.out.println(StudentDirectory.get(101));
}