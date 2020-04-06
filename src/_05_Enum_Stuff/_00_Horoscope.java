package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	static // 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	void HoroscopeMaker(Zodiac zodiac) {
		switch(zodiac) {
		case ARIES:{
			System.out.println("Aries loves to be number one, so it’s no surprise that these audacious rams are the first sign of the zodiac. Bold and ambitious, Aries dives headfirst into even the most challenging situations. Read your sign's full profile here. Next, read this month’s Aries horoscope predictions. ");
		}
		case TAURUS:{
			System.out.println("Taurus is an earth sign represented by the bull. Like their celestial spirit animal, Taureans enjoy relaxing in serene, bucolic environments surrounded by soft sounds, soothing aromas, and succulent flavors. Read your sign's full profile here. Next, read this month’s Taurus horoscope predictions");
		}
		case GEMINI:{
			System.out.println("Have you ever been so busy that you wished you could clone yourself just to get everything done? That’s the Gemini experience in a nutshell. Appropriately symbolized by the celestial twins, this air sign was interested in so many pursuits that it had to double itself. Read your sign's full profile here. Next, read this month’s Gemini horoscope predictions.");
		}
		case CANCER:{
			System.out.println("Cancer is a cardinal water sign. Represented by the crab, this crustacean seamlessly weaves between the sea and shore representing Cancer’s ability to exist in both emotional and material realms. Cancers are highly intuitive and their psychic abilities manifest in tangible spaces: For instance, Cancers can effortlessly pick up the energies in a room.");
		}
		case LEO:{
			System.out.println("Roll out the red carpet because Leo has arrived. Leo is represented by the lion and these spirited fire signs are the kings and queens of the celestial jungle. They’re delighted to embrace their royal status: Vivacious, theatrical, and passionate, Leos love to bask in the spotlight and celebrate themselves. ");
		}
		case VIRGO:{
			System.out.println("Virgo is an earth sign historically represented by the goddess of wheat and agriculture, an association that speaks to Virgo’s deep-rooted presence in the material world. Virgos are logical, practical, and systematic in their approach to life. This earth sign is a perfectionist at heart and isn’t afraid to improve skills through diligent and consistent practice.");
		}
		case LIBRA:{
			System.out.println("Libra is an air sign represented by the scales (interestingly, the only inanimate object of the zodiac), an association that reflects Libra's fixation on balance and harmony. Libra is obsessed with symmetry and strives to create equilibrium in all areas of life.");
		}
		case SCORPIO:{
			System.out.println("Scorpio is one of the most misunderstood signs of the zodiac. Because of its incredible passion and power, Scorpio is often mistaken for a fire sign. In fact, Scorpio is a water sign that derives its strength from the psychic, emotional realm.");
		}
		case SAGITTARIUS:{
			System.out.println("Represented by the archer, Sagittarians are always on a quest for knowledge. The last fire sign of the zodiac, Sagittarius launches its many pursuits like blazing arrows, chasing after geographical, intellectual, and spiritual adventures. ");
		}
		case CAPRICORN:{
			System.out.println("The last earth sign of the zodiac, Capricorn is represented by the sea goat, a mythological creature with the body of a goat and tail of a fish. Accordingly, Capricorns are skilled at navigating both the material and emotional realms.");
		}
		case AQUARIUS:{
			System.out.println("Despite the “aqua” in its name, Aquarius is actually the last air sign of the zodiac. Aquarius is represented by the water bearer, the mystical healer who bestows water, or life, upon the land. Accordingly, Aquarius is the most humanitarian astrological sign. ");
		}
		case PISCES:{
			System.out.println("Pisces, a water sign, is the last constellation of the zodiac. It's symbolized by two fish swimming in opposite directions, representing the constant division of Pisces' attention between fantasy and reality. As the final sign, Pisces has absorbed every lesson — the joys and the pain, the hopes and the fears — learned by all of the other signs.");
		}
		
		}
	}
	public static void main(String[] args) {
		HoroscopeMaker(Zodiac.AQUARIUS);
		
		
	}
	
	// 3. Make a main method to test your method
	
}
