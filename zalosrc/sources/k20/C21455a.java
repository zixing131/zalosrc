package k20;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C21456b;
import on0.AbstractC24341v;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;

/* renamed from: k20.a */
/* loaded from: classes5.dex */
public final class C21455a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f104462a;

    /* renamed from: b */
    private final ArrayList f104463b;

    /* renamed from: k20.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C21455a(String str) {
        AbstractC19074t.m100208f(str, "name");
        this.f104462a = str;
        this.f104463b = new ArrayList();
    }

    /* renamed from: a */
    public final void m111003a(C21456b c21456b) {
        AbstractC19074t.m100208f(c21456b, "vs");
        int m111007e = m111007e(c21456b.m111016b());
        if (m111007e == -1) {
            this.f104463b.add(c21456b);
        } else {
            this.f104463b.set(m111007e, c21456b);
        }
    }

    /* renamed from: b */
    public final void m111004b() {
        this.f104463b.clear();
    }

    /* renamed from: c */
    public final void m111005c(C21455a c21455a) {
        AbstractC19074t.m100208f(c21455a, ZinstantMetaConstant.TARGET_VIEWPORT);
        this.f104463b.addAll(c21455a.f104463b);
    }

    /* renamed from: d */
    public final C21456b.b m111006d(String str) {
        int m111007e = m111007e(str);
        if (m111007e == -1) {
            return null;
        }
        return ((C21456b) this.f104463b.get(m111007e)).m111015a();
    }

    /* renamed from: e */
    public final int m111007e(String str) {
        boolean m127128x;
        int i11 = -1;
        if (str != null) {
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                int i12 = 0;
                for (Object obj : this.f104463b) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    if (AbstractC19074t.m100204b(((C21456b) obj).m111016b(), str)) {
                        i11 = i12;
                    }
                    i12 = i13;
                }
            }
        }
        return i11;
    }

    /* renamed from: f */
    public final boolean m111008f() {
        return this.f104463b.isEmpty();
    }

    /* renamed from: g */
    public final C21456b m111009g() {
        Object m131216p0;
        if (!this.f104463b.isEmpty()) {
            m131216p0 = AbstractC25332a0.m131216p0(this.f104463b);
            return (C21456b) m131216p0;
        }
        return null;
    }

    /* renamed from: h */
    public final void m111010h(int i11) {
        this.f104463b.remove(i11);
    }

    /* renamed from: i */
    public final boolean m111011i(String str) {
        int m111007e = m111007e(str);
        if (m111007e != -1) {
            m111010h(m111007e);
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m111012j() {
        if (m111008f()) {
            return;
        }
        m111010h(this.f104463b.size() - 1);
    }

    /* renamed from: k */
    public final void m111013k(String str) {
        Object obj;
        Iterator it = this.f104463b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC19074t.m100204b(((C21456b) obj).m111016b(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C21456b c21456b = (C21456b) obj;
        if (c21456b != null) {
            c21456b.m111018d();
        }
    }

    /* renamed from: l */
    public final boolean m111014l(C17487o0 c17487o0) {
        if (m111008f()) {
            return false;
        }
        if (m111009g() != null) {
            C21456b m111009g = m111009g();
            if (m111009g != null) {
                m111009g.m111019e(c17487o0);
                return true;
            }
            return true;
        }
        m111012j();
        return false;
    }
}
