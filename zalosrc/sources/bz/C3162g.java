package bz;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import bz.AbstractC3156a;
import com.zing.zalo.common.C7853b;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hu.C20131e;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23041d2;
import me0.AbstractC23057e7;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p405ov.C24559a;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import p716zh.AbstractC32201z4;
import pm0.C24848g0;

/* renamed from: bz.g */
/* loaded from: classes4.dex */
public final class C3162g implements AbstractC3156a.a {

    /* renamed from: c */
    private static boolean f13365c;

    /* renamed from: e */
    private static InterfaceC3163h f13367e;

    /* renamed from: f */
    private static long f13368f;

    /* renamed from: g */
    private static int f13369g;

    /* renamed from: i */
    private static C29234i f13371i;

    /* renamed from: j */
    private static final InterfaceC29232g f13372j;

    /* renamed from: k */
    private static volatile boolean f13373k;

    /* renamed from: a */
    public static final C3162g f13363a = new C3162g();

    /* renamed from: b */
    private static final Handler f13364b = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private static String f13366d = "";

    /* renamed from: h */
    private static final AtomicBoolean f13370h = new AtomicBoolean(true);

    /* renamed from: bz.g$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ byte[] f13374q;

        /* renamed from: r */
        final /* synthetic */ boolean f13375r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(byte[] bArr, boolean z11) {
            super(0);
            this.f13374q = bArr;
            this.f13375r = z11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m15940a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m15940a() {
            int length = this.f13374q.length;
            boolean z11 = this.f13375r;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onAudioDataReady ");
            sb2.append(length);
            sb2.append(" bytes, last chunk: ");
            sb2.append(z11);
            InterfaceC3163h interfaceC3163h = C3162g.f13367e;
            if (interfaceC3163h != null) {
                interfaceC3163h.mo15928a(this.f13374q, this.f13375r);
            }
        }
    }

