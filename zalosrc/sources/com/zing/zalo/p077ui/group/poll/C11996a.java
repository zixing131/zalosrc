package com.zing.zalo.p077ui.group.poll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import au.C2343e;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.DumpChatImageView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.zview.AbstractC17450b;
import h70.AbstractC19907a;
import ho0.AbstractC20110a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23184q2;
import me0.AbstractC23214t;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p266jg.C21243a;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p588vw.C28652r;
import p716zh.C31961i8;
import th.AbstractC26683d;
import vg.AbstractC28245z3;
import vg.C28203u6;
import y60.C30799a;

/* renamed from: com.zing.zalo.ui.group.poll.a */
/* loaded from: classes5.dex */
public class C11996a {

    /* renamed from: M0 */
    public static final int f62426M0 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: N0 */
    public static final int f62427N0 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: O0 */
    public static final int f62428O0 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: P0 */
    public static final int f62429P0 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: Q0 */
    public static final int f62430Q0 = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: R0 */
    public static final int f62431R0 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: S0 */
    public static final int f62432S0 = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: T0 */
    public static final int f62433T0 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: U0 */
    public static final int f62434U0 = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: V0 */
    public static final int f62435V0 = AbstractC23136l9.m118742r(60.0f);

    /* renamed from: W0 */
    public static final int f62436W0 = AbstractC23136l9.m118742r(36.0f);

    /* renamed from: X0 */
    public static final int f62437X0 = AbstractC23136l9.m118742r(17.333334f);

    /* renamed from: Y0 */
    public static final int f62438Y0 = AbstractC23136l9.m118742r(5.3333335f);

    /* renamed from: Z0 */
    public static final int f62439Z0 = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: a1 */
    public static final int f62440a1 = AbstractC23136l9.m118742r(21.0f);

    /* renamed from: b1 */
    public static final int f62441b1 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: c1 */
    public static final int f62442c1 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: A */
    int f62443A;

    /* renamed from: A0 */
    StaticLayout f62444A0;

    /* renamed from: B */
    int f62445B;

    /* renamed from: B0 */
    public Drawable f62446B0;

    /* renamed from: C */
    int f62447C;

    /* renamed from: C0 */
    C31961i8 f62448C0;

    /* renamed from: D */
    int f62449D;

    /* renamed from: E */
    int f62451E;

    /* renamed from: F */
    int f62453F;

    /* renamed from: G */
    int f62455G;

    /* renamed from: H */
    int[] f62457H;

    /* renamed from: I */
    int[] f62459I;

    /* renamed from: J */
    int[] f62461J;

    /* renamed from: K */
    int[] f62463K;

    /* renamed from: L */
    int[] f62465L;

    /* renamed from: M */
    int f62467M;

    /* renamed from: P */
    StaticLayout f62470P;

    /* renamed from: Q */
    StaticLayout f62471Q;

    /* renamed from: R */
    StaticLayout[] f62472R;

    /* renamed from: S */
    StaticLayout[] f62473S;

    /* renamed from: U */
    Drawable[][] f62475U;

    /* renamed from: V */
    StaticLayout f62476V;

    /* renamed from: X */
    StaticLayout f62478X;

    /* renamed from: Y */
    StaticLayout f62479Y;

    /* renamed from: Z */
    StaticLayout f62480Z;

    /* renamed from: a */
    C23528a f62481a;

    /* renamed from: a0 */
    C13704p1 f62482a0;

    /* renamed from: b */
    View f62483b;

    /* renamed from: b0 */
    C13704p1 f62484b0;

    /* renamed from: c */
    Context f62485c;

    /* renamed from: c0 */
    C13704p1 f62486c0;

    /* renamed from: d */
    Paint f62487d;

    /* renamed from: d0 */
    C13704p1 f62488d0;

    /* renamed from: e */
    private int f62489e;

    /* renamed from: e0 */
    C13704p1 f62490e0;

    /* renamed from: f0 */
    C13704p1 f62492f0;

    /* renamed from: g0 */
    C13704p1 f62494g0;

    /* renamed from: h */
    int f62495h;

    /* renamed from: h0 */
    Paint f62496h0;

    /* renamed from: i */
    int f62497i;

    /* renamed from: i0 */
    C13704p1 f62498i0;

    /* renamed from: j0 */
    C13704p1 f62500j0;

    /* renamed from: k0 */
    C13704p1 f62502k0;

    /* renamed from: l0 */
    AbstractC19907a f62504l0;

    /* renamed from: m */
    int f62505m;

    /* renamed from: m0 */
    int f62506m0;

    /* renamed from: n0 */
    int f62508n0;

    /* renamed from: o */
    int f62509o;

    /* renamed from: o0 */
    int f62510o0;

    /* renamed from: p */
    int f62511p;

    /* renamed from: p0 */
    int f62512p0;

    /* renamed from: q */
    int f62513q;

    /* renamed from: q0 */
    int f62514q0;

    /* renamed from: r0 */
    int f62516r0;

    /* renamed from: s0 */
    int f62518s0;

    /* renamed from: t0 */
    int f62520t0;

    /* renamed from: u0 */
    int f62522u0;

    /* renamed from: v0 */
    int f62524v0;

    /* renamed from: w0 */
    int f62526w0;

    /* renamed from: x */
    int f62527x;

    /* renamed from: x0 */
    C13704p1 f62528x0;

    /* renamed from: y */
    int f62529y;

    /* renamed from: y0 */
    C13704p1 f62530y0;

    /* renamed from: z */
    int f62531z;

    /* renamed from: z0 */
    StaticLayout f62532z0;

    /* renamed from: f */
    int f62491f = 0;

    /* renamed from: g */
    int f62493g = 0;

    /* renamed from: j */
    int f62499j = 0;

    /* renamed from: k */
    int f62501k = 0;

