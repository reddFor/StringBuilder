package org.example.task;
import java.util.ArrayDeque;
import java.util.Deque;

    // append(), insert(), + undo(), + saveMemento()

    public class BetaStringBuilder {

        // Основной объект для работы со строкой
        private final StringBuilder builder;

        // История состояний mementov
        private final Deque<String> history;

        public BetaStringBuilder() {
            this.builder = new StringBuilder();
            this.history = new ArrayDeque<>();
        }
        /**
         * Сохраняем текущее состояние перед изменением
         */
        private void saveMemento() {
            history.push(builder.toString());
        }

        public BetaStringBuilder append(Object ob) {
            saveMemento();
            builder.append(ob);
            return this;
        }

        public BetaStringBuilder insert(int index, Object ob) {
            saveMemento();
            builder.insert(index, ob);
            return this;
        }

        public BetaStringBuilder undo() {
            String lastElement = history.pop();`
            builder.delete(0, builder.length());
            builder.append(lastElement);
            return this;
        }


        @Override
        public String toString() {
            return  "builder = " + builder + "\n" +
                    "history = " + history;
        }
    }
