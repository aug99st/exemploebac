public class HelloWorld
{
    public static void main(String[] args) {
        int flag = 0;
        if (args.length == 0 ) {
            System.out.print("O array está vazio, você não passou argumentos");// do something
            flag = 1;
        }
        if (flag > 0)
        {
            System.out.println("Eu não posso acessar um aray vaziu");
        }

    }

    
}