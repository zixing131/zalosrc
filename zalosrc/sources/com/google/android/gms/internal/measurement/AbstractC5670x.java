package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x */
/* loaded from: classes2.dex */
public abstract class AbstractC5670x {

    /* renamed from: a */
    final List f32893a = new ArrayList();

    /* renamed from: a */
    public abstract InterfaceC5551q mo28856a(String str, C5590s4 c5590s4, List list);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final InterfaceC5551q m29990b(String str) {
        if (this.f32893a.contains(AbstractC5608t5.m29614e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
