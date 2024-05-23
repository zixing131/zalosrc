package p716zh;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import nh0.C23793c;
import p386ob.EnumC24190a;
import p386ob.EnumC24194e;

/* renamed from: zh.q9 */
/* loaded from: classes3.dex */
public final class C32080q9 {

    /* renamed from: a */
    private long f147786a;

    /* renamed from: b */
    private int f147787b;

    /* renamed from: c */
    private long f147788c;

    /* renamed from: d */
    private long f147789d;

    /* renamed from: e */
    private int f147790e;

    /* renamed from: f */
    private int f147791f;

    /* renamed from: g */
    private int f147792g;

    /* renamed from: h */
    private int f147793h;

    /* renamed from: j */
    private boolean f147795j;

    /* renamed from: m */
    private boolean f147798m;

    /* renamed from: n */
    private EnumC24194e f147799n;

    /* renamed from: i */
    private boolean f147794i = true;

    /* renamed from: k */
    private long f147796k = C23793c.Companion.m124321a().mo124319c();

    /* renamed from: l */
    private ArrayList f147797l = new ArrayList();

    /* renamed from: zh.q9$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f147800a;

        static {
            int[] iArr = new int[EnumC24190a.values().length];
            try {
                iArr[EnumC24190a.f116750q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24190a.f116751r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24190a.f116752s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC24190a.f116753t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f147800a = iArr;
        }
    }

    public C32080q9(long j11, int i11) {
        this.f147786a = j11;
        this.f147787b = i11;
    }

    /* renamed from: m */
    private final void m154770m() {
        this.f147789d = C23793c.Companion.m124321a().mo124319c() - this.f147796k;
        C32094r9 c32094r9 = (C32094r9) this.f147797l.get(0);
        this.f147795j = c32094r9.m154860K();
        this.f147799n = c32094r9.m154906p();
        this.f147798m = c32094r9.m154863N();
        for (C32094r9 c32094r92 : this.f147797l) {
            int i11 = a.f147800a[c32094r92.m154857H().ordinal()];
            if (i11 == 1) {
                this.f147790e++;
            } else if (i11 == 2) {
                this.f147792g++;
            } else if (i11 == 3) {
                this.f147791f++;
            } else if (i11 == 4) {
                this.f147793h++;
            }
            this.f147788c += c32094r92.m154890h() + c32094r92.m154892i();
            if (!c32094r92.m154862M()) {
                this.f147794i = false;
            }
        }
    }

    /* renamed from: a */
    public final long m154771a() {
        return this.f147786a;
    }

    /* renamed from: b */
    public final int m154772b() {
        return this.f147792g;
    }

    /* renamed from: c */
    public final int m154773c() {
        return this.f147790e;
    }

    /* renamed from: d */
    public final long m154774d() {
        return this.f147788c;
    }

    /* renamed from: e */
    public final int m154775e() {
        return this.f147787b;
    }

    /* renamed from: f */
    public final EnumC24194e m154776f() {
        return this.f147799n;
    }

    /* renamed from: g */
    public final long m154777g() {
        return this.f147789d;
    }

    /* renamed from: h */
    public final int m154778h() {
        return this.f147791f;
    }

    /* renamed from: i */
    public final int m154779i() {
        return this.f147793h;
    }

    /* renamed from: j */
    public final boolean m154780j() {
        return this.f147795j;
    }

    /* renamed from: k */
    public final boolean m154781k() {
        return this.f147794i;
    }

    /* renamed from: l */
    public final boolean m154782l() {
        return this.f147798m;
    }

    /* renamed from: n */
    public final synchronized boolean m154783n(C32094r9 c32094r9) {
        AbstractC19074t.m100208f(c32094r9, "upLoadInfo");
        this.f147797l.add(c32094r9);
        if (this.f147787b == this.f147797l.size()) {
            m154770m();
            return true;
        }
        return false;
    }
}
