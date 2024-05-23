package vn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import pm0.C24848g0;
import qn0.InterfaceC25393h;
import sn0.AbstractC26338e;
import sn0.AbstractC26341h;
import un0.AbstractC27323a;

/* renamed from: vn0.y0 */
/* loaded from: classes7.dex */
public abstract class AbstractC28355y0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vn0.y0$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C19059j0 f132116q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C19059j0 c19059j0) {
            super(1);
            this.f132116q = c19059j0;
        }

        /* renamed from: a */
        public final void m142804a(JsonElement jsonElement) {
            AbstractC19074t.m100208f(jsonElement, "it");
            this.f132116q.f94941p = jsonElement;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m142804a((JsonElement) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ boolean m142801a(SerialDescriptor serialDescriptor) {
        return m142802b(serialDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m142802b(SerialDescriptor serialDescriptor) {
        if (!(serialDescriptor.mo113948d() instanceof AbstractC26338e) && serialDescriptor.mo113948d() != AbstractC26341h.b.f125055a) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final JsonElement m142803c(AbstractC27323a abstractC27323a, Object obj, InterfaceC25393h interfaceC25393h) {
        AbstractC19074t.m100208f(abstractC27323a, "<this>");
        AbstractC19074t.m100208f(interfaceC25393h, "serializer");
        C19059j0 c19059j0 = new C19059j0();
        new C28325j0(abstractC27323a, new a(c19059j0)).mo113987j(interfaceC25393h, obj);
        Object obj2 = c19059j0.f94941p;
        if (obj2 == null) {
            AbstractC19074t.m100223u("result");
            return null;
        }
        return (JsonElement) obj2;
    }
}
