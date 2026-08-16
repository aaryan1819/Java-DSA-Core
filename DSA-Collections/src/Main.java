public static void main(String[] args) {
//    ArrayList<String> passedStudents = new ArrayList<>();
//    passedStudents.add("Alice");
//    passedStudents.add("Bob");
//    passedStudents.add("Charlie");
//
//    HashMap<Integer, String> StudentDirectory = new HashMap<>();
//    StudentDirectory.put(101, "David");
//    StudentDirectory.put(102, "Eve");
//
//    System.out.println(StudentDirectory.get(101));
    HashMap<Integer, Integer> map1 = new HashMap<>();
    int[] arr = {101, 102, 101, 103, 101, 102};

    for (int i = 0; i < arr.length; i++){
        map1.put(arr[i], map1.getOrDefault(arr[i], 0) + 1);
    }

    System.out.println(map1);
}