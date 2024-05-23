package bn;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import bn.C2876h0;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.widget.C13637g0;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.svg.C16654c;
import com.zing.zalo.uicontrol.svg.EmojiImageView;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;
import p405ov.C24559a;
import p588vw.C28652r;

/* renamed from: bn.h0 */
/* loaded from: classes3.dex */
public class C2876h0 extends KeyEventCallbackC17462c {

    /* renamed from: I */
    private Object f11453I;

    /* renamed from: J */
    private View f11454J;

    /* renamed from: K */
    private final String f11455K;

    /* renamed from: L */
    private final Object f11456L;

    /* renamed from: M */
    private float f11457M;

    /* renamed from: N */
    private float f11458N;

    /* renamed from: O */
    private float f11459O;

    /* renamed from: P */
    private float f11460P;

    /* renamed from: Q */
    private int f11461Q;

    /* renamed from: R */
    private final int f11462R;

    /* renamed from: S */
    private final int f11463S;

    /* renamed from: T */
    private ValueAnimator f11464T;

    /* renamed from: bn.h0$a */
    /* loaded from: classes3.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                if (C2876h0.this.f11454J.getWidth() > 0 && C2876h0.this.f11454J.getHeight() > 0) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C2876h0.this.f11454J.getLayoutParams();
                    int width = C2876h0.this.f11462R - (C2876h0.this.f11454J.getWidth() / 2);
                    int m118737p0 = (C2876h0.this.f11463S - AbstractC23136l9.m118737p0()) - (C2876h0.this.f11454J.getHeight() / 2);
                    if (C2876h0.this.f11454J.getHeight() + m118737p0 > AbstractC23136l9.m118713h0() - AbstractC23136l9.m118737p0()) {
                        C2876h0.this.f11454J.setTranslationY((m118737p0 + C2876h0.this.f11454J.getHeight()) - (AbstractC23136l9.m118713h0() - AbstractC23136l9.m118737p0()));
                        m118737p0 = (AbstractC23136l9.m118713h0() - AbstractC23136l9.m118737p0()) - C2876h0.this.f11454J.getHeight();
                    }
                    layoutParams.setMargins(width, m118737p0, 0, 0);
                    C2876h0.this.f11454J.setLayoutParams(layoutParams);
                    C2876h0.this.f11454J.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bn.h0$b */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m13826b() {
            C2876h0.this.dismiss();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            new Handler().postDelayed(new Runnable() { // from class: bn.i0
                @Override // java.lang.Runnable
                public final void run() {
                    C2876h0.b.this.m13826b();
                }
            }, 300L);
        }
    }

    public C2876h0(Context context, String str, int i11, int i12) {
        this(context, AbstractC8915g0.Dialog_Fullscreen, str, i11, i12);
    }

    /* renamed from: P */
    static boolean m13819P(Bitmap bitmap) {
        for (int i11 = 0; i11 < bitmap.getWidth(); i11 += 10) {
            for (int i12 = 0; i12 < bitmap.getHeight(); i12 += 10) {
                if (bitmap.getPixel(i11, i12) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: S */
    public static boolean m13820S(String str) {
        StaticLayout staticLayout;
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment;
        StaticLayout.Builder includePad;
        StaticLayout.Builder breakStrategy;
        int m122203nb = AbstractC23309i.m122203nb();
        if (m122203nb == -1) {
            return true;
        }
        if (m122203nb == -2) {
            return false;
        }
        try {
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.setTypeface(Typeface.DEFAULT);
            c13704p1.setColor(-16777216);
            int m118742r = AbstractC23136l9.m118742r(15.0f) * 6;
            c13704p1.setTextSize(m118742r);
            if (Build.VERSION.SDK_INT >= 24) {
                obtain = StaticLayout.Builder.obtain(str, 0, str.length(), c13704p1, m118742r);
                lineSpacing = obtain.setLineSpacing(0.0f, 1.0f);
                alignment = lineSpacing.setAlignment(Layout.Alignment.ALIGN_NORMAL);
                includePad = alignment.setIncludePad(false);
                breakStrategy = includePad.setBreakStrategy(1);
                staticLayout = breakStrategy.build();
            } else {
                staticLayout = new StaticLayout(str, c13704p1, m118742r, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            int height = staticLayout.getHeight();
            if (m118742r <= 500 && height <= 500) {
                Bitmap createBitmap = Bitmap.createBitmap(m118742r, height, Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(0);
                staticLayout.draw(new Canvas(createBitmap));
                if (m13819P(createBitmap)) {
                    AbstractC23309i.m122261ow(-1);
                    return true;
                }
                AbstractC23309i.m122261ow(-2);
                return false;
            }
            C24559a.m127933c("EmojiPreviewDialog", "error size: " + m118742r + " - " + height);
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m13821T(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f11460P = floatValue;
        this.f11461Q = (int) ((floatValue / this.f11459O) * 100.0f);
        if (this.f11456L != null) {
            ((EmojiImageView) this.f11453I).setScale(floatValue);
            ((EmojiImageView) this.f11453I).invalidate();
            return;
        }
        if (this.f11462R - ((this.f11454J.getWidth() * this.f11460P) / 2.0f) < 0.0f) {
            this.f11454J.setTranslationX(((r6.getWidth() * this.f11460P) / 2.0f) - this.f11462R);
        }
        if (this.f11462R + ((this.f11454J.getWidth() * this.f11460P) / 2.0f) > AbstractC23136l9.m118722k0()) {
            this.f11454J.setTranslationX(AbstractC23136l9.m118722k0() - (this.f11462R + ((this.f11454J.getWidth() * this.f11460P) / 2.0f)));
        }
        this.f11454J.setScaleX(this.f11460P);
        this.f11454J.setScaleY(this.f11460P);
    }

    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: K */
    public void mo13822K() {
        super.mo13822K();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f11458N, this.f11457M);
        this.f11464T = ofFloat;
        ofFloat.setDuration(1500L);
        this.f11464T.setInterpolator(new DecelerateInterpolator());
        this.f11464T.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bn.g0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2876h0.this.m13821T(valueAnimator);
            }
        });
        this.f11464T.addListener(new b());
        this.f11464T.start();
    }

    /* renamed from: Q */
    public String m13823Q() {
        return this.f11455K;
    }

    /* renamed from: R */
    public int m13824R() {
        return this.f11461Q;
    }

    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c, com.zing.zalo.zview.dialog.InterfaceC17463d
    public void dismiss() {
        ValueAnimator valueAnimator = this.f11464T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: p */
    public void mo13765p(Bundle bundle) {
        super.mo13765p(bundle);
        m92870v(1);
        m92867k().m92890I(1);
        m92867k().m92895b(131072);
        m92867k().m92895b(256);
        m92867k().m92897d(2);
        m92867k().m92889H(-1, -1);
        try {
            m92850A(AbstractC7409c0.preview_emoji_view);
            this.f11453I = m92864h(AbstractC6918a0.image);
            RecyclingImageView recyclingImageView = (RecyclingImageView) m92864h(AbstractC6918a0.previewEmoticon);
            RobotoTextView robotoTextView = (RobotoTextView) m92864h(AbstractC6918a0.emojiSystemView);
            if (this.f11456L != null) {
                recyclingImageView.setVisibility(8);
                robotoTextView.setVisibility(8);
                ((EmojiImageView) this.f11453I).setVisibility(0);
                ((EmojiImageView) this.f11453I).m88436a(this.f11462R, this.f11463S - AbstractC23136l9.m118737p0());
                float m88437b = ((EmojiImageView) this.f11453I).m88437b((C16654c) this.f11456L);
                this.f11458N = AbstractC23136l9.m118742r(27.0f) / m88437b;
                this.f11457M = AbstractC23136l9.m118742r(240.0f) / m88437b;
                this.f11459O = AbstractC23136l9.m118742r(15.0f) / m88437b;
                ((EmojiImageView) this.f11453I).setScale(this.f11458N);
                ((EmojiImageView) this.f11453I).invalidate();
                return;
            }
            ((EmojiImageView) this.f11453I).setVisibility(8);
            C13637g0 m143375n = C28652r.m143349v().m143375n(this.f11455K, 27);
            if (m143375n != null) {
                this.f11454J = recyclingImageView;
                robotoTextView.setVisibility(8);
                recyclingImageView.setImageDrawable(m143375n);
                float m118742r = AbstractC23136l9.m118742r(18.0f) / AbstractC23136l9.m118742r(27.0f);
                this.f11459O = m118742r;
                this.f11458N = 1.0f;
                this.f11457M = m118742r * 6.0f;
            } else {
                this.f11454J = robotoTextView;
                recyclingImageView.setVisibility(8);
                robotoTextView.setTextSize(1, 15.0f);
                robotoTextView.setText(this.f11455K);
                this.f11459O = 1.0f;
                this.f11458N = AbstractC23136l9.m118742r(27.0f) / AbstractC23136l9.m118742r(15.0f);
                this.f11457M = this.f11459O * 6.0f;
                if (!m13820S(this.f11455K)) {
                    this.f11457M = this.f11459O * 3.0f;
                }
            }
            this.f11454J.setVisibility(0);
            this.f11454J.getViewTreeObserver().addOnGlobalLayoutListener(new a());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C2876h0(Context context, int i11, String str, int i12, int i13) {
        super(context, i11);
        this.f11462R = i12;
        this.f11463S = i13;
        this.f11455K = str;
        this.f11456L = C28652r.m143349v().m143376o(str);
    }
}
