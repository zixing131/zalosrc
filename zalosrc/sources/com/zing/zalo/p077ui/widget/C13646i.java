package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import bi0.AbstractC2807a;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import tj.C26712d;
import ui0.C27280g;
import vg.AbstractC28207v1;
import vl0.AbstractC28291a;

/* renamed from: com.zing.zalo.ui.widget.i */
/* loaded from: classes6.dex */
public class C13646i {

    /* renamed from: T */
    static TextPaint f70358T;

    /* renamed from: U */
    static TextPaint f70359U;

    /* renamed from: V */
    static Paint f70360V;

    /* renamed from: W */
    static TextPaint f70361W;

    /* renamed from: X */
    static C13704p1 f70362X;

    /* renamed from: Y */
    static TextPaint f70363Y;

    /* renamed from: Z */
    static C13704p1 f70364Z;

    /* renamed from: a0 */
    static TextPaint f70365a0;

    /* renamed from: b0 */
    static Paint f70366b0;

    /* renamed from: c0 */
    static Paint f70367c0;

    /* renamed from: d0 */
    static TextPaint f70368d0;

    /* renamed from: A */
    C13697o f70371A;

    /* renamed from: B */
    boolean f70372B;

    /* renamed from: C */
    boolean f70373C;

    /* renamed from: D */
    Drawable f70374D;

    /* renamed from: E */
    b f70375E;

    /* renamed from: a */
    Context f70376a;

    /* renamed from: b */
    C3977j f70377b;

    /* renamed from: c */
    C23528a f70378c;

    /* renamed from: d */
    C26712d f70379d;

    /* renamed from: e */
    ActionLogChatLocation.FooterLogData f70380e;

    /* renamed from: f */
    StaticLayout f70381f;

    /* renamed from: g */
    StaticLayout f70382g;

    /* renamed from: h */
    StaticLayout f70383h;

    /* renamed from: i */
    int f70384i;

    /* renamed from: j */
    int f70385j;

    /* renamed from: k */
    int f70386k;

    /* renamed from: l */
    int f70387l;

    /* renamed from: m */
    View f70388m;

    /* renamed from: n */
    int f70389n;

    /* renamed from: o */
    int f70390o;

    /* renamed from: p */
    int f70391p;

    /* renamed from: q */
    boolean f70392q;

    /* renamed from: r */
    int f70393r;

    /* renamed from: s */
    int f70394s;

    /* renamed from: t */
    int f70395t;

    /* renamed from: u */
    int f70396u;

    /* renamed from: v */
    int f70397v;

    /* renamed from: w */
    int f70398w;

    /* renamed from: x */
    int f70399x;

    /* renamed from: y */
    String f70400y = "";

    /* renamed from: z */
    StaticLayout f70401z;

    /* renamed from: F */
    protected static final int f70344F = AbstractC23136l9.m118742r(6.0f);

    /* renamed from: G */
    private static final int f70345G = AbstractC23136l9.m118742r(21.0f);

    /* renamed from: H */
    private static final int f70346H = AbstractC23222t7.f112586t;

    /* renamed from: I */
    private static final int f70347I = AbstractC23222t7.f112552c;

    /* renamed from: J */
    private static final int f70348J = AbstractC23136l9.m118742r(6.0f);

    /* renamed from: K */
    private static final int f70349K = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: L */
    private static final int f70350L = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: M */
    private static final int f70351M = AbstractC23136l9.m118742r(6.0f);

    /* renamed from: N */
    private static final int f70352N = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: O */
    private static final int f70353O = AbstractC23136l9.m118742r(28.0f);

    /* renamed from: P */
    private static final int f70354P = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: Q */
    private static final int f70355Q = AbstractC23136l9.m118742r(6.0f);

    /* renamed from: R */
    private static final int f70356R = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: S */
    private static final int f70357S = AbstractC23136l9.m118742r(81.0f);

    /* renamed from: e0 */
    static RectF f70369e0 = new RectF();

