public class RunAndTest {
    public static void main(String[] args) {

        /*
         *@Override
         * public void run() {
         *    if (target != null) {
         *        target.run();
         *    }
         * }
         * super.run假设在Thread自己的run执行的内容前，
         * 那么会优先走父类的超类，
         * 也就是说会运行target的run方法先
         * 反之相反。没有super.run不执行runnable
         */
        /**
         *
         * Demo1
         *
         * Thread run方法执行顺须
         *
         */
        //start
        Thread thread = new Thread(new RunnableDemo()){
            @Override
            public void run() {
                System.out.println("Thread method");
                super.run();
            }
        };
        thread.start();
        //end
    }
    //Demo1's Method1
    static class RunnableDemo implements Runnable {
        @Override
        public void run() {
            System.out.println("runnable method");
        }
    }
}
