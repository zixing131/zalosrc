package p164fn;

import ag0.AbstractC0837p0;
import android.text.TextUtils;
import ce0.C3449d;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import hu.AbstractC20130d;
import in.C20629c;
import in.InterfaceC20633g;
import java.io.File;
import java.io.IOException;
import me0.AbstractC23227u1;
import me0.AbstractC23238v2;
import me0.AbstractC23280z4;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import p164fn.AbstractC19037k;
import p239ih.C20556f;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;

/* renamed from: fn.k */
/* loaded from: classes3.dex */
public abstract class AbstractC19037k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fn.k$a */
    /* loaded from: classes3.dex */
    public class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ e f94888l1;

        /* renamed from: m1 */
        final /* synthetic */ C23528a f94889m1;

        a(e eVar, C23528a c23528a) {
            this.f94888l1 = eVar;
            this.f94889m1 = c23528a;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            int i11;
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (this.f94888l1.f94902h != null) {
                File m123603i = this.f94889m1.m123603i(str);
                if (m123603i != null && m123603i.exists() && m123603i.length() > 0) {
                    if (this.f94888l1.m100145g()) {
                        AbstractC19037k.m100137w(this.f94888l1, m123603i.getAbsolutePath());
                        return;
                    } else {
                        AbstractC19037k.m100136v(this.f94888l1, m123603i);
                        return;
                    }
                }
                e eVar = this.f94888l1;
                if (c23995f.m125657h() == -10002) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                AbstractC19037k.m100133s(eVar, i11);
            }
        }
    }

    /* renamed from: fn.k$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC20633g {

        /* renamed from: a */
        final /* synthetic */ e f94890a;

        /* renamed from: b */
        final /* synthetic */ SensitiveData f94891b;

        b(e eVar, SensitiveData sensitiveData) {
            this.f94890a = eVar;
            this.f94891b = sensitiveData;
        }

        @Override // in.InterfaceC20633g
        /* renamed from: a */
        public void mo62757a(String str, long j11) {
            AbstractC19037k.m100132r(this.f94890a, j11);
        }

        @Override // in.InterfaceC20633g
        /* renamed from: b */
        public void mo62758b(String str, int i11) {
            int i12;
            e eVar = this.f94890a;
            if (i11 == 5) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            AbstractC19037k.m100133s(eVar, i12);
        }

        @Override // in.InterfaceC20633g
        /* renamed from: c */
        public void mo62759c(String str, String str2, boolean z11) {
            AbstractC19037k.m100135u(this.f94890a, str2, false, this.f94891b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fn.k$c */
    /* loaded from: classes3.dex */
    public class c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ e f94892l1;

        /* renamed from: m1 */
        final /* synthetic */ C23528a f94893m1;

        c(e eVar, C23528a c23528a) {
            this.f94892l1 = eVar;
            this.f94893m1 = c23528a;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            int i11;
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (this.f94892l1.f94902h != null) {
                File m123603i = this.f94893m1.m123603i(str);
                if (m123603i != null && m123603i.exists() && m123603i.length() > 0) {
                    if (this.f94892l1.m100145g()) {
                        AbstractC19037k.m100137w(this.f94892l1, m123603i.getAbsolutePath());
                        return;
                    } else {
                        AbstractC19037k.m100136v(this.f94892l1, m123603i);
                        return;
                    }
                }
                e eVar = this.f94892l1;
                if (c23995f.m125657h() == -10002) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                AbstractC19037k.m100133s(eVar, i11);
            }
        }
    }

    /* renamed from: fn.k$d */
    /* loaded from: classes3.dex */
    public static class d extends e {

        /* renamed from: i */
        String f94894i;

        private d() {
        }

        /* renamed from: h */
        public static d m100138h(C17391z c17391z, boolean z11, String str, f fVar) {
            d dVar = new d();
            dVar.f94895a = 2;
            dVar.f94899e = c17391z;
            dVar.f94896b = c17391z.f88620c;
            dVar.f94897c = z11;
            dVar.f94902h = fVar;
            dVar.f94894i = str;
            return dVar;
        }

        @Override // p164fn.AbstractC19037k.e
        /* renamed from: f */
        protected String mo100139f() {
            if (!TextUtils.isEmpty(this.f94894i)) {
                return this.f94894i;
            }
            return super.mo100139f();
        }
    }

    /* renamed from: fn.k$e */
    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a */
        protected int f94895a;

        /* renamed from: b */
        protected String f94896b;

        /* renamed from: c */
        protected boolean f94897c;

        /* renamed from: e */
        protected C17391z f94899e;

        /* renamed from: g */
        public C23999j f94901g;

        /* renamed from: h */
        protected f f94902h;

        /* renamed from: d */
        public String f94898d = "";

        /* renamed from: f */
        public long f94900f = 0;

        /* renamed from: b */
        public static e m100140b(String str, boolean z11, f fVar) {
            e eVar = new e();
            eVar.f94895a = 1;
            eVar.f94896b = str;
            eVar.f94897c = z11;
            eVar.f94902h = fVar;
            return eVar;
        }

        /* renamed from: d */
        public static e m100141d(C17391z c17391z, boolean z11, f fVar) {
            e eVar = new e();
            eVar.f94895a = 2;
            eVar.f94899e = c17391z;
            eVar.f94896b = c17391z.f88620c;
            eVar.f94897c = z11;
            eVar.f94902h = fVar;
            return eVar;
        }

        /* renamed from: a */
        protected File m100142a() {
            return new File(AbstractC20130d.m104874i0() + AbstractC23352g.m122788d(this.f94896b) + ".jpg");
        }

        /* renamed from: c */
        protected File m100143c() {
            return AbstractC20130d.m104904x0();
        }

        /* renamed from: e */
        protected String m100144e() {
            return AbstractC23352g.m122788d(this.f94896b) + ".mp4";
        }

        /* renamed from: f */
        protected String mo100139f() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("VIDEO_DOWNLOAD_");
            sb2.append(System.currentTimeMillis());
            C17391z c17391z = this.f94899e;
            if (c17391z != null && !TextUtils.isEmpty(c17391z.f88635r)) {
                str = "." + this.f94899e.f88635r;
            } else {
                str = ".mp4";
            }
            sb2.append(str);
            return sb2.toString();
        }

        /* renamed from: g */
        protected boolean m100145g() {
            return this.f94897c;
        }
    }

    /* renamed from: fn.k$f */
    /* loaded from: classes3.dex */
    public interface f {
        /* renamed from: a */
        void mo463a(e eVar, long j11);

        /* renamed from: b */
        void mo464b(boolean z11, e eVar, int i11);
    }

    /* renamed from: h */
    public static void m100122h(e eVar) {
        C23999j c23999j = eVar.f94901g;
        if (c23999j != null && !c23999j.m125588F0()) {
            eVar.f94901g.m125586E();
        }
    }

    /* renamed from: i */
    public static void m100123i(e eVar, C23528a c23528a) {
        eVar.f94895a = 1;
        File m123603i = c23528a.m123603i(eVar.f94896b);
        if (m123603i != null && m123603i.exists() && m123603i.length() > 0) {
            if (eVar.m100145g()) {
                m100137w(eVar, m123603i.getAbsolutePath());
                return;
            } else {
                m100136v(eVar, m123603i);
                return;
            }
        }
        C3977j c3977j = new C3977j(MainApplication.getAppContext());
        c cVar = new c(eVar, c23528a);
        eVar.f94901g = cVar;
        ((C23528a) c23528a.m123612r(c3977j)).m123584H(eVar.f94896b, false, true, 0, 0, cVar);
    }

    /* renamed from: j */
    public static void m100124j(e eVar, boolean z11) {
        eVar.f94895a = 1;
        if (z11) {
            if (eVar.m100145g()) {
                m100137w(eVar, eVar.f94896b);
                return;
            } else {
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: fn.h
                    public /* synthetic */ RunnableC19034h() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC19037k.m100127m(AbstractC19037k.e.this);
                    }
                });
                return;
            }
        }
        C23528a c23528a = new C23528a(MainApplication.getAppContext());
        File m123603i = c23528a.m123603i(eVar.f94896b);
        if (m123603i != null && m123603i.exists() && m123603i.length() > 0) {
            if (eVar.m100145g()) {
                m100137w(eVar, m123603i.getAbsolutePath());
                return;
            } else {
                m100136v(eVar, m123603i);
                return;
            }
        }
        ((C23528a) c23528a.m123612r(new C3977j(MainApplication.getAppContext()))).m123584H(eVar.f94896b, false, true, 0, 0, new a(eVar, c23528a));
    }

    /* renamed from: k */
    public static void m100125k(e eVar, boolean z11, SensitiveData sensitiveData) {
        C17391z c17391z = eVar.f94899e;
        if (c17391z != null && !TextUtils.isEmpty(c17391z.f88620c)) {
            eVar.f94895a = 2;
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: fn.g

                /* renamed from: q */
                public final /* synthetic */ boolean f94881q;

                /* renamed from: r */
                public final /* synthetic */ String f94882r;

                /* renamed from: s */
                public final /* synthetic */ SensitiveData f94883s;

                public /* synthetic */ RunnableC19033g(boolean z112, String str, SensitiveData sensitiveData2) {
                    r2 = z112;
                    r3 = str;
                    r4 = sensitiveData2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC19037k.m100128n(AbstractC19037k.e.this, r2, r3, r4);
                }
            });
            return;
        }
        m100133s(eVar, -1);
    }

    /* renamed from: l */
    private static String m100126l(String str) {
        return "VIDEO_DOWNLOAD_" + str + "_" + System.currentTimeMillis() + ".mp4";
    }

    /* renamed from: m */
    public static /* synthetic */ void m100127m(e eVar) {
        eVar.f94898d = eVar.f94896b;
        m100134t(eVar);
    }

    /* renamed from: n */
    public static /* synthetic */ void m100128n(e eVar, boolean z11, String str, SensitiveData sensitiveData) {
        int i11 = -1;
        try {
            String path = eVar.m100143c().getPath();
            String m100144e = eVar.m100144e();
            if (z11) {
                C20556f c20556f = new C20556f(str);
                if (c20556f.m106830b() && c20556f.m106845r() > 0) {
                    m100135u(eVar, str, true, sensitiveData);
                    return;
                } else {
                    m100133s(eVar, -1);
                    return;
                }
            }
            File file = new File(path, m100144e);
            if (eVar.f94895a == 2) {
                ZMediaPlayerSettings.VideoConfig videoConfig = ZMediaPlayerSettings.getVideoConfig(0);
                ZMediaPlayerSettings.VideoConfig videoConfig2 = ZMediaPlayerSettings.getVideoConfig(0);
                if ((ZMediaPlayer.cloneVideoFromCache(videoConfig, ZMediaPlayerSettings.getCacheDir(videoConfig.getPlayerSection()), str, file.getAbsolutePath()) || ZMediaPlayer.cloneVideoFromCache(videoConfig2, ZMediaPlayerSettings.getCacheDir(videoConfig2.getPlayerSection()), str, file.getAbsolutePath())) && file.exists() && file.length() > 0) {
                    m100135u(eVar, file.getAbsolutePath(), false, sensitiveData);
                    return;
                }
            }
            C20629c.m107448k().m107458r(str, file.getAbsolutePath(), "MediaDownloader-" + m100144e, new b(eVar, sensitiveData), false, "");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            if (AbstractC23227u1.m119701a(e11) || ((e11 instanceof IOException) && !AbstractC23238v2.m119726k())) {
                i11 = 1;
            }
            m100133s(eVar, i11);
        }
    }

    /* renamed from: o */
    public static /* synthetic */ void m100129o(e eVar, File file) {
        int i11;
        try {
            File m100142a = eVar.m100142a();
            if (m100142a.exists()) {
                if (m100142a.length() <= 0) {
                }
                eVar.f94898d = m100142a.getAbsolutePath();
                m100134t(eVar);
            }
            AbstractC23238v2.m119717b(file, m100142a);
            eVar.f94898d = m100142a.getAbsolutePath();
            m100134t(eVar);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            if (!AbstractC23227u1.m119701a(e11) && (!(e11 instanceof IOException) || AbstractC23238v2.m119726k())) {
                i11 = -1;
            } else {
                i11 = 1;
            }
            m100133s(eVar, i11);
        }
    }

    /* renamed from: q */
    public static void m100131q(e eVar, C3449d.e eVar2) {
        if (!TextUtils.isEmpty(eVar2.m17363b())) {
            eVar.f94898d = eVar2.m17363b();
            m100134t(eVar);
        } else if (eVar2.m17362a() == 78001) {
            MainApplication.m35468b0();
            m100133s(eVar, -1);
        } else {
            m100133s(eVar, -1);
        }
    }

    /* renamed from: r */
    public static void m100132r(e eVar, long j11) {
        f fVar = eVar.f94902h;
        if (fVar != null) {
            eVar.f94900f = j11;
            fVar.mo463a(eVar, j11);
        }
    }

    /* renamed from: s */
    public static void m100133s(e eVar, int i11) {
        f fVar = eVar.f94902h;
        if (fVar != null) {
            fVar.mo464b(false, eVar, i11);
        }
    }

    /* renamed from: t */
    private static void m100134t(e eVar) {
        f fVar = eVar.f94902h;
        if (fVar != null) {
            fVar.mo464b(true, eVar, 0);
        }
    }

    /* renamed from: u */
    public static void m100135u(e eVar, String str, boolean z11, SensitiveData sensitiveData) {
        String mo100139f;
        try {
            if (eVar.m100145g()) {
                if (z11) {
                    mo100139f = m100126l(eVar.f94899e.f88618a);
                } else {
                    mo100139f = eVar.mo100139f();
                }
                String m120305Q = AbstractC23280z4.m120305Q(str, mo100139f, 0L, z11, false, sensitiveData);
                if (!TextUtils.isEmpty(m120305Q)) {
                    str = m120305Q;
                }
            }
            eVar.f94898d = str;
            m100134t(eVar);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            m100133s(eVar, -1);
        }
    }

    /* renamed from: v */
    static void m100136v(e eVar, File file) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: fn.j

            /* renamed from: q */
            public final /* synthetic */ File f94887q;

            public /* synthetic */ RunnableC19036j(File file2) {
                r2 = file2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC19037k.m100129o(AbstractC19037k.e.this, r2);
            }
        });
    }

    /* renamed from: w */
    static void m100137w(e eVar, String str) {
        try {
            new C3449d().m17353g(new C3449d.d(str), new C3449d.a() { // from class: fn.i
                public /* synthetic */ C19035i() {
                }

                @Override // ce0.C3449d.a
                /* renamed from: a */
                public final void mo17354a(C3449d.e eVar2) {
                    AbstractC19037k.m100131q(AbstractC19037k.e.this, eVar2);
                }
            });
        } catch (Exception unused) {
            m100133s(eVar, -1);
        } catch (OutOfMemoryError unused2) {
            MainApplication.m35468b0();
            m100133s(eVar, -1);
        }
    }
}
