package utilz;

public class Constants {

    public static class Directions {
        public static final int LEFT = 0;
        public static final int UP = 1;
        public static final int RIGHT = 2;
        public static final int DOWN = 3;
    }

    public static class PlayerConstants {
        public static final int IDLE = 0;
        public static final int RUNNING = 1;
        public static final int GREEN = 2;
        public static final int BLUE = 3;
        public static final int PURPLE = 4;
        public static final int MAGNETA = 5;

        public static int GetSpriteAmount(int player_action) {

            switch (player_action) {
                case IDLE:
                    return 1;
                case RUNNING:
//                    return 6;
                case GREEN:
//                    return 6;
                case BLUE:
//                    return 6;
                case PURPLE:
//                    return 6;
                case MAGNETA:
                    return 6;
                default:
                    return 1;
            }

        }
    }

}