    /* renamed from: f0 */
    public static boolean f70370f0 = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.i$a */
    /* loaded from: classes6.dex */
    public class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f70402l1;

        a(String str) {
            this.f70402l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            try {
                if (!TextUtils.isEmpty(this.f70402l1) && str.equals(this.f70402l1) && c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                    if (m18839c.getWidth() == 1 && m18839c.getHeight() == 1) {
                        return;
                    }
                    C3977j c3977j = C13646i.this.f70377b;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    C13646i.this.f70371A.m76480u(c3979l.m18839c(), false);
                    C13646i.this.f70388m.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.i$b */
    /* loaded from: classes6.dex */
    public interface b {
        /* renamed from: a */
        void mo60887a(String str, String str2, int i11);
    }

    public C13646i(View view, C26712d c26712d, ActionLogChatLocation.FooterLogData footerLogData) {
        int i11;
        boolean z11 = true;
        this.f70372B = true;
        this.f70373C = true;
        Context context = view.getContext();
        this.f70376a = context;
        this.f70388m = view;
        this.f70378c = new C23528a(context);
        this.f70377b = new C3977j(this.f70376a);
        if (f70370f0) {
            m76252h();
            f70370f0 = false;
        }
        this.f70379d = c26712d;
        this.f70380e = footerLogData;
        C13697o c13697o = new C13697o(view);
        this.f70371A = c13697o;
        int i12 = f70344F;
        c13697o.m76461I(new float[]{i12, i12, i12, i12, i12, i12, i12, i12});
        C13697o c13697o2 = this.f70371A;
        if (c26712d.m137344l() == 1) {
            i11 = f70345G;
        } else {
            i11 = f70353O;
        }
        c13697o2.m76462J(6, i11);
        this.f70372B = AbstractC28207v1.m142074z0(c26712d.m137334b(), c26712d.m137333a());
        if (TextUtils.isEmpty(c26712d.m137339g()) && c26712d.m137340h() != 1) {
            z11 = false;
        }
        this.f70373C = z11;
        ActionLogChatLocation.f55164a.m56649c(c26712d, footerLogData);
    }

    /* renamed from: b */
    private void m76249b() {
        int i11;
        if (this.f70389n > 0 && this.f70382g == null) {
            if (this.f70379d.m137344l() == 0) {
                this.f70382g = AbstractC23214t.m119625l(this.f70379d.m137343k(), f70359U, this.f70389n - (f70351M * 2), 2);
                return;
            }
            if (this.f70379d.m137344l() == 1) {
                int i12 = this.f70389n - (f70351M * 2);
                if (this.f70373C) {
                    i11 = f70345G - f70348J;
                } else {
                    i11 = 0;
                }
                int i13 = i12 - i11;
                this.f70382g = AbstractC23214t.m119625l(this.f70379d.m137343k(), f70359U, i13, 2);
                if (!this.f70373C && this.f70381f.getLineCount() > 1) {
                    this.f70382g = AbstractC23214t.m119627n(this.f70379d.m137343k(), f70359U, i13, 2, Layout.Alignment.ALIGN_CENTER);
                    return;
                }
                return;
            }
            if (this.f70379d.m137344l() == 2) {
                this.f70382g = AbstractC23214t.m119627n(this.f70379d.m137343k(), f70363Y, this.f70389n - (f70351M * 2), 2, Layout.Alignment.ALIGN_CENTER);
            }
        }
    }

    /* renamed from: e */
    private void m76250e(Canvas canvas, int i11, int i12, int i13) {
        Drawable m118665N = AbstractC23136l9.m118665N(this.f70376a, i11);
        if (m118665N != null) {
            canvas.save();
            canvas.translate(i12, i13);
            int i14 = f70345G;
            m118665N.setBounds(0, 0, i14, i14);
            m118665N.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: f */
    private void m76251f(Canvas canvas, int i11, int i12) {
        if (this.f70374D == null && this.f70379d.m137334b().equals("action.sticker.ai.open_mp")) {
            this.f70374D = C27280g.m139660c(this.f70376a, AbstractC23322a.zds_ic_ai_symbol_solid_16, AbstractC28291a.button_tertiary_text);
        }
        if (this.f70374D != null) {
            canvas.save();
            canvas.translate(i11, i12);
            Drawable drawable = this.f70374D;
            int i13 = f70346H;
            drawable.setBounds(0, 0, i13, i13);
            this.f70374D.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: h */
    private void m76252h() {
        C13704p1 c13704p1 = new C13704p1(1);
        f70358T = c13704p1;
        Typeface typeface = Typeface.DEFAULT;
        c13704p1.setTypeface(typeface);
        f70358T.setColor(AbstractC11531v0.m62222Y2());
        C13704p1 c13704p12 = new C13704p1(1);
        f70359U = c13704p12;
        c13704p12.setTypeface(typeface);
        f70359U.setColor(-15694362);
        Paint paint = new Paint(1);
        f70360V = paint;
        paint.setStyle(Paint.Style.STROKE);
        f70360V.setStrokeWidth(1.0f);
        C13704p1 c13704p13 = new C13704p1(1);
        f70361W = c13704p13;
        c13704p13.setTypeface(typeface);
        f70361W.setColor(this.f70376a.getResources().getColor(AbstractC16801x.white));
        C13704p1 c13704p14 = new C13704p1(1);
        f70363Y = c13704p14;
        c13704p14.setTypeface(typeface);
        f70363Y.setColor(this.f70376a.getResources().getColor(AbstractC16801x.white_90));
        C13704p1 c13704p15 = new C13704p1(1);
        f70364Z = c13704p15;
        c13704p15.m76613c();
        C13704p1 c13704p16 = new C13704p1(1);
        f70365a0 = c13704p16;
        c13704p16.setTypeface(typeface);
        Paint paint2 = new Paint(1);
        f70366b0 = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        f70367c0 = paint3;
        paint3.setStyle(style);
        C13704p1 c13704p17 = new C13704p1(1);
        f70368d0 = c13704p17;
        c13704p17.setTypeface(typeface);
        C13704p1 c13704p18 = new C13704p1(1);
        f70362X = c13704p18;
        c13704p18.setTypeface(typeface);
        f70362X.m76612b(7);
        f70362X.setColor(C23212s8.m119606n(AbstractC2807a.cta_link));
        f70360V.setColor(C23212s8.m119607o(this.f70376a, AbstractC16781w.ChatSeparator));
        f70358T.setTextSize(AbstractC23136l9.m118742r(14.0f));
        f70359U.setTextSize(AbstractC23136l9.m118742r(14.0f));
        f70361W.setTextSize(AbstractC23136l9.m118742r(12.0f));
        f70362X.m76614d(AbstractC23136l9.m118742r(11.0f), false);
        f70363Y.setTextSize(AbstractC23136l9.m118742r(12.0f));
        f70364Z.setTextSize(AbstractC23136l9.m118742r(12.0f));
        f70364Z.setColor(C23212s8.m119607o(this.f70376a, AbstractC21196a.TextColor1));
        f70365a0.setTextSize(AbstractC23136l9.m118742r(12.0f));
        f70365a0.setColor(C23212s8.m119607o(this.f70376a, AbstractC16781w.TextColor5));
        f70367c0.setColor(C23212s8.m119607o(this.f70376a, AbstractC16781w.btn_type_2_n));
        f70366b0.setColor(C23212s8.m119607o(this.f70376a, AbstractC16781w.btn_type_2_p));
        f70368d0.setTextSize(AbstractC23136l9.m118742r(11.0f));
        f70368d0.setColor(C23212s8.m119607o(this.f70376a, AbstractC16781w.btn_type_2_text_n));
    }

    /* renamed from: i */
    private boolean m76253i(float f11, float f12) {
        StaticLayout staticLayout;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f70379d.m137344l() == 0) {
            if (f11 < this.f70390o || f11 > r1 + this.f70386k + this.f70381f.getLineWidth(0)) {
                return false;
            }
            if (f12 < this.f70391p || f12 > r8 + m76259g()) {
                return false;
            }
            return true;
        }
        if (this.f70379d.m137344l() == 1) {
            if (f11 < this.f70390o || f11 > r1 + this.f70389n) {
                return false;
            }
            if (f12 < this.f70391p || f12 > r8 + m76259g()) {
                return false;
            }
            return true;
        }
        if (this.f70379d.m137344l() != 2 && this.f70379d.m137344l() != 4) {
            if (this.f70379d.m137344l() == 3 && this.f70372B && (staticLayout = this.f70401z) != null) {
                int i11 = this.f70390o;
                int i12 = this.f70393r;
                int i13 = f70354P;
                if (f11 < (i11 + i12) - i13 || f11 > i11 + i12 + staticLayout.getLineWidth(0) + i13) {
                    return false;
                }
                int i14 = this.f70391p;
                int i15 = this.f70394s;
                int i16 = f70355Q;
                if (f12 < (i14 + i15) - i16 || f12 > i14 + i15 + this.f70401z.getHeight() + i16) {
                    return false;
                }
                return true;
            }
            return false;
        }
        if (f11 < this.f70390o || f11 > r1 + this.f70389n) {
            return false;
        }
        int i17 = this.f70391p;
        int i18 = f70352N;
        if (f12 < i17 + i18 || f12 > i17 + i18 + m76259g()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private void m76254j(String str) {
        if ((this.f70379d.m137344l() == 1 || this.f70379d.m137344l() == 3) && !TextUtils.isEmpty(str)) {
            this.f70371A.m76477r();
            ((C23528a) this.f70378c.m123612r(this.f70377b)).m123579C(str, C23278z2.m120079K0(), new a(str));
        }
    }

    /* renamed from: l */
    private void m76255l() {
        int i11;
        int i12;
        try {
            if (this.f70389n <= 0) {
                return;
            }
            int i13 = 0;
            if (this.f70379d.m137344l() == 1) {
                int i14 = 0;
                while (i13 < this.f70381f.getLineCount()) {
                    i14 = (int) Math.max(i14, this.f70381f.getLineWidth(i13));
                    i13++;
                }
                int i15 = this.f70389n;
                int i16 = f70345G;
                int i17 = f70348J;
                this.f70384i = (((i15 - i16) - i17) - i14) / 2;
                this.f70385j = (m76259g() - i16) / 2;
                if (this.f70373C) {
                    i12 = this.f70384i + i16 + i17;
                } else {
                    i12 = (this.f70389n - i14) / 2;
                }
                this.f70386k = i12;
                if (this.f70381f.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
                    this.f70386k = (this.f70389n - this.f70381f.getWidth()) / 2;
                }
                this.f70387l = (m76259g() - this.f70381f.getHeight()) / 2;
                this.f70371A.m76460H(this.f70384i, this.f70385j);
                return;
            }
            if (this.f70379d.m137344l() == 2) {
                this.f70386k = (this.f70389n - this.f70381f.getWidth()) / 2;
                this.f70387l = f70349K;
                return;
            }
            if (this.f70379d.m137344l() == 3) {
                int i18 = f70356R;
                this.f70395t = i18;
                int i19 = f70349K;
                this.f70396u = i19;
                int i21 = f70353O;
                int i22 = f70351M;
                this.f70386k = i18 + i21 + i22;
                StaticLayout staticLayout = this.f70381f;
                if (staticLayout != null && staticLayout.getLineCount() == 1 && this.f70383h == null) {
                    this.f70387l = i19 + ((i21 - this.f70381f.getHeight()) / 2);
                } else {
                    this.f70387l = i19;
                }
                if (this.f70383h != null) {
                    this.f70397v = this.f70395t + i21 + i22;
                    int i23 = this.f70387l;
                    StaticLayout staticLayout2 = this.f70381f;
                    if (staticLayout2 != null) {
                        i11 = staticLayout2.getHeight();
                    } else {
                        i11 = 0;
                    }
                    this.f70398w = i23 + i11;
                }
                this.f70371A.m76460H(this.f70395t, this.f70396u);
                StaticLayout staticLayout3 = this.f70401z;
                if (staticLayout3 != null) {
                    this.f70393r = (int) (((this.f70389n - i22) - staticLayout3.getLineWidth(0)) - f70354P);
                    this.f70394s = (m76259g() - this.f70401z.getHeight()) / 2;
                    return;
                }
                return;
            }
            if (this.f70379d.m137344l() == 4) {
                int i24 = 0;
                while (i13 < this.f70381f.getLineCount()) {
                    i24 = (int) Math.max(i24, this.f70381f.getLineWidth(i13));
                    i13++;
                }
                if (this.f70379d.m137334b().equals("action.sticker.ai.open_mp")) {
                    int i25 = this.f70389n;
                    int i26 = f70346H;
                    int i27 = (i25 - i26) - i24;
                    int i28 = f70347I;
                    this.f70384i = (i27 - i28) / 2;
                    this.f70385j = ((m76259g() - f70352N) - i26) / 2;
                    this.f70386k = this.f70384i + i26 + i28;
                } else {
                    this.f70386k = (this.f70389n - i24) / 2;
                }
                this.f70387l = f70349K;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public boolean m76256a() {
        if (this.f70379d.m137344l() == 1 || this.f70379d.m137344l() == 3 || this.f70379d.m137344l() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m76257c() {
        float f11;
        try {
            if (this.f70389n <= 0) {
                return;
            }
            if (this.f70379d.m137344l() == 0) {
                int i11 = this.f70389n - (f70351M * 2);
                this.f70381f = AbstractC23214t.m119625l(this.f70379d.m137343k(), f70358T, i11, 2);
                this.f70382g = AbstractC23214t.m119625l(this.f70379d.m137343k(), f70359U, i11, 2);
                return;
            }
            int i12 = 0;
            if (this.f70379d.m137344l() == 1) {
                int i13 = this.f70389n - (f70351M * 2);
                if (this.f70373C) {
                    i12 = f70345G - f70348J;
                }
                int i14 = i13 - i12;
                StaticLayout m119625l = AbstractC23214t.m119625l(this.f70379d.m137343k(), f70358T, i14, 2);
                this.f70381f = m119625l;
                if (!this.f70373C && m119625l.getLineCount() > 1) {
                    this.f70381f = AbstractC23214t.m119627n(this.f70379d.m137343k(), f70358T, i14, 2, Layout.Alignment.ALIGN_CENTER);
                    return;
                }
                return;
            }
            if (this.f70379d.m137344l() == 2) {
                this.f70381f = AbstractC23214t.m119627n(this.f70379d.m137343k(), f70361W, this.f70389n - (f70351M * 2), 2, Layout.Alignment.ALIGN_CENTER);
                return;
            }
            if (this.f70379d.m137344l() == 3) {
                if (this.f70372B) {
                    String upperCase = this.f70379d.m137335c().toUpperCase();
                    this.f70400y = upperCase;
                    if (!TextUtils.isEmpty(upperCase)) {
                        StaticLayout m119625l2 = AbstractC23214t.m119625l(this.f70400y, f70368d0, f70357S, 1);
                        this.f70401z = m119625l2;
                        this.f70399x = (m119625l2.getHeight() + (f70355Q * 2)) / 2;
                    }
                }
                int i15 = this.f70389n - f70356R;
                int i16 = f70351M;
                float f12 = (((i15 - i16) - f70353O) - i16) - i16;
                StaticLayout staticLayout = this.f70401z;
                if (staticLayout != null) {
                    f11 = staticLayout.getLineWidth(0) + (f70354P * 2);
                } else {
                    f11 = 0.0f;
                }
                int i17 = (int) (f12 - f11);
                if (i17 > 0) {
                    this.f70381f = AbstractC23214t.m119625l(this.f70379d.m137343k(), f70364Z, i17, 2);
                    if (!TextUtils.isEmpty(this.f70379d.m137336d())) {
                        this.f70383h = AbstractC23214t.m119625l(this.f70379d.m137336d(), f70365a0, i17, 2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.f70379d.m137344l() == 4) {
                if (this.f70379d.m137334b().equals("action.sticker.ai.open_mp")) {
                    this.f70381f = AbstractC23214t.m119625l(this.f70379d.m137343k(), f70362X, ((this.f70389n - (f70351M * 2)) - f70346H) - f70347I, 2);
                } else {
                    this.f70381f = AbstractC23214t.m119627n(this.f70379d.m137343k(), f70362X, ((this.f70389n - (f70351M * 2)) - f70346H) - f70347I, 2, Layout.Alignment.ALIGN_CENTER);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m76258d(Canvas canvas) {
        StaticLayout staticLayout;
        try {
            if (this.f70389n <= 0) {
                return;
            }
            if (this.f70379d.m137344l() == 0) {
                canvas.save();
                canvas.translate(this.f70390o + f70351M, this.f70391p);
                if (!this.f70392q) {
                    this.f70381f.draw(canvas);
                } else {
                    this.f70382g.draw(canvas);
                }
                canvas.restore();
                return;
            }
            if (this.f70379d.m137344l() == 1) {
                canvas.save();
                canvas.translate(this.f70390o, this.f70391p);
                canvas.drawLine(0.0f, 0.0f, this.f70389n, 0.0f, f70360V);
                if (this.f70373C) {
                    if (this.f70379d.m137340h() == 1) {
                        m76250e(canvas, AbstractC16803z.ic_scan_qr_footer, this.f70384i, this.f70385j);
                    } else {
                        this.f70371A.m76467d(canvas);
                    }
                }
                canvas.translate(this.f70386k, this.f70387l);
                if (!this.f70392q) {
                    this.f70381f.draw(canvas);
                } else {
                    this.f70382g.draw(canvas);
                }
                canvas.restore();
                return;
            }
            if (this.f70379d.m137344l() == 2) {
                canvas.save();
                float f11 = this.f70390o;
                int i11 = this.f70391p;
                int i12 = f70352N;
                canvas.translate(f11, i11 + i12);
                if (!this.f70392q) {
                    AbstractC11531v0.m62265h2().setBounds(0, 0, this.f70389n, m76259g() - i12);
                    AbstractC11531v0.m62265h2().draw(canvas);
                    canvas.translate(this.f70386k, this.f70387l);
                    this.f70381f.draw(canvas);
                } else {
                    AbstractC11531v0.m62270i2().setBounds(0, 0, this.f70389n, m76259g() - i12);
                    AbstractC11531v0.m62270i2().draw(canvas);
                    canvas.translate(this.f70386k, this.f70387l);
                    this.f70382g.draw(canvas);
                }
                canvas.restore();
                return;
            }
            if (this.f70379d.m137344l() == 3) {
                canvas.save();
                canvas.translate(this.f70390o, this.f70391p);
                canvas.drawLine(0.0f, 0.0f, this.f70389n, 0.0f, f70360V);
                this.f70371A.m76467d(canvas);
                if (this.f70381f != null) {
                    canvas.save();
                    canvas.translate(this.f70386k, this.f70387l);
                    this.f70381f.draw(canvas);
                    canvas.restore();
                }
                if (this.f70383h != null) {
                    canvas.save();
                    canvas.translate(this.f70397v, this.f70398w);
                    this.f70383h.draw(canvas);
                    canvas.restore();
                }
                if (this.f70372B && (staticLayout = this.f70401z) != null) {
                    RectF rectF = f70369e0;
                    int i13 = this.f70393r;
                    int i14 = f70354P;
                    int i15 = this.f70394s;
                    int i16 = f70355Q;
                    rectF.set(i13 - i14, i15 - i16, i13 + staticLayout.getLineWidth(0) + i14, this.f70394s + this.f70401z.getHeight() + i16);
                    if (this.f70392q) {
                        RectF rectF2 = f70369e0;
                        int i17 = this.f70399x;
                        canvas.drawRoundRect(rectF2, i17, i17, f70366b0);
                    }
                    RectF rectF3 = f70369e0;
                    int i18 = this.f70399x;
                    canvas.drawRoundRect(rectF3, i18, i18, f70367c0);
                    canvas.save();
                    canvas.translate(this.f70393r, this.f70394s);
                    this.f70401z.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
                return;
            }
            if (this.f70379d.m137344l() == 4) {
                canvas.save();
                float f12 = this.f70390o;
                int i19 = this.f70391p;
                int i21 = f70352N;
                canvas.translate(f12, i19 + i21);
                AbstractC11531v0.m62275j2().setBounds(0, 0, this.f70389n, m76259g() - i21);
                AbstractC11531v0.m62275j2().draw(canvas);
                m76251f(canvas, this.f70384i, this.f70385j);
                canvas.translate(this.f70386k, this.f70387l);
                this.f70381f.draw(canvas);
                canvas.restore();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public int m76259g() {
        int height;
        int i11;
        int i12;
        int i13 = 0;
        if (this.f70389n <= 0) {
            return 0;
        }
        if (this.f70379d.m137344l() == 0) {
            height = this.f70381f.getHeight();
            i11 = f70349K;
        } else {
            if (this.f70379d.m137344l() == 1) {
                if (this.f70373C) {
                    height = Math.max(this.f70381f.getHeight(), f70345G);
                } else {
                    height = this.f70381f.getHeight();
                }
                i12 = f70350L;
            } else if (this.f70379d.m137344l() != 2 && this.f70379d.m137344l() != 4) {
                StaticLayout staticLayout = this.f70381f;
                if (staticLayout != null) {
                    i13 = staticLayout.getHeight();
                }
                StaticLayout staticLayout2 = this.f70383h;
                if (staticLayout2 != null) {
                    i13 += staticLayout2.getHeight();
                }
                height = Math.max(f70353O, i13);
                i12 = f70349K;
            } else {
                height = this.f70381f.getHeight() + (f70349K * 2);
                i11 = f70352N;
            }
            i11 = i12 * 2;
        }
        return height + i11;
    }

    /* renamed from: k */
    public boolean m76260k(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            this.f70392q = m76253i(x11, y11);
        } else if (motionEvent.getAction() == 1) {
            if (this.f70392q && m76253i(x11, y11)) {
                b bVar = this.f70375E;
                if (bVar != null) {
                    bVar.mo60887a(this.f70379d.m137334b(), this.f70379d.m137333a(), this.f70379d.m137344l());
                }
                ActionLogChatLocation.f55164a.m56648b(this.f70379d, this.f70380e);
            }
            this.f70392q = false;
        } else if (motionEvent.getAction() == 3) {
            this.f70392q = false;
        }
        if (this.f70392q) {
            m76249b();
        }
        this.f70388m.invalidate();
        return this.f70392q;
    }

    /* renamed from: m */
    public void m76261m(b bVar) {
        this.f70375E = bVar;
    }

    /* renamed from: n */
    public void m76262n(int i11, int i12) {
        this.f70390o = i11;
        this.f70391p = i12;
    }

    /* renamed from: o */
    public void m76263o(int i11) {
        if (this.f70389n != i11) {
            this.f70389n = i11;
            m76257c();
            m76255l();
            m76254j(this.f70379d.m137339g());
        }
    }
}
