package tn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import sn0.AbstractC26340g;
import sn0.C26334a;

/* renamed from: tn0.x0 */
/* loaded from: classes7.dex */
public final class C26843x0 extends AbstractC26789f0 {

    /* renamed from: c */
    private final SerialDescriptor f127108c;

    /* renamed from: tn0.x0$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ KSerializer f127109q;

        /* renamed from: r */
        final /* synthetic */ KSerializer f127110r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(KSerializer kSerializer, KSerializer kSerializer2) {
            super(1);
            this.f127109q = kSerializer;
            this.f127110r = kSerializer2;
        }

        /* renamed from: a */
        public final void m137992a(C26334a c26334a) {
            AbstractC19074t.m100208f(c26334a, "$this$buildClassSerialDescriptor");
            C26334a.m135524b(c26334a, "first", this.f127109q.getDescriptor(), null, false, 12, null);
            C26334a.m135524b(c26334a, "second", this.f127110r.getDescriptor(), null, false, 12, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m137992a((C26334a) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26843x0(KSerializer kSerializer, KSerializer kSerializer2) {
        super(kSerializer, kSerializer2, null);
        AbstractC19074t.m100208f(kSerializer, "keySerializer");
        AbstractC19074t.m100208f(kSerializer2, "valueSerializer");
        this.f127108c = AbstractC26340g.m135540b("kotlin.Pair", new SerialDescriptor[0], new a(kSerializer, kSerializer2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26789f0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object mo137825a(C24860q c24860q) {
        AbstractC19074t.m100208f(c24860q, "<this>");
        return c24860q.m129215c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26789f0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object mo137827c(C24860q c24860q) {
        AbstractC19074t.m100208f(c24860q, "<this>");
        return c24860q.m129216d();
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return this.f127108c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26789f0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C24860q mo137829e(Object obj, Object obj2) {
        return AbstractC24866w.m129235a(obj, obj2);
    }
}
