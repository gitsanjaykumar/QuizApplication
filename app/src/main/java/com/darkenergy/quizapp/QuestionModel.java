package com.darkenergy.quizapp;

public class QuestionModel {

    public static String question[] ={
            "Which company owns the android?",
            "Which one is not the programming language?",
            "Where you are watching this video?",
            "Which company owns the Apple?",
            "What is the capital of India?",
            "Who is the CEO of Apple?",
            "What is the currency of Japan?",
            "Who won the Nobel Prize for Literature in 2016?",
            "Which planet is known as the Red Planet?",
            "What is the tallest mountain in the solar system?",
            "Who painted the famous artwork, The Starry Night?",
            "What is the biggest ocean in the world?",
            "Which country hosted the 2016 Summer Olympics?",
            "What is the capital of Brazil?",
            "Who wrote the Harry Potter series?",
            "What is the smallest country in the world by land area?",
            "What is the largest desert in the world?",
            "Who won the first season of American Idol?",
            "What is the capital of Australia?",
            "Which country is home to the Great Barrier Reef?",
            "What is the currency of Switzerland?",
            "What is the national animal of Scotland?",
            "Who played the character of Indiana Jones in the Indiana Jones film series?",
            "What is the capital of France?",
            "Which country is home to the Amazon rainforest?",
            "What is the currency of China?",
            "Who won the Best Picture Oscar in 2022?",
            "What is the capital of Russia?"
    };
    public static int[] questionImages = {
            R.drawable.android, R.drawable.programming, R.drawable.videos, R.drawable.angry,
            R.drawable.india, R.drawable.ceo,
            R.drawable.japan, R.drawable.nobel, R.drawable.mars, R.drawable.solarsystem,
            R.drawable.artwork, R.drawable.ocean,
            R.drawable.olympic, R.drawable.brazil, R.drawable.harry, R.drawable.country,
            R.drawable.desert, R.drawable.totem,
            R.drawable.australia, R.drawable.barrier, R.drawable.switzerland, R.drawable.scotland,
            R.drawable.adventurer, R.drawable.france,
            R.drawable.rainforest, R.drawable.china, R.drawable.oscar, R.drawable.russia,

    };


    public static String options[][] = {
            {"Google","Apple","Nokia","Samsung"},
            {"Java","Kotlin","Notepad","Python"},
            {"Facebook","Whatsapp","Instagram","Youtube"},
            {"Google","Apple","Nokia","Samsung"},
            {"Delhi", "Mumbai", "Bangalore","Ranchi"},
            {"Tim Cook", "Steve Jobs", "Jony Ive", "Sundar Pichai"},
            {"Yen", "Won", "Dollar","Rupees"},
            {"Bob Dylan", "Svetlana Alexievich", "Patrick Modiano","Dylan"},
            {"Mars", "Venus", "Jupiter","None"},
            {"Olympus Mons", "Mauna Kea", "Mount Everest","None","None"},
            {"Vincent van Gogh", "Pablo Picasso", "Salvador Dali","None"},
            {"Atlantic Ocean", "Indian Ocean", "Pacific Ocean","None"},
            {"Brazil", "China", "Italy","None"},
            {"Brasilia", "Rio de Janeiro", "São Paulo","None"},
            {"J.K. Rowling", "Stephenie Meyer", "Suzanne Collins","None"},
            {"Vatican City", "Monaco", "San Marino","None"},
            {"Sahara Desert", "Gobi Desert", "Antarctica","None"},
            {"Kelly Clarkson", "Fantasia Barrino", "Carrie Underwood","None"},
            {"Sydney", "Melbourne", "Canberra","None"},
            {"Australia", "Indonesia", "Papua New Guinea","None"},
            {"Franc", "Euro", "Swiss Franc","None"},
            {"Unicorn", "Lion", "Eagle","None"},
            {"Harrison Ford", "Tom Cruise", "Brad Pitt","None"},
            {"Paris", "Lyon", "Marseille","None"},
            {"Peru", "Colombia", "Brazil","None"},
            {"Yuan", "Renminbi", "Hong Kong Dollar","None"},
            {"The Trial of the Chicago 7", "Nomadland", "Promising Young Woman","None"},
            {"Moscow", "St. Petersburg", "Novosibirsk","None"}

    };

        public static String correctAnswers[] = {
                "Google",
                "Notepad",
                "Youtube",
                "Apple",
                "Delhi",
                "Tim Cook",
                "Yen",
                "Bob Dylan",
                "Mars",
                "Olympus Mons",
                "Vincent van Gogh",
                "Pacific Ocean",
                "Brazil",
                "Brasilia",
                "J.K. Rowling",
                "Vatican City",
                "Sahara Desert",
                "Kelly Clarkson",
                "Canberra",
                "Australia",
                "Swiss Franc",
                "Unicorn",
                "Harrison Ford",
                "Paris",
                "Brazil",
                "Renminbi",
                "The Trial of the Chicago 7",
                "Moscow"
        };

}
