package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.chat.chatrow.C11479h0;
import com.zing.zalo.p077ui.widget.C13704p1;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p698yz.AbstractC31125u;

/* renamed from: com.zing.zalo.uicontrol.t2 */
/* loaded from: classes4.dex */
public class C16660t2 {

    /* renamed from: A */
    private static int f84461A = 0;

    /* renamed from: B */
    private static Paint f84462B = null;

    /* renamed from: C */
    private static final int f84463C = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: v */
    public static boolean f84464v = false;

    /* renamed from: w */
    private static Paint f84465w;

    /* renamed from: x */
    private static C13704p1 f84466x;

    /* renamed from: y */
    private static Drawable f84467y;

    /* renamed from: z */
    private static int f84468z;

    /* renamed from: a */
    Context f84469a;

    /* renamed from: b */
    int f84470b;

    /* renamed from: c */
    int f84471c;

    /* renamed from: d */
    float[] f84472d;

    /* renamed from: e */
    a f84473e;

    /* renamed from: f */
    boolean f84474f;

    /* renamed from: h */
    private final C11479h0 f84476h;

    /* renamed from: m */
    private int f84481m;

    /* renamed from: n */
    private int f84482n;

    /* renamed from: q */
    private int f84485q;

    /* renamed from: r */
    private int f84486r;

    /* renamed from: s */
    private int f84487s;

    /* renamed from: t */
    private int f84488t;

    /* renamed from: u */
    b f84489u;

    /* renamed from: g */
    String f84475g = "";

    /* renamed from: i */
    private boolean f84477i = false;

    /* renamed from: j */
    private boolean f84478j = false;

    /* renamed from: k */
    private final Path f84479k = new Path();

    /* renamed from: l */
    private String f84480l = "";

    /* renamed from: o */
    private final RectF f84483o = new RectF();

    /* renamed from: p */
    private final Path f84484p = new Path();

    /* renamed from: com.zing.zalo.uicontrol.t2$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo61907a();
    }

    /* renamed from: com.zing.zalo.uicontrol.t2$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo61771a();
    }

    public C16660t2(Context context, b bVar) {
        this.f84469a = context;
        this.f84489u = bVar;
        if (f84465w == null || f84464v) {
            m88787b();
            f84464v = false;
        }
        this.f84476h = new C11479h0(context);
    }

    /* renamed from: b */
    private void m88787b() {
        Paint paint = new Paint(1);
        f84465w = paint;
        paint.setStyle(Paint.Style.FILL);
        f84465w.setColor(C23212s8.m119607o(this.f84469a, AbstractC16781w.ChatMultiPhotoItemRecallBackgroundColor));
        Paint paint2 = new Paint(1);
        f84462B = paint2;
        paint2.setColor(-1999054632);
        f84462B.setStyle(Paint.Style.STROKE);
        f84462B.setStrokeWidth(f84463C);
        C13704p1 c13704p1 = new C13704p1(1);
        f84466x = c13704p1;
        c13704p1.setColor(AbstractC11531v0.m62143G3());
        f84466x.m76613c();
        f84466x.m76614d(AbstractC23136l9.m118742r(13.0f), false);
        Drawable m62118B3 = AbstractC11531v0.m62118B3();
        f84467y = m62118B3;
        if (m62118B3 != null) {
            f84468z = m62118B3.getIntrinsicWidth();
            f84461A = f84467y.getIntrinsicHeight();
        }
    }

