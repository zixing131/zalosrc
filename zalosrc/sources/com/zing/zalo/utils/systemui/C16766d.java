package com.zing.zalo.utils.systemui;

import android.graphics.Color;
import android.os.Build;
import android.view.Window;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.AbstractC17452c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19055h0;
import me0.AbstractC23136l9;
import pm0.C24848g0;

/* renamed from: com.zing.zalo.utils.systemui.d */
/* loaded from: classes.dex */
public class C16766d implements InterfaceC16774l {
    public static final a Companion = new a(null);

    /* renamed from: x */
    private static final int f85054x = AbstractC23136l9.m118639A(AbstractC17452c.statusBarColor);

    /* renamed from: p */
    private final Boolean f85055p;

    /* renamed from: q */
    private final Boolean f85056q;

    /* renamed from: r */
    private final Integer f85057r;

    /* renamed from: s */
    private final Integer f85058s;

    /* renamed from: t */
    private final Boolean f85059t;

    /* renamed from: u */
    private final Boolean f85060u;

    /* renamed from: v */
    private final Boolean f85061v;

    /* renamed from: w */
    private final Integer f85062w;

    /* renamed from: com.zing.zalo.utils.systemui.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final int m89485d(C16766d c16766d, Window window, int i11) {
            int i12;
            Boolean m89479j = c16766d.m89479j();
            if (m89479j != null) {
                if (m89479j.booleanValue()) {
                    window.clearFlags(134217728);
                    window.addFlags(Integer.MIN_VALUE);
                    i12 = i11 | 16;
                } else {
                    i12 = i11 & (-17);
                }
                return i12;
            }
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final int m89486e(C16766d c16766d, Window window, int i11) {
            int i12;
            Boolean m89480k = c16766d.m89480k();
            if (m89480k != null) {
                if (m89480k.booleanValue()) {
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    i12 = i11 | 8192;
                } else {
                    i12 = i11 & (-8193);
                }
                return i12;
            }
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final int m89487f(C16766d c16766d, Window window, int i11) {
            int i12;
            int i13;
            int intValue;
            C19055h0 c19055h0 = new C19055h0();
            c19055h0.f94931p = i11;
            Boolean m89471b = c16766d.m89471b();
            if (m89471b != null) {
                if (m89471b.booleanValue()) {
                    intValue = c19055h0.f94931p | 4;
                } else {
                    int i14 = c19055h0.f94931p & (-5);
                    window.clearFlags(1024);
                    intValue = Integer.valueOf(i14).intValue();
                }
                c19055h0.f94931p = intValue;
            }
            Boolean m89470a = c16766d.m89470a();
            if (m89470a != null) {
                if (m89470a.booleanValue()) {
                    i13 = c19055h0.f94931p | 2;
                } else {
                    i13 = c19055h0.f94931p & (-3);
                }
                c19055h0.f94931p = i13;
            }
            Integer m89474e = c16766d.m89474e();
            if (m89474e != null && m89474e.intValue() == 0) {
                i12 = c19055h0.f94931p & (-6145);
            } else if (m89474e != null && m89474e.intValue() == 1) {
                i12 = (c19055h0.f94931p & (-4097)) | ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
            } else if (m89474e != null && m89474e.intValue() == 2) {
                i12 = (c19055h0.f94931p | 4096) & (-2049);
            } else {
                i12 = c19055h0.f94931p;
            }
            c19055h0.f94931p = i12;
            return i12;
        }
    }

    public C16766d(Boolean bool, Boolean bool2, Integer num, Integer num2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num3) {
        this.f85055p = bool;
        this.f85056q = bool2;
        this.f85057r = num;
        this.f85058s = num2;
        this.f85059t = bool3;
        this.f85060u = bool4;
        this.f85061v = bool5;
        this.f85062w = num3;
    }

    /* renamed from: a */
    protected Boolean m89470a() {
        return this.f85061v;
    }

    /* renamed from: b */
    protected Boolean m89471b() {
        return this.f85060u;
    }

    /* renamed from: c */
    protected Integer m89472c() {
        return this.f85057r;
    }

    /* renamed from: d */
    protected Integer m89473d() {
        return this.f85058s;
    }

    /* renamed from: e */
    protected Integer m89474e() {
        return this.f85062w;
    }

    /* renamed from: f */
    public void m89475f(Window window) {
        AbstractC19074t.m100208f(window, "window");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            m89478i(window);
        } else if (i11 >= 23) {
            m89477h(window);
        } else {
            m89476g(window);
        }
    }

    /* renamed from: g */
    protected void m89476g(Window window) {
        AbstractC19074t.m100208f(window, "<this>");
        window.setStatusBarColor(f85054x);
        window.setNavigationBarColor(-16777216);
        window.getDecorView().setSystemUiVisibility(Companion.m89487f(this, window, (window.getDecorView().getSystemUiVisibility() | 1280) & (-513)));
    }

    /* renamed from: h */
    protected void m89477h(Window window) {
        int i11;
        AbstractC19074t.m100208f(window, "<this>");
        Boolean m89481l = m89481l();
        if (m89481l != null) {
            if (m89481l.booleanValue()) {
                i11 = 0;
            } else {
                i11 = f85054x;
            }
            window.setStatusBarColor(i11);
        }
        window.setNavigationBarColor(-16777216);
        int systemUiVisibility = (window.getDecorView().getSystemUiVisibility() | 1280) & (-513);
        a aVar = Companion;
        window.getDecorView().setSystemUiVisibility(aVar.m89487f(this, window, aVar.m89486e(this, window, systemUiVisibility)));
    }

    /* renamed from: i */
    protected void m89478i(Window window) {
        int i11;
        Integer m89473d;
        int i12;
        AbstractC19074t.m100208f(window, "<this>");
        Boolean m89481l = m89481l();
        if (m89481l != null) {
            if (m89481l.booleanValue()) {
                i12 = 0;
            } else {
                i12 = f85054x;
            }
            window.setStatusBarColor(i12);
        }
        Integer m89472c = m89472c();
        if (m89472c != null) {
            window.setNavigationBarColor(m89472c.intValue());
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 28 && (m89473d = m89473d()) != null) {
            window.setNavigationBarDividerColor(m89473d.intValue());
        }
        if (i13 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        int i14 = systemUiVisibility | 1280;
        Integer m89472c2 = m89472c();
        if (m89472c2 != null) {
            if (Color.alpha(m89472c2.intValue()) != 255) {
                i11 = systemUiVisibility | 1792;
            } else {
                i11 = i14 & (-513);
            }
            i14 = i11;
        }
        a aVar = Companion;
        window.getDecorView().setSystemUiVisibility(aVar.m89487f(this, window, aVar.m89485d(this, window, aVar.m89486e(this, window, i14))));
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m89475f((Window) obj);
        return C24848g0.f119245a;
    }

    /* renamed from: j */
    protected Boolean m89479j() {
        return this.f85059t;
    }

    /* renamed from: k */
    protected Boolean m89480k() {
        return this.f85056q;
    }

    /* renamed from: l */
    protected Boolean m89481l() {
        return this.f85055p;
    }

    public /* synthetic */ C16766d(Boolean bool, Boolean bool2, Integer num, Integer num2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num3, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : bool2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : bool3, (i11 & 32) != 0 ? null : bool4, (i11 & 64) != 0 ? null : bool5, (i11 & 128) == 0 ? num3 : null);
    }
}
