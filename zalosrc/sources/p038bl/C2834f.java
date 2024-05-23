package p038bl;

import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.HashSet;
import p363nh.C23744a;

/* renamed from: bl.f */
/* loaded from: classes3.dex */
public final class C2834f {

    /* renamed from: a */
    public static final C2834f f11325a = new C2834f();

    private C2834f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m13682f() {
        C23744a.Companion.m124119a().m124116d(8002, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m13683h() {
        C23744a.Companion.m124119a().m124116d(39, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m13684j(HashSet hashSet) {
        AbstractC19074t.m100208f(hashSet, "$deleteCates");
        C23744a.Companion.m124119a().m124116d(8004, hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m13685l() {
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124116d(8002, new Object[0]);
        bVar.m124119a().m124116d(20, new Object[0]);
    }

    /* renamed from: e */
    public final void m13686e() {
        AbstractC19444a.m101695c(new Runnable() { // from class: bl.c
            @Override // java.lang.Runnable
            public final void run() {
                C2834f.m13682f();
            }
        });
    }

    /* renamed from: g */
    public final void m13687g() {
        AbstractC19444a.m101695c(new Runnable() { // from class: bl.e
            @Override // java.lang.Runnable
            public final void run() {
                C2834f.m13683h();
            }
        });
    }

    /* renamed from: i */
    public final void m13688i(final HashSet hashSet) {
        AbstractC19074t.m100208f(hashSet, "deleteCates");
        AbstractC19444a.m101695c(new Runnable() { // from class: bl.b
            @Override // java.lang.Runnable
            public final void run() {
                C2834f.m13684j(hashSet);
            }
        });
    }

    /* renamed from: k */
    public final void m13689k() {
        AbstractC19444a.m101695c(new Runnable() { // from class: bl.d
            @Override // java.lang.Runnable
            public final void run() {
                C2834f.m13685l();
            }
        });
    }
}
