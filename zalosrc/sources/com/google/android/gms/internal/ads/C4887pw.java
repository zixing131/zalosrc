package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.common.internal.AbstractC4205o;
import p289k5.C21472e;

/* renamed from: com.google.android.gms.internal.ads.pw */
/* loaded from: classes2.dex */
public final class C4887pw {

    /* renamed from: a */
    private final Context f26356a;

    public C4887pw(Context context) {
        AbstractC4205o.m19723l(context, "Context can not be null");
        this.f26356a = context;
    }

    /* renamed from: a */
    public final boolean m25560a(Intent intent) {
        AbstractC4205o.m19723l(intent, "Intent can not be null");
        if (this.f26356a.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m25561b() {
        return m25560a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    /* renamed from: c */
    public final boolean m25562c() {
        if (((Boolean) zzcb.zza(this.f26356a, CallableC4849ow.f25969a)).booleanValue() && C21472e.m111067a(this.f26356a).m111059a("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }
}
