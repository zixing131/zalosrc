package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.C13804v0;
import me0.AbstractC23136l9;
import me0.AbstractC23144m6;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23304d;

/* loaded from: classes6.dex */
public class ProfileCardLoadingError extends View implements View.OnTouchListener {

    /* renamed from: A */
    private int f76250A;

    /* renamed from: B */
    private int f76251B;

    /* renamed from: C */
    private int f76252C;

    /* renamed from: D */
    private int f76253D;

    /* renamed from: E */
    private int f76254E;

    /* renamed from: F */
    private int f76255F;

    /* renamed from: G */
    private int f76256G;

    /* renamed from: H */
    private int f76257H;

    /* renamed from: I */
    private int f76258I;

    /* renamed from: J */
    private int f76259J;

    /* renamed from: K */
    private int f76260K;

    /* renamed from: L */
    private int f76261L;

    /* renamed from: M */
    private int f76262M;

    /* renamed from: N */
    private int f76263N;

    /* renamed from: O */
    private RectF f76264O;

    /* renamed from: P */
    private RectF f76265P;

    /* renamed from: Q */
    private Drawable f76266Q;

    /* renamed from: R */
    private Drawable f76267R;

    /* renamed from: S */
    private Paint f76268S;

    /* renamed from: T */
    private C13804v0 f76269T;

    /* renamed from: U */
    private int f76270U;

    /* renamed from: V */
    private int f76271V;

    /* renamed from: W */
    private StaticLayout f76272W;

    /* renamed from: a0 */
    private TextPaint f76273a0;

    /* renamed from: b0 */
    private Paint f76274b0;

    /* renamed from: c0 */
    private StaticLayout f76275c0;

    /* renamed from: d0 */
    private TextPaint f76276d0;

    /* renamed from: e0 */
    private int f76277e0;

    /* renamed from: f0 */
    private InterfaceC14797b f76278f0;

    /* renamed from: g0 */
    EnumC14796a f76279g0;

    /* renamed from: h0 */
    private boolean f76280h0;

    /* renamed from: p */
    private int f76281p;

    /* renamed from: q */
    private int f76282q;

    /* renamed from: r */
    private int f76283r;

    /* renamed from: s */
    private int f76284s;

    /* renamed from: t */
    private int f76285t;

    /* renamed from: u */
    private int f76286u;

    /* renamed from: v */
    private int f76287v;

    /* renamed from: w */
    private int f76288w;

    /* renamed from: x */
    private int f76289x;

    /* renamed from: y */
    private int f76290y;

    /* renamed from: z */
    private int f76291z;

    /* renamed from: com.zing.zalo.ui.zviews.ProfileCardLoadingError$a */
    /* loaded from: classes6.dex */
    private enum EnumC14796a {
        BUTTON,
        NONE
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProfileCardLoadingError$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC14797b {
        /* renamed from: a */
        void mo36200a();
    }

    public ProfileCardLoadingError(Context context, int i11, int i12) {
        super(context);
        this.f76277e0 = 0;
        this.f76279g0 = EnumC14796a.NONE;
        this.f76280h0 = false;
        m83009a(context, i11, i12);
    }

    /* renamed from: a */
    private void m83009a(Context context, int i11, int i12) {
        this.f76281p = i11;
        this.f76283r = i12;
        this.f76284s = AbstractC23136l9.m118742r(12.0f);
        this.f76285t = AbstractC23136l9.m118742r(148.0f);
        this.f76287v = AbstractC23136l9.m118742r(80.0f);
        this.f76288w = AbstractC23136l9.m118742r(16.0f);
        int m118742r = AbstractC23136l9.m118742r(30.0f);
        this.f76290y = m118742r;
        this.f76289x = this.f76281p - (m118742r * 2);
        this.f76291z = AbstractC23136l9.m118742r(14.0f);
        this.f76250A = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        this.f76257H = AbstractC23136l9.m118742r(34.0f);
        this.f76253D = AbstractC23136l9.m118742r(10.0f);
        this.f76259J = AbstractC23136l9.m118742r(1.0f);
        this.f76261L = -11623712;
        this.f76262M = -1;
        int i13 = this.f76281p;
        int i14 = i13 / 2;
        this.f76254E = i14;
        this.f76255F = (i13 / 2) - (i14 / 2);
        this.f76258I = this.f76257H / 2;
        this.f76263N = AbstractC23136l9.m118742r(12.0f);
        int i15 = AbstractC23304d.f113456x2;
        if (i15 <= 0) {
            i15 = 1181;
        }
        this.f76282q = i15;
        int i16 = (this.f76283r / 2) - (i15 / 2);
        this.f76286u = i16;
        int i17 = this.f76285t;
        this.f76270U = ((i15 - i17) / 2) + i16 + i17;
        this.f76271V = this.f76281p / 2;
        Paint paint = new Paint();
        this.f76268S = paint;
        paint.setAntiAlias(true);
        this.f76268S.setColor(C23212s8.m119607o(context, AbstractC16781w.PopupBackgroundColor));
        TextPaint textPaint = new TextPaint();
        this.f76273a0 = textPaint;
        textPaint.setAntiAlias(true);
        this.f76273a0.setTextSize(this.f76291z);
        this.f76273a0.setColor(this.f76250A);
        Paint paint2 = new Paint();
        this.f76274b0 = paint2;
        paint2.setAntiAlias(true);
        this.f76274b0.setStrokeWidth(this.f76259J);
        this.f76274b0.setStyle(Paint.Style.STROKE);
        this.f76274b0.setColor(this.f76261L);
        TextPaint textPaint2 = new TextPaint();
        this.f76276d0 = textPaint2;
        textPaint2.setAntiAlias(true);
        this.f76276d0.setTextSize(this.f76263N);
        this.f76276d0.setColor(this.f76261L);
        int i18 = this.f76283r;
        int i19 = this.f76282q;
        this.f76264O = new RectF(0.0f, (i18 / 2) - (i19 / 2), this.f76281p, (i18 / 2) + (i19 / 2));
        String string = getResources().getString(AbstractC8020f0.str_mini_profile_error);
        TextPaint textPaint3 = this.f76273a0;
        int i21 = this.f76289x;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(string, textPaint3, i21, alignment, 1.0f, 0.0f, false);
        this.f76272W = staticLayout;
        int height = staticLayout.getHeight();
        this.f76251B = height;
        int i22 = this.f76253D;
        int i23 = height + i22 + this.f76257H;
        this.f76260K = i23;
        int i24 = this.f76270U - (i23 / 2);
        this.f76252C = i24;
        this.f76256G = i24 + height + i22;
        this.f76275c0 = new StaticLayout(getResources().getString(AbstractC8020f0.str_retry), this.f76276d0, this.f76254E, alignment, 1.0f, 0.0f, false);
        this.f76265P = new RectF(this.f76255F, this.f76256G, r14 + this.f76254E, r0 + this.f76257H);
        m83010b();
        this.f76269T = new C13804v0(this);
        setOnTouchListener(this);
    }

