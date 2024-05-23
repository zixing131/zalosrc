package cl0;

import bl0.C2837c;
import bl0.C2839e;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.C19071q;
import ik0.AbstractC20596s;
import lk0.AbstractC22506d;
import vk0.AbstractC28282d;
import vk0.C28284f;
import xk0.C29699f;
import xk0.InterfaceC29697d;
import zk0.InterfaceC32222a;

/* renamed from: cl0.a */
/* loaded from: classes7.dex */
public final class C3571a extends AbstractC28282d {

    /* renamed from: c */
    private final int f15134c;

    /* renamed from: d */
    private final Object f15135d;

    /* renamed from: e */
    private final boolean f15136e;

    /* renamed from: cl0.a$a */
    /* loaded from: classes7.dex */
    /* synthetic */ class a extends C19071q implements InterfaceC18494a {
        a(Object obj) {
            super(0, obj, C3571a.class, "fileStation", "fileStation()Lcom/zing/zalo/zinstant/universe/base/transport/Station;", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final InterfaceC29697d mo12V4() {
            return ((C3571a) this.f94922q).m18154k();
        }
    }

    /* renamed from: cl0.a$b */
    /* loaded from: classes7.dex */
    /* synthetic */ class b extends C19071q implements InterfaceC18494a {
        b(Object obj) {
            super(0, obj, C3571a.class, "nativeStation", "nativeStation()Lcom/zing/zalo/zinstant/universe/base/transport/Station;", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final InterfaceC29697d mo12V4() {
            return ((C3571a) this.f94922q).m18156m();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3571a(C2837c c2837c, InterfaceC32222a interfaceC32222a) {
        super(c2837c, interfaceC32222a);
        int i11;
        Object obj;
        AbstractC19074t.m100208f(c2837c, "info");
        AbstractC20596s.b m99733c = c2837c.m13703h().m99733c();
        if (m99733c != null) {
            i11 = m99733c.mo107074c();
        } else {
            i11 = 0;
        }
        this.f15134c = i11;
        AbstractC20596s.b m99733c2 = c2837c.m13703h().m99733c();
        if (m99733c2 != null) {
            obj = m99733c2.mo107073b();
        } else {
            obj = null;
        }
        this.f15135d = obj;
        this.f15136e = AbstractC22506d.Companion.m116369c(i11);
    }

    @Override // vk0.AbstractC28282d
    /* renamed from: i */
    public void mo18152i(C29699f c29699f) {
        AbstractC19074t.m100208f(c29699f, "spaceship");
        if (this.f15135d != null && this.f15136e) {
            c29699f.m147694d(new a(this));
            c29699f.m147694d(new b(this));
        }
    }

    /* renamed from: k */
    public final InterfaceC29697d m18154k() {
        if (m18157n()) {
            return new C3574d((C2837c) m142531b(), m142532c());
        }
        return new C3584n(new C28284f(400, "base64 - 2file - type(" + this.f15134c + ')'));
    }

    /* renamed from: l */
    public final byte[] m18155l() {
        Object obj = this.f15135d;
        if (obj == null) {
            return null;
        }
        try {
            return AbstractC22506d.Companion.m116368b(obj, this.f15134c, ((C2837c) m142531b()).m13703h().m99736f());
        } catch (Exception e11) {
            m142533d("base64 - get bytes " + e11.getMessage());
            return null;
        }
    }

    /* renamed from: m */
    public final InterfaceC29697d m18156m() {
        byte[] m18155l = m18155l();
        if (m18155l != null) {
            return new C3593w(new C3591u(m18155l, null, ((C2837c) m142531b()).m13703h(), ((C2837c) m142531b()).m13700e(), ((C2837c) m142531b()).m13701f(), ((C2837c) m142531b()).m13704i(), ((C2837c) m142531b()).m13702g(), ((C2837c) m142531b()).m99746a(), 2, null), m142532c());
        }
        return new C3584n(new C28284f(400, "base64 - load bytes error - type(" + this.f15134c + ')'));
    }

    /* renamed from: n */
    public final boolean m18157n() {
        try {
            return AbstractC22506d.Companion.m116370e(this.f15135d, this.f15134c, ((C2837c) m142531b()).m13703h().m99736f(), ((C2837c) m142531b()).m13703h().m99734d());
        } catch (Exception e11) {
            m142533d("base64 - save file " + e11.getMessage());
            return false;
        }
    }

    @Override // vk0.AbstractC28282d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C2839e mo18153j() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("base64 - unknown - type(");
        sb2.append(this.f15134c);
        sb2.append(") - empty(");
        int i11 = 1;
        if (this.f15135d == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        sb2.append(z11);
        sb2.append(')');
        return new C2839e(null, new C28284f(400, sb2.toString()), i11, 0 == true ? 1 : 0);
    }
}
