package pl.AniaJava;

public class OuterClass{

    interface Inner{
        String getName();
        void saySomething();
    }

    public Inner instantiateFirst(){
        return new InnerClassFirst();
    }

    class InnerClassFirst implements Inner{
        public String getName(){
            return "first";
        }

        public void saySomething(){
            System.out.println("Say something first");
        }
    }

    public Inner instantiateSecond(){
        return new InnerClassSecond();
    }

    static class InnerClassSecond implements Inner{
        public String getName(){
            return "second";
        }

        public void saySomething(){
            System.out.println("Say something second");
        }
    }
}
