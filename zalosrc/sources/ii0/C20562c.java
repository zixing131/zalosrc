package ii0;

import ac.C0708i;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewpager.widget.ViewPager;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2814h;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ButtonWithProgress;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.CheckBox;
import com.zing.zalo.zdesign.component.EnumC17020n;
import com.zing.zalo.zdesign.component.PageIndicator;
import com.zing.zalo.zdesign.component.TextField;
import com.zing.zalo.zdesign.component.modal.ModalButtonBarLayout;
import com.zing.zalo.zdesign.component.modal.PopupDesComp;
import com.zing.zalo.zdesign.layout.BoundedLinearLayout;
import com.zing.zalo.zdesign.layout.BoundedRelativeLayout;
import com.zing.zalo.zdesign.layout.BoundedScrollView;
import com.zing.zalo.zdesign.layout.RatioImageView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.dialog.C17465f;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import ui0.C27276c;

/* renamed from: ii0.c */
/* loaded from: classes7.dex */
public final class C20562c {
    public static final c Companion = new c(null);

    /* renamed from: A */
    private String f100958A;

    /* renamed from: B */
    private String f100959B;

    /* renamed from: C */
    private C0708i f100960C;

    /* renamed from: D */
    private C0708i f100961D;

    /* renamed from: E */
    private C0708i f100962E;

    /* renamed from: F */
    private RobotoTextView f100963F;

    /* renamed from: G */
    private RobotoTextView f100964G;

    /* renamed from: H */
    private LinearLayout f100965H;

    /* renamed from: I */
    private ImageView f100966I;

    /* renamed from: J */
    private LinearLayout f100967J;

    /* renamed from: K */
    private FrameLayout f100968K;

    /* renamed from: L */
    private LinearLayout f100969L;

    /* renamed from: M */
    private LinearLayout f100970M;

    /* renamed from: N */
    private RatioImageView f100971N;

    /* renamed from: O */
    private LinearLayout f100972O;

    /* renamed from: P */
    private LinearLayout f100973P;

    /* renamed from: Q */
    private LinearLayout f100974Q;

    /* renamed from: R */
    private LinearLayout f100975R;

    /* renamed from: S */
    private BoundedRelativeLayout f100976S;

    /* renamed from: T */
    private PageIndicator f100977T;

    /* renamed from: U */
    private ViewPager f100978U;

    /* renamed from: V */
    private C20563d f100979V;

    /* renamed from: W */
    private boolean f100980W;

    /* renamed from: X */
    private float f100981X;

    /* renamed from: Y */
    private ImageView.ScaleType f100982Y;

    /* renamed from: Z */
    private int f100983Z;

    /* renamed from: a */
    private Context f100984a;

    /* renamed from: a0 */
    private Drawable f100985a0;

    /* renamed from: b */
    private InterfaceC17463d f100986b;

    /* renamed from: b0 */
    private EnumC17020n f100987b0;

    /* renamed from: c */
    private C17465f f100988c;

    /* renamed from: c0 */
    private int f100989c0;

    /* renamed from: d */
    private CharSequence f100990d;

    /* renamed from: d0 */
    private Drawable f100991d0;

    /* renamed from: e */
    private CharSequence f100992e;

    /* renamed from: e0 */
    private EnumC17020n f100993e0;

    /* renamed from: f */
    private Drawable f100994f;

    /* renamed from: f0 */
    private int f100995f0;

    /* renamed from: g */
    private Drawable f100996g;

    /* renamed from: g0 */
    private Drawable f100997g0;

    /* renamed from: h */
    private View f100998h;

    /* renamed from: h0 */
    private EnumC17020n f100999h0;

    /* renamed from: i */
    private View f101000i;

    /* renamed from: i0 */
    private ArrayList f101001i0;

    /* renamed from: j */
    private Message f101002j;

    /* renamed from: j0 */
    private ArrayList f101003j0;

    /* renamed from: k */
    private Message f101004k;

    /* renamed from: k0 */
    private View f101005k0;

    /* renamed from: l */
    private Message f101006l;

    /* renamed from: l0 */
    private int f101007l0;

    /* renamed from: m */
    private ScrollView f101008m;

    /* renamed from: m0 */
    private float f101009m0;

    /* renamed from: n */
    private Handler f101010n;

    /* renamed from: n0 */
    private final float f101011n0;

    /* renamed from: o */
    private boolean f101012o;

    /* renamed from: o0 */
    private C16972e0.b f101013o0;

    /* renamed from: p */
    private View f101014p;

    /* renamed from: p0 */
    private int f101015p0;

    /* renamed from: q */
    private BoundedScrollView f101016q;

    /* renamed from: q0 */
    private ArrayList f101017q0;

    /* renamed from: r */
    private boolean f101018r;

    /* renamed from: r0 */
    private View.OnClickListener f101019r0;

    /* renamed from: s */
    private boolean f101020s;

    /* renamed from: t */
    private ButtonWithProgress f101021t;

    /* renamed from: u */
    private ButtonWithProgress f101022u;

    /* renamed from: v */
    private ButtonWithProgress f101023v;

    /* renamed from: w */
    private CharSequence f101024w;

    /* renamed from: x */
    private CharSequence f101025x;

    /* renamed from: y */
    private CharSequence f101026y;

    /* renamed from: z */
    private String f101027z;

    /* renamed from: ii0.c$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: A */
        private InterfaceC17463d.d f101028A;

        /* renamed from: B */
        private int f101029B;

        /* renamed from: C */
        private boolean f101030C;

        /* renamed from: D */
        private boolean f101031D;

        /* renamed from: E */
        private InterfaceC17463d.c f101032E;

        /* renamed from: F */
        private InterfaceC17463d.f f101033F;

        /* renamed from: G */
        private boolean f101034G;

        /* renamed from: H */
        private C16972e0.b f101035H;

        /* renamed from: I */
        private View f101036I;

        /* renamed from: J */
        private View f101037J;

        /* renamed from: K */
        private Drawable f101038K;

        /* renamed from: L */
        private float f101039L;

        /* renamed from: M */
        private ImageView.ScaleType f101040M;

        /* renamed from: N */
        private String f101041N;

        /* renamed from: O */
        private C0708i f101042O;

        /* renamed from: P */
        private String f101043P;

        /* renamed from: Q */
        private String f101044Q;

        /* renamed from: R */
        private String f101045R;

        /* renamed from: S */
        private C0708i f101046S;

        /* renamed from: T */
        private C0708i f101047T;

        /* renamed from: U */
        private C0708i f101048U;

        /* renamed from: V */
        private ArrayList f101049V;

        /* renamed from: W */
        private boolean f101050W;

        /* renamed from: X */
        private ArrayList f101051X;

        /* renamed from: Y */
        private ArrayList f101052Y;

        /* renamed from: Z */
        private View f101053Z;

        /* renamed from: a */
        private final Context f101054a;

        /* renamed from: a0 */
        private int f101055a0;

        /* renamed from: b */
        private final LayoutInflater f101056b;

        /* renamed from: b0 */
        private float f101057b0;

        /* renamed from: c */
        private Drawable f101058c;

        /* renamed from: d */
        private CharSequence f101059d;

        /* renamed from: e */
        private CharSequence f101060e;

        /* renamed from: f */
        private boolean f101061f;

        /* renamed from: g */
        private boolean f101062g;

        /* renamed from: h */
        private int f101063h;

        /* renamed from: i */
        private int f101064i;

        /* renamed from: j */
        private int f101065j;

        /* renamed from: k */
        private Drawable f101066k;

        /* renamed from: l */
        private EnumC17020n f101067l;

        /* renamed from: m */
        private CharSequence f101068m;

