package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import java.util.Map;
import p227i3.C20215s;
import p227i3.C20218v;
import p229i5.AbstractC20289j;
import p667y2.C30268e;

/* loaded from: classes2.dex */
public final class zv2 {

    /* renamed from: a */
    private final Context f31701a;

    /* renamed from: b */
    private final String f31702b;

    /* renamed from: c */
    private final String f31703c;

    public zv2(Context context, zzcgv zzcgvVar) {
        this.f31701a = context;
        this.f31702b = context.getPackageName();
        this.f31703c = zzcgvVar.f32030p;
    }

    /* renamed from: a */
    public final void m28645a(Map map) {
        Object obj;
        map.put(C20215s.f99966b, "gmob_sdk");
        map.put(C20218v.f100059b, "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzp();
        map.put("device", zzs.zzq());
        map.put("app", this.f31702b);
        zzt.zzp();
        String str = "1";
        if (true == zzs.zzA(this.f31701a)) {
            obj = "1";
        } else {
            obj = "0";
        }
        map.put("is_lite_sdk", obj);
        List m22621b = AbstractC4554gx.m22621b();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21165X5)).booleanValue()) {
            m22621b.addAll(zzt.zzo().m22936h().zzh().m20556d());
        }
        map.put(C30268e.f140632a, TextUtils.join(",", m22621b));
        map.put("sdkVersion", this.f31703c);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21100Q8)).booleanValue()) {
            if (true != AbstractC20289j.m105928b(this.f31701a)) {
                str = "0";
            }
            map.put("is_bstar", str);
        }
    }
}
