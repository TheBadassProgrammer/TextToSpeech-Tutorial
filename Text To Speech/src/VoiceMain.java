import marytts.TextToSpeech;

public class VoiceMain {


    public static void main(String[] args) {

        //Create TextToSpeech
        TextToSpeech tts = new TextToSpeech();

        tts.getAvailableVoices().stream().forEach(voice -> System.out.println("Voice: " + voice));

        // Setting the Voice

        tts.speak("Hi sir... How are you. I was waiting for you...", 2.0f, true, true);

    }

}