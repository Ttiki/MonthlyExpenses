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
class BankingAccountsAdapter(val bankingAccounts: Array<BankingAccount>, val listener: (BankingAccount) -> Unit)
    : RecyclerView.Adapter<BankingAccountsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        val bankingAccountItem = LayoutInflater.from(parent.context).inflate(R.layout.bankingAccountItem,parent, false)
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

            setOnClickListener { listener(bankingAccount) }
        }
    }

}