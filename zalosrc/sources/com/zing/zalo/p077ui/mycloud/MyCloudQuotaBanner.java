package com.zing.zalo.p077ui.mycloud;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import b90.EnumC2667d;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.mycloud.MyCloudQuotaBanner;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import ti0.C26705d;
import ti0.C26707f;
import ui0.C27280g;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes6.dex */
public final class MyCloudQuotaBanner extends ModulesView {

    /* renamed from: K */
    private C22126c0 f65385K;

    /* renamed from: L */
    private C21693c f65386L;

    /* renamed from: M */
    private C21693c f65387M;

    /* renamed from: N */
    private InterfaceC12495a f65388N;

    /* renamed from: O */
    private EnumC12496b f65389O;

    /* renamed from: P */
    private EnumC2667d f65390P;

    /* renamed from: com.zing.zalo.ui.mycloud.MyCloudQuotaBanner$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12495a {
        /* renamed from: a */
        void mo60376a(int i11);

        /* renamed from: b */
        void mo60377b(EnumC12496b enumC12496b, EnumC2667d enumC2667d);

        /* renamed from: c */
        void mo60378c(EnumC12496b enumC12496b, EnumC2667d enumC2667d);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.mycloud.MyCloudQuotaBanner$b */
    /* loaded from: classes6.dex */
    public static final class EnumC12496b {

        /* renamed from: p */
        public static final EnumC12496b f65391p = new EnumC12496b("MEDIUM", 0);

        /* renamed from: q */
        public static final EnumC12496b f65392q = new EnumC12496b("STRONG", 1);

        /* renamed from: r */
        private static final /* synthetic */ EnumC12496b[] f65393r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f65394s;

        static {
            EnumC12496b[] m70234b = m70234b();
            f65393r = m70234b;
            f65394s = AbstractC30166b.m148796a(m70234b);
        }

        private EnumC12496b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC12496b[] m70234b() {
            return new EnumC12496b[]{f65391p, f65392q};
        }

        public static EnumC12496b valueOf(String str) {
            return (EnumC12496b) Enum.valueOf(EnumC12496b.class, str);
        }

