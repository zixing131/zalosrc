package com.zing.zalo.p077ui.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2807a;
import c30.C3245i;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.AbstractC12964n;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12955e;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12957g;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12958h;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12961k;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12962l;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12963m;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12970t;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12965o;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.io.Serializable;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p588vw.C28652r;
import p716zh.C31947h9;
import rc0.C25729b;
import rc0.InterfaceC25728a;
import ui0.C27280g;

/* loaded from: classes6.dex */
public class StickerIndicatorView extends View implements InterfaceC25728a {

    /* renamed from: A */
    Drawable f69690A;

    /* renamed from: B */
    Drawable f69691B;

    /* renamed from: C */
    Drawable f69692C;

    /* renamed from: D */
    Drawable f69693D;

    /* renamed from: E */
    Drawable f69694E;

    /* renamed from: F */
    Paint f69695F;

    /* renamed from: G */
    Drawable f69696G;

    /* renamed from: H */
    Drawable f69697H;

    /* renamed from: I */
    C3977j f69698I;

    /* renamed from: J */
    String f69699J;

    /* renamed from: K */
    String f69700K;

    /* renamed from: L */
    boolean f69701L;

    /* renamed from: M */
    int f69702M;

    /* renamed from: N */
    int f69703N;

    /* renamed from: O */
    int f69704O;

    /* renamed from: P */
    int f69705P;

    /* renamed from: Q */
    C24003n f69706Q;

    /* renamed from: R */
    C3977j f69707R;

    /* renamed from: S */
    C13538e f69708S;

    /* renamed from: T */
    ColorMatrixColorFilter f69709T;

    /* renamed from: U */
    C25729b f69710U;

    /* renamed from: V */
    private String f69711V;

    /* renamed from: W */
    ValueAnimator f69712W;

    /* renamed from: p */
    final int f69713p;

    /* renamed from: q */
    int f69714q;

    /* renamed from: r */
    int f69715r;

    /* renamed from: s */
    int f69716s;

    /* renamed from: t */
    int f69717t;

    /* renamed from: u */
    C23528a f69718u;

    /* renamed from: v */
    C24003n f69719v;

    /* renamed from: w */
    InterfaceC12965o f69720w;

    /* renamed from: x */
    Drawable f69721x;

    /* renamed from: y */
    Drawable f69722y;

    /* renamed from: z */
    Drawable f69723z;

    /* renamed from: com.zing.zalo.ui.widget.StickerIndicatorView$a */
    /* loaded from: classes6.dex */
    public class C13534a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ Context f69724l1;

