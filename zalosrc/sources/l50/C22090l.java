package l50;

import com.zing.zalo.common.C7853b;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionInCall;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionNoNetwork;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionRingtoneNotFound;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionRingtoneStreaming;
import fn0.AbstractC19074t;
import hu.AbstractC20130d;
import in.C20627a;
import in.InterfaceC20630d;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import k50.C21477e;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobKt;
import me0.C23055e5;
import on0.AbstractC24341v;
import p207he.C20024r;
import p509sp.C26356e;
import pm0.AbstractC24862s;
import pm0.C24861r;
import um0.C27317h;
import vg.AbstractC28054e7;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* renamed from: l50.l */
/* loaded from: classes5.dex */
public final class C22090l {

    /* renamed from: b */
    private static int f108733b;

    /* renamed from: c */
    private static int f108734c;

    /* renamed from: d */
    private static int f108735d;

    /* renamed from: a */
    public static final C22090l f108732a = new C22090l();

    /* renamed from: e */
    private static AtomicBoolean f108736e = new AtomicBoolean(false);

    /* renamed from: l50.l$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo115251a(int i11, int i12);

        /* renamed from: c */
        void mo115252c(Exception exc);

        /* renamed from: d */
        void mo115253d();

        void onPause();

        void onProgressChanged(int i11);
    }

    /* renamed from: l50.l$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC20630d {

        /* renamed from: a */
        final /* synthetic */ Continuation f108737a;

        /* renamed from: b */
        final /* synthetic */ File f108738b;

        /* renamed from: c */
        final /* synthetic */ C20627a f108739c;

        b(Continuation continuation, File file, C20627a c20627a) {
            this.f108737a = continuation;
            this.f108738b = file;
            this.f108739c = c20627a;
        }

        @Override // in.InterfaceC20630d
        /* renamed from: a */
        public void mo91783a(String str, boolean z11) {
            if (JobKt.m112760m(this.f108737a.getContext())) {
                C22090l c22090l = C22090l.f108732a;
                String m104821B = AbstractC20130d.m104821B();
                AbstractC19074t.m100207e(m104821B, "getCallRingtoneStorageDirectory(...)");
                c22090l.m115257f(m104821B, this.f108738b);
                Continuation continuation = this.f108737a;
                C24861r.a aVar = C24861r.f119264q;
                if (str == null) {
                    str = "";
                }
                continuation.mo112492g(C24861r.m129218b(str));
            }
        }

        @Override // in.InterfaceC20630d
        /* renamed from: b */
        public void mo91784b(int i11, boolean z11) {
            Throwable exc;
            if (JobKt.m112760m(this.f108737a.getContext())) {
                Continuation continuation = this.f108737a;
                C24861r.a aVar = C24861r.f119264q;
                if (i11 == 1001) {
                    exc = ExceptionRingtoneNotFound.f56347p;
                } else {
                    exc = new Exception();
                }
                continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(exc)));
            }
        }

        @Override // in.InterfaceC20630d
        /* renamed from: c */
        public void mo91785c(long j11, String str) {
            if (!JobKt.m112760m(this.f108737a.getContext())) {
                this.f108739c.mo107421i(true);
            }
        }
    }

    /* renamed from: l50.l$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC28054e7 {

        /* renamed from: a */
        final /* synthetic */ boolean f108740a;

        /* renamed from: b */
        final /* synthetic */ boolean f108741b;

        /* renamed from: c */
        final /* synthetic */ C21477e f108742c;

        /* renamed from: d */
        final /* synthetic */ a f108743d;

        c(boolean z11, boolean z12, C21477e c21477e, a aVar) {
            this.f108740a = z11;
            this.f108741b = z12;
            this.f108742c = c21477e;
            this.f108743d = aVar;
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: a */
        public void mo16496a(int i11) {
            a aVar = this.f108743d;
            if (aVar != null) {
                aVar.mo115252c(ExceptionRingtoneStreaming.f56348p);
            }
            C22090l c22090l = C22090l.f108732a;
            c22090l.m115260u(false);
            c22090l.m115268k().set(false);
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: c */
        public void mo16497c() {
            try {
                if (!this.f108740a) {
                    if (this.f108741b) {
                        C22090l.f108732a.m115269l();
                    } else {
                        C22090l.f108732a.m115264g();
                    }
                } else {
                    C22090l.f108732a.m115262d();
                }
                this.f108742c.m111096d(C7853b.Companion.m40150a().m40112W());
                C22090l c22090l = C22090l.f108732a;
                c22090l.m115272q(this.f108742c.m111093a());
                c22090l.m115261w();
                a aVar = this.f108743d;
                if (aVar != null) {
                    aVar.mo115253d();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: e */
        public void mo16498e() {
            super.mo16498e();
            a aVar = this.f108743d;
            if (aVar != null) {
                aVar.onPause();
            }
            C22090l.f108732a.m115268k().set(false);
        }
    }

    /* renamed from: l50.l$d */
    /* loaded from: classes5.dex */
    public static final class d implements C7853b.d {

        /* renamed from: a */
        final /* synthetic */ C21477e f108744a;

        /* renamed from: b */
        final /* synthetic */ a f108745b;

        d(C21477e c21477e, a aVar) {
            this.f108744a = c21477e;
            this.f108745b = aVar;
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: a */
        public void mo40156a(String str, int i11) {
            if (AbstractC19074t.m100204b(this.f108744a.m111095c(), str)) {
                C22090l c22090l = C22090l.f108732a;
                if (c22090l.m115266i() != i11) {
                    c22090l.m115274s(i11);
                    a aVar = this.f108745b;
                    if (aVar != null) {
                        aVar.onProgressChanged(c22090l.m115266i());
                    }
                }
            }
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: b */
        public void mo40157b(String str, String str2) {
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: c */
        public void mo40158c(String str, int i11) {
            C22090l c22090l = C22090l.f108732a;
            c22090l.m115273r(i11);
            a aVar = this.f108745b;
            if (aVar != null) {
                aVar.mo115251a(c22090l.m115265h(), this.f108744a.m111093a());
            }
        }

        @Override // com.zing.zalo.common.C7853b.d
        public void onAudioFocusChange(int i11) {
        }
    }

    private C22090l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m115257f(String str, File file) {
        File[] listFiles;
        try {
            File file2 = new File(str);
            if (file2.isDirectory() && (listFiles = file2.listFiles()) != null) {
                for (File file3 : listFiles) {
                    if (!file3.getName().equals(file.getName())) {
                        file3.delete();
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    private final void m115258n(C21477e c21477e, boolean z11, boolean z12, int i11, a aVar) {
        try {
            C7853b.a aVar2 = C7853b.Companion;
            aVar2.m40150a().m40108T0();
            aVar2.m40150a().m40136j1();
            f108735d = i11;
            f108736e.set(true);
            aVar2.m40150a().m40094E0(c21477e.m111095c(), i11, new c(z12, z11, c21477e, aVar), true, true);
            aVar2.m40150a().m40127f1(new d(c21477e, aVar));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    private final void m115259p(int i11) {
        C7853b.a aVar = C7853b.Companion;
        if (!aVar.m40150a().m40140m0()) {
            aVar.m40150a().m40116Y0(i11);
        }
        f108735d = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m115260u(boolean z11) {
        try {
            C7853b.a aVar = C7853b.Companion;
            if (!aVar.m40150a().m40137k0()) {
                if (aVar.m40150a().m40140m0()) {
                }
            }
            if (z11 && C26356e.f125201a.m135680e()) {
                aVar.m40150a().m40106S0();
                aVar.m40150a().m40147s0(false);
            } else {
                aVar.m40150a().m40136j1();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final void m115261w() {
        if (f108735d != C7853b.Companion.m40150a().m40117Z()) {
            m115259p(f108735d);
        }
    }

    /* renamed from: d */
    public final void m115262d() {
        try {
            C7853b.a aVar = C7853b.Companion;
            aVar.m40150a().m40108T0();
            aVar.m40150a().m40106S0();
            aVar.m40150a().m40134i1(0.0f, 0.0f);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public final Object m115263e(C21477e c21477e, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNoNetwork.f56345p)));
        } else {
            File file = new File(AbstractC20130d.m104821B(), c21477e.m111094b() + ".m4a");
            C20627a c20627a = new C20627a(false);
            c20627a.m107416d0(false);
            c20627a.m107420h0(file.getAbsolutePath());
            c20627a.m107419g0(new b(c27317h, file, c20627a));
            c20627a.m107488m(c21477e.m111095c());
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: g */
    public final void m115264g() {
        try {
            C7853b.Companion.m40150a().m40134i1(1.0f, 1.0f);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public final int m115265h() {
        return f108735d;
    }

    /* renamed from: i */
    public final int m115266i() {
        return f108734c;
    }

    /* renamed from: j */
    public final boolean m115267j(String str) {
        AbstractC19074t.m100208f(str, "path");
        try {
            return new File(str).exists();
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: k */
    public final AtomicBoolean m115268k() {
        return f108736e;
    }

    /* renamed from: l */
    public final void m115269l() {
        try {
            C7853b.Companion.m40150a().m40146r0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public final void m115270m(C21477e c21477e, boolean z11, boolean z12, int i11, a aVar) {
        boolean m127128x;
        AbstractC19074t.m100208f(c21477e, "songToPlay");
        m127128x = AbstractC24341v.m127128x(c21477e.m111095c());
        if (m127128x) {
            if (aVar != null) {
                aVar.mo115252c(ExceptionRingtoneStreaming.f56348p);
            }
        } else if (!C20024r.m103941j() && !C7853b.Companion.m40150a().m40133i0()) {
            m115271o();
            m115258n(c21477e, z11, z12, i11, aVar);
        } else if (aVar != null) {
            aVar.mo115252c(ExceptionInCall.f56343p);
        }
    }

    /* renamed from: o */
    public final void m115271o() {
        m115260u(false);
        f108734c = 0;
        f108735d = 0;
    }

    /* renamed from: q */
    public final void m115272q(int i11) {
        f108733b = i11;
    }

    /* renamed from: r */
    public final void m115273r(int i11) {
        f108735d = i11;
    }

    /* renamed from: s */
    public final void m115274s(int i11) {
        f108734c = i11;
    }

    /* renamed from: t */
    public final void m115275t(boolean z11) {
        m115260u(z11);
    }

    /* renamed from: v */
    public final void m115276v(C21477e c21477e, boolean z11, boolean z12, int i11, a aVar) {
        boolean m127128x;
        AbstractC19074t.m100208f(c21477e, "songToPlay");
        m127128x = AbstractC24341v.m127128x(c21477e.m111095c());
        if (m127128x) {
            if (aVar != null) {
                aVar.mo115252c(ExceptionRingtoneStreaming.f56348p);
            }
        } else if (!C23055e5.m118273h(false, 1, null)) {
            if (aVar != null) {
                aVar.mo115252c(ExceptionNoNetwork.f56345p);
            }
        } else if (!C20024r.m103941j() && !C7853b.Companion.m40150a().m40133i0()) {
            m115271o();
            m115258n(c21477e, z11, z12, i11, aVar);
        } else if (aVar != null) {
            aVar.mo115252c(ExceptionInCall.f56343p);
        }
    }
}
