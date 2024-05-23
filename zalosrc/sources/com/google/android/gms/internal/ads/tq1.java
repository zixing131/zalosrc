package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class tq1 {

    /* renamed from: a */
    private final Map f28471a = new HashMap();

    /* renamed from: a */
    public final synchronized sq1 m26649a(String str) {
        return (sq1) this.f28471a.get(str);
    }

    /* renamed from: b */
    public final sq1 m26650b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sq1 m26649a = m26649a((String) it.next());
            if (m26649a != null) {
                return m26649a;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final String m26651c(String str) {
        zzbxq zzbxqVar;
        sq1 m26649a = m26649a(str);
        if (m26649a != null && (zzbxqVar = m26649a.f27819b) != null) {
            return zzbxqVar.toString();
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m26652d(String str, yr2 yr2Var) {
        zzbxq m28311h;
        if (this.f28471a.containsKey(str)) {
            return;
        }
        zzbxq zzbxqVar = null;
        if (yr2Var != null) {
            try {
                m28311h = yr2Var.m28311h();
            } catch (zzfek unused) {
            }
            if (yr2Var != null) {
                try {
                    zzbxqVar = yr2Var.m28312i();
                } catch (zzfek unused2) {
                }
            }
            boolean z11 = true;
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21185Z7)).booleanValue()) {
                if (yr2Var != null) {
                    try {
                        yr2Var.m28304a();
                    } catch (zzfek unused3) {
                    }
                }
                z11 = false;
            }
            this.f28471a.put(str, new sq1(str, m28311h, zzbxqVar, z11));
        }
        m28311h = null;
        if (yr2Var != null) {
        }
        boolean z112 = true;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21185Z7)).booleanValue()) {
        }
        this.f28471a.put(str, new sq1(str, m28311h, zzbxqVar, z112));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void m26653e(String str, pb0 pb0Var) {
        if (this.f28471a.containsKey(str)) {
            return;
        }
        try {
            this.f28471a.put(str, new sq1(str, pb0Var.zzf(), pb0Var.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
