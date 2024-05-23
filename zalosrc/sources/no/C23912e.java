package no;

import android.content.Intent;

/* renamed from: no.e */
/* loaded from: classes4.dex */
public class C23912e {

    /* renamed from: a */
    public String f115562a;

    /* renamed from: b */
    public String f115563b;

    /* renamed from: c */
    public String f115564c;

    private C23912e(String str, String str2, String str3) {
        this.f115562a = str;
        this.f115563b = str2;
        this.f115564c = str3;
    }

    /* renamed from: a */
    public static C23912e m125039a(Intent intent) {
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("extra_result_original_path");
        String stringExtra2 = intent.getStringExtra("extra_result_decor_data");
        String stringExtra3 = intent.getStringExtra("extra_result_output_path");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        return new C23912e(stringExtra, stringExtra2, stringExtra3);
    }
}