    /* renamed from: l */
    private void m88788l(int i11, int i12, float[] fArr) {
        this.f84479k.reset();
        float f11 = i11;
        float f12 = i12;
        RectF rectF = new RectF(0.0f, 0.0f, f11, f12);
        if (fArr != null) {
            this.f84479k.addRoundRect(rectF, fArr, Path.Direction.CW);
        } else {
            this.f84479k.addRect(rectF, Path.Direction.CW);
        }
        int m118742r = AbstractC23136l9.m118742r(12.0f);
        RectF rectF2 = this.f84483o;
        int i13 = f84463C;
        rectF2.set(i13 / 2.0f, i13 / 2.0f, f11 - (i13 / 2.0f), f12 - (i13 / 2.0f));
        this.f84484p.reset();
        if (fArr != null) {
            this.f84484p.addRoundRect(this.f84483o, fArr, Path.Direction.CW);
        } else {
            this.f84484p.addRect(this.f84483o, Path.Direction.CW);
        }
        String m151166X = AbstractC31125u.m151166X(this.f84469a, this.f84475g, 19);
        this.f84480l = m151166X;
        this.f84481m = AbstractC23136l9.m118764y0(f84466x, m151166X);
        int m118761x0 = AbstractC23136l9.m118761x0(f84466x, this.f84480l);
        this.f84482n = m118761x0;
        this.f84485q = (i11 - f84468z) / 2;
        int i14 = f84461A;
        int i15 = (i12 - ((i14 + m118742r) + m118761x0)) / 2;
        this.f84486r = i15;
        this.f84487s = (i11 - this.f84481m) / 2;
        int i16 = i15 + i14 + m118742r + m118761x0;
        this.f84488t = i16;
        this.f84488t = Math.min(i16, i12 - AbstractC23136l9.m118742r(5.0f));
    }

    /* renamed from: a */
    public void m88789a(Canvas canvas) {
        if (this.f84478j) {
            canvas.drawPath(this.f84479k, f84465w);
            Drawable drawable = f84467y;
            int i11 = this.f84485q;
            int i12 = this.f84486r;
            drawable.setBounds(i11, i12, f84468z + i11, f84461A + i12);
            f84467y.draw(canvas);
            canvas.drawText(this.f84480l, this.f84487s, this.f84488t, f84466x);
            canvas.drawPath(this.f84484p, f84462B);
        }
        if (this.f84477i && !this.f84478j) {
            this.f84476h.m61938b(canvas, 0, 0);
        }
    }

    /* renamed from: c */
    boolean m88790c(float f11, float f12) {
        return f11 >= 0.0f && f11 <= ((float) this.f84470b) && f12 >= 0.0f && f12 <= ((float) this.f84471c);
    }

    /* renamed from: d */
    public boolean m88791d(MotionEvent motionEvent, int i11, float f11, float f12) {
        if (i11 == 0) {
            if (m88790c(f11, f12)) {
                this.f84474f = true;
            }
            return this.f84474f;
        }
        if (i11 == 1) {
            if (this.f84474f) {
                a aVar = this.f84473e;
                if (aVar != null) {
                    aVar.mo61907a();
                }
                this.f84474f = false;
            }
        } else if (i11 == 3) {
            this.f84474f = false;
        }
        return false;
    }

    /* renamed from: e */
    public void m88792e() {
        this.f84478j = false;
        this.f84477i = false;
        this.f84476h.m61939j();
    }

    /* renamed from: f */
    public void m88793f(a aVar) {
        this.f84473e = aVar;
    }

    /* renamed from: g */
    public void m88794g(String str) {
        if (!TextUtils.equals(str, this.f84475g)) {
            this.f84475g = str;
            if (this.f84478j) {
                m88788l(this.f84470b, this.f84471c, this.f84472d);
            }
        }
    }

    /* renamed from: h */
    public void m88795h(long j11) {
        this.f84476h.m61940k(j11);
    }

    /* renamed from: i */
    public void m88796i(boolean z11) {
        this.f84476h.m61941l(z11);
    }

    /* renamed from: j */
    public void m88797j(boolean z11) {
        this.f84476h.m61942m(z11);
    }

    /* renamed from: k */
    public void m88798k(boolean z11, boolean z12) {
        this.f84477i = z11;
        if (z12) {
            this.f84489u.mo61771a();
        }
    }

    /* renamed from: m */
    public void m88799m(boolean z11) {
        this.f84478j = z11;
        if (z11) {
            m88788l(this.f84470b, this.f84471c, this.f84472d);
        }
    }

    /* renamed from: n */
    public void m88800n(int i11, int i12, float[] fArr) {
        this.f84470b = i11;
        this.f84471c = i12;
        this.f84472d = fArr;
        if (this.f84478j) {
            m88788l(i11, i12, fArr);
        }
    }
}
