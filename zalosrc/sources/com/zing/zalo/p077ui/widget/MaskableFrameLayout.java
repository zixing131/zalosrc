package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC8923h0;
import com.zing.zalo.zinstant.zom.node.ZOM;
import p193h0.AbstractC19694b;

/* loaded from: classes6.dex */
public class MaskableFrameLayout extends FrameLayout {

    /* renamed from: p */
    private Handler f69369p;

    /* renamed from: q */
    private Drawable f69370q;

    /* renamed from: r */
    private Bitmap f69371r;

    /* renamed from: s */
    private Paint f69372s;

    /* renamed from: t */
    private PorterDuffXfermode f69373t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.MaskableFrameLayout$a */
    /* loaded from: classes6.dex */
    public class ViewTreeObserverOnGlobalLayoutListenerC13510a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: p */
        final /* synthetic */ ViewTreeObserver f69374p;

        ViewTreeObserverOnGlobalLayoutListenerC13510a(ViewTreeObserver viewTreeObserver) {
            this.f69374p = viewTreeObserver;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = this.f69374p;
            if (!viewTreeObserver.isAlive()) {
                viewTreeObserver = MaskableFrameLayout.this.getViewTreeObserver();
            }
            if (viewTreeObserver == null) {
                MaskableFrameLayout.this.m75782j("GlobalLayoutListener not removed as ViewTreeObserver is not valid");
            } else {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            MaskableFrameLayout maskableFrameLayout = MaskableFrameLayout.this;
            maskableFrameLayout.m75786n(maskableFrameLayout.m75783k(maskableFrameLayout.f69370q));
        }
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69370q = null;
        this.f69371r = null;
        this.f69372s = null;
        this.f69373t = null;
        m75777e(context, attributeSet);
    }

    /* renamed from: e */
    private void m75777e(Context context, AttributeSet attributeSet) {
        this.f69369p = new Handler();
        setDrawingCacheEnabled(true);
        setLayerType(1, null);
        this.f69372s = m75778f(false);
        Resources.Theme theme = context.getTheme();
        if (theme != null) {
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, AbstractC8923h0.MaskableLayout, 0, 0);
            try {
                m75780h(m75781i(obtainStyledAttributes));
                this.f69373t = m75779g(obtainStyledAttributes.getInteger(AbstractC8923h0.MaskableLayout_porterduffxfermode, 0));
                m75780h(this.f69370q);
                if (obtainStyledAttributes.getBoolean(AbstractC8923h0.MaskableLayout_anti_aliasing, false)) {
                    this.f69372s = m75778f(true);
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                if (obtainStyledAttributes != null) {
                    obtainStyledAttributes.recycle();
                }
                throw th2;
            }
        } else {
            m75782j("Couldn't load theme, mask in xml won't be loaded.");
        }
        m75784l();
    }

    /* renamed from: f */
    private Paint m75778f(boolean z11) {
        Paint paint = new Paint(1);
        paint.setAntiAlias(z11);
        paint.setXfermode(this.f69373t);
        return paint;
    }

    /* renamed from: g */
    private PorterDuffXfermode m75779g(int i11) {
        PorterDuff.Mode mode;
        switch (i11) {
            case 0:
                PorterDuff.Mode mode2 = PorterDuff.Mode.ADD;
            case 1:
                mode = PorterDuff.Mode.CLEAR;
                break;
            case 2:
                mode = PorterDuff.Mode.DARKEN;
                break;
            case 3:
                mode = PorterDuff.Mode.DST;
                break;
            case 4:
                mode = PorterDuff.Mode.DST_ATOP;
                break;
            case 5:
                mode = PorterDuff.Mode.DST_IN;
                break;
            case 6:
                mode = PorterDuff.Mode.DST_OUT;
                break;
            case 7:
                mode = PorterDuff.Mode.DST_OVER;
                break;
            case 8:
                mode = PorterDuff.Mode.LIGHTEN;
                break;
            case 9:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 10:
                PorterDuff.Mode mode3 = PorterDuff.Mode.OVERLAY;
            case 11:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case 12:
                mode = PorterDuff.Mode.SRC;
                break;
            case 13:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case 14:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 15:
                mode = PorterDuff.Mode.SRC_OUT;
                break;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 17:
                mode = PorterDuff.Mode.XOR;
                break;
            default:
                mode = PorterDuff.Mode.DST_IN;
                break;
        }
        m75782j("Mode is " + mode.toString());
        return new PorterDuffXfermode(mode);
    }

    /* renamed from: h */
    private void m75780h(Drawable drawable) {
        if (drawable != null) {
            this.f69370q = drawable;
            if (drawable instanceof AnimationDrawable) {
                drawable.setCallback(this);
                return;
            }
            return;
        }
        m75782j("Are you sure you don't want to provide a mask ?");
    }

    /* renamed from: i */
    private Drawable m75781i(TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(AbstractC8923h0.MaskableLayout_mask, -1);
        if (resourceId == -1) {
            return null;
        }
        return AbstractC19694b.m103336d(getContext(), resourceId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m75782j(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public Bitmap m75783k(Drawable drawable) {
        if (drawable != null) {
            if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return createBitmap;
            }
            m75782j("Can't create a mask with height 0 or width 0. Or the layout has no children and is wrap content");
            return null;
        }
        m75782j("No bitmap mask loaded, view will NOT be masked !");
        return null;
    }

    /* renamed from: l */
    private void m75784l() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC13510a(viewTreeObserver));
        }
    }

    /* renamed from: m */
    private void m75785m(int i11, int i12) {
        if (i11 > 0 && i12 > 0) {
            Drawable drawable = this.f69370q;
            if (drawable != null) {
                m75786n(m75783k(drawable));
                return;
            }
            return;
        }
        m75782j("Width and height must be higher than 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m75786n(Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmap2 = this.f69371r;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.f69371r.recycle();
            }
            this.f69371r = bitmap;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        if (this.f69371r != null && (paint = this.f69372s) != null) {
            paint.setXfermode(this.f69373t);
            canvas.drawBitmap(this.f69371r, 0.0f, 0.0f, this.f69372s);
            this.f69372s.setXfermode(null);
            return;
        }
        m75782j("Mask or paint is null ...");
    }

    public Drawable getDrawableMask() {
        return this.f69370q;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (drawable != null) {
            m75780h(drawable);
            m75786n(m75783k(drawable));
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        m75785m(i11, i12);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        if (drawable != null && runnable != null) {
            this.f69369p.postAtTime(runnable, j11);
        }
    }

    public void setMask(int i11) {
        Resources resources = getResources();
        if (resources != null) {
            setMask(resources.getDrawable(i11));
        } else {
            m75782j("Unable to load resources, mask will not be loaded as drawable");
        }
    }

    public void setPorterDuffXferMode(PorterDuff.Mode mode) {
        this.f69373t = new PorterDuffXfermode(mode);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != null && runnable != null) {
            this.f69369p.removeCallbacks(runnable);
        }
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f69370q = null;
        this.f69371r = null;
        this.f69372s = null;
        this.f69373t = null;
        m75777e(context, attributeSet);
    }

    public void setMask(Drawable drawable) {
        m75780h(drawable);
        m75786n(m75783k(this.f69370q));
        invalidate();
    }
}
