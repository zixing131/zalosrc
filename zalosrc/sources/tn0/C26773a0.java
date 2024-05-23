package tn0;

import fn0.AbstractC19074t;
import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: tn0.a0 */
/* loaded from: classes7.dex */
public final class C26773a0 extends PluginGeneratedSerialDescriptor {

    /* renamed from: m */
    private final boolean f126982m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26773a0(String str, InterfaceC26842x interfaceC26842x) {
        super(str, interfaceC26842x, 1);
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(interfaceC26842x, "generatedSerializer");
        this.f126982m = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C26773a0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (AbstractC19074t.m100204b(mo113953i(), serialDescriptor.mo113953i())) {
                C26773a0 c26773a0 = (C26773a0) obj;
                if (c26773a0.mo113955k() && Arrays.equals(m114048r(), c26773a0.m114048r()) && mo113949e() == serialDescriptor.mo113949e()) {
                    int mo113949e = mo113949e();
                    for (int i11 = 0; i11 < mo113949e; i11++) {
                        if (AbstractC19074t.m100204b(mo113952h(i11).mo113953i(), serialDescriptor.mo113952h(i11).mo113953i()) && AbstractC19074t.m100204b(mo113952h(i11).mo113948d(), serialDescriptor.mo113952h(i11).mo113948d())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: k */
    public boolean mo113955k() {
        return this.f126982m;
    }
}
