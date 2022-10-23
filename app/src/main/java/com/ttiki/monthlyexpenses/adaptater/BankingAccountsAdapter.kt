package com.ttiki.monthlyexpenses.adaptater

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ttiki.monthlyexpenses.R
import com.ttiki.monthlyexpenses.entities.BankingAccount

//This class is an adapter class for the banking accounts recycler view in the BankingAccountsFragment
//It will be used to display the data in the recycler view
//TODO: take this code, clean and optimize
class BankingAccountsAdapter(val bankingAccounts: Array<BankingAccount>, val listener: (BankingAccount) -> Unit)
    : RecyclerView.Adapter<BankingAccountsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        val bankingAccountItem = LayoutInflater.from(parent.context).inflate(R.layout.banking_account_item,parent, false)
        return ViewHolder(bankingAccountItem)
    }

    override fun getItemCount(): Int = bankingAccounts.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.i("XXX","onBindViewHolder")
        holder.bind(bankingAccounts[position],listener)
    }

    class ViewHolder(val elementDeListe : View) : RecyclerView.ViewHolder(elementDeListe)
    {
        fun bind(bankingAccount: BankingAccount, listener: (BankingAccount) -> Unit) = with(itemView)
        {
            Log.i("XXX","bind")
            //TODO: set the text of the text view to the name of the banking account
//            ItemView.bankingAccountName.text = bankingAccount.name
//            ItemView.bankAccountSold.text = bankingAccount.balance.toString()
//            ItemView.bankAccountId.text = bankingAccount.id.toString()
            setOnClickListener { listener(bankingAccount) }
        }
    }

}