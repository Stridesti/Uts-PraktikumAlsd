import java.util.ArrayList;

class Matakuliah {
    String kodeMK;
    String namaMK;
    int sks;

    Matakuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilDataMK() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("SKS: " + sks);
    }
}

class Jadwal {
    String hari;
    String jamMulai;
    String jamSelesai;
    Matakuliah matakuliah;

    Jadwal(String hari, String jamMulai, String jamSelesai, Matakuliah matakuliah) {
        this.hari = hari;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
        this.matakuliah = matakuliah;
    }

    void tampilJadwal() {
        System.out.println("Hari: " + hari);
        System.out.println("Jam: " + jamMulai + " - " + jamSelesai);
        matakuliah.tampilDataMK();
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Matakuliah mk1 = new Matakuliah("MK001", "Struktur Data", 3);
        Matakuliah mk2 = new Matakuliah("MK002", "Pemrograman Java", 3);
        Matakuliah mk3 = new Matakuliah("MK003", "Basis Data", 3);
        Matakuliah mk4 = new Matakuliah("MK004", "Algoritma dan Pemrograman", 3);
        Matakuliah mk5 = new Matakuliah("MK005", "Matematika Diskrit", 3);
        Matakuliah mk6 = new Matakuliah("MK006", "Jaringan Komputer", 3);
        Matakuliah mk7 = new Matakuliah("MK007", "Pemrograman Web", 3);

        ArrayList<Jadwal> jadwalList = new ArrayList<>();
        jadwalList.add(new Jadwal("Senin", "08:00", "10:00", mk1));
        jadwalList.add(new Jadwal("Selasa", "10:00", "12:00", mk2));
        jadwalList.add(new Jadwal("Rabu", "09:00", "11:00", mk3));
        jadwalList.add(new Jadwal("Kamis", "13:00", "15:00", mk4));
        jadwalList.add(new Jadwal("Jumat", "07:00", "09:00", mk5));
        jadwalList.add(new Jadwal("Senin", "11:00", "12:30", mk6));
        jadwalList.add(new Jadwal("Rabu", "11:00", "13:00", mk7));

        System.out.println("Jadwal Mata Kuliah:");
        for (Jadwal jadwal : jadwalList) {
            jadwal.tampilJadwal();
        }
    }
}
