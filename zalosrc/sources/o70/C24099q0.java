package o70;

import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import is.C20793f;
import is.C20795g;
import is.C20797h;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p348mi.AbstractC23309i;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import th.AbstractC26681b;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: o70.q0 */
/* loaded from: classes5.dex */
public final class C24099q0 {
    public static final b Companion = new b(null);

    /* renamed from: r */
    private static final InterfaceC24854k f116437r;

    /* renamed from: a */
    private final List f116438a = new ArrayList();

    /* renamed from: b */
    private int f116439b;

    /* renamed from: c */
    private int f116440c;

    /* renamed from: d */
    private int f116441d;

    /* renamed from: e */
    private int f116442e;

    /* renamed from: f */
    private int f116443f;

    /* renamed from: g */
    private int f116444g;

    /* renamed from: h */
    private int f116445h;

    /* renamed from: i */
    private int f116446i;

    /* renamed from: j */
    private boolean f116447j;

    /* renamed from: k */
    private boolean f116448k;

    /* renamed from: l */
    private boolean f116449l;

    /* renamed from: m */
    private boolean f116450m;

    /* renamed from: n */
    private boolean f116451n;

    /* renamed from: o */
    public boolean[] f116452o;

    /* renamed from: p */
    public int[] f116453p;

    /* renamed from: q */
    private boolean f116454q;