    /* renamed from: b */
    private void m83010b() {
        if (this.f76266Q == null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(MainApplication.getAppContext().getResources(), AbstractC23144m6.m118822c(BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.bg_item_chat_o), this.f76281p, this.f76285t, this.f76284s));
            this.f76266Q = bitmapDrawable;
            bitmapDrawable.setBounds(0, 0, this.f76281p, this.f76285t);
        }
        if (this.f76267R == null) {
            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(MainApplication.getAppContext().getResources(), BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.ava_miniprofile_default));
            this.f76267R = bitmapDrawable2;
            int i11 = this.f76287v;
            bitmapDrawable2.setBounds(0, 0, i11, i11);
        }
    }

    /* renamed from: c */
    private void m83011c(int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                this.f76274b0.setStyle(Paint.Style.STROKE);
                this.f76276d0.setColor(this.f76261L);
            }
        } else {
            this.f76274b0.setStyle(Paint.Style.FILL);
            this.f76276d0.setColor(this.f76262M);
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f76264O;
        if (rectF != null) {
            int i11 = this.f76284s;
            canvas.drawRoundRect(rectF, i11, i11, this.f76268S);
        }
        if (this.f76266Q != null) {
            canvas.save();
            canvas.translate(0.0f, this.f76286u);
            this.f76266Q.setBounds(0, 0, this.f76281p, this.f76285t);
            this.f76266Q.draw(canvas);
            canvas.restore();
        }
        if (this.f76267R != null) {
            canvas.save();
            int i12 = this.f76281p / 2;
            int i13 = this.f76287v;
            canvas.translate(i12 - (i13 / 2), ((this.f76286u + this.f76285t) + this.f76288w) - i13);
            Drawable drawable = this.f76267R;
            int i14 = this.f76287v;
            drawable.setBounds(0, 0, i14, i14);
            this.f76267R.draw(canvas);
            canvas.restore();
        }
        int i15 = this.f76277e0;
        if (i15 == 0) {
            if (this.f76269T != null) {
                this.f76269T.m77067f(this.f76271V - AbstractC23136l9.m118742r(12.0f), this.f76270U - AbstractC23136l9.m118742r(12.0f));
                this.f76269T.m77062a(canvas);
                return;
            }
            return;
        }
        if (i15 == 1) {
            if (this.f76272W != null) {
                canvas.save();
                canvas.translate(this.f76290y, this.f76252C);
                this.f76272W.draw(canvas);
                canvas.restore();
            }
            RectF rectF2 = this.f76265P;
            int i16 = this.f76258I;
            canvas.drawRoundRect(rectF2, i16, i16, this.f76274b0);
            if (this.f76275c0 != null) {
                canvas.save();
                canvas.translate(this.f76255F, (this.f76256G + (this.f76257H / 2)) - (this.f76275c0.getHeight() / 2));
                this.f76275c0.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(this.f76281p, this.f76283r);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int round = Math.round(motionEvent.getX());
        int round2 = Math.round(motionEvent.getY());
        if (this.f76278f0 != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            m83011c(1);
                        }
                    } else {
                        this.f76280h0 = true;
                    }
                } else {
                    m83011c(1);
                    if (this.f76279g0 == EnumC14796a.BUTTON && this.f76265P.contains(round, round2)) {
                        this.f76278f0.mo36200a();
                    }
                }
            } else {
                if (this.f76265P.contains(round, round2)) {
                    this.f76279g0 = EnumC14796a.BUTTON;
                    m83011c(0);
                } else {
                    this.f76279g0 = EnumC14796a.NONE;
                }
                this.f76280h0 = false;
            }
        }
        return true;
    }

    public void setProfileCardErrorListener(InterfaceC14797b interfaceC14797b) {
        this.f76278f0 = interfaceC14797b;
    }

    public void setState(int i11) {
        this.f76277e0 = i11;
    }
}
