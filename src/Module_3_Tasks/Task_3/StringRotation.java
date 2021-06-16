package Module_3_Tasks.Task_3;

public class StringRotation {
    public static void main(String[] args) {

        StringRotationInterface rotationInterface = (String word1, String word2) -> {
            return (word1.length() == word2.length()) && ((word1 + word1).contains(word2));
        };

        String word1 = "JohnDoe";
        String word2 = "DoeJohn";
        boolean result = rotationInterface.checkIfRotations(word1,word2);

        if (result == true) {
            System.out.println(word1 + " is a rotation of " + word2);
        } else {
            System.out.println(word1 + " is not a rotation of " + word2);
        }
    }
}
