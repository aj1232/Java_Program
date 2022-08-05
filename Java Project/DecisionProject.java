//-----------------------------------------------------------------------
//	Guide to help you to buy Car/Bike
//-----------------------------------------------------------------------

import java.util.Scanner;
class DecisionProject
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n------------------------- Welcome to the Guide for buying Car/Bike -------------------------");

		System.out.println("\nDo you wanty to buy car or bike (C/B):");

		//System.out.println("(For Car press 'C' & for bike press 'B')");

		char ch = sc.next().charAt(0);

		// This is to store user's choice while selecting paqrticular company

		int ch_com;

		// This is to store user's choices while selecting models of particular company 

		int ch_mod;


		// Guide for cars
		if(ch == 'C' || ch == 'c')
		{
			System.out.println("1.Hyundai \n2.Maruti Suzuki \n3.Tata Motors \n4.Toyota \n5.Mahindra");
			System.out.println("Select Company:");

			 ch_com = sc.nextInt();
			
			switch(ch_com)
			{
				// This case is for Hyundai Models
				case 1:
				{
					System.out.println("\n---- Top selling models of Hyundai (Rank-wise) ----");
					System.out.println("1.Hyundai Santro \n2.Hyundai Verna \n3.Hyundai Grand i10 \n4.Hyundai Elite i20 \n5.Hyundai Creta");
					System.out.println("Select Model:");

					ch_mod = sc.nextInt();
					
					switch(ch_mod)
					{
						case 1:
						{
							System.out.println("\n--- 1.Hyundai Santro --- \n");
							System.out.println("Prize : Rs.4.75 - 6.9 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 20.30 kmpl \n For Automatic Petrol : 20.30 kmpl \n For Manual CNG       : 30.48 kmpl");
							System.out.println("Available Colors : \n \t\t   Star Dust, Diana Green, Fiery Red, Typhoon Silver, Marine Blue, \n \t\t   Polar White, Imperial Beige");
							break;
						}
						case 2:
						{
							System.out.println("\n--- 2.Hyundai Verna --- \n");
							System.out.println("Prize : Rs.8.95 - 17.73 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 19.10 kmpl \n For Automatic Petrol : 17.00 kmpl \n For Manual Diesel    : 24.00 kmpl \n For Automatic Diesel : 22.00 kmpl");
							System.out.println("Available Colors : \n \t\t   Fiery Red, Typhoon Silver, Alpha Blue, Thunder Black, Starry Night,\n \t\t   Polar White, Titan Gray Metallic");
							break;
						}
						case 3:
						{
							System.out.println("\n--- 3.Hyundai Grand i10 --- \n");
							System.out.println("Prize : Rs.6.89 - 9.27 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 18.90 kmpl \n For Automatic Petrol : 18.90 kmpl \n For Manual Diesel    : 24.00 kmpl \n For Manual CNG       : 22.00 kmpl");
							System.out.println("Available Colors : \n \t\t   Star Dust, Fiery Red, Typhoon Silver, Mariana Blue, Polar White, Flame Orange");
							break;
						}
						case 4:
						{
							System.out.println("\n--- 4.Hyundai Elite i20 --- \n");
							System.out.println("Prize : Rs.6.12 - 11.17 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 18.60 kmpl \n For Automatic Petrol : 17.40 kmpl \n For Manual Diesel    : 22.54 kmpl");
							System.out.println("Available Colors : \n \t\t   Dust, Fiery Red Dual Tone, Fiery Red, Passion Orange, Typhoon Silver,\n \t\t   Mariana Blue, Polar White Dual TOne, Polar White, Orange Dual Tone");
							break;
						}
						case 5:
						{
							System.out.println("\n--- 5.Hyundai Elite i20 --- \n");
							System.out.println("Prize : Rs.10.78 - 19.69 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 15.80 kmpl \n For Automatic Petrol : 14.80 kmpl \n For Manual Diesel    : 22.10 kmpl \n For Automatic Diesel : 17.60 kmpl");
							System.out.println("Available Colors : \n \t\t   Fiery Red, Passion Orange, Phantom Black, Sleek Silver, Mariana Blue,\n \t\t   Star Dust, Polar White with Phantom Black, Polar White, Passion Orange Dual Tone");
							break;
						}
						default:
						{
							System.out.println("        !!  Invalid Choice  !!");
							System.out.println("!!  Please enter number from 1 to 5  !!");
						}
					}

					break;
				}

				// This case is for Maruti Suzuki Models
				case 2:
				{
					System.out.println("-- Top selling models of Maruti Suzuki (Rank-wise)--");
					System.out.println("1.Maruti Suzuki Baleno \n2.Maruti Suzuki Alto \n3.Maruti Suzuki Vitara Brezza \n4.Maruti Suzuki Swift \n5.Maruti Suzuki Eeco");
					System.out.println("Select Model:");

					ch_mod = sc.nextInt();
					
					switch(ch_mod)
					{
						case 1:
						{
							System.out.println("\n--- 1.Maruti Suzuki Baleno --- \n");
							System.out.println("Prize : Rs.6.02 - 10.53 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 23.87 kmpl \n For Automatic Petrol : 21.40 kmpl \n For Manual Diesel    : 27.39 kmpl");
							System.out.println("Available Colors : \n \t\t   Pearl Arctic White, Metallic Premium Silver, Premium Autumn Orange,\n \t\t   Pearl Pheonix Red, Metallic Magma Grey, Nexa Blue");
							break;
						}
						case 2:
						{
							System.out.println("\n--- 2.Maruti Suzuki Alto --- \n");
							System.out.println("Prize : Rs.2.4 - 3.39 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 19.70 kmpl \n For Manual CNG       : 26.83 kmpl \n For Automatic Diesel : 22.00 kmpl");
							System.out.println("Available Colors : \n \t\t   Uptown Red, Mojito Green, Granite Grey, Cerulean Blue");
							break;
						}
						case 3:
						{
							System.out.println("\n--- 3.Maruti Suzuki Vitara Brezza --- \n");
							System.out.println("Prize : Rs.7.62 - 10.08 Lakh");
							System.out.println("Mileage: \n For Automatic Diesel : 24.30 kmpl \n For Manual Diesel    : 24.30 kmpl");
							System.out.println("Available Colors : \n \t\t   Fiery Yellow, Pearl Arctic White, Fiery Yellow with Pearl Arctic White,\n \t\t   Greanite Grey, Blazing Red, Autumn Orange, Blazing Red with Midnight Black, \n \t\t   Autumn Orange and Pearl Arctic White, Premium Silver");
							break;
						}
						case 4:
						{
							System.out.println("\n--- 4.Maruti Suzuki Swift --- \n");
							System.out.println("Prize : Rs.5.19 - 8.84 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 22.00 kmpl \n For Automatic Petrol : 22.00 kmpl \n For Manual Diesel    : 28.40 kmpl \n For Automatic Diesel : 28.40 kmpl");
							System.out.println("Available Colors : \n \t\t   Silky Silver, Solid Fire Red, Pearl Arctic White, Magma Grey,\n \t\t    Midnight Blue, Prime Lucent Orange");
							break;
						}
						case 5:
						{
							System.out.println("\n--- 5.Maruti Suzuki Eeco --- \n");
							System.out.println("Prize : Rs.3.58 - 4.72 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 15.37 kmpl \n For Manual CNG       : 21.94 kmpl ");
							System.out.println("Available Colors : \n \t\t   Mettalic Glistening Grey, Uptown Red, Metallic Silky Silver,\n \t\t    Pearl Midnight Black, Solid White, Cerulean Blue");
							break;
						}
						default:
						{
							System.out.println("        !!  Invalid Choice  !!");
							System.out.println("!!  Please enter number from 1 to 5  !!");
						}
					}

					break;
				}

				// This case is for Tata Motors Models
				case 3:
				{
					System.out.println("-- Top selling models of Tata Motors (Rank-wise)--");
					System.out.println("1.Tata Nexon \n2.Tata Tiago \n3.Tata Altroz \n4.Tata Harrier \n5.Tata Tigor");
					System.out.println("Select Model:");

					ch_mod = sc.nextInt();
					
					switch(ch_mod)
					{
						case 1:
						{
							System.out.println("\n--- 1.Tata Nexon --- \n");
							System.out.println("Prize : Rs.8.55 - 12.72 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 17.00 kmpl \n For Automatic Petrol : 17.00 kmpl \n For Manual Diesel    : 21.50 kmpl \n For Automatic Diesel : 21.50 kmpl");
							System.out.println("Available Colors : \n \t\t   Tectonic Blue, Flame Red, Calgary White, Foliage Green, Pure Silver, \n \t\t   Daytona Gray");
							break;
						}
						case 2:
						{
							System.out.println("\n--- 2.Tata Tiago --- \n");
							System.out.println("Prize : Rs.5.96 - 8.12 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 23.84 kmpl \n For Manual Diesel    : 27.28 kmpl \n For Automatic Petrol : 23.84 kmpl");
							System.out.println("Available Colors : \n \t\t   Berry Red, Ocean Blue, Pearlescent White, Espresso Brown, Titanium Grey,\n \t\t    Canyon Orange, Platinum Silver");
							break;
						}
						case 3:
						{
							System.out.println("\n--- 3.Tata Altroz --- \n");
							System.out.println("Prize : Rs.5.49 - 8.49 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 20.00 kmpl \n For Manual Diesel    : 25.00 kmpl");
							System.out.println("Available Colors : \n \t\t   Downtown Red, High Street Gold, Avenue White, Skyline Silver,\n \t\t    Midtown Grey");
							break;
						}
						case 4:
						{
							System.out.println("\n--- 4.Tata Harrier --- \n");
							System.out.println("Prize : Rs.16.9 - 21.6 Lakh");
							System.out.println("Mileage: \n For Manual Diesel    : 17.00 kmpl");
							System.out.println("Available Colors : \n \t\t   Telesto Grey, Sparkle Cocoa, Calypso Red, Orcus White, Atlas Black");
							break;
						}
						case 5:
						{
							System.out.println("\n--- 5.Tata Tigor --- \n");
							System.out.println("Prize : Rs.5.49 - 7.44 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 20.30 kmpl \n For Manual Diesel    : 24.70 kmpl \n For Automatic Petrol : 20.30 kmpl");
							System.out.println("Available Colors : \n \t\t   Deep Red, Pearlscent White, Pure Silver, Arizon Blue, Daytone Grey");
							break;
						}
						default:
						{
							System.out.println("        !!  Invalid Choice  !!");
							System.out.println("!!  Please enter number from 1 to 5  !!");
						}
					}
					break;
				}

				// This case is for Toyota Models
				case 4:
				{
					System.out.println("-- Top selling models of Toyota (Rank-wise)--");
					System.out.println("1.Toyota Innova Crysta \n2.Toyota Glanza \n3.Toyota Fortuner \n4.Toyota Yaris");
					System.out.println("Select Model:");

					ch_mod = sc.nextInt();
					
					switch(ch_mod)
					{
						case 1:
						{
							System.out.println("\n--- 1.Toyota Innova Crysta --- \n");
							System.out.println("Prize : Rs.18.4 - 26.02 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 11.25 kmpl \n For Automatic Petrol : 10.75 kmpl \n For Manual Diesel    : 13.68 kmpl \n For Automatic Diesel : 11.36 kmpl");
							System.out.println("Available Colors : \n \t\t   Silver, Avant Grade Bronze, White Pearl Crystal Shine, Super White, \n \t\t   Garnet Red, Garnet Grey");
							break;
						}
						case 2:
						{
							System.out.println("\n--- 2.Toyota Glanza --- \n");
							System.out.println("Prize : Rs.8.14 - 10.78 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 23.87 kmpl \n For Automatic Petrol : 19.56 kmpl");
							System.out.println("Available Colors : \n \t\t   Gaming Grey, Sportin Red, Enticing Silver, Insta Blue, Cafe White");
							break;
						}
						case 3:
						{
							System.out.println("\n--- 3.Toyota Fortuner --- \n");
							System.out.println("Prize : Rs.33.55 - 35.37 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 10.01 kmpl \n For Automatic Petrol : 10.26 kmpl \n For Manual Diesel    : 14.24 kmpl \n For Automatic Diesel : 15.04 kmpl");
							System.out.println("Available Colors : \n \t\t   Phantom Brown, Avant Grade Bronze, White Pearl Crystal Shine, \n \t\t   Super White, Attitude Black, Grey Metallic, Silver Metallic");
							break;
						}
						case 4:
						{
							System.out.println("\n--- 4.Toyota Yaris --- \n");
							System.out.println("Prize : Rs.8.65 - 14.06 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 17.10 kmpl \n For Automatic Petrol : 17.80 kmpl");
							System.out.println("Available Colors : \n \t\t   Wildfire Red, Phantom Brown, Wildfire Red with Attitude Black, \n \t\t   Pearl White, Silver Metallic with attitude Black, \n \t\t   Super White with Attitude Black, Super White, Grey Metallic, Silver Metallic, Grey Metallic with Attitude Black");
							break;
						}
						default:
						{
							System.out.println("        !!  Invalid Choice  !!");
							System.out.println("!!  Please enter number from 1 to 4  !!");
						}
					}
					break;
				}

				// This case is for Mahindra Models
				case 5:
				{
					System.out.println("-- Top selling models of Mahindra (Rank-wise)--");
					System.out.println("1.Mahindra Bolero \n2.Mahindra Scorpio \n3.Mahindra Alturas G4 \n4.Mahindra XUV 3OO \n5.Mahindra Thar");
					System.out.println("Select Model:");

					ch_mod = sc.nextInt();
					
					switch(ch_mod)
					{
						case 1:
						{
							System.out.println("\n--- 1.Mahindra Bolero --- \n");
							System.out.println("Prize : Rs.8.24 - 10.91 Lakh");
							System.out.println("Mileage: \n  For Manual Diesel    : 16.50 kmpl");
							System.out.println("Available Colors : \n \t\t    Lake Side Brown, Diamond White, Rocky Beige, Feiry Black");
							break;
						}
						case 2:
						{
							System.out.println("\n--- 2.Mahindra Scorpio --- \n");
							System.out.println("Prize : Rs.11.95 - 19.83 Lakh");
							System.out.println("Mileage: \n For Manual Diesel    : 16.36 kmpl");
							System.out.println("Available Colors : \n \t\t   Pearl White, Molten Red, Napoli Black, D'sat Silver");
							break;
						}
						case 3:
						{
							System.out.println("\n--- 3.Mahindra Alturas G4 --- \n");
							System.out.println("Prize : Rs.27.70 - 30.70 Lakh");
							System.out.println("Mileage: \n For Automatic Diesel : 12.35 kmpl");
							System.out.println("Available Colors : \n \t\t   Regal Blue, Lake Side Brown, Pearl White, Napoli Black, D'sat Silver");
							break;
						}
						case 4:
						{
							System.out.println("\n--- 4.Mahindra XUV3OO --- \n");
							System.out.println("Prize : Rs.9 - 14 Lakh");
							System.out.println("Mileage: \n For Manual Petrol    : 16.50 kmpl \n For Manual Petrol    : 21.50 kmpl");
							System.out.println("Available Colors : \n \t\t   Pearl White, Aquamarine, Dual-Tone red Rage, Dual-Tone Aquamarine,\n \t\t    Red Rage, D'sat Silver, Napoli Black");
							break;
						}
						case 5:
						{
							System.out.println("\n--- 5.Mahindra Thar ---\n");
							System.out.println("Prize : 11.12 - 11.57 Lakh");
							System.out.println("Mileage: \n For Manual Diesel    : 16.55 kmpl");
							System.out.println("Available Colors : \n \t\t   Aquamarine, mist Silver, Diamond White, Rocky Beige, Red Rage,\n \t\t    Black Rage");
							break;
						}
						default:
						{
							System.out.println("        !!  Invalid Choice  !!");
							System.out.println("!!  Please enter number from 1 to 5  !!");
						}
					}
					break;
				}
				default:
				{
					System.out.println("        !!  Invalid Choice  !!");
					System.out.println("!!  Please enter number from 1 to 5  !!");
				}
			}
		}
		else if(ch == 'B' || ch == 'b')
		{
			System.out.println("1.Hero Motocorp \n2.Honda Motorcycle and Scooter India \n3.Bajaj Auto \n4.Yamaha Motors \n5.TVS Motor Company");
			System.out.println("Select Company:");
			ch_com = sc.nextInt();
			switch(ch_com)
			{
				case 1:
				{
					System.out.println("-- Top selling models of Hero Motocorp (Rank-wise)--");
					System.out.println("1.Splendar \n2.HF Delux \n3.Splendar 125 \n4.Maestro");
					System.out.println("Select Model:");

					ch_mod = sc.nextInt();
					
					switch(ch_mod)
					{
						case 1:
						{
							System.out.println("\n--- 1.Splendar --- \n");
							System.out.println("Prize   : Rs.68.31 - 85.90 Thousands");
							System.out.println("Mileage : 80.6 kmpl");
							System.out.println("Available Colors : \n \t\t   Matte Shield Gold, Firefly Golden, Heavy Grey with Green, \n\t\t   Black with Sports Red, Black with Silver, Black with Purple, \n \t\t   Beetle Red, Bumble Bee Yellow, 100 Million Edition ");
							break;
						}
						case 2:
						{
							System.out.println("\n--- 2.HF Deluxe --- \n");
							System.out.println("Prize   : Rs.50.90 - 63.40 Thousands");
							System.out.println("Mileage : 65 - 70 kmpl");
							System.out.println("Available Colors : \n \t\t   Blazing Red, Techno Blue, Black with Purple, Heavy Grey with Green, \n \t\t   Heavy Grey with Black, Black with Sports Red, Black with Red");
							break;
						}
						case 3:
						{
							System.out.println("\n--- 3.Splendar 125 --- \n");
							System.out.println("Prize   : Rs.74.2 - 88.37 Thousands");
							System.out.println("Mileage : 57 kmpl");
							System.out.println("Available Colors : \n \t\t   Dusky Black, Glaze Black, Heavy Grey, Nexus Blue, Candy Blazing Red");
							break;
						}
						case 4:
						{
							System.out.println("\n--- 4.Maestro --- \n");
							System.out.println("Prize   : Rs.52.13 - 89.70 Thousands");
							System.out.println("Mileage : 45 - 51 kmpl");
							System.out.println("Available Colors : \n \t\t   Panther Black, Pearl Fadeless White, Matte Red, Matted Vernier Grey,\n \t\t   Matte Techno Blue, Matte Brown, Prismatic Purple");
							break;
						}
						default:
						{
							System.out.println("        !!  Invalid Choice  !!");
							System.out.println("!!  Please enter number from 1 to 4  !!");
						}
					}
					break;
				}
				case 2:
				{
					System.out.println("-- Top selling models of Honda Motorcycle and Scooter India (Rank-wise)--");
					System.out.println("1.Honda Grazia \n2.Honda XBlade \n3.Honda Goldwing \n4.Honda Activa");
					System.out.println("Select Model:");

					ch_mod = sc.nextInt();
					
					switch(ch_mod)
					{
						case 1:
						{
							System.out.println("\n--- 1.Honda Grazia --- \n");
							System.out.println("Prize   : Rs.61.44 - 89.75 Thousands");
							System.out.println("Mileage : 45 kmpl");
							System.out.println("Available Colors : \n \t\t   Matte Shield Gold, Firefly Golden, Heavy Grey with Green, \n\t\t   Black with Sports Red, Black with Silver, Black with Purple, \n \t\t   Beetle Red, Bumble Bee Yellow, 100 Million Edition ");
							break;
						}
						case 2:
						{
							System.out.println("\n--- 2.Honda XBlade --- \n");
							System.out.println("Prize   : Rs.78.79 - 120.0 Thousands");
							System.out.println("Mileage : 50 kmpl");
							System.out.println("Available Colors : \n \t\t   Blazing Red, Techno Blue, Black with Purple, Heavy Grey with Green, \n \t\t   Heavy Grey with Black, Black with Sports Red, Black with Red");
							break;
						}
						case 3:
						{
							System.out.println("\n--- 3.Honda Goldwing --- \n");
							System.out.println("Prize   : Rs.27.8 - 40.2 Thousands");
							System.out.println("Mileage : 14 kmpl");
							System.out.println("Available Colors : \n \t\t   Dusky Black, Glaze Black, Heavy Grey, Nexus Blue, Candy Blazing Red");
							break;
						}
						case 4:
						{
							System.out.println("\n--- 4.Honda Activa --- \n");
							System.out.println("Prize   : Rs.51.70 - 85.23 Thousands");
							System.out.println("Mileage : 60 kmpl");
							System.out.println("Available Colors : \n \t\t   Panther Black, Pearl Fadeless White, Matte Red, Matted Vernier Grey,\n \t\t   Matte Techno Blue, Matte Brown, Prismatic Purple");
							break;
						}
						default:
						{
							System.out.println("        !!  Invalid Choice  !!");
							System.out.println("!!  Please enter number from 1 to 4  !!");
						}
					}
					break;
				}
				case 3:
				{
					System.out.println("-- Top selling models of Bajaj Auto (Rank-wise)--");
					System.out.println("1.Dominor \n2.Pulsar \n3.Avenger \n4.Platina");
					System.out.println("Select Model:");

					ch_mod = sc.nextInt();
					
					switch(ch_mod)
					{
						case 1:
						{
							System.out.println("\n--- 1.Dominor --- \n");
							System.out.println("Prize   : Rs.2.12 - 2.16 Lakhs");
							System.out.println("Mileage : 26.5 kmpl");
							System.out.println("Available Colors : \n \t\t   Matte Shield Gold, Firefly Golden, Heavy Grey with Green, \n\t\t   Black with Sports Red, Black with Silver, Black with Purple, \n \t\t   Beetle Red, Bumble Bee Yellow, 100 Million Edition ");
							break;
						}
						case 2:
						{
							System.out.println("\n--- 2.Pulsar --- \n");
							System.out.println("Prize   : Rs.1.08 - 1.33 Lakhs");
							System.out.println("Mileage : 50 kmpl");
							System.out.println("Available Colors : \n \t\t   Blazing Red, Techno Blue, Black with Purple, Heavy Grey with Green, \n \t\t   Heavy Grey with Black, Black with Sports Red, Black with Red");
							break;
						}
						case 3:
						{
							System.out.println("\n--- 3.Avenger --- \n");
							System.out.println("Prize   : Rs.1.17 Lakh");
							System.out.println("Mileage : 47.2 kmpl");
							System.out.println("Available Colors : \n \t\t   Dusky Black, Glaze Black, Heavy Grey, Nexus Blue, Candy Blazing Red");
							break;
						}
						case 4:
						{
							System.out.println("\n--- 4.Platina --- \n");
							System.out.println("Prize   : Rs.47.7 - 55.54 Thousands");
							System.out.println("Mileage : 75 kmpl");
							System.out.println("Available Colors : \n \t\t   Panther Black, Pearl Fadeless White, Matte Red, Matted Vernier Grey,\n \t\t   Matte Techno Blue, Matte Brown, Prismatic Purple");
							break;
						}
						default:
						{
							System.out.println("        !!  Invalid Choice  !!");
							System.out.println("!!  Please enter number from 1 to 4  !!");
						}
					}
					break;
				}
				case 4:
				{
					System.out.println("-- Top selling models of Yamaha Motors (Rank-wise)--");
					System.out.println("1.Yamaha YZF R1 \n2.Yamaha 2021 R3 \n3.Yamaha NMax 155 \n4.Yamaha WR 155R");
					System.out.println("Select Model:");

					ch_mod = sc.nextInt();
					
					switch(ch_mod)
					{
						case 1:
						{
							System.out.println("\n--- 1.Yamaha YZF R1 --- \n");
							System.out.println("Prize   : Rs.20.39 - 20.73 Lakhs");
							System.out.println("Mileage : 20 kmpl");
							System.out.println("Available Colors : \n \t\t   Black, Blue");
							break;
						}
						case 2:
						{
							System.out.println("\n--- 2.Yamaha 2021 R3 --- \n");
							System.out.println("Prize   : Rs.3.00 - 3.50 Lakhs");
							System.out.println("Mileage : 27 kmpl");
							System.out.println("Available Colors : \n \t\t    Black, Aquamarine, Blue.");
							break;
						}
						case 3:
						{
							System.out.println("\n--- 3.Yamaha NMax 155 --- \n");
							System.out.println("Prize   : Rs.1.17 - 1.3 Lakh");
							System.out.println("Mileage : 35 - 40 kmpl");
							System.out.println("Available Colors : \n \t\t   Gun Metalic Grey, Blue, Midnight Black");
							break;
						}
						case 4:
						{
							System.out.println("\n--- 4.Yamaha WR 155R --- \n");
							System.out.println("Prize   : Rs.1.50 Lakhs");
							System.out.println("Mileage : 40 - 45 kmpl");
							System.out.println("Available Colors : \n \t\t   Blue, Black");
							break;
						}
						default:
						{
							System.out.println("        !!  Invalid Choice  !!");
							System.out.println("!!  Please enter number from 1 to 4  !!");
						}
					}
					break;
				}
				case 5:
				{
					System.out.println("-- Top selling models of TVS Motor Company (Rank-wise)--");
					System.out.println("1.TVS Apache RTR \n2.TVS Vector \n3.TVS Sports \n4.TVS Star City");
					System.out.println("Select Model:");

					ch_mod = sc.nextInt();
					
					switch(ch_mod)
					{
						case 1:
						{
							System.out.println("\n--- 1.TVS Apache RTR --- \n");
							System.out.println("Prize   : Rs.1.45 Lakh");
							System.out.println("Mileage : 45 kmpl");
							System.out.println("Available Colors : \n \t\t   T Grey, Pearl White, Matte Blue, Gloss Red, Gloss Black and Matte Red");
							break;
						}
						case 2:
						{
							System.out.println("\n--- 2.TVS Vector --- \n");
							System.out.println("Prize   : Rs.49.49 - 51.49 Thousands");
							System.out.println("Mileage : 76 kmpl");
							System.out.println("Available Colors : \n \t\t    Silver, Red Hot, Grey new, Blue, Red, Grey, Matte Blue, Black Gold");
							break;
						}
						case 3:
						{
							System.out.println("\n--- 3.TVS Sports --- \n");
							System.out.println("Prize   : Rs.37.6 Thousands");
							System.out.println("Mileage : 95 kmpl");
							System.out.println("Available Colors : \n \t\t   Black Green, Black Blue, White And Red, White Purple, \n \t\t   Volcanic Red, Mercury Grey and Black Red");
							break;
						}
						case 4:
						{
							System.out.println("\n--- 4.TVS Star City --- \n");
							System.out.println("Prize   : Rs.44.69 - 48.93 Thousands");
							System.out.println("Mileage : 86 kmpl");
							System.out.println("Available Colors : \n \t\t   White Black, Red Black, Grey Black, Black Red, Black Blue, \n \t\t   Pearl Blue Silver and Black Red.");
							break;
						}
						default:
						{
							System.out.println("        !!  Invalid Choice  !!");
							System.out.println("!!  Please enter number from 1 to 4  !!");
						}
					}
					break;
				}
				default:
				{
					System.out.println("         !! Invalid Choice !!");     
					System.out.println("!! Please enter number from 1 to 5 !!");
				}
			}
		}
		else
		{
			System.out.println("    !!  Invalid Choice  !!");
			System.out.println("!!  Please enter 'C' or 'B'  !!");
		}
	}
}
