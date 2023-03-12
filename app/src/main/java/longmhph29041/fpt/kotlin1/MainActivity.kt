package longmhph29041.fpt.kotlin1

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import longmhph29041.fpt.kotlin1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val tong : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLuu.setOnClickListener {
//            val snackbar : Snackbar
//            snackbar = Snackbar.make(it,"Heloo ",Snackbar.LENGTH_INDEFINITE)
//            snackbar3.show()
//            Toast.makeText(this,"Hello Word",Toast.LENGTH_LONG).show()
            val name : String = binding.edtName.text.toString().trim()
            val age : String = binding.edtAge.text.toString().trim()
            if (name.isEmpty() && age.isEmpty()){
                Toast.makeText(this,"Nhập chữ",Toast.LENGTH_LONG).show()
                binding.tvName.setText("")
                binding.tvAge.setText("")
            }else{

             // Snackbar.make(it,"Heloo ",Snackbar.LENGTH_INDEFINITE).show()

                binding.tvName.setText("Họ Và Tên: "+ name)
                binding.tvName.setTextColor(Color.argb(255,255,0,0))
                binding.tvAge.setText(age +" Tuổi")
                binding.tvAge.setTextColor(Color.argb(255,0,0,255))

                Toast.makeText(this,""+name+" "+age,Toast.LENGTH_LONG).show()

                //ph29041 heloooo
                ////hihahahahahhaha thanh
            }
        }

















    }
}