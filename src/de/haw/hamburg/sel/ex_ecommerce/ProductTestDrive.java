package de.haw.hamburg.sel.ex_ecommerce;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.haw.hamburg.sel.ex_ecommerce.Product;
import de.haw.hamburg.sel.ex_ecommerce.MotherBoardGroup;
import de.haw.hamburg.sel.ex_ecommerce.CPUGroup;
import de.haw.hamburg.sel.ex_ecommerce.HDDGroup;
import de.haw.hamburg.sel.ex_ecommerce.Catalogue;

public class ProductTestDrive {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[]) throws IOException {
		
		ProductComponent motherboard1 = new Product("AMD AM3+ Biostar A960D+ V3 MATX DDR3, USB 2.0", "59.90");
		ProductComponent motherboard2 = new Product("AMD AM3+ Asrock 970 Pro3 R2.0 ATX DDR3, USB 3.0", "99.90");
		ProductComponent motherboard3 = new Product("Intel 1151 Asrock Z390 Pro4, ATX, DDR4, USB3.0", "129.90");
		ProductComponent motherboard4 = new Product("Intel 1200 Asrock Z490 Phantom Gaming 4, DDR4", "169.90");
		
		ProductComponent cpu1 = new Product("Intel Pentium G4560 3,5GHz Sockel 1151, Box", "79.90");
		ProductComponent cpu2 = new Product("Intel Core i5-8400, 6x 2,8 GHz, Sockel 1151 V2 Box", "219.90");
		ProductComponent cpu3 = new Product("Intel Core i7-9700, 8x 3,0 GHz, Sockel 1151 V2, Box ", "299.90");
		ProductComponent cpu4 = new Product("Intel Core i9-10900K BOX 10x3,7GHz, Sockel 1200 Box", "669.90");
		ProductComponent cpu5 = new Product("AM4 AMD Ryzen 5 3400G 4x 3,7GHz Box", "179.90");
		ProductComponent cpu6 = new Product("AM4 AMD Ryzen 7 3700X 8x 3,6GHz, Box", "319.90");
		ProductComponent cpu7 = new Product("AM4 AMD Ryzen 9 5900X 12x 3,70GHz Box", "669.90");
		
		ProductComponent hdd1 = new Product(" 2 TB Seagate ST2000DM008, 256MB, 7200 U./Min.", "65.90");
		ProductComponent hdd2 = new Product(" 4 TB Western Digital WD40EFRX \"Red\" SATA3 119", "119.90");
		ProductComponent hdd3 = new Product(" 2 TB Seagate ST2000LM015, 128MB, 5400 U/Min.", "75.90");
		
		ProductComponent motherBoardGroup = new MotherBoardGroup("mother board", "123");
		motherBoardGroup.add(motherboard1);
		motherBoardGroup.add(motherboard2);
		motherBoardGroup.add(motherboard3);
		motherBoardGroup.add(motherboard4);
		
		ProductComponent cpuGroup = new CPUGroup("cpu", "123");
		cpuGroup.add(cpu1);
		cpuGroup.add(cpu2);
		cpuGroup.add(cpu3);
		cpuGroup.add(cpu4);
		cpuGroup.add(cpu5);
		cpuGroup.add(cpu6);
		cpuGroup.add(cpu7);
		
		ProductComponent hddGroup = new HDDGroup("hdd", "123");
		hddGroup.add(hdd1);
		hddGroup.add(hdd2);
		hddGroup.add(hdd3);
		
		ProductComponent allProducts = new Product("ALL Products", "All products combined");
		Catalogue catalogue = new Catalogue(allProducts);
		
		int continueChoice = 0;
		do {
                System.out.print("Please, select an option:" + "\n" +
                        "1 - List all products" + "\n" +
                        "2 - List a specific product group");
                int choice = Integer.parseInt(reader.readLine());
                switch (choice) {
					case 1:
						catalogue.printCatalogue();
						break;
					case 2:
						System.out.print("Please, select a product group:" + "\n" +
                        "1 - Motherboard" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n");
                        int groupChoice = Integer.parseInt(reader.readLine());
                        switch (groupChoice) {
						case 1:
							motherBoardGroup.print();
							break;
						default:
						}
						break;
					default:
				}
            } while (continueChoice != 0);
	}

}
