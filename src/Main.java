import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Проверка високосного года
        printLeapYearInfo(2020);
        printLeapYearInfo(2021);
        printLeapYearInfo(2000);
        printLeapYearInfo(1900);

        System.out.println(); // Разделитель

        // Задача 2: Рекомендация версии приложения
        suggestAppVersion(0, 2013); // iOS, старое устройство → облегчённая
        suggestAppVersion(1, 2013); // Android, старое устройство → облегчённая
        suggestAppVersion(0, 2015); // iOS, 2015 год → обычная
        suggestAppVersion(1, 2015); // Android, 2015 год → обычная
        suggestAppVersion(0, 2020); // iOS, новое устройство → обычная

        System.out.println(); // Разделитель

        // Задача 3: Расчет дней доставки
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        if (deliveryDays == -1) {
            System.out.println("Доставка не осуществляется.");
        } else {
            System.out.println("Потребуется дней для доставки: " + deliveryDays);
        }
    }

    /**
     * Печатает информацию, является ли год високосным.
     * @param year год для проверки
     */
    public static void printLeapYearInfo(int year) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    /**
     * Рекомендует версию приложения в зависимости от ОС и года выпуска устройства.
     * Устройства до 2015 года — облегчённая версия.
     * Начиная с 2015 года — обычная версия.
     * @param clientOS 0 — iOS, 1 — Android
     * @param clientDeviceYear год выпуска устройства
     */
    public static void suggestAppVersion(int clientOS, int clientDeviceYear) {
        String osName = clientOS == 0 ? "iOS" : "Android";
        String message;

        if (clientDeviceYear < 2015) {
            message = "Установите облегченную версию приложения для " + osName + " по ссылке";
        } else {
            message = "Установите приложение для " + osName + " по ссылке";
        }

        System.out.println(message);
    }

    /**
     * Рассчитывает количество дней доставки в зависимости от расстояния.
     * @param distance расстояние в км
     * @return количество дней доставки, или -1, если доставка невозможна
     */
    public static int calculateDeliveryDays(int distance) {
        if (distance > 100) {
            return -1; // Доставка не осуществляется
        }
        int days = 1;
        if (distance > 20) {
            days++;
        }
        if (distance > 60) {
            days++;
        }
        return days;
    }
}