        C13534a(Context context) {
            this.f69724l1 = context;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            try {
                C3977j c3977j = StickerIndicatorView.this.f69707R;
                if (c3977j != null) {
                    c3977j.setImageInfo(c3979l, false);
                }
                if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                    if (m18839c.getWidth() != 1 || m18839c.getHeight() != 1) {
                        StickerIndicatorView stickerIndicatorView = StickerIndicatorView.this;
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f69724l1.getResources(), m18839c);
                        stickerIndicatorView.f69693D = bitmapDrawable;
                        stickerIndicatorView.f69696G = bitmapDrawable;
                        StickerIndicatorView.this.requestLayout();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.StickerIndicatorView$b */
    /* loaded from: classes6.dex */
    public class C13535b implements Animator.AnimatorListener {

        /* renamed from: p */
        final /* synthetic */ JSONObject f69726p;

        C13535b(JSONObject jSONObject) {
            this.f69726p = jSONObject;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            StickerIndicatorView.this.m75913h(this.f69726p.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL), false, false, null, false);
            AbstractC23309i.m121570Wj(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            StickerIndicatorView stickerIndicatorView = StickerIndicatorView.this;
            if (stickerIndicatorView.f69720w instanceof C12970t) {
                stickerIndicatorView.m75913h(this.f69726p.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL), false, false, null, true);
                AbstractC23309i.m121570Wj(false);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.StickerIndicatorView$c */
    /* loaded from: classes6.dex */
    public class C13536c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ boolean f69728l1;

        /* renamed from: m1 */
        final /* synthetic */ boolean f69729m1;

        /* renamed from: n1 */
        final /* synthetic */ boolean f69730n1;

        /* renamed from: o1 */
        final /* synthetic */ Animator.AnimatorListener f69731o1;

        C13536c(boolean z11, boolean z12, boolean z13, Animator.AnimatorListener animatorListener) {
            this.f69728l1 = z11;
            this.f69729m1 = z12;
            this.f69730n1 = z13;
            this.f69731o1 = animatorListener;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x008f A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:2:0x0000, B:5:0x000e, B:7:0x0014, B:9:0x001e, B:11:0x0029, B:14:0x0037, B:16:0x003d, B:17:0x0041, B:19:0x0058, B:20:0x008b, B:22:0x008f, B:23:0x00a1, B:25:0x00a5, B:30:0x0073, B:31:0x007b), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a5 A[Catch: Exception -> 0x0034, TRY_LEAVE, TryCatch #0 {Exception -> 0x0034, blocks: (B:2:0x0000, B:5:0x000e, B:7:0x0014, B:9:0x001e, B:11:0x0029, B:14:0x0037, B:16:0x003d, B:17:0x0041, B:19:0x0058, B:20:0x008b, B:22:0x008f, B:23:0x00a1, B:25:0x00a5, B:30:0x0073, B:31:0x007b), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (TextUtils.equals(str, StickerIndicatorView.this.f69711V)) {
                    if (c3979l == null || c3979l.m18839c() == null || c3979l.m18839c().isRecycled() || (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1)) {
                        StickerIndicatorView stickerIndicatorView = StickerIndicatorView.this;
                        stickerIndicatorView.f69694E = C27280g.m139660c(stickerIndicatorView.getContext(), AbstractC23322a.zds_ic_fire_line_24, AbstractC2807a.icon_02);
                        if (this.f69729m1) {
                            StickerIndicatorView stickerIndicatorView2 = StickerIndicatorView.this;
                            stickerIndicatorView2.f69696G = stickerIndicatorView2.f69694E;
                            int i11 = stickerIndicatorView2.f69702M;
                            int i12 = stickerIndicatorView2.f69703N;
                            int i13 = stickerIndicatorView2.f69714q;
                            stickerIndicatorView2.invalidate(i11, i12, i11 + i13, i13 + i12);
                        }
                        if (!this.f69730n1) {
                            StickerIndicatorView stickerIndicatorView3 = StickerIndicatorView.this;
                            stickerIndicatorView3.m75915j(stickerIndicatorView3.f69694E, -1, this.f69731o1);
                            return;
                        }
                        return;
                    }
                    C3977j c3977j = StickerIndicatorView.this.f69698I;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    StickerIndicatorView.this.f69694E = new BitmapDrawable(StickerIndicatorView.this.getResources(), c3979l.m18839c());
                    if (this.f69728l1) {
                        StickerIndicatorView.this.f69694E.setColorFilter(new PorterDuffColorFilter(C23212s8.m119607o(StickerIndicatorView.this.getContext(), AbstractC16781w.NormalIcon3), PorterDuff.Mode.SRC_IN));
                    } else {
                        StickerIndicatorView.this.f69694E.clearColorFilter();
                    }
                    if (this.f69729m1) {
                    }
                    if (!this.f69730n1) {
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.StickerIndicatorView$d */
    /* loaded from: classes6.dex */
    public class C13537d extends C23999j {
        C13537d() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (TextUtils.equals(str, StickerIndicatorView.this.f69699J)) {
                    if (c3979l == null || c3979l.m18839c() == null || (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1)) {
                        StickerIndicatorView stickerIndicatorView = StickerIndicatorView.this;
                        stickerIndicatorView.f69696G = stickerIndicatorView.f69697H;
                        StickerIndicatorView stickerIndicatorView2 = StickerIndicatorView.this;
                        int i11 = stickerIndicatorView2.f69702M;
                        int i12 = stickerIndicatorView2.f69703N;
                        int i13 = stickerIndicatorView2.f69714q;
                        stickerIndicatorView2.invalidate(i11, i12, i11 + i13, i13 + i12);
                    }
                    C3977j c3977j = StickerIndicatorView.this.f69698I;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    StickerIndicatorView stickerIndicatorView3 = StickerIndicatorView.this;
                    stickerIndicatorView3.f69700K = str;
                    stickerIndicatorView3.f69696G = new BitmapDrawable(StickerIndicatorView.this.getResources(), c3979l.m18839c());
                    StickerIndicatorView stickerIndicatorView22 = StickerIndicatorView.this;
                    int i112 = stickerIndicatorView22.f69702M;
                    int i122 = stickerIndicatorView22.f69703N;
                    int i132 = stickerIndicatorView22.f69714q;
                    stickerIndicatorView22.invalidate(i112, i122, i112 + i132, i132 + i122);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public StickerIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int m118742r = AbstractC23136l9.m118742r(30.0f);
        this.f69713p = m118742r;
        this.f69714q = m118742r;
        this.f69715r = AbstractC23136l9.m118742r(30.0f);
        this.f69716s = AbstractC23136l9.m118742r(48.0f);
        this.f69717t = AbstractC23136l9.m118742r(48.0f);
        this.f69712W = null;
        m75910d(context, null);
    }

    /* renamed from: e */
    public /* synthetic */ void m75908e(int i11, Drawable drawable, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        drawable.setColorFilter(m75909c(i11, floatValue), PorterDuff.Mode.SRC_ATOP);
        if (floatValue == 0.0d) {
            drawable.setColorFilter(null);
        }
        int i12 = this.f69702M;
        int i13 = this.f69703N;
        int i14 = this.f69714q;
        invalidate(i12, i13, i12 + i14, i14 + i13);
    }

    /* renamed from: c */
    int m75909c(int i11, float f11) {
        return Color.argb(Math.round(Color.alpha(i11) * f11), Color.red(i11), Color.green(i11), Color.blue(i11));
    }

    /* renamed from: d */
    void m75910d(Context context, C13538e c13538e) {
        try {
            this.f69708S = c13538e;
            if (c13538e != null) {
                this.f69714q = c13538e.f69736r;
                if (c13538e.f69737s == 1) {
                    Paint paint = new Paint(1);
                    this.f69695F = paint;
                    paint.setStyle(Paint.Style.STROKE);
                    this.f69695F.setStrokeWidth(AbstractC23136l9.m118742r(3.0f));
                    this.f69695F.setColor(AbstractC1388a.m6961c(context, AbstractC16801x.zalo_camera_view_sticker_indicator_selection));
                    this.f69716s = AbstractC23136l9.m118742r(45.0f);
                    this.f69717t = AbstractC23136l9.m118742r(45.0f);
                }
            }
            this.f69718u = new C23528a(context);
            C24003n m120089P0 = C23278z2.m120089P0();
            this.f69719v = m120089P0;
            this.f69697H = m120089P0.f116261b;
            int i11 = this.f69716s;
            int i12 = this.f69714q;
            this.f69702M = (i11 - i12) / 2;
            int i13 = this.f69717t;
            this.f69703N = (i13 - i12) / 2;
            int i14 = this.f69715r;
            this.f69704O = (i11 - i14) / 2;
            this.f69705P = (i13 - i14) / 2;
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.f69709T = new ColorMatrixColorFilter(colorMatrix);
            if (c13538e != null) {
                setBackgroundResource(c13538e.f69735q);
            } else {
                setBackgroundResource(AbstractC16803z.sticker_indicator_view_background);
            }
            this.f69710U = new C25729b(this);
            this.f69698I = new C3977j(context);
            this.f69707R = new C3977j(context);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public void m75911f() {
        if (!TextUtils.isEmpty(AbstractC23309i.m122538wd())) {
            m75913h(AbstractC23309i.m122538wd(), true, false, null, true);
        } else {
            this.f69694E = C27280g.m139660c(getContext(), AbstractC23322a.zds_ic_fire_line_24, AbstractC2807a.icon_02);
        }
        this.f69696G = this.f69694E;
        int i11 = this.f69702M;
        int i12 = this.f69703N;
        int i13 = this.f69714q;
        invalidate(i11, i12, i11 + i13, i13 + i12);
    }

    /* renamed from: g */
    void m75912g() {
        try {
            AbstractC3972e.m18781f0(this.f69698I);
            this.f69696G = this.f69697H;
            if (TextUtils.isEmpty(this.f69699J)) {
                return;
            }
            if (this.f69701L && !C23999j.m125696L2(this.f69699J, this.f69719v)) {
                return;
            }
            ((C23528a) this.f69718u.m123612r(this.f69698I)).m123579C(this.f69699J, this.f69719v, new C13537d());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    void m75913h(String str, boolean z11, boolean z12, Animator.AnimatorListener animatorListener, boolean z13) {
        this.f69711V = str;
        ((C23528a) this.f69718u.m123612r(this.f69698I)).m123579C(str, this.f69719v, new C13536c(z11, z13, z12, animatorListener));
    }

    /* renamed from: i */
    public void m75914i() {
        Bitmap bitmap;
        try {
            if (this.f69720w != null && !TextUtils.isEmpty(this.f69699J)) {
                Drawable drawable = this.f69696G;
                boolean z11 = true;
                if (drawable != null && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && !bitmap.isRecycled()) {
                    z11 = false;
                }
                if (!TextUtils.equals(this.f69699J, this.f69700K) || z11) {
                    m75912g();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    void m75915j(Drawable drawable, int i11, Animator.AnimatorListener animatorListener) {
        ValueAnimator valueAnimator = this.f69712W;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f69712W = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.p2

            /* renamed from: q */
            public final /* synthetic */ int f70915q;

            /* renamed from: r */
            public final /* synthetic */ Drawable f70916r;

            public /* synthetic */ C13705p2(int i112, Drawable drawable2) {
                r2 = i112;
                r3 = drawable2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                StickerIndicatorView.this.m75908e(r2, r3, valueAnimator2);
            }
        });
        if (animatorListener != null) {
            this.f69712W.addListener(animatorListener);
        }
        this.f69712W.setDuration(1000L);
        this.f69712W.setRepeatCount(0);
        this.f69712W.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        try {
            Drawable drawable = this.f69696G;
            if (drawable != null) {
                C13538e c13538e = this.f69708S;
                if (c13538e != null) {
                    if (c13538e.f69737s == 1) {
                        if (isSelected()) {
                            canvas.drawRect(0.0f, this.f69717t - AbstractC23136l9.m118742r(3.0f), this.f69716s, this.f69717t, this.f69695F);
                        }
                    } else if (isSelected()) {
                        this.f69696G.setAlpha(255);
                        this.f69696G.setColorFilter(null);
                    } else {
                        this.f69696G.setAlpha((int) (this.f69708S.f69734p * 255.0f));
                        this.f69696G.setColorFilter(this.f69709T);
                    }
                } else {
                    drawable.setAlpha(255);
                }
                Drawable drawable2 = this.f69696G;
                int i11 = this.f69702M;
                int i12 = this.f69703N;
                int i13 = this.f69714q;
                drawable2.setBounds(i11, i12, i11 + i13, i13 + i12);
                this.f69696G.draw(canvas);
            }
            C25729b c25729b = this.f69710U;
            if (c25729b != null) {
                c25729b.m132815a(canvas, canvas.getWidth());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(this.f69716s, this.f69717t);
    }

    public void setCustomStyle(C13538e c13538e) {
        this.f69708S = c13538e;
    }

    @Override // rc0.InterfaceC25728a
    public void setEnableNoti(boolean z11) {
        this.f69710U.setEnableNoti(z11);
    }

    public void setLeftRedDot(boolean z11) {
        this.f69710U.m132817c(z11);
    }

    @Override // rc0.InterfaceC25728a
    public void setRadiusNoti(int i11) {
        this.f69710U.setRadiusNoti(i11);
    }

    public void setRedDotColor(int i11) {
        this.f69710U.m132818d(i11);
    }

    @Override // rc0.InterfaceC25728a
    public void setRedDotMargin(int i11) {
        this.f69710U.setRedDotMargin(i11);
    }

    public void setRedDotMarginLeft(int i11) {
        this.f69710U.m132819e(i11);
    }

    public void setRedDotMarginTop(int i11) {
        this.f69710U.m132820f(i11);
    }

    public void setRightRedDot(boolean z11) {
        this.f69710U.m132821g(z11);
    }

    public void setSticker(InterfaceC12965o interfaceC12965o) {
        long j11;
        String str = "";
        try {
            this.f69699J = "";
            this.f69711V = "";
            this.f69696G = this.f69697H;
            this.f69720w = interfaceC12965o;
            Context context = getContext();
            if (interfaceC12965o != null) {
                if (interfaceC12965o instanceof C12963m) {
                    if (this.f69692C == null) {
                        this.f69692C = C27280g.m139660c(context, AbstractC23322a.zds_ic_setting_line_24, AbstractC2807a.icon_02);
                    }
                    this.f69696G = this.f69692C;
                } else if (interfaceC12965o instanceof C12958h) {
                    if (this.f69691B == null) {
                        this.f69691B = AbstractC1388a.m6964f(context, AbstractC16803z.sticker_emoticon);
                    }
                    setId(AbstractC6918a0.blc_input_emoji_tab);
                    this.f69696G = this.f69691B;
                } else if (interfaceC12965o instanceof C12962l) {
                    if (this.f69693D == null) {
                        this.f69693D = C27280g.m139660c(context, AbstractC23322a.zds_ic_playground_line_24, AbstractC2807a.icon_02);
                    }
                    this.f69696G = this.f69693D;
                    C31947h9 mo150752p = AbstractC23306f.m120726x1().mo150752p();
                    if (mo150752p != null) {
                        str = mo150752p.m153582d();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        if (this.f69706Q == null) {
                            C24003n c24003n = new C24003n();
                            this.f69706Q = c24003n;
                            c24003n.f116275p = true;
                            c24003n.f116276q = true;
                            c24003n.f116261b = C27280g.m139660c(context, AbstractC23322a.zds_ic_playground_line_24, AbstractC2807a.icon_02);
                            this.f69706Q.f116260a = AbstractC23136l9.m118742r(24.0f);
                        }
                        ((C23528a) this.f69718u.m123612r(this.f69707R)).m123579C(str, this.f69706Q, new C13534a(context));
                    }
                } else if (interfaceC12965o instanceof C12957g) {
                    int m72860c = ((C12957g) interfaceC12965o).m72860c();
                    if (m72860c >= 0 && m72860c < C28652r.m143349v().m143385z(false)) {
                        this.f69691B = AbstractC1388a.m6964f(context, C28652r.m143349v().m143378r(m72860c, false));
                    } else {
                        this.f69691B = AbstractC1388a.m6964f(context, AbstractC16803z.sticker_emoticon);
                    }
                    this.f69696G = this.f69691B;
                } else if (interfaceC12965o instanceof C12955e) {
                    int m72859c = ((C12955e) interfaceC12965o).m72859c();
                    if (m72859c >= 0 && m72859c <= C28652r.m143349v().m143385z(true)) {
                        this.f69691B = C27280g.m139660c(context, C28652r.m143349v().m143378r(m72859c, true), AbstractC2807a.icon_02);
                    } else if (m72859c == -1) {
                        this.f69691B = C27280g.m139660c(context, AbstractC23322a.zds_ic_zalo_line_24, AbstractC2807a.icon_02);
                    } else if (m72859c == -2) {
                        this.f69691B = C27280g.m139660c(context, AbstractC23322a.zds_ic_clock_1_line_24, AbstractC2807a.icon_02);
                    }
                    this.f69696G = this.f69691B;
                } else if (interfaceC12965o instanceof AbstractC12964n) {
                    C3245i m72862c = ((AbstractC12964n) interfaceC12965o).m72862c();
                    int i11 = m72862c.f13854b;
                    if (i11 != -2 && i11 != -3) {
                        if (i11 == 0) {
                            if (this.f69722y == null) {
                                this.f69722y = AbstractC1388a.m6964f(context, AbstractC16803z.ic_onion_avatar);
                            }
                            this.f69696G = this.f69722y;
                        } else if (i11 == -10) {
                            if (this.f69690A == null) {
                                this.f69690A = C27280g.m139660c(context, AbstractC23322a.zds_ic_ai_generated_sticker_line_24, AbstractC2807a.icon_02);
                            }
                            this.f69696G = this.f69690A;
                        } else {
                            this.f69699J = m72862c.f13858f;
                            m75912g();
                        }
                    }
                    if (this.f69723z == null) {
                        this.f69723z = C27280g.m139660c(context, AbstractC23322a.zds_ic_clock_1_line_24, AbstractC2807a.icon_02);
                    }
                    this.f69696G = this.f69723z;
                } else if (interfaceC12965o instanceof C12970t) {
                    if (AbstractC23309i.m121791cg()) {
                        Drawable drawable = this.f69694E;
                        if (drawable == null) {
                            if (!TextUtils.isEmpty(AbstractC23309i.m122575xd())) {
                                JSONObject jSONObject = new JSONObject(AbstractC23309i.m122575xd());
                                long j12 = 0;
                                if (jSONObject.has("expire_from")) {
                                    j11 = jSONObject.optLong("expire_from");
                                } else {
                                    j11 = 0;
                                }
                                if (jSONObject.has("expire_to")) {
                                    j12 = jSONObject.optLong("expire_to");
                                }
                                if (j11 <= System.currentTimeMillis() && System.currentTimeMillis() <= j12 && jSONObject.has(ZMediaPlayer.OnNativeInvokeListener.ARG_URL)) {
                                    if (AbstractC23309i.m121182M1()) {
                                        C13535b c13535b = new C13535b(jSONObject);
                                        if (!TextUtils.isEmpty(AbstractC23309i.m122538wd())) {
                                            m75913h(AbstractC23309i.m122538wd(), true, true, c13535b, true);
                                        } else {
                                            Drawable m139660c = C27280g.m139660c(context, AbstractC23322a.zds_ic_fire_line_24, AbstractC2807a.icon_02);
                                            this.f69694E = m139660c;
                                            m75915j(m139660c, -1, c13535b);
                                        }
                                    } else if (AbstractC23309i.m122077k0()) {
                                        if (!TextUtils.isEmpty(AbstractC23309i.m122538wd())) {
                                            m75913h(AbstractC23309i.m122538wd(), true, false, null, true);
                                        } else {
                                            this.f69694E = C27280g.m139660c(context, AbstractC23322a.zds_ic_fire_line_24, AbstractC2807a.icon_02);
                                        }
                                    } else {
                                        m75913h(jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL), false, false, null, true);
                                    }
                                } else {
                                    AbstractC23309i.m121570Wj(false);
                                    AbstractC23309i.m122395si(true);
                                    if (!TextUtils.isEmpty(AbstractC23309i.m122538wd())) {
                                        m75913h(AbstractC23309i.m122538wd(), true, false, null, true);
                                    } else {
                                        this.f69694E = C27280g.m139660c(context, AbstractC23322a.zds_ic_fire_line_24, AbstractC2807a.icon_02);
                                    }
                                }
                            } else if (!TextUtils.isEmpty(AbstractC23309i.m122538wd())) {
                                m75913h(AbstractC23309i.m122538wd(), true, false, null, true);
                            } else {
                                this.f69694E = C27280g.m139660c(context, AbstractC23322a.zds_ic_fire_line_24, AbstractC2807a.icon_02);
                            }
                            requestLayout();
                        }
                        this.f69696G = drawable;
                        int i12 = this.f69702M;
                        int i13 = this.f69703N;
                        int i14 = this.f69714q;
                        invalidate(i12, i13, i12 + i14, i14 + i13);
                    }
                } else if (interfaceC12965o instanceof C12961k) {
                    if (this.f69721x == null) {
                        this.f69721x = C27280g.m139660c(context, AbstractC23322a.zds_ic_gif_line_24, AbstractC2807a.icon_02);
                    }
                    this.f69696G = this.f69721x;
                }
            }
            ValueAnimator valueAnimator = this.f69712W;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f69712W.cancel();
                this.f69712W = null;
            }
            requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.StickerIndicatorView$e */
    /* loaded from: classes6.dex */
    public static class C13538e implements Serializable {

        /* renamed from: p */
        public float f69734p;

        /* renamed from: q */
        public int f69735q;

        /* renamed from: r */
        public int f69736r;

        /* renamed from: s */
        public int f69737s;

        public C13538e() {
            this.f69734p = 1.0f;
            this.f69735q = AbstractC16803z.sticker_indicator_trans_bg_black_highlight;
            this.f69736r = AbstractC23136l9.m118742r(30.0f);
            this.f69737s = 0;
        }

        public C13538e(float f11, int i11, int i12, int i13) {
            this.f69734p = 1.0f;
            this.f69735q = AbstractC16803z.sticker_indicator_trans_bg_black_highlight;
            AbstractC23136l9.m118742r(30.0f);
            this.f69734p = f11;
            this.f69735q = i11;
            this.f69736r = i12;
            this.f69737s = i13;
        }
    }

    public StickerIndicatorView(Context context, C13538e c13538e) {
        super(context);
        int m118742r = AbstractC23136l9.m118742r(30.0f);
        this.f69713p = m118742r;
        this.f69714q = m118742r;
        this.f69715r = AbstractC23136l9.m118742r(30.0f);
        this.f69716s = AbstractC23136l9.m118742r(48.0f);
        this.f69717t = AbstractC23136l9.m118742r(48.0f);
        this.f69712W = null;
        m75910d(context, c13538e);
    }
}
