package Map;

import java.awt.event.KeyEvent;

public class KeySetting {

    public enum DirectionKey implements Command {

        UP(KeyEvent.VK_UP), LEFT(KeyEvent.VK_LEFT), DOWN(KeyEvent.VK_DOWN), RIGHT(KeyEvent.VK_RIGHT);

        private int KeyValue;

        private DirectionKey(int value) {
            this.KeyValue = value;
        }

        public int getValue() {
            return this.KeyValue;
        }

        @Override
        public void command() {
            System.out.println(this);

        }
    }


        public enum CommandKey implements Command {

            Z(KeyEvent.VK_Z), X(KeyEvent.VK_X), Y(KeyEvent.VK_Y);

            private int keyValue;

            CommandKey(int value) {
                this.keyValue = value;

            }


            @Override
            public void command() {

            }


        }

    }

