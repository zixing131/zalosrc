package tn0;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25358n;

/* renamed from: tn0.u */
/* loaded from: classes7.dex */
public final class C26833u implements KSerializer {

    /* renamed from: a */
    private final Enum[] f127083a;

    /* renamed from: b */
    private SerialDescriptor f127084b;

    /* renamed from: c */
    private final InterfaceC24854k f127085c;

    /* renamed from: tn0.u$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ String f127087r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f127087r = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SerialDescriptor mo12V4() {
            SerialDescriptor serialDescriptor = C26833u.this.f127084b;
            if (serialDescriptor == null) {
                return C26833u.this.m137969c(this.f127087r);
            }
            return serialDescriptor;
        }
    }

    public C26833u(String str, Enum[] enumArr) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(str, "serialName");
        AbstractC19074t.m100208f(enumArr, "values");
        this.f127083a = enumArr;
        m129210a = AbstractC24856m.m129210a(new a(str));
        this.f127085c = m129210a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final SerialDescriptor m137969c(String str) {
        C26830t c26830t = new C26830t(str, this.f127083a.length);
        for (Enum r02 : this.f127083a) {
            PluginGeneratedSerialDescriptor.m114043o(c26830t, r02.name(), false, 2, null);
        }
        return c26830t;
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        int mo113969e = decoder.mo113969e(getDescriptor());
        if (mo113969e >= 0) {
            Enum[] enumArr = this.f127083a;
            if (mo113969e < enumArr.length) {
                return enumArr[mo113969e];
            }
        }
        throw new SerializationException(mo113969e + " is not among valid " + getDescriptor().mo113953i() + " enum values, values size is " + this.f127083a.length);
    }

    @Override // qn0.InterfaceC25393h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, Enum r42) {
        int m131368P;
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(r42, "value");
        m131368P = AbstractC25358n.m131368P(this.f127083a, r42);
        if (m131368P != -1) {
            encoder.mo113989l(getDescriptor(), m131368P);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r42);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().mo113953i());
        sb2.append(", must be one of ");
        String arrays = Arrays.toString(this.f127083a);
        AbstractC19074t.m100207e(arrays, "toString(this)");
        sb2.append(arrays);
        throw new SerializationException(sb2.toString());
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f127085c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo113953i() + '>';
    }
}
