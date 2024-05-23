package com.zing.zalo.chathead.ChatHeadUI;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.AbstractC1388a;
import au.C2343e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.C13703p0;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.zview.AbstractC17450b;
import com.zing.zalocore.CoreUtility;
import d60.C17799h;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kg.AbstractC21707d;
import kg.C21709f;
import kg.C21711h;
import kg.C21715l;
import kg.InterfaceC21713j;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p161fg.C18927r;
import p209hg.C20052c;
import p266jg.AbstractC21244b;
import p266jg.AbstractC21245c;
import p266jg.C21243a;
import p348mi.AbstractC23304d;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import vg.C28203u6;
import vl0.AbstractC28291a;
import zl0.AbstractC32232i;

/* loaded from: classes3.dex */
public class ChatHead extends View implements InterfaceC21713j {

    /* renamed from: A0 */
    private static Paint f41964A0;

    /* renamed from: B0 */
    private static TextPaint f41965B0;

    /* renamed from: C0 */
    private static Rect f41966C0;

    /* renamed from: D0 */
    private static Rect f41967D0;

    /* renamed from: E0 */
    private static Rect f41968E0;

    /* renamed from: F0 */
    private static final int f41969F0;

    /* renamed from: l0 */
    public static final int f41970l0 = AbstractC23136l9.m118742r(60.0f);

    /* renamed from: m0 */
    public static final int f41971m0 = AbstractC23136l9.m118742r(2.0f);

    /* renamed from: n0 */
    public static final int f41972n0 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: o0 */
    public static final int f41973o0;

    /* renamed from: p0 */
    public static final int f41974p0;

    /* renamed from: q0 */
    public static final int f41975q0;

    /* renamed from: r0 */
    private static int f41976r0;

    /* renamed from: s0 */
    private static Drawable f41977s0;

    /* renamed from: t0 */
    private static Paint f41978t0;

    /* renamed from: u0 */
    private static Paint f41979u0;

    /* renamed from: v0 */
    private static Bitmap f41980v0;

    /* renamed from: w0 */
    private static Drawable f41981w0;

    /* renamed from: x0 */
    private static Drawable f41982x0;

    /* renamed from: y0 */
    private static Bitmap f41983y0;

    /* renamed from: z0 */
    private static Paint f41984z0;

    /* renamed from: A */
    private int f41985A;

    /* renamed from: B */
    private int f41986B;

    /* renamed from: C */
    private Rect f41987C;

    /* renamed from: D */
    private final int f41988D;

    /* renamed from: E */
    private final C20052c f41989E;

    /* renamed from: F */
    private final C21715l f41990F;

    /* renamed from: G */
    EnumC7836g f41991G;

    /* renamed from: H */
    C18927r f41992H;

    /* renamed from: I */
    private float f41993I;

    /* renamed from: J */
    private float f41994J;

    /* renamed from: K */
    private VelocityTracker f41995K;

    /* renamed from: L */
    private boolean f41996L;

    /* renamed from: M */
    private double f41997M;

    /* renamed from: N */
    private double f41998N;

    /* renamed from: O */
    private C21709f f41999O;

    /* renamed from: P */
    private C21709f f42000P;

    /* renamed from: Q */
    private C21709f f42001Q;

    /* renamed from: R */
    private C21709f f42002R;

    /* renamed from: S */
    private boolean f42003S;

    /* renamed from: T */
    private boolean f42004T;

    /* renamed from: U */
    private boolean f42005U;

    /* renamed from: V */
    private boolean f42006V;

    /* renamed from: W */
    private long f42007W;

    /* renamed from: a0 */
    private boolean f42008a0;

    /* renamed from: b0 */
    private int f42009b0;

    /* renamed from: c0 */
    private boolean f42010c0;

    /* renamed from: d0 */
    private boolean f42011d0;

    /* renamed from: e0 */
    private double f42012e0;

    /* renamed from: f0 */
    private double f42013f0;

    /* renamed from: g0 */
    private C13703p0 f42014g0;

    /* renamed from: h0 */
    private final C3977j[] f42015h0;

    /* renamed from: i0 */
    private final Drawable[] f42016i0;

    /* renamed from: j0 */
    private final Handler f42017j0;

    /* renamed from: k0 */
    private final Runnable f42018k0;

    /* renamed from: p */
    final int f42019p;

