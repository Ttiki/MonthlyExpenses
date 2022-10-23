package com.ttiki.monthlyexpenses.entities

//This class is used as a simple object/entity class
//It will be used to store data in the database
//It will also be used to store data in the recycler view
data class BankingAccount(
    var id: Int,
    var name: String,
    var balance: Double,
    var type: String,
    var description: String,
    var icon: Int
) {
    constructor() : this(0, "", 0.0, "", "", 0)
}