package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewTreeObserver;
import androidx.core.widget.AbstractC1635g;
import com.zing.zalo.zlottie.widget.C17291a;
import mm0.AbstractC23350e;
import p193h0.AbstractC19694b;
import t30.AbstractC26474a;

/* loaded from: classes.dex */
public class ZAppCompatImageView extends AppCompatImageView {
    private static final String RESOURCE_TYPE_RAW = "raw";
    private static final String ZALO_LOTTIE_EXTENSION = ".zls";
    private final ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    private int mPendingLottieResId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ZAppCompatImageView$a */
    /* loaded from: classes.dex */
    public class ViewTreeObserverOnGlobalLayoutListenerC1148a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC1148a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ZAppCompatImageView.this.mPendingLottieResId != 0 && ZAppCompatImageView.this.getMeasuredWidth() > 0 && ZAppCompatImageView.this.getMeasuredHeight() > 0) {
                ZAppCompatImageView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ZAppCompatImageView zAppCompatImageView = ZAppCompatImageView.this;
                zAppCompatImageView.setImageDrawable(C1156b2.m5498a(zAppCompatImageView.mPendingLottieResId, ZAppCompatImageView.this.getMeasuredWidth(), ZAppCompatImageView.this.getMeasuredHeight()));
            } else if (ZAppCompatImageView.this.mPendingLottieResId == 0) {
                ZAppCompatImageView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    public ZAppCompatImageView(Context context) {
        this(context, null);
    }

    /* renamed from: f */
    private void m5446f(Context context, C1211t1 c1211t1) {
        int m5730n = c1211t1.m5730n(AbstractC26474a.ZAppCompatImageView_srcCompatEx, -1);
        if (m5730n == -1) {
            return;
        }
        Drawable m5502a = AbstractC1160c2.m5502a(context, m5730n, context.getTheme());
        if (m5502a == null) {
            m5502a = AbstractC19694b.m103336d(context, m5730n);
        }
        if (m5502a != null) {
            setImageDrawable(m5502a);
        } else if (m5448h(m5730n)) {
            m5447g(m5730n);
        }
    }

    /* renamed from: g */
    private void m5447g(int i11) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            if (getContext() != null) {
                setImageDrawable(C1156b2.m5498a(i11, measuredWidth, measuredHeight));
            }
        } else {
            this.mPendingLottieResId = i11;
            getViewTreeObserver().removeOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
            getViewTreeObserver().addOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
        }
    }

    /* renamed from: h */
    private boolean m5448h(int i11) {
        CharSequence charSequence;
        try {
            TypedValue typedValue = new TypedValue();
            getResources().getValue(i11, typedValue, true);
            if (!RESOURCE_TYPE_RAW.equals(getResources().getResourceTypeName(i11)) || (charSequence = typedValue.string) == null) {
                return false;
            }
            if (!charSequence.toString().endsWith(ZALO_LOTTIE_EXTENSION)) {
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = getDrawable();
        if (drawable instanceof C17291a) {
            C17291a c17291a = (C17291a) drawable;
            c17291a.setCallback(this);
            c17291a.start();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = getDrawable();
        if (drawable instanceof C17291a) {
            ((C17291a) drawable).stop();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @SuppressLint({"RestrictedApi"})
    public void setImageDrawable(Drawable drawable) {
        if (drawable instanceof C17291a) {
            drawable.setCallback(this);
            ((C17291a) drawable).start();
        }
        super.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC1225y0.m5770b(drawable);
        }
        this.mPendingLottieResId = 0;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        if (!m5448h(i11)) {
            super.setImageResource(i11);
        } else {
            m5447g(i11);
        }
    }

    public ZAppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"RestrictedApi"})
    public ZAppCompatImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mPendingLottieResId = 0;
        this.mOnGlobalLayoutListener = new ViewTreeObserverOnGlobalLayoutListenerC1148a();
        if (attributeSet == null) {
            return;
        }
        C1211t1 m5716v = C1211t1.m5716v(context, attributeSet, AbstractC26474a.ZAppCompatImageView, i11, 0);
        try {
            int m5730n = m5716v.m5730n(AbstractC26474a.ZAppCompatImageView_srcCompat, -1);
            if (m5730n != -1) {
                AbstractC23350e.m122782l("ZAppCompatImageView", "`srcCompat`: %d - must migrate to `srcCompatExt`", Integer.valueOf(m5730n));
            }
            if (getDrawable() == null) {
                m5446f(context, m5716v);
            }
            if (m5716v.m5735s(AbstractC26474a.ZAppCompatImageView_tint)) {
                AbstractC1635g.m8391c(this, m5716v.m5719c(AbstractC26474a.ZAppCompatImageView_tint));
            }
            if (m5716v.m5735s(AbstractC26474a.ZAppCompatImageView_tintMode)) {
                AbstractC1635g.m8392d(this, AbstractC1225y0.m5773e(m5716v.m5727k(AbstractC26474a.ZAppCompatImageView_tintMode, -1), null));
            }
            m5716v.m5736w();
        } catch (Throwable th2) {
            m5716v.m5736w();
            throw th2;
        }
    }
}
