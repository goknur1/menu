package com.uniyaz.menu;

import java.util.Scanner;

public class App 
{
   
	public static void main( String[] args )
    {
    	 boolean cikis=false;
         Scanner tara =new Scanner(System.in);
         byte secim=-1;
         while (!cikis) {
             System.out.println("----- MENU------");
             System.out.println("0 - Yazılan cümleyi terse çevir. \n1 - Sayı girişine göre yıldızlama \n2 - Cümlede belirli parcayı alma \n3 - Girilen sayının çiftlerini bulma \n4 - Girilen sayının teklerini bulma \n5 - Çıkış");
             System.out.println(" \n Lütfen yapmak istediğiniz işlemi seçin.. : ");
             secim=tara.nextByte();
  
             switch (secim){
                 case 0:
                     tersOkuma();
                     break;
                 case 1:
                     yıldızlama();
                     break;
                 case 2:
                     parçaAlma(args);
                     break;
                 case 3:
                     ciftSiralama();
                     break;
                 case 4:
                     tekSiralama();
                     break;
                 case 5:
                	 cikis();
                	 break;
                 default:
                     break;
  
             }
  
         }
  
     }

	private static void tersOkuma() {
		// TODO Auto-generated method stub
		Scanner oku =new Scanner(System.in);
		System.out.println(" Lütfen cümlenizi giriniz...");
		String metin =oku.nextLine();
		String ters="";
		for(int i=metin.length()-1 ;i>=0;i--){
			ters=ters+ metin.charAt(i);
		}
    	System.out.println("Girdiğiniz cümlenin tersi: \n" + ters );

		
		
	}

	private static void yıldızlama() {
		// TODO Auto-generated method stub
		Scanner yildiz=new Scanner(System.in);
		int sayi;
		System.out.println(" Bir sayı giriniz..");
		 sayi=yildiz.nextInt();
		for(int i=0 ;i <=sayi; i++)
		{   
			if(i==0)
			{
			for(int j=0; j<sayi-1 ; j++)
			{
				System.out.printf("*");
			
			}
			}
			
			else {
				System.out.printf("*");
			    System.out.println("");
		}
		
	}
	}

	private static void parçaAlma(String[] args) {
		// TODO Auto-generated method stub

		Scanner kelimeAra= new Scanner (System.in);
		System.out.println(" Bir cümle yazınız..");
		String cumle= kelimeAra.nextLine();	
		int sayi1;
		System.out.println(" Bir sayı giriniz..");
		sayi1=kelimeAra.nextInt();
		int sayi2;
		System.out.println(" Bir sayı giriniz..");
		sayi2=kelimeAra.nextInt();
		cumle.substring(sayi1, sayi2);
		System.out.println(" istenilen kısım= " + cumle.substring(sayi1, sayi2));
	}

	private static void ciftSiralama() {
		// TODO Auto-generated method stub
		Scanner cift = new Scanner(System.in);
		System.out.println(" Bir sayı giriniz..");
		int sayi=cift.nextInt();
		
		for(int i=0 ;i <= sayi; i++ ) {
			if(i%2==0) {
				System.out.println("çift sayılar :"+i);
				}
		}
		
	}

	private static void tekSiralama() {
		// TODO Auto-generated method stub
		Scanner tek = new Scanner(System.in);
		System.out.println(" Bir sayı giriniz..");
		int sayi=tek.nextInt();
		
		for(int i=0 ;i <= sayi; i++ ) {
			if(i%2==1) {
				System.out.println("tek sayılar :"+i);
				
			}
		}
		
	}

	private static void cikis() {
		// TODO Auto-generated method stub
		System.out.println("başarıyla cıkıs yaptınız..");

	}
    }

