package p232i8;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p153f8.C18821f;

/* renamed from: i8.d */
/* loaded from: classes.dex */
class C20387d {

    /* renamed from: a */
    private final Float f100427a;

    /* renamed from: b */
    private final boolean f100428b;

    private C20387d(Float f11, boolean z11) {
        this.f100428b = z11;
        this.f100427a = f11;
    }

    /* renamed from: a */
    public static C20387d m106179a(Context context) {
        boolean z11 = false;
        Float f11 = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z11 = m106181e(registerReceiver);
                f11 = m106180d(registerReceiver);
            }
        } catch (IllegalStateException e11) {
            C18821f.m98795f().m98799e("An error occurred getting battery state.", e11);
        }
        return new C20387d(f11, z11);
    }

    /* renamed from: d */
    private static Float m106180d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra != -1 && intExtra2 != -1) {
            return Float.valueOf(intExtra / intExtra2);
        }
        return null;
    }

    /* renamed from: e */
    private static boolean m106181e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public Float m106182b() {
        return this.f100427a;
    }

    /* renamed from: c */
    public int m106183c() {
        Float f11;
        if (this.f100428b && (f11 = this.f100427a) != null) {
            if (f11.floatValue() < 0.99d) {
                return 2;
            }
            return 3;
        }
        return 1;
    }
}
