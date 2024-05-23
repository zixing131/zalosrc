package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.AbstractC1158c0;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.i9 */
/* loaded from: classes.dex */
public final class C5425i9 {

    /* renamed from: b */
    private static volatile C5425i9 f32415b;

    /* renamed from: c */
    static final C5425i9 f32416c = new C5425i9(true);

    /* renamed from: a */
    private final Map f32417a = Collections.emptyMap();

    C5425i9(boolean z11) {
    }

    /* renamed from: a */
    public static C5425i9 m29212a() {
        C5425i9 c5425i9 = f32415b;
        if (c5425i9 != null) {
            return c5425i9;
        }
        synchronized (C5425i9.class) {
            try {
                C5425i9 c5425i92 = f32415b;
                if (c5425i92 != null) {
                    return c5425i92;
                }
                C5425i9 m29485a = AbstractC5527o9.m29485a(C5425i9.class);
                f32415b = m29485a;
                return m29485a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final AbstractC5578r9 m29213b(InterfaceC5647va interfaceC5647va, int i11) {
        AbstractC1158c0.m5500a(this.f32417a.get(new C5408h9(interfaceC5647va, i11)));
        return null;
    }
}