    /* renamed from: l */
    int f62503l = 0;

    /* renamed from: n */
    int f62507n = 0;

    /* renamed from: r */
    int f62515r = 0;

    /* renamed from: s */
    int f62517s = 0;

    /* renamed from: t */
    int f62519t = 0;

    /* renamed from: u */
    int f62521u = 0;

    /* renamed from: v */
    int f62523v = 0;

    /* renamed from: w */
    int f62525w = 0;

    /* renamed from: N */
    int f62468N = 0;

    /* renamed from: O */
    int f62469O = 0;

    /* renamed from: T */
    boolean f62474T = true;

    /* renamed from: W */
    final List f62477W = new ArrayList();

    /* renamed from: D0 */
    boolean f62450D0 = false;

    /* renamed from: E0 */
    boolean f62452E0 = false;

    /* renamed from: F0 */
    boolean f62454F0 = false;

    /* renamed from: G0 */
    boolean f62456G0 = true;

    /* renamed from: H0 */
    boolean f62458H0 = false;

    /* renamed from: I0 */
    boolean f62460I0 = false;

    /* renamed from: J0 */
    boolean f62462J0 = false;

    /* renamed from: K0 */
    boolean f62464K0 = false;

    /* renamed from: L0 */
    boolean f62466L0 = false;

    /* renamed from: com.zing.zalo.ui.group.poll.a$a */
    /* loaded from: classes5.dex */
    class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ int f62533l1;

        /* renamed from: m1 */
        final /* synthetic */ int f62534m1;

