package c30;

import android.text.TextUtils;
import fn0.AbstractC19060k;
import p394oj.C24280f;
import p471r3.C25630b;
import p485rj.C25809a;
import p485rj.C25811c;

/* renamed from: c30.l */
/* loaded from: classes5.dex */
public final class C3251l {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f13911a;

    /* renamed from: b */
    private C25630b f13912b;

    /* renamed from: c */
    private C25809a f13913c;

    /* renamed from: d */
    private C25811c f13914d;

    /* renamed from: c30.l$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C3251l(int i11) {
        this.f13911a = i11;
    }

    /* renamed from: a */
    public final C25809a m16511a() {
        return this.f13913c;
    }

    /* renamed from: b */
    public final String m16512b() {
        String num;
        C25811c c25811c;
        int i11 = this.f13911a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2 || (c25811c = this.f13914d) == null || (num = c25811c.m133092d()) == null) {
                    return "";
                }
            } else {
                C25809a c25809a = this.f13913c;
                if (c25809a == null || (num = c25809a.m133081c()) == null) {
                    return "";
                }
            }
        } else {
            C25630b c25630b = this.f13912b;
            if (c25630b == null || (num = Integer.valueOf(c25630b.m132429g()).toString()) == null) {
                return "";
            }
        }
        return num;
    }

    /* renamed from: c */
    public final C25811c m16513c() {
        return this.f13914d;
    }

    /* renamed from: d */
    public final C25630b m16514d() {
        return this.f13912b;
    }

    /* renamed from: e */
    public final String m16515e() {
        String m133084f;
        C24280f c24280f;
        int i11 = this.f13911a;
        if (i11 != 1) {
            if (i11 != 2) {
                return "";
            }
            C25811c c25811c = this.f13914d;
            if (c25811c != null) {
                c24280f = c25811c.m133098j();
            } else {
                c24280f = null;
            }
            if (c24280f != null && !TextUtils.isEmpty(c24280f.f117261a)) {
                return c24280f.f117261a;
            }
            C25811c c25811c2 = this.f13914d;
            if (c25811c2 == null || (m133084f = c25811c2.m133097i()) == null) {
                return "";
            }
        } else {
            C25809a c25809a = this.f13913c;
            if (c25809a == null || (m133084f = c25809a.m133084f()) == null) {
                return "";
            }
        }
        return m133084f;
    }

    /* renamed from: f */
    public final int m16516f() {
        return this.f13911a;
    }

    /* renamed from: g */
    public final boolean m16517g() {
        return this.f13911a == 1;
    }

    /* renamed from: h */
    public final boolean m16518h() {
        return this.f13911a == 2;
    }

    /* renamed from: i */
    public final boolean m16519i() {
        return this.f13911a == 0;
    }

    /* renamed from: j */
    public final void m16520j(C25809a c25809a) {
        this.f13913c = c25809a;
    }

    /* renamed from: k */
    public final void m16521k(C25811c c25811c) {
        this.f13914d = c25811c;
    }

    /* renamed from: l */
    public final void m16522l(C25630b c25630b) {
        this.f13912b = c25630b;
    }
}
