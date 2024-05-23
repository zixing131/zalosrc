package p716zh;

import am.AbstractC0924m0;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.zview.C17487o0;
import dj.C18013y0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import p006a0.C0012a;
import p019aj.C0872f;
import p020ak.C0885d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p716zh.C32204z7;
import p718zj.C32218a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: zh.y7 */
/* loaded from: classes3.dex */
public final class C32190y7 {
    public static final b Companion = new b(null);

    /* renamed from: m */
    private static final InterfaceC24854k f148449m;

    /* renamed from: a */
    private ClipboardManager f148450a;

    /* renamed from: b */
    private C0012a f148451b;

    /* renamed from: c */
    private ClipboardManager.OnPrimaryClipChangedListener f148452c;

    /* renamed from: d */
    private long f148453d;

    /* renamed from: e */
    private long f148454e;

    /* renamed from: f */
    private String f148455f;

    /* renamed from: g */
    private String f148456g;

    /* renamed from: h */
    private boolean f148457h;

    /* renamed from: i */
    private boolean f148458i;

    /* renamed from: j */
    private boolean f148459j;

    /* renamed from: k */
    private boolean f148460k;

    /* renamed from: l */
    private final InterfaceC24854k f148461l;

    /* renamed from: zh.y7$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f148462q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C32190y7 mo12V4() {
            return c.f148463a.m155235a();
        }
    }

    /* renamed from: zh.y7$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C32190y7 m155234a() {
            return (C32190y7) C32190y7.f148449m.getValue();
        }
    }

    /* renamed from: zh.y7$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f148463a = new c();

        /* renamed from: b */
        private static final C32190y7 f148464b = new C32190y7(null);

        private c() {
        }

