package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import p227i3.C20215s;
import p227i3.C20218v;
import p229i5.AbstractC20289j;

/* renamed from: com.google.android.gms.internal.ads.jx */
/* loaded from: classes2.dex */
public final class C4664jx {

    /* renamed from: a */
    private final String f23017a = (String) AbstractC5000sy.f28057b.m24091e();

    /* renamed from: b */
    private final Map f23018b;

    /* renamed from: c */
    private final Context f23019c;

    /* renamed from: d */
    private final String f23020d;

    public C4664jx(Context context, String str) {
        String packageName;
        Object obj;
        this.f23019c = context;
        this.f23020d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f23018b = linkedHashMap;
        linkedHashMap.put(C20215s.f99966b, "gmob_sdk");
        linkedHashMap.put(C20218v.f100059b, "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        linkedHashMap.put("device", zzs.zzq());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        zzt.zzp();
        if (true != zzs.zzA(context)) {
            obj = "0";
        } else {
            obj = "1";
        }
        linkedHashMap.put("is_lite_sdk", obj);
        Future m26921b = zzt.zzm().m26921b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((rf0) m26921b.get()).f27192k));
            linkedHashMap.put("network_fine", Integer.toString(((rf0) m26921b.get()).f27193l));
        } catch (Exception e11) {
            zzt.zzo().m22945t(e11, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21100Q8)).booleanValue()) {
            this.f23018b.put("is_bstar", true == AbstractC20289j.m105928b(context) ? "1" : "0");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context m23768a() {
        return this.f23019c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final String m23769b() {
        return this.f23020d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final String m23770c() {
        return this.f23017a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map m23771d() {
        return this.f23018b;
    }
}
