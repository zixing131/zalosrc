package vn0;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.C19071q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import tn0.C26827s;

/* renamed from: vn0.a0 */
/* loaded from: classes7.dex */
public final class C28306a0 {

    /* renamed from: a */
    private final C26827s f132020a;

    /* renamed from: b */
    private boolean f132021b;

    /* renamed from: vn0.a0$a */
    /* loaded from: classes7.dex */
    /* synthetic */ class a extends C19071q implements InterfaceC18509p {
        a(Object obj) {
            super(2, obj, C28306a0.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        /* renamed from: h */
        public final Boolean m142631h(SerialDescriptor serialDescriptor, int i11) {
            AbstractC19074t.m100208f(serialDescriptor, "p0");
            return Boolean.valueOf(((C28306a0) this.f94922q).m142627e(serialDescriptor, i11));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            return m142631h((SerialDescriptor) obj, ((Number) obj2).intValue());
        }
    }

    public C28306a0(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        this.f132020a = new C26827s(serialDescriptor, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m142627e(SerialDescriptor serialDescriptor, int i11) {
        boolean z11;
        if (!serialDescriptor.mo113956l(i11) && serialDescriptor.mo113952h(i11).mo113946b()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f132021b = z11;
        return z11;
    }

    /* renamed from: b */
    public final boolean m142628b() {
        return this.f132021b;
    }

    /* renamed from: c */
    public final void m142629c(int i11) {
        this.f132020a.m137958a(i11);
    }

    /* renamed from: d */
    public final int m142630d() {
        return this.f132020a.m137959d();
    }
}
