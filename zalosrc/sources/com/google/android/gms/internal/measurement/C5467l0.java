package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l0 */
/* loaded from: classes2.dex */
public final class C5467l0 extends AbstractC5670x {
    @Override // com.google.android.gms.internal.measurement.AbstractC5670x
    /* renamed from: a */
    public final InterfaceC5551q mo28856a(String str, C5590s4 c5590s4, List list) {
        if (str != null && !str.isEmpty() && c5590s4.m29595h(str)) {
            InterfaceC5551q m29591d = c5590s4.m29591d(str);
            if (m29591d instanceof AbstractC5432j) {
                return ((AbstractC5432j) m29591d).mo28891a(c5590s4, list);
            }
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        throw new IllegalArgumentException(String.format("Command not found: %s", str));
    }
}
