package i60;

import android.content.Intent;

/* renamed from: i60.o */
/* loaded from: classes5.dex */
public class C20349o {

    /* renamed from: a */
    public double f100345a;

    /* renamed from: b */
    public double f100346b;

    /* renamed from: c */
    public String f100347c;

    /* renamed from: d */
    public String f100348d;

    /* renamed from: e */
    public String f100349e;

    /* renamed from: f */
    public String f100350f;

    private C20349o(double d11, double d12, String str, String str2, String str3, String str4) {
        this.f100345a = d11;
        this.f100346b = d12;
        this.f100347c = str;
        this.f100348d = str2;
        this.f100349e = str3;
        this.f100350f = str4;
    }

    /* renamed from: a */
    public static C20349o m106085a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return new C20349o(intent.getDoubleExtra("extra_selected_long", 0.0d), intent.getDoubleExtra("extra_selected_lat", 0.0d), intent.getStringExtra("extra_selected_address"), intent.getStringExtra("extra_selected_name"), intent.getStringExtra("extra_selected_id"), intent.getStringExtra("extra_selected_client_id"));
    }
}
