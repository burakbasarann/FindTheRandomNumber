package com.example.randomsayiyibul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var canin=5
        val rndm = (0..100).random()
        val txtrapor=findViewById<TextView>(R.id.txtrapor)
        val textInputLayout=findViewById<TextInputLayout>(R.id.textInputLayout)
        val txtedittext=findViewById<TextInputEditText>(R.id.textInputEditText)
        val can1=findViewById<ImageView>(R.id.can1)
        val can2=findViewById<ImageView>(R.id.can2)
        val can3=findViewById<ImageView>(R.id.can3)
        val can4=findViewById<ImageView>(R.id.can4)
        val can5=findViewById<ImageView>(R.id.can5)

        textInputLayout.setEndIconOnClickListener {

            if (txtedittext.text.toString().toInt()>rndm){
                txtrapor.text="Düşmelisin Dostum"
                canin--
                if(can5.visibility==View.VISIBLE){
                    can5.visibility=View.GONE
                }
                else if(can4.visibility==View.VISIBLE){
                    can4.visibility=View.GONE
                }else if(can3.visibility==View.VISIBLE){
                    can3.visibility=View.GONE
                }else if(can2.visibility==View.VISIBLE){
                    can2.visibility=View.GONE
                }else if(can1.visibility==View.VISIBLE){
                    can1.visibility=View.GONE
                }
            }
            else if(txtedittext.text.toString().toInt()<rndm){
                txtrapor.text="Arttırmalısın Dostum"
                canin--
                if(can5.visibility==View.VISIBLE){
                    can5.visibility=View.GONE
                }
                else if(can4.visibility==View.VISIBLE){
                    can4.visibility=View.GONE
                }else if(can3.visibility==View.VISIBLE){
                    can3.visibility=View.GONE
                }else if(can2.visibility==View.VISIBLE){
                    can2.visibility=View.GONE
                }else if(can1.visibility==View.VISIBLE){
                    can1.visibility=View.GONE
                }
            }
            else {
                txtrapor.text="Helal Olsun Dostum"
                val i = Intent(this,KazandinActivity::class.java)
                startActivity(i)
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                finish()
            }


            if (canin==0)
            {
                val i = Intent(this,KaybetinActivity::class.java)
                startActivity(i)
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                finish()
            }



        }

    }
}