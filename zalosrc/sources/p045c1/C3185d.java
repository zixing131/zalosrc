package p045c1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p088d1.AbstractC17700i;
import p088d1.C17706o;
import p700z0.C31132c;
import p700z0.C31138i;

/* renamed from: c1.d */
/* loaded from: classes2.dex */
public class C3185d {

    /* renamed from: b */
    private int f13456b;

    /* renamed from: c */
    private boolean f13457c;

    /* renamed from: d */
    public final C3186e f13458d;

    /* renamed from: e */
    public final b f13459e;

    /* renamed from: f */
    public C3185d f13460f;

    /* renamed from: i */
    C31138i f13463i;

    /* renamed from: a */
    private HashSet f13455a = null;

    /* renamed from: g */
    public int f13461g = 0;

    /* renamed from: h */
    int f13462h = Integer.MIN_VALUE;

    /* renamed from: c1.d$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13464a;

        static {
            int[] iArr = new int[b.values().length];
            f13464a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13464a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13464a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13464a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13464a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13464a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13464a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13464a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13464a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: c1.d$b */
    /* loaded from: classes2.dex */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C3185d(C3186e c3186e, b bVar) {
        this.f13458d = c3186e;
        this.f13459e = bVar;
    }

    /* renamed from: a */
    public boolean m15998a(C3185d c3185d, int i11) {
        return m15999b(c3185d, i11, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public boolean m15999b(C3185d c3185d, int i11, int i12, boolean z11) {
        if (c3185d == null) {
            m16014q();
            return true;
        }
        if (!z11 && !m16013p(c3185d)) {
            return false;
        }
        this.f13460f = c3185d;
        if (c3185d.f13455a == null) {
            c3185d.f13455a = new HashSet();
        }
        HashSet hashSet = this.f13460f.f13455a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f13461g = i11;
        this.f13462h = i12;
        return true;
    }

    /* renamed from: c */
    public void m16000c(int i11, ArrayList arrayList, C17706o c17706o) {
        HashSet hashSet = this.f13455a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC17700i.m93748a(((C3185d) it.next()).f13458d, i11, arrayList, c17706o);
            }
        }
    }

    /* renamed from: d */
    public HashSet m16001d() {
        return this.f13455a;
    }

    /* renamed from: e */
    public int m16002e() {
        if (this.f13457c) {
            return this.f13456b;
        }
        return 0;
    }

    /* renamed from: f */
    public int m16003f() {
        C3185d c3185d;
        if (this.f13458d.m16068X() == 8) {
            return 0;
        }
        if (this.f13462h != Integer.MIN_VALUE && (c3185d = this.f13460f) != null && c3185d.f13458d.m16068X() == 8) {
            return this.f13462h;
        }
        return this.f13461g;
    }

    /* renamed from: g */
    public final C3185d m16004g() {
        switch (a.f13464a[this.f13459e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f13458d.f13512S;
            case 3:
                return this.f13458d.f13508Q;
            case 4:
                return this.f13458d.f13514T;
            case 5:
                return this.f13458d.f13510R;
            default:
                throw new AssertionError(this.f13459e.name());
        }
    }

    /* renamed from: h */
    public C3186e m16005h() {
        return this.f13458d;
    }

    /* renamed from: i */
    public C31138i m16006i() {
        return this.f13463i;
    }

    /* renamed from: j */
    public C3185d m16007j() {
        return this.f13460f;
    }

    /* renamed from: k */
    public b m16008k() {
        return this.f13459e;
    }

    /* renamed from: l */
    public boolean m16009l() {
        HashSet hashSet = this.f13455a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C3185d) it.next()).m16004g().m16012o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public boolean m16010m() {
        HashSet hashSet = this.f13455a;
        if (hashSet == null || hashSet.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public boolean m16011n() {
        return this.f13457c;
    }

    /* renamed from: o */
    public boolean m16012o() {
        return this.f13460f != null;
    }

    /* renamed from: p */
    public boolean m16013p(C3185d c3185d) {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (c3185d == null) {
            return false;
        }
        b m16008k = c3185d.m16008k();
        b bVar = this.f13459e;
        if (m16008k == bVar) {
            if (bVar == b.BASELINE && (!c3185d.m16005h().m16076b0() || !m16005h().m16076b0())) {
                return false;
            }
            return true;
        }
        switch (a.f13464a[bVar.ordinal()]) {
            case 1:
                if (m16008k == b.BASELINE || m16008k == b.CENTER_X || m16008k == b.CENTER_Y) {
                    return false;
                }
                return true;
            case 2:
            case 3:
                if (m16008k != b.LEFT && m16008k != b.RIGHT) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (c3185d.m16005h() instanceof C3189h) {
                    if (z11 || m16008k == b.CENTER_X) {
                        z13 = true;
                    }
                    return z13;
                }
                return z11;
            case 4:
            case 5:
                if (m16008k != b.TOP && m16008k != b.BOTTOM) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (c3185d.m16005h() instanceof C3189h) {
                    if (z12 || m16008k == b.CENTER_Y) {
                        z13 = true;
                    }
                    return z13;
                }
                return z12;
            case 6:
                if (m16008k == b.LEFT || m16008k == b.RIGHT) {
                    return false;
                }
                return true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f13459e.name());
        }
    }

    /* renamed from: q */
    public void m16014q() {
        HashSet hashSet;
        C3185d c3185d = this.f13460f;
        if (c3185d != null && (hashSet = c3185d.f13455a) != null) {
            hashSet.remove(this);
            if (this.f13460f.f13455a.size() == 0) {
                this.f13460f.f13455a = null;
            }
        }
        this.f13455a = null;
        this.f13460f = null;
        this.f13461g = 0;
        this.f13462h = Integer.MIN_VALUE;
        this.f13457c = false;
        this.f13456b = 0;
    }

    /* renamed from: r */
    public void m16015r() {
        this.f13457c = false;
        this.f13456b = 0;
    }

    /* renamed from: s */
    public void m16016s(C31132c c31132c) {
        C31138i c31138i = this.f13463i;
        if (c31138i == null) {
            this.f13463i = new C31138i(C31138i.a.UNRESTRICTED, null);
        } else {
            c31138i.m151299g();
        }
    }

    /* renamed from: t */
    public void m16017t(int i11) {
        this.f13456b = i11;
        this.f13457c = true;
    }

    public String toString() {
        return this.f13458d.m16125v() + ":" + this.f13459e.toString();
    }

    /* renamed from: u */
    public void m16018u(int i11) {
        if (m16012o()) {
            this.f13462h = i11;
        }
    }
}
