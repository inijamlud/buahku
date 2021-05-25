package ac.id.pei.rpl.buahku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*

class Buah : AppCompatActivity() {
    lateinit var fire: DatabaseReference
    lateinit var firebaseAuth: FirebaseAuth
    private lateinit var layoutku: RecyclerView
    private var ambilDatabase: ArrayList<FirebaseDataClassView> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        fire = FirebaseDatabase.getInstance().getReference("buah")
        firebaseAuth = FirebaseAuth.getInstance()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buah)
        layoutku = findViewById(R.id.rvlistBuah)
    }
    override fun onStart(){
        super.onStart()
        loadMeFirst()
    }

    private fun loadMeNow(){
        layoutku.layoutManager = LinearLayoutManager(this)
        val myA = FireBaseAdapter2(ambilDatabase)
        layoutku.adapter = myA

    }

    private fun loadMeFirst(){
        fire.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot!!.exists()){
                    ambilDatabase.clear()
                    for (x in snapshot.children){
                        val mymy = x.getValue(FirebaseDataClassView::class.java)
                        mymy!!.uid = x.key.toString()
                        ambilDatabase.add(mymy!!)
                    }
                }
                loadMeNow()
            }

            override fun onCancelled(error: DatabaseError) {

            }

        })
    }

}



