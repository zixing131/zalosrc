package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.util.HashMap;
import java.util.Map;
import p148f3.C18711c;
import p227i3.AbstractC20216t;
import p227i3.C20218v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h13 implements b03 {

    /* renamed from: a */
    private final Object f21500a;

    /* renamed from: b */
    private final i13 f21501b;

    /* renamed from: c */
    private final q13 f21502c;

    /* renamed from: d */
    private final xz2 f21503d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h13(Object obj, i13 i13Var, q13 q13Var, xz2 xz2Var) {
        this.f21500a = obj;
        this.f21501b = i13Var;
        this.f21502c = q13Var;
        this.f21503d = xz2Var;
    }

    /* renamed from: i */
    private static String m22676i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C5051ub m27195F = C5088vb.m27195F();
        m27195F.m26911s(5);
        m27195F.m26909q(mt3.m24726I(bArr));
        return Base64.encodeToString(((C5088vb) m27195F.m25898n()).mo27346a(), 11);
    }

    /* renamed from: j */
    private final synchronized byte[] m22677j(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e11) {
            this.f21503d.m28094c(2007, System.currentTimeMillis() - currentTimeMillis, e11);
            return null;
        }
        return (byte[]) this.f21500a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f21500a, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.b03
    /* renamed from: a */
    public final synchronized void mo20363a(String str, MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC20216t.f99969a, new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.f21500a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f21500a, hashMap);
            this.f21503d.m28095d(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e11) {
            throw new zzfou(2005, e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.b03
    /* renamed from: b */
    public final synchronized String mo20364b(Context context, String str, View view, Activity activity) {
        Map zzc;
        zzc = this.f21502c.zzc();
        zzc.put("f", C20218v.f100059b);
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put("view", view);
        zzc.put("act", activity);
        return m22676i(m22677j(null, zzc));
    }

    @Override // com.google.android.gms.internal.ads.b03
    /* renamed from: c */
    public final synchronized String mo20365c(Context context, String str) {
        Map zzb;
        zzb = this.f21502c.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return m22676i(m22677j(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.b03
    /* renamed from: d */
    public final synchronized String mo20366d(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.f21502c.zza();
        zza.put("f", C18711c.f94014e);
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put("view", view);
        zza.put("act", activity);
        return m22676i(m22677j(null, zza));
    }

    /* renamed from: e */
    public final synchronized int m22678e() {
        try {
        } catch (Exception e11) {
            throw new zzfou(2006, e11);
        }
        return ((Integer) this.f21500a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f21500a, new Object[0])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final i13 m22679f() {
        return this.f21501b;
    }

    /* renamed from: g */
    public final synchronized void m22680g() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f21500a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f21500a, new Object[0]);
            this.f21503d.m28095d(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e11) {
            throw new zzfou(ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final synchronized boolean m22681h() {
        try {
        } catch (Exception e11) {
            throw new zzfou(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, e11);
        }
        return ((Boolean) this.f21500a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f21500a, new Object[0])).booleanValue();
    }
}
