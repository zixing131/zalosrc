package i60;

import android.content.Intent;

/* renamed from: i60.f */
/* loaded from: classes5.dex */
public class C20340f {

    /* renamed from: a */
    public String f100320a;

    /* renamed from: b */
    public int f100321b;

    private C20340f(String str, int i11) {
        this.f100320a = str;
        this.f100321b = i11;
    }

    /* renamed from: a */
    public static C20340f m106052a(Intent intent) {
        String str;
        if (intent == null) {
            return null;
        }
        if (intent.hasExtra("uid_set_hidden_chat")) {
            str = intent.getStringExtra("uid_set_hidden_chat");
        } else {
            str = "";
        }
        return new C20340f(str, intent.getIntExtra("case_passcode_process", -1));
    }
}
