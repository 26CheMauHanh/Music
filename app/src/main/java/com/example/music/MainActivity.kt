package com.example.music

import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dkmh3_dangkythanhcong)


        val signupTextView = findViewById<TextView>(R.id.tvDescription)
        val content = "Một email hướng dẫn xác thực tài khoản đã được gửi đến email abc@gmail.com của bạn. " +
                "Hãy kiểm tra email abc@gmail.com và kích hoạt tài khoản để sử dụng đầy đủ chức năng của NCT."

        val spannable = SpannableString(content)
        spannable.setSpan(StyleSpan(Typeface.BOLD), content.indexOf("abc@gmail.com"), content.indexOf("abc@gmail.com") + "abc@gmail.com".length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannable.setSpan(StyleSpan(Typeface.BOLD), content.indexOf("kích hoạt tài khoản"), content.indexOf("kích hoạt tài khoản") + "kích hoạt tài khoản".length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        val tvDescription = findViewById<TextView>(R.id.tvDescription)
        tvDescription.text = spannable
    }
}