package p129ef;

import fn0.AbstractC19074t;
import p166fq.InterfaceC19110g;
import p276jt.C21357l;
import p276jt.InterfaceC21359n;
import p276jt.InterfaceC21360o;

/* renamed from: ef.a */
/* loaded from: classes3.dex */
public final class C18420a extends C21357l implements InterfaceC19110g, InterfaceC21359n, InterfaceC21360o {

    /* renamed from: t0 */
    private float f92896t0;

    /* renamed from: u0 */
    private float f92897u0;

    /* renamed from: v0 */
    private float f92898v0;

    /* renamed from: w0 */
    private Object f92899w0;

    public C18420a(String str, C21357l.b bVar, int i11, int i12, int i13, int i14) {
        super(str, bVar, i11, i12, i13, i14);
        this.f92898v0 = 10.0f;
    }

    /* renamed from: e1 */
    private final boolean m97616e1() {
        if (Math.abs(this.f104024H - this.f104090p0) > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: f1 */
    private final void m97617f1(float f11) {
        if (f11 < 0.1d) {
            f11 = 0.1f;
        }
        this.f104024H = f11;
    }

    @Override // p166fq.InterfaceC19110g
    /* renamed from: b */
    public void mo97618b(float f11) {
        m110615s0(m97621d1() + f11);
    }

    /* renamed from: c1 */
    public float m97619c1() {
        return this.f92897u0;
    }

    @Override // p276jt.InterfaceC21359n
    /* renamed from: d */
    public void mo97620d(float f11) {
        this.f92896t0 = f11;
    }

    /* renamed from: d1 */
    public float m97621d1() {
        return this.f92896t0;
    }

    @Override // p276jt.InterfaceC21359n
    /* renamed from: f */
    public void mo97622f(float f11) {
        this.f92897u0 = Math.min(this.f92898v0, f11);
    }

    /* renamed from: g1 */
    public final void m97623g1(float f11) {
        this.f92898v0 = f11;
    }

    @Override // p166fq.InterfaceC19110g
    public Object getTag() {
        return this.f92899w0;
    }

    @Override // p166fq.InterfaceC19110g
    /* renamed from: i */
    public void mo97624i(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "text");
        m110673Z0(charSequence.toString());
    }

    @Override // p166fq.InterfaceC19110g
    /* renamed from: j */
    public void mo97625j(float f11) {
        m97617f1(f11);
    }

    @Override // p166fq.InterfaceC19110g
    /* renamed from: m */
    public CharSequence mo97626m() {
        String m110654E0 = super.m110654E0();
        AbstractC19074t.m100207e(m110654E0, "getText(...)");
        return m110654E0;
    }

    @Override // p166fq.InterfaceC19110g
    /* renamed from: o */
    public void mo97627o(float f11) {
        m97617f1(f11);
        if (m97616e1()) {
            m110675b1();
        }
    }

    @Override // p276jt.C21357l, p276jt.AbstractC21351f
    /* renamed from: p0 */
    public void mo97628p0(float f11) {
        float f12 = this.f92898v0;
        if (f11 > f12) {
            this.f104024H = f12;
        } else if (f11 < 0.1d) {
            this.f104024H = 0.1f;
        } else {
            this.f104024H = f11;
        }
    }

    @Override // p166fq.InterfaceC19110g
    /* renamed from: q */
    public void mo97629q(float f11) {
        mo1953W(f11);
    }

    @Override // p166fq.InterfaceC19110g
    public void setTag(Object obj) {
        this.f92899w0 = obj;
    }
}
