package l30;

import ag0.AbstractC0837p0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import l30.C22052u;
import me0.C23055e5;
import p645xh.C29628e;
import p716zh.C32123ta;

/* renamed from: l30.z */
/* loaded from: classes5.dex */
public final class C22059z {

    /* renamed from: a */
    private final C32123ta f108650a;

    /* renamed from: b */
    private final C22052u.e f108651b;

    /* renamed from: c */
    private final String f108652c;

    /* renamed from: d */
    private volatile boolean f108653d;

    /* renamed from: e */
    private boolean f108654e;

    public C22059z(C32123ta c32123ta, C22052u.e eVar) {
        AbstractC19074t.m100208f(c32123ta, "storyItem");
        this.f108650a = c32123ta;
        this.f108651b = eVar;
        String simpleName = C22059z.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        this.f108652c = simpleName;
        this.f108653d = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m115173h(C22059z c22059z) {
        AbstractC19074t.m100208f(c22059z, "this$0");
        while (c22059z.f108653d) {
            if (c22059z.f108654e) {
                c22059z.f108650a.m155084p();
                c22059z.m115175c();
                return;
            }
            C32123ta c32123ta = c22059z.f108650a;
            int i11 = c32123ta.f148128c;
            if (i11 != 3 && i11 != 2 && i11 != 5) {
                if (!c32123ta.m155073M()) {
                    c22059z.f108650a.m155084p();
                    if (C23055e5.m118273h(false, 1, null) && C29628e.m147249E0().m93432x()) {
                        c22059z.f108650a.m155078e0(C32123ta.f148096l0);
                    } else {
                        c22059z.f108650a.m155076c0(50001);
                        c22059z.f108650a.m155078e0(50001);
                    }
                    c22059z.m115175c();
                } else {
                    int i12 = c22059z.f108650a.f148128c;
                    if (i12 == 1 || i12 == 4) {
                        if (C23055e5.m118273h(false, 1, null) && C29628e.m147249E0().m93432x()) {
                            c22059z.f108650a.m155075b0();
                        } else {
                            c22059z.m115178f(500L);
                        }
                    }
                }
            } else {
                c22059z.m115175c();
            }
        }
    }

    /* renamed from: b */
    public final void m115174b() {
        this.f108654e = true;
    }

    /* renamed from: c */
    public final void m115175c() {
        this.f108653d = false;
        C22052u.e eVar = this.f108651b;
        if (eVar != null) {
            eVar.mo115110a(this);
        }
    }

    /* renamed from: d */
    public final String m115176d() {
        String str = this.f108650a.f148138h;
        AbstractC19074t.m100207e(str, "storyId");
        return str;
    }

    /* renamed from: e */
    public final C32123ta m115177e() {
        return this.f108650a;
    }

    /* renamed from: f */
    public final void m115178f(long j11) {
        try {
            Thread.sleep(j11);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: g */
    public final void m115179g() {
        this.f108653d = true;
        this.f108650a.m155077d0(System.currentTimeMillis());
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: l30.y
            @Override // java.lang.Runnable
            public final void run() {
                C22059z.m115173h(C22059z.this);
            }
        });
    }
}
