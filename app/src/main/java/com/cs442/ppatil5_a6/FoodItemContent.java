package com.cs442.ppatil5_a6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Priyanka on 9/30/2015.
 */
public class FoodItemContent {

    public static List<FoodItem> ITEMS = new ArrayList<FoodItem>();

    /**
     * A map of Food items, by ID.
     */
    public static Map<String, FoodItem> ITEM_MAP = new HashMap<String, FoodItem>();

    static {
        // Add 3 sample items.
        addItem(new FoodItem(1, "Chhole Bhature",8.5,
                        "Chole bhature is a combination of chole (spicy white chick peas) and fried bread called bhatoora (made of maida flour). Served with onions, carrot pickle, green chutney and achaar.",
                        "white chick peas, plain flour, potatoes, oil, onion, ginger, garlic, chilli powder, dried mango powder, turmeric powder, cumin seeds ,salt",
                        "For the chole:\n\n1.Pressure cook the white chick peas for 3 whistles until they are soft.Drain and keep aside.\n\n" +
                        "2.Heat the oil in a pan, add the cumin seeds. When the seeds crackle, add the onion, ginger and garlic and sauté till the onion is golden brown.\n\n" +
                        "3.Add the chilli powder, dried mango powder, turmeric powder, and salt and sauté for another minute.\n\n" +
                        "4.Add the white chick peas and 1 cup of water and mix well. Simmer for 10 to 15 minutes.\n\n" +
                        "\n" +
                        "\nFor the bhature\n\n" +
                        "5.Combine the flour, potato, 1½ teaspoons of oil and salt and knead into a firm dough without using any water.Cover dough with a wet muslin cloth and rest the dough for 10 minutes\n\n" +
                        "6.Divide the dough into 4 equal parts and roll out into circles of 5\" diameter.\n\n" +
                        "7.Deep fry in hot oil till the bhaturas puff up and both sides are golden brown."));

        addItem(new FoodItem(2,"Pav Bhaji",10,"A famous street food of Mumbai. Assorted vegetables cooked with masalas and served with pav.",
                        "carrot, potatoes, capsicum, cauliflower, french beans, green peas, onions, green chillis, ginger-garlic paste, turmeric powder, red chilli powder, Pav Bhaji Masala, sugar ,salt, tomatoes, lemon juice, butter, coriander, oil, pav bread.",
                        "1. Pressure cook potatoes, cauliflower, peas, beans and carrot along water, till soft. Drain any left over water and keep aside. Mash all the cooked vegetables using a masher.\n\n" +
                        "2. Heat oil in a vessel, add the green chillis and onions and saute for 4 min. Add the ginger-garlic paste and saute for another 3 min. Add capsicum and saute for 2 min.\n\n" +
                        "3. Add the chilli powder, turmeric powder, pav bhaji masala, sugar and salt. Combine well. Add the tomatoes and cook until soft, approx 5-6 min.\n\n" +
                        "4. Add the mashed vegetables along with a cup of the drained vegetable stock and cook on high for a min. Reduce flame and simmer for 14-15 min.\n\n" +
                        "5. The gravy will begin to thicken. Adjust the salt, if required. Turn off heat and add butter and lemon juice and combine. Garnish with fresh coriander leaves.\n\n" +
                        "6. Serve hot with lightly toasted pav/pau and sliced onions.\n"));

        addItem(new FoodItem(3,"Pani Puri",3.5,"Crisp semolina puris filled with sprouts and chilled mint flavoured water make a great snack for a hot summer afternoon.",
                        "For Puri:Flour , Semolina ,Oil , Salt Sour Water: Water, Tamarind , Black salt , Salt ,Cumin seed,Red chilli powder,Black pepper, Dry ginger ,Sugar",
                        "For Puri:\n" +
                        "1.Mix all ingredients mix well kneed and make dough and put a side for 3-4 hours.\n\n" +
                        "2.Make balls by applying slight oil.Roll with pin roller now cut with any glass or cap.\n\n" +
                        "3.Heat oil and put puri press and dip with spoon let it fry well from both sides.\n\n" +
                        "\n" +
                        "\nFor Sour water:\n\n" +
                        "4.Mix all ingredients in pan, cook till 2-3 boils and dish out.\n\n" +
                        "5.Prick fried puries from center fill it with sour water.\n\n" +
                        "6.Serve with red chilli and green chutney.\n\n"));


        addItem(new FoodItem(4,"Samosa",4.5,"This is India’s popular snack. Savory comfort food at its best, a crisp exterior filled with a savory potato stuffing."
                         ,"Refined flour, Baking soda, Butter, Salt, Oil For filling: Potatoes, Onion , Whole white cumin ,Red chilies powder, Turmeric powder, Mustard seeds, Whole coriander, Green chilies , Lemon juice, Fresh coriander , Salt",
                        "1.Mix baking soda, salt and oil in refined flour and knead with water.Set aside for 10 minute.\n\n" +
                        "2.Make balls from dough, apply little oil and roll out into rounds.Cover and set aside for 25 minutes.\n\n" +
                        "3.Heat 2 tbsp oil in a pot and saute onion, mustard seeds and cumin seeds till golden.\n\n" +
                        "4.Add potatoes and all filling ingredients except lemon juice and fry for 5 minutes.Add lemon juice and remove form flame.\n\n" +
                        "5.Cut rounds from centre and fold into cone shape.Seal side of cone with flour paste. Fill with potato mixture and seal from top with flour paste.\n\n" +
                        "6.Repeat process to make samosay.\n\n" +
                        "7.Heat oil in wok and fry samosay till golden and remove on absorbent paper.\n\n" +
                        "8.Serve hot with chili garlic sauce or chuttni.\n\n"));


        addItem(new FoodItem(5,"Paneer Butter Masala",11,"Peneer cooked in spicy tomato gravy. Served with rice or roti."
                        ,"Butter, paneer (cottage cheese) cubes, onion paste, ginger-garlic paste, tomato puree, chilli powder, garam masala, sugar, salt, fresh cream, coriander",
                        "1.Heat 1/2 the butter in a pan, add the paneer and saute till it turns to golden brown in colour.\n\n" +
                        "2.Remove from the flame and keep aside.\n\n" +
                        "3.Heat the remaining butter in the same pan, add the onion paste and ginger-garlic paste, mix well and saute for 5 minutes on medium flame.\n\n" +
                        "4.Add the chilli powder, garam masala, sugar, salt and tomato puree, mix well and cook for 5 minutes.\n\n" +
                        "5.Add the paneer and 150 ml water, mix well and simmer for 5 minutes.\n\n" +
                        "6.Add the cream and simmer futher for 2 minutes.\n\n" +
                        "7.Serve hot garnished with coriander.\n"));

        addItem(new FoodItem(6,"Roti",2,"Soft, delicious Indian Bread.",
                        "Whole wheat flour ,Clarified butter, Flour to dust, Salt",
                        "1.Sieve the flour with the salt onto a kneading platter.\n\n" +
                        "2.Make a well in the flour and pour approximately 350 ml/1 1/2 cups water into it.\n\n" +
                        "3.Gradually mix the flour and water and then knead to a soft dough.\n\n" +
                        "4.Cover with a damp cloth and set aside for 20 minutes.\n\n" +
                        "5.Divide into 8 portions. Make into balls and dust with flour.\n\n" +
                        "6.Pat and flatten each ball with the palms to make 6 inch wide discs.\n\n" +
                        "7.Wearing an oven glove stick the roti to the side of a moderately hot tandoor.\n\n" +
                        "8.Bake for two minutes then peal off swiftly.\n\n" +
                        "9.Place on a greased baking tray and bake for 5 to 6 minutes at 350 ºF in a preheated oven.\n"));


        addItem(new FoodItem(7,"Alu Paratha",9,"Delicious parathas filled with a mouthwatering mashed potatoes mixture which tastes best sizzling hot with a bowl of yogurt.",
                        "Potatoes, Lemon juice , Green chillies, Coriander leaves, Black pepper powder, Red chilli flakes, Oil, Salt , Plain flour,Self rising flour ",
                        "1.Peel and mash the potatoes with a fork.\n\n" +
                        "2.Add lemon juice, green chillies, coriander leaves, black pepper powder, red chilli flakes and salt to the mashed potatoes and mix well.\n\n" +
                        "3.In a separate bowl, knead the plain flour with salt, and some water to make a smooth dough.\n\n" +
                        "4.Divide the dough into equal sized balls.\n\n" +
                        "5.Roll out one ball of dough with a rolling pin.\n\n" +
                        "6.Spread the potato mixture on it.\n\n" +
                        "7.Roll out a second ball of dough and cover it with the first one.\n\n" +
                        "8.Repeat the steps until the potato mixture is all used.\n\n" +
                        "9.Add some water to the self rising flour and seal the edges of the paratha with this paste.\n\n" +
                        "10.Heat a griddle and apply a little amount of oil on both the sides of the paratha and fry till crisp and brown.\n"));

        addItem(new FoodItem(8,"Veg Kadai",15,"This dish has goodness of a variety of vegetables adding colour, taste and nutrition.Served with rice or roti.",
                        "cauliflower florets, carrots, green beans, onion, green bell pepper, garlic, ginger, tomatoes, cardamom powder, turmeric powder, coriander powder, garam masala powder, red chilli powder, dried fenugreek, oil, butter, salt",
                        "1.Steam all the vegetables (carrots, beans and cauliflower). Once the vegetables are steamed, keep them aside.\n\n" +
                        "2.Next in a large kadai, add in a tablespoon of oil. Add in the grated ginger, garlic, onions and capsicum. Stir fry on medium high heat until the onions and capsicum have become lightly lender but are still a little crisp.\n\n" +
                        "3.Once the onions and capsicum have reached the texture that you desire; add in the tomato puree, coriander, turmeric, cardamom, garam masala and red chilli powder. Saute all the ingredient.\n\n" +
                        "4.Add in the dried fenugreek leaves. Cover the pan, turn the heat to low and simmer for about 3 to 5 minutes.\n\n"));


        addItem(new FoodItem(9,"Veg Pulav",17.5,"Vegetable pulao makes a nice evening meal. This is the most comforting one pot meal for family.",
                        "Basmati rice, Black cardamom, Green cardamom, Cinnamon, Garlic , Whole hot spices, Mixed vegetables, Salt, White cumin seed powder, Peppercorns, Onion, Oil",
                        "1.Cut the mixed vegetables into small pieces.\n\n" +
                        "2.Wash the rice and soak it.\n\n" +
                        "3.Heat oil in a pot and add cardamoms, cinnamon, garlic and peppercorns.\n\n" +
                        "4.Stir till there is an aroma.\n\n" +
                        "5.Add onion and fry till they turn golden brown.\n\n" +
                        "6.Add vegetables and salt and cook for 5 minutes.\n\n" +
                        "7.Add white cumin seed powder and stir.\n\n" +
                        "8.Add 600 ml of water and bring to boil.\n\n" +
                        "9.Add rice and cook on high flame till most of the water dries.\n\n" +
                        "10.Cover tightly and steam on very low flame for 10-15 min.\n"));

        addItem(new FoodItem(10,"Rice",10," This dish has goodness of Basmati Rice.",
                        "Basmati Rice, Cold water, Ghee or butter, Salt",
                        "1.Wash the rice twice in fresh water.\n\n" +
                        "2.Leave to soak for 5 minutes, then drain.\n\n" +
                        "3.Warm the ghee in a saucepan, add rice and fry, stirring frequently, for 5 minutes.\n\n" +
                        "4.Add the water and salt, stir and cook till 3/4 of the water has dried.\n\n" +
                        "5.Place saucepan in a moderate oven on a low heat and cook till water has gone and rice is tender.\n"));

    }

    private static void addItem(FoodItem foodItem) {
        ITEMS.add(foodItem);
        ITEM_MAP.put(Integer.toString(foodItem.getId()), foodItem);
    }

}
