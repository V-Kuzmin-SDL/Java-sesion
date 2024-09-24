package STUDY.Lesson2;

public class formurl {

    public static void main(String[] args) {
        String baseUrl = "https://example.com/search?";
        String params = "query=java&sort=desc&filter=null";

        StringBuilder urlBuilder = new StringBuilder(baseUrl);

        // Удаляем последний символ "?" из базового URL, если он есть
        if (baseUrl.endsWith("?")) {
            urlBuilder.deleteCharAt(baseUrl.length() - 1);
        }

        // Добавляем параметры к URL
        String[] paramPairs = params.split("&");
        for (String pair : paramPairs) {
            String[] keyValue = pair.split("=");
            if (keyValue[1] != null && !keyValue[1].isEmpty()) {
                urlBuilder.append("&").append(keyValue[0]).append("=").append(keyValue[1]);
            }
        }

        System.out.println(urlBuilder.toString());
    }
}