    /* renamed from: q */
    private byte f42020q;

    /* renamed from: r */
    private final List f42021r;

    /* renamed from: s */
    private C23528a f42022s;

    /* renamed from: t */
    private final C24003n f42023t;

    /* renamed from: u */
    private String f42024u;

    /* renamed from: v */
    private boolean f42025v;

    /* renamed from: w */
    private boolean f42026w;

    /* renamed from: x */
    private int f42027x;

    /* renamed from: y */
    private int f42028y;

    /* renamed from: z */
    private int f42029z;

    /* renamed from: com.zing.zalo.chathead.ChatHeadUI.ChatHead$a */
    /* loaded from: classes3.dex */
    public class C7830a extends AbstractC21707d {
        C7830a() {
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            super.mo39827a(c21709f);
            ChatHead.this.f41989E.m104164m().m106803z(ChatHead.this, (int) c21709f.m112033d());
            if (!ChatHead.this.f41996L) {
                ChatHead.this.m39798F();
            }
            if (!ChatHead.this.f42010c0 && c21709f.m112040m()) {
                ChatHead.this.f42010c0 = true;
                ChatHead.this.f42012e0 = c21709f.m112034f();
            }
            if (ChatHead.this.f42010c0 && !c21709f.m112040m() && c21709f.m112034f() == ChatHead.this.f42012e0) {
                ChatHead.this.f42010c0 = false;
                c21709f.m112044q(c21709f.m112034f());
            }
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: c */
        public void mo39829c(C21709f c21709f) {
            super.mo39829c(c21709f);
            ChatHead.this.f42010c0 = false;
        }
    }

    /* renamed from: com.zing.zalo.chathead.ChatHeadUI.ChatHead$b */
    /* loaded from: classes3.dex */
    public class C7831b extends AbstractC21707d {
        C7831b() {
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            super.mo39827a(c21709f);
            ChatHead.this.f41989E.m104164m().m106776A(ChatHead.this, (int) c21709f.m112033d());
            if (!ChatHead.this.f42011d0 && c21709f.m112040m()) {
                ChatHead.this.f42011d0 = true;
                ChatHead.this.f42013f0 = c21709f.m112034f();
            }
            if (ChatHead.this.f42011d0 && !c21709f.m112040m() && c21709f.m112034f() == ChatHead.this.f42013f0) {
                ChatHead.this.f42011d0 = false;
                c21709f.m112044q(c21709f.m112034f());
            }
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: c */
        public void mo39829c(C21709f c21709f) {
            super.mo39829c(c21709f);
            ChatHead.this.f42011d0 = false;
        }
    }

    /* renamed from: com.zing.zalo.chathead.ChatHeadUI.ChatHead$c */
    /* loaded from: classes3.dex */
    public class C7832c extends AbstractC21707d {
        C7832c() {
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            super.mo39827a(c21709f);
            float m112033d = (float) c21709f.m112033d();
            ChatHead.this.setScaleX(m112033d);
            ChatHead.this.setScaleY(m112033d);
        }
    }

