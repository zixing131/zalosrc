package p042bx;

import android.os.Looper;
import cx.C17579d;
import hu.AbstractC20130d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me0.AbstractC23122k6;
import p042bx.C3154i;
import p114dx.C18075a;

/* renamed from: bx.e */
/* loaded from: classes4.dex */
public final class C3150e implements C17579d.a, C3154i.a {

    /* renamed from: e */
    private static AbstractC3149d f13308e;

    /* renamed from: f */
    private static b f13309f;

    /* renamed from: a */
    C3154i f13310a;

    /* renamed from: b */
    C3155j f13311b;

    /* renamed from: c */
    private final List f13312c = new LinkedList();

    /* renamed from: d */
    private final C17579d f13313d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bx.e$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        static final C3150e f13314a = new C3150e();
    }

    /* renamed from: bx.e$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo15866a(long j11, String str);
    }

    public C3150e() {
        C3154i c3154i = new C3154i(this, m15856f().mo15848e(), m15856f().mo15853j());
        m15860k(c3154i);
        C3155j c3155j = new C3155j(f13308e.m15850g(), Looper.getMainLooper().getThread(), f13308e.m15851h(), f13308e.mo15849f());
        this.f13311b = c3155j;
        c3155j.m15882l(c3154i);
        C17579d c17579d = new C17579d("(?:.*?\\bat\\s+%c.%m\\s*\\(.*?(?::%l)?\\)\\s*)|(?:(?:.*?[:\"]\\s+)?%c(?::.*)?)", true, new File(AbstractC20130d.m104842L0() + "/mapping.txt"));
        this.f13313d = c17579d;
        c17579d.m93616g(this);
        c17579d.m93617h(f13308e.mo15852i());
    }

    /* renamed from: d */
    private void m15854d(C18075a c18075a) {
        c18075a.m96126c();
    }

    /* renamed from: e */
    private void m15855e(C18075a c18075a) {
        if (c18075a.m96124a() != null && c18075a.m96124a().trim().length() > 0 && this.f13312c.size() != 0) {
            Iterator it = this.f13312c.iterator();
            while (it.hasNext()) {
                ((InterfaceC3151f) it.next()).mo15867a(m15856f().m15850g(), c18075a);
            }
        }
    }

    /* renamed from: f */
    public static AbstractC3149d m15856f() {
        return f13308e;
    }

    /* renamed from: g */
    public static C3150e m15857g() {
        return a.f13314a;
    }

    /* renamed from: i */
    private void m15858i(List list, long j11, long j12, long j13, long j14, int i11, int i12, boolean z11) {
        C18075a m96131i = C18075a.m96123f().m96129g(j11, j12, j13, j14).m96131i((ArrayList) list);
        m96131i.m96132j(i11);
        m96131i.m96130h(i12);
        m15854d(m96131i);
        if (z11) {
            m15855e(m96131i);
        }
    }

    /* renamed from: j */
    public static void m15859j(AbstractC3149d abstractC3149d) {
        f13308e = abstractC3149d;
    }

    /* renamed from: k */
    private void m15860k(C3154i c3154i) {
        this.f13310a = c3154i;
    }

    /* renamed from: l */
    public static void m15861l(b bVar) {
        f13309f = (b) AbstractC23122k6.m118609a(bVar);
    }

    @Override // p042bx.C3154i.a
    /* renamed from: a */
    public void mo15862a(long j11, long j12, long j13, long j14, int i11, int i12) {
        try {
            ArrayList m15881k = this.f13311b.m15881k(j11, j12);
            if (f13308e.mo15847b()) {
                if (!m15881k.isEmpty()) {
                    m15858i(m15881k, j11, j12, j13, j14, i11, i12, true);
                }
            } else if (!m15881k.isEmpty()) {
                this.f13313d.m93618i(m15881k);
                this.f13313d.m93615d(j11, j12, j13, j14, i11, i12);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // cx.C17579d.a
    /* renamed from: b */
    public void mo15863b(List list, long j11, long j12, long j13, long j14, int i11, int i12) {
        m15858i(list, j11, j12, j13, j14, i11, i12, true);
    }

    /* renamed from: c */
    public void m15864c(InterfaceC3151f interfaceC3151f) {
        this.f13312c.add(interfaceC3151f);
    }

    /* renamed from: h */
    public long m15865h() {
        return m15856f().mo15848e() * 0.8f;
    }
}
