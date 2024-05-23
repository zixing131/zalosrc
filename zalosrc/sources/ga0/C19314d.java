package ga0;

import ag0.AbstractC0837p0;
import ai.C0862b;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.WebBaseView;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ha0.C19955h;
import me0.C23024b7;
import org.json.JSONObject;
import p140ev.C18620i;
import p189gv.C19609h;
import p542ub.InterfaceC27218a;
import p578vk.AbstractC28275a;
import p612wk.AbstractC29069a;
import tk.InterfaceC26722a;

/* renamed from: ga0.d */
/* loaded from: classes6.dex */
public final class C19314d extends AbstractRunnableC19355q1 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private final C18316b f95911s;

    /* renamed from: t */
    private final String f95912t;

    /* renamed from: u */
    private final C18620i f95913u;

    /* renamed from: ga0.d$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19314d(InterfaceC18319c interfaceC18319c, C18316b c18316b, String str, C18620i c18620i) {
        super(interfaceC18319c);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(c18316b, "action");
        AbstractC19074t.m100208f(str, "query");
        this.f95911s = c18316b;
        this.f95912t = str;
        this.f95913u = c18620i;
    }

    /* renamed from: m */
    private final void m101081m(InterfaceC26722a interfaceC26722a, C0862b c0862b, int i11, C19325g1 c19325g1, BaseZaloView baseZaloView) {
        m101083o(baseZaloView, c0862b);
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ga0.c

            /* renamed from: q */
            public final /* synthetic */ C19325g1 f95904q;

            /* renamed from: r */
            public final /* synthetic */ C19314d f95905r;

            /* renamed from: s */
            public final /* synthetic */ int f95906s;

            /* renamed from: t */
            public final /* synthetic */ C0862b f95907t;

            public /* synthetic */ RunnableC19311c(C19325g1 c19325g12, C19314d this, int i112, C0862b c0862b2) {
                r2 = c19325g12;
                r3 = this;
                r4 = i112;
                r5 = c0862b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19314d.m101082n(InterfaceC26722a.this, r2, r3, r4, r5);
            }
        });
    }

    /* renamed from: n */
    public static final void m101082n(InterfaceC26722a interfaceC26722a, C19325g1 c19325g1, C19314d c19314d, int i11, C0862b c0862b) {
        AbstractC19074t.m100208f(interfaceC26722a, "$item");
        AbstractC19074t.m100208f(c19325g1, "$sessionData");
        AbstractC19074t.m100208f(c19314d, "this$0");
        AbstractC19074t.m100208f(c0862b, "$data");
        C7960e m41971c6 = C7960e.m41971c6();
        m41971c6.m42211N7(c0862b.mo2478b(), System.currentTimeMillis());
        m41971c6.m42423i8(c19314d.f95912t, c0862b.mo2478b(), c0862b.mo2475c(), c0862b.mo2481g());
        if (interfaceC26722a instanceof AbstractC29069a) {
            C23024b7.f111993a.m118075x(c19325g1);
        }
        c19314d.m101440g(new C18316b("Search.RefreshRecentSearch", null, null, null, 14, null));
        C19955h.f98250a.m103730s(c19325g1, interfaceC26722a, i11, 1);
    }

    /* renamed from: o */
    private final void m101083o(BaseZaloView baseZaloView, C0862b c0862b) {
        JSONObject m2488n;
        InterfaceC27218a m92676n2 = baseZaloView.m92676n2();
        if (m92676n2 == null || (m2488n = c0862b.m2488n()) == null) {
            return;
        }
        WebBaseView.Companion.m86843s(m92676n2, new C19609h(m2488n), null, this.f95913u);
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        Object obj;
        BaseZaloView baseZaloView;
        Object obj2;
        C18316b c18316b;
        C18316b c18316b2;
        InterfaceC18319c m101438e = m101438e();
        C19325g1 c19325g1 = null;
        if (m101438e != null && (c18316b2 = (C18316b) m101438e.mo205i9(new C18316b("GET_BOUND_ZALO_VIEW", null, null, null, 14, null))) != null) {
            obj = c18316b2.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof BaseZaloView) {
            baseZaloView = (BaseZaloView) obj;
        } else {
            baseZaloView = null;
        }
        if (baseZaloView == null) {
            return;
        }
        InterfaceC18319c m101438e2 = m101438e();
        if (m101438e2 != null && (c18316b = (C18316b) m101438e2.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
            obj2 = c18316b.m97245a();
        } else {
            obj2 = null;
        }
        if (obj2 instanceof C19325g1) {
            c19325g1 = (C19325g1) obj2;
        }
        C19325g1 c19325g12 = c19325g1;
        if (c19325g12 == null) {
            return;
        }
        m101440g(new C18316b("HIDE_KEYBOARD", null, null, null, 14, null));
        String m97246b = this.f95911s.m97246b();
        if (AbstractC19074t.m100204b(m97246b, "Search.Result.ClickItem")) {
            if ((this.f95911s.m97245a() instanceof AbstractC29069a.m) && (this.f95911s.m97247c() instanceof Integer)) {
                m101081m((InterfaceC26722a) this.f95911s.m97245a(), ((AbstractC29069a.m) this.f95911s.m97245a()).m145192b(), ((Number) this.f95911s.m97247c()).intValue(), c19325g12, baseZaloView);
                return;
            }
            return;
        }
        if (AbstractC19074t.m100204b(m97246b, "Search.PreState.ClickItem") && (this.f95911s.m97245a() instanceof AbstractC28275a.b) && (((AbstractC28275a.b) this.f95911s.m97245a()).m142475c() instanceof C0862b)) {
            m101081m((InterfaceC26722a) this.f95911s.m97245a(), (C0862b) ((AbstractC28275a.b) this.f95911s.m97245a()).m142475c(), 0, c19325g12, baseZaloView);
        }
    }
}
