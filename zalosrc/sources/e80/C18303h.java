package e80;

import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import e80.AbstractC18305j;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import hu.C20131e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23258x2;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import on0.AbstractC24341v;
import p354n3.C23528a;
import p716zh.AbstractC32161w6;
import x70.C29428k0;

/* renamed from: e80.h */
/* loaded from: classes6.dex */
public final class C18303h extends AbstractC18305j {
    public static final a Companion = new a(null);

    /* renamed from: f */
    private final C23528a f92578f;

    /* renamed from: g */
    private final b f92579g;

    /* renamed from: e80.h$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: e80.h$b */
    /* loaded from: classes6.dex */
    public interface b {
        /* renamed from: a */
        boolean mo69095a();

        /* renamed from: b */
        void mo69096b(boolean z11);

        /* renamed from: c */
        void mo69097c(List list);
    }

    /* renamed from: e80.h$c */
    /* loaded from: classes6.dex */
    public static final class c implements C29428k0.e {

        /* renamed from: a */
        final /* synthetic */ String f92580a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18305j.a f92581b;

        /* renamed from: c */
        final /* synthetic */ C18303h f92582c;

        c(String str, AbstractC18305j.a aVar, C18303h c18303h) {
            this.f92580a = str;
            this.f92581b = aVar;
            this.f92582c = c18303h;
        }

        @Override // x70.C29428k0.e
        /* renamed from: b */
        public void mo97202b(File file) {
            AbstractC19074t.m100208f(file, "result");
            this.f92581b.m97214a().m40560B0(file.getPath());
            this.f92581b.m97214a().m40562C0(2);
            this.f92581b.m97217d(true);
            this.f92581b.m97216c(true);
            this.f92582c.m97211h();
        }

        @Override // x70.C29428k0.e
        /* renamed from: c */
        public void mo97203c(AbstractC32161w6 abstractC32161w6) {
            AbstractC19074t.m100208f(abstractC32161w6, "errorCode");
            this.f92582c.m97199w(this.f92581b);
        }
    }

    /* renamed from: e80.h$d */
    /* loaded from: classes6.dex */
    public static final class d implements C29428k0.d {

        /* renamed from: a */
        final /* synthetic */ AbstractC18305j.a f92583a;

        /* renamed from: b */
        final /* synthetic */ C18303h f92584b;

        d(AbstractC18305j.a aVar, C18303h c18303h) {
            this.f92583a = aVar;
            this.f92584b = c18303h;
        }

        @Override // x70.C29428k0.d
        /* renamed from: a */
        public boolean mo97204a() {
            return true;
        }

        @Override // x70.C29428k0.e
        /* renamed from: b */
        public void mo97202b(File file) {
            AbstractC19074t.m100208f(file, "result");
            this.f92583a.m97214a().m40560B0(file.getPath());
            this.f92583a.m97217d(true);
            this.f92583a.m97216c(true);
            this.f92584b.m97211h();
        }

