package p716zh;

import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.utils.ToastUtils;
import java.util.Objects;
import me0.AbstractC23136l9;
import p207he.C20024r;
import p363nh.C23744a;
import vg.AbstractC28054e7;

/* renamed from: zh.ha */
/* loaded from: classes3.dex */
public class C31948ha {

    /* renamed from: c */
    static C31948ha f146823c;

    /* renamed from: a */
    C31858ba f146824a;

    /* renamed from: b */
    int f146825b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.ha$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC28054e7 {
        a() {
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: a */
        public void mo16496a(int i11) {
            try {
                if (C31948ha.this.f146824a != null) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
                }
                C31948ha.this.m153602p();
                C31948ha.this.m153597k();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: b */
        public void mo64468b() {
            try {
                C31948ha.this.m153597k();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: c */
        public void mo16497c() {
            try {
                C31948ha.this.f146824a.f146288e = C7853b.m40052a0().m40112W();
                C31948ha.this.m153597k();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: e */
        public void mo16498e() {
            C31948ha.this.m153597k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.ha$b */
    /* loaded from: classes3.dex */
    public class b implements C7853b.d {
        b() {
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: a */
        public void mo40156a(String str, int i11) {
            try {
                if (TextUtils.equals(C31948ha.this.f146824a.f146285b, str)) {
                    C31948ha c31948ha = C31948ha.this;
                    if (c31948ha.f146825b != i11) {
                        c31948ha.f146825b = i11;
                        c31948ha.m153597k();
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
        }

        @Override // com.zing.zalo.common.C7853b.d
        public void onAudioFocusChange(int i11) {
        }
    }

    /* renamed from: d */
    public static synchronized C31948ha m153587d() {
        C31948ha c31948ha;
        synchronized (C31948ha.class) {
            try {
                if (f146823c == null) {
                    f146823c = new C31948ha();
                }
                c31948ha = f146823c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c31948ha;
    }

    /* renamed from: a */
    public void m153588a() {
        m153589b(this.f146824a);
    }

    /* renamed from: b */
    public void m153589b(C31858ba c31858ba) {
        try {
            if (c31858ba != null) {
                if (!C20024r.m103941j() && !C7853b.m40052a0().m40133i0()) {
                    C31858ba c31858ba2 = this.f146824a;
                    if (c31858ba2 != null && (c31858ba2 == null || Objects.equals(c31858ba2.f146284a, c31858ba.f146284a))) {
                        if (C7853b.m40052a0().m40139l0(this.f146824a.f146285b)) {
                            m153602p();
                        } else if (!C7853b.m40052a0().m40142n0(this.f146824a.f146285b)) {
                            m153598l();
                        }
                        m153597k();
                        return;
                    }
                    m153600n();
                    this.f146824a = c31858ba;
                    m153598l();
                    m153597k();
                    return;
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sticky_player_conflict_call));
                m153597k();
                return;
            }
            throw new IllegalArgumentException("Invalid SongMetaData");
        } catch (Exception e11) {
            e11.printStackTrace();
            m153599m();
        }
    }

    /* renamed from: c */
    public String m153590c() {
        C31858ba c31858ba = this.f146824a;
        if (c31858ba == null) {
            return "";
        }
        return c31858ba.f146286c;
    }

    /* renamed from: e */
    public C31858ba m153591e() {
        return this.f146824a;
    }

    /* renamed from: f */
    public int m153592f() {
        return this.f146825b;
    }

    /* renamed from: g */
    public String m153593g() {
        C31858ba c31858ba = this.f146824a;
        if (c31858ba == null) {
            return "";
        }
        return c31858ba.f146287d;
    }

    /* renamed from: h */
    public String m153594h() {
        C31858ba c31858ba = this.f146824a;
        if (c31858ba != null && !TextUtils.isEmpty(c31858ba.f146289f)) {
            return this.f146824a.f146289f;
        }
        return "";
    }

    /* renamed from: i */
    public boolean m153595i() {
        if (this.f146824a != null && C7853b.m40052a0().m40139l0(this.f146824a.f146285b)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m153596j() {
        if (this.f146824a != null && C7853b.m40052a0().m40142n0(this.f146824a.f146285b)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    void m153597k() {
        C23744a.m124114c().m124116d(10, new Object[0]);
    }

    /* renamed from: l */
    void m153598l() {
        int i11;
        int i12;
        try {
            int i13 = this.f146824a.f146288e;
            if (i13 > 0 && (i12 = this.f146825b) > 0) {
                i11 = (i12 * i13) / 100;
            } else {
                i11 = 0;
            }
            C7853b.m40052a0().m40136j1();
            C7853b.m40052a0().m40092C0(this.f146824a.f146285b, i11, new a(), true);
            m153601o();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public void m153599m() {
        try {
            m153602p();
            m153600n();
            m153597k();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    void m153600n() {
        this.f146824a = null;
        this.f146825b = 0;
    }

    /* renamed from: o */
    void m153601o() {
        try {
            C7853b.m40052a0().m40127f1(new b());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    public void m153602p() {
        try {
            if (!m153595i() && !m153596j()) {
                return;
            }
            C7853b.m40052a0().m40136j1();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
