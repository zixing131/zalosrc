package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C4086d;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.e */
/* loaded from: classes2.dex */
public class C4089e {

    /* renamed from: a */
    private final Set f16293a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public static C4086d m19399a(Object obj, Looper looper, String str) {
        AbstractC4205o.m19723l(obj, "Listener must not be null");
        AbstractC4205o.m19723l(looper, "Looper must not be null");
        AbstractC4205o.m19723l(str, "Listener type must not be null");
        return new C4086d(looper, obj, str);
    }

    /* renamed from: b */
    public static C4086d.a m19400b(Object obj, String str) {
        AbstractC4205o.m19723l(obj, "Listener must not be null");
        AbstractC4205o.m19723l(str, "Listener type must not be null");
        AbstractC4205o.m19719h(str, "Listener type must not be empty");
        return new C4086d.a(obj, str);
    }

    /* renamed from: c */
    public final void m19401c() {
        Iterator it = this.f16293a.iterator();
        while (it.hasNext()) {
            ((C4086d) it.next()).m19390a();
        }
        this.f16293a.clear();
    }
}
