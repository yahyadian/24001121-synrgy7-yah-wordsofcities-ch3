package com.yahya.challengechapter3

val alphabets =('A' .. 'Z').toList().map{ it.toString() }

enum class Cities(val char: String, val listCities: ArrayList<String>) {
    A("A", arrayListOf("Amsterdam", "Athens", "Ankara", "Adelaide", "Alexandria")),
    B("B", arrayListOf("Bangkok", "Berlin", "Buenos Aires", "Barcelona", "Beirut")),
    C("C", arrayListOf("Cairo", "Cape Town", "Chicago", "Copenhagen", "Canberra")),
    D("D", arrayListOf("Delhi", "Dubai", "Dakar", "Dublin", "Dhaka")),
    E("E", arrayListOf("Edinburgh", "Edmonton", "El Paso", "Essen", "Eugene")),
    F("F", arrayListOf("Frankfurt", "Florence", "Freetown", "Fresno", "Fortaleza")),
    G("G", arrayListOf("Guangzhou", "Geneva", "Glasgow", "Guadalajara", "Georgetown")),
    H("H", arrayListOf("Helsinki", "Hamburg", "Hanoi", "Houston", "Harare")),
    I("I", arrayListOf("Istanbul", "Islamabad", "Incheon", "Indianapolis", "Irvine")),
    J("J", arrayListOf("Jakarta", "Johannesburg", "Jerusalem", "Jeddah", "Jaipur")),
    K("K", arrayListOf("Kabul", "Karachi", "Kolkata", "Kuala Lumpur", "Kansas City")),
    L("L", arrayListOf("London", "Los Angeles", "Lima", "Lisbon", "Lahore")),
    M("M", arrayListOf("Madrid", "Moscow", "Manila", "Melbourne", "Milan")),
    N("N", arrayListOf("New York City", "Nairobi", "Naples", "Newcastle", "Nantes")),
    O("O", arrayListOf("Osaka", "Oslo", "Ottawa", "Orlando", "Omsk")),
    P("P", arrayListOf("Paris", "Prague", "Perth", "Pyongyang", "Panama City")),
    Q("Q", arrayListOf("Quito", "Quebec City", "Quanzhou", "Quezon City", "Qingdao")),
    R("R", arrayListOf("Rome", "Rio de Janeiro", "Riyadh", "Rotterdam", "Reykjavik")),
    S("S", arrayListOf("Seoul", "Sydney", "Shanghai", "San Francisco", "Sao Paulo")),
    T("T", arrayListOf("Tokyo", "Tehran", "Toronto", "Taipei", "Tashkent")),
    U("U", arrayListOf("Ulaanbaatar", "Utrecht", "Uberlândia", "Uppsala", "Udon Thani")),
    V("V", arrayListOf("Vienna", "Vancouver", "Valencia", "Vilnius", "Veracruz")),
    W("W", arrayListOf("Warsaw", "Wellington", "Wuhan", "Winnipeg", "Washington, D.C.")),
    X("X", arrayListOf("Xi'an", "Xiamen", "Xining", "Xinyang", "Xalapa")),
    Y("Y", arrayListOf("Yangon", "Yokohama", "Yerevan", "Yekaterinburg", "Yaoundé")),
    Z("Z", arrayListOf("Zurich", "Zagreb", "Zhengzhou", "Zaragoza", "Zibo")),

}