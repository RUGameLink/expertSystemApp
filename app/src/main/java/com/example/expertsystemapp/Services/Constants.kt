package com.example.expertsystemapp.Services


import android.provider.Settings.Secure.getString
import com.example.expertsystemapp.R

object Constants{
    fun getTheFirstSection(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Хочешь кушать?",
            R.drawable.food,
            "Хочу",
            "Не хочу",
            "Нет"
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "Точно не хочешь кушать?",
            R.drawable.food,
            "Хочу",
            "Не хочу",
            "Нет"
        )
        questionsList.add(que2)

        return questionsList
    }

    fun getTheSecondSection(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Супчик?",
            R.drawable.soup,
            "Да",
            "Нет",
               "Суп"
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "Что-нибудь с картошечкой??",
            R.drawable.potato,
            "Да",
            "Нет",
            "Картошка"
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Макарошки??",
            R.drawable.noodles,
            "Да",
            "Нет",
            "Макароны"
        )
        questionsList.add(que3)
        return questionsList
    }

    fun getTheFourthSection(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "С курочкой?",
            R.drawable.chicken,
            "Да",
            "Нет",
            "Курица"
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "С говядинкой?",
            R.drawable.cow,
            "Да",
            "Нет",
            "Говядина"
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Со свининкой?",
            R.drawable.pig,
            "Да",
            "Нет",
            "Свинина"
        )
        questionsList.add(que3)

        return questionsList
    }

    fun getTheThirdSection(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "С мясом?",
            R.drawable.meat,
            "Да",
            "Нет",
            "Мясо"
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "С овощами?",
            R.drawable.vegetables,
            "Да",
            "Нет",
            "Овощи"
        )
        questionsList.add(que2)

        return questionsList
    }

    fun getFoodList(): ArrayList<Food>{
        val foodList = ArrayList<Food>()

        val food1 = Food(
            0,
            "СУП С КАРТОШКОЙ И КУРИЦЕЙ",
        "Суп",
        "Курица",
        "https://1000.menu/cooking/62719-sup-s-kartoshkoi-i-kuricei",
            R.drawable.soup
        )
        foodList.add(food1)

        val food2 = Food(
            1,
            "Щи с говядинкой и капусткой",
            "Суп",
            "Говядина",
            "https://1000.menu/cooking/39917-klassicheskie-shchi-iz-svejei-kapusty",
            R.drawable.soup
        )
        foodList.add(food2)

        val food3 = Food(
            1,
            "Приходи когда захочешь:)",
            "Нет",
            "Нет",
            "https://www.youtube.com/watch?v=nUwTnJ8yFXY",
            R.drawable.meat_no
        )
        foodList.add(food3)

        val food4 = Food(
            1,
            "Харчо из свинины с рисом",
            "Суп",
            "Свинина",
            "https://1000.menu/cooking/26995-sup-xarcho-iz-svininy-s-risom",
            R.drawable.soup
        )
        foodList.add(food4)

        val food5 = Food(
            1,
            "Бухлер из баранины",
            "Суп",
            "Баранина",
            "https://1000.menu/cooking/22825-buxler-iz-baraniny",
            R.drawable.soup
        )
        foodList.add(food5)

        val food6 = Food(
            1,
            "РАССОЛЬНИК ОВОЩНОЙ",
            "Суп",
            "Овощи",
            "https://1000.menu/cooking/694-rassolnik-ovoshchnoi",
            R.drawable.soup
        )
        foodList.add(food6)

        val food7 = Food(
            1,
            "ГРИБНОЙ СУП ИЗ ЛЕСНЫХ ГРИБОВ",
            "Суп",
            "Грибы",
            "https://1000.menu/cooking/38714-gribnoi-sup-iz-lesnyx-gribov",
            R.drawable.soup
        )
        foodList.add(food7)

        val food8 = Food(
            1,
            "КАРТОШКА С БАКЛАЖАНАМИ ОВОЩНОЕ РАГУ",
            "Картошка",
            "Овощи",
            "https://1000.menu/cooking/10293-kartoshka-s-baklajanami-ovoshchnoe-ragu",
            R.drawable.potato
        )
        foodList.add(food8)

        val food9 = Food(
            1,
            "КАРТОШКА С БЕЛЫМИ ГРИБАМИ ЖАРЕНАЯ НА СКОВОРОДЕ",
            "Картошка",
            "Грибы",
            "https://1000.menu/cooking/36209-jarenaya-kartoshka-s-belymi-gribami",
            R.drawable.potato
        )
        foodList.add(food9)

        val food10 = Food(
            1,
            "БУТЕРБРОД",
            "Бутерброд",
            "Нет",
            "https://1000.menu/catalog/buterbrodj",
            R.drawable.bread
        )
        foodList.add(food10)

        val food11 = Food(
            1,
            "ЦЫПЛЕНОК ТАБАКА КАРТОШКОЙ",
            "Картошка",
            "Курица",
            "https://1000.menu/cooking/20527-cyplenok-tabaka-kartoshkoi",
            R.drawable.potato
        )
        foodList.add(food11)

        val food12 = Food(
            1,
            "ЖАРКОЕ ИЗ СВИНИНЫ С КАРТОШКОЙ",
            "Картошка",
            "Свинина",
            "https://1000.menu/cooking/59017-jarkoe-iz-svininy-s-kartoshkoi",
            R.drawable.potato
        )
        foodList.add(food12)

        val food13 = Food(
            1,
            "ГОВЯДИНА С КАРТОШКОЙ ТУШЕНАЯ",
            "Картошка",
            "Говядина",
            "https://1000.menu/cooking/42387-govyadina-s-kartoshkoi-tushenaya",
            R.drawable.potato
        )
        foodList.add(food13)

        val food14 = Food(
            1,
            "БАРАНИНА С КАРТОШКОЙ В ДУХОВКЕ",
            "Картошка",
            "Баранина",
            "https://1000.menu/cooking/30825-baranina-s-kartoshkoi-v-duxovke",
            R.drawable.potato
        )
        foodList.add(food14)

        val food15 = Food(
            1,
            "САЛАТ ФУНЧОЗА С ОВОЩАМИ",
            "Макароны",
            "Овощи",
            "https://1000.menu/cooking/24930-salat-funchoza-s-ovoshchami",
            R.drawable.noodles
        )
        foodList.add(food15)

        val food16 = Food(
            1,
            "ГНЕЗДА С ГРИБАМИ",
            "Макароны",
            "Грибы",
            "https://1000.menu/cooking/26284-gnezda-s-gribami",
            R.drawable.noodles
        )
        foodList.add(food16)

        val food17 = Food(
            1,
            "ЗАПЕЧЕННЫЕ КУРИНЫЕ ГОЛЕНИ В МАЙОНЕЗЕ ДРАКОНЧИКИ В ГНЕЗДАХ",
            "Макароны",
            "Курица",
            "https://1000.menu/cooking/6734-kurinaja-golen-zapechennaja",
            R.drawable.noodles
        )
        foodList.add(food17)

        val food18 = Food(
            1,
            "ЛАПША УДОН СО СВИНИНОЙ В СЛАДКОМ СОУСЕ",
            "Макароны",
            "Свинина",
            "https://1000.menu/cooking/21362-lapsha-udon-so-svininoi-v-sladkom-souse",
            R.drawable.noodles
        )
        foodList.add(food18)

        val food19 = Food(
            1,
            "ПАСТА С ГОВЯДИНОЙ В ТОМАТНОМ СОУСЕ",
            "Макароны",
            "Говядина",
            "https://1000.menu/cooking/33963-pasta-s-govyadinoi-v-tomatnom-souse",
            R.drawable.noodles
        )
        foodList.add(food19)

        val food20 = Food(
            1,
            "Баранина с макаронами",
            "Макароны",
            "Баранина",
            "https://www.iamcook.ru/showrecipe/9090",
            R.drawable.noodles
        )
        foodList.add(food20)
        return foodList
    }
}