package f10;

import com.zing.zalo.shortvideo.data.remote.common.RestResponse;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import sn0.AbstractC26340g;
import sn0.C26334a;
import tn0.C26783d0;
import tn0.C26810m0;
import tn0.C26814n1;

/* renamed from: f10.e */
/* loaded from: classes5.dex */
public final class C18693e implements KSerializer {

    /* renamed from: a */
    private final KSerializer f93913a;

    /* renamed from: b */
    private final SerialDescriptor f93914b;

    /* renamed from: f10.e$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m98599a(C26334a c26334a) {
            List m131502j;
            List m131502j2;
            List m131502j3;
            AbstractC19074t.m100208f(c26334a, "$this$buildClassSerialDescriptor");
            m131502j = AbstractC25368s.m131502j();
            c26334a.m135525a("err", C26783d0.f126989a.getDescriptor(), m131502j, false);
            m131502j2 = AbstractC25368s.m131502j();
            c26334a.m135525a("msg", C26814n1.f127034a.getDescriptor(), m131502j2, false);
            C26334a.m135524b(c26334a, "data", C18693e.this.f93913a.getDescriptor(), null, false, 12, null);
            m131502j3 = AbstractC25368s.m131502j();
            c26334a.m135525a("sTime", C26810m0.f127024a.getDescriptor(), m131502j3, false);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m98599a((C26334a) obj);
            return C24848g0.f119245a;
        }
    }

    public C18693e(KSerializer kSerializer) {
        AbstractC19074t.m100208f(kSerializer, "dataSerializer");
        this.f93913a = kSerializer;
        this.f93914b = AbstractC26340g.m135540b("RestResponse", new SerialDescriptor[0], new a());
    }

    @Override // qn0.InterfaceC25386a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RestResponse deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor);
        String str = "";
        Object obj = null;
        long j11 = 0;
        int i11 = -1;
        while (true) {
            int mo114037p = mo113968b.mo114037p(getDescriptor());
            if (mo114037p != -1) {
                if (mo114037p != 0) {
                    if (mo114037p != 1) {
                        if (mo114037p != 2) {
                            if (mo114037p == 3) {
                                j11 = mo113968b.mo114010f(getDescriptor(), 3);
                            } else {
                                throw new IllegalStateException(("Unexpected index: " + mo114037p).toString());
                            }
                        } else {
                            obj = InterfaceC21885c.a.m114040c(mo113968b, getDescriptor(), 2, this.f93913a, null, 8, null);
                        }
                    } else {
                        str = mo113968b.mo114014o(getDescriptor(), 1);
                    }
                } else {
                    i11 = mo113968b.mo114011i(getDescriptor(), 0);
                }
            } else {
                C24848g0 c24848g0 = C24848g0.f119245a;
                mo113968b.mo114009c(descriptor);
                return new RestResponse(i11, str, obj, j11);
            }
        }
    }

    @Override // qn0.InterfaceC25393h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, RestResponse restResponse) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(restResponse, "value");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor);
        mo113984b.mo114033x(getDescriptor(), 0, restResponse.m51531a());
        mo113984b.mo114035z(getDescriptor(), 1, restResponse.m51533c());
        Object m51532b = restResponse.m51532b();
        if (m51532b != null) {
            mo113984b.mo114029i(getDescriptor(), 2, this.f93913a, m51532b);
        }
        mo113984b.mo114022E(getDescriptor(), 3, restResponse.m51534d());
        mo113984b.mo114026c(descriptor);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return this.f93914b;
    }
}
