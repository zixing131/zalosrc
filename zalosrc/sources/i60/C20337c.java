package i60;

import android.content.Intent;

/* renamed from: i60.c */
/* loaded from: classes5.dex */
public class C20337c {

    /* renamed from: a */
    public String f100311a;

    /* renamed from: b */
    public String f100312b;

    private C20337c(String str, String str2) {
        this.f100311a = str;
        this.f100312b = str2;
    }

    /* renamed from: a */
    public static C20337c m106042a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return new C20337c(intent.getStringExtra("extra_result_output_path"), intent.getStringExtra("extra_result_camera_log"));
    }
}
