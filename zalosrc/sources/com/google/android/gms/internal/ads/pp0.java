package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class pp0 {

    /* renamed from: a */
    private final ArrayList f26273a = new ArrayList();

    /* renamed from: b */
    private long f26274b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final long m25502a() {
        Iterator it = this.f26273a.iterator();
        while (it.hasNext()) {
            Map zze = ((C4952rn) it.next()).zze();
            if (zze != null) {
                for (Map.Entry entry : zze.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                            this.f26274b = Math.max(this.f26274b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f26274b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m25503b(C4952rn c4952rn) {
        this.f26273a.add(c4952rn);
    }
}
