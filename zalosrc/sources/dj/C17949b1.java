package dj;

import fn0.AbstractC19074t;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p471r3.C25630b;
import p647xj.C29675a;
import p647xj.C29676b;
import p716zh.C32024mb;

/* renamed from: dj.b1 */
/* loaded from: classes3.dex */
public final class C17949b1 extends C17969i0 {

    /* renamed from: B */
    private C25630b f90862B;

    /* renamed from: C */
    private long f90863C;

    /* renamed from: D */
    private C32024mb f90864D;

    /* renamed from: E */
    private boolean f90865E;

    public C17949b1(C25630b c25630b) {
        C25630b c25630b2;
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        this.f90863C = -1L;
        this.f90862B = c25630b;
        this.f90865E = c25630b != null && c25630b.m132427f() == -1 && (c25630b2 = this.f90862B) != null && c25630b2.m132432j() == -1;
    }

    /* renamed from: m */
    private final void m95396m(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f90862B = new C25630b(jSONObject);
        }
    }

    /* renamed from: g */
    public final C25630b m95397g() {
        return this.f90862B;
    }

    /* renamed from: h */
    public final long m95398h() {
        return this.f90863C;
    }

    /* renamed from: i */
    public final boolean m95399i() {
        return this.f90865E;
    }

    /* renamed from: j */
    public final C32024mb m95400j() {
        C32024mb c32024mb = this.f90864D;
        if (c32024mb == null) {
            C32024mb c32024mb2 = new C32024mb();
            this.f90864D = c32024mb2;
            return c32024mb2;
        }
        return c32024mb;
    }

    /* renamed from: k */
    public final C29676b m95401k() {
        C29675a mo150746j;
        C25630b c25630b = this.f90862B;
        if (c25630b == null || (mo150746j = AbstractC23306f.m120726x1().mo150746j()) == null) {
            return null;
        }
        return mo150746j.m147600a(c25630b.m132429g());
    }

    /* renamed from: l */
    public final C32024mb m95402l() {
        return this.f90864D;
    }

    /* renamed from: n */
    public final void m95403n(C25630b c25630b) {
        this.f90862B = c25630b;
    }

    /* renamed from: o */
    public final void m95404o(long j11) {
        this.f90863C = j11;
    }

    /* renamed from: p */
    public final void m95405p(boolean z11) {
        this.f90865E = z11;
    }

    /* renamed from: q */
    public final void m95406q(C32024mb c32024mb) {
        this.f90864D = c32024mb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17949b1(JSONObject jSONObject) {
        super(jSONObject);
        C25630b c25630b;
        AbstractC19074t.m100208f(jSONObject, "json");
        this.f90863C = -1L;
        m95396m(jSONObject);
        C25630b c25630b2 = this.f90862B;
        this.f90865E = c25630b2 != null && c25630b2.m132427f() == -1 && (c25630b = this.f90862B) != null && c25630b.m132432j() == -1;
    }
}
