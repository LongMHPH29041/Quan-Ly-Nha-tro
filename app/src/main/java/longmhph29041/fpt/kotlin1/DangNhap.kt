package longmhph29041.fpt.kotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import longmhph29041.fpt.kotlin1.databinding.ActivityDangNhapBinding

class DangNhap : AppCompatActivity() {
    private lateinit var binding: ActivityDangNhapBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDangNhapBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonDN.setOnClickListener {
            val name : String = binding.edtTenDangNhap.text.toString().trim()
            val matKhau : String = binding.edtMatKhau.text.toString().trim()
            if (name.isEmpty()|| matKhau.isEmpty()){Snackbar.make(it,"Nhập đủ thông tin",Snackbar.LENGTH_SHORT).show()}
            else if (matKhau.length<8){Snackbar.make(it,"Mật khẩu có ký tự >= 8",Snackbar.LENGTH_SHORT).show()  }
            else{val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(this,"Đăng nhập thành công",Toast.LENGTH_LONG).show()
                //Helooo
                //helooo broduct
                ////sdfhgbsd



                ///gagagahjagdahsdgub H2clt
            }
        }
    }
}