        a(int i11, int i12) {
            this.f62533l1 = i11;
            this.f62534m1 = i12;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null) {
                        if (c3979l.m18839c().getWidth() == 1) {
                            if (c3979l.m18839c().getHeight() != 1) {
                            }
                        }
                        C11996a.this.f62475U[this.f62533l1][this.f62534m1] = new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c());
                        C11996a.this.f62483b.invalidate();
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    return;
                }
            }
            C11996a.this.f62475U[this.f62533l1][this.f62534m1] = C23278z2.m120081L0().f116261b;
            C11996a.this.f62483b.invalidate();
        }
    }

    /* renamed from: com.zing.zalo.ui.group.poll.a$b */
    /* loaded from: classes5.dex */
    class b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ int f62536l1;

        /* renamed from: m1 */
        final /* synthetic */ int f62537m1;

        b(int i11, int i12) {
            this.f62536l1 = i11;
            this.f62537m1 = i12;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null) {
                        if (c3979l.m18839c().getWidth() == 1) {
                            if (c3979l.m18839c().getHeight() != 1) {
                            }
                        }
                        C11996a.this.f62475U[this.f62536l1][this.f62537m1] = new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c());
                        C11996a.this.f62483b.invalidate();
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    return;
                }
            }
            C11996a.this.f62475U[this.f62536l1][this.f62537m1] = C23278z2.m120081L0().f116261b;
            C11996a.this.f62483b.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.group.poll.a$c */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f62539a;

        static {
            int[] iArr = new int[d.values().length];
            f62539a = iArr;
            try {
                iArr[d.ACTION_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62539a[d.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62539a[d.PROFILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62539a[d.VOTE_COUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62539a[d.SETTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.poll.a$d */
    /* loaded from: classes5.dex */
    public enum d {
        ACTION_CENTER,
        BODY,
        PROFILE,
        VOTE_COUNT,
        SETTING
    }

    public C11996a(View view) {
        this.f62483b = view;
        Context context = view.getContext();
        this.f62485c = context;
        this.f62481a = new C23528a(context);
        C13704p1 c13704p1 = new C13704p1(1);
        this.f62528x0 = c13704p1;
        c13704p1.setTextSize(AbstractC23136l9.m118742r(14.0f));
        this.f62528x0.setColor(C23212s8.m119607o(this.f62485c, AbstractC21196a.TextColor1));
        this.f62528x0.m76613c();
        C13704p1 c13704p12 = new C13704p1(1);
        this.f62530y0 = c13704p12;
        Typeface typeface = Typeface.DEFAULT;
        c13704p12.setTypeface(typeface);
        this.f62530y0.setTextSize(AbstractC23136l9.m118742r(13.0f));
        this.f62530y0.setColor(AbstractC11531v0.m62143G3());
        Paint paint = new Paint();
        this.f62487d = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f62487d.setStrokeWidth(1.0f);
        this.f62487d.setColor(C23212s8.m119607o(this.f62485c, AbstractC16781w.ItemSeparatorColor));
        C13704p1 c13704p13 = new C13704p1(1);
        this.f62482a0 = c13704p13;
        int i11 = f62434U0;
        c13704p13.setTextSize(i11);
        this.f62482a0.m76613c();
        this.f62482a0.setColor(C23212s8.m119607o(this.f62485c, AbstractC21196a.TextColor1));
        C13704p1 c13704p14 = new C13704p1(1);
        this.f62484b0 = c13704p14;
        int i12 = f62433T0;
        c13704p14.setTextSize(i12);
        this.f62484b0.setTypeface(typeface);
        this.f62484b0.setColor(C23212s8.m119607o(this.f62485c, AbstractC17450b.NotificationColor5));
        C13704p1 c13704p15 = new C13704p1(1);
        this.f62486c0 = c13704p15;
        c13704p15.setTextSize(i12);
        this.f62486c0.setTypeface(typeface);
        this.f62486c0.setColor(C23212s8.m119607o(this.f62485c, AbstractC21196a.TextColor2));
        C13704p1 c13704p16 = new C13704p1(1);
        this.f62488d0 = c13704p16;
        c13704p16.setTextSize(i12);
        this.f62488d0.setTypeface(typeface);
        this.f62488d0.setColor(C23212s8.m119607o(this.f62485c, AbstractC16781w.LinkColor));
        C13704p1 c13704p17 = new C13704p1(1);
        this.f62490e0 = c13704p17;
        c13704p17.setTextSize(AbstractC23136l9.m118742r(14.0f));
        this.f62490e0.setTypeface(typeface);
        this.f62490e0.setColor(C23212s8.m119607o(this.f62485c, AbstractC21196a.TextColor1));
        C13704p1 c13704p18 = new C13704p1(1);
        this.f62492f0 = c13704p18;
        c13704p18.setTextSize(AbstractC23136l9.m118742r(10.0f));
        this.f62492f0.m76613c();
        this.f62492f0.setColor(C23212s8.m119607o(this.f62485c, AbstractC16781w.LinkColor));
        C13704p1 c13704p19 = new C13704p1(1);
        this.f62494g0 = c13704p19;
        c13704p19.setTextSize(AbstractC23136l9.m118742r(14.0f));
        this.f62494g0.m76613c();
        this.f62494g0.setColor(C23212s8.m119607o(this.f62485c, AbstractC21196a.TextColor1));
        Paint paint2 = new Paint(1);
        this.f62496h0 = paint2;
        paint2.setColor(C23212s8.m119607o(this.f62485c, AbstractC16781w.PrimaryBackgroundColor));
        this.f62496h0.setStyle(style);
        this.f62496h0.setStrokeWidth(1.0f);
        C13704p1 c13704p110 = new C13704p1(1);
        this.f62498i0 = c13704p110;
        c13704p110.setTypeface(typeface);
        this.f62498i0.setTextSize(i11);
        this.f62498i0.setColor(C23212s8.m119607o(this.f62485c, AbstractC21196a.TextColor1));
        C13704p1 c13704p111 = new C13704p1(1);
        this.f62500j0 = c13704p111;
        c13704p111.m76613c();
        this.f62500j0.setTextSize(AbstractC23136l9.m118742r(14.0f));
        this.f62500j0.setColor(C23212s8.m119607o(this.f62485c, AbstractC16781w.AppPrimaryColor));
        C13704p1 c13704p112 = new C13704p1(1);
        this.f62502k0 = c13704p112;
        c13704p112.setTypeface(typeface);
        this.f62502k0.setTextSize(i12);
        this.f62502k0.setColor(C23212s8.m119607o(this.f62485c, AbstractC17450b.NotificationColor5));
    }

    /* renamed from: a */
    boolean m66617a(float f11, float f12, d dVar) {
        float f13;
        float f14;
        int i11;
        try {
            f13 = f11 - this.f62495h;
            f14 = f12 - this.f62497i;
            i11 = c.f62539a[dVar.ordinal()];
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return false;
                        }
                        int i12 = this.f62508n0;
                        int i13 = f62441b1;
                        if (f13 <= i12 - i13 || f13 >= this.f62506m0 + i13 || f14 <= this.f62510o0 - i13 || f14 >= this.f62512p0 + i13) {
                            return false;
                        }
                        return true;
                    }
                    StaticLayout staticLayout = this.f62478X;
                    if (staticLayout == null) {
                        return false;
                    }
                    int i14 = this.f62525w;
                    if (f13 <= i14 || f13 >= i14 + staticLayout.getLineWidth(0)) {
                        return false;
                    }
                    int i15 = this.f62523v;
                    int i16 = f62442c1;
                    if (f14 <= i15 - i16 || f14 >= i15 + this.f62478X.getHeight() + i16) {
                        return false;
                    }
                    return true;
                }
                if (f13 > this.f62514q0) {
                    int i17 = f62436W0;
                    if (f13 < r7 + i17) {
                        if (f14 > this.f62516r0 && f14 < r7 + i17) {
                            return true;
                        }
                    }
                }
                StaticLayout staticLayout2 = this.f62532z0;
                if (staticLayout2 == null) {
                    return false;
                }
                int i18 = this.f62518s0;
                if (f13 <= i18 || f13 >= i18 + staticLayout2.getLineWidth(0)) {
                    return false;
                }
                if (f14 <= this.f62520t0 || f14 >= r5 + this.f62532z0.getHeight()) {
                    return false;
                }
                return true;
            }
            if (f13 <= this.f62447C || f13 >= this.f62449D || f14 <= this.f62445B || f14 >= this.f62451E) {
                return false;
            }
            return true;
        }
        if (this.f62479Y == null || f13 <= this.f62529y || f13 >= this.f62531z || f14 <= this.f62527x || f14 >= this.f62443A) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m66618b() {
        if (AbstractC26683d.f126393l && this.f62483b != null) {
            StaticLayout staticLayout = this.f62470P;
            if (staticLayout != null) {
                AbstractC28245z3.m142218a(staticLayout.getText(), this.f62483b);
            }
            StaticLayout[] staticLayoutArr = this.f62472R;
            if (staticLayoutArr != null) {
                for (StaticLayout staticLayout2 : staticLayoutArr) {
                    if (staticLayout2 != null) {
                        AbstractC28245z3.m142218a(staticLayout2.getText(), this.f62483b);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m66619c(Canvas canvas) {
        int i11;
        Drawable m62296n3;
        canvas.save();
        canvas.translate(this.f62495h, this.f62497i);
        C30799a m62193R1 = AbstractC11531v0.m62193R1();
        if (this.f62460I0) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        m62193R1.m149863a(1, i11);
        m62193R1.setBounds(this.f62447C, this.f62445B, this.f62449D, this.f62451E);
        m62193R1.draw(canvas);
        if (this.f62454F0) {
            Drawable drawable = this.f62446B0;
            if (drawable != null) {
                int i12 = this.f62514q0;
                int i13 = this.f62516r0;
                int i14 = f62436W0;
                drawable.setBounds(i12, i13, i12 + i14, i14 + i13);
                this.f62446B0.draw(canvas);
            }
            if (this.f62532z0 != null) {
                canvas.save();
                canvas.translate(this.f62518s0, this.f62520t0);
                this.f62532z0.draw(canvas);
                canvas.restore();
            }
            if (this.f62444A0 != null) {
                canvas.save();
                canvas.translate(this.f62522u0, this.f62524v0);
                this.f62444A0.draw(canvas);
                canvas.restore();
            }
            float f11 = this.f62499j;
            int i15 = this.f62526w0;
            canvas.drawLine(f11, i15, this.f62503l, i15, this.f62487d);
        }
        if (this.f62470P != null) {
            canvas.save();
            canvas.translate(this.f62505m, this.f62507n);
            this.f62470P.draw(canvas);
            canvas.restore();
        }
        if (this.f62452E0 && this.f62471Q != null) {
            canvas.save();
            canvas.translate(this.f62509o, this.f62511p);
            this.f62471Q.draw(canvas);
            canvas.restore();
            float f12 = this.f62499j;
            int i16 = this.f62513q;
            canvas.drawLine(f12, i16, this.f62503l, i16, this.f62487d);
        }
        if (this.f62450D0) {
            AbstractC11531v0.m62345x2().setBounds(this.f62508n0, this.f62510o0, this.f62506m0, this.f62512p0);
            AbstractC11531v0.m62345x2().draw(canvas);
        }
        if (this.f62476V != null) {
            canvas.save();
            canvas.translate(this.f62515r, this.f62517s);
            this.f62476V.draw(canvas);
            canvas.restore();
        }
        if (!this.f62477W.isEmpty()) {
            canvas.save();
            canvas.translate(this.f62519t, this.f62521u);
            for (int i17 = 0; i17 < this.f62477W.size(); i17++) {
                ((StaticLayout) this.f62477W.get(i17)).draw(canvas);
                canvas.translate(0.0f, f62430Q0 + r3.getHeight());
            }
            canvas.restore();
        }
        if (this.f62478X != null) {
            canvas.save();
            canvas.translate(this.f62525w, this.f62523v);
            this.f62478X.draw(canvas);
            if (this.f62456G0) {
                Drawable m62172M2 = AbstractC11531v0.m62172M2();
                int width = this.f62478X.getWidth();
                int height = this.f62478X.getHeight();
                int i18 = f62434U0;
                m62172M2.setBounds(width, (height - i18) / 2, this.f62478X.getWidth() + i18, ((this.f62478X.getHeight() - i18) / 2) + i18);
                AbstractC11531v0.m62172M2().draw(canvas);
            }
            canvas.restore();
        }
        for (int i19 = 0; i19 < this.f62468N; i19++) {
            AbstractC11531v0.m62286l3().setBounds(this.f62453F, this.f62457H[i19], this.f62455G, this.f62459I[i19]);
            AbstractC11531v0.m62286l3().draw(canvas);
            AbstractC11531v0.m62291m3().setBounds(this.f62453F, this.f62457H[i19], this.f62463K[i19], this.f62459I[i19]);
            AbstractC11531v0.m62291m3().draw(canvas);
            int i21 = this.f62459I[i19] - this.f62457H[i19];
            canvas.save();
            int i22 = this.f62453F;
            int i23 = f62433T0;
            canvas.translate(i22 + i23, this.f62457H[i19] + ((i21 - this.f62472R[i19].getHeight()) / 2.0f));
            this.f62472R[i19].draw(canvas);
            canvas.restore();
            if (this.f62465L[i19] > 0 && (m62296n3 = AbstractC11531v0.m62296n3()) != null) {
                canvas.save();
                canvas.translate(this.f62465L[i19], (this.f62457H[i19] + (i21 / 2.0f)) - (m62296n3.getIntrinsicHeight() / 2.0f));
                m62296n3.setBounds(0, 0, m62296n3.getIntrinsicWidth(), m62296n3.getIntrinsicHeight());
                m62296n3.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            canvas.translate(this.f62455G - i23, this.f62457H[i19]);
            if (this.f62473S[i19] != null) {
                canvas.translate(-r6.getWidth(), 0.0f);
                if (this.f62474T) {
                    Drawable m62189Q1 = AbstractC11531v0.m62189Q1();
                    int i24 = f62434U0;
                    m62189Q1.setBounds(0, (i21 - i24) / 2, this.f62473S[i19].getWidth(), ((i21 - i24) / 2) + i24);
                    AbstractC11531v0.m62189Q1().draw(canvas);
                }
                canvas.save();
                canvas.translate(0.0f, (i21 - this.f62473S[i19].getHeight()) / 2.0f);
                this.f62473S[i19].draw(canvas);
                canvas.restore();
            }
            canvas.translate(0.0f, (i21 - f62434U0) / 2.0f);
            for (int i25 = 2; i25 >= 0; i25--) {
                Drawable drawable2 = this.f62475U[i19][i25];
                if (drawable2 != null) {
                    int i26 = f62434U0;
                    canvas.translate((-i26) + AbstractC23136l9.m118742r(3.0f), 0.0f);
                    drawable2.setBounds(0, 0, i26, i26);
                    drawable2.draw(canvas);
                    canvas.drawCircle(i26 / 2.0f, i26 / 2.0f, i26 / 2.0f, this.f62496h0);
                }
            }
            canvas.restore();
        }
        if (this.f62469O > 0 && this.f62480Z != null) {
            canvas.save();
            canvas.translate(this.f62499j, this.f62467M);
            this.f62480Z.draw(canvas);
            canvas.restore();
        }
        if (this.f62479Y != null) {
            if (!this.f62448C0.m153671i() && !this.f62448C0.m153672j()) {
                if (this.f62458H0) {
                    AbstractC11531v0.m62146H1().setBounds(this.f62529y, this.f62527x, this.f62531z, this.f62443A);
                    AbstractC11531v0.m62146H1().draw(canvas);
                } else {
                    AbstractC11531v0.m62141G1().setBounds(this.f62529y, this.f62527x, this.f62531z, this.f62443A);
                    AbstractC11531v0.m62141G1().draw(canvas);
                }
            } else if (this.f62458H0) {
                AbstractC11531v0.m62156J1().setBounds(this.f62529y, this.f62527x, this.f62531z, this.f62443A);
                AbstractC11531v0.m62156J1().draw(canvas);
            } else {
                AbstractC11531v0.m62151I1().setBounds(this.f62529y, this.f62527x, this.f62531z, this.f62443A);
                AbstractC11531v0.m62151I1().draw(canvas);
            }
            canvas.save();
            canvas.translate(this.f62529y, this.f62527x + (((this.f62443A - r1) - this.f62479Y.getHeight()) / 2.0f));
            this.f62479Y.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    /* renamed from: d */
    public int m66620d() {
        return this.f62493g;
    }

    /* renamed from: e */
    public C31961i8 m66621e() {
        return this.f62448C0;
    }

    /* renamed from: f */
    public int m66622f() {
        return this.f62491f;
    }

    /* renamed from: g */
    public boolean m66623g(int i11, float f11, float f12) {
        if (i11 == 0) {
            if (m66617a(f11, f12, d.ACTION_CENTER)) {
                this.f62458H0 = true;
                return true;
            }
            if (m66617a(f11, f12, d.SETTING) && this.f62450D0) {
                this.f62464K0 = true;
                return true;
            }
            if (m66617a(f11, f12, d.PROFILE)) {
                this.f62462J0 = true;
                return true;
            }
            if (m66617a(f11, f12, d.VOTE_COUNT)) {
                this.f62466L0 = true;
                return true;
            }
            if (m66617a(f11, f12, d.BODY)) {
                this.f62460I0 = true;
                return true;
            }
        } else if (i11 == 1 || i11 == 3) {
            if (this.f62464K0) {
                this.f62464K0 = false;
                if (i11 == 1 && m66617a(f11, f12, d.SETTING) && this.f62450D0) {
                    AbstractC19907a abstractC19907a = this.f62504l0;
                    if (abstractC19907a != null) {
                        abstractC19907a.mo35629b();
                    }
                    return true;
                }
            }
            if (this.f62462J0) {
                this.f62462J0 = false;
                if (i11 == 1 && m66617a(f11, f12, d.PROFILE)) {
                    AbstractC19907a abstractC19907a2 = this.f62504l0;
                    if (abstractC19907a2 != null) {
                        abstractC19907a2.mo35628a();
                    }
                    return true;
                }
            }
            if (this.f62458H0) {
                this.f62458H0 = false;
                if (i11 == 1 && m66617a(f11, f12, d.ACTION_CENTER)) {
                    AbstractC19907a abstractC19907a3 = this.f62504l0;
                    if (abstractC19907a3 != null) {
                        abstractC19907a3.mo35630c(false);
                    }
                    return true;
                }
            }
            if (this.f62466L0) {
                this.f62466L0 = false;
                if (i11 == 1 && m66617a(f11, f12, d.VOTE_COUNT)) {
                    AbstractC19907a abstractC19907a4 = this.f62504l0;
                    if (abstractC19907a4 != null) {
                        abstractC19907a4.mo35630c(this.f62456G0);
                    }
                    return true;
                }
            }
            if (this.f62460I0) {
                this.f62460I0 = false;
                if (i11 == 1 && m66617a(f11, f12, d.BODY)) {
                    AbstractC19907a abstractC19907a5 = this.f62504l0;
                    if (abstractC19907a5 != null) {
                        abstractC19907a5.mo35630c(false);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public void m66624h(AbstractC19907a abstractC19907a) {
        this.f62504l0 = abstractC19907a;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0384 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:6:0x0007, B:8:0x001e, B:9:0x0044, B:11:0x0061, B:12:0x00c6, B:16:0x00f7, B:17:0x00fc, B:19:0x0100, B:20:0x0146, B:22:0x014f, B:24:0x015b, B:25:0x017c, B:26:0x0194, B:28:0x019e, B:30:0x01f2, B:32:0x01f6, B:34:0x01fa, B:35:0x0215, B:37:0x0219, B:39:0x0224, B:41:0x023e, B:42:0x0247, B:43:0x026f, B:45:0x0273, B:47:0x027b, B:49:0x0282, B:51:0x0286, B:54:0x028f, B:55:0x0299, B:56:0x02d3, B:58:0x02d7, B:60:0x02f2, B:61:0x02f6, B:63:0x030c, B:65:0x0310, B:68:0x0384, B:70:0x0388, B:72:0x039d, B:74:0x03a5, B:76:0x03b3, B:77:0x03c4, B:78:0x03bc, B:79:0x03d3, B:80:0x03e7, B:82:0x03f0, B:84:0x03fa, B:89:0x0408, B:91:0x0412, B:95:0x041c, B:97:0x0424, B:99:0x0437, B:101:0x0443, B:102:0x0452, B:103:0x044c, B:104:0x0461, B:88:0x0478, B:111:0x032c, B:113:0x0330, B:115:0x0336, B:117:0x033a, B:118:0x0345, B:121:0x0358, B:122:0x047d, B:124:0x048b, B:125:0x0491, B:127:0x04bb, B:130:0x04c2, B:132:0x04cc, B:134:0x04dc, B:135:0x04ee, B:139:0x04fd, B:141:0x0502, B:145:0x04ea, B:149:0x0507, B:151:0x050e, B:152:0x0541, B:154:0x0550, B:157:0x0557, B:158:0x0572, B:161:0x0565, B:162:0x0295, B:164:0x027f, B:166:0x0221, B:167:0x0208, B:168:0x026d, B:169:0x01a2, B:171:0x01a6, B:172:0x01a9, B:174:0x01b1, B:175:0x01ce, B:178:0x01d4, B:179:0x01d7, B:181:0x016c, B:182:0x0192, B:183:0x0037), top: B:5:0x0007 }] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m66625i(C31961i8 c31961i8, boolean z11) {
        StaticLayout staticLayout;
        int i11;
        int i12;
        int i13;
        int min;
        int m12307a;
        int m12307a2;
        String str;
        String m118746s0;
        if (c31961i8 == null) {
            return;
        }
        try {
            this.f62448C0 = c31961i8;
            this.f62456G0 = c31961i8.m153664a();
            if (this.f62483b.getResources().getConfiguration().orientation == 2) {
                this.f62491f = ((AbstractC23136l9.m118725l0(this.f62485c) - C21243a.f103541p) - (C21243a.f103542q * 2)) - (this.f62489e * 2);
            } else {
                this.f62491f = AbstractC23136l9.m118725l0(this.f62485c) - (this.f62489e * 2);
            }
            this.f62493g = 0;
            this.f62445B = 0;
            this.f62447C = 0;
            int i14 = this.f62491f;
            this.f62449D = i14;
            this.f62499j = f62426M0;
            int i15 = f62428O0;
            this.f62501k = i15;
            this.f62503l = i14 - f62427N0;
            if (this.f62454F0) {
                String m114542i = AbstractC21935u.m114542i(c31961i8.f146884e, c31961i8.f146885f);
                this.f62516r0 = i15;
                int i16 = this.f62499j;
                this.f62514q0 = i16;
                this.f62520t0 = i15;
                int i17 = f62436W0;
                int i18 = i16 + i17 + f62431R0;
                this.f62518s0 = i18;
                C13704p1 c13704p1 = this.f62528x0;
                int i19 = (this.f62503l - i18) - f62437X0;
                int i21 = f62433T0;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout m119623j = AbstractC23214t.m119623j(m114542i, c13704p1, i19 - i21, 1, alignment);
                this.f62532z0 = m119623j;
                this.f62522u0 = this.f62518s0;
                this.f62524v0 = this.f62520t0 + m119623j.getHeight() + AbstractC23136l9.m118742r(2.0f);
                StaticLayout m119623j2 = AbstractC23214t.m119623j(AbstractC23160o0.m119181A(c31961i8.f146893n), this.f62530y0, this.f62503l - this.f62522u0, 1, alignment);
                this.f62444A0 = m119623j2;
                int max = Math.max(this.f62516r0 + i17, this.f62524v0 + m119623j2.getHeight()) + i21;
                this.f62526w0 = max;
                i15 = max + i21;
            }
            this.f62505m = this.f62499j;
            this.f62507n = i15;
            CharSequence m143353D = C28652r.m143349v().m143353D(c31961i8.f146881b);
            C13704p1 c13704p12 = this.f62482a0;
            int i22 = this.f62503l - this.f62505m;
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout m119623j3 = AbstractC23214t.m119623j(m143353D, c13704p12, i22, 2, alignment2);
            this.f62470P = m119623j3;
            int height = this.f62507n + m119623j3.getHeight() + AbstractC23222t7.f112566j;
            if (AbstractC26683d.f126393l && z11 && m143353D != null) {
                AbstractC28245z3.m142219b(m143353D, this.f62483b);
            }
            if (this.f62452E0) {
                this.f62511p = height;
                this.f62509o = this.f62499j;
                StaticLayout m119627n = AbstractC23214t.m119627n(AbstractC23184q2.m119442G(AbstractC21935u.m114542i(c31961i8.f146884e, c31961i8.f146885f), 32) + " • " + AbstractC23160o0.m119181A(c31961i8.f146893n), this.f62484b0, this.f62503l - this.f62509o, 1, alignment2);
                this.f62471Q = m119627n;
                int height2 = m119627n.getHeight();
                int i23 = f62433T0;
                int i24 = height + height2 + i23;
                this.f62513q = i24;
                height = i24 + i23;
            }
            if (c31961i8.f146894o > 0) {
                this.f62517s = height;
                this.f62515r = this.f62499j;
                if (c31961i8.m153671i()) {
                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_prefix_ended_at_poll_text, AbstractC23160o0.m119205M(c31961i8.f146894o));
                } else {
                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_prefix_ends_at_poll_text, AbstractC23160o0.m119205M(c31961i8.f146894o));
                }
                StaticLayout m119623j4 = AbstractC23214t.m119623j(m118746s0, this.f62486c0, this.f62503l - this.f62515r, 2, alignment2);
                this.f62476V = m119623j4;
                height = this.f62517s + m119623j4.getHeight();
            } else {
                this.f62476V = null;
            }
            this.f62477W.clear();
            boolean z12 = c31961i8.f146890k;
            if (z12 || c31961i8.f146891l) {
                if (this.f62476V != null) {
                    height += f62430Q0;
                }
                this.f62521u = height;
                this.f62519t = this.f62499j;
                if (z12) {
                    staticLayout = AbstractC23214t.m119623j(AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_anonymous_enable_text), this.f62486c0, this.f62503l - this.f62519t, 4, alignment2);
                    height += staticLayout.getHeight();
                    this.f62477W.add(staticLayout);
                } else {
                    staticLayout = null;
                }
                if (c31961i8.f146891l) {
                    if (staticLayout != null) {
                        height += f62430Q0;
                    }
                    StaticLayout m119623j5 = AbstractC23214t.m119623j(AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_hide_vote_preview_enable_text), this.f62486c0, this.f62503l - this.f62519t, 4, alignment2);
                    height += m119623j5.getHeight();
                    this.f62477W.add(m119623j5);
                }
            }
            if (c31961i8.f146897r > 0) {
                if (this.f62456G0) {
                    this.f62488d0.setColor(C23212s8.m119607o(this.f62485c, AbstractC16781w.LinkColor));
                } else {
                    this.f62488d0.setColor(C23212s8.m119607o(this.f62485c, AbstractC21196a.TextColor2));
                }
                if (this.f62476V != null || !this.f62477W.isEmpty()) {
                    height += f62430Q0;
                }
                this.f62523v = height;
                this.f62525w = this.f62499j;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_num_member_voted);
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(c31961i8.f146897r);
                if (c31961i8.f146897r > 1) {
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
                } else {
                    str = "";
                }
                objArr[1] = str;
                String format = String.format(m118743r0, objArr);
                StaticLayout m119623j6 = AbstractC23214t.m119623j(format, this.f62488d0, Math.min(AbstractC23136l9.m118764y0(this.f62488d0, format), (this.f62503l - this.f62525w) - f62434U0), 2, alignment2);
                this.f62478X = m119623j6;
                height += m119623j6.getHeight();
            } else {
                this.f62478X = null;
            }
            if (this.f62476V != null || !this.f62477W.isEmpty() || this.f62478X != null) {
                height += AbstractC23222t7.f112576o;
            }
            ArrayList arrayList = c31961i8.f146882c;
            if (arrayList != null) {
                i11 = arrayList.size();
            } else {
                i11 = 0;
            }
            int i25 = 3;
            if (i11 > 4) {
                this.f62468N = 3;
                this.f62469O = i11 - 3;
            } else {
                this.f62468N = i11;
                this.f62469O = 0;
            }
            this.f62453F = this.f62499j;
            this.f62455G = this.f62503l;
            int i26 = this.f62468N;
            this.f62457H = new int[i26];
            this.f62459I = new int[i26];
            this.f62463K = new int[i26];
            this.f62465L = new int[i26];
            this.f62461J = new int[i26];
            this.f62472R = new StaticLayout[i26];
            this.f62473S = new StaticLayout[i26];
            this.f62474T = !c31961i8.f146890k;
            this.f62475U = (Drawable[][]) Array.newInstance((Class<?>) Drawable.class, i26, 3);
            int i27 = 0;
            while (i27 < this.f62468N) {
                C31961i8.a aVar = (C31961i8.a) c31961i8.f146882c.get(i27);
                CharSequence m143353D2 = C28652r.m143349v().m143353D(aVar.f146901a);
                int i28 = this.f62503l - f62433T0;
                if (c31961i8.f146897r > 0) {
                    i12 = f62435V0;
                } else {
                    i12 = 0;
                }
                this.f62472R[i27] = AbstractC23214t.m119623j(m143353D2, this.f62490e0, (i28 - i12) - this.f62505m, 10, Layout.Alignment.ALIGN_NORMAL);
                int i29 = aVar.f146902b;
                if (i29 > 0) {
                    if (c31961i8.f146890k) {
                        String valueOf = String.valueOf(i29);
                        this.f62473S[i27] = AbstractC23214t.m119623j(valueOf, this.f62494g0, AbstractC23136l9.m118764y0(this.f62494g0, valueOf) + (f62430Q0 * 2), 1, Layout.Alignment.ALIGN_CENTER);
                    } else {
                        ArrayList arrayList2 = aVar.f146907g;
                        if (arrayList2 != null && arrayList2.size() > 0) {
                            int i31 = aVar.f146902b;
                            if (i31 <= i25) {
                                min = Math.min(i31, aVar.f146907g.size());
                            } else {
                                min = Math.min(2, aVar.f146907g.size());
                                int i32 = aVar.f146902b - min;
                                if (i32 > 999) {
                                    i32 = 999;
                                }
                                String str2 = "+" + i32;
                                this.f62473S[i27] = AbstractC23214t.m119623j(str2, this.f62492f0, AbstractC23136l9.m118764y0(this.f62492f0, str2) + (f62430Q0 * 2), 1, Layout.Alignment.ALIGN_CENTER);
                            }
                            if (min > 0) {
                                if (aVar.f146903c) {
                                    DumpChatImageView dumpChatImageView = new DumpChatImageView(this.f62485c);
                                    String str3 = AbstractC23304d.f113368c0.f42446v;
                                    int i33 = 3 - min;
                                    min--;
                                    if (!TextUtils.isEmpty(str3)) {
                                        if (C23302b.f113247a.m120523d(str3)) {
                                            String m118087g = AbstractC23028c0.m118087g(AbstractC23304d.f113368c0.f42437s);
                                            if (TextUtils.isEmpty(m118087g)) {
                                                m12307a2 = C23212s8.m119607o(this.f62485c, AbstractC16781w.AvatarPlaceHolderColor);
                                            } else {
                                                m12307a2 = C2343e.m12307a(AbstractC23304d.f113368c0.f42434r, false);
                                            }
                                            this.f62475U[i27][i33] = C16640q2.m88404a().mo88412f(m118087g, m12307a2);
                                        } else {
                                            ((C23528a) this.f62481a.m123612r(dumpChatImageView)).m123579C(str3, C23278z2.m120081L0(), new a(i27, i33));
                                        }
                                    }
                                }
                                for (int size = aVar.f146907g.size() - 1; size >= 0; size--) {
                                    ContactProfile contactProfile = (ContactProfile) aVar.f146907g.get(size);
                                    if (contactProfile != null && !TextUtils.equals(contactProfile.f42434r, AbstractC23304d.f113368c0.f42434r)) {
                                        ContactProfile m141809c = C28203u6.f131407a.m141809c(contactProfile.f42434r);
                                        if (m141809c != null && !TextUtils.isEmpty(m141809c.f42446v)) {
                                            contactProfile = m141809c;
                                        }
                                        String str4 = contactProfile.f42446v;
                                        if (!TextUtils.isEmpty(str4)) {
                                            DumpChatImageView dumpChatImageView2 = new DumpChatImageView(this.f62485c);
                                            int i34 = 3 - min;
                                            min--;
                                            if (C23302b.f113247a.m120523d(str4)) {
                                                String m118087g2 = AbstractC23028c0.m118087g(contactProfile.f42437s);
                                                if (TextUtils.isEmpty(m118087g2)) {
                                                    m12307a = C23212s8.m119607o(this.f62485c, AbstractC16781w.AvatarPlaceHolderColor);
                                                } else {
                                                    m12307a = C2343e.m12307a(contactProfile.f42434r, false);
                                                }
                                                this.f62475U[i27][i34] = C16640q2.m88404a().mo88412f(m118087g2, m12307a);
                                            } else {
                                                ((C23528a) this.f62481a.m123612r(dumpChatImageView2)).m123579C(str4, C23278z2.m120081L0(), new b(i27, i34));
                                            }
                                        }
                                        if (min <= 0) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    min = 0;
                    if (min > 0) {
                    }
                }
                int height3 = this.f62472R[i27].getHeight();
                StaticLayout staticLayout2 = this.f62473S[i27];
                if (staticLayout2 != null) {
                    i13 = staticLayout2.getHeight();
                } else {
                    i13 = 0;
                }
                int max2 = Math.max(height3, i13);
                this.f62457H[i27] = height;
                int[] iArr = this.f62459I;
                int i35 = f62431R0;
                iArr[i27] = height + i35 + max2 + i35;
                int i36 = this.f62455G;
                int i37 = this.f62453F;
                this.f62463K[i27] = ((int) ((aVar.f146902b / c31961i8.f146897r) * (i36 - i37))) + i37;
                if (c31961i8.f146890k && aVar.f146903c) {
                    int i38 = Integer.MIN_VALUE;
                    for (int i39 = 0; i39 < this.f62472R[i27].getLineCount(); i39++) {
                        i38 = Math.max(i38, (int) this.f62472R[i27].getLineWidth(i39));
                    }
                    this.f62465L[i27] = this.f62453F + f62433T0 + i38 + f62432S0;
                } else {
                    this.f62465L[i27] = 0;
                }
                height = f62430Q0 + this.f62459I[i27];
                if (AbstractC26683d.f126393l && z11 && m143353D2 != null) {
                    AbstractC28245z3.m142219b(m143353D2, this.f62483b);
                }
                i27++;
                i25 = 3;
            }
            int i41 = f62430Q0;
            int i42 = height + i41;
            if (this.f62469O > 0) {
                StaticLayout m119623j7 = AbstractC23214t.m119623j(String.format(this.f62483b.getResources().getString(AbstractC8020f0.str_poll_other_options), Integer.valueOf(this.f62469O)), this.f62502k0, this.f62503l - this.f62499j, 1, Layout.Alignment.ALIGN_NORMAL);
                this.f62480Z = m119623j7;
                this.f62467M = i42;
                i42 += m119623j7.getHeight() + f62431R0;
            }
            int i43 = i42 + i41;
            String upperCase = c31961i8.m153668f().toUpperCase();
            if (!c31961i8.m153671i() && !c31961i8.m153672j()) {
                this.f62500j0.setColor(C23212s8.m119607o(this.f62485c, AbstractC16781w.btn_type_2_text_n));
                StaticLayout m119623j8 = AbstractC23214t.m119623j(upperCase, this.f62500j0, this.f62503l - this.f62499j, 1, Layout.Alignment.ALIGN_CENTER);
                this.f62479Y = m119623j8;
                this.f62527x = i43;
                this.f62529y = this.f62499j;
                int height4 = i43 + m119623j8.getHeight() + (f62431R0 * 2);
                this.f62443A = height4;
                this.f62531z = this.f62503l;
                int i44 = height4 + f62429P0;
                this.f62451E = i44;
                this.f62493g = i44;
                int i45 = this.f62449D - f62439Z0;
                this.f62506m0 = i45;
                this.f62508n0 = i45 - f62437X0;
                int i46 = f62440a1;
                this.f62510o0 = i46;
                this.f62512p0 = i46 + f62438Y0;
            }
            this.f62500j0.setColor(C23212s8.m119607o(this.f62485c, AbstractC16781w.btn_type_3_text_n));
            StaticLayout m119623j82 = AbstractC23214t.m119623j(upperCase, this.f62500j0, this.f62503l - this.f62499j, 1, Layout.Alignment.ALIGN_CENTER);
            this.f62479Y = m119623j82;
            this.f62527x = i43;
            this.f62529y = this.f62499j;
            int height42 = i43 + m119623j82.getHeight() + (f62431R0 * 2);
            this.f62443A = height42;
            this.f62531z = this.f62503l;
            int i442 = height42 + f62429P0;
            this.f62451E = i442;
            this.f62493g = i442;
            int i452 = this.f62449D - f62439Z0;
            this.f62506m0 = i452;
            this.f62508n0 = i452 - f62437X0;
            int i462 = f62440a1;
            this.f62510o0 = i462;
            this.f62512p0 = i462 + f62438Y0;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: j */
    public void m66626j(int i11) {
        this.f62489e = i11;
    }

    /* renamed from: k */
    public void m66627k(int i11, int i12) {
        this.f62495h = i11;
        this.f62497i = i12;
    }

    /* renamed from: l */
    public void m66628l(boolean z11) {
        this.f62454F0 = z11;
    }

    /* renamed from: m */
    public void m66629m(boolean z11) {
        this.f62450D0 = z11;
    }
}
