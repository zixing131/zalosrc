package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class xv1 {

    /* renamed from: a */
    private final hv1 f30635a;

    /* renamed from: b */
    private final tq1 f30636b;

    /* renamed from: c */
    private final Object f30637c = new Object();

    /* renamed from: d */
    private final List f30638d = new ArrayList();

    /* renamed from: e */
    private boolean f30639e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xv1(hv1 hv1Var, tq1 tq1Var) {
        this.f30635a = hv1Var;
        this.f30636b = tq1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m28028d(List list) {
        String str;
        boolean z11;
        sq1 m26649a;
        zzbxq zzbxqVar;
        synchronized (this.f30637c) {
            try {
                if (this.f30639e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbrq zzbrqVar = (zzbrq) it.next();
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21176Y7)).booleanValue()) {
                        sq1 m26649a2 = this.f30636b.m26649a(zzbrqVar.f31915p);
                        if (m26649a2 != null && (zzbxqVar = m26649a2.f27820c) != null) {
                            str = zzbxqVar.toString();
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21185Z7)).booleanValue() || (m26649a = this.f30636b.m26649a(zzbrqVar.f31915p)) == null || !m26649a.f27821d) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    List list2 = this.f30638d;
                    String str3 = zzbrqVar.f31915p;
                    list2.add(new wv1(str3, str2, this.f30636b.m26651c(str3), zzbrqVar.f31916q ? 1 : 0, zzbrqVar.f31918s, zzbrqVar.f31917r, z11));
                }
                this.f30639e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public final JSONArray m28029a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f30637c) {
            try {
                if (!this.f30639e) {
                    if (this.f30635a.m23053t()) {
                        m28028d(this.f30635a.m23044g());
                    } else {
                        m28030c();
                        return jSONArray;
                    }
                }
                Iterator it = this.f30638d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((wv1) it.next()).m27726a());
                }
                return jSONArray;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final void m28030c() {
        this.f30635a.m23052s(new vv1(this));
    }
}
