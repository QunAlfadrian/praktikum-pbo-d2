import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args) {
        // HashMap<String, String> mahasiswaMap = new HashMap<>();

        // mahasiswaMap.put("24060122130072", "Qun Alfadrian Setyowahyu Putro");
        // mahasiswaMap.put("24060122120036", "Aniqah Nursabrina");
        // mahasiswaMap.put("24060122140124", "Rona Realita Najma");
        // mahasiswaMap.put("24060122140042", "Muhammad Fakhrell Anderaz");
        // mahasiswaMap.put("24060122130086", "Thoriq Hadiwinata");

        // /* Lambda sebagai parameter */        
        // mahasiswaMap.keySet().forEach((nim) -> System.out.println("Nim: " + nim + "\nNama: " + mahasiswaMap.get(nim) + "\n"));

        HashMap<Long, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put(24060122130072L, "Qun Alfadrian Setyowahyu Putro");
        mahasiswaMap.put(24060122120036L, "Aniqah Nursabrina");
        mahasiswaMap.put(24060122140124L, "Rona Realita Najma");
        mahasiswaMap.put(24060122140042L, "Muhammad Fakhrell Anderaz");
        mahasiswaMap.put(24060122130086L, "Thoriq Hadiwinata");

        /* Lambda sebagai parameter */        
        mahasiswaMap.keySet().forEach((nim) -> System.out.println("Nim: " + nim + "\nNama: " + mahasiswaMap.get(nim) + "\n"));
    }
}
