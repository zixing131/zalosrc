package ci;

import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ci.k */
/* loaded from: classes3.dex */
public final class C3510k extends C3508j {

    /* renamed from: A */
    private boolean f14733A;

    /* renamed from: B */
    private final List f14734B;

    /* renamed from: C */
    private boolean f14735C;

    /* renamed from: D */
    private long f14736D;

    /* renamed from: E */
    private boolean f14737E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3510k(CreateMediaStoreParam createMediaStoreParam) {
        super(createMediaStoreParam);
        AbstractC19074t.m100208f(createMediaStoreParam, "createMediaStoreParam");
        this.f14734B = new ArrayList();
    }

    /* renamed from: X0 */
    public final boolean m17741X0() {
        return this.f14737E;
    }

    /* renamed from: Y0 */
    public final List m17742Y0() {
        return this.f14734B;
    }

    /* renamed from: Z0 */
    public final boolean m17743Z0() {
        return this.f14733A;
    }

    /* renamed from: a1 */
    public final boolean m17744a1() {
        return this.f14735C;
    }

    /* renamed from: b1 */
    public final void m17745b1() {
        m17714z0().clear();
    }

    /* renamed from: c1 */
    public final boolean m17746c1(long j11) {
        if (C3508j.Companion.m17715a(this.f14734B, j11)) {
            m17707T0(m17692E0() - 1);
            return true;
        }
        return false;
    }

    /* renamed from: d1 */
    public final void m17747d1(boolean z11) {
        this.f14737E = z11;
    }

    /* renamed from: e1 */
    public final void m17748e1(boolean z11) {
        this.f14733A = z11;
    }

    /* renamed from: f1 */
    public final void m17749f1(long j11) {
        this.f14736D = j11;
    }

    /* renamed from: g1 */
    public final void m17750g1(boolean z11) {
        this.f14735C = z11;
    }

    @Override // ci.C3508j
    /* renamed from: x0 */
    public List mo17712x0() {
        if (m17714z0().isEmpty()) {
            m17745b1();
        }
        return super.mo17712x0();
    }
}
