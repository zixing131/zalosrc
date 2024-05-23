package nk0;

import com.zing.zalo.zinstant.zom.node.ZOMAudio;
import fn0.AbstractC19074t;
import kk0.C21755b;
import qk0.InterfaceC25306b;

/* renamed from: nk0.j */
/* loaded from: classes7.dex */
public final class C23833j extends AbstractC23825g0 implements InterfaceC25306b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23833j(C23855s0 c23855s0, ZOMAudio zOMAudio) {
        super(c23855s0, zOMAudio);
        AbstractC19074t.m100208f(c23855s0, "root");
        AbstractC19074t.m100208f(zOMAudio, "element");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m124571p2(C23833j c23833j) {
        AbstractC19074t.m100208f(c23833j, "this$0");
        ((ZOMAudio) c23833j.m131007J()).onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m124572r2(C23833j c23833j, String str) {
        AbstractC19074t.m100208f(c23833j, "this$0");
        AbstractC19074t.m100208f(str, "$message");
        ((ZOMAudio) c23833j.m131007J()).onError(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m124573s2(C23833j c23833j) {
        AbstractC19074t.m100208f(c23833j, "this$0");
        ((ZOMAudio) c23833j.m131007J()).onPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m124574u2(C23833j c23833j) {
        AbstractC19074t.m100208f(c23833j, "this$0");
        ((ZOMAudio) c23833j.m131007J()).onPlay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m124575v2(ZOMAudio zOMAudio) {
        zOMAudio.requestPlay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m124576x2(C23833j c23833j, int i11, int i12) {
        AbstractC19074t.m100208f(c23833j, "this$0");
        ((ZOMAudio) c23833j.m131007J()).onTimeChanged(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m124577z2(C23833j c23833j, int i11) {
        AbstractC19074t.m100208f(c23833j, "this$0");
        ((ZOMAudio) c23833j.m131007J()).setDuration(i11);
    }

    @Override // qk0.InterfaceC25306b
    /* renamed from: d */
    public void mo124578d(String str, int i11) {
        AbstractC19074t.m100208f(str, "src");
        if (!m131014X()) {
            return;
        }
        C21755b.Companion.m112232a().m112230p(this, i11);
    }

    @Override // qk0.InterfaceC25306b
    /* renamed from: h */
    public void mo124579h(String str, int i11, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, "src");
        if (!m131014X()) {
            return;
        }
        C21755b.Companion.m112232a().m112229n(this, str, i11, z11, z12);
    }

    @Override // qk0.InterfaceC25306b
    /* renamed from: i */
    public void mo124580i(String str) {
        AbstractC19074t.m100208f(str, "src");
        if (!m131014X()) {
            return;
        }
        C21755b.Companion.m112232a().m112231q(this);
    }

    /* renamed from: o2 */
    public void m124581o2() {
        m131000E().m124639c0(new Runnable() { // from class: nk0.h
            @Override // java.lang.Runnable
            public final void run() {
                C23833j.m124571p2(C23833j.this);
            }
        });
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f, nk0.InterfaceC23806a
    public void onPause() {
        super.onPause();
        C21755b.Companion.m112232a().m112231q(this);
        m131000E().m124639c0(new Runnable() { // from class: nk0.c
            @Override // java.lang.Runnable
            public final void run() {
                C23833j.m124573s2(C23833j.this);
            }
        });
    }

    @Override // qk0.AbstractC25310f, nk0.InterfaceC23806a
    public void onResume() {
        super.onResume();
        final ZOMAudio zOMAudio = (ZOMAudio) m131007J();
        if (zOMAudio.isAutoPlay()) {
            m131000E().m124639c0(new Runnable() { // from class: nk0.d
                @Override // java.lang.Runnable
                public final void run() {
                    C23833j.m124575v2(ZOMAudio.this);
                }
            });
        }
    }

    /* renamed from: q2 */
    public void m124582q2(final String str) {
        AbstractC19074t.m100208f(str, "message");
        m131000E().m124639c0(new Runnable() { // from class: nk0.e
            @Override // java.lang.Runnable
            public final void run() {
                C23833j.m124572r2(C23833j.this, str);
            }
        });
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: t0 */
    public void mo124514t0() {
        super.mo124514t0();
        C21755b.Companion.m112232a().m112231q(this);
    }

    /* renamed from: t2 */
    public void m124583t2() {
        m131000E().m124639c0(new Runnable() { // from class: nk0.g
            @Override // java.lang.Runnable
            public final void run() {
                C23833j.m124574u2(C23833j.this);
            }
        });
    }

    /* renamed from: w2 */
    public void m124584w2(final int i11, final int i12) {
        m131000E().m124639c0(new Runnable() { // from class: nk0.f
            @Override // java.lang.Runnable
            public final void run() {
                C23833j.m124576x2(C23833j.this, i11, i12);
            }
        });
    }

    /* renamed from: y2 */
    public void m124585y2(final int i11) {
        m131000E().m124639c0(new Runnable() { // from class: nk0.i
            @Override // java.lang.Runnable
            public final void run() {
                C23833j.m124577z2(C23833j.this, i11);
            }
        });
    }
}
