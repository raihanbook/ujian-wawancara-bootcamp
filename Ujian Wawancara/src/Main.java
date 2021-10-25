import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	Jawaban 1
//	SELECT BARANG.KODEBRG, BARANG.NAMABRG, JUAL.JUMLAH FROM BARANG JOIN JUAL ON BARANG.KODEBRG = JUAL.KODEBRG;
//	
//	Jawaban 2
//	SELECT KodeBarang, StokAkhir FROM HistoriStokBarang ORDER BY KodeStok DESC LIMIT 2;
//	
//	Jawaban 3
//	a. Nama Suku Cadang di entitas Mobil seharusnya tidak diperlukan karena atribut ini bisa diganti dengan Kode Suku Cadang
//	b. Kode Produsen diperlukan agar entitas Suku Cadang bisa menjadikan atribut ini sebagai FK untuk nantinya me-reference ke tabel Produsen
//	
//	Jawaban 4
//	Diasumsikan kita dapat meng-akses internet dan Google, jawabannya adalah sekitar 29.504
	
//	Jawaban 5
	public void soalLima() {
		Scanner sn = new Scanner(System.in);
		int numSatu = 0;
		int numDua = 1;
		
		System.out.print("Input = ");
		int input = sn.nextInt();
  
        while (numSatu <= input) {
  
        	if (numSatu == 0) {
				
			} else {
				System.out.print(numSatu + " ");
			}
  
            int numTiga = numDua + numSatu;
            numSatu = numDua;
            numDua = numTiga;
        }
	}
	
//	Jawaban 6
	public void soalEnam() {
		Scanner sn = new Scanner(System.in);
		int counter = 1;
		System.out.print("Input = ");	
		int ukuran = sn.nextInt();
		
		for (int i = 0; i < ukuran; i++) {
			for (int j = 0; j <= counter; j++) {
				System.out.print("*");
			}
			counter += 2; 
			System.out.println();
		}
	}
	
//	Jawaban 7
	public void soalTujuh() {
		Scanner sn = new Scanner(System.in);
		String string = "";
		
		System.out.print("Input 1 = ");
		String input = sn.next();
		
		System.out.print("Input 2 = ");
		int inputDua = sn.nextInt();
  
        for (int i = 0; i < (inputDua - input.length()); i++) {
			string += "0";
		}
        
        string += input;
        System.out.println(string);
	}
}
