package i60;

import com.zing.zalo.control.C7904b;
import fn0.AbstractC19060k;

/* renamed from: i60.i */
/* loaded from: classes5.dex */
public final class C20343i {

    /* renamed from: f */
    private static final C20343i f100327f;

    /* renamed from: h */
    private static final C20343i f100329h;

    /* renamed from: a */
    private boolean f100330a;

    /* renamed from: b */
    private boolean f100331b;

    /* renamed from: c */
    private boolean f100332c;

    /* renamed from: d */
    private final boolean f100333d;

    /* renamed from: e */
    private C7904b f100334e;
    public static final a Companion = new a(null);

    /* renamed from: g */
    private static final C20343i f100328g = new C20343i(true, false, false, false, null, 30, null);

    /* renamed from: i60.i$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20343i m106071a() {
            return C20343i.f100329h;
        }
    }

    static {
        boolean z11 = false;
        boolean z12 = false;
        f100327f = new C20343i(false, z11, z12, false, null, 31, null);
        f100329h = new C20343i(false, true, z11, z12, null, 29, null);
    }

    public C20343i(boolean z11, boolean z12, boolean z13, boolean z14, C7904b c7904b) {
        this.f100330a = z11;
        this.f100331b = z12;
        this.f100332c = z13;
        this.f100333d = z14;
        this.f100334e = c7904b;
    }

    /* renamed from: b */
    public final C20343i m106062b(boolean z11) {
        this.f100332c = z11;
        return this;
    }

    /* renamed from: c */
    public final boolean m106063c() {
        return this.f100332c;
    }

    /* renamed from: d */
    public final C7904b m106064d() {
        return this.f100334e;
    }

    /* renamed from: e */
    public final C20343i m106065e(boolean z11) {
        this.f100331b = z11;
        return this;
    }

    /* renamed from: f */
    public final C20343i m106066f(C7904b c7904b) {
        this.f100334e = c7904b;
        return this;
    }

    /* renamed from: g */
    public final boolean m106067g() {
        return this.f100333d;
    }

    /* renamed from: h */
    public final boolean m106068h() {
        return this.f100331b;
    }

    /* renamed from: i */
    public final boolean m106069i() {
        return this.f100330a;
    }

    /* renamed from: j */
    public final C20343i m106070j(boolean z11) {
        this.f100330a = z11;
        return this;
    }

    public String toString() {
        return "JumpMsgExtraFlow(showUnreadSeparator=" + this.f100330a + ", highlightMsg=" + this.f100331b + ", alignTop=" + this.f100332c + ", markJumpReturn=" + this.f100333d + ")";
    }

    public /* synthetic */ C20343i(boolean z11, boolean z12, boolean z13, boolean z14, C7904b c7904b, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) == 0 ? z13 : false, (i11 & 8) != 0 ? true : z14, (i11 & 16) != 0 ? null : c7904b);
    }
}
