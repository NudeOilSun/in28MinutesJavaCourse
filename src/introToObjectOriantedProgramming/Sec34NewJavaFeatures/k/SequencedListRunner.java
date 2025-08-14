package introToObjectOriantedProgramming.Sec34NewJavaFeatures.k;

import java.util.ArrayList;

public class SequencedListRunner {
    public static void main(String[] args) {
        var courseDeatails = new ArrayList<String>();

        courseDeatails.add("Spring Security");

        courseDeatails.addFirst("Spring boot");
        courseDeatails.addLast("sprint boot in AI");

        System.out.println("Liat: " + courseDeatails);
//        courseDeatails.add("Cloud Computing with AWS");
//        courseDeatails.add("Cloud Computing with Azure");
//
//        System.out.println("first element: " + courseDeatails.getFirst());
//        System.out.println("last element: " + courseDeatails.getLast());
//
//        System.out.println("remove first element: " + courseDeatails.removeFirst());
//        System.out.println("remove last element: " + courseDeatails.removeLast());
//
//        var reversedCourseDetails = courseDeatails.reversed();
//        System.out.println("reversed: " +reversedCourseDetails);


    }
}