        /* renamed from: a */
        public final C32190y7 m155235a() {
            return f148464b;
        }
    }

    /* renamed from: zh.y7$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        void mo155236a(String str, int i11);

        /* renamed from: b */
        void mo155237b(String str, C18013y0 c18013y0, long j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.y7$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f148465q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C0872f mo12V4() {
            C0872f m120562A = AbstractC23306f.m120562A();
            AbstractC19074t.m100207e(m120562A, "provideChatRepo(...)");
            return m120562A;
        }
    }

    /* renamed from: zh.y7$f */
    /* loaded from: classes3.dex */
    public static final class f implements C32204z7.h {

        /* renamed from: b */
        final /* synthetic */ String f148467b;

        /* renamed from: c */
        final /* synthetic */ long f148468c;

        /* renamed from: d */
        final /* synthetic */ d f148469d;

        /* renamed from: e */
        final /* synthetic */ long f148470e;

        f(String str, long j11, d dVar, long j12) {
            this.f148467b = str;
            this.f148468c = j11;
            this.f148469d = dVar;
            this.f148470e = j12;
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: a */
        public void mo64439a(String str, int i11) {
            d dVar = this.f148469d;
            if (dVar != null) {
                dVar.mo155236a(str, i11);
            }
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: b */
        public void mo64440b(String str, C18013y0 c18013y0) {
            AbstractC19074t.m100208f(str, "input");
            AbstractC19074t.m100208f(c18013y0, "data");
            C32190y7.this.f148456g = this.f148467b;
            C32190y7.this.f148453d = this.f148468c;
            d dVar = this.f148469d;
            if (dVar != null) {
                dVar.mo155237b(str, c18013y0, this.f148470e);
            }
        }

        @Override // p716zh.C32204z7.h
        /* renamed from: c */
        public void mo64441c(String str, String str2) {
            AbstractC19074t.m100208f(str, "input");
            AbstractC19074t.m100208f(str2, "thumbPath");
        }
    }

    /* renamed from: zh.y7$g */
    /* loaded from: classes3.dex */
    public static final class g implements d {
        g() {
        }

        @Override // p716zh.C32190y7.d
        /* renamed from: a */
        public void mo155236a(String str, int i11) {
        }

        @Override // p716zh.C32190y7.d
        /* renamed from: b */
        public void mo155237b(String str, C18013y0 c18013y0, long j11) {
            if (System.currentTimeMillis() - j11 <= 1500) {
                C31904eb m153366a = C31904eb.Companion.m153366a();
                m153366a.m153364m(new C0885d(C32190y7.this.m155227r()));
                m153366a.m153362c(3);
            }
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f148462q);
        f148449m = m129210a;
    }

    public /* synthetic */ C32190y7(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: i */
    private final void m155208i(Context context) {
        ClipboardManager clipboardManager;
        Object systemService = context.getSystemService("clipboard");
        if (systemService instanceof ClipboardManager) {
            clipboardManager = (ClipboardManager) systemService;
        } else {
            clipboardManager = null;
        }
        if (clipboardManager == null) {
            return;
        }
        this.f148450a = clipboardManager;
        try {
            AbstractC19074t.m100205c(clipboardManager);
            this.f148451b = new C0012a(clipboardManager, new SensitiveData("clipboard_listener_change", "auto_scan", null, 4, null));
            ClipboardManagerOnPrimaryClipChangedListenerC32176x7 clipboardManagerOnPrimaryClipChangedListenerC32176x7 = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: zh.x7
                public /* synthetic */ ClipboardManagerOnPrimaryClipChangedListenerC32176x7() {
                }

                @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
                public final void onPrimaryClipChanged() {
                    C32190y7.m155209j(C32190y7.this);
                }
            };
            this.f148452c = clipboardManagerOnPrimaryClipChangedListenerC32176x7;
            C0012a c0012a = this.f148451b;
            if (c0012a != null) {
                c0012a.m14a(clipboardManagerOnPrimaryClipChangedListenerC32176x7);
            }
        } catch (SensitiveDataException unused) {
        }
    }

    /* renamed from: j */
    public static final void m155209j(C32190y7 c32190y7) {
        AbstractC19074t.m100208f(c32190y7, "this$0");
        if (!c32190y7.m155214p()) {
            return;
        }
        try {
            C0012a c0012a = c32190y7.f148451b;
            if (c0012a != null) {
                ClipData m15b = c0012a.m15b();
                if (m15b != null) {
                    if (MainTabView.m67645lM() != null && MainTabView.m67645lM().m92662fJ() != null) {
                        C17487o0 m92662fJ = MainTabView.m67645lM().m92662fJ();
                        AbstractC19074t.m100205c(m92662fJ);
                        if (m92662fJ.m93029Q(ChatView.class) && ZaloLauncherActivity.Companion.m57117i()) {
                            c32190y7.f148455f = C11318b.Companion.m60525a().m60513g();
                            c32190y7.f148457h = true;
                            if (c32190y7.f148460k) {
                                c32190y7.f148459j = true;
                            }
                            if (c32190y7.m155218y(m15b)) {
                                c32190y7.m155213n(m15b, null);
                                return;
                            }
                            return;
                        }
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        c32190y7.f148455f = "";
                        c32190y7.f148457h = false;
                        if (c32190y7.m155218y(m15b)) {
                            c32190y7.m155213n(m15b, null);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: k */
    public static final void m155210k(C32190y7 c32190y7) {
        AbstractC19074t.m100208f(c32190y7, "this$0");
        if (c32190y7.f148452c == null) {
            c32190y7.m155208i(MainApplication.Companion.m35500c());
        }
    }

    /* renamed from: l */
    public static final void m155211l(C32190y7 c32190y7) {
        AbstractC19074t.m100208f(c32190y7, "this$0");
        if (c32190y7.f148452c != null) {
            c32190y7.m155212m();
        }
    }

    /* renamed from: m */
    private final void m155212m() {
        this.f148454e = -1L;
        m155232z();
        ClipboardManager clipboardManager = this.f148450a;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.f148452c);
        }
        this.f148452c = null;
    }

    /* renamed from: n */
    private final boolean m155213n(ClipData clipData, d dVar) {
        long currentTimeMillis;
        String obj = clipData.getItemAt(0).getText().toString();
        String m153548n = C31944h6.m153548n(obj);
        if (m153548n.length() > 0) {
            C32204z7.b bVar = C32204z7.Companion;
            if (!bVar.m155281c().m155273p(m153548n)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    currentTimeMillis = clipData.getDescription().getTimestamp();
                    AbstractC23309i.m121317Pp(currentTimeMillis);
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                }
                this.f148456g = obj;
                this.f148453d = currentTimeMillis;
                bVar.m155281c().m155277x(m153548n, true, false, 1, new f(obj, currentTimeMillis, dVar, System.currentTimeMillis()));
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    private final boolean m155214p() {
        if (m155215q().m2566x().m155346d() && AbstractC0924m0.m3510V9() && !AbstractC0924m0.m3481U9() && Build.VERSION.SDK_INT < 31) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private final C0872f m155215q() {
        return (C0872f) this.f148461l.getValue();
    }

    /* renamed from: t */
    public static final C32190y7 m155216t() {
        return Companion.m155234a();
    }

    /* renamed from: x */
    private final boolean m155217x(ClipData clipData) {
        long timestamp;
        boolean z11;
        timestamp = clipData.getDescription().getTimestamp();
        if (timestamp > AbstractC23309i.m122382s5()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!m155218y(clipData) || !z11) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private final boolean m155218y(ClipData clipData) {
        ClipData.Item itemAt = clipData.getItemAt(0);
        if (itemAt == null || itemAt.getText() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public final void m155219A(long j11) {
        this.f148454e = j11;
    }

    /* renamed from: B */
    public final void m155220B(boolean z11) {
        this.f148460k = z11;
    }

    /* renamed from: C */
    public final void m155221C(boolean z11) {
        this.f148458i = z11;
    }

    /* renamed from: D */
    public final void m155222D(boolean z11) {
        this.f148459j = z11;
    }

    /* renamed from: E */
    public final void m155223E(String str) {
        AbstractC19074t.m100208f(str, "config");
        m155215q().m2552o0(str);
        m155225h();
    }

    /* renamed from: g */
    public final boolean m155224g() {
        C32218a m2566x = m155215q().m2566x();
        if (this.f148453d > 0 && C31944h6.f146774a.m153560y(this.f148456g) && C32204z7.Companion.m155281c().m155270k(this.f148456g) != null && System.currentTimeMillis() - this.f148453d < m2566x.m155343a() && System.currentTimeMillis() - this.f148454e > m2566x.m155344b()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void m155225h() {
        if (m155214p()) {
            AbstractC19444a.m101695c(new Runnable() { // from class: zh.v7
                public /* synthetic */ RunnableC32148v7() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C32190y7.m155210k(C32190y7.this);
                }
            });
        } else {
            AbstractC19444a.m101695c(new Runnable() { // from class: zh.w7
                public /* synthetic */ RunnableC32162w7() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C32190y7.m155211l(C32190y7.this);
                }
            });
        }
    }

    /* renamed from: o */
    public final boolean m155226o() {
        if (!m155214p()) {
            return false;
        }
        try {
            C0012a c0012a = this.f148451b;
            if (c0012a != null) {
                ClipData m15b = c0012a.m15b();
                if (m15b == null || !m155217x(m15b)) {
                    return false;
                }
                this.f148455f = "";
                this.f148457h = false;
                return m155213n(m15b, new g());
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: r */
    public final String m155227r() {
        return this.f148455f;
    }

    /* renamed from: s */
    public final C18013y0 m155228s() {
        return C32204z7.Companion.m155281c().m155270k(this.f148456g);
    }

    /* renamed from: u */
    public final boolean m155229u() {
        return this.f148457h;
    }

    /* renamed from: v */
    public final boolean m155230v(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "link");
        if (this.f148456g.length() > 0 && this.f148456g.contentEquals(charSequence)) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final boolean m155231w() {
        return this.f148458i;
    }

    /* renamed from: z */
    public final void m155232z() {
        if (this.f148459j) {
            return;
        }
        this.f148453d = -1L;
        this.f148456g = "";
        this.f148455f = "";
        this.f148457h = false;
        this.f148458i = true;
    }

    private C32190y7() {
        InterfaceC24854k m129210a;
        this.f148456g = "";
        m129210a = AbstractC24856m.m129210a(e.f148465q);
        this.f148461l = m129210a;
        this.f148453d = -1L;
        this.f148454e = -1L;
        this.f148455f = "";
        this.f148456g = "";
        this.f148457h = false;
        this.f148458i = true;
    }
}
