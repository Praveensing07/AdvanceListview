package com.example.advancelistview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CityAdapter(val cityData: Array<City>) : BaseAdapter() {
    override fun getCount(): Int {
        return cityData.size
    }
    override fun getItem(position: Int): City {
        return cityData[position]
    }
    override fun getItemId(position: Int): Long {
            return cityData[position].capital.hashCode().toLong()
    }

    override fun getView(position: Int, convertView: View?, container: ViewGroup): View {
        val convertView=LayoutInflater.from(container.context).inflate(R.layout.city_item,
                            container,false)
        val countru:TextView=convertView.findViewById(R.id.textView)
        val cit:TextView=convertView.findViewById(R.id.textView2)
        countru.text=getItem(position).country
        cit.text=getItem(position).capital
        return convertView
    }

}
