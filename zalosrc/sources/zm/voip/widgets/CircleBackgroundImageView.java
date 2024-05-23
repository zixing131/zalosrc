package zm.voip.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.res.AbstractC1401h;
import androidx.core.graphics.drawable.AbstractC1414a;
import bi0.AbstractC2808b;
import bp0.AbstractC3104p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import rc0.C25729b;
import rc0.InterfaceC25728a;

/* loaded from: classes7.dex */
public final class CircleBackgroundImageView extends AppCompatImageView implements InterfaceC25728a {

    /* renamed from: A */
    public static final C32480a f149919A = new C32480a(null);

    /* renamed from: p */
    private float f149920p;

    /* renamed from: q */
    private float f149921q;

    /* renamed from: r */
    private float f149922r;

    /* renamed from: s */
    private float f149923s;

    /* renamed from: t */
    private float f149924t;

    /* renamed from: u */
    private final C25729b f149925u;

    /* renamed from: v */
    private final Paint f149926v;

    /* renamed from: w */
    private final Paint f149927w;

    /* renamed from: x */
    private int f149928x;

    /* renamed from: y */
    private int f149929y;

    /* renamed from: z */
    private boolean f149930z;

    /* renamed from: zm.voip.widgets.CircleBackgroundImageView$a */
    /* loaded from: classes7.dex */
    public static final class C32480a {
        private C32480a() {
        }

        public /* synthetic */ C32480a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleBackgroundImageView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC19074t.m100208f(context, "context");
    }

    private final int getMSelectedBgColor() {
        return AbstractC1401h.m7080d(getResources(), AbstractC2808b.wht_a100, null);
    }

    /* renamed from: f */
    public final void m157292f(Drawable drawable, ColorStateList colorStateList) {
        if (drawable == null) {
            return;
        }
        if (colorStateList != null) {
            AbstractC1414a.m7197o(drawable, colorStateList);
        }
        setImageDrawable(drawable);
    }

    public final int getBorderWidth() {
        return this.f149929y;
    }

    public final boolean getHasBorder() {
        return this.f149930z;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        int i11;
        AbstractC19074t.m100208f(canvas, "canvas");
        Paint paint = this.f149926v;
        if (isSelected() && isEnabled()) {
            i11 = getMSelectedBgColor();
        } else {
            i11 = this.f149928x;
        }
        paint.setColor(i11);
        canvas.drawCircle(this.f149921q, this.f149922r, this.f149920p, this.f149926v);
        if (this.f149930z) {
            canvas.drawCircle(this.f149921q, this.f149922r, this.f149920p - (this.f149929y / 2), this.f149927w);
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.translate(this.f149923s, this.f149924t);
        getDrawable().draw(canvas);
        canvas.restoreToCount(saveCount);
        this.f149925u.m132815a(canvas, getWidth());
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        float m116583f;
        super.onSizeChanged(i11, i12, i13, i14);
        float f11 = i11;
        float f12 = i12;
        m116583f = AbstractC22543l.m116583f(f11, f12);
        float f13 = 2;
        this.f149920p = m116583f / f13;
        float f14 = f11 / f13;
        this.f149921q = f14;
        this.f149922r = f12 / f13;
        this.f149923s = f14 - (getDrawable().getIntrinsicWidth() / 2);
        this.f149924t = this.f149922r - (getDrawable().getIntrinsicHeight() / 2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        this.f149928x = i11;
    }

    public final void setBorderWidth(int i11) {
        this.f149929y = i11;
    }

    @Override // rc0.InterfaceC25728a
    public void setEnableNoti(boolean z11) {
        this.f149925u.setEnableNoti(z11);
    }

    public final void setHasBorder(boolean z11) {
        if (!z11) {
            this.f149929y = 0;
        }
        this.f149930z = z11;
    }

    public void setLeftRedDot(boolean z11) {
        this.f149925u.m132817c(z11);
    }

    @Override // rc0.InterfaceC25728a
    public void setRadiusNoti(int i11) {
        this.f149925u.setRadiusNoti(i11);
    }

    public void setRedDotColor(int i11) {
        this.f149925u.m132818d(i11);
    }

    @Override // rc0.InterfaceC25728a
    public void setRedDotMargin(int i11) {
        this.f149925u.setRedDotMargin(i11);
    }

    public void setRedDotMarginLeft(int i11) {
        this.f149925u.m132819e(i11);
    }

    public void setRedDotMarginTop(int i11) {
        this.f149925u.m132820f(i11);
    }

    public void setRightRedDot(boolean z11) {
        this.f149925u.m132821g(z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleBackgroundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    public /* synthetic */ CircleBackgroundImageView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleBackgroundImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f149925u = new C25729b(this);
        Paint paint = new Paint();
        this.f149926v = paint;
        Paint paint2 = new Paint();
        this.f149927w = paint2;
        this.f149928x = AbstractC1401h.m7080d(getResources(), AbstractC2808b.blk_a40, null);
        this.f149929y = AbstractC3104p.m15650a(1.5f);
        this.f149930z = true;
        paint.setColor(this.f149928x);
        paint.setStyle(Paint.Style.FILL);
        paint.setFlags(1);
        paint2.setColor(AbstractC1401h.m7080d(getResources(), AbstractC2808b.wht_a10, null));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.f149929y);
        paint2.setFlags(1);
    }
}
