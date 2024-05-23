package p716zh;

import ag0.AbstractC0837p0;
import android.os.Build;
import android.text.TextUtils;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fi.C18943a;
import fi.C18953k;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.C19636i1;
import java.util.Calendar;
import p019aj.C0872f;
import p020ak.C0885d;
import p056cj.C3535c;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p716zh.C32190y7;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: zh.eb */
/* loaded from: classes3.dex */
public final class C31904eb {
    public static final b Companion = new b(null);

    /* renamed from: f */
    private static final InterfaceC24854k f146589f;

    /* renamed from: a */
    public int f146590a;

    /* renamed from: b */
    private boolean f146591b;

    /* renamed from: c */
    private C18943a f146592c;

    /* renamed from: d */
    private C0885d f146593d;

    /* renamed from: e */
    private final C0872f f146594e;

    /* renamed from: zh.eb$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f146595q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C31904eb mo12V4() {
            return c.f146596a.m153367a();
        }
    }

    /* renamed from: zh.eb$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C31904eb m153366a() {
            return (C31904eb) C31904eb.f146589f.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zh.eb$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f146596a = new c();

        /* renamed from: b */
        private static final C31904eb f146597b = new C31904eb(null);

        private c() {
        }

        /* renamed from: a */
        public final C31904eb m153367a() {
            return f146597b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f146595q);
        f146589f = m129210a;
    }

    public /* synthetic */ C31904eb(AbstractC19060k abstractC19060k) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m153352d(C31904eb c31904eb, int i11) {
        AbstractC19074t.m100208f(c31904eb, "this$0");
        c31904eb.f146590a = 0;
        c31904eb.m153353e(i11);
        c31904eb.f146591b = false;
    }

    /* renamed from: e */
    private final void m153353e(int i11) {
        int i12;
        if (i11 != 0 && i11 <= 7) {
            int i13 = 1;
            while (true) {
                i12 = i11 & i13;
                if (i12 != 0) {
                    break;
                } else {
                    i13 <<= 1;
                }
            }
            if (i12 == 1) {
                i13 = m153360n(i11, i13);
                m153356h();
            }
            if ((i11 & i13) == 2) {
                i13 = m153360n(i11, i13);
                m153355g();
            }
            if ((i11 & i13) == 4) {
                m153360n(i11, i13);
                m153354f();
            }
        }
    }

    /* renamed from: f */
    private final void m153354f() {
        String str;
        C18943a c18943a = this.f146592c;
        if (c18943a != null) {
            str = m153358j(c18943a.m99263b(), c18943a.m99264c(), c18943a.m99262a(), C19636i1.Companion.m102800a().m102746E(c18943a.m99263b().m17944I0()), c18943a.m99265d(), c18943a.m99266e());
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            int i11 = this.f146590a;
            if (i11 == 0) {
                i11 = 4;
            }
            this.f146590a = i11;
            C23744a.Companion.m124119a().m124116d(ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422, str);
        }
        this.f146592c = null;
    }

    /* renamed from: g */
    private final void m153355g() {
        boolean z11;
        C32190y7.b bVar = C32190y7.Companion;
        if (bVar.m155234a().m155228s() == null && (Build.VERSION.SDK_INT < 26 || !bVar.m155234a().m155226o())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f146594e.m2566x().m155347e() && z11) {
            int i11 = this.f146590a;
            if (i11 == 0) {
                i11 = 2;
            }
            this.f146590a = i11;
            C23744a.Companion.m124119a().m124116d(111, new Object[0]);
        }
    }

    /* renamed from: h */
    private final void m153356h() {
        int m2719h = AbstractC23306f.m120562A().m2511B().m2719h();
        int m154661k = C32050o7.m154655h().m154661k(this.f146593d, m2719h);
        if (m154661k != 0) {
            int i11 = this.f146590a;
            if (i11 == 0) {
                i11 = 1;
            }
            this.f146590a = i11;
            C23744a.Companion.m124119a().m124116d(m154661k, Integer.valueOf(m2719h));
        }
        this.f146593d = null;
    }

    /* renamed from: i */
    public static final C31904eb m153357i() {
        return Companion.m153366a();
    }

    /* renamed from: j */
    private final String m153358j(C3535c c3535c, C18953k c18953k, C31894e1 c31894e1, int i11, boolean z11, boolean z12) {
        long j11;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (m153359k(c3535c, c31894e1)) {
            return "";
        }
        m153361o(c3535c, c31894e1);
        if (!c18953k.m99383G().isEmpty()) {
            int i12 = Calendar.getInstance().get(11);
            C17945a0 c17945a0 = (C17945a0) c3535c.m136040C();
            if (c17945a0 != null) {
                j11 = c17945a0.m94974P4();
            } else {
                j11 = 0;
            }
            String m99410r = c18953k.m99410r(c3535c, i12, j11, i11, z11, z12);
            if (!TextUtils.isEmpty(m99410r)) {
                return m99410r;
            }
        }
        return "";
    }

    /* renamed from: k */
    private final boolean m153359k(C3535c c3535c, C31894e1 c31894e1) {
        if (System.currentTimeMillis() - c31894e1.m153254a(c3535c.m17944I0()).m153194f() <= 604800000) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private final int m153360n(int i11, int i12) {
        do {
            i12 <<= 1;
            if (i12 >= 4) {
                break;
            }
        } while ((i11 & i12) == 0);
        return i12;
    }

    /* renamed from: o */
    private final void m153361o(C3535c c3535c, C31894e1 c31894e1) {
        C31879d1 m153254a = c31894e1.m153254a(c3535c.m17944I0());
        m153254a.m153202o(System.currentTimeMillis());
        m153254a.m153199k();
    }

    /* renamed from: c */
    public final void m153362c(final int i11) {
        if (this.f146591b) {
            return;
        }
        this.f146591b = true;
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zh.db
            @Override // java.lang.Runnable
            public final void run() {
                C31904eb.m153352d(C31904eb.this, i11);
            }
        });
    }

    /* renamed from: l */
    public final C31904eb m153363l(C18943a c18943a) {
        AbstractC19074t.m100208f(c18943a, "data");
        this.f146592c = c18943a;
        return this;
    }

    /* renamed from: m */
    public final C31904eb m153364m(C0885d c0885d) {
        AbstractC19074t.m100208f(c0885d, "data");
        this.f146593d = c0885d;
        return this;
    }

    private C31904eb() {
        C0872f m120562A = AbstractC23306f.m120562A();
        AbstractC19074t.m100207e(m120562A, "provideChatRepo(...)");
        this.f146594e = m120562A;
    }
}
