package baekjoon.afterLv15.other;

public class cMake {


    class human{
        String name = "default";
        String personality = "default";
        String job = "default";
        String[] gPoint = new String[10];
        String[] bPoint = new String[10];
        String icon = "¡Û";

        public void setF(String name, String personality, String job){
            this.name = name;
            this.personality = personality;
            this.job = job;
        }

        public void setName(String name) {
            this.name = name;


        }

    }
}
