package ac.id.pei.rpl.buahku

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DatabaseReference
import java.util.ArrayList

class FireBaseAdapter2(private val listDataku2: ArrayList<FirebaseDataClassView>):RecyclerView.Adapter<FireBaseAdapter2.FirebaseViewHolder>() {
    inner class FirebaseViewHolder(myView: View):RecyclerView.ViewHolder(myView) {
        var tvNama: TextView = myView.findViewById(R.id.titleBuah)
        var tvManfaat: TextView = myView.findViewById(R.id.manfaat)
        var tvLatin: TextView = myView.findViewById(R.id.latinname)
        lateinit var ref: DatabaseReference
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirebaseViewHolder {
        val viewku2: View = LayoutInflater.from(parent.context).inflate(R.layout.list_buah, parent, false)
        return FirebaseViewHolder(viewku2)
    }

    override fun onBindViewHolder(holder: FirebaseViewHolder, position: Int) {
        val dataku2 = listDataku2[position]
        holder.tvNama.text = dataku2.nama
        holder.tvManfaat.text = dataku2.manfaat
        holder.tvLatin.text = dataku2.latin

    }


    override fun getItemCount(): Int {
        return listDataku2.size
    }
}