        public static EnumC12496b[] values() {
            return (EnumC12496b[]) f65393r.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.MyCloudQuotaBanner$c */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12497c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65395a;

        static {
            int[] iArr = new int[EnumC2667d.values().length];
            try {
                iArr[EnumC2667d.f10677s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2667d.f10682x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2667d.f10683y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2667d.f10678t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC2667d.f10679u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC2667d.f10680v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC2667d.f10681w.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f65395a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCloudQuotaBanner(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f65389O = EnumC12496b.f65391p;
        this.f65390P = EnumC2667d.f10683y;
        C21693c c21693c = new C21693c(context);
        C16718f m89027K = c21693c.m89106L().m89028L(-2, -2).m89027K(true);
        Boolean bool = Boolean.TRUE;
        m89027K.m89073z(bool);
        this.f65387M = c21693c;
        C21693c c21693c2 = new C21693c(context);
        c21693c2.m89106L().m89028L(-2, -2).m89027K(true).m89017A(bool);
        c21693c2.mo89109M0(new C16719g.c() { // from class: u80.s1
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MyCloudQuotaBanner.m70231Y(MyCloudQuotaBanner.this, c16719g);
            }
        });
        this.f65386L = c21693c2;
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.m89106L().m89028L(-1, -2).m89029M(1).m89027K(true).m89073z(bool).m89049e0(this.f65386L).m89054h0(this.f65387M).m89034R(AbstractC23136l9.m118742r(8.0f));
        c22126c0.m111953A1(2);
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context, AbstractC2814h.t_xsmall_m));
        this.f65385K = c22126c0;
        setBackgroundColor(AbstractC23136l9.m118639A(AbstractC2808b.f150834y10));
        setPadding(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f));
        setOnClickListener(new View.OnClickListener() { // from class: u80.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCloudQuotaBanner.m70230X(MyCloudQuotaBanner.this, view);
            }
        });
        mo69681L(this.f65387M);
        mo69681L(this.f65386L);
        mo69681L(this.f65385K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public static final void m70230X(MyCloudQuotaBanner myCloudQuotaBanner, View view) {
        AbstractC19074t.m100208f(myCloudQuotaBanner, "this$0");
        InterfaceC12495a interfaceC12495a = myCloudQuotaBanner.f65388N;
        if (interfaceC12495a != null) {
            interfaceC12495a.mo60377b(myCloudQuotaBanner.f65389O, myCloudQuotaBanner.f65390P);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m70231Y(MyCloudQuotaBanner myCloudQuotaBanner, C16719g c16719g) {
        AbstractC19074t.m100208f(myCloudQuotaBanner, "this$0");
        InterfaceC12495a interfaceC12495a = myCloudQuotaBanner.f65388N;
        if (interfaceC12495a != null) {
            interfaceC12495a.mo60378c(myCloudQuotaBanner.f65389O, myCloudQuotaBanner.f65390P);
        }
    }

    /* renamed from: a0 */
    private final void m70232a0(EnumC12496b enumC12496b, CharSequence charSequence) {
        this.f65389O = enumC12496b;
        if (enumC12496b == EnumC12496b.f65391p) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), AbstractC8915g0.ThemeDefault_Light);
            setBackgroundColor(C23212s8.m119606n(AbstractC2807a.support_warning_background));
            this.f65387M.mo111925v1(C27280g.m139660c(contextThemeWrapper, AbstractC2810d.zds_ic_warning_solid_16, AbstractC2807a.warning_icon));
            this.f65385K.m111962J1(C23212s8.m119606n(AbstractC2807a.warning_text));
            C21693c c21693c = this.f65386L;
            Context context = c21693c.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            c21693c.mo111925v1(C27280g.m139660c(context, AbstractC2810d.zds_ic_close_line_16, AbstractC2807a.icon_secondary));
        } else {
            setBackgroundColor(C23212s8.m119606n(AbstractC2807a.error_background));
            C21693c c21693c2 = this.f65387M;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            c21693c2.mo111925v1(C27280g.m139660c(context2, AbstractC2810d.zds_ic_warning_solid_16, AbstractC2807a.support_error));
            this.f65385K.m111962J1(C23212s8.m119606n(AbstractC2807a.error_text));
            C21693c c21693c3 = this.f65386L;
            Context context3 = c21693c3.getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            c21693c3.mo111925v1(C27280g.m139660c(context3, AbstractC2810d.zds_ic_chevron_right_line_16, AbstractC2807a.icon_secondary));
        }
        this.f65385K.m111959G1(charSequence);
    }

    /* renamed from: b0 */
    public final void m70233b0(EnumC2667d enumC2667d) {
        AbstractC19074t.m100208f(enumC2667d, "quotaState");
        this.f65390P = enumC2667d;
        if (enumC2667d != EnumC2667d.f10681w) {
            this.f65385K.mo111965M1(1);
        } else {
            this.f65385K.mo111965M1(0);
        }
        switch (C12497c.f65395a[enumC2667d.ordinal()]) {
            case 1:
            case 2:
            case 3:
                setVisibility(8);
                return;
            case 4:
                m70232a0(EnumC12496b.f65391p, enumC2667d.mo13106d());
                return;
            case 5:
            case 6:
            case 7:
                m70232a0(EnumC12496b.f65392q, enumC2667d.mo13106d());
                return;
            default:
                return;
        }
    }

    public final EnumC2667d getBannerCurrentState() {
        return this.f65390P;
    }

    public final void setListener(InterfaceC12495a interfaceC12495a) {
        AbstractC19074t.m100208f(interfaceC12495a, "listener");
        this.f65388N = interfaceC12495a;
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        InterfaceC12495a interfaceC12495a;
        EnumC2667d enumC2667d;
        if (i11 == 0 && ((enumC2667d = this.f65390P) == EnumC2667d.f10683y || enumC2667d == EnumC2667d.f10682x || enumC2667d == EnumC2667d.f10677s)) {
            return;
        }
        if (getVisibility() != i11 && (interfaceC12495a = this.f65388N) != null) {
            interfaceC12495a.mo60376a(i11);
        }
        super.setVisibility(i11);
    }
}