    /* renamed from: o70.q0$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f116455q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24099q0 mo12V4() {
            return c.f116456a.m125985a();
        }
    }

    /* renamed from: o70.q0$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        private final C24099q0 m125983b() {
            return (C24099q0) C24099q0.f116437r.getValue();
        }

        /* renamed from: a */
        public final C24099q0 m125984a() {
            return m125983b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o70.q0$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f116456a = new c();

        /* renamed from: b */
        private static final C24099q0 f116457b = new C24099q0();

        private c() {
        }

        /* renamed from: a */
        public final C24099q0 m125985a() {
            return f116457b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o70.q0$d */
    /* loaded from: classes5.dex */
    public static final class d {

        /* renamed from: p */
        public static final d f116458p = new d("MESSAGE", 0);

        /* renamed from: q */
        public static final d f116459q = new d("PHONEBOOK", 1);

        /* renamed from: r */
        public static final d f116460r = new d("GROUP", 2);

        /* renamed from: s */
        public static final d f116461s = new d("DISCOVERY", 3);

        /* renamed from: t */
        public static final d f116462t = new d("TIMELINE", 4);

        /* renamed from: u */
        public static final d f116463u = new d("MORE", 5);

        /* renamed from: v */
        public static final d f116464v = new d("ME", 6);

        /* renamed from: w */
        private static final /* synthetic */ d[] f116465w;

        /* renamed from: x */
        private static final /* synthetic */ InterfaceC30165a f116466x;

        static {
            d[] m125986b = m125986b();
            f116465w = m125986b;
            f116466x = AbstractC30166b.m148796a(m125986b);
        }

        private d(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ d[] m125986b() {
            return new d[]{f116458p, f116459q, f116460r, f116461s, f116462t, f116463u, f116464v};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f116465w.clone();
        }
    }

    /* renamed from: o70.q0$e */
    /* loaded from: classes5.dex */
    public /* synthetic */ class e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f116467a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f116458p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f116459q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f116460r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f116461s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f116462t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.f116463u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.f116464v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f116467a = iArr;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f116455q);
        f116437r = m129210a;
    }

    public C24099q0() {
        int i11 = this.f116439b;
        this.f116440c = i11 + 1;
        this.f116441d = i11 + 2;
        this.f116442e = i11 + 3;
        this.f116443f = i11 + 4;
        this.f116444g = i11 + 5;
        this.f116445h = i11 + 6;
        this.f116446i = i11 + 7;
        this.f116448k = true;
        this.f116449l = true;
        this.f116451n = true;
        m125960w();
    }

    /* renamed from: i */
    private final int m125957i(d dVar) {
        switch (e.f116467a[dVar.ordinal()]) {
            case 1:
                return AbstractC16803z.stencils_ic_tab_messages;
            case 2:
                return AbstractC16803z.stencils_ic_tab_friends;
            case 3:
                return AbstractC16803z.stencils_ic_tab_groups;
            case 4:
                return AbstractC16803z.stencils_ic_tab_discovery;
            case 5:
                return AbstractC16803z.stencils_ic_tab_timeline;
            case 6:
                return AbstractC16803z.stencils_ic_tab_join;
            case 7:
                return AbstractC16803z.stencils_ic_tab_me;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: k */
    public static final C24099q0 m125958k() {
        return Companion.m125984a();
    }

    /* renamed from: l */
    private final boolean m125959l(d dVar) {
        if (e.f116467a[dVar.ordinal()] == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private final void m125960w() {
        boolean z11;
        this.f116438a.clear();
        this.f116449l = C20793f.f102166a.m108493c();
        this.f116450m = C20797h.f102195a.m108525a();
        this.f116451n = C20795g.f102172a.m108498b();
        boolean z12 = true;
        if (AbstractC23309i.m120924F2() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f116447j = z11;
        if (!AbstractC26681b.f126364i || AbstractC23309i.m120925F3() != 1) {
            z12 = false;
        }
        this.f116448k = z12;
        List list = this.f116438a;
        d dVar = d.f116458p;
        list.add(dVar);
        List list2 = this.f116438a;
        d dVar2 = d.f116459q;
        list2.add(dVar2);
        if (this.f116447j) {
            this.f116438a.add(d.f116460r);
        }
        if (this.f116449l) {
            this.f116438a.add(d.f116461s);
        }
        if (this.f116448k) {
            this.f116438a.add(d.f116462t);
        }
        if (this.f116451n) {
            this.f116438a.add(d.f116464v);
        }
        if (this.f116450m) {
            this.f116438a.add(d.f116463u);
        }
        this.f116446i = this.f116438a.size();
        this.f116439b = this.f116438a.indexOf(dVar);
        this.f116440c = this.f116438a.indexOf(dVar2);
        this.f116441d = this.f116438a.indexOf(d.f116460r);
        this.f116442e = this.f116438a.indexOf(d.f116461s);
        this.f116443f = this.f116438a.indexOf(d.f116462t);
        this.f116444g = this.f116438a.indexOf(d.f116463u);
        this.f116445h = this.f116438a.indexOf(d.f116464v);
        m125980y(new int[this.f116446i]);
        m125979x(new boolean[this.f116446i]);
        int i11 = 0;
        for (Object obj : this.f116438a) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            d dVar3 = (d) obj;
            m125974r()[i11] = m125957i(dVar3);
            m125973q()[i11] = m125959l(dVar3);
            i11 = i12;
        }
        this.f116454q = false;
    }

    /* renamed from: b */
    public final boolean m125961b() {
        return this.f116449l;
    }

    /* renamed from: c */
    public final boolean m125962c() {
        return this.f116447j;
    }

    /* renamed from: d */
    public final boolean m125963d() {
        return this.f116451n;
    }

    /* renamed from: e */
    public final boolean m125964e() {
        return this.f116450m;
    }

    /* renamed from: f */
    public final boolean m125965f() {
        return this.f116448k;
    }

    /* renamed from: g */
    public final int m125966g() {
        return this.f116442e;
    }

    /* renamed from: h */
    public final int m125967h() {
        return this.f116441d;
    }

    /* renamed from: j */
    public final int m125968j(d dVar) {
        AbstractC19074t.m100208f(dVar, "tab");
        switch (e.f116467a[dVar.ordinal()]) {
            case 1:
                return AbstractC6918a0.maintab_message;
            case 2:
                return AbstractC6918a0.maintab_contact;
            case 3:
                return AbstractC6918a0.maintab_groups;
            case 4:
                return AbstractC6918a0.maintab_discovery;
            case 5:
                return AbstractC6918a0.maintab_timeline;
            case 6:
                return AbstractC6918a0.maintab_join;
            case 7:
                return AbstractC6918a0.maintab_metab;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: m */
    public final int m125969m() {
        return this.f116445h;
    }

    /* renamed from: n */
    public final int m125970n() {
        return this.f116444g;
    }

    /* renamed from: o */
    public final int m125971o() {
        return this.f116439b;
    }

    /* renamed from: p */
    public final int m125972p() {
        return this.f116440c;
    }

    /* renamed from: q */
    public final boolean[] m125973q() {
        boolean[] zArr = this.f116452o;
        if (zArr != null) {
            return zArr;
        }
        AbstractC19074t.m100223u("preLoadedTabs");
        return null;
    }

    /* renamed from: r */
    public final int[] m125974r() {
        int[] iArr = this.f116453p;
        if (iArr != null) {
            return iArr;
        }
        AbstractC19074t.m100223u("resourceIconTabs");
        return null;
    }

    /* renamed from: s */
    public final int m125975s() {
        return this.f116446i;
    }

    /* renamed from: t */
    public final List m125976t() {
        return this.f116438a;
    }

    /* renamed from: u */
    public final int m125977u() {
        return this.f116443f;
    }

    /* renamed from: v */
    public final void m125978v() {
        this.f116454q = true;
    }

    /* renamed from: x */
    public final void m125979x(boolean[] zArr) {
        AbstractC19074t.m100208f(zArr, "<set-?>");
        this.f116452o = zArr;
    }

    /* renamed from: y */
    public final void m125980y(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "<set-?>");
        this.f116453p = iArr;
    }

    /* renamed from: z */
    public final void m125981z() {
        if (this.f116454q) {
            m125960w();
        }
    }
}
