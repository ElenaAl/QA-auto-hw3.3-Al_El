import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortedTest{

    @Test
    //1.проверяем, совпадают ли фактический и ожидаемый массив
    public void equalsTest() {
        int[]a={8, 1, 4, 2, 20, 9, -5, 22};
        //int[]a={8, 1, 4};
        Sorted.sort(a);
        int[]b={-5, 1, 2, 4, 8, 9, 20, 22};
        Assertions.assertArrayEquals(b, a);
    }
    @Test
    //2.проверяем, как сработает, если на входе уже отсортированный массив
    public void alreadySortedArrayTest() {
        int[]a={-50, -2, 11, 585, 964, 17855, 745654};
        //int[]a={-50, -2, 11, 585, 964, 1, 745654};
        Sorted.sort(a);
        int[]b={-50, -2, 11, 585, 964, 17855, 745654};
        Assertions.assertArrayEquals(b, a);
    }

    @Test
    //3.проверяем, как сработает, если на входе отсортированный в обратном порядке массив
    public void sortedHighToLoqArrTest() {
        int[]a={10500, 800, 30, 0, -888, -1567, -5000, -12550,-226574};
        Sorted.sort(a);
        int[]b={-226574,-12550, -5000, -1567, -888, 0, 30, 800, 10500};
        Assertions.assertArrayEquals(b, a);
    }

    @Test
    //4.проверяем, как сработает, если задан массив из одинаковых чисел
    public void allSameElementsTest() {
        int[]a={999, 999, 999, 999, 999, 999};
        Sorted.sort(a);
        int[]b={999, 999, 999, 999, 999, 999};
        Assertions.assertArrayEquals(b, a);
    }

    @Test
    //5.проверяем, как сработает, если массив не инициализировали
    public void notInitArrayTest() {
        int[]a={};
        Sorted.sort(a);
        int[]b={};
        Assertions.assertArrayEquals(b, a);
    }

    @Test
    //6.проверяем, как сработает, если в массиве есть повторяющиеся элементы
    public void repeatNumbersTest() {
        int[]a={-25, -50, -50, 874, 14, 2, 2};
        Sorted.sort(a);
        int[]b={-50, -50,-25, 2, 2, 14, 874};
        Assertions.assertArrayEquals(b, a);
    }

    @Test
    //7.проверяем, как сработает, если массив инициализировать 0
    public void initByZeroTest() {
        int[]a={0};
        Sorted.sort(a);
        int[]b={0};
        Assertions.assertArrayEquals(b, a);
    }


}
