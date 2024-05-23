package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONObject;
import p229i5.InterfaceC20296q;

/* loaded from: classes2.dex */
public final class j70 implements b70, z60 {

    /* renamed from: p */
    private final zq0 f22705p;

    /* JADX WARN: Multi-variable type inference failed */
    public j70(Context context, zzcgv zzcgvVar, C4830od c4830od, zza zzaVar) {
        zzt.zzz();
        zq0 m24980a = nr0.m24980a(context, ps0.m25531a(), "", false, false, null, null, zzcgvVar, null, null, null, C4808ns.m24989a(), null, null);
        this.f22705p = m24980a;
        ((View) m24980a).setWillNotDraw(true);
    }

    /* renamed from: H */
    private static final void m23549H(Runnable runnable) {
        zzaw.zzb();
        if (rk0.m26112v()) {
            runnable.run();
        } else {
            zzs.zza.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.l70
    /* renamed from: C0 */
    public final /* synthetic */ void mo23550C0(String str, JSONObject jSONObject) {
        y60.m28136d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.b70
    /* renamed from: D0 */
    public final void mo20421D0(final q70 q70Var) {
        final byte[] bArr = null;
        this.f22705p.zzP().mo23362J(new ms0(bArr) { // from class: com.google.android.gms.internal.ads.c70
            @Override // com.google.android.gms.internal.ads.ms0
            public final void zza() {
                q70 q70Var2 = q70.this;
                final h80 h80Var = q70Var2.f26667a;
                final g80 g80Var = q70Var2.f26668b;
                final b70 b70Var = q70Var2.f26669c;
                zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.p70
                    @Override // java.lang.Runnable
                    public final void run() {
                        h80.this.m22727i(g80Var, b70Var);
                    }
                }, 10000L);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* synthetic */ void m23551F(String str) {
        this.f22705p.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.x60
    /* renamed from: V */
    public final /* synthetic */ void mo23552V(String str, Map map) {
        y60.m28133a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.b70
    /* renamed from: Z */
    public final void mo20422Z(final String str) {
        m23549H(new Runnable() { // from class: com.google.android.gms.internal.ads.h70
            @Override // java.lang.Runnable
            public final void run() {
                j70.this.m23557t(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.l70, com.google.android.gms.internal.ads.z60
    /* renamed from: c */
    public final /* synthetic */ void mo23553c(String str, String str2) {
        y60.m28135c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.b70
    /* renamed from: j */
    public final void mo20423j(final String str) {
        m23549H(new Runnable() { // from class: com.google.android.gms.internal.ads.f70
            @Override // java.lang.Runnable
            public final void run() {
                j70.this.m23556o(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.i80
    /* renamed from: j0 */
    public final void mo23137j0(String str, final c40 c40Var) {
        this.f22705p.mo26711w0(str, new InterfaceC20296q() { // from class: com.google.android.gms.internal.ads.d70
            @Override // p229i5.InterfaceC20296q
            public final boolean apply(Object obj) {
                c40 c40Var2;
                c40 c40Var3 = c40.this;
                c40 c40Var4 = (c40) obj;
                if (c40Var4 instanceof i70) {
                    c40Var2 = ((i70) c40Var4).f22108a;
                    if (c40Var2.equals(c40Var3)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void m23554l(String str) {
        this.f22705p.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.i80
    /* renamed from: l0 */
    public final void mo23138l0(String str, c40 c40Var) {
        this.f22705p.mo26687S(str, new i70(this, c40Var));
    }

    @Override // com.google.android.gms.internal.ads.x60, com.google.android.gms.internal.ads.z60
    /* renamed from: n */
    public final /* synthetic */ void mo23555n(String str, JSONObject jSONObject) {
        y60.m28134b(this, str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void m23556o(String str) {
        this.f22705p.loadData(str, "text/html", "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final /* synthetic */ void m23557t(String str) {
        this.f22705p.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.l70, com.google.android.gms.internal.ads.z60
    public final void zza(final String str) {
        m23549H(new Runnable() { // from class: com.google.android.gms.internal.ads.e70
            @Override // java.lang.Runnable
            public final void run() {
                j70.this.m23554l(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final void zzc() {
        this.f22705p.destroy();
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final void zzh(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        m23549H(new Runnable() { // from class: com.google.android.gms.internal.ads.g70
            @Override // java.lang.Runnable
            public final void run() {
                j70.this.m23551F(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final boolean zzi() {
        return this.f22705p.mo26709v();
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final j80 zzj() {
        return new j80(this);
    }
}
