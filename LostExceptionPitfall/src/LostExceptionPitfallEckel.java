public class LostExceptionPitfallEckel {

    // Adapted from Bruce Eckels Thinking In Java online book c09:LostMessage.java
    // How an exception can be lost.
    //
    // When I run this in java 8 I see :
    //
    //Exception in thread "main" Trivial
    //	at LostExceptionPitfallEckel.main(LostExceptionPitfallEckel.java:19)
    public static void main(String[] args) throws Exception {
        try {
            // throws VeryImportantException but
            // main never sees nor passes it up the stack
            throw new VeryImportantException();
        } finally {
            // finally (maybe indirectly) throws HumHoException and
            // that's what gets passed out of main..
            // VeryImportantException is lost..
            throw new HoHumException();

            // Lesson: any code that may throw in finally should be wrapped in try/catch to prevent exception loss
        }
    }
}


class VeryImportantException extends Exception {
    public String toString() {
        return "ImportantException";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "HoHumException";
    }
}