        /* renamed from: n */
        private InterfaceC17463d.d f101069n;

        /* renamed from: o */
        private int f101070o;

        /* renamed from: p */
        private int f101071p;

        /* renamed from: q */
        private Drawable f101072q;

        /* renamed from: r */
        private EnumC17020n f101073r;

        /* renamed from: s */
        private CharSequence f101074s;

        /* renamed from: t */
        private InterfaceC17463d.d f101075t;

        /* renamed from: u */
        private int f101076u;

        /* renamed from: v */
        private int f101077v;

        /* renamed from: w */
        private int f101078w;

        /* renamed from: x */
        private Drawable f101079x;

        /* renamed from: y */
        private EnumC17020n f101080y;

        /* renamed from: z */
        private CharSequence f101081z;

        /* renamed from: ii0.c$a$a */
        /* loaded from: classes7.dex */
        public /* synthetic */ class C32842a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f101082a;

            static {
                int[] iArr = new int[C16972e0.b.values().length];
                try {
                    iArr[C16972e0.b.DIALOG_INFORMATION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C16972e0.b.DIALOG_PROMOTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C16972e0.b.POPUP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[C16972e0.b.CUSTOM_HUG_CONTENT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[C16972e0.b.CUSTOM_FIX_HEIGHT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f101082a = iArr;
            }
        }

        public a(Context context) {
            AbstractC19074t.m100208f(context, "mContext");
            this.f101054a = context;
            this.f101063h = AbstractC2814h.ButtonMedium_Tertiary;
            this.f101064i = AbstractC2814h.ButtonMedium_Primary;
            EnumC17020n enumC17020n = EnumC17020n.LEADING;
            this.f101067l = enumC17020n;
            int i11 = AbstractC2814h.ButtonMedium_TertiaryNeutral;
            this.f101070o = i11;
            this.f101073r = enumC17020n;
            this.f101076u = i11;
            this.f101077v = AbstractC2814h.ButtonMedium_Tertiary;
            this.f101080y = enumC17020n;
            this.f101029B = 2;
            this.f101030C = true;
            this.f101031D = true;
            this.f101034G = true;
            this.f101035H = C16972e0.b.DIALOG_INFORMATION;
            this.f101049V = new ArrayList();
            this.f101051X = new ArrayList();
            this.f101052Y = new ArrayList();
            this.f101057b0 = 0.5f;
            Object systemService = context.getSystemService("layout_inflater");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            this.f101056b = (LayoutInflater) systemService;
        }

        /* renamed from: b */
        private final void m106934b(C20562c c20562c) {
            c20562c.m106873P(this.f101053Z);
            c20562c.m106927S(this.f101055a0);
            c20562c.m106928T(this.f101057b0);
        }

        /* renamed from: c */
        private final void m106935c(C20562c c20562c) {
            c20562c.m106929U(this.f101035H);
            if (this.f101059d != null) {
                c20562c.m106933a0(this.f101029B);
                CharSequence charSequence = this.f101059d;
                AbstractC19074t.m100205c(charSequence);
                c20562c.m106932Z(charSequence);
            }
            CharSequence charSequence2 = this.f101060e;
            if (charSequence2 != null) {
                AbstractC19074t.m100205c(charSequence2);
                c20562c.m106930X(charSequence2);
            }
            Drawable drawable = this.f101058c;
            if (drawable != null) {
                c20562c.m106931Y(drawable);
            }
            CharSequence charSequence3 = this.f101068m;
            if (charSequence3 != null) {
                c20562c.m106924N(-1, charSequence3, this.f101069n, null);
                c20562c.f101027z = this.f101043P;
                c20562c.f100960C = this.f101046S;
            }
            CharSequence charSequence4 = this.f101074s;
            if (charSequence4 != null) {
                c20562c.m106924N(-2, charSequence4, this.f101075t, null);
                c20562c.f100959B = this.f101045R;
                c20562c.f100962E = this.f101048U;
            }
            CharSequence charSequence5 = this.f101081z;
            if (charSequence5 != null) {
                c20562c.m106924N(-3, charSequence5, this.f101028A, null);
                c20562c.f100958A = this.f101044Q;
                c20562c.f100961D = this.f101047T;
            }
            c20562c.m106925O(this.f101034G);
            c20562c.f101018r = this.f101061f;
            c20562c.f101020s = this.f101062g;
        }

        /* renamed from: d */
        private final void m106936d(C20562c c20562c) {
            if (!this.f101049V.isEmpty()) {
                for (View view : this.f101049V) {
                    if (view instanceof CheckBox) {
                        c20562c.m106917E((CheckBox) view);
                    } else if (view instanceof TextField) {
                        c20562c.m106919G((TextField) view);
                    }
                }
                this.f101049V.clear();
            }
            c20562c.m106881c0(this.f101036I);
            c20562c.m106874R(this.f101037J);
            c20562c.f101003j0.addAll(this.f101051X);
            c20562c.f100985a0 = this.f101066k;
            c20562c.f100987b0 = this.f101067l;
            int i11 = this.f101065j;
            if (i11 == 0) {
                i11 = this.f101063h;
            }
            c20562c.f100983Z = i11;
            c20562c.f100991d0 = this.f101079x;
            c20562c.f100993e0 = this.f101080y;
            int i12 = this.f101078w;
            if (i12 == 0) {
                i12 = this.f101076u;
            }
            c20562c.f100989c0 = i12;
            c20562c.f100997g0 = this.f101072q;
            c20562c.f100999h0 = this.f101073r;
            int i13 = this.f101071p;
            if (i13 == 0) {
                i13 = this.f101070o;
            }
            c20562c.f100995f0 = i13;
            this.f101051X.clear();
        }

        /* renamed from: e */
        private final void m106937e(C20562c c20562c) {
            c20562c.f100980W = this.f101050W;
            c20562c.m106879b0(this.f101038K);
            int i11 = this.f101065j;
            if (i11 == 0) {
                i11 = this.f101064i;
            }
            c20562c.f100983Z = i11;
            int i12 = this.f101071p;
            if (i12 == 0) {
                i12 = this.f101070o;
            }
            c20562c.f100995f0 = i12;
            int i13 = this.f101078w;
            if (i13 == 0) {
                i13 = this.f101077v;
            }
            c20562c.f100989c0 = i13;
            c20562c.m106881c0(this.f101036I);
            c20562c.m106874R(this.f101037J);
            c20562c.f101001i0.addAll(this.f101052Y);
            c20562c.f101003j0.addAll(this.f101051X);
            c20562c.m106875V(this.f101039L);
            c20562c.m106876W(this.f101040M);
            this.f101052Y.clear();
            this.f101051X.clear();
            this.f101031D = false;
        }

        /* renamed from: A */
        public final void m106938A(int i11) {
            this.f101065j = i11;
        }

        /* renamed from: B */
        public final void m106939B(CharSequence charSequence) {
            this.f101068m = charSequence;
        }

        /* renamed from: C */
        public final void m106940C(C0708i c0708i) {
            this.f101042O = c0708i;
        }

        /* renamed from: D */
        public final void m106941D(String str) {
            this.f101041N = str;
        }

        /* renamed from: E */
        public final void m106942E(C0708i c0708i) {
            this.f101048U = c0708i;
        }

        /* renamed from: F */
        public final void m106943F(String str) {
            this.f101045R = str;
        }

        /* renamed from: G */
        public final void m106944G(String str) {
            this.f101044Q = str;
        }

        /* renamed from: H */
        public final void m106945H(C0708i c0708i) {
            this.f101046S = c0708i;
        }

        /* renamed from: I */
        public final void m106946I(String str) {
            this.f101043P = str;
        }

        /* renamed from: J */
        public final void m106947J(float f11) {
            this.f101039L = f11;
        }

        /* renamed from: K */
        public final void m106948K(CharSequence charSequence) {
            this.f101060e = charSequence;
        }

        /* renamed from: L */
        public final void m106949L(CharSequence charSequence) {
            this.f101059d = charSequence;
        }

        /* renamed from: M */
        public final void m106950M(Drawable drawable) {
            this.f101038K = drawable;
        }

        /* renamed from: N */
        public final void m106951N(View view) {
            this.f101036I = view;
        }

        /* renamed from: O */
        public final void m106952O(boolean z11) {
            this.f101062g = z11;
        }

        /* renamed from: P */
        public final void m106953P(boolean z11) {
            this.f101061f = z11;
        }

        /* renamed from: a */
        public final void m106954a(C20562c c20562c) {
            AbstractC19074t.m100208f(c20562c, "dialog");
            m106935c(c20562c);
            int i11 = C32842a.f101082a[this.f101035H.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    c20562c.m106879b0(this.f101038K);
                    return;
                }
                if (i11 != 3) {
                    if (i11 == 4) {
                        c20562c.m106873P(this.f101053Z);
                        return;
                    } else {
                        if (i11 == 5) {
                            m106934b(c20562c);
                            return;
                        }
                        return;
                    }
                }
                m106937e(c20562c);
                return;
            }
            m106936d(c20562c);
        }

        /* renamed from: f */
        public final ArrayList m106955f() {
            return this.f101051X;
        }

        /* renamed from: g */
        public final ArrayList m106956g() {
            return this.f101049V;
        }

        /* renamed from: h */
        public final boolean m106957h() {
            return this.f101031D;
        }

        /* renamed from: i */
        public final boolean m106958i() {
            return this.f101030C;
        }

        /* renamed from: j */
        public final Context m106959j() {
            return this.f101054a;
        }

        /* renamed from: k */
        public final InterfaceC17463d.c m106960k() {
            return this.f101032E;
        }

        /* renamed from: l */
        public final InterfaceC17463d.f m106961l() {
            return this.f101033F;
        }

        /* renamed from: m */
        public final C0708i m106962m() {
            return this.f101042O;
        }

        /* renamed from: n */
        public final String m106963n() {
            return this.f101041N;
        }

        /* renamed from: o */
        public final void m106964o(View view) {
            this.f101037J = view;
        }

        /* renamed from: p */
        public final void m106965p(boolean z11) {
            this.f101034G = z11;
        }

        /* renamed from: q */
        public final void m106966q(C16972e0.b bVar) {
            AbstractC19074t.m100208f(bVar, "<set-?>");
            this.f101035H = bVar;
        }

        /* renamed from: r */
        public final void m106967r(InterfaceC17463d.d dVar) {
            this.f101075t = dVar;
        }

        /* renamed from: s */
        public final void m106968s(int i11) {
            this.f101071p = i11;
        }

        /* renamed from: t */
        public final void m106969t(CharSequence charSequence) {
            this.f101074s = charSequence;
        }

        /* renamed from: u */
        public final void m106970u(InterfaceC17463d.d dVar) {
            this.f101028A = dVar;
        }

        /* renamed from: v */
        public final void m106971v(int i11) {
            this.f101078w = i11;
        }

        /* renamed from: w */
        public final void m106972w(CharSequence charSequence) {
            this.f101081z = charSequence;
        }

        /* renamed from: x */
        public final void m106973x(Drawable drawable) {
            this.f101066k = drawable;
        }

        /* renamed from: y */
        public final void m106974y(EnumC17020n enumC17020n) {
            AbstractC19074t.m100208f(enumC17020n, "<set-?>");
            this.f101067l = enumC17020n;
        }

        /* renamed from: z */
        public final void m106975z(InterfaceC17463d.d dVar) {
            this.f101069n = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ii0.c$b */
    /* loaded from: classes7.dex */
    public static final class b extends Handler {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private WeakReference f101083a;

        /* renamed from: ii0.c$b$a */
        /* loaded from: classes7.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public b(InterfaceC17463d interfaceC17463d) {
            AbstractC19074t.m100208f(interfaceC17463d, "dialog");
            this.f101083a = new WeakReference(interfaceC17463d);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            int i11 = message.what;
            if (i11 != -4 && i11 != -3 && i11 != -2 && i11 != -1) {
                if (i11 == 1) {
                    Object obj = message.obj;
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.zview.dialog.DialogInterface");
                    ((InterfaceC17463d) obj).dismiss();
                    return;
                }
                return;
            }
            Object obj2 = message.obj;
            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type com.zing.zalo.zview.dialog.DialogInterface.OnClickListener");
            ((InterfaceC17463d.d) obj2).mo605K8((InterfaceC17463d) this.f101083a.get(), message.what);
        }
    }

    /* renamed from: ii0.c$c */
    /* loaded from: classes7.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ii0.c$d */
    /* loaded from: classes7.dex */
    public /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f101084a;

        static {
            int[] iArr = new int[C16972e0.b.values().length];
            try {
                iArr[C16972e0.b.DIALOG_INFORMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C16972e0.b.DIALOG_PROMOTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C16972e0.b.POPUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C16972e0.b.CUSTOM_HUG_CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C16972e0.b.CUSTOM_FIX_HEIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f101084a = iArr;
        }
    }

    /* renamed from: ii0.c$e */
    /* loaded from: classes7.dex */
    public static final class e implements ViewPager.InterfaceC2061i {
        e() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2061i
        public void onPageScrollStateChanged(int i11) {
            PageIndicator pageIndicator;
            if (i11 == 0 && C20562c.this.f100979V != null && (pageIndicator = C20562c.this.f100977T) != null) {
                ViewPager viewPager = C20562c.this.f100978U;
                AbstractC19074t.m100205c(viewPager);
                pageIndicator.setIndexSelectedDot(viewPager.getCurrentItem());
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2061i
        public void onPageScrolled(int i11, float f11, int i12) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2061i
        public void onPageSelected(int i11) {
        }
    }

    /* renamed from: ii0.c$f */
    /* loaded from: classes7.dex */
    public static final class f extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ int f101086a;

        f(int i11) {
            this.f101086a = i11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (outline != null) {
                AbstractC19074t.m100205c(view);
                int width = view.getWidth();
                int height = view.getHeight();
                int i11 = this.f101086a;
                outline.setRoundRect(0, 0, width, height + i11, i11);
            }
        }
    }

    /* renamed from: ii0.c$g */
    /* loaded from: classes7.dex */
    public static final class g extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ int f101087a;

        g(int i11) {
            this.f101087a = i11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (outline != null) {
                AbstractC19074t.m100205c(view);
                int width = view.getWidth();
                int height = view.getHeight();
                int i11 = this.f101087a;
                outline.setRoundRect(0, 0, width, height + i11, i11);
            }
        }
    }

    /* renamed from: ii0.c$h */
    /* loaded from: classes7.dex */
    public static final class h extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ int f101088a;

        h(int i11) {
            this.f101088a = i11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (outline != null) {
                AbstractC19074t.m100205c(view);
                int width = view.getWidth();
                int height = view.getHeight();
                int i11 = this.f101088a;
                outline.setRoundRect(0, 0, width, height + i11, i11);
            }
        }
    }

    /* renamed from: ii0.c$i */
    /* loaded from: classes7.dex */
    public static final class i extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ int f101089a;

        i(int i11) {
            this.f101089a = i11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (outline != null) {
                AbstractC19074t.m100205c(view);
                int width = view.getWidth();
                int height = view.getHeight();
                int i11 = this.f101089a;
                outline.setRoundRect(0, 0, width, height + i11, i11);
            }
        }
    }

    public C20562c(Context context, InterfaceC17463d interfaceC17463d, C17465f c17465f) {
        AbstractC19074t.m100208f(interfaceC17463d, "di");
        this.f100986b = interfaceC17463d;
        this.f100988c = c17465f;
        this.f101012o = true;
        this.f101024w = "";
        this.f101025x = "";
        this.f101026y = "";
        this.f100983Z = AbstractC2814h.ButtonMedium_Tertiary;
        EnumC17020n enumC17020n = EnumC17020n.LEADING;
        this.f100987b0 = enumC17020n;
        int i11 = AbstractC2814h.ButtonMedium_TertiaryNeutral;
        this.f100989c0 = i11;
        this.f100993e0 = enumC17020n;
        this.f100995f0 = i11;
        this.f100999h0 = enumC17020n;
        this.f101001i0 = new ArrayList();
        this.f101003j0 = new ArrayList();
        this.f101009m0 = 0.5f;
        this.f101011n0 = 0.8f;
        this.f101013o0 = C16972e0.b.DIALOG_INFORMATION;
        this.f101015p0 = 1;
        this.f101017q0 = new ArrayList();
        this.f101019r0 = new View.OnClickListener() { // from class: ii0.b
            public /* synthetic */ ViewOnClickListenerC20561b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20562c.m106872K(C20562c.this, view);
            }
        };
        if (context == null) {
            context = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(context, "getAppContext()");
        }
        this.f100984a = context;
        this.f101010n = new b(interfaceC17463d);
    }

    /* renamed from: H */
    private final void m106871H(View view) {
        if (!this.f101017q0.contains(view)) {
            this.f101017q0.add(view);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = C27276c.m139649b(this.f100984a, 16);
        LinearLayout linearLayout = this.f100967J;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            linearLayout.addView(view, layoutParams);
            linearLayout.setPadding(linearLayout.getPaddingLeft(), C27276c.m139649b(this.f100984a, 4), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:            if (fn0.AbstractC19074t.m100204b(r2, r0.getButton()) != false) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:            if (fn0.AbstractC19074t.m100204b(r2, r0.getButton()) != false) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:            if (fn0.AbstractC19074t.m100204b(r2, r0.getButton()) != false) goto L45;     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m106872K(C20562c c20562c, View view) {
        Message message;
        AbstractC19074t.m100208f(c20562c, "this$0");
        ButtonWithProgress buttonWithProgress = c20562c.f101021t;
        if (buttonWithProgress != null) {
            if (!AbstractC19074t.m100204b(view, buttonWithProgress)) {
                ButtonWithProgress buttonWithProgress2 = c20562c.f101021t;
                AbstractC19074t.m100205c(buttonWithProgress2);
            }
            Message message2 = c20562c.f101002j;
            if (message2 != null) {
                message = Message.obtain(message2);
                if (message != null) {
                    message.sendToTarget();
                }
                if (!c20562c.f101012o) {
                    Handler handler = c20562c.f101010n;
                    AbstractC19074t.m100205c(handler);
                    handler.obtainMessage(1, c20562c.f100986b).sendToTarget();
                    return;
                }
                return;
            }
        }
        ButtonWithProgress buttonWithProgress3 = c20562c.f101023v;
        if (buttonWithProgress3 != null) {
            if (!AbstractC19074t.m100204b(view, buttonWithProgress3)) {
                ButtonWithProgress buttonWithProgress4 = c20562c.f101023v;
                AbstractC19074t.m100205c(buttonWithProgress4);
            }
            Message message3 = c20562c.f101004k;
            if (message3 != null) {
                message = Message.obtain(message3);
                if (message != null) {
                }
                if (!c20562c.f101012o) {
                }
            }
        }
        ButtonWithProgress buttonWithProgress5 = c20562c.f101022u;
        if (buttonWithProgress5 != null) {
            if (!AbstractC19074t.m100204b(view, buttonWithProgress5)) {
                ButtonWithProgress buttonWithProgress6 = c20562c.f101022u;
                AbstractC19074t.m100205c(buttonWithProgress6);
            }
            Message message4 = c20562c.f101006l;
            if (message4 != null) {
                message = Message.obtain(message4);
                if (message != null) {
                }
                if (!c20562c.f101012o) {
                }
            }
        }
        message = null;
        if (message != null) {
        }
        if (!c20562c.f101012o) {
        }
    }

    /* renamed from: P */
    public final void m106873P(View view) {
        this.f101005k0 = view;
        C16972e0.b bVar = this.f101013o0;
        if ((bVar != C16972e0.b.CUSTOM_FIX_HEIGHT && bVar != C16972e0.b.CUSTOM_HUG_CONTENT) || view == null) {
            return;
        }
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
        View view2 = this.f101014p;
        if (view2 != null) {
            View view3 = null;
            if (view2 == null) {
                AbstractC19074t.m100223u("layout");
                view2 = null;
            }
            if (view2 instanceof BoundedLinearLayout) {
                View view4 = this.f101014p;
                if (view4 == null) {
                    AbstractC19074t.m100223u("layout");
                } else {
                    view3 = view4;
                }
                ((BoundedLinearLayout) view3).addView(view);
            }
        }
    }

    /* renamed from: R */
    public final void m106874R(View view) {
        LinearLayout linearLayout;
        this.f101000i = view;
        C16972e0.b bVar = this.f101013o0;
        if (bVar == C16972e0.b.DIALOG_INFORMATION) {
            LinearLayout linearLayout2 = this.f100970M;
            if (linearLayout2 == null) {
                return;
            }
            if (view == null) {
                AbstractC19074t.m100205c(linearLayout2);
                linearLayout2.setVisibility(8);
                return;
            }
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(view);
            }
            LinearLayout linearLayout3 = this.f100970M;
            AbstractC19074t.m100205c(linearLayout3);
            linearLayout3.addView(view);
            LinearLayout linearLayout4 = this.f100970M;
            AbstractC19074t.m100205c(linearLayout4);
            linearLayout4.setVisibility(0);
            return;
        }
        if (bVar != C16972e0.b.POPUP || (linearLayout = this.f100975R) == null) {
            return;
        }
        if (view == null) {
            AbstractC19074t.m100205c(linearLayout);
            linearLayout.setVisibility(8);
            return;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (view.getParent() != null) {
            ViewParent parent2 = view.getParent();
            AbstractC19074t.m100206d(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent2).removeView(view);
        }
        LinearLayout linearLayout5 = this.f100975R;
        AbstractC19074t.m100205c(linearLayout5);
        linearLayout5.addView(view);
        LinearLayout linearLayout6 = this.f100975R;
        AbstractC19074t.m100205c(linearLayout6);
        linearLayout6.setVisibility(0);
    }

    /* renamed from: V */
    public final void m106875V(float f11) {
        this.f100981X = f11;
    }

    /* renamed from: W */
    public final void m106876W(ImageView.ScaleType scaleType) {
        this.f100982Y = scaleType;
    }

    /* renamed from: b0 */
    public final void m106879b0(Drawable drawable) {
        RatioImageView ratioImageView;
        this.f100996g = drawable;
        C16972e0.b bVar = this.f101013o0;
        if (bVar == C16972e0.b.DIALOG_PROMOTION) {
            RatioImageView ratioImageView2 = this.f100971N;
            if (ratioImageView2 != null && this.f100972O != null) {
                if (drawable == null) {
                    m106905o0(true);
                    return;
                }
                AbstractC19074t.m100205c(ratioImageView2);
                ratioImageView2.setImageDrawable(drawable);
                RatioImageView ratioImageView3 = this.f100971N;
                AbstractC19074t.m100205c(ratioImageView3);
                ratioImageView3.setVisibility(0);
                LinearLayout linearLayout = this.f100972O;
                AbstractC19074t.m100205c(linearLayout);
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        if (bVar != C16972e0.b.POPUP || (ratioImageView = this.f100971N) == null || drawable == null) {
            return;
        }
        AbstractC19074t.m100205c(ratioImageView);
        ratioImageView.setImageDrawable(drawable);
        RatioImageView ratioImageView4 = this.f100971N;
        AbstractC19074t.m100205c(ratioImageView4);
        ratioImageView4.setVisibility(0);
    }

    /* renamed from: c0 */
    public final void m106881c0(View view) {
        FrameLayout frameLayout;
        this.f100998h = view;
        C16972e0.b bVar = this.f101013o0;
        if (bVar == C16972e0.b.DIALOG_INFORMATION) {
            FrameLayout frameLayout2 = this.f100968K;
            if (frameLayout2 == null) {
                return;
            }
            if (view == null) {
                AbstractC19074t.m100205c(frameLayout2);
                frameLayout2.setVisibility(8);
                return;
            }
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(view);
            }
            FrameLayout frameLayout3 = this.f100968K;
            AbstractC19074t.m100205c(frameLayout3);
            frameLayout3.addView(view);
            FrameLayout frameLayout4 = this.f100968K;
            AbstractC19074t.m100205c(frameLayout4);
            frameLayout4.setVisibility(0);
            return;
        }
        if (bVar != C16972e0.b.POPUP || (frameLayout = this.f100968K) == null) {
            return;
        }
        if (view == null) {
            AbstractC19074t.m100205c(frameLayout);
            frameLayout.setVisibility(8);
            return;
        }
        RatioImageView ratioImageView = this.f100971N;
        if (ratioImageView != null) {
            ratioImageView.setVisibility(8);
        }
        if (view.getParent() != null) {
            ViewParent parent2 = view.getParent();
            AbstractC19074t.m100206d(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent2).removeView(view);
        }
        FrameLayout frameLayout5 = this.f100968K;
        AbstractC19074t.m100205c(frameLayout5);
        frameLayout5.addView(view);
        FrameLayout frameLayout6 = this.f100968K;
        AbstractC19074t.m100205c(frameLayout6);
        frameLayout6.setVisibility(0);
    }

    /* renamed from: d0 */
    private final void m106883d0(boolean z11) {
        if (this.f101013o0 != C16972e0.b.POPUP) {
            return;
        }
        this.f100980W = z11;
        if (z11) {
            ViewPager viewPager = this.f100978U;
            if (viewPager != null) {
                viewPager.setVisibility(0);
            }
            LinearLayout linearLayout = this.f100974Q;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        ViewPager viewPager2 = this.f100978U;
        if (viewPager2 != null) {
            viewPager2.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f100974Q;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
    }

    /* renamed from: e0 */
    private final void m106885e0() {
        int i11;
        int m139649b = C27276c.m139649b(this.f100984a, 48);
        m106901m0();
        ButtonWithProgress buttonWithProgress = this.f101021t;
        if (buttonWithProgress != null) {
            if (this.f100983Z == AbstractC2814h.ButtonMedium_Tertiary) {
                Button button = buttonWithProgress.getButton();
                if (this.f101020s) {
                    i11 = AbstractC2814h.ButtonMedium_TertiaryDanger;
                } else {
                    i11 = AbstractC2814h.ButtonMedium_Tertiary;
                }
                button.m90539c(i11);
            } else {
                buttonWithProgress.getButton().m90539c(this.f100983Z);
            }
            buttonWithProgress.getButton().setMinWidth(m139649b);
        }
        m106899l0();
        ButtonWithProgress buttonWithProgress2 = this.f101022u;
        if (buttonWithProgress2 != null) {
            buttonWithProgress2.getButton().setMinWidth(m139649b);
        }
        m106897k0();
        ButtonWithProgress buttonWithProgress3 = this.f101023v;
        if (buttonWithProgress3 != null) {
            buttonWithProgress3.getButton().setMinWidth(m139649b);
        }
        if (this.f101018r) {
            LinearLayout linearLayout = this.f100965H;
            if (linearLayout instanceof ModalButtonBarLayout) {
                AbstractC19074t.m100206d(linearLayout, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.modal.ModalButtonBarLayout");
                ((ModalButtonBarLayout) linearLayout).setUseVerticalLayout(true);
            }
        }
    }

    /* renamed from: f0 */
    private final void m106887f0() {
        m106901m0();
        m106897k0();
    }

    /* renamed from: g0 */
    private final void m106889g0() {
        CharSequence charSequence = this.f100990d;
        CharSequence charSequence2 = "";
        if (charSequence == null) {
            charSequence = "";
        }
        m106932Z(charSequence);
        CharSequence charSequence3 = this.f100992e;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        m106930X(charSequence2);
        RobotoTextView robotoTextView = this.f100963F;
        if (robotoTextView != null) {
            robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
        RobotoTextView robotoTextView2 = this.f100964G;
        if (robotoTextView2 != null) {
            robotoTextView2.setSingleLine(false);
        }
        int i11 = d.f101084a[this.f101013o0.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            View view = this.f101005k0;
                            if (view != null) {
                                m106873P(view);
                            }
                            View view2 = null;
                            if (this.f101007l0 != 0) {
                                View view3 = this.f101014p;
                                if (view3 == null) {
                                    AbstractC19074t.m100223u("layout");
                                    view3 = null;
                                }
                                ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                                layoutParams.height = this.f101007l0;
                                View view4 = this.f101014p;
                                if (view4 == null) {
                                    AbstractC19074t.m100223u("layout");
                                } else {
                                    view2 = view4;
                                }
                                view2.setLayoutParams(layoutParams);
                            } else {
                                int min = (int) (Math.min(this.f101009m0, this.f101011n0) * Resources.getSystem().getDisplayMetrics().heightPixels);
                                View view5 = this.f101014p;
                                if (view5 == null) {
                                    AbstractC19074t.m100223u("layout");
                                    view5 = null;
                                }
                                ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
                                layoutParams2.height = min;
                                View view6 = this.f101014p;
                                if (view6 == null) {
                                    AbstractC19074t.m100223u("layout");
                                } else {
                                    view2 = view6;
                                }
                                view2.setLayoutParams(layoutParams2);
                            }
                        }
                    } else {
                        View view7 = this.f101005k0;
                        if (view7 != null) {
                            m106873P(view7);
                        }
                    }
                } else {
                    m106893i0();
                }
            } else {
                m106895j0();
            }
        } else {
            m106891h0();
        }
        ViewPager viewPager = this.f100978U;
        if (viewPager != null) {
            viewPager.m11198c(new e());
        }
    }

    /* renamed from: h0 */
    private final void m106891h0() {
        LinearLayout linearLayout = this.f100967J;
        if (linearLayout != null) {
            linearLayout.setOrientation(1);
        }
        m106931Y(this.f100994f);
        for (View view : this.f101017q0) {
            if (view instanceof CheckBox) {
                m106917E((CheckBox) view);
            } else if (view instanceof TextField) {
                m106919G((TextField) view);
            }
        }
        LinearLayout linearLayout2 = this.f100965H;
        if (linearLayout2 != null) {
            linearLayout2.setGravity(5);
        }
        int m139649b = C27276c.m139649b(this.f100984a, 12);
        FrameLayout frameLayout = this.f100968K;
        if (frameLayout != null) {
            frameLayout.setOutlineProvider(new f(m139649b));
        }
        FrameLayout frameLayout2 = this.f100968K;
        if (frameLayout2 != null) {
            frameLayout2.setClipToOutline(true);
        }
        m106881c0(this.f100998h);
        m106874R(this.f101000i);
        for (Map map : this.f101003j0) {
            for (CharSequence charSequence : map.keySet()) {
                m106918F(charSequence, (Drawable) map.get(charSequence));
            }
        }
        this.f101003j0.clear();
    }

    /* renamed from: i0 */
    private final void m106893i0() {
        RatioImageView ratioImageView;
        int m139649b = C27276c.m139649b(this.f100984a, 12);
        this.f101018r = true;
        ViewPager viewPager = this.f100978U;
        if (viewPager != null) {
            viewPager.setOutlineProvider(new g(m139649b));
        }
        ViewPager viewPager2 = this.f100978U;
        if (viewPager2 != null) {
            viewPager2.setClipToOutline(true);
        }
        LinearLayout linearLayout = this.f100974Q;
        if (linearLayout != null) {
            linearLayout.setOutlineProvider(new h(m139649b));
        }
        LinearLayout linearLayout2 = this.f100974Q;
        if (linearLayout2 != null) {
            linearLayout2.setClipToOutline(true);
        }
        View view = this.f100998h;
        if (view != null) {
            m106881c0(view);
        } else {
            m106879b0(this.f100996g);
            RatioImageView ratioImageView2 = this.f100971N;
            if (ratioImageView2 != null) {
                float f11 = this.f100981X;
                if (f11 == 0.0f) {
                    f11 = 1.7777778f;
                }
                ratioImageView2.setRatio(f11);
            }
            ImageView.ScaleType scaleType = this.f100982Y;
            if (scaleType != null && (ratioImageView = this.f100971N) != null) {
                ratioImageView.setScaleType(scaleType);
            }
        }
        m106883d0(this.f100980W);
        m106926Q(this.f101001i0);
        View view2 = this.f101000i;
        if (view2 != null) {
            m106874R(view2);
        }
        for (Map map : this.f101003j0) {
            for (CharSequence charSequence : map.keySet()) {
                m106918F(charSequence, (Drawable) map.get(charSequence));
            }
        }
        this.f101003j0.clear();
    }

    /* renamed from: j0 */
    private final void m106895j0() {
        RatioImageView ratioImageView;
        int m139649b = C27276c.m139649b(this.f100984a, 12);
        LinearLayout linearLayout = this.f100973P;
        if (linearLayout != null) {
            linearLayout.setOutlineProvider(new i(m139649b));
        }
        LinearLayout linearLayout2 = this.f100973P;
        if (linearLayout2 != null) {
            linearLayout2.setClipToOutline(true);
        }
        RatioImageView ratioImageView2 = this.f100971N;
        if (ratioImageView2 != null) {
            ratioImageView2.setRatio(1.7777778f);
        }
        ImageView.ScaleType scaleType = this.f100982Y;
        if (scaleType != null && (ratioImageView = this.f100971N) != null) {
            ratioImageView.setScaleType(scaleType);
        }
        LinearLayout linearLayout3 = this.f100965H;
        if (linearLayout3 != null) {
            linearLayout3.setGravity(5);
        }
        m106879b0(this.f100996g);
    }

    /* renamed from: k0 */
    private final void m106897k0() {
        ButtonWithProgress buttonWithProgress;
        View view = this.f101014p;
        if (view == null) {
            AbstractC19074t.m100223u("layout");
            view = null;
        }
        ButtonWithProgress buttonWithProgress2 = (ButtonWithProgress) view.findViewById(AbstractC2811e.btn_negative_modal);
        this.f101023v = buttonWithProgress2;
        if (buttonWithProgress2 != null) {
            buttonWithProgress2.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f101026y) && (buttonWithProgress = this.f101023v) != null) {
            buttonWithProgress.setVisibility(0);
            buttonWithProgress.getButton().m90539c(this.f100995f0);
            buttonWithProgress.getButton().setText(this.f101026y);
            buttonWithProgress.getButton().setSupportiveIconPosition(this.f100999h0);
            buttonWithProgress.getButton().setSupportiveIcon(this.f100997g0);
            String str = this.f100959B;
            if (str != null) {
                AbstractC19074t.m100205c(str);
                buttonWithProgress.setIdTracking(str);
                C0708i c0708i = this.f100962E;
                if (c0708i != null) {
                    buttonWithProgress.setTrackingExtraData(c0708i);
                }
            }
            buttonWithProgress.setOnClickListener(this.f101019r0);
        }
    }

    /* renamed from: l0 */
    private final void m106899l0() {
        ButtonWithProgress buttonWithProgress;
        View view = this.f101014p;
        if (view == null) {
            AbstractC19074t.m100223u("layout");
            view = null;
        }
        ButtonWithProgress buttonWithProgress2 = (ButtonWithProgress) view.findViewById(AbstractC2811e.btn_neutral_modal);
        this.f101022u = buttonWithProgress2;
        if (buttonWithProgress2 != null) {
            buttonWithProgress2.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f101025x) && (buttonWithProgress = this.f101022u) != null) {
            buttonWithProgress.setVisibility(0);
            buttonWithProgress.getButton().m90539c(this.f100989c0);
            buttonWithProgress.getButton().setText(this.f101025x);
            buttonWithProgress.getButton().setSupportiveIconPosition(this.f100993e0);
            buttonWithProgress.getButton().setSupportiveIcon(this.f100991d0);
            String str = this.f100958A;
            if (str != null) {
                AbstractC19074t.m100205c(str);
                buttonWithProgress.setIdTracking(str);
                C0708i c0708i = this.f100961D;
                if (c0708i != null) {
                    buttonWithProgress.setTrackingExtraData(c0708i);
                }
            }
            buttonWithProgress.setOnClickListener(this.f101019r0);
        }
    }

    /* renamed from: m0 */
    private final void m106901m0() {
        ButtonWithProgress buttonWithProgress;
        View view = this.f101014p;
        if (view == null) {
            AbstractC19074t.m100223u("layout");
            view = null;
        }
        ButtonWithProgress buttonWithProgress2 = (ButtonWithProgress) view.findViewById(AbstractC2811e.btn_positive_modal);
        this.f101021t = buttonWithProgress2;
        if (buttonWithProgress2 != null) {
            buttonWithProgress2.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f101024w) && (buttonWithProgress = this.f101021t) != null) {
            buttonWithProgress.setVisibility(0);
            buttonWithProgress.getButton().m90539c(this.f100983Z);
            buttonWithProgress.getButton().setText(this.f101024w);
            buttonWithProgress.getButton().setSupportiveIconPosition(this.f100987b0);
            buttonWithProgress.getButton().setSupportiveIcon(this.f100985a0);
            String str = this.f101027z;
            if (str != null) {
                AbstractC19074t.m100205c(str);
                buttonWithProgress.setIdTracking(str);
                C0708i c0708i = this.f100960C;
                if (c0708i != null) {
                    buttonWithProgress.setTrackingExtraData(c0708i);
                }
            }
            buttonWithProgress.setOnClickListener(this.f101019r0);
        }
    }

    /* renamed from: n0 */
    private final void m106903n0() {
        int m139649b = C27276c.m139649b(this.f100984a, 272);
        View view = this.f101014p;
        View view2 = null;
        if (view == null) {
            AbstractC19074t.m100223u("layout");
            view = null;
        }
        if (view instanceof BoundedLinearLayout) {
            View view3 = this.f101014p;
            if (view3 == null) {
                AbstractC19074t.m100223u("layout");
                view3 = null;
            }
            ((BoundedLinearLayout) view3).setMaxHeight((int) (Resources.getSystem().getDisplayMetrics().heightPixels * 0.8f));
            View view4 = this.f101014p;
            if (view4 == null) {
                AbstractC19074t.m100223u("layout");
                view4 = null;
            }
            ((BoundedLinearLayout) view4).setMaxWidth(C27276c.m139649b(this.f100984a, 400));
            View view5 = this.f101014p;
            if (view5 == null) {
                AbstractC19074t.m100223u("layout");
                view5 = null;
            }
            ((BoundedLinearLayout) view5).setMinimumWidth(m139649b);
        }
        View view6 = this.f101014p;
        if (view6 == null) {
            AbstractC19074t.m100223u("layout");
            view6 = null;
        }
        this.f101016q = (BoundedScrollView) view6.findViewById(AbstractC2811e.scrollView_dialog);
        View view7 = this.f101014p;
        if (view7 == null) {
            AbstractC19074t.m100223u("layout");
            view7 = null;
        }
        this.f100963F = (RobotoTextView) view7.findViewById(AbstractC2811e.modal_title);
        View view8 = this.f101014p;
        if (view8 == null) {
            AbstractC19074t.m100223u("layout");
            view8 = null;
        }
        this.f100964G = (RobotoTextView) view8.findViewById(AbstractC2811e.dialog_subtitle);
        View view9 = this.f101014p;
        if (view9 == null) {
            AbstractC19074t.m100223u("layout");
            view9 = null;
        }
        this.f100965H = (LinearLayout) view9.findViewById(AbstractC2811e.modal_cta_custom_layout);
        View view10 = this.f101014p;
        if (view10 == null) {
            AbstractC19074t.m100223u("layout");
            view10 = null;
        }
        this.f100966I = (ImageView) view10.findViewById(AbstractC2811e.dialog_subtitle_icon);
        View view11 = this.f101014p;
        if (view11 == null) {
            AbstractC19074t.m100223u("layout");
            view11 = null;
        }
        this.f100967J = (LinearLayout) view11.findViewById(AbstractC2811e.dialog_info_content_custom_layout);
        View view12 = this.f101014p;
        if (view12 == null) {
            AbstractC19074t.m100223u("layout");
            view12 = null;
        }
        this.f100968K = (FrameLayout) view12.findViewById(AbstractC2811e.fl_topView_modal);
        View view13 = this.f101014p;
        if (view13 == null) {
            AbstractC19074t.m100223u("layout");
            view13 = null;
        }
        this.f100970M = (LinearLayout) view13.findViewById(AbstractC2811e.dialog_info_content_subtitle);
        View view14 = this.f101014p;
        if (view14 == null) {
            AbstractC19074t.m100223u("layout");
            view14 = null;
        }
        this.f100969L = (LinearLayout) view14.findViewById(AbstractC2811e.ll_dialog_subtitle);
        View view15 = this.f101014p;
        if (view15 == null) {
            AbstractC19074t.m100223u("layout");
            view15 = null;
        }
        this.f100971N = (RatioImageView) view15.findViewById(AbstractC2811e.top_image_modal);
        View view16 = this.f101014p;
        if (view16 == null) {
            AbstractC19074t.m100223u("layout");
            view16 = null;
        }
        this.f100972O = (LinearLayout) view16.findViewById(AbstractC2811e.ll_custom_image_promotion_dialog);
        View view17 = this.f101014p;
        if (view17 == null) {
            AbstractC19074t.m100223u("layout");
            view17 = null;
        }
        this.f100973P = (LinearLayout) view17.findViewById(AbstractC2811e.ll_image_promotion_dialog);
        View view18 = this.f101014p;
        if (view18 == null) {
            AbstractC19074t.m100223u("layout");
            view18 = null;
        }
        this.f100975R = (LinearLayout) view18.findViewById(AbstractC2811e.ll_pro_popup_content_subtitle);
        View view19 = this.f101014p;
        if (view19 == null) {
            AbstractC19074t.m100223u("layout");
            view19 = null;
        }
        this.f100978U = (ViewPager) view19.findViewById(AbstractC2811e.content_view_pro_popup_custom);
        View view20 = this.f101014p;
        if (view20 == null) {
            AbstractC19074t.m100223u("layout");
            view20 = null;
        }
        this.f100974Q = (LinearLayout) view20.findViewById(AbstractC2811e.ll_content_view_pro_popup);
        View view21 = this.f101014p;
        if (view21 == null) {
            AbstractC19074t.m100223u("layout");
            view21 = null;
        }
        this.f100976S = (BoundedRelativeLayout) view21.findViewById(AbstractC2811e.content_view_pro_popup);
        View view22 = this.f101014p;
        if (view22 == null) {
            AbstractC19074t.m100223u("layout");
            view22 = null;
        }
        this.f100977T = (PageIndicator) view22.findViewById(AbstractC2811e.image_popup_page_indicator);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        int min = Math.min((this.f100984a.getResources().getDisplayMetrics().widthPixels - m139649b) / 2, C27276c.m139649b(this.f100984a, 64));
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) colorDrawable, min, 0, min, 0);
        C17465f c17465f = this.f100988c;
        if (c17465f != null) {
            c17465f.m92889H(-1, -2);
            c17465f.m92888G(1);
            c17465f.m92913w(insetDrawable);
            c17465f.m92886E(0.7f);
        }
        View view23 = this.f101014p;
        if (view23 == null) {
            AbstractC19074t.m100223u("layout");
            view23 = null;
        }
        ViewGroup.LayoutParams layoutParams = view23.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        View view24 = this.f101014p;
        if (view24 == null) {
            AbstractC19074t.m100223u("layout");
        } else {
            view2 = view24;
        }
        view2.setLayoutParams(layoutParams);
        m106889g0();
        if (this.f101013o0 == C16972e0.b.POPUP) {
            m106887f0();
        } else {
            m106885e0();
        }
    }

    /* renamed from: o0 */
    private final void m106905o0(boolean z11) {
        int i11;
        RatioImageView ratioImageView = this.f100971N;
        int i12 = 0;
        if (ratioImageView != null) {
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            ratioImageView.setVisibility(i11);
        }
        LinearLayout linearLayout = this.f100972O;
        if (linearLayout != null) {
            if (!z11) {
                i12 = 8;
            }
            linearLayout.setVisibility(i12);
        }
    }

    /* renamed from: E */
    public final void m106917E(CheckBox checkBox) {
        AbstractC19074t.m100208f(checkBox, "checkBox");
        m106871H(checkBox);
    }

    /* renamed from: F */
    public final void m106918F(CharSequence charSequence, Drawable drawable) {
        AbstractC19074t.m100208f(charSequence, "des");
        C16972e0.b bVar = this.f101013o0;
        if (bVar == C16972e0.b.POPUP) {
            LinearLayout linearLayout = this.f100975R;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout2 = this.f100975R;
            if (linearLayout2 != null && linearLayout2.getChildCount() == 0) {
                layoutParams.topMargin = 0;
            } else {
                layoutParams.topMargin = C27276c.m139649b(this.f100984a, 12);
            }
            layoutParams.leftMargin = C27276c.m139649b(this.f100984a, 24);
            layoutParams.rightMargin = C27276c.m139649b(this.f100984a, 24);
            PopupDesComp popupDesComp = new PopupDesComp(this.f100984a);
            popupDesComp.setDescription(charSequence);
            popupDesComp.setImageDescriptionPopup(drawable);
            LinearLayout linearLayout3 = this.f100975R;
            if (linearLayout3 != null) {
                linearLayout3.addView(popupDesComp, layoutParams);
                return;
            }
            return;
        }
        if (bVar == C16972e0.b.DIALOG_INFORMATION) {
            LinearLayout linearLayout4 = this.f100970M;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(0);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.bottomMargin = C27276c.m139649b(this.f100984a, 12);
            PopupDesComp popupDesComp2 = new PopupDesComp(this.f100984a);
            popupDesComp2.setDescription(charSequence);
            popupDesComp2.setImageDescriptionDialog(drawable);
            LinearLayout linearLayout5 = this.f100970M;
            if (linearLayout5 != null) {
                linearLayout5.addView(popupDesComp2, layoutParams2);
            }
        }
    }

    /* renamed from: G */
    public final void m106919G(TextField textField) {
        AbstractC19074t.m100208f(textField, "textField");
        m106871H(textField);
    }

    /* renamed from: I */
    public final ButtonWithProgress m106920I(int i11) {
        if (i11 == -3) {
            return this.f101022u;
        }
        if (i11 == -2) {
            return this.f101023v;
        }
        if (i11 != -1) {
            return null;
        }
        return this.f101021t;
    }

    /* renamed from: J */
    public final void m106921J() {
        View inflate;
        LayoutInflater from = LayoutInflater.from(this.f100984a);
        int i11 = d.f101084a[this.f101013o0.ordinal()];
        View view = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            inflate = from.inflate(AbstractC2812f.layout_custom_modal, (ViewGroup) null, false);
                            AbstractC19074t.m100207e(inflate, "{\n                layout…ull, false)\n            }");
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        inflate = from.inflate(AbstractC2812f.layout_custom_modal, (ViewGroup) null, false);
                        AbstractC19074t.m100207e(inflate, "{\n                layout…ull, false)\n            }");
                    }
                } else {
                    inflate = from.inflate(AbstractC2812f.layout_promotion_popup, (ViewGroup) null, false);
                    AbstractC19074t.m100207e(inflate, "{\n                layout…ull, false)\n            }");
                }
            } else {
                inflate = from.inflate(AbstractC2812f.layout_promotion_dialog, (ViewGroup) null, false);
                AbstractC19074t.m100207e(inflate, "{\n                layout…ull, false)\n            }");
            }
        } else {
            inflate = from.inflate(AbstractC2812f.layout_information_dialog, (ViewGroup) null, false);
            AbstractC19074t.m100207e(inflate, "{\n                layout…ull, false)\n            }");
        }
        this.f101014p = inflate;
        C17465f c17465f = this.f100988c;
        if (c17465f != null) {
            if (inflate == null) {
                AbstractC19074t.m100223u("layout");
            } else {
                view = inflate;
            }
            c17465f.m92883B(view);
        }
        m106903n0();
    }

    /* renamed from: L */
    public final boolean m106922L(KeyEvent keyEvent) {
        ScrollView scrollView = this.f101008m;
        if (scrollView != null) {
            AbstractC19074t.m100205c(scrollView);
            if (scrollView.executeKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: M */
    public final boolean m106923M(KeyEvent keyEvent) {
        ScrollView scrollView = this.f101008m;
        if (scrollView != null) {
            AbstractC19074t.m100205c(scrollView);
            if (scrollView.executeKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: N */
    public final void m106924N(int i11, CharSequence charSequence, InterfaceC17463d.d dVar, Message message) {
        if (message == null && dVar != null) {
            Handler handler = this.f101010n;
            AbstractC19074t.m100205c(handler);
            message = handler.obtainMessage(i11, dVar);
        }
        if (i11 != -3) {
            if (i11 != -2) {
                if (i11 == -1) {
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    this.f101024w = charSequence;
                    this.f101002j = message;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            if (charSequence == null) {
                charSequence = "";
            }
            this.f101026y = charSequence;
            this.f101004k = message;
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        this.f101025x = charSequence;
        this.f101006l = message;
    }

    /* renamed from: O */
    public final void m106925O(boolean z11) {
        this.f101012o = z11;
    }

    /* renamed from: Q */
    public final void m106926Q(ArrayList arrayList) {
        PageIndicator pageIndicator;
        int i11;
        AbstractC19074t.m100208f(arrayList, "listView");
        if (arrayList.size() > 1 && this.f100980W) {
            pageIndicator = this.f100977T;
            if (pageIndicator != null) {
                i11 = 0;
                pageIndicator.setVisibility(i11);
            }
        } else {
            pageIndicator = this.f100977T;
            if (pageIndicator != null) {
                i11 = 8;
                pageIndicator.setVisibility(i11);
            }
        }
        if (this.f100979V == null) {
            C20563d c20563d = new C20563d();
            this.f100979V = c20563d;
            ViewPager viewPager = this.f100978U;
            if (viewPager != null) {
                viewPager.setAdapter(c20563d);
            }
        }
        C20563d c20563d2 = this.f100979V;
        AbstractC19074t.m100205c(c20563d2);
        c20563d2.m106976t(arrayList);
        PageIndicator pageIndicator2 = this.f100977T;
        if (pageIndicator2 != null) {
            pageIndicator2.setDotNumber(arrayList.size());
        }
    }

    /* renamed from: S */
    public final void m106927S(int i11) {
        if (i11 <= 0) {
            i11 = 0;
        }
        this.f101007l0 = i11;
    }

    /* renamed from: T */
    public final void m106928T(float f11) {
        if (f11 <= 0.0f || f11 >= 0.8f) {
            f11 = 0.5f;
        }
        this.f101009m0 = f11;
    }

    /* renamed from: U */
    public final void m106929U(C16972e0.b bVar) {
        AbstractC19074t.m100208f(bVar, "modalType");
        this.f101013o0 = bVar;
    }

    /* renamed from: X */
    public final void m106930X(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE);
        this.f100992e = charSequence;
        RobotoTextView robotoTextView = this.f100964G;
        if (robotoTextView == null) {
            return;
        }
        if (robotoTextView != null) {
            robotoTextView.setText(charSequence);
        }
        if (charSequence.length() == 0) {
            RobotoTextView robotoTextView2 = this.f100964G;
            if (robotoTextView2 != null) {
                robotoTextView2.setVisibility(8);
            }
            ImageView imageView = this.f100966I;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            LinearLayout linearLayout = this.f100969L;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f100969L;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        RobotoTextView robotoTextView3 = this.f100964G;
        if (robotoTextView3 != null) {
            robotoTextView3.setVisibility(0);
        }
    }

    /* renamed from: Y */
    public final void m106931Y(Drawable drawable) {
        CharSequence charSequence;
        ImageView imageView;
        if (this.f101013o0 != C16972e0.b.DIALOG_INFORMATION) {
            return;
        }
        this.f100994f = drawable;
        ImageView imageView2 = this.f100966I;
        if (imageView2 == null) {
            return;
        }
        if (drawable == null) {
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        } else {
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            ImageView imageView3 = this.f100966I;
            if (imageView3 != null) {
                imageView3.setImageDrawable(drawable);
            }
        }
        RobotoTextView robotoTextView = this.f100964G;
        if (robotoTextView != null) {
            charSequence = robotoTextView.getText();
        } else {
            charSequence = null;
        }
        if (String.valueOf(charSequence).length() == 0 && (imageView = this.f100966I) != null) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: Z */
    public final void m106932Z(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "title");
        this.f100990d = charSequence;
        RobotoTextView robotoTextView = this.f100963F;
        if (robotoTextView != null) {
            AbstractC19074t.m100205c(robotoTextView);
            robotoTextView.setText(charSequence);
            RobotoTextView robotoTextView2 = this.f100963F;
            AbstractC19074t.m100205c(robotoTextView2);
            if (charSequence.length() == 0) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            robotoTextView2.setVisibility(i11);
            if (this.f101013o0 == C16972e0.b.POPUP) {
                RobotoTextView robotoTextView3 = this.f100963F;
                AbstractC19074t.m100205c(robotoTextView3);
                robotoTextView3.setGravity(1);
            }
        }
    }

    /* renamed from: a0 */
    public final void m106933a0(int i11) {
        this.f101015p0 = i11;
    }
}
