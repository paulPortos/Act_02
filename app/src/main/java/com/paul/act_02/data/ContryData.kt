package com.paul.act_02.data

import com.paul.act_02.R

data class CountryInfo(
    val country: String,
    val capital: String,
    val flagResourceId: Int
)

val countriesWithFlags = listOf(
    CountryInfo("Afghanistan", "Kabul", R.drawable.afghanistan),
    CountryInfo("Albania", "Tirana", R.drawable.albania),
    CountryInfo("Algeria", "Algiers", R.drawable.algeria),
    CountryInfo("Benin", "Porto-Novo", R.drawable.benin),
    CountryInfo("Bhutan", "Thimphu", R.drawable.bhutan),
    CountryInfo("Bolivia", "Sucre", R.drawable.bolivia),
    CountryInfo("Botswana", "Gaborone", R.drawable.botswana),
    CountryInfo("Brunei", "Bandar Seri Begawan", R.drawable.brunei),
    CountryInfo("Canada", "Ottawa", R.drawable.canada),
    CountryInfo("China", "Beijing", R.drawable.china),
    CountryInfo("Denmark", "Copenhagen", R.drawable.denmark),
    CountryInfo("Ecuador", "Quito", R.drawable.ecuador),
    CountryInfo("France", "Paris", R.drawable.france),
    CountryInfo("Indonesia", "Jakarta", R.drawable.indonesia),
    CountryInfo("Malaysia", "Kuala Lumpur", R.drawable.malaysia),
    CountryInfo("Nigeria", "Abuja", R.drawable.nigeria),
    CountryInfo("Philippines", "Manila", R.drawable.philippines),
    CountryInfo("Sudan", "Khartoum", R.drawable.sudan),
    CountryInfo("Syria", "Damascus", R.drawable.syria),
    CountryInfo("Yemen", "Sana'a", R.drawable.yemen)
)