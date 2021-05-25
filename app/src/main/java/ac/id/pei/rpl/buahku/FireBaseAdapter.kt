package ac.id.pei.rpl.buahku

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DatabaseReference
import java.util.ArrayList

class FireBaseAdapter(private val listDataku: ArrayList<FirebaseDataClassView>):RecyclerView.Adapter<FireBaseAdapter.FirebaseViewHolder>() {
    inner class FirebaseViewHolder(myView: View):RecyclerView.ViewHolder(myView) {
        var tvJenis: TextView = myView.findViewById(R.id.titleJenis)
        var tvDesc: TextView = myView.findViewById(R.id.desc)


        lateinit var ref: DatabaseReference
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirebaseViewHolder {
        val viewku: View = LayoutInflater.from(parent.context).inflate(R.layout.list_jenis, parent, false)
        return FirebaseViewHolder(viewku)
    }

    override fun onBindViewHolder(holder: FirebaseViewHolder, position: Int) {
        val dataku = listDataku[position]
        holder.tvJenis.text = dataku.jenis
        holder.tvDesc.text = dataku.desc


    }


    override fun getItemCount(): Int {
        return listDataku.size
    }
}


