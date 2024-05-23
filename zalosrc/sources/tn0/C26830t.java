package tn0;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import sn0.AbstractC26339f;
import sn0.AbstractC26340g;
import sn0.AbstractC26341h;
import sn0.AbstractC26342i;

/* renamed from: tn0.t */
/* loaded from: classes7.dex */
public final class C26830t extends PluginGeneratedSerialDescriptor {

    /* renamed from: m */
    private final AbstractC26341h f127073m;

    /* renamed from: n */
    private final InterfaceC24854k f127074n;

    /* renamed from: tn0.t$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ int f127075q;

        /* renamed from: r */
        final /* synthetic */ String f127076r;

        /* renamed from: s */
        final /* synthetic */ C26830t f127077s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, String str, C26830t c26830t) {
            super(0);
            this.f127075q = i11;
            this.f127076r = str;
            this.f127077s = c26830t;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SerialDescriptor[] mo12V4() {
            int i11 = this.f127075q;
            SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                serialDescriptorArr[i12] = AbstractC26340g.m135543e(this.f127076r + '.' + this.f127077s.mo113950f(i12), AbstractC26342i.d.f125059a, new SerialDescriptor[0], null, 8, null);
            }
            return serialDescriptorArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26830t(String str, int i11) {
        super(str, null, i11, 2, null);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(str, "name");
        this.f127073m = AbstractC26341h.b.f125055a;
        m129210a = AbstractC24856m.m129210a(new a(i11, str, this));
        this.f127074n = m129210a;
    }

    /* renamed from: t */
    private final SerialDescriptor[] m137962t() {
        return (SerialDescriptor[]) this.f127074n.getValue();
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public AbstractC26341h mo113948d() {
        return this.f127073m;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (serialDescriptor.mo113948d() == AbstractC26341h.b.f125055a && AbstractC19074t.m100204b(mo113953i(), serialDescriptor.mo113953i()) && AbstractC19074t.m100204b(AbstractC26849z0.m138014a(this), AbstractC26849z0.m138014a(serialDescriptor))) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo113952h(int i11) {
        return m137962t()[i11];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int i11;
        int hashCode = mo113953i().hashCode();
        int i12 = 1;
        for (String str : AbstractC26339f.m135536b(this)) {
            int i13 = i12 * 31;
            if (str != null) {
                i11 = str.hashCode();
            } else {
                i11 = 0;
            }
            i12 = i13 + i11;
        }
        return (hashCode * 31) + i12;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public String toString() {
        String m131214n0;
        m131214n0 = AbstractC25332a0.m131214n0(AbstractC26339f.m135536b(this), ", ", mo113953i() + '(', ")", 0, null, null, 56, null);
        return m131214n0;
    }
}
