package jl0;

import fl0.AbstractC18997h;
import fl0.C18996g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ik0.AbstractC20595r;
import ik0.AbstractC20601x;

/* renamed from: jl0.a */
/* loaded from: classes7.dex */
public class C21285a extends AbstractC18997h {

    /* renamed from: b */
    private final C18996g f103722b;

    /* renamed from: c */
    private final int f103723c;

    /* renamed from: d */
    private final AbstractC20595r f103724d;

    /* renamed from: e */
    private final boolean f103725e;

    public /* synthetic */ C21285a(C18996g c18996g, int i11, AbstractC20595r abstractC20595r, boolean z11, AbstractC20601x abstractC20601x, int i12, AbstractC19060k abstractC19060k) {
        this(c18996g, i11, abstractC20595r, (i12 & 8) != 0 ? false : z11, abstractC20601x);
    }

    /* renamed from: b */
    public final boolean m110240b() {
        return this.f103725e;
    }

    /* renamed from: c */
    public final int m110241c() {
        return this.f103723c;
    }

    /* renamed from: d */
    public final C18996g m110242d() {
        return this.f103722b;
    }

    /* renamed from: e */
    public final AbstractC20595r m110243e() {
        return this.f103724d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21285a(C18996g c18996g, int i11, AbstractC20595r abstractC20595r, boolean z11, AbstractC20601x abstractC20601x) {
        super(abstractC20601x);
        AbstractC19074t.m100208f(c18996g, "utility");
        AbstractC19074t.m100208f(abstractC20595r, "zinstantDataConfigRequest");
        AbstractC19074t.m100208f(abstractC20601x, "zinstantRequest");
        this.f103722b = c18996g;
        this.f103723c = i11;
        this.f103724d = abstractC20595r;
        this.f103725e = z11;
    }
}