    /* renamed from: com.zing.zalo.chathead.ChatHeadUI.ChatHead$d */
    /* loaded from: classes3.dex */
    public class C7833d extends AbstractC21707d {
        C7833d() {
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            super.mo39827a(c21709f);
            ChatHead.this.setAlpha((float) c21709f.m112033d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.chathead.ChatHeadUI.ChatHead$e */
    /* loaded from: classes3.dex */
    public class RunnableC7834e implements Runnable {
        RunnableC7834e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ChatHead.this.f42000P != null && ChatHead.this.f41989E.m104166r() != null && ChatHead.this.f42008a0) {
                    ChatHead.this.f42000P.m112046s(0.8999999761581421d);
                    ChatHead.this.f41989E.m104166r().m39835f();
                    ChatHead.this.f41989E.m104166r().m39845q(ChatHead.this.f41989E.m104166r().f42049w, ChatHead.this.f41989E.m104166r().f42050x);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatHead", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.chathead.ChatHeadUI.ChatHead$f */
    /* loaded from: classes3.dex */
    public class C7835f extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f42035l1;

        /* renamed from: m1 */
        final /* synthetic */ int f42036m1;

        C7835f(String str, int i11) {
            this.f42035l1 = str;
            this.f42036m1 = i11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (!TextUtils.isEmpty(this.f42035l1) && str.equals(this.f42035l1)) {
                if (ChatHead.this.f42015h0[this.f42036m1] != null) {
                    ChatHead.this.f42015h0[this.f42036m1].setImageInfo(c3979l, false);
                }
                if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                    if (m18839c.getWidth() != 1 || m18839c.getHeight() != 1) {
                        ChatHead.this.f42016i0[this.f42036m1] = new BitmapDrawable(ChatHead.this.getResources(), m18839c);
                        ChatHead.this.invalidate();
                    }
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.chathead.ChatHeadUI.ChatHead$g */
    /* loaded from: classes3.dex */
    public enum EnumC7836g {
        FREE,
        CAPTURED,
        REMOVED
    }

    static {
        int m118742r = AbstractC23136l9.m118742r(2.0f);
        f41973o0 = m118742r;
        int m118742r2 = AbstractC23136l9.m118742r(3.0f);
        f41974p0 = m118742r2;
        f41975q0 = AbstractC23136l9.m118742r(2.0f);
        f41976r0 = AbstractC23136l9.m118742r(9.0f);
        f41969F0 = m118742r + m118742r2;
    }

    public ChatHead(C20052c c20052c, C21715l c21715l, Context context) {
        super(context);
        this.f42019p = AbstractC21244b.m110052b(getContext(), 80);
        this.f42020q = (byte) -1;
        this.f42021r = new ArrayList();
        this.f42023t = C23278z2.m120143n();
        this.f42026w = false;
        this.f41986B = 0;
        this.f41988D = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f41993I = -1.0f;
        this.f41994J = -1.0f;
        this.f42004T = false;
        this.f42005U = false;
        this.f42006V = false;
        this.f42008a0 = false;
        this.f42010c0 = false;
        this.f42011d0 = false;
        this.f42012e0 = -1.0d;
        this.f42013f0 = -1.0d;
        this.f42015h0 = new C3977j[4];
        this.f42016i0 = new Drawable[4];
        this.f42017j0 = new Handler();
        this.f42018k0 = new RunnableC7834e();
        this.f41989E = c20052c;
        this.f41990F = c21715l;
        m39815x();
    }

    /* renamed from: B */
    private boolean m39795B() {
        if (this.f42001Q.m112033d() >= AbstractC23136l9.m118722k0() / 2.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    private void m39796C() {
        ContactProfile m141809c;
        try {
            if (this.f41986B != 0) {
                this.f42016i0[0] = AbstractC1388a.m6964f(MainApplication.getAppContext(), this.f41986B);
                invalidate();
                return;
            }
            for (int i11 = 0; i11 < this.f42016i0.length; i11++) {
                if ((i11 != 1 || this.f42021r.size() != 2 || !((String) this.f42021r.get(1)).equals("1")) && ((i11 != 3 || this.f42021r.size() <= 4) && i11 < this.f42021r.size())) {
                    String str = "";
                    if (!((String) this.f42021r.get(i11)).startsWith("http") && !((String) this.f42021r.get(i11)).contains(".png") && !((String) this.f42021r.get(i11)).contains(".jpg")) {
                        ContactProfile m141809c2 = C28203u6.f131407a.m141809c((String) this.f42021r.get(i11));
                        if (m141809c2 == null && ((String) this.f42021r.get(i11)).equals(CoreUtility.f89233i)) {
                            m141809c2 = AbstractC23304d.f113368c0;
                        }
                        if (m141809c2 != null) {
                            str = m141809c2.f42446v;
                            if (C23302b.f113247a.m120523d(str)) {
                                this.f42016i0[i11] = C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m141809c2.m40383Q(true, false)), C2343e.m12307a(m141809c2.f42434r, false));
                            }
                        }
                        if (!TextUtils.isEmpty(str) && !C23302b.f113247a.m120523d(str)) {
                            ((C23528a) this.f42022s.m123612r(this.f42015h0[i11])).m123579C(str, this.f42023t, new C7835f(str, i11));
                        }
                    }
                    str = (String) this.f42021r.get(i11);
                    if (C23302b.f113247a.m120523d(str) && (m141809c = C28203u6.f131407a.m141809c(this.f41992H.f94425p)) != null) {
                        this.f42016i0[i11] = C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m141809c.m40383Q(true, false)), C2343e.m12307a(m141809c.f42434r, false));
                    }
                    if (!TextUtils.isEmpty(str)) {
                        ((C23528a) this.f42022s.m123612r(this.f42015h0[i11])).m123579C(str, this.f42023t, new C7835f(str, i11));
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatHead", e11);
        }
    }

    /* renamed from: E */
    private void m39797E() {
        int i11 = C21243a.f103541p;
        int i12 = C21243a.f103539n;
        int i13 = f41970l0;
        if (f41966C0 == null) {
            int i14 = f41969F0;
            f41966C0 = new Rect(i14, i14, i14 + i13, i13 + i14);
            Rect rect = f41966C0;
            int i15 = rect.left;
            int i16 = f41975q0;
            f41968E0 = new Rect(i15 - i16, rect.top, rect.right + i16, rect.bottom + (i16 * 2));
        }
        if (f41967D0 == null) {
            f41967D0 = new Rect(0, 0, i11, i12);
        }
        m39798F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:            if (r2 == false) goto L96;     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m39798F() {
        boolean z11;
        int i11;
        int width;
        int i12;
        int i13 = C21243a.f103541p;
        boolean z12 = true;
        if (m39831v()) {
            if (!this.f41989E.m104132G() && !m39795B()) {
                i12 = (i13 - f41969F0) - f41976r0;
            } else {
                i12 = f41969F0 + f41976r0;
            }
            if (i12 != this.f42029z) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.f42029z = i12;
                this.f41985A = f41969F0 + f41976r0;
            }
            if (m39832w()) {
                if (!this.f41989E.m104132G() && !m39795B()) {
                    this.f42029z -= AbstractC23222t7.f112556e;
                } else {
                    this.f42029z += AbstractC23222t7.f112556e;
                }
                this.f41985A += AbstractC23222t7.f112556e;
            }
            int m118764y0 = AbstractC23136l9.m118764y0(f41965B0, this.f42024u);
            int m118761x0 = AbstractC23136l9.m118761x0(f41965B0, this.f42024u);
            this.f42027x = this.f42029z - (m118764y0 / 2);
            this.f42028y = this.f41985A + (m118761x0 / 2);
        } else {
            z11 = false;
        }
        if (this.f41989E.m104133H()) {
            Rect rect = this.f41987C;
            if (rect != null) {
                i11 = rect.left;
            } else {
                i11 = 0;
            }
            if (m39795B()) {
                width = f41969F0 - f41971m0;
            } else {
                width = ((i13 - f41969F0) - f41980v0.getWidth()) + f41971m0;
            }
            if (width == i11) {
                z12 = false;
            }
            if (z12 || this.f41987C == null) {
                int height = i13 - f41980v0.getHeight();
                this.f41987C = new Rect(width, height, f41980v0.getWidth() + width, f41980v0.getHeight() + height);
            }
        }
        if (!z11) {
            return;
        }
        invalidate();
    }

    /* renamed from: I */
    public static void m39799I(Context context) {
        f41978t0 = null;
        f41979u0 = null;
        f41977s0 = null;
        f41980v0 = null;
        f41981w0 = null;
        f41982x0 = null;
        f41983y0 = null;
        f41965B0 = null;
        f41984z0 = null;
        f41964A0 = null;
        m39816y(context);
    }

    /* renamed from: x */
    private void m39815x() {
        setState(EnumC7836g.FREE);
        C7830a c7830a = new C7830a();
        C21709f m112019d = this.f41990F.m112019d();
        this.f42001Q = m112019d;
        m112019d.m112030a(c7830a);
        this.f42001Q.m112030a(this);
        C7831b c7831b = new C7831b();
        C21709f m112019d2 = this.f41990F.m112019d();
        this.f42002R = m112019d2;
        m112019d2.m112030a(c7831b);
        this.f42002R.m112030a(this);
        C21709f m112019d3 = this.f41990F.m112019d();
        this.f42000P = m112019d3;
        m112019d3.m112030a(new C7832c());
        this.f42000P.m112044q(1.0d).m112043p();
        C21709f m112019d4 = this.f41990F.m112019d();
        this.f41999O = m112019d4;
        m112019d4.m112048u(C21711h.m112058a(40.0d, 9.0d));
        this.f41999O.m112030a(new C7833d());
        this.f42022s = new C23528a(getContext());
        m39816y(getContext());
        int i11 = f41970l0;
        this.f42014g0 = new C13703p0(this, i11, i11, true);
        int i12 = 0;
        while (true) {
            C3977j[] c3977jArr = this.f42015h0;
            if (i12 < c3977jArr.length) {
                c3977jArr[i12] = new C3977j(getContext());
                i12++;
            } else {
                return;
            }
        }
    }

    /* renamed from: y */
    private static void m39816y(Context context) {
        if (f41978t0 == null) {
            Paint paint = new Paint(1);
            f41978t0 = paint;
            paint.setColor(C23212s8.m119607o(context, AbstractC16781w.ChatHeadAvatarPlaceHolderColor));
        }
        if (f41979u0 == null) {
            Paint paint2 = new Paint(1);
            f41979u0 = paint2;
            paint2.setColor(-1);
            f41979u0.setStrokeWidth(1.0f);
            f41979u0.setStyle(Paint.Style.STROKE);
        }
        if (f41977s0 == null) {
            f41977s0 = C23212s8.m119609q(context, AbstractC16781w.default_avatar);
        }
        if (f41980v0 == null) {
            f41980v0 = BitmapFactory.decodeResource(context.getResources(), AbstractC16803z.logozalo_headchat3);
        }
        if (f41981w0 == null) {
            f41981w0 = AbstractC23136l9.m118665N(context, AbstractC16803z.ic_chathead_selected);
        }
        if (f41982x0 == null) {
            f41982x0 = AbstractC23136l9.m118665N(context, AbstractC16803z.ic_chathead_selected_noarrow);
        }
        if (f41983y0 == null) {
            f41983y0 = BitmapFactory.decodeResource(context.getResources(), AbstractC16803z.chathead_ava_shadow);
        }
        if (f41965B0 == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            f41965B0 = c13704p1;
            c13704p1.setColor(-1);
            f41965B0.setTextSize(AbstractC23136l9.m118742r(13.0f));
        }
        if (f41984z0 == null) {
            Paint paint3 = new Paint(1);
            f41984z0 = paint3;
            paint3.setColor(C23212s8.m119607o(context, AbstractC28291a.badge_background_red));
        }
        if (f41964A0 == null) {
            Paint paint4 = new Paint(1);
            f41964A0 = paint4;
            paint4.setColor(C23212s8.m119607o(context, AbstractC17450b.NotificationColor5));
        }
    }

    /* renamed from: A */
    public boolean m39817A() {
        return this.f42003S;
    }

    /* renamed from: D */
    public void m39818D() {
        if (this.f42008a0 && !this.f41989E.m104166r().m39841l()) {
            this.f41989E.m104166r().m39836g();
        }
        this.f42001Q.m112043p();
        this.f42001Q.m112041n();
        this.f42001Q.m112032c();
        this.f42001Q = null;
        this.f42002R.m112043p();
        this.f42002R.m112041n();
        this.f42002R.m112032c();
        this.f42002R = null;
        this.f42000P.m112043p();
        this.f42000P.m112041n();
        this.f42000P.m112032c();
        this.f42000P = null;
        this.f41999O.m112043p();
        this.f41999O.m112041n();
        this.f41999O.m112032c();
        this.f41999O = null;
    }

    /* renamed from: G */
    public void m39819G() {
        m39797E();
        m39796C();
    }

    /* renamed from: H */
    public void m39820H() {
        C13703p0 c13703p0 = this.f42014g0;
        if (c13703p0 != null) {
            c13703p0.m76604d();
        }
    }

    /* renamed from: J */
    public void m39821J() {
        this.f41992H.f94426q = 0;
        if (this.f42025v || !TextUtils.isEmpty(this.f42024u)) {
            this.f42024u = "";
            this.f42025v = false;
            invalidate();
        }
    }

    /* renamed from: K */
    public void m39822K(int i11, int i12) {
        this.f41986B = i11;
        this.f42020q = (byte) 1;
        m39826O(i12);
        m39819G();
        this.f42014g0.m76608h(this.f42020q, null, this.f42016i0);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0066  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m39823L(List list, int i11) {
        String str;
        this.f42021r.clear();
        this.f42021r.addAll(list);
        this.f42020q = (byte) Math.min(list.size(), 4);
        if (this.f42021r.size() == 2) {
            str = "1";
            if (((String) this.f42021r.get(1)).equals("1")) {
                this.f42020q = (byte) 5;
                this.f42021r.remove(1);
                if (this.f42020q <= 0) {
                    this.f42020q = (byte) 1;
                }
                m39826O(i11);
                m39819G();
                this.f42014g0.m76608h(this.f42020q, str, this.f42016i0);
            }
        }
        str = null;
        if (this.f42021r.size() == 4) {
            this.f42020q = (byte) 4;
        } else if (this.f42021r.size() >= 5) {
            this.f42020q = (byte) 4;
            str = (String) this.f42021r.get(4);
        } else {
            this.f42020q = (byte) this.f42021r.size();
        }
        if (this.f42020q <= 0) {
        }
        m39826O(i11);
        m39819G();
        this.f42014g0.m76608h(this.f42020q, str, this.f42016i0);
    }

    /* renamed from: M */
    void m39824M() {
        try {
            this.f41989E.m104150c0(getUser().f94427r, getUser().f94433x, (int) this.f42001Q.m112033d(), (int) this.f42002R.m112033d());
            this.f42004T = false;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatHead", e11);
        }
    }

    /* renamed from: N */
    public void m39825N(boolean z11, boolean z12, boolean z13) {
        if (this.f42025v != z11 || this.f42005U != z12 || z13) {
            this.f42025v = z11;
            this.f42005U = z12;
            invalidate();
        }
    }

    /* renamed from: O */
    public void m39826O(int i11) {
        this.f41992H.f94426q = i11;
        boolean z11 = false;
        if (i11 > 0) {
            f41976r0 = AbstractC23222t7.f112570l;
            if (i11 > 5) {
                this.f42024u = "5+";
            } else {
                this.f42024u = String.valueOf(i11);
            }
            this.f42025v = true;
        } else if (i11 == -1) {
            f41976r0 = AbstractC23222t7.f112558f;
            this.f42024u = "Dot";
            this.f42025v = true;
        } else {
            this.f42024u = "";
            this.f42025v = false;
        }
        C18927r c18927r = this.f41992H;
        if (c18927r != null && c18927r.f94434y) {
            z11 = true;
        }
        this.f42026w = z11;
    }

    @Override // kg.InterfaceC21713j
    /* renamed from: a */
    public void mo39827a(C21709f c21709f) {
        C21709f c21709f2;
        C21709f c21709f3 = this.f42001Q;
        if (c21709f3 != null && (c21709f2 = this.f42002R) != null) {
            if (c21709f != c21709f3 && c21709f != c21709f2) {
                return;
            }
            int hypot = (int) Math.hypot(c21709f3.m112038j(), c21709f2.m112038j());
            if (this.f41989E.m104160j() != null) {
                this.f41989E.m104160j().mo101667i(this, this.f41996L, this.f41989E.m104173z(), this.f41989E.m104172y(), c21709f, c21709f3, c21709f2, hypot);
            }
        }
    }

    @Override // kg.InterfaceC21713j
    /* renamed from: b */
    public void mo39828b(C21709f c21709f) {
        if (!AbstractC32232i.m155457e("x86")) {
            AbstractC32232i.m155462j(this, 2, null);
        }
    }

    @Override // kg.InterfaceC21713j
    /* renamed from: c */
    public void mo39829c(C21709f c21709f) {
        C21709f c21709f2 = this.f42001Q;
        if (c21709f2 != null && this.f42002R != null && c21709f2.m112039l() && this.f42002R.m112039l()) {
            if (this.f42004T) {
                this.f42004T = false;
                if (this.f41989E.m104133H()) {
                    m39824M();
                }
            }
            if (!AbstractC32232i.m155457e("x86")) {
                AbstractC32232i.m155462j(this, 0, null);
            }
        }
    }

    @Override // kg.InterfaceC21713j
    /* renamed from: e */
    public void mo39830e(C21709f c21709f) {
    }

    public C21709f getHorizontalSpring() {
        return this.f42001Q;
    }

    public C21709f getScaleSpring() {
        return this.f42000P;
    }

    public EnumC7836g getState() {
        return this.f41991G;
    }

    public C18927r getUser() {
        return this.f41992H;
    }

    public C21709f getVerticalSpring() {
        return this.f42002R;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Paint paint;
        Rect rect;
        super.onDraw(canvas);
        try {
            if (this.f42020q <= 0) {
                return;
            }
            if (!this.f41992H.m99173b()) {
                try {
                    C17799h.m94029a().f90028c = true;
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
            canvas.drawBitmap(f41983y0, (Rect) null, f41968E0, (Paint) null);
            canvas.drawCircle(f41966C0.centerX(), f41966C0.centerY(), f41966C0.width() / 2.0f, f41978t0);
            if (this.f42014g0 != null) {
                canvas.save();
                int i11 = f41969F0;
                canvas.translate(i11, i11);
                this.f42014g0.m76603a(canvas);
                canvas.restore();
            }
            if (this.f42005U) {
                if (this.f41989E.m104132G()) {
                    if (this.f41989E.m104134I()) {
                        f41981w0.setBounds(f41967D0);
                        f41981w0.draw(canvas);
                    } else {
                        f41982x0.setBounds(f41967D0);
                        f41982x0.draw(canvas);
                    }
                }
                if (this.f41989E.m104133H() && (rect = this.f41987C) != null) {
                    canvas.drawBitmap(f41980v0, (Rect) null, rect, (Paint) null);
                }
            }
            if (m39831v()) {
                if (this.f41989E.m104132G() || this.f42025v) {
                    float f11 = this.f42029z;
                    float f12 = this.f41985A;
                    float f13 = f41976r0;
                    if (this.f42026w) {
                        paint = f41964A0;
                    } else {
                        paint = f41984z0;
                    }
                    canvas.drawCircle(f11, f12, f13, paint);
                    if (this.f42026w) {
                        canvas.drawCircle(this.f42029z, this.f41985A, f41976r0 + 1, f41979u0);
                    }
                    if (!m39832w()) {
                        canvas.drawText(this.f42024u, this.f42027x, this.f42028y, f41965B0);
                    }
                }
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f("ChatHead", e12);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C21709f c21709f;
        if (!this.f41989E.m104135J()) {
            C21709f c21709f2 = this.f42000P;
            if (c21709f2 != null) {
                c21709f2.m112046s(1.0d);
            }
            this.f41996L = false;
            return false;
        }
        C21709f c21709f3 = this.f42001Q;
        if (c21709f3 == null || (c21709f = this.f42002R) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f11 = rawX - this.f41993I;
        float f12 = rawY - this.f41994J;
        this.f41989E.m104130D();
        motionEvent.offsetLocation(this.f41989E.m104164m().m106791n(this), this.f41989E.m104164m().m106792o(this));
        if (action == 0) {
            this.f42008a0 = true;
            this.f42009b0 = motionEvent.getPointerId(0);
            if (this.f42006V && System.currentTimeMillis() - this.f42007W < 300) {
                this.f42006V = false;
                return false;
            }
            this.f42006V = true;
            this.f42007W = System.currentTimeMillis();
            if (getUser().m99172a()) {
                this.f42017j0.postDelayed(this.f42018k0, 200L);
            }
            VelocityTracker velocityTracker = this.f41995K;
            if (velocityTracker == null) {
                this.f41995K = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            c21709f3.m112048u(AbstractC21245c.f103554a);
            c21709f.m112048u(AbstractC21245c.f103554a);
            setState(EnumC7836g.FREE);
            this.f41993I = rawX;
            this.f41994J = rawY;
            this.f41997M = c21709f3.m112033d();
            this.f41998N = c21709f.m112033d();
            c21709f3.m112043p();
            c21709f.m112043p();
            this.f41995K.addMovement(motionEvent);
            this.f42000P.m112046s(0.9d);
        } else if (action == 2 && this.f42009b0 == motionEvent.getPointerId(0) && this.f41992H.m99172a()) {
            double d11 = f11;
            double d12 = f12;
            if (Math.hypot(d11, d12) > this.f41988D) {
                this.f41996L = true;
            }
            if (this.f41995K == null) {
                this.f41995K = VelocityTracker.obtain();
            }
            this.f41995K.addMovement(motionEvent);
            if (this.f41996L) {
                this.f41989E.m104166r().m39845q(rawX, rawY);
                if (this.f41989E.m104160j().mo101659a(this)) {
                    if (this.f41989E.m104169u(rawX, rawY) < this.f42019p) {
                        if (this.f41989E.m104166r().m39841l()) {
                            this.f41989E.m104166r().m39835f();
                            this.f41989E.m104166r().m39845q(this.f41989E.m104166r().f42049w, this.f41989E.m104166r().f42050x);
                        }
                        setState(EnumC7836g.CAPTURED);
                        c21709f3.m112048u(AbstractC21245c.f103555b);
                        c21709f.m112048u(AbstractC21245c.f103555b);
                        c21709f3.m112046s((this.f41989E.m104166r().f42049w + this.f41989E.m104166r().getxSpring().m112034f()) - (this.f41989E.m104166r().getMeasuredWidth() / 2.0f));
                        c21709f.m112046s((this.f41989E.m104166r().f42050x + this.f41989E.m104166r().getySpring().m112034f()) - (this.f41989E.m104166r().getMeasuredHeight() / 2.0f));
                        this.f41989E.m104166r().m39842m();
                    } else if (c21709f.m112036h() != AbstractC21245c.f103556c && c21709f3.m112036h() != AbstractC21245c.f103556c) {
                        setState(EnumC7836g.FREE);
                        c21709f3.m112048u(AbstractC21245c.f103557d);
                        c21709f.m112048u(AbstractC21245c.f103557d);
                        c21709f3.m112044q(this.f41997M + d11);
                        c21709f.m112044q(this.f41998N + d12);
                        this.f41989E.m104166r().m39844p();
                    }
                }
            }
        } else if (action == 3 && this.f42009b0 == motionEvent.getPointerId(0)) {
            this.f42008a0 = false;
            this.f42017j0.removeCallbacks(this.f42018k0);
            this.f41996L = false;
            this.f42000P.m112046s(1.0d);
            this.f41989E.m104160j().mo101660b(this, 0, 0, c21709f3, c21709f, true);
        } else if (this.f42009b0 == motionEvent.getPointerId(0) && (action == 1 || action == 6)) {
            this.f42008a0 = false;
            this.f42017j0.removeCallbacks(this.f42018k0);
            if (this.f41995K == null) {
                this.f41995K = VelocityTracker.obtain();
            }
            this.f41995K.computeCurrentVelocity(1000);
            boolean z11 = this.f41996L;
            this.f41996L = false;
            this.f42000P.m112046s(1.0d);
            int xVelocity = (int) this.f41995K.getXVelocity();
            int yVelocity = (int) this.f41995K.getYVelocity();
            this.f41995K.recycle();
            this.f41995K = null;
            if (this.f42001Q != null && this.f42002R != null) {
                this.f41989E.m104160j().mo101660b(this, xVelocity, yVelocity, c21709f3, c21709f, z11);
            }
        }
        return true;
    }

    public void setAlphaSpring(double d11) {
        this.f41999O.m112044q(1.0d - d11);
        this.f41999O.m112046s(d11);
    }

    public void setAvatar(int i11) {
        this.f41986B = i11;
        this.f42020q = (byte) 1;
        this.f42014g0.m76608h(1, null, this.f42016i0);
        m39796C();
    }

    public void setDragging(boolean z11) {
        this.f41996L = z11;
    }

    public void setHero(boolean z11) {
        this.f42003S = z11;
    }

    public void setState(EnumC7836g enumC7836g) {
        this.f41991G = enumC7836g;
    }

    public void setUser(C18927r c18927r) {
        C21709f c21709f;
        this.f41992H = c18927r;
        int i11 = c18927r.f94430u;
        if (i11 > 0) {
            m39822K(i11, c18927r.f94426q);
        } else {
            m39823L(c18927r.f94429t, c18927r.f94426q);
        }
        if (!this.f41996L && !TextUtils.isEmpty(c18927r.f94427r)) {
            if (this.f41989E.m104133H()) {
                this.f42004T = true;
            }
            if (this.f42004T && m39817A() && (c21709f = this.f42001Q) != null && this.f42002R != null && c21709f.m112039l() && this.f42002R.m112039l()) {
                m39824M();
            }
        }
    }

    /* renamed from: v */
    public boolean m39831v() {
        return !TextUtils.isEmpty(this.f42024u);
    }

    /* renamed from: w */
    public boolean m39832w() {
        return Objects.equals(this.f42024u, "Dot");
    }

    /* renamed from: z */
    public boolean m39833z() {
        return this.f41996L;
    }
}
