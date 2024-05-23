package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: tn0.e1 */
/* loaded from: classes7.dex */
public final class C26787e1 extends AbstractC26804k0 {

    /* renamed from: c */
    private final String f126991c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26787e1(SerialDescriptor serialDescriptor) {
        super(serialDescriptor, null);
        AbstractC19074t.m100208f(serialDescriptor, "primitive");
        this.f126991c = serialDescriptor.mo113953i() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo113953i() {
        return this.f126991c;
    }
}
