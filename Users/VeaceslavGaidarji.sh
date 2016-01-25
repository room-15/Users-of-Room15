#!/usr/bin/env bash

AUTHOR=VeaceslavGaidarji
ROOM_NAME="Room15"
WHERE_FROM="${ROOM_NAME}User"

echo "public final class ${AUTHOR} extends ${WHERE_FROM} {
  public static void main(String[] args) {
    System.out.println(\"Hello, $ROOM_NAME!\");

    Dominator d = new GoogleDominator();
    d.goToSchool();
    d.startLearnProgramming();
    d.startLearningCPlusPlus();
    d.beTiredOfPointersShit();
    d.switchToJava();
    d.buyAndroidPhone();
    d.createWordDominatorApplication();
    d.addGoogleAnalytics();
    d.installTheAppOnEveryMobileDevice();
    String answer = d.isWorldAlreadyOurs()
        ? \"YES. Check the drone on your head! (c) Google\"
        : \"NO. Please, login with Google credentials and try again.\";

    System.out.println(String.format(\"\\nIs world already ours?\\n %s\", answer));
  }
}" | tee $AUTHOR.java &> /dev/null
