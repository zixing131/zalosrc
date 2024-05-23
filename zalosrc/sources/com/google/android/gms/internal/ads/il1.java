package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class il1 {

    /* renamed from: a */
    private final jq1 f22211a;

    /* renamed from: b */
    private final xo1 f22212b;

    /* renamed from: c */
    private final i01 f22213c;

    /* renamed from: d */
    private final dk1 f22214d;

    public il1(jq1 jq1Var, xo1 xo1Var, i01 i01Var, dk1 dk1Var) {
        this.f22211a = jq1Var;
        this.f22212b = xo1Var;
        this.f22213c = i01Var;
        this.f22214d = dk1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final View m23287a() {
        zq0 m23723a = this.f22211a.m23723a(zzq.zzc(), null, null);
        ((View) m23723a).setVisibility(8);
        m23723a.mo26687S("/sendMessageToSdk", new c40() { // from class: com.google.android.gms.internal.ads.bl1
            @Override // com.google.android.gms.internal.ads.c40
            /* renamed from: a */
            public final void mo19973a(Object obj, Map map) {
                il1.this.m23288b((zq0) obj, map);
            }
        });
        m23723a.mo26687S("/adMuted", new c40() { // from class: com.google.android.gms.internal.ads.cl1
            @Override // com.google.android.gms.internal.ads.c40
            /* renamed from: a */
            public final void mo19973a(Object obj, Map map) {
                il1.this.m23289c((zq0) obj, map);
            }
        });
        this.f22212b.m27959j(new WeakReference(m23723a), "/loadHtml", new c40() { // from class: com.google.android.gms.internal.ads.dl1
            @Override // com.google.android.gms.internal.ads.c40
            /* renamed from: a */
            public final void mo19973a(Object obj, final Map map) {
                final il1 il1Var = il1.this;
                zq0 zq0Var = (zq0) obj;
                zq0Var.zzP().mo23358F(new ls0() { // from class: com.google.android.gms.internal.ads.hl1
                    @Override // com.google.android.gms.internal.ads.ls0
                    public final void zza(boolean z11) {
                        il1.this.m23290d(map, z11);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zq0Var.loadData(str, "text/html", "UTF-8");
                } else {
                    zq0Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.f22212b.m27959j(new WeakReference(m23723a), "/showOverlay", new c40() { // from class: com.google.android.gms.internal.ads.el1
            @Override // com.google.android.gms.internal.ads.c40
            /* renamed from: a */
            public final void mo19973a(Object obj, Map map) {
                il1.this.m23291e((zq0) obj, map);
            }
        });
        this.f22212b.m27959j(new WeakReference(m23723a), "/hideOverlay", new c40() { // from class: com.google.android.gms.internal.ads.fl1
            @Override // com.google.android.gms.internal.ads.c40
            /* renamed from: a */
            public final void mo19973a(Object obj, Map map) {
                il1.this.m23292f((zq0) obj, map);
            }
        });
        return (View) m23723a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void m23288b(zq0 zq0Var, Map map) {
        this.f22212b.m27956g("sendMessageToNativeJs", map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m23289c(zq0 zq0Var, Map map) {
        this.f22214d.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void m23290d(Map map, boolean z11) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f22212b.m27956g("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void m23291e(zq0 zq0Var, Map map) {
        yk0.zzi("Showing native ads overlay.");
        zq0Var.mo23737i().setVisibility(0);
        this.f22213c.m23100j(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void m23292f(zq0 zq0Var, Map map) {
        yk0.zzi("Hiding native ads overlay.");
        zq0Var.mo23737i().setVisibility(8);
        this.f22213c.m23100j(false);
    }
}
