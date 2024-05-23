package com.zing.zalo.p077ui.chat.chatrow;

import ag0.AbstractC0837p0;
import ag0.C0814e0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import au.C2365p;
import b40.C2535j;
import bi0.AbstractC2808b;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uicontrol.C16625n;
import com.zing.zalo.zdesign.component.C17024o0;
import dj.C17945a0;
import dj.C17958e1;
import dj.C17961f1;
import dj.C17985n1;
import dj.C18009w0;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.Objects;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.AbstractC23222t7;
import me0.AbstractC23244v8;
import me0.AbstractC23280z4;
import me0.C23164o4;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p056cj.C3541i;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p698yz.AbstractC31125u;
import p716zh.C32091r6;
import pm0.C24865v;
import ru.C25978a;
import vg.AbstractC28236y3;
import w50.C28769a;

/* renamed from: com.zing.zalo.ui.chat.chatrow.j2 */
/* loaded from: classes5.dex */
public class C11489j2 extends AbstractC11473f2 implements C17985n1.c {

    /* renamed from: A1 */
    private static Drawable f59176A1 = null;

    /* renamed from: B1 */
    private static Drawable f59177B1 = null;

    /* renamed from: C1 */
    private static Paint f59178C1 = null;

    /* renamed from: D1 */
    private static C13704p1 f59179D1 = null;

    /* renamed from: E1 */
    private static Paint f59180E1 = null;

    /* renamed from: F1 */
    private static C13704p1 f59181F1 = null;

    /* renamed from: G0 */
    private static final String f59182G0 = "j2";

    /* renamed from: H0 */
    private static final int f59183H0 = AbstractC23136l9.m118742r(33.0f);

    /* renamed from: I0 */
    public static boolean f59184I0 = false;

    /* renamed from: J0 */
    private static final int f59185J0 = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: K0 */
    private static final int f59186K0 = AbstractC23136l9.m118742r(1.0f);

    /* renamed from: L0 */
    private static final int f59187L0 = AbstractC23136l9.m118742r(2.0f);

    /* renamed from: M0 */
    private static final int f59188M0 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: N0 */
    private static final float f59189N0 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: O0 */
    private static final float f59190O0 = AbstractC23136l9.m118742r(13.0f);

    /* renamed from: P0 */
    private static final float f59191P0 = AbstractC23136l9.m118742r(22.0f);

    /* renamed from: Q0 */
    private static final float f59192Q0;

    /* renamed from: R0 */
    private static final float f59193R0;

    /* renamed from: S0 */
    private static final float[] f59194S0;

    /* renamed from: T0 */
    private static final float[] f59195T0;

    /* renamed from: U0 */
    private static final float[] f59196U0;

    /* renamed from: V0 */
    private static final float[] f59197V0;

    /* renamed from: W0 */
    private static final float[] f59198W0;

    /* renamed from: X0 */
    private static final float[] f59199X0;

    /* renamed from: Y0 */
    private static final float[] f59200Y0;

    /* renamed from: Z0 */
    private static final float[] f59201Z0;

    /* renamed from: a1 */
    private static final float[] f59202a1;

    /* renamed from: b1 */
    private static final float[] f59203b1;

    /* renamed from: c1 */
    private static final int f59204c1;

    /* renamed from: d1 */
    private static final int f59205d1;

    /* renamed from: e1 */
    private static C13704p1 f59206e1;

    /* renamed from: f1 */
    private static b f59207f1;

    /* renamed from: g1 */
    private static b f59208g1;

    /* renamed from: h1 */
    private static C13704p1 f59209h1;

    /* renamed from: i1 */
    private static Paint f59210i1;

    /* renamed from: j1 */
    private static Paint f59211j1;

    /* renamed from: k1 */
    private static int f59212k1;

    /* renamed from: l1 */
    private static int f59213l1;

    /* renamed from: m1 */
    private static String f59214m1;

    /* renamed from: n1 */
    private static final int f59215n1;

    /* renamed from: o1 */
    private static int f59216o1;

    /* renamed from: p1 */
    private static Drawable f59217p1;

    /* renamed from: q1 */
    private static final int f59218q1;

    /* renamed from: r1 */
    private static Paint f59219r1;

    /* renamed from: s1 */
    private static C13704p1 f59220s1;

    /* renamed from: t1 */
    private static String f59221t1;

    /* renamed from: u1 */
    private static int f59222u1;

    /* renamed from: v1 */
    private static int f59223v1;

    /* renamed from: w1 */
    private static Paint f59224w1;

    /* renamed from: x1 */
    private static String f59225x1;

    /* renamed from: y1 */
    private static int f59226y1;

    /* renamed from: z1 */
    private static int f59227z1;

    /* renamed from: A0 */
    private Path f59228A0;

    /* renamed from: B0 */
    private float[] f59229B0;

    /* renamed from: C */
    private MediaItem f59230C;

    /* renamed from: C0 */
    C16625n f59231C0;

    /* renamed from: D */
    private final C13697o f59232D;

    /* renamed from: D0 */
    C17985n1 f59233D0;

    /* renamed from: E */
    private final C23528a f59234E;

    /* renamed from: E0 */
    Paint f59235E0;

    /* renamed from: F */
    private boolean f59236F;

    /* renamed from: G */
    private boolean f59238G;

    /* renamed from: H */
    private boolean f59239H;

    /* renamed from: I */
    private boolean f59240I;

    /* renamed from: J */
    private C3541i f59241J;

    /* renamed from: K */
    private int f59242K;

    /* renamed from: L */
    private int f59243L;

    /* renamed from: M */
    private boolean f59244M;

    /* renamed from: N */
    private b f59245N;

    /* renamed from: O */
    private int f59246O;

    /* renamed from: P */
    private int f59247P;

    /* renamed from: Q */
    private int f59248Q;

    /* renamed from: R */
    private int f59249R;

    /* renamed from: S */
    private boolean f59250S;

    /* renamed from: Y */
    private int f59256Y;

    /* renamed from: Z */
    private int f59257Z;

    /* renamed from: a0 */
    private int f59258a0;

    /* renamed from: b0 */
    private int f59259b0;

    /* renamed from: e0 */
    private final C11479h0 f59262e0;

    /* renamed from: f0 */
    private int f59263f0;

    /* renamed from: g0 */
    private int f59264g0;

    /* renamed from: k0 */
    private int f59268k0;

    /* renamed from: l0 */
    private int f59269l0;

    /* renamed from: r0 */
    private int f59275r0;

    /* renamed from: s0 */
    private int f59276s0;

    /* renamed from: u0 */
    private boolean f59278u0;

    /* renamed from: v0 */
    private StaticLayout f59279v0;

    /* renamed from: x0 */
    private LinearGradient f59281x0;

    /* renamed from: y0 */
    private final Paint f59282y0;

    /* renamed from: z0 */
    private boolean f59283z0;

    /* renamed from: T */
    private Layout f59251T = null;

