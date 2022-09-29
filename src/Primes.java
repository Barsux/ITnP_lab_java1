//Класс простых чисел
public class Primes{
    /*
    Точка входа в программу, вызывает функцию isPrime в цикле с аргументом переменной от 2 до 100 включительно
    и выводит переменную при положительном выводе.
     */
    public static void main(String[] args){
        for(int i = 2; i <= 100; i++){
            if(isPrime(i))System.out.println(i);
        }
    }

    //Функция определения простоты числа
    public static boolean isPrime(int n){
        //Если число меньше 0 или 0 или 1 то оно будет точно непростым.
        if(n < 2)return false;
        //Нет смысла перебирать все числа в диапазоне от 1 до n, достаточно от 2 до n // 2 + n % 2
        for(int i = 2; i < (n / 2 + 1); i++) {
            if(n % i == 0)return false;
        }
        return true;
    }
}
