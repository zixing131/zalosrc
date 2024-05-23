package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
final class wv2 {

    /* renamed from: a */
    private final InterfaceC20285f f30235a;

    /* renamed from: b */
    private final Map f30236b = new HashMap();

    /* renamed from: c */
    private final Map f30237c = new HashMap();

    public wv2(InterfaceC20285f interfaceC20285f) {
        this.f30235a = interfaceC20285f;
    }

    /* renamed from: d */
    private final void m27727d(String str, String str2) {
        if (!this.f30236b.containsKey(str)) {
            this.f30236b.put(str, new ArrayList());
        }
        ((List) this.f30236b.get(str)).add(str2);
    }

    /* renamed from: a */
    public final List m27728a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f30236b.entrySet()) {
            int i11 = 0;
            if (((List) entry.getValue()).size() > 1) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    i11++;
                    arrayList.add(new vv2(((String) entry.getKey()) + "." + i11, (String) it.next()));
                }
            } else {
                arrayList.add(new vv2((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void m27729b(String str) {
        if (this.f30237c.containsKey(str)) {
            long mo105914b = this.f30235a.mo105914b();
            long longValue = ((Long) this.f30237c.remove(str)).longValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo105914b - longValue);
            m27727d(str, sb2.toString());
            return;
        }
        this.f30237c.put(str, Long.valueOf(this.f30235a.mo105914b()));
    }

    /* renamed from: c */
    public final void m27730c(String str, String str2) {
        if (this.f30237c.containsKey(str)) {
            m27727d(str, str2 + (this.f30235a.mo105914b() - ((Long) this.f30237c.remove(str)).longValue()));
            return;
        }
        this.f30237c.put(str, Long.valueOf(this.f30235a.mo105914b()));
    }
}
