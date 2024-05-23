package un0;

import en0.InterfaceC18494a;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import sn0.AbstractC26341h;

/* renamed from: un0.k */
/* loaded from: classes7.dex */
public abstract class AbstractC27333k {

    /* renamed from: un0.k$a */
    /* loaded from: classes7.dex */
    public static final class a implements SerialDescriptor {

        /* renamed from: a */
        private final InterfaceC24854k f128617a;

        a(InterfaceC18494a interfaceC18494a) {
            InterfaceC24854k m129210a;
            m129210a = AbstractC24856m.m129210a(interfaceC18494a);
            this.f128617a = m129210a;
        }

        /* renamed from: a */
        private final SerialDescriptor m139937a() {
            return (SerialDescriptor) this.f128617a.getValue();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: b */
        public boolean mo113946b() {
            return SerialDescriptor.C21879a.m113959c(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: c */
        public int mo113947c(String str) {
            AbstractC19074t.m100208f(str, "name");
            return m139937a().mo113947c(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: d */
        public AbstractC26341h mo113948d() {
            return m139937a().mo113948d();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: e */
        public int mo113949e() {
            return m139937a().mo113949e();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: f */
        public String mo113950f(int i11) {
            return m139937a().mo113950f(i11);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: g */
        public List mo113951g(int i11) {
            return m139937a().mo113951g(i11);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: h */
        public SerialDescriptor mo113952h(int i11) {
            return m139937a().mo113952h(i11);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: i */
        public String mo113953i() {
            return m139937a().mo113953i();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: j */
        public List mo113954j() {
            return SerialDescriptor.C21879a.m113957a(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: k */
        public boolean mo113955k() {
            return SerialDescriptor.C21879a.m113958b(this);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: l */
        public boolean mo113956l(int i11) {
            return m139937a().mo113956l(i11);
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m139930b(Decoder decoder) {
        m139935g(decoder);
    }

    /* renamed from: c */
    public static final /* synthetic */ void m139931c(Encoder encoder) {
        m139936h(encoder);
    }

    /* renamed from: d */
    public static final InterfaceC27329g m139932d(Decoder decoder) {
        InterfaceC27329g interfaceC27329g;
        AbstractC19074t.m100208f(decoder, "<this>");
        if (decoder instanceof InterfaceC27329g) {
            interfaceC27329g = (InterfaceC27329g) decoder;
        } else {
            interfaceC27329g = null;
        }
        if (interfaceC27329g != null) {
            return interfaceC27329g;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + AbstractC19061k0.m100169b(decoder.getClass()));
    }

    /* renamed from: e */
    public static final InterfaceC27334l m139933e(Encoder encoder) {
        InterfaceC27334l interfaceC27334l;
        AbstractC19074t.m100208f(encoder, "<this>");
        if (encoder instanceof InterfaceC27334l) {
            interfaceC27334l = (InterfaceC27334l) encoder;
        } else {
            interfaceC27334l = null;
        }
        if (interfaceC27334l != null) {
            return interfaceC27334l;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + AbstractC19061k0.m100169b(encoder.getClass()));
    }

    /* renamed from: f */
    public static final SerialDescriptor m139934f(InterfaceC18494a interfaceC18494a) {
        return new a(interfaceC18494a);
    }

    /* renamed from: g */
    public static final void m139935g(Decoder decoder) {
        m139932d(decoder);
    }

    /* renamed from: h */
    public static final void m139936h(Encoder encoder) {
        m139933e(encoder);
    }
}
