package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.p */
/* loaded from: classes.dex */
public final class C6089p {

    /* renamed from: a */
    final String f34311a;

    /* renamed from: b */
    final String f34312b;

    /* renamed from: c */
    final String f34313c;

    /* renamed from: d */
    final long f34314d;

    /* renamed from: e */
    final long f34315e;

    /* renamed from: f */
    final zzau f34316f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6089p(C6127s4 c6127s4, String str, String str2, String str3, long j11, long j12, Bundle bundle) {
        zzau zzauVar;
        AbstractC4205o.m19718g(str2);
        AbstractC4205o.m19718g(str3);
        this.f34311a = str2;
        this.f34312b = str3;
        this.f34313c = true == TextUtils.isEmpty(str) ? null : str;
        this.f34314d = j11;
        this.f34315e = j12;
        if (j12 != 0 && j12 > j11) {
            c6127s4.mo31033c().m31202w().m31109b("Event created with reverse previous/current timestamps. appId", C6082o3.m31193z(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c6127s4.mo31033c().m31197q().m31108a("Param name can't be null");
                    it.remove();
                } else {
                    Object m31343n = c6127s4.m31381N().m31343n(next, bundle2.get(next));
                    if (m31343n == null) {
                        c6127s4.mo31033c().m31202w().m31109b("Param value can't be null", c6127s4.m31372D().m30965e(next));
                        it.remove();
                    } else {
                        c6127s4.m31381N().m31318D(bundle2, next, m31343n);
                    }
                }
            }
            zzauVar = new zzau(bundle2);
        } else {
            zzauVar = new zzau(new Bundle());
        }
        this.f34316f = zzauVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C6089p m31272a(C6127s4 c6127s4, long j11) {
        return new C6089p(c6127s4, this.f34313c, this.f34311a, this.f34312b, this.f34314d, j11, this.f34316f);
    }

    public final String toString() {
        return "Event{appId='" + this.f34311a + "', name='" + this.f34312b + "', params=" + this.f34316f.toString() + "}";
    }

    private C6089p(C6127s4 c6127s4, String str, String str2, String str3, long j11, long j12, zzau zzauVar) {
        AbstractC4205o.m19718g(str2);
        AbstractC4205o.m19718g(str3);
        AbstractC4205o.m19722k(zzauVar);
        this.f34311a = str2;
        this.f34312b = str3;
        this.f34313c = true == TextUtils.isEmpty(str) ? null : str;
        this.f34314d = j11;
        this.f34315e = j12;
        if (j12 != 0 && j12 > j11) {
            c6127s4.mo31033c().m31202w().m31110c("Event created with reverse previous/current timestamps. appId, name", C6082o3.m31193z(str2), C6082o3.m31193z(str3));
        }
        this.f34316f = zzauVar;
    }
}
