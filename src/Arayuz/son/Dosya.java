package Arayuz.son;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Dosya {
	
	// bundan sonrakiler öğrenci kayıt için oluşturulan metodlar
	
	void DosyaKaydet(String a,String dosya) {
		ArrayList<String> veri = new ArrayList<>();
		veri.add(a);

		FileWriter fWriter = null;
		BufferedWriter writer = null;
		try {
			fWriter = new FileWriter(dosya, true);
			writer = new BufferedWriter(fWriter);
			for (int i = 0; i < veri.size(); i++) {
				writer.write(veri.get(i));
				writer.newLine();
				System.out.println(veri.get(i));
			}
			writer.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public ArrayList<String> OgrDosyaOkuma(String dosya) {
		String str;
		ArrayList<String> veri = new ArrayList<String>();
		try {
			FileInputStream fStream = new FileInputStream(dosya);
			DataInputStream dStream = new DataInputStream(fStream);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));
			
			while ((str = bReader.readLine()) != null) {
				veri.add(str);
			}
			dStream.close();

		} catch (Exception e) {
			System.err.println("Hata: " + e.getMessage());
		}
		for (int k = 0; k < veri.size(); k++) {
			System.out.println(veri.get(k));
		}
		return veri;
	}
	
	public void OgrSil(String o,String dosya) {
		String str;
		ArrayList<String> veri = new ArrayList<String>();
		try {
			FileInputStream fStream = new FileInputStream(dosya);
			DataInputStream dStream = new DataInputStream(fStream);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));

			while ((str = bReader.readLine()) != null) {
				veri.add(str);
			}
			for (int j = 0; j < veri.size(); j++) {
				String aranan = veri.get(j);
				if (aranan.contains(o)) {
					veri.remove(j);	
				}
			}
			dStream.close();
			FileWriter fWriter = null;
			BufferedWriter writer = null;
			try {
				fWriter = new FileWriter(dosya);
				writer = new BufferedWriter(fWriter);
				for (int i = 0; i < veri.size(); i++) {
					writer.write(veri.get(i));
					writer.newLine();
					System.out.println(veri.get(i));
				}
				writer.close();

			} catch (Exception e) {
				// TODO: handle exception
			}

		} catch (Exception e) {
			System.err.println("Hata: " + e.getMessage());
		}
	}
	
	public void OgrGuncelle(String a, String b,String dosya) {
		String str;
		ArrayList<String> veri = new ArrayList<String>();
		try {
			FileInputStream fStream = new FileInputStream(dosya);
			DataInputStream dStream = new DataInputStream(fStream);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));

			while ((str = bReader.readLine()) != null) {
				veri.add(str);
			}
			for (int j = 0; j < veri.size(); j++) {
				String aranan = veri.get(j);
				if (aranan.contains(a)) {
					veri.remove(j);	
					veri.add(b);
				}
			}
			dStream.close();
			FileWriter fWriter = null;
			BufferedWriter writer = null;
			try {
				fWriter = new FileWriter(dosya);
				writer = new BufferedWriter(fWriter);
				for (int i = 0; i < veri.size(); i++) {
					writer.write(veri.get(i));
					writer.newLine();
					System.out.println(veri.get(i));
				}
				writer.close();

			} catch (Exception e) {
				// TODO: handle exception
			}

		} catch (Exception e) {
			System.err.println("Hata: " + e.getMessage());
		}
	}
	
	// bundan sonrakiler genel bilgilendirme için oluşturulan metodlar
	
		/*void GenelKaydet(String a) {
			ArrayList<String> veri = new ArrayList<>();
			String st = a;
			veri.add(st);

			FileWriter fWriter = null;
			BufferedWriter writer = null;
			try {
				fWriter = new FileWriter("genel.txt", true);
				writer = new BufferedWriter(fWriter);
				for (int i = 0; i < veri.size(); i++) {
					writer.write(veri.get(i));
					writer.newLine();
					System.out.println(veri.get(i));
				}
				writer.close();

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public ArrayList<String> GenelOkuma() {
			String str;
			ArrayList<String> veri = new ArrayList<String>();
			try {
				FileInputStream fStream = new FileInputStream("genel.txt");
				DataInputStream dStream = new DataInputStream(fStream);
				BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));
				
				while ((str = bReader.readLine()) != null) {
					veri.add(str);
				}
				dStream.close();

			} catch (Exception e) {
				System.err.println("Hata: " + e.getMessage());
			}
			for (int k = 0; k < veri.size(); k++) {
				System.out.println(veri.get(k));
			}
			return veri;
		}
		
		public void GenelSil(String o) {
			String str;
			ArrayList<String> veri = new ArrayList<String>();
			try {
				FileInputStream fStream = new FileInputStream("genel.txt");
				DataInputStream dStream = new DataInputStream(fStream);
				BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));

				while ((str = bReader.readLine()) != null) {
					veri.add(str);
				}
				for (int j = 0; j < veri.size(); j++) {
					String aranan = veri.get(j);
					if (aranan.contains(o)) {
						veri.remove(j);	
					}
				}
				dStream.close();
				FileWriter fWriter = null;
				BufferedWriter writer = null;
				try {
					fWriter = new FileWriter("genel.txt");
					writer = new BufferedWriter(fWriter);
					for (int i = 0; i < veri.size(); i++) {
						writer.write(veri.get(i));
						writer.newLine();
						System.out.println(veri.get(i));
					}
					writer.close();

				} catch (Exception e) {
					// TODO: handle exception
				}

			} catch (Exception e) {
				System.err.println("Hata: " + e.getMessage());
			}
		}
		
		public void GenelGuncelle(String a, String b) {
			String str;
			ArrayList<String> veri = new ArrayList<String>();
			try {
				FileInputStream fStream = new FileInputStream("genel.txt");
				DataInputStream dStream = new DataInputStream(fStream);
				BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));

				while ((str = bReader.readLine()) != null) {
					veri.add(str);
				}
				for (int j = 0; j < veri.size(); j++) {
					String aranan = veri.get(j);
					if (aranan.contains(a)) {
						veri.remove(j);	
						veri.add(b);
					}
				}
				dStream.close();
				FileWriter fWriter = null;
				BufferedWriter writer = null;
				try {
					fWriter = new FileWriter("genel.txt");
					writer = new BufferedWriter(fWriter);
					for (int i = 0; i < veri.size(); i++) {
						writer.write(veri.get(i));
						writer.newLine();
						System.out.println(veri.get(i));
					}
					writer.close();

				} catch (Exception e) {
					// TODO: handle exception
				}

			} catch (Exception e) {
				System.err.println("Hata: " + e.getMessage());
			}
		}
	
	// bundan sonrakiler okul bilgileri için oluşturulan metodlar
	
	/*void BilgiKaydet(String a) {
		ArrayList<String> veri = new ArrayList<>();
		String st = a;
		veri.add(st);

		FileWriter fWriter = null;
		BufferedWriter writer = null;
		try {
			fWriter = new FileWriter("okulbilgi.txt", true);
			writer = new BufferedWriter(fWriter);
			for (int i = 0; i < veri.size(); i++) {
				writer.write(veri.get(i));
				writer.newLine();
				System.out.println(veri.get(i));
			}
			writer.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public ArrayList<String> BilgiOkuma() {
		String str;
		ArrayList<String> veri = new ArrayList<String>();
		try {
			FileInputStream fStream = new FileInputStream("okulbilgi.txt");
			DataInputStream dStream = new DataInputStream(fStream);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));
			
			while ((str = bReader.readLine()) != null) {
				veri.add(str);
			}
			dStream.close();

		} catch (Exception e) {
			System.err.println("Hata: " + e.getMessage());
		}
		for (int k = 0; k < veri.size(); k++) {
			System.out.println(veri.get(k));
		}
		return veri;
	}
	
	public void BilgiSil(String o) {
		String str;
		ArrayList<String> veri = new ArrayList<String>();
		try {
			FileInputStream fStream = new FileInputStream("okulbilgi.txt");
			DataInputStream dStream = new DataInputStream(fStream);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));

			while ((str = bReader.readLine()) != null) {
				veri.add(str);
			}
			for (int j = 0; j < veri.size(); j++) {
				String aranan = veri.get(j);
				if (aranan.contains(o)) {
					veri.remove(j);	
				}
			}
			dStream.close();
			FileWriter fWriter = null;
			BufferedWriter writer = null;
			try {
				fWriter = new FileWriter("okulbilgi.txt");
				writer = new BufferedWriter(fWriter);
				for (int i = 0; i < veri.size(); i++) {
					writer.write(veri.get(i));
					writer.newLine();
					System.out.println(veri.get(i));
				}
				writer.close();

			} catch (Exception e) {
				// TODO: handle exception
			}

		} catch (Exception e) {
			System.err.println("Hata: " + e.getMessage());
		}
	}
	
	public void BilgiGuncelle(String a, String b) {
		String str;
		ArrayList<String> veri = new ArrayList<String>();
		try {
			FileInputStream fStream = new FileInputStream("okulbilgi.txt");
			DataInputStream dStream = new DataInputStream(fStream);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));

			while ((str = bReader.readLine()) != null) {
				veri.add(str);
			}
			for (int j = 0; j < veri.size(); j++) {
				String aranan = veri.get(j);
				if (aranan.contains(a)) {
					veri.remove(j);	
					veri.add(b);
				}
			}
			dStream.close();
			FileWriter fWriter = null;
			BufferedWriter writer = null;
			try {
				fWriter = new FileWriter("okulbilgi.txt");
				writer = new BufferedWriter(fWriter);
				for (int i = 0; i < veri.size(); i++) {
					writer.write(veri.get(i));
					writer.newLine();
					System.out.println(veri.get(i));
				}
				writer.close();

			} catch (Exception e) {
				// TODO: handle exception
			}

		} catch (Exception e) {
			System.err.println("Hata: " + e.getMessage());
		}
	}
	
	// bundan sonrakiler okul fiyat bilgileri için oluşturulan metodlar
	
	void FiyatBilgiKaydet(String a) {
		ArrayList<String> veri = new ArrayList<>();
		String st = a;
		veri.add(st);

		FileWriter fWriter = null;
		BufferedWriter writer = null;
		try {
			fWriter = new FileWriter("fiyat.txt", true);
			writer = new BufferedWriter(fWriter);
			for (int i = 0; i < veri.size(); i++) {
				writer.write(veri.get(i));
				writer.newLine();
				System.out.println(veri.get(i));
			}
			writer.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public ArrayList<String> FiyatBilgiOkuma() {
		String str;
		ArrayList<String> veri = new ArrayList<String>();
		try {
			FileInputStream fStream = new FileInputStream("fiyat.txt");
			DataInputStream dStream = new DataInputStream(fStream);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));
			
			while ((str = bReader.readLine()) != null) {
				veri.add(str);
			}
			dStream.close();

		} catch (Exception e) {
			System.err.println("Hata: " + e.getMessage());
		}
		for (int k = 0; k < veri.size(); k++) {
			System.out.println(veri.get(k));
		}
		return veri;
	}
	
	public void FiyatBilgiSil(String o) {
		String str;
		ArrayList<String> veri = new ArrayList<String>();
		try {
			FileInputStream fStream = new FileInputStream("fiyat.txt");
			DataInputStream dStream = new DataInputStream(fStream);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));

			while ((str = bReader.readLine()) != null) {
				veri.add(str);
			}
			for (int j = 0; j < veri.size(); j++) {
				String aranan = veri.get(j);
				if (aranan.contains(o)) {
					veri.remove(j);	
				}
			}
			dStream.close();
			FileWriter fWriter = null;
			BufferedWriter writer = null;
			try {
				fWriter = new FileWriter("fiyat.txt");
				writer = new BufferedWriter(fWriter);
				for (int i = 0; i < veri.size(); i++) {
					writer.write(veri.get(i));
					writer.newLine();
					System.out.println(veri.get(i));
				}
				writer.close();

			} catch (Exception e) {
				// TODO: handle exception
			}

		} catch (Exception e) {
			System.err.println("Hata: " + e.getMessage());
		}
	}
	
	public void FiyatBilgiGuncelle(String a, String b) {
		String str;
		ArrayList<String> veri = new ArrayList<String>();
		try {
			FileInputStream fStream = new FileInputStream("fiyat.txt");
			DataInputStream dStream = new DataInputStream(fStream);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));

			while ((str = bReader.readLine()) != null) {
				veri.add(str);
			}
			for (int j = 0; j < veri.size(); j++) {
				String aranan = veri.get(j);
				if (aranan.contains(a)) {
					veri.remove(j);	
					veri.add(b);
				}
			}
			dStream.close();
			FileWriter fWriter = null;
			BufferedWriter writer = null;
			try {
				fWriter = new FileWriter("fiyat.txt");
				writer = new BufferedWriter(fWriter);
				for (int i = 0; i < veri.size(); i++) {
					writer.write(veri.get(i));
					writer.newLine();
					System.out.println(veri.get(i));
				}
				writer.close();

			} catch (Exception e) {
				// TODO: handle exception
			}

		} catch (Exception e) {
			System.err.println("Hata: " + e.getMessage());
		}
	}
	
	// bundan sonrakiler izin onay için oluşturulan metodlar
	
	void IzinOnayKaydet(String a) {
		ArrayList<String> veri = new ArrayList<>();
		String st = a;
		veri.add(st);

		FileWriter fWriter = null;
		BufferedWriter writer = null;
		try {
			fWriter = new FileWriter("izinonay.txt", true);
			writer = new BufferedWriter(fWriter);
			for (int i = 0; i < veri.size(); i++) {
				writer.write(veri.get(i));
				writer.newLine();
				System.out.println(veri.get(i));
			}
			writer.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}*/
}