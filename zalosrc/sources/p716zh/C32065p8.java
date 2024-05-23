package p716zh;

import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.utils.ToastUtils;
import p207he.C20024r;
import p363nh.C23744a;
import p426pp.C24903f;
import s00.AbstractC26080o;
import vg.AbstractC28054e7;

/* renamed from: zh.p8 */
/* loaded from: classes3.dex */
public class C32065p8 {

    /* renamed from: d */
    private static volatile C32065p8 f147644d;

    /* renamed from: a */
    C24903f f147645a;

    /* renamed from: b */
    int f147646b;

    /* renamed from: c */
    int f147647c;

    /* renamed from: zh.p8$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC28054e7 {

        /* renamed from: a */
        final /* synthetic */ boolean f147648a;

        a(boolean z11) {
            this.f147648a = z11;
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: a */
        public void mo16496a(int i11) {
            try {
                if (C32065p8.this.f147645a != null) {
                    ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.error_general));
                }
                C32065p8.this.m154701r(false);
                C32065p8.this.m154693h();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: b */
        public void mo64468b() {
            C32065p8.this.m154693h();
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: c */
        public void mo16497c() {
            try {
                if (this.f147648a) {
                    C7853b.m40052a0().m40146r0();
                } else {
                    C7853b.m40052a0().m40102P(1.0f, 1.0f);
                }
                C24903f c24903f = C32065p8.this.f147645a;
                if (c24903f != null) {
                    c24903f.m129505h(C7853b.m40052a0().m40112W());
                }
                C32065p8.this.m154687s();
                C32065p8.this.m154693h();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: e */
        public void mo16498e() {
            C32065p8.this.m154693h();
        }
    }

    /* renamed from: zh.p8$b */
    /* loaded from: classes3.dex */
    public class b implements C7853b.d {
        b() {
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: a */
        public void mo40156a(String str, int i11) {
            try {
                if (TextUtils.equals(C32065p8.this.f147645a.m129503f(), str)) {
                    C32065p8 c32065p8 = C32065p8.this;
                    if (c32065p8.f147646b != i11) {
                        if (i11 == 0) {
                            c32065p8.f147647c = 0;
                        }
                        c32065p8.f147646b = i11;
                        c32065p8.m154693h();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: b */
        public void mo40157b(String str, String str2) {
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: c */
        public void mo40158c(String str, int i11) {
            try {
                if (TextUtils.equals(C32065p8.this.f147645a.m129503f(), str)) {
                    C32065p8 c32065p8 = C32065p8.this;
                    if (c32065p8.f147647c != i11) {
                        if (i11 > c32065p8.f147645a.m129501d()) {
                            C32065p8 c32065p82 = C32065p8.this;
                            c32065p82.f147647c = c32065p82.f147645a.m129501d();
                        } else {
                            C32065p8.this.f147647c = i11;
                        }
                        C32065p8.this.m154693h();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.common.C7853b.d
        public void onAudioFocusChange(int i11) {
        }
    }

    /* renamed from: c */
    public static C32065p8 m154684c() {
        if (f147644d == null) {
            synchronized (C32065p8.class) {
                try {
                    if (f147644d == null) {
                        f147644d = new C32065p8();
                    }
                } finally {
                }
            }
        }
        return f147644d;
    }

    /* renamed from: m */
    private void m154685m(boolean z11) {
        try {
            C7853b.m40052a0().m40136j1();
            C7853b.m40052a0().m40092C0(this.f147645a.m129503f(), this.f147647c, new a(z11), true);
            C7853b.m40052a0().m40127f1(new b());
        } catch (Exception e11) {
            e11.printStackTrace();
            m154698n();
        }
    }

    /* renamed from: o */
    private void m154686o() {
        this.f147645a = null;
        this.f147646b = 0;
        this.f147647c = 0;
    }

    /* renamed from: s */
    public void m154687s() {
        if (this.f147647c != C7853b.m40052a0().m40117Z()) {
            m154699p(this.f147647c);
        }
    }

    /* renamed from: b */
    public int m154688b() {
        return this.f147647c;
    }

    /* renamed from: d */
    public C24903f m154689d() {
        return this.f147645a;
    }

    /* renamed from: e */
    public int m154690e() {
        return this.f147646b;
    }

    /* renamed from: f */
    public boolean m154691f() {
        if (this.f147645a != null && C7853b.m40052a0().m40139l0(this.f147645a.m129503f())) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m154692g() {
        if (this.f147645a != null && C7853b.m40052a0().m40142n0(this.f147645a.m129503f())) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void m154693h() {
        C23744a.m124114c().m124116d(AbstractC26080o.a.f124275b, new Object[0]);
    }

    /* renamed from: i */
    public void m154694i() {
        m154695j(this.f147645a);
    }

    /* renamed from: j */
    public void m154695j(C24903f c24903f) {
        try {
            if (c24903f != null) {
                if (!C20024r.m103941j() && !C7853b.m40052a0().m40133i0()) {
                    C24903f c24903f2 = this.f147645a;
                    if (c24903f2 != null && TextUtils.equals(c24903f2.m129503f(), c24903f.m129503f())) {
                        if (m154691f()) {
                            m154701r(false);
                        } else if (!m154692g()) {
                            m154685m(false);
                        }
                        m154693h();
                        return;
                    }
                    m154686o();
                    this.f147645a = c24903f;
                    m154685m(false);
                    m154693h();
                    return;
                }
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_sticky_player_conflict_call));
                m154693h();
                return;
            }
            throw new IllegalArgumentException("Invalid SongMetaData");
        } catch (Exception e11) {
            e11.printStackTrace();
            m154698n();
        }
    }

    /* renamed from: k */
    public void m154696k() {
        m154697l(this.f147645a, this.f147647c, false);
    }

    /* renamed from: l */
    public void m154697l(C24903f c24903f, int i11, boolean z11) {
        try {
            if (c24903f != null) {
                if (!C20024r.m103941j() && !C7853b.m40052a0().m40133i0()) {
                    C7853b.m40052a0().m40108T0();
                    C24903f c24903f2 = this.f147645a;
                    if (c24903f2 != null && TextUtils.equals(c24903f2.m129503f(), c24903f.m129503f())) {
                        if (!m154691f() && !m154692g()) {
                            this.f147647c = i11;
                            m154685m(z11);
                        } else {
                            C7853b.m40052a0().m40134i1(1.0f, 1.0f);
                        }
                        m154693h();
                        return;
                    }
                    m154686o();
                    this.f147645a = c24903f;
                    this.f147647c = i11;
                    m154685m(z11);
                    m154693h();
                    return;
                }
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_sticky_player_conflict_call));
                m154693h();
                return;
            }
            throw new IllegalArgumentException("Invalid SongMetaData");
        } catch (Exception e11) {
            e11.printStackTrace();
            m154698n();
        }
    }

    /* renamed from: n */
    public void m154698n() {
        try {
            m154701r(false);
            m154686o();
            m154693h();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    public void m154699p(int i11) {
        try {
            if (m154692g()) {
                this.f147647c = i11;
            } else {
                C7853b.m40052a0().m40116Y0(i11);
                this.f147647c = i11;
                m154693h();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    public void m154700q(int i11) {
        int i12;
        C24903f c24903f = this.f147645a;
        if (c24903f != null) {
            this.f147646b = i11;
            if (c24903f.m129501d() > 0 && i11 > 0) {
                i12 = (i11 * this.f147645a.m129501d()) / 100;
            } else {
                i12 = 0;
            }
            m154699p(i12);
        }
    }

    /* renamed from: r */
    public void m154701r(boolean z11) {
        try {
            if (!m154691f()) {
                if (m154692g()) {
                }
            }
            if (z11) {
                C7853b.m40052a0().m40147s0(false);
            } else {
                C7853b.m40052a0().m40136j1();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