    /* renamed from: bz.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f13376q;

        /* renamed from: r */
        final /* synthetic */ int f13377r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, int i11) {
            super(0);
            this.f13376q = str;
            this.f13377r = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m15941a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m15941a() {
            InterfaceC3163h interfaceC3163h = C3162g.f13367e;
            if (interfaceC3163h != null) {
                interfaceC3163h.mo15930e(this.f13376q, this.f13377r);
            }
            C3162g.f13367e = null;
        }
    }

    /* renamed from: bz.g$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ int f13378q;

        /* renamed from: r */
        final /* synthetic */ Exception f13379r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, Exception exc) {
            super(0);
            this.f13378q = i11;
            this.f13379r = exc;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m15942a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m15942a() {
            C3162g.f13363a.m15925D("");
            C3162g.f13365c = false;
            InterfaceC3163h interfaceC3163h = C3162g.f13367e;
            if (interfaceC3163h != null) {
                interfaceC3163h.mo15931f(this.f13378q, this.f13379r);
            }
            C3162g.f13367e = null;
        }
    }

    /* renamed from: bz.g$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f13380q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m15943a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m15943a() {
            C3162g.f13369g = 0;
            C3162g.f13368f = C3162g.f13363a.m15923s();
            InterfaceC3163h interfaceC3163h = C3162g.f13367e;
            if (interfaceC3163h != null) {
                interfaceC3163h.mo15932h();
            }
        }
    }

    /* renamed from: bz.g$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f13381q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AbstractC3156a mo12V4() {
            AbstractC3156a c3160e;
            if (C3162g.f13370h.get()) {
                c3160e = new C3158c();
            } else {
                c3160e = new C3160e();
            }
            c3160e.m15890h(C3162g.f13363a);
            return c3160e;
        }
    }

    /* renamed from: bz.g$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ int f13382q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i11) {
            super(0);
            this.f13382q = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m15945a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m15945a() {
            C3162g.f13369g = Math.max(C3162g.f13369g, this.f13382q);
            InterfaceC3163h interfaceC3163h = C3162g.f13367e;
            if (interfaceC3163h != null) {
                interfaceC3163h.mo15929b(this.f13382q);
            }
        }
    }

    static {
        C29234i m145994a = AbstractC29235j.m145994a();
        f13371i = m145994a;
        f13372j = AbstractC29233h.m145991b(m145994a, e.f13381q);
        f13373k = true;
    }

    private C3162g() {
    }

    /* renamed from: A */
    public static /* synthetic */ void m15911A(C3162g c3162g, Exception exc, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        c3162g.m15939z(exc, j11);
    }

    /* renamed from: B */
    private final void m15912B(InterfaceC18494a interfaceC18494a) {
        f13364b.post(new Runnable() { // from class: bz.f
            public /* synthetic */ RunnableC3161f() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3162g.m15913C(InterfaceC18494a.this);
            }
        });
    }

    /* renamed from: C */
    public static final void m15913C(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "$r");
        try {
            interfaceC18494a.mo12V4();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("VoiceRecordController", e11);
        }
    }

    /* renamed from: s */
    public final long m15923s() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: w */
    private final AbstractC3156a m15924w() {
        return (AbstractC3156a) f13372j.getValue();
    }

    /* renamed from: D */
    public void m15925D(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        f13366d = str;
    }

    /* renamed from: E */
    public final void m15926E(String str, InterfaceC3163h interfaceC3163h) {
        boolean m127125u;
        boolean m127125u2;
        AbstractC19074t.m100208f(str, "outPath");
        try {
            boolean z11 = false;
            m127125u = AbstractC24341v.m127125u(str, ".aac", false, 2, null);
            if (!m127125u) {
                m127125u2 = AbstractC24341v.m127125u(str, ".m4a", false, 2, null);
                if (m127125u2) {
                }
                f13373k = z11;
                f13367e = interfaceC3163h;
                f13365c = true;
                m15925D(str);
                m15924w().mo15891i();
                boolean m15937x = m15937x();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("startRecording continuous:");
                sb2.append(m15937x);
            }
            z11 = true;
            f13373k = z11;
            f13367e = interfaceC3163h;
            f13365c = true;
            m15925D(str);
            m15924w().mo15891i();
            boolean m15937x2 = m15937x();
            StringBuilder sb22 = new StringBuilder();
            sb22.append("startRecording continuous:");
            sb22.append(m15937x2);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("VoiceRecordController", e11);
        }
    }

    /* renamed from: F */
    public final void m15927F() {
        try {
            if (f13365c) {
                f13365c = false;
                m15924w().mo15892j();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("VoiceRecordController", e11);
        }
    }

    @Override // bz.InterfaceC3163h
    /* renamed from: a */
    public void mo15928a(byte[] bArr, boolean z11) {
        AbstractC19074t.m100208f(bArr, "encodedData");
        m15912B(new a(bArr, z11));
    }

    @Override // bz.InterfaceC3163h
    /* renamed from: b */
    public void mo15929b(int i11) {
        m15912B(new f(i11));
    }

    @Override // bz.AbstractC3156a.a
    /* renamed from: c */
    public void mo15894c() {
        String mo15895d = mo15895d();
        int m40125e0 = C7853b.Companion.m40150a().m40125e0(mo15895d);
        m15912B(new b(mo15895d, m40125e0));
        if (f13369g <= 50 && m40125e0 > 1000) {
            AbstractC23350e.m122776f("VoiceRecordController", new Exception("Record with quiet voice: " + mo15895d() + ", duration " + m40125e0 + ", max amp " + f13369g));
        }
    }

    @Override // bz.AbstractC3156a.a
    /* renamed from: d */
    public String mo15895d() {
        return f13366d;
    }

    @Override // bz.InterfaceC3163h
    /* renamed from: e */
    public void mo15930e(String str, int i11) {
        AbstractC19074t.m100208f(str, "outFile");
        mo15894c();
    }

    @Override // bz.InterfaceC3163h
    /* renamed from: f */
    public void mo15931f(int i11, Exception exc) {
        boolean z11;
        String str;
        String mo15895d = mo15895d();
        try {
            if ((exc instanceof FileNotFoundException) && !AbstractC23041d2.m118194A(m15935u())) {
                C20131e.f99303a.m104976u0();
                z11 = false;
            } else {
                z11 = true;
            }
            AbstractC23041d2.m118208g(mo15895d);
            long m15923s = m15923s() - f13368f;
            if (i11 == -2 && m15923s < 1000) {
                z11 = false;
            }
            if (z11) {
                AtomicBoolean atomicBoolean = f13370h;
                if (atomicBoolean.get()) {
                    C24559a.m127933c("VoiceRecordController", "Fallback Stock recorder");
                    atomicBoolean.set(false);
                }
            }
            m15924w().mo15886d();
            f13371i.m145993b();
            if (z11) {
                m15939z(exc, m15923s);
            }
            String mo15895d2 = mo15895d();
            if (exc != null) {
                str = exc.getMessage();
            } else {
                str = null;
            }
            C24559a.m127933c("VoiceRecordController", "Record error: " + mo15895d2 + ", duration=" + m15923s + ", error: " + i11 + ", exception: " + str);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("VoiceRecordController", e11);
        }
        m15912B(new c(i11, exc));
    }

    @Override // bz.AbstractC3156a.a
    /* renamed from: g */
    public boolean mo15896g() {
        return f13373k;
    }

    @Override // bz.InterfaceC3163h
    /* renamed from: h */
    public void mo15932h() {
        m15912B(d.f13380q);
    }

    /* renamed from: r */
    public final void m15933r() {
        try {
            f13367e = null;
            if (f13365c) {
                f13365c = false;
                m15924w().mo15886d();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("VoiceRecordController", e11);
        }
    }

    /* renamed from: t */
    public final String m15934t(boolean z11) {
        String m15935u = m15935u();
        String m155243d = AbstractC32201z4.m155243d(System.currentTimeMillis());
        AbstractC19074t.m100207e(m155243d, "getChatVoiceFileNameWithRandomCharacters(...)");
        if (z11 && AbstractC23057e7.m118301h()) {
            if (m15937x()) {
                return m15935u + m155243d + ".aac";
            }
            return m15935u + m155243d + ".m4a";
        }
        return m15935u + m155243d + ".amr";
    }

    /* renamed from: u */
    public final String m15935u() {
        return C20131e.f99303a.m104956h0();
    }

    /* renamed from: v */
    public final long m15936v() {
        if (f13365c) {
            return m15923s() - f13368f;
        }
        return 0L;
    }

    /* renamed from: x */
    public final boolean m15937x() {
        return m15924w() instanceof C3158c;
    }

    /* renamed from: y */
    public final boolean m15938y() {
        return f13365c;
    }

    /* renamed from: z */
    public final void m15939z(Exception exc, long j11) {
        try {
            AbstractC23350e.m122776f("VoiceRecordController", new Exception("Record voice message failed: isRecordContinuous=" + m15937x() + ", isUsingAAC=" + mo15896g() + ", duration=" + j11, exc));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("VoiceRecordController", e11);
        }
    }
}