    /* renamed from: U */
    private final Path f59252U = new Path();

    /* renamed from: V */
    private final RectF f59253V = new RectF();

    /* renamed from: W */
    private final RectF f59254W = new RectF();

    /* renamed from: X */
    private final Path f59255X = new Path();

    /* renamed from: c0 */
    private String f59260c0 = "";

    /* renamed from: d0 */
    private boolean f59261d0 = true;

    /* renamed from: h0 */
    private final Path f59265h0 = new Path();

    /* renamed from: i0 */
    private final RectF f59266i0 = new RectF();

    /* renamed from: j0 */
    private final RectF f59267j0 = new RectF();

    /* renamed from: m0 */
    private final RectF f59270m0 = new RectF();

    /* renamed from: n0 */
    private final Path f59271n0 = new Path();

    /* renamed from: o0 */
    private final RectF f59272o0 = new RectF();

    /* renamed from: p0 */
    private final Path f59273p0 = new Path();

    /* renamed from: q0 */
    private String f59274q0 = "";

    /* renamed from: t0 */
    private final C3977j f59277t0 = new C3977j(MainApplication.getAppContext());

    /* renamed from: w0 */
    private int f59280w0 = 0;

    /* renamed from: F0 */
    private boolean f59237F0 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.j2$a */
    /* loaded from: classes5.dex */
    public class a extends C23999j {
        a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (!str.equals(C11489j2.this.f59260c0)) {
                    return;
                }
                boolean z11 = false;
                C11489j2.this.f59277t0.setImageInfo(c3979l, false);
                if (c3979l != null) {
                    Bitmap m18839c = c3979l.m18839c();
                    if (m18839c != null && m18839c.getWidth() > 0 && m18839c.getHeight() > 0) {
                        C11489j2.this.f59238G = true;
                        if (C11489j2.this.m61980W()) {
                            C11489j2.this.f59239H = true;
                            C13697o c13697o = C11489j2.this.f59232D;
                            if (c23995f.m125666q() != 4) {
                                z11 = true;
                            }
                            c13697o.m76480u(m18839c, z11);
                            C11489j2.this.f59120p.invalidate();
                        }
                    }
                } else {
                    C17945a0 c17945a0 = C11489j2.this.f59122r;
                    if (c17945a0 != null && !c17945a0.m94913I3()) {
                        C11489j2.this.f59122r.m94909Ha(true);
                        String m61954L = C11489j2.this.m61954L();
                        if (!TextUtils.equals(C11489j2.this.f59260c0, m61954L)) {
                            C11489j2.this.f59260c0 = m61954L;
                            C11489j2.this.m61981a0();
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C11489j2.f59182G0, e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.j2$b */
    /* loaded from: classes5.dex */
    private static class b {

        /* renamed from: a */
        private Drawable f59285a;

        /* renamed from: b */
        private int f59286b;

        /* renamed from: c */
        private int f59287c;

        /* renamed from: d */
        private String f59288d;

        public b(Drawable drawable, String str) {
            this.f59285a = drawable;
            if (drawable != null) {
                this.f59286b = (drawable.getIntrinsicWidth() * 3) / 4;
                this.f59287c = (drawable.getIntrinsicHeight() * 3) / 4;
            } else {
                this.f59286b = 0;
                this.f59287c = 0;
            }
            this.f59288d = str;
        }
    }

    static {
        float m118742r = AbstractC23136l9.m118742r(10.0f);
        f59192Q0 = m118742r;
        float m118742r2 = AbstractC23136l9.m118742r(0.0f);
        f59193R0 = m118742r2;
        f59194S0 = new float[]{m118742r2, m118742r2, m118742r2, m118742r2, m118742r2, m118742r2, m118742r2, m118742r2};
        f59195T0 = new float[]{m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r};
        f59196U0 = new float[]{m118742r, m118742r, m118742r2, m118742r2, m118742r2, m118742r2, m118742r, m118742r};
        f59197V0 = new float[]{m118742r2, m118742r2, m118742r, m118742r, m118742r, m118742r, m118742r2, m118742r2};
        f59198W0 = new float[]{m118742r, m118742r, m118742r, m118742r, m118742r2, m118742r2, m118742r2, m118742r2};
        f59199X0 = new float[]{m118742r2, m118742r2, m118742r2, m118742r2, m118742r, m118742r, m118742r, m118742r};
        f59200Y0 = new float[]{m118742r, m118742r, m118742r2, m118742r2, m118742r2, m118742r2, m118742r2, m118742r2};
        f59201Z0 = new float[]{m118742r2, m118742r2, m118742r, m118742r, m118742r2, m118742r2, m118742r2, m118742r2};
        f59202a1 = new float[]{m118742r2, m118742r2, m118742r2, m118742r2, m118742r, m118742r, m118742r2, m118742r2};
        f59203b1 = new float[]{m118742r2, m118742r2, m118742r2, m118742r2, m118742r2, m118742r2, m118742r, m118742r};
        f59204c1 = AbstractC23136l9.m118742r(6.0f);
        f59205d1 = AbstractC23136l9.m118742r(8.0f);
        f59215n1 = AbstractC23136l9.m118742r(24.0f);
        f59216o1 = 0;
        f59218q1 = AbstractC23136l9.m118742r(12.0f);
    }

    public C11489j2(View view) {
        this.f59120p = view;
        Context context = view.getContext();
        this.f59234E = new C23528a(context);
        if (f59224w1 == null || f59184I0) {
            Paint paint = new Paint(1);
            f59224w1 = paint;
            paint.setColor(-1999054632);
            Paint paint2 = f59224w1;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = f59224w1;
            int i11 = f59185J0;
            paint3.setStrokeWidth(i11);
            C13704p1 c13704p1 = new C13704p1(1);
            f59206e1 = c13704p1;
            c13704p1.setColor(-9013642);
            f59206e1.m76614d(f59188M0, false);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_error);
            f59214m1 = m118743r0;
            f59212k1 = AbstractC23136l9.m118764y0(f59206e1, m118743r0);
            f59213l1 = AbstractC23136l9.m118761x0(f59206e1, f59214m1);
            C13704p1 c13704p12 = new C13704p1(1);
            f59220s1 = c13704p12;
            c13704p12.setColor(AbstractC11531v0.m62143G3());
            f59220s1.m76613c();
            f59220s1.m76614d(f59189N0, false);
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.recalled_group_msg);
            f59221t1 = m118743r02;
            f59222u1 = AbstractC23136l9.m118764y0(f59220s1, m118743r02);
            f59223v1 = AbstractC23136l9.m118761x0(f59220s1, f59221t1);
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_deleted);
            f59225x1 = m118743r03;
            f59226y1 = AbstractC23136l9.m118764y0(f59220s1, m118743r03);
            f59227z1 = AbstractC23136l9.m118761x0(f59220s1, f59225x1);
            Paint paint4 = new Paint(1);
            f59219r1 = paint4;
            Paint.Style style2 = Paint.Style.FILL;
            paint4.setStyle(style2);
            f59219r1.setColor(C23212s8.m119607o(context, AbstractC16781w.ChatMultiPhotoItemRecallBackgroundColor));
            C13704p1 c13704p13 = new C13704p1(1);
            f59209h1 = c13704p13;
            c13704p13.setColor(AbstractC11531v0.m62143G3());
            f59209h1.m76613c();
            f59209h1.m76614d(f59190O0, false);
            Paint paint5 = new Paint(1);
            f59210i1 = paint5;
            paint5.setStyle(style2);
            f59210i1.setColor(C23212s8.m119607o(context, AbstractC16781w.ChatMultiPhotoItemRecallBackgroundColor));
            Paint paint6 = new Paint(1);
            f59211j1 = paint6;
            paint6.setColor(-1999054632);
            f59211j1.setStyle(style);
            f59211j1.setStrokeWidth(i11);
            Paint paint7 = new Paint(1);
            f59178C1 = paint7;
            paint7.setStyle(style);
            f59178C1.setStrokeWidth(f59186K0);
            C13704p1 c13704p14 = new C13704p1(1);
            f59179D1 = c13704p14;
            c13704p14.setColor(-1);
            f59179D1.m76613c();
            f59179D1.m76614d(f59191P0, false);
            Paint paint8 = new Paint(1);
            f59180E1 = paint8;
            paint8.setStyle(style2);
            f59180E1.setColor(-1728053248);
            f59216o1 = C23212s8.m119607o(context, AbstractC16781w.SenderBubbleChatNormal);
            f59217p1 = AbstractC11531v0.m62281k3();
            f59177B1 = AbstractC11531v0.m62290m2();
            f59176A1 = AbstractC11531v0.m62245d2();
            f59207f1 = new b(AbstractC11531v0.m62113A3(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_rolled_photo));
            f59208g1 = new b(AbstractC11531v0.m62118B3(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_rolled_video));
            C13704p1 c13704p15 = new C13704p1(1);
            f59181F1 = c13704p15;
            c13704p15.m76613c();
            f59181F1.setTextSize(AbstractC23136l9.m118742r(12.0f));
            f59181F1.setColor(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
            f59184I0 = false;
        }
        Paint paint9 = new Paint(1);
        this.f59235E0 = paint9;
        paint9.setColor(AbstractC23136l9.m118639A(AbstractC2808b.blk_a55));
        Paint paint10 = new Paint(1);
        this.f59282y0 = paint10;
        paint10.setStyle(Paint.Style.FILL);
        C13697o c13697o = new C13697o(view);
        this.f59232D = c13697o;
        c13697o.m76461I(f59195T0);
        c13697o.m76484y(f59185J0);
        c13697o.m76482w(-1999054632);
        int i12 = f59216o1;
        if (i12 != 0) {
            c13697o.m76453A(i12);
        }
        c13697o.m76455C(new C13697o.a() { // from class: com.zing.zalo.ui.chat.chatrow.h2
            @Override // com.zing.zalo.p077ui.widget.C13697o.a
            /* renamed from: a */
            public final void mo61944a(float f11) {
                C11489j2.this.m61962Z(f11);
            }
        });
        this.f59262e0 = new C11479h0(context);
    }

    /* renamed from: J */
    private void m61953J(Canvas canvas) {
        canvas.drawCircle(this.f59130z.x + (mo61923q() / 2.0f), this.f59130z.y + (mo61918k() / 2.0f), ChatRow.f57224Y5 / 2.0f, this.f59235E0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public String m61954L() {
        C17945a0 c17945a0 = this.f59122r;
        if (c17945a0 != null) {
            return c17945a0.m95266u2();
        }
        MediaItem mediaItem = this.f59230C;
        if (mediaItem != null) {
            return AbstractC23280z4.m120292D(mediaItem);
        }
        return "";
    }

    /* renamed from: M */
    private String m61955M() {
        C17945a0 c17945a0 = this.f59122r;
        if (c17945a0 != null && !c17945a0.m95219o8() && !this.f59122r.m95091b6() && this.f59122r.m94929K2() != null) {
            return this.f59122r.m94929K2().f91011p;
        }
        return "";
    }

    /* renamed from: O */
    public static int m61956O() {
        return (1000 - (ChatRowMultiPhotos.f58221p7 * 2)) / 3;
    }

    /* renamed from: R */
    private boolean m61957R() {
        return !TextUtils.isEmpty(m61955M());
    }

    /* renamed from: S */
    private void m61958S() {
        this.f59231C0 = new C16625n(this.f59120p.getContext(), new C17024o0.a() { // from class: com.zing.zalo.ui.chat.chatrow.i2
            @Override // com.zing.zalo.zdesign.component.C17024o0.a
            /* renamed from: a */
            public final void mo61929a() {
                C11489j2.this.m61960X();
            }
        });
    }

    /* renamed from: U */
    private boolean m61959U() {
        C17985n1 c17985n1 = this.f59233D0;
        if (c17985n1 != null && c17985n1.m95643m()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m61960X() {
        if (AbstractC19444a.m101693a()) {
            this.f59120p.invalidate();
        } else {
            this.f59120p.postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m61961Y(String str) {
        byte[] m119741e;
        try {
            C3541i c3541i = this.f59241J;
            if (c3541i != null && c3541i.m18002c() && (m119741e = AbstractC23244v8.m119741e(this.f59241J.m18001b())) != null && m119741e.length != 0) {
                Bitmap m119330f = C23164o4.m119328j().m119330f(m119741e);
                Bitmap m12381f = C2365p.m12377i(C25978a.m133807a()).m12382h(200.0f).m12381f(m119330f);
                m119330f.recycle();
                AbstractC23306f.m120703q().m15821f(str, m12381f);
                if (!this.f59121q.hasMessages(10003, str)) {
                    Handler handler = this.f59121q;
                    handler.sendMessage(handler.obtainMessage(10003, str));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f59182G0, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m61962Z(float f11) {
        InterfaceC11530v interfaceC11530v;
        C17945a0 c17945a0 = this.f59122r;
        if (c17945a0 != null && (interfaceC11530v = this.f59119A) != null) {
            C28769a mo62079c4 = interfaceC11530v.mo62079c4(c17945a0.m95029V3());
            if (f11 == 0.0f) {
                mo62079c4.f133324t = 0;
            }
        }
    }

    /* renamed from: b0 */
    private void m61963b0() {
        if (this.f59240I) {
            return;
        }
        final String m41044h = this.f59122r.m95029V3().m41044h();
        Bitmap m15819d = AbstractC23306f.m120703q().m15819d(m41044h);
        if (m15819d != null && !m15819d.isRecycled()) {
            this.f59232D.m76480u(m15819d, false);
            this.f59240I = true;
            this.f59120p.invalidate();
        } else {
            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.g2
                @Override // java.lang.Runnable
                public final void run() {
                    C11489j2.this.m61961Y(m41044h);
                }
            });
            this.f59240I = true;
        }
    }

    /* renamed from: e0 */
    private void m61964e0(boolean z11) {
        boolean z12;
        C17945a0 c17945a0;
        if (z11 && (c17945a0 = this.f59122r) != null && !c17945a0.m95139g1()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f59244M = z12;
        C17945a0 c17945a02 = this.f59122r;
        if (c17945a02 == null || !c17945a02.m95032V6() || this.f59122r.m95180k8()) {
            this.f59232D.m76454B(1.0f);
            this.f59232D.m76456D(AbstractC11531v0.m62261g3());
        }
    }

    /* renamed from: f0 */
    private void m61965f0(boolean z11) {
        this.f59250S = z11;
        C2535j.f10308a.m12775s("csc", this.f59122r, z11);
    }

    /* renamed from: i0 */
    private void m61966i0() {
        try {
            int m95107d3 = this.f59122r.m95107d3();
            if (m95107d3 != 2) {
                if (m95107d3 != 3) {
                    if (m95107d3 != 5) {
                        if (m95107d3 != 6 && m95107d3 != 7) {
                            if (m95107d3 != 8) {
                            }
                        } else {
                            if (!this.f59122r.m95022U7()) {
                                if (!this.f59127w.m143920m()) {
                                }
                            }
                            m61965f0(true);
                        }
                    } else if (!this.f59127w.m143918k() && !this.f59127w.m143920m()) {
                        m61964e0(true);
                    }
                }
                m61964e0(true);
            } else if (!this.f59127w.m143919l()) {
                m61964e0(true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f59182G0, e11);
        }
    }

    /* renamed from: j0 */
    private void m61967j0() {
        try {
            if (this.f59122r.m95022U7()) {
                m61965f0(true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f59182G0, e11);
        }
    }

    /* renamed from: l0 */
    private void m61968l0() {
        try {
            if (this.f59122r.m95022U7()) {
                m61965f0(true);
                return;
            }
            if (this.f59237F0) {
                m61964e0(true);
                return;
            }
            if (!this.f59122r.m95180k8()) {
                C28769a mo62079c4 = this.f59119A.mo62079c4(this.f59122r.m95029V3());
                int m95089b4 = this.f59122r.m95089b4();
                if (m95089b4 != 0) {
                    if (m95089b4 != 1) {
                        if ((m95089b4 == 2 || m95089b4 == 3 || m95089b4 == 4) && mo62079c4.f133324t == 1) {
                            mo62079c4.f133324t = 2;
                        }
                    } else {
                        mo62079c4.f133324t = 0;
                    }
                } else {
                    mo62079c4.f133324t = 1;
                }
                if (mo62079c4.f133324t == 2) {
                    this.f59232D.m76475o(1.0f);
                    return;
                }
                return;
            }
            int m95107d3 = this.f59122r.m95107d3();
            if (m95107d3 != 6) {
                if (m95107d3 == 8) {
                    m61964e0(true);
                }
            } else if (!this.f59127w.m143920m()) {
                m61965f0(true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f59182G0, e11);
        }
    }

    /* renamed from: m0 */
    private void m61969m0() {
        try {
            if (this.f59122r.m95022U7()) {
                m61965f0(true);
                return;
            }
            if (!this.f59122r.m95180k8()) {
                int m95089b4 = this.f59122r.m95089b4();
                if (m95089b4 != 0) {
                    if (m95089b4 != 1) {
                        if ((m95089b4 == 2 || m95089b4 == 3 || m95089b4 == 4) && this.f59119A.mo62079c4(this.f59122r.m95029V3()).f133324t == 1) {
                            this.f59119A.mo62079c4(this.f59122r.m95029V3()).f133324t = 2;
                        }
                    } else {
                        this.f59119A.mo62079c4(this.f59122r.m95029V3()).f133324t = 0;
                        this.f59261d0 = false;
                    }
                } else {
                    this.f59119A.mo62079c4(this.f59122r.m95029V3()).f133324t = 1;
                }
                if (this.f59119A.mo62079c4(this.f59122r.m95029V3()).f133324t == 2) {
                    this.f59232D.m76475o(1.0f);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f59182G0, e11);
        }
    }

    /* renamed from: I */
    void m61973I(Canvas canvas) {
        if (!m61959U()) {
            return;
        }
        C17985n1 c17985n1 = this.f59233D0;
        if (c17985n1 != null) {
            c17985n1.m95634a();
        }
        if (this.f59231C0 != null && m61959U()) {
            C24865v m95636c = this.f59233D0.m95636c();
            this.f59231C0.m88401e(((Integer) m95636c.m129232d()).intValue());
            this.f59231C0.m88399c(((Integer) m95636c.m129233e()).intValue());
            if (((Boolean) m95636c.m129234f()).booleanValue()) {
                this.f59120p.invalidate();
            }
            m61974K(canvas);
        }
    }

    /* renamed from: K */
    public void m61974K(Canvas canvas) {
        C16625n c16625n = this.f59231C0;
        if (c16625n != null) {
            c16625n.m88397a(canvas);
        }
    }

    /* renamed from: N */
    public Rect m61975N() {
        if (this.f59232D != null && this.f59122r != null) {
            Rect rect = new Rect();
            int[] iArr = new int[2];
            this.f59120p.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            Point point = this.f59130z;
            int i12 = i11 + point.x;
            rect.left = i12;
            rect.top = iArr[1] + point.y;
            rect.right = i12 + mo61923q();
            rect.bottom = rect.top + mo61918k();
            return rect;
        }
        return null;
    }

    /* renamed from: P */
    Drawable m61976P() {
        if (this.f59236F) {
            return AbstractC11531v0.m62157J2();
        }
        return AbstractC11531v0.m62167L2();
    }

    /* renamed from: Q */
    public C3979l m61977Q() {
        C24003n m120066E;
        if (!TextUtils.isEmpty(this.f59260c0)) {
            if (this.f59278u0 && Math.max(mo61918k(), mo61923q()) >= 300) {
                m120066E = C23278z2.m120068F();
            } else {
                m120066E = C23278z2.m120066E();
            }
            return this.f59234E.m123606l(this.f59260c0, m120066E.f116260a, m120066E.f116263d, m120066E.f116266g);
        }
        return null;
    }

    /* renamed from: T */
    boolean m61978T() {
        C17945a0 c17945a0 = this.f59122r;
        if (c17945a0 == null) {
            return false;
        }
        C28769a mo62079c4 = this.f59119A.mo62079c4(c17945a0.m95029V3());
        if (!mo62079c4.f133314j && !mo62079c4.f133313i) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    public boolean m61979V() {
        return this.f59244M;
    }

    /* renamed from: W */
    public boolean m61980W() {
        if (m61959U() && this.f59233D0.m95642l() && !this.f59233D0.m95644n()) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public void m61981a0() {
        C24003n m120066E;
        if (!TextUtils.isEmpty(this.f59260c0) && !this.f59237F0) {
            int[] m154834e = C32091r6.m154834e(this.f59122r.m94929K2());
            if (this.f59278u0 && Math.max(m154834e[0], m154834e[1]) >= 300) {
                m120066E = C23278z2.m120068F();
            } else {
                m120066E = C23278z2.m120066E();
            }
            InterfaceC11530v interfaceC11530v = this.f59119A;
            if (interfaceC11530v == null || interfaceC11530v.mo62069W3() || C23999j.m125696L2(this.f59260c0, m120066E)) {
                a aVar = new a();
                aVar.m125611h1(26000, 0);
                ((C23528a) this.f59234E.m123612r(this.f59277t0)).m123579C(this.f59260c0, m120066E, aVar);
                return;
            }
            return;
        }
        C3541i c3541i = this.f59241J;
        if (c3541i != null && c3541i.m18002c()) {
            m61963b0();
        }
    }

    @Override // dj.C17985n1.c
    /* renamed from: c */
    public void mo61045c() {
        if (m61985h0()) {
            m61981a0();
        }
    }

    /* renamed from: c0 */
    public void m61982c0() {
        if (m61985h0()) {
            m61981a0();
        }
    }

    /* renamed from: d0 */
    public void m61983d0(C17945a0 c17945a0, boolean z11, int i11, int i12) {
        boolean z12;
        boolean z13;
        boolean z14;
        C24003n m120066E;
        boolean z15 = true;
        boolean z16 = !Objects.equals(this.f59122r, c17945a0);
        this.f59236F = true;
        this.f59230C = null;
        this.f59122r = c17945a0;
        this.f59123s = i12;
        this.f59124t = c17945a0.m95089b4();
        this.f59125u = this.f59122r.m95107d3();
        this.f59126v = this.f59122r.m95041W4();
        boolean z17 = false;
        this.f59238G = false;
        this.f59239H = false;
        this.f59240I = false;
        C16625n c16625n = this.f59231C0;
        if (c16625n != null) {
            c16625n.m88398b();
        }
        boolean z18 = this.f59237F0;
        this.f59237F0 = this.f59122r.m94959N6();
        m61965f0(false);
        this.f59261d0 = true;
        this.f59262e0.m61939j();
        C17945a0 c17945a02 = this.f59122r;
        this.f59233D0 = c17945a02.m94894G2(c17945a02.m95306y8());
        if (m61959U()) {
            m61958S();
            this.f59233D0.m95651u(this);
        } else {
            this.f59233D0.m95651u(null);
        }
        this.f59127w.m143917j(this.f59122r.m94930K3());
        String m61954L = m61954L();
        if (!TextUtils.isEmpty(this.f59260c0) && this.f59260c0.equals(m61954L)) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z16 && z12) {
            String str = this.f59260c0;
            if (z11) {
                m120066E = C23278z2.m120068F();
            } else {
                m120066E = C23278z2.m120066E();
            }
            C23999j.m125719b2(str, m61954L, m120066E);
        }
        this.f59260c0 = m61954L;
        if (this.f59122r.m94888F5()) {
            this.f59232D.m76458F(true, false);
            this.f59241J = this.f59122r.m95002S3();
        } else {
            this.f59232D.m76458F(false, false);
            this.f59241J = null;
        }
        this.f59274q0 = "";
        this.f59128x = false;
        m61964e0(false);
        this.f59278u0 = z11;
        this.f59129y = false;
        this.f59232D.m76454B(0.0f);
        this.f59283z0 = false;
        if (z16) {
            this.f59279v0 = null;
            this.f59283z0 = true;
            this.f59232D.m76476p();
        } else if (z18 != this.f59237F0) {
            this.f59232D.m76476p();
        }
        float[] fArr = this.f59229B0;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 6) {
                            if (i11 != 12) {
                                if (i11 != 15) {
                                    if (i11 != 8) {
                                        if (i11 != 9) {
                                            C13697o c13697o = this.f59232D;
                                            float[] fArr2 = f59194S0;
                                            c13697o.m76461I(fArr2);
                                            this.f59229B0 = fArr2;
                                        } else {
                                            this.f59232D.m76461I(f59196U0);
                                            this.f59229B0 = f59203b1;
                                        }
                                    } else {
                                        C13697o c13697o2 = this.f59232D;
                                        float[] fArr3 = f59203b1;
                                        c13697o2.m76461I(fArr3);
                                        this.f59229B0 = fArr3;
                                    }
                                } else {
                                    this.f59232D.m76461I(f59195T0);
                                    this.f59229B0 = f59199X0;
                                }
                            } else {
                                C13697o c13697o3 = this.f59232D;
                                float[] fArr4 = f59199X0;
                                c13697o3.m76461I(fArr4);
                                this.f59229B0 = fArr4;
                            }
                        } else {
                            this.f59232D.m76461I(f59197V0);
                            this.f59229B0 = f59202a1;
                        }
                    } else {
                        C13697o c13697o4 = this.f59232D;
                        float[] fArr5 = f59202a1;
                        c13697o4.m76461I(fArr5);
                        this.f59229B0 = fArr5;
                    }
                } else {
                    this.f59232D.m76461I(f59198W0);
                    this.f59229B0 = f59194S0;
                }
            } else {
                this.f59232D.m76461I(f59201Z0);
                this.f59229B0 = f59194S0;
            }
        } else {
            this.f59232D.m76461I(f59200Y0);
            this.f59229B0 = f59194S0;
        }
        boolean z19 = this.f59283z0;
        if (fArr != this.f59229B0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f59283z0 = z13 | z19;
        if (this.f59122r.m95306y8()) {
            this.f59236F = false;
            if (this.f59122r.m94929K2() instanceof C17961f1) {
                this.f59262e0.m61940k(((C17961f1) this.f59122r.m94929K2()).m95508w());
            }
            z17 = this.f59122r.m94870D6();
            z14 = this.f59122r.m95288w8();
        } else {
            if (this.f59122r.m94871D7()) {
                this.f59236F = true;
                if (this.f59122r.m94929K2() instanceof C18009w0) {
                    if (this.f59122r.m95041W4() == 3) {
                        z17 = !TextUtils.isEmpty(this.f59122r.m94929K2().mo95598f());
                    } else {
                        if (this.f59122r.m95041W4() != 4) {
                            z15 = false;
                        }
                        z17 = z15;
                    }
                }
            } else if (this.f59122r.m95219o8() || this.f59122r.m95091b6()) {
                this.f59129y = this.f59122r.m95091b6();
                if (this.f59122r.m94929K2() instanceof C17958e1) {
                    if (((C17958e1) this.f59122r.m94929K2()).m95425n() == 19) {
                        z15 = false;
                    }
                    this.f59236F = z15;
                }
            }
            z14 = false;
        }
        this.f59232D.m76483x(this.f59122r.m94879E5());
        this.f59262e0.m61942m(z17);
        this.f59262e0.m61941l(z14);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: e */
    protected int mo61913e() {
        InterfaceC11530v interfaceC11530v = this.f59119A;
        if (interfaceC11530v == null || interfaceC11530v.mo62075b()) {
            return 0;
        }
        if (this.f59122r.m95032V6()) {
            if (!this.f59122r.m95180k8()) {
                int m95089b4 = this.f59122r.m95089b4();
                if (m95089b4 != 2 && m95089b4 != 3 && m95089b4 != 4) {
                    return 0;
                }
            } else {
                int m95107d3 = this.f59122r.m95107d3();
                if (m95107d3 != 5 && ((m95107d3 != 6 && m95107d3 != 7) || this.f59122r.m95022U7())) {
                    return 0;
                }
            }
        } else {
            int m95107d32 = this.f59122r.m95107d3();
            if (m95107d32 != 2) {
                if (m95107d32 != 5 && ((m95107d32 != 6 && m95107d32 != 7) || this.f59122r.m95022U7())) {
                    return 0;
                }
            } else {
                if (this.f59122r.m95306y8()) {
                    return 0;
                }
                return 2;
            }
        }
        return 9;
    }

    @Override // dj.C17985n1.c
    /* renamed from: g */
    public void mo61060g() {
        if (AbstractC19444a.m101693a()) {
            this.f59120p.invalidate();
        } else {
            this.f59120p.postInvalidate();
        }
    }

    /* renamed from: g0 */
    public void m61984g0(C17945a0 c17945a0, int i11, float f11) {
        int i12;
        int i13;
        boolean z11 = true;
        if ((c17945a0.m95219o8() || c17945a0.m95091b6()) && this.f59123s == 3) {
            float f12 = f11 * 1000.0f;
            this.f59232D.m76463K(5, (int) f12, (int) ((f12 * 3.0f) / 4.0f));
            i12 = -1;
        } else {
            if (this.f59278u0) {
                int[] m154834e = C32091r6.m154834e(c17945a0.m94929K2());
                int i14 = m154834e[0];
                if (i14 > 0 && (i13 = m154834e[1]) > 0) {
                    this.f59232D.m76463K(5, (int) (i14 * f11), (int) (i13 * f11));
                } else {
                    AbstractC20110a.m104539h(new IllegalStateException("ChatRowMultiPhotos: Not pre-process item size yet"));
                    this.f59232D.m76462J(6, (int) (m61956O() * f11));
                }
            } else {
                this.f59232D.m76462J(6, (int) (m61956O() * f11));
            }
            i12 = this.f59232D.m76473l();
        }
        boolean z12 = this.f59283z0;
        if (this.f59280w0 == i12) {
            z11 = false;
        }
        this.f59283z0 = z12 | z11;
        this.f59280w0 = i12;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: h */
    protected void mo61915h(Canvas canvas) {
        MediaItem mediaItem;
        boolean z11;
        MediaItem mediaItem2;
        Drawable m62230a2;
        if (m61978T()) {
            f59178C1.setColor(AbstractC11531v0.m62218X2());
            f59178C1.setStrokeWidth(f59187L0);
            canvas.drawPath(this.f59273p0, f59178C1);
        }
        if (!TextUtils.isEmpty(this.f59274q0)) {
            canvas.drawPath(this.f59273p0, f59180E1);
            canvas.drawText(this.f59274q0, this.f59275r0, this.f59276s0, f59179D1);
        }
        this.f59232D.m76467d(canvas);
        if (this.f59279v0 != null) {
            canvas.drawPath(this.f59228A0, this.f59282y0);
            canvas.save();
            canvas.translate(this.f59130z.x + ((mo61923q() - this.f59279v0.getWidth()) / 2.0f), ((this.f59130z.y + mo61918k()) - this.f59279v0.getHeight()) - f59205d1);
            this.f59279v0.draw(canvas);
            canvas.restore();
        }
        m61973I(canvas);
        C11479h0 c11479h0 = this.f59262e0;
        Point point = this.f59130z;
        c11479h0.m61938b(canvas, point.x, point.y);
        if (this.f59244M) {
            if (this.f59122r.m95032V6() && !this.f59122r.m95180k8()) {
                m62230a2 = f59177B1;
                m61953J(canvas);
            } else {
                m62230a2 = AbstractC11531v0.m62230a2();
            }
            int i11 = this.f59242K;
            int i12 = this.f59243L;
            int i13 = f59215n1;
            m62230a2.setBounds(i11, i12, i11 + i13, i13 + i12);
            m62230a2.draw(canvas);
            f59178C1.setColor(AbstractC11531v0.m62218X2());
            f59178C1.setStrokeWidth(f59186K0);
            canvas.drawPath(this.f59273p0, f59178C1);
        } else if (this.f59128x) {
            Drawable drawable = f59176A1;
            int i14 = this.f59256Y;
            drawable.setBounds(i14, this.f59257Z, drawable.getIntrinsicWidth() + i14, this.f59257Z + f59176A1.getIntrinsicHeight());
            f59176A1.draw(canvas);
            canvas.drawText(f59214m1, this.f59258a0, this.f59259b0, f59206e1);
            f59178C1.setColor(-65536);
            f59178C1.setStrokeWidth(f59186K0);
            canvas.drawPath(this.f59273p0, f59178C1);
        } else if (this.f59250S) {
            canvas.drawPath(this.f59252U, f59210i1);
            b bVar = this.f59245N;
            if (bVar != null) {
                Drawable drawable2 = bVar.f59285a;
                int i15 = this.f59246O;
                drawable2.setBounds(i15, this.f59247P, this.f59245N.f59286b + i15, this.f59247P + this.f59245N.f59287c);
                this.f59245N.f59285a.draw(canvas);
                if (this.f59251T != null) {
                    canvas.save();
                    canvas.translate(this.f59248Q, this.f59249R);
                    this.f59251T.draw(canvas);
                    canvas.restore();
                }
            }
            canvas.drawPath(this.f59255X, f59211j1);
        } else {
            C17945a0 c17945a0 = this.f59122r;
            boolean z12 = false;
            if ((c17945a0 != null && c17945a0.m95306y8()) || ((mediaItem = this.f59230C) != null && (mediaItem instanceof VideoItem))) {
                z11 = true;
            } else {
                z11 = false;
            }
            C17945a0 c17945a02 = this.f59122r;
            if ((c17945a02 != null && c17945a02.m95288w8()) || ((mediaItem2 = this.f59230C) != null && mediaItem2.m41163p0())) {
                z12 = true;
            }
            if (z11 && !z12 && !this.f59244M && this.f59261d0 && !m61959U()) {
                m61953J(canvas);
                Drawable drawable3 = f59217p1;
                int i16 = this.f59263f0;
                int i17 = this.f59264g0;
                int i18 = f59215n1;
                drawable3.setBounds(i16, i17, i16 + i18, i18 + i17);
                f59217p1.draw(canvas);
            }
        }
        if (m61978T()) {
            f59178C1.setColor(AbstractC11531v0.m62218X2());
            f59178C1.setStrokeWidth(f59187L0);
            canvas.drawPath(this.f59273p0, f59178C1);
        }
        if (!TextUtils.isEmpty(this.f59274q0)) {
            canvas.drawPath(this.f59273p0, f59180E1);
            canvas.drawText(this.f59274q0, this.f59275r0, this.f59276s0, f59179D1);
        }
        if (this.f59122r.m94849A8() && AbstractC11531v0.m62147H2() != null && AbstractC11531v0.m62137F2() != null) {
            Point point2 = this.f59130z;
            int i19 = point2.x;
            int m76472k = point2.y + this.f59232D.m76472k();
            int dimensionPixelSize = i19 + MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.label_margin_left_top);
            int intrinsicHeight = (m76472k - AbstractC11531v0.m62137F2().getIntrinsicHeight()) - MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.label_margin_left_top);
            AbstractC28236y3.m142204o(AbstractC11531v0.m62137F2(), dimensionPixelSize, intrinsicHeight);
            AbstractC11531v0.m62137F2().draw(canvas);
            int m118742r = AbstractC23136l9.m118742r(2.0f);
            int m118742r2 = AbstractC23136l9.m118742r(2.0f);
            int m118742r3 = AbstractC23136l9.m118742r(16.0f);
            int i21 = dimensionPixelSize + m118742r;
            int i22 = intrinsicHeight + m118742r2;
            AbstractC11531v0.m62147H2().setBounds(i21, i22, i21 + m118742r3, m118742r3 + i22);
            AbstractC11531v0.m62147H2().draw(canvas);
        }
    }

    /* renamed from: h0 */
    public boolean m61985h0() {
        if (this.f59238G && (this.f59239H || !m61980W())) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: j */
    protected void mo61917j(Canvas canvas) {
        String str;
        canvas.drawPath(this.f59265h0, f59219r1);
        AbstractC28236y3.m142204o(m61976P(), this.f59268k0, this.f59269l0).draw(canvas);
        if (this.f59129y) {
            str = f59225x1;
        } else {
            str = f59221t1;
        }
        RectF rectF = this.f59267j0;
        canvas.drawText(str, rectF.left, rectF.bottom, f59220s1);
        canvas.drawPath(this.f59271n0, f59224w1);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: k */
    public int mo61918k() {
        return this.f59232D.m76472k();
    }

    /* renamed from: k0 */
    public void m61986k0() {
        C17945a0 c17945a0 = this.f59122r;
        if (c17945a0 == null) {
            return;
        }
        if (c17945a0.m94871D7()) {
            if (this.f59122r.m95032V6()) {
                m61968l0();
                return;
            } else {
                m61966i0();
                return;
            }
        }
        if (this.f59122r.m95306y8()) {
            if (this.f59122r.m95032V6()) {
                m61969m0();
            } else {
                m61967j0();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: l */
    public int mo61919l() {
        return this.f59130z.x;
    }

    /* renamed from: n0 */
    public void m61987n0() {
        boolean z11;
        try {
            C17945a0 c17945a0 = this.f59122r;
            if (c17945a0 != null && c17945a0.m95032V6() && !this.f59122r.m95219o8() && !this.f59122r.m95091b6()) {
                boolean z12 = false;
                if (this.f59122r.m95180k8()) {
                    boolean m94871D7 = this.f59122r.m94871D7();
                    int m95107d3 = this.f59122r.m95107d3();
                    if (m94871D7 && m95107d3 != 5 && !this.f59237F0) {
                        if (m95107d3 == 3) {
                            this.f59128x = true;
                            m61964e0(true);
                        }
                    } else {
                        int m95089b4 = this.f59122r.m95089b4();
                        if (m95089b4 != 2 && m95089b4 != 3 && m95089b4 != 4) {
                            throw new IllegalArgumentException("Invalid state of synced message: " + this.f59122r.m95089b4());
                        }
                        z12 = true;
                    }
                } else {
                    int m95089b42 = this.f59122r.m95089b4();
                    if (m95089b42 != 0) {
                        if (m95089b42 != 1) {
                            if (m95089b42 != 2 && m95089b42 != 3 && m95089b42 != 4) {
                                AbstractC20110a.m104539h(new IllegalArgumentException("Invalid message state:" + this.f59122r.m95089b4() + "; type=" + this.f59122r.m95041W4()));
                            }
                            z12 = true;
                        } else if (C0814e0.m2059e(this.f59122r.m95029V3())) {
                            z12 = true;
                        } else {
                            this.f59128x = true;
                            m61964e0(true);
                        }
                    } else {
                        this.f59128x = true;
                        View view = this.f59120p;
                        if ((view instanceof ChatRowMultiPhotos) && ((ChatRowMultiPhotos) view).getDelegate().mo62101s4() != 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        m61964e0(z11);
                    }
                }
                if (this.f59122r.m94871D7()) {
                    if (this.f59237F0) {
                        m61964e0(true);
                        return;
                    }
                    if (!this.f59122r.m95022U7() && !this.f59127w.m143920m() && z12 && !this.f59127w.m143918k()) {
                        this.f59128x = true;
                        this.f59232D.m76454B(1.0f);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f59182G0, e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: o */
    public int mo61922o() {
        return this.f59130z.y;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: q */
    public int mo61923q() {
        return this.f59232D.m76473l();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: r */
    protected void mo61924r(Message message) {
        Bitmap m15819d;
        if (message.what == 10003) {
            String str = (String) message.obj;
            if (str.equals(this.f59122r.m95029V3().m41044h()) && !this.f59238G && (m15819d = AbstractC23306f.m120703q().m15819d(str)) != null && !m15819d.isRecycled()) {
                this.f59232D.m76480u(m15819d, true);
                this.f59120p.invalidate();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.AbstractC11473f2
    /* renamed from: w */
    public void mo61928w(int i11, int i12) {
        boolean z11;
        int i13;
        int i14;
        int i15;
        Point point = this.f59130z;
        if (i11 == point.x && i12 == point.y) {
            z11 = false;
        } else {
            z11 = true;
        }
        point.x = i11;
        point.y = i12;
        this.f59232D.m76460H(i11, i12);
        C16625n c16625n = this.f59231C0;
        if (c16625n != null) {
            int i16 = this.f59130z.x;
            int mo61923q = mo61923q();
            int i17 = ChatRow.f57223X5;
            c16625n.m88400d(i16 + ((mo61923q - i17) / 2), this.f59130z.y + ((mo61918k() - i17) / 2));
        }
        this.f59242K = this.f59130z.x + ((mo61923q() - f59177B1.getIntrinsicWidth()) / 2);
        this.f59243L = this.f59130z.y + ((mo61918k() - f59177B1.getIntrinsicHeight()) / 2);
        if (this.f59250S) {
            C17945a0 c17945a0 = this.f59122r;
            if (c17945a0 != null && c17945a0.m95306y8()) {
                this.f59245N = f59208g1;
            } else {
                this.f59245N = f59207f1;
            }
            if (this.f59122r != null) {
                this.f59245N.f59288d = AbstractC31125u.m151165W(this.f59120p.getContext(), this.f59122r);
            }
            StaticLayout m119627n = AbstractC23214t.m119627n(this.f59245N.f59288d, f59209h1, mo61923q() - (AbstractC23222t7.f112556e * 2), 2, Layout.Alignment.ALIGN_CENTER);
            this.f59251T = m119627n;
            int width = m119627n.getWidth();
            int height = this.f59251T.getHeight();
            this.f59246O = this.f59130z.x + ((mo61923q() - this.f59245N.f59286b) / 2);
            int i18 = this.f59130z.y;
            int mo61918k = mo61918k();
            int i19 = this.f59245N.f59287c;
            int i21 = f59218q1;
            this.f59247P = i18 + ((mo61918k - ((i19 + i21) + height)) / 2);
            this.f59248Q = this.f59130z.x + ((mo61923q() - width) / 2);
            int i22 = this.f59247P + this.f59245N.f59287c + i21;
            this.f59249R = i22;
            this.f59249R = Math.min(i22, (this.f59130z.y + mo61918k()) - AbstractC23136l9.m118742r(5.0f));
        }
        float f11 = i11;
        float f12 = i12;
        this.f59253V.set(f11, f12, mo61923q() + i11, mo61918k() + i12);
        this.f59252U.reset();
        Path path = this.f59252U;
        RectF rectF = this.f59253V;
        float[] m76470i = this.f59232D.m76470i();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, m76470i, direction);
        RectF rectF2 = this.f59254W;
        int i23 = f59185J0;
        rectF2.set((i23 / 2) + i11, (i23 / 2) + i12, (mo61923q() + i11) - (i23 / 2), (mo61918k() + i12) - (i23 / 2));
        this.f59255X.reset();
        this.f59255X.addRoundRect(this.f59254W, this.f59232D.m76470i(), direction);
        this.f59256Y = this.f59130z.x + ((mo61923q() - f59176A1.getIntrinsicWidth()) / 2);
        int i24 = this.f59130z.y;
        int mo61918k2 = mo61918k();
        int intrinsicHeight = f59176A1.getIntrinsicHeight();
        int i25 = f59218q1;
        this.f59257Z = i24 + ((mo61918k2 - ((intrinsicHeight + i25) + f59213l1)) / 2);
        this.f59258a0 = this.f59130z.x + ((mo61923q() - f59212k1) / 2);
        int intrinsicHeight2 = this.f59257Z + f59176A1.getIntrinsicHeight() + i25 + f59213l1;
        this.f59259b0 = intrinsicHeight2;
        this.f59259b0 = Math.min(intrinsicHeight2, (this.f59130z.y + mo61918k()) - AbstractC23136l9.m118742r(5.0f));
        this.f59270m0.set((i23 / 2) + i11, (i23 / 2) + i12, (mo61923q() + i11) - (i23 / 2), (mo61918k() + i12) - (i23 / 2));
        this.f59271n0.reset();
        this.f59271n0.addRoundRect(this.f59270m0, this.f59232D.m76470i(), direction);
        RectF rectF3 = this.f59272o0;
        int i26 = f59186K0;
        rectF3.set((i26 / 2) + i11, (i26 / 2) + i12, (mo61923q() + i11) - (i26 / 2), (mo61918k() + i12) - (i26 / 2));
        this.f59273p0.reset();
        this.f59273p0.addRoundRect(this.f59272o0, this.f59232D.m76470i(), direction);
        C17945a0 c17945a02 = this.f59122r;
        if ((c17945a02 != null && c17945a02.m95306y8()) || (this.f59230C instanceof VideoItem)) {
            int mo61923q2 = this.f59130z.x + (mo61923q() / 2);
            int i27 = f59215n1;
            this.f59263f0 = mo61923q2 - (i27 / 2);
            this.f59264g0 = (this.f59130z.y + (mo61918k() / 2)) - (i27 / 2);
        } else {
            C17945a0 c17945a03 = this.f59122r;
            if (c17945a03 != null && (c17945a03.m95219o8() || this.f59122r.m95091b6())) {
                this.f59268k0 = ((mo61923q() - m61976P().getIntrinsicWidth()) / 2) + i11;
                this.f59269l0 = ((mo61918k() / 2) + i12) - (((m61976P().getIntrinsicHeight() + i25) + f59223v1) / 2);
                int mo61923q3 = mo61923q();
                if (this.f59129y) {
                    i13 = f59226y1;
                } else {
                    i13 = f59222u1;
                }
                int i28 = ((mo61923q3 - i13) / 2) + i11;
                int intrinsicHeight3 = this.f59269l0 + m61976P().getIntrinsicHeight() + i25;
                boolean z12 = this.f59129y;
                if (z12) {
                    i14 = f59226y1;
                } else {
                    i14 = f59222u1;
                }
                if (z12) {
                    i15 = f59227z1;
                } else {
                    i15 = f59223v1;
                }
                this.f59267j0.set(i28, intrinsicHeight3, i28 + i14, intrinsicHeight3 + i15);
                this.f59266i0.set(f11, f12, mo61923q() + i11, mo61918k() + i12);
                this.f59265h0.reset();
                this.f59265h0.addRoundRect(this.f59266i0, this.f59232D.m76470i(), direction);
            }
        }
        if (!TextUtils.isEmpty(this.f59274q0)) {
            int m118764y0 = AbstractC23136l9.m118764y0(f59179D1, this.f59274q0);
            int m118761x0 = AbstractC23136l9.m118761x0(f59179D1, this.f59274q0);
            this.f59275r0 = i11 + ((mo61923q() - m118764y0) / 2);
            this.f59276s0 = ((mo61918k() + m118761x0) / 2) + i12;
        }
        this.f59283z0 |= z11;
        if (m61957R() && this.f59280w0 > 0) {
            if (this.f59283z0 || this.f59279v0 == null) {
                this.f59279v0 = AbstractC23214t.m119625l(m61955M(), f59181F1, this.f59280w0 - (f59204c1 * 2), 1);
                int mo61918k3 = (mo61918k() + i12) - f59183H0;
                int mo61918k4 = i12 + mo61918k();
                int mo61923q4 = i11 + mo61923q();
                float f13 = mo61918k4;
                float f14 = mo61918k3;
                LinearGradient linearGradient = new LinearGradient(f11, f13, f11, f14, -872415232, 0, Shader.TileMode.CLAMP);
                this.f59281x0 = linearGradient;
                this.f59282y0.setShader(linearGradient);
                Path path2 = new Path();
                this.f59228A0 = path2;
                path2.addRoundRect(new RectF(f11, f14, mo61923q4, f13), this.f59229B0, direction);
            }
        }
    }
}