        @Override // x70.C29428k0.e
        /* renamed from: c */
        public void mo97203c(AbstractC32161w6 abstractC32161w6) {
            AbstractC19074t.m100208f(abstractC32161w6, "errorCode");
            this.f92583a.m97216c(true);
            this.f92584b.m97211h();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18303h(List list, C23528a c23528a, b bVar) {
        super(list);
        AbstractC19074t.m100208f(list, "items");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        this.f92578f = c23528a;
        this.f92579g = bVar;
    }

    /* renamed from: q */
    private final boolean m97193q(AbstractC18305j.a aVar) {
        return aVar.m97215b();
    }

    /* renamed from: r */
    public static final void m97194r(C18303h c18303h) {
        AbstractC19074t.m100208f(c18303h, "this$0");
        b bVar = c18303h.f92579g;
        if (bVar != null) {
            bVar.mo69096b(false);
        }
    }

    /* renamed from: s */
    public static final void m97195s(C18303h c18303h, ArrayList arrayList) {
        AbstractC19074t.m100208f(c18303h, "this$0");
        AbstractC19074t.m100208f(arrayList, "$mediaItemsToShare");
        b bVar = c18303h.f92579g;
        if (bVar != null) {
            bVar.mo69097c(arrayList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:            if (r0 != false) goto L20;     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m97196t(AbstractC18305j.a aVar) {
        boolean m127120J;
        boolean m127120J2;
        String m94868D3 = aVar.m97214a().m40599m().m94868D3();
        AbstractC19074t.m100207e(m94868D3, "getHDUrl(...)");
        if (!TextUtils.isEmpty(m94868D3)) {
            m127120J = AbstractC24341v.m127120J(m94868D3, "http://", false, 2, null);
            if (!m127120J) {
                m127120J2 = AbstractC24341v.m127120J(m94868D3, "https://", false, 2, null);
            }
            m97197u(aVar);
            return;
        }
        m97199w(aVar);
    }

    /* renamed from: u */
    private final void m97197u(AbstractC18305j.a aVar) {
        String m94868D3 = aVar.m97214a().m40599m().m94868D3();
        AbstractC19074t.m100207e(m94868D3, "getHDUrl(...)");
        if (!m97209d()) {
            AbstractC19444a.m101695c(new Runnable() { // from class: e80.e
                public /* synthetic */ RunnableC18300e() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C18303h.m97198v(C18303h.this);
                }
            });
            m97212j(true);
        }
        String path = new File(C20131e.f99303a.m104947d(), AbstractC23352g.m122788d(m94868D3) + ".jpg").getPath();
        C29428k0.c cVar = C29428k0.Companion;
        C23528a c23528a = this.f92578f;
        AbstractC19074t.m100205c(path);
        cVar.m146690v(c23528a, m94868D3, path, new c(m94868D3, aVar, this));
    }

    /* renamed from: v */
    public static final void m97198v(C18303h c18303h) {
        AbstractC19074t.m100208f(c18303h, "this$0");
        b bVar = c18303h.f92579g;
        if (bVar != null) {
            bVar.mo69096b(true);
        }
    }

    /* renamed from: w */
    public final void m97199w(AbstractC18305j.a aVar) {
        boolean m127120J;
        boolean m127120J2;
        MediaStoreItem m97214a = aVar.m97214a();
        String m94983Q3 = m97214a.m40599m().m94983Q3();
        AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
        if (!TextUtils.isEmpty(m94983Q3) && AbstractC23258x2.m119958q(m94983Q3)) {
            aVar.m97214a().m40560B0(m94983Q3);
            aVar.m97217d(true);
            aVar.m97216c(true);
            m97211h();
            return;
        }
        String m95090b5 = m97214a.m40599m().m95090b5();
        AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
        if (!TextUtils.isEmpty(m95090b5)) {
            m127120J = AbstractC24341v.m127120J(m95090b5, "http://", false, 2, null);
            if (!m127120J) {
                m127120J2 = AbstractC24341v.m127120J(m95090b5, "https://", false, 2, null);
                if (!m127120J2) {
                    if (!TextUtils.isEmpty(m95090b5) && AbstractC23258x2.m119958q(m95090b5)) {
                        aVar.m97214a().m40560B0(m94983Q3);
                        aVar.m97217d(true);
                        aVar.m97216c(true);
                        m97211h();
                        return;
                    }
                    aVar.m97217d(false);
                    aVar.m97216c(true);
                    m97211h();
                    return;
                }
            }
            if (!m97209d()) {
                AbstractC19444a.m101695c(new Runnable() { // from class: e80.d
                    public /* synthetic */ RunnableC18299d() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C18303h.m97200x(C18303h.this);
                    }
                });
                m97212j(true);
            }
            C29428k0.g gVar = new C29428k0.g(m97214a);
            C29428k0.c cVar = C29428k0.Companion;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            cVar.m146689s(str, this.f92578f, gVar, m95090b5, false, new d(aVar, this));
            return;
        }
        aVar.m97217d(false);
        aVar.m97216c(true);
        m97211h();
    }

    /* renamed from: x */
    public static final void m97200x(C18303h c18303h) {
        AbstractC19074t.m100208f(c18303h, "this$0");
        b bVar = c18303h.f92579g;
        if (bVar != null) {
            bVar.mo69096b(true);
        }
    }

    /* renamed from: y */
    private final void m97201y(AbstractC18305j.a aVar) {
        try {
            try {
                aVar.m97214a().m40560B0(aVar.m97214a().m40599m().m94983Q3());
                aVar.m97217d(true);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } finally {
            aVar.m97216c(true);
            m97211h();
        }
    }

    @Override // e80.AbstractC18305j
    /* renamed from: f */
    protected void mo97186f() {
        if (m97210e()) {
            return;
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: e80.f
            public /* synthetic */ RunnableC18301f() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18303h.m97194r(C18303h.this);
            }
        });
        ArrayList arrayList = new ArrayList();
        for (AbstractC18305j.a aVar : m97208c()) {
            if (!m97193q(aVar)) {
                b bVar = this.f92579g;
                if (bVar != null && bVar.mo69095a()) {
                    ToastUtils.m89266n(AbstractC8020f0.download_photo_not_cached_message, new Object[0]);
                    return;
                }
                return;
            }
            arrayList.add(aVar.m97214a());
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: e80.g

            /* renamed from: q */
            public final /* synthetic */ ArrayList f92577q;

            public /* synthetic */ RunnableC18302g(ArrayList arrayList2) {
                r2 = arrayList2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18303h.m97195s(C18303h.this, r2);
            }
        });
    }

    @Override // e80.AbstractC18305j
    /* renamed from: g */
    protected void mo97187g(AbstractC18305j.a aVar) {
        AbstractC19074t.m100208f(aVar, "shareItem");
        if (aVar.m97214a().m40598l0()) {
            m97201y(aVar);
        } else {
            m97196t(aVar);
        }
    }
}
