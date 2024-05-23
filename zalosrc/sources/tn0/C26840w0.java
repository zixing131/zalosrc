package tn0;

import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.EnumC24858o;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import sn0.AbstractC26340g;
import sn0.AbstractC26342i;
import sn0.C26334a;

/* renamed from: tn0.w0 */
/* loaded from: classes7.dex */
public final class C26840w0 implements KSerializer {

    /* renamed from: a */
    private final Object f127100a;

    /* renamed from: b */
    private List f127101b;

    /* renamed from: c */
    private final InterfaceC24854k f127102c;

    /* renamed from: tn0.w0$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f127103q;

        /* renamed from: r */
        final /* synthetic */ C26840w0 f127104r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: tn0.w0$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C32985a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C26840w0 f127105q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32985a(C26840w0 c26840w0) {
                super(1);
                this.f127105q = c26840w0;
            }

            /* renamed from: a */
            public final void m137985a(C26334a c26334a) {
                AbstractC19074t.m100208f(c26334a, "$this$buildSerialDescriptor");
                c26334a.m135531h(this.f127105q.f127101b);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m137985a((C26334a) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, C26840w0 c26840w0) {
            super(0);
            this.f127103q = str;
            this.f127104r = c26840w0;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SerialDescriptor mo12V4() {
            return AbstractC26340g.m135542d(this.f127103q, AbstractC26342i.d.f125059a, new SerialDescriptor[0], new C32985a(this.f127104r));
        }
    }

    public C26840w0(String str, Object obj) {
        List m131502j;
        InterfaceC24854k m129211b;
        AbstractC19074t.m100208f(str, "serialName");
        AbstractC19074t.m100208f(obj, "objectInstance");
        this.f127100a = obj;
        m131502j = AbstractC25368s.m131502j();
        this.f127101b = m131502j;
        m129211b = AbstractC24856m.m129211b(EnumC24858o.f119258q, new a(str, this));
        this.f127102c = m129211b;
    }

    @Override // qn0.InterfaceC25386a
    public Object deserialize(Decoder decoder) {
        int mo114037p;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor);
        if (mo113968b.mo114015q() || (mo114037p = mo113968b.mo114037p(getDescriptor())) == -1) {
            C24848g0 c24848g0 = C24848g0.f119245a;
            mo113968b.mo114009c(descriptor);
            return this.f127100a;
        }
        throw new SerializationException("Unexpected index " + mo114037p);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f127102c.getValue();
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Object obj) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(obj, "value");
        encoder.mo113984b(getDescriptor()).mo114026c(getDescriptor());
    }
}
