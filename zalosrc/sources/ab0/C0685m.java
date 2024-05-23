package ab0;

import ab0.C0685m;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstoragev1.detail.C13463a;
import dg0.AbstractC17930e;
import eg0.C18427b;
import ie0.C20526a;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Future;
import me0.AbstractC23136l9;
import mg.C23288a;
import mm0.AbstractC23350e;
import p185gc.AbstractC19378b;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p213hl.C20086b;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p371nv.C23952g;
import wd0.C28923c;
import za0.C31747a;

/* renamed from: ab0.m */
/* loaded from: classes6.dex */
public class C0685m extends AbstractC19962a implements InterfaceC0673a {

    /* renamed from: A */
    private long f2247A;

    /* renamed from: B */
    private volatile boolean f2248B;

    /* renamed from: C */
    private long f2249C;

    /* renamed from: D */
    private long f2250D;

    /* renamed from: E */
    private int f2251E;

    /* renamed from: t */
    private final C20086b f2252t;

    /* renamed from: u */
    private final C28923c f2253u;

    /* renamed from: v */
    private Future f2254v;

    /* renamed from: w */
    private Future f2255w;

    /* renamed from: x */
    private Future f2256x;

    /* renamed from: y */
    private ThreadStorageInfo f2257y;

    /* renamed from: z */
    private String f2258z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ab0.m$a */
    /* loaded from: classes6.dex */
    public class a implements AbstractC19378b.a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m1001e() {
            ((InterfaceC0674b) C0685m.this.m103742Dp()).mo971Q7(false);
            ((InterfaceC0674b) C0685m.this.m103742Dp()).mo974nH();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m1002f() {
            ((InterfaceC0674b) C0685m.this.m103742Dp()).mo976vv(C0685m.this.f2257y);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m1003g() {
            ((InterfaceC0674b) C0685m.this.m103742Dp()).mo972b8(C0685m.this.f2257y);
            ((InterfaceC0674b) C0685m.this.m103742Dp()).mo970Id(C0685m.this.f2257y);
            ((InterfaceC0674b) C0685m.this.m103742Dp()).mo971Q7(false);
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: b */
        public void mo1004b() {
            ((InterfaceC0674b) C0685m.this.m103742Dp()).mo70710wy(new Runnable() { // from class: ab0.j
                @Override // java.lang.Runnable
                public final void run() {
                    C0685m.a.this.m1001e();
                }
            });
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onSuccess(C20526a.c cVar) {
            try {
                C0685m.this.f2257y = cVar.m106636a();
                if (cVar.m106637b()) {
                    ((InterfaceC0674b) C0685m.this.m103742Dp()).mo70710wy(new Runnable() { // from class: ab0.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0685m.a.this.m1002f();
                        }
                    });
                } else {
                    ((InterfaceC0674b) C0685m.this.m103742Dp()).mo70710wy(new Runnable() { // from class: ab0.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0685m.a.this.m1003g();
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("StorageUsageDetailPresenter", e11);
            }
        }
    }

    public C0685m(InterfaceC0674b interfaceC0674b, C20086b c20086b, C28923c c28923c) {
        super(interfaceC0674b);
        this.f2247A = 0L;
        this.f2248B = false;
        this.f2251E = 0;
        this.f2252t = c20086b;
        this.f2253u = c28923c;
        AbstractC23647d.m123897g("711229");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Sp */
    public /* synthetic */ void m986Sp() {
        ((InterfaceC0674b) m103742Dp()).mo971Q7(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Tp */
    public /* synthetic */ void m987Tp() {
        C20526a c20526a = new C20526a(AbstractC23306f.m120586I());
        String str = this.f2258z;
        Objects.requireNonNull(str);
        c20526a.m101501b(new C20526a.b(str), new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Wp */
    public /* synthetic */ void m988Wp(long j11, String str) {
        try {
            this.f2252t.m104444o(j11);
            C23952g.m125345j("Tool Storage", " deleted from detail: " + j11 + " bytes.");
            this.f2252t.m104441l();
            this.f2253u.m101508a(new C28923c.b(str, "StorageUsageDetailPresenter"));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("StorageUsageDetailPresenter", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Xp */
    public /* synthetic */ void m989Xp() {
        ((InterfaceC0674b) m103742Dp()).mo968EA(this.f2257y);
        this.f2248B = false;
        ((InterfaceC0674b) m103742Dp()).mo49315c4();
        ((InterfaceC0674b) m103742Dp()).mo969EH();
        ((InterfaceC0674b) m103742Dp()).mo59032jx(AbstractC8020f0.str_storage_usage_storage_cleared);
        ((InterfaceC0674b) m103742Dp()).mo973ml(this.f2257y, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Yp */
    public /* synthetic */ void m990Yp() {
        final long m74777O = this.f2257y.m74777O();
        long currentTimeMillis = System.currentTimeMillis();
        this.f2252t.m104442m(1);
        final String m74822z = this.f2257y.m74822z();
        C23288a.f113033a.mo13474a(new C18427b(m74822z, new Runnable() { // from class: ab0.h
            @Override // java.lang.Runnable
            public final void run() {
                C0685m.this.m988Wp(m74777O, m74822z);
            }
        }));
        C31747a.m152706e(this.f2257y, this.f2249C, this.f2250D, m74777O, false, this.f2251E, System.currentTimeMillis() - currentTimeMillis);
        this.f2247A = 0L;
        this.f2257y.m74792f();
        ((InterfaceC0674b) m103742Dp()).mo70710wy(new Runnable() { // from class: ab0.i
            @Override // java.lang.Runnable
            public final void run() {
                C0685m.this.m989Xp();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Zp */
    public /* synthetic */ void m991Zp() {
        this.f2248B = false;
        m997dq();
        ((InterfaceC0674b) m103742Dp()).mo59032jx(AbstractC8020f0.str_storage_delete_conversation_photo_video);
        ((InterfaceC0674b) m103742Dp()).mo49315c4();
        ((InterfaceC0674b) m103742Dp()).mo969EH();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aq */
    public /* synthetic */ void m992aq(ThreadStorageInfo threadStorageInfo) {
        InterfaceC0674b interfaceC0674b;
        Runnable runnable;
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.f2253u.m101508a(new C28923c.b(this.f2257y.m74822z(), "StorageUsageDetailPresenter", true, true, true));
                long m74776N = threadStorageInfo.m74776N();
                threadStorageInfo.m74790e();
                this.f2247A -= m74776N;
                this.f2252t.m104444o(m74776N);
                C23952g.m125345j("Tool Storage", " deleted media only from detail: " + m74776N + " bytes.");
                if (m103744Fp() != null && ((C13463a) m103744Fp()).m75477e().equals("storage_usage")) {
                    this.f2252t.m104450u();
                }
                C31747a.m152706e(threadStorageInfo, this.f2249C, this.f2250D, m74776N, true, this.f2251E, System.currentTimeMillis() - currentTimeMillis);
                interfaceC0674b = (InterfaceC0674b) m103742Dp();
                runnable = new Runnable() { // from class: ab0.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0685m.this.m991Zp();
                    }
                };
            } catch (Exception e11) {
                AbstractC23350e.m122776f("StorageUsageDetailPresenter", e11);
                interfaceC0674b = (InterfaceC0674b) m103742Dp();
                runnable = new Runnable() { // from class: ab0.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0685m.this.m991Zp();
                    }
                };
            }
            interfaceC0674b.mo70710wy(runnable);
        } catch (Throwable th2) {
            ((InterfaceC0674b) m103742Dp()).mo70710wy(new Runnable() { // from class: ab0.g
                @Override // java.lang.Runnable
                public final void run() {
                    C0685m.this.m991Zp();
                }
            });
            throw th2;
        }
    }

    /* renamed from: bq */
    private void m993bq() {
        ((InterfaceC0674b) m103742Dp()).mo70710wy(new Runnable() { // from class: ab0.c
            @Override // java.lang.Runnable
            public final void run() {
                C0685m.this.m986Sp();
            }
        });
        this.f2256x = AbstractC17930e.m94545d().mo94528b(new Runnable() { // from class: ab0.d
            @Override // java.lang.Runnable
            public final void run() {
                C0685m.this.m987Tp();
            }
        });
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: F2 */
    public void mo994F2() {
        super.mo994F2();
        Future future = this.f2255w;
        if (future != null && !future.isDone()) {
            this.f2255w.cancel(true);
        }
        Future future2 = this.f2254v;
        if (future2 != null && !future2.isDone()) {
            this.f2254v.cancel(true);
        }
        Future future3 = this.f2256x;
        if (future3 != null && !future3.isDone()) {
            this.f2256x.cancel(true);
        }
    }

    @Override // ab0.InterfaceC0673a
    /* renamed from: Lc */
    public void mo961Lc() {
        final ThreadStorageInfo threadStorageInfo = this.f2257y;
        if (threadStorageInfo == null || this.f2248B) {
            return;
        }
        this.f2248B = true;
        ((InterfaceC0674b) m103742Dp()).mo49282B8(AbstractC23136l9.m118743r0(AbstractC8020f0.PROCESSING), false);
        C31747a.m152714m(C31747a.a.f145821r, Collections.singletonList(threadStorageInfo), true);
        AbstractC23647d.m123897g("711234");
        C23288a.f113033a.mo13474a(new C18427b(this.f2257y.m74822z(), new Runnable() { // from class: ab0.f
            @Override // java.lang.Runnable
            public final void run() {
                C0685m.this.m992aq(threadStorageInfo);
            }
        }));
    }

    @Override // ab0.InterfaceC0673a
    /* renamed from: Ra */
    public ThreadStorageInfo mo962Ra() {
        return this.f2257y;
    }

    @Override // ab0.InterfaceC0673a
    /* renamed from: Tn */
    public void mo963Tn() {
        this.f2247A = 0L;
        ((InterfaceC0674b) m103742Dp()).mo968EA(this.f2257y);
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: cq, reason: merged with bridge method [inline-methods] */
    public void mo995Nd(C13463a c13463a, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(c13463a, interfaceC19968g);
        if (c13463a != null) {
            this.f2257y = c13463a.f68922c;
            this.f2258z = c13463a.f68923d;
            this.f2249C = c13463a.m75476d();
            this.f2250D = c13463a.m75475c();
            if (c13463a.m75477e().equals("csc_right_menu")) {
                this.f2251E = 1;
            }
        }
        if (this.f2257y == null) {
            if (TextUtils.isEmpty(this.f2258z)) {
                ((InterfaceC0674b) m103742Dp()).mo974nH();
                return;
            }
            m993bq();
        } else {
            ((InterfaceC0674b) m103742Dp()).mo976vv(this.f2257y);
            ((InterfaceC0674b) m103742Dp()).mo972b8(this.f2257y);
        }
        C31747a.m152711j(this.f2251E);
    }

    @Override // ab0.InterfaceC0673a
    /* renamed from: dh */
    public void mo964dh() {
        if (this.f2257y == null) {
            return;
        }
        ((InterfaceC0674b) m103742Dp()).mo975u7();
        AbstractC23647d.m123897g("711233");
    }

    /* renamed from: dq */
    public void m997dq() {
        if (this.f2257y == null) {
            return;
        }
        ((InterfaceC0674b) m103742Dp()).mo968EA(this.f2257y);
    }

    @Override // ab0.InterfaceC0673a
    /* renamed from: j6 */
    public void mo965j6() {
        ((InterfaceC0674b) m103742Dp()).mo969EH();
        AbstractC23647d.m123897g("711235");
    }

    @Override // ab0.InterfaceC0673a
    /* renamed from: k */
    public void mo966k() {
        ((InterfaceC0674b) m103742Dp()).mo976vv(this.f2257y);
    }

    @Override // ab0.InterfaceC0673a
    /* renamed from: rn */
    public void mo967rn() {
        if (!this.f2248B && this.f2257y != null) {
            this.f2248B = true;
            ((InterfaceC0674b) m103742Dp()).mo46829Y();
            C31747a.m152714m(C31747a.a.f145821r, Collections.singletonList(this.f2257y), false);
            AbstractC23647d.m123897g("711234");
            this.f2255w = AbstractC17930e.m94545d().mo94528b(new Runnable() { // from class: ab0.e
                @Override // java.lang.Runnable
                public final void run() {
                    C0685m.this.m990Yp();
                }
            });
        }
    }
}
