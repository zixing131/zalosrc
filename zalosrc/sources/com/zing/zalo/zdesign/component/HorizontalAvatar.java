package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.AbstractC1640l;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import bi0.AbstractC2815i;
import bi0.AbstractC2816j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.avatar.AbstractC16946b;
import com.zing.zalo.zdesign.component.avatar.BaseAvatar;
import com.zing.zalo.zdesign.component.avatar.C16948d;
import ei0.C18438c;
import ei0.InterfaceC18436a;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import ln0.AbstractC22543l;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ri0.C25808b;
import ti0.C26702a;
import ti0.C26706e;
import ui0.C27274a;
import ui0.C27275b;
import ui0.C27276c;
import ui0.C27280g;

/* loaded from: classes7.dex */
public final class HorizontalAvatar extends BaseAvatar implements InterfaceC16976f1 {

    /* renamed from: A */
    private AbstractC16946b[] f86285A;

    /* renamed from: B */
    private Drawable[] f86286B;

    /* renamed from: C */
    private int f86287C;

    /* renamed from: D */
    private int f86288D;

    /* renamed from: E */
    private GradientDrawable f86289E;

    /* renamed from: F */
    private StaticLayout f86290F;

    /* renamed from: G */
    private C26702a f86291G;

    /* renamed from: H */
    private final Rect f86292H;

    /* renamed from: I */
    private Drawable f86293I;

    /* renamed from: J */
    private boolean f86294J;

    /* renamed from: K */
    private final AbstractC16946b.a f86295K;

    /* renamed from: L */
    private final InterfaceC24854k f86296L;

    /* renamed from: r */
    private C25808b f86297r;

    /* renamed from: s */
    private int f86298s;

    /* renamed from: t */
    private int f86299t;

    /* renamed from: u */
    private int f86300u;

    /* renamed from: v */
    private int f86301v;

    /* renamed from: w */
    private int f86302w;

    /* renamed from: x */
    private int f86303x;

    /* renamed from: y */
    private Paint f86304y;

    /* renamed from: z */
    private ArrayList f86305z;

    /* renamed from: com.zing.zalo.zdesign.component.HorizontalAvatar$a */
    /* loaded from: classes7.dex */
    public static final class C16916a implements AbstractC16946b.a {
        C16916a() {
        }

        @Override // com.zing.zalo.zdesign.component.avatar.AbstractC16946b.a
        /* renamed from: a */
        public void mo90484a(AbstractC16946b abstractC16946b) {
            Drawable drawable;
            AbstractC16946b[] abstractC16946bArr = HorizontalAvatar.this.f86285A;
            if (abstractC16946bArr == null) {
                AbstractC19074t.m100223u("avatarItemHolderArray");
                abstractC16946bArr = null;
            }
            int length = abstractC16946bArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                AbstractC16946b[] abstractC16946bArr2 = HorizontalAvatar.this.f86285A;
                if (abstractC16946bArr2 == null) {
                    AbstractC19074t.m100223u("avatarItemHolderArray");
                    abstractC16946bArr2 = null;
                }
                AbstractC16946b abstractC16946b2 = abstractC16946bArr2[i11];
                if (abstractC16946b2 != null) {
                    drawable = abstractC16946b2.m90768a();
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    Drawable[] drawableArr = HorizontalAvatar.this.f86286B;
                    if (drawableArr == null) {
                        AbstractC19074t.m100223u("bitmapAvtArray");
                        drawableArr = null;
                    }
                    AbstractC16946b[] abstractC16946bArr3 = HorizontalAvatar.this.f86285A;
                    if (abstractC16946bArr3 == null) {
                        AbstractC19074t.m100223u("avatarItemHolderArray");
                        abstractC16946bArr3 = null;
                    }
                    AbstractC16946b abstractC16946b3 = abstractC16946bArr3[i11];
                    AbstractC19074t.m100205c(abstractC16946b3);
                    drawableArr[i11] = abstractC16946b3.m90768a();
                }
            }
            HorizontalAvatar.this.postInvalidate();
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.HorizontalAvatar$b */
    /* loaded from: classes7.dex */
    static final class C16917b extends AbstractC19075u implements InterfaceC18494a {
        C16917b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC18436a mo12V4() {
            C18438c c18438c = C18438c.f92957a;
            Context context = HorizontalAvatar.this.getContext();
            AbstractC19074t.m100207e(context, "context");
            return c18438c.m97715a(context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        InterfaceC24854k m129210a;
        int m139648a;
        int m139649b;
        int m13592a;
        AbstractC19074t.m100208f(context, "context");
        this.f86299t = 4;
        this.f86300u = 4;
        this.f86302w = -1;
        this.f86305z = new ArrayList();
        this.f86292H = new Rect();
        this.f86295K = new C16916a();
        m129210a = AbstractC24856m.m129210a(new C16917b());
        this.f86296L = m129210a;
        this.f86297r = new C25808b(new WeakReference(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2815i.HorizontalAvatar);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…yleable.HorizontalAvatar)");
        if (obtainStyledAttributes.hasValue(AbstractC2815i.HorizontalAvatar_hrav_avatarSize)) {
            m139648a = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.HorizontalAvatar_hrav_avatarSize, this.f86298s);
        } else {
            m139648a = C27276c.m139648a(context, 24.0f);
        }
        this.f86298s = m139648a;
        this.f86303x = C27276c.m139649b(context, 2);
        this.f86299t = obtainStyledAttributes.getInteger(AbstractC2815i.HorizontalAvatar_hrav_maxAvatarShow, this.f86299t);
        this.f86303x = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.HorizontalAvatar_hrav_strokeWidth, this.f86303x);
        if (obtainStyledAttributes.hasValue(AbstractC2815i.HorizontalAvatar_hrav_overlap)) {
            m139649b = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.HorizontalAvatar_hrav_overlap, this.f86301v);
        } else {
            m139649b = C27276c.m139649b(context, 8);
        }
        this.f86301v = m139649b;
        if (obtainStyledAttributes.hasValue(AbstractC2815i.HorizontalAvatar_hrav_strokeColor)) {
            m13592a = obtainStyledAttributes.getColor(AbstractC2815i.HorizontalAvatar_hrav_strokeColor, this.f86302w);
        } else {
            m13592a = AbstractC2816j.Companion.m13592a(context, AbstractC2807a.avatar_border);
        }
        this.f86302w = m13592a;
        String string = obtainStyledAttributes.getString(AbstractC2815i.HorizontalAvatar_trackingId);
        if (string != null && string.length() != 0) {
            setIdTracking(string);
        }
        obtainStyledAttributes.recycle();
        int i11 = this.f86299t;
        AbstractC16946b[] abstractC16946bArr = new AbstractC16946b[i11];
        this.f86285A = abstractC16946bArr;
        int length = abstractC16946bArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            AbstractC16946b[] abstractC16946bArr2 = this.f86285A;
            if (abstractC16946bArr2 == null) {
                AbstractC19074t.m100223u("avatarItemHolderArray");
                abstractC16946bArr2 = null;
            }
            abstractC16946bArr2[i12] = getHorizontalAvatarBusiness().mo88231b(context, this.f86295K, this);
        }
        this.f86286B = new Drawable[i11];
        C26702a c26702a = new C26702a(context, 1);
        this.f86291G = c26702a;
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        c26702a.setColor(aVar.m13592a(context, AbstractC2807a.text_02));
        this.f86291G.m137272b();
        RobotoTextView robotoTextView = new RobotoTextView(context);
        AbstractC1640l.m8424o(robotoTextView, AbstractC2814h.avatar_text_xsmall);
        this.f86291G.m137273c(robotoTextView.getTextSize(), false);
        Paint paint = new Paint(1);
        this.f86304y = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f86304y.setStrokeWidth(this.f86303x);
        this.f86304y.setColor(this.f86302w);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f86289E = gradientDrawable;
        gradientDrawable.setShape(1);
        this.f86289E.setColor(aVar.m13592a(context, AbstractC2807a.avatar_counter_background));
        this.f86293I = C27280g.m139658a(context, AbstractC2810d.default_avatar);
    }

    /* renamed from: c */
    private final void m90577c(String str, int i11) {
        AbstractC16946b[] abstractC16946bArr = this.f86285A;
        AbstractC16946b[] abstractC16946bArr2 = null;
        if (abstractC16946bArr == null) {
            AbstractC19074t.m100223u("avatarItemHolderArray");
            abstractC16946bArr = null;
        }
        if (abstractC16946bArr[i11] != null) {
            if (this.f86294J) {
                AbstractC16946b[] abstractC16946bArr3 = this.f86285A;
                if (abstractC16946bArr3 == null) {
                    AbstractC19074t.m100223u("avatarItemHolderArray");
                    abstractC16946bArr3 = null;
                }
                AbstractC16946b abstractC16946b = abstractC16946bArr3[i11];
                AbstractC19074t.m100205c(abstractC16946b);
                if (!abstractC16946b.mo88234e(str)) {
                    return;
                }
            }
            AbstractC16946b[] abstractC16946bArr4 = this.f86285A;
            if (abstractC16946bArr4 == null) {
                AbstractC19074t.m100223u("avatarItemHolderArray");
            } else {
                abstractC16946bArr2 = abstractC16946bArr4;
            }
            AbstractC16946b abstractC16946b2 = abstractC16946bArr2[i11];
            AbstractC19074t.m100205c(abstractC16946b2);
            abstractC16946b2.mo88235f(str, true, this.f86294J);
        }
    }

    private final InterfaceC18436a getHorizontalAvatarBusiness() {
        return (InterfaceC18436a) this.f86296L.getValue();
    }

    /* renamed from: d */
    public final void m90578d(List list, int i11) {
        int m116584g;
        String str;
        String str2;
        char c11;
        String m139636d;
        this.f86305z.clear();
        ArrayList arrayList = this.f86305z;
        AbstractC19074t.m100205c(list);
        arrayList.addAll(list);
        m116584g = AbstractC22543l.m116584g(this.f86305z.size(), this.f86299t - 1);
        this.f86287C = m116584g;
        int i12 = i11 - m116584g;
        if (i12 > 0) {
            InterfaceC18505l formatAvatarMore = getFormatAvatarMore();
            C27274a c27274a = C27274a.f128311a;
            if (AbstractC19074t.m100204b(formatAvatarMore, c27274a.m139634b())) {
                m139636d = c27274a.m139636d(this.f86305z.size() - 3, getFormatAvatarMore());
            } else {
                m139636d = c27274a.m139636d(this.f86305z.size(), getFormatAvatarMore());
            }
            this.f86290F = new StaticLayout(m139636d, this.f86291G, this.f86298s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            this.f86290F = null;
        }
        this.f86288D = i12;
        try {
            Drawable[] drawableArr = this.f86286B;
            if (drawableArr == null) {
                AbstractC19074t.m100223u("bitmapAvtArray");
                drawableArr = null;
            }
            int length = drawableArr.length;
            for (int i13 = 0; i13 < length; i13++) {
                Drawable[] drawableArr2 = this.f86286B;
                if (drawableArr2 == null) {
                    AbstractC19074t.m100223u("bitmapAvtArray");
                    drawableArr2 = null;
                }
                drawableArr2[i13] = this.f86293I;
            }
            int size = this.f86305z.size();
            Drawable[] drawableArr3 = this.f86286B;
            if (drawableArr3 == null) {
                AbstractC19074t.m100223u("bitmapAvtArray");
                drawableArr3 = null;
            }
            int min = Math.min(size, drawableArr3.length);
            for (int i14 = 0; i14 < min; i14++) {
                AbstractC16946b[] abstractC16946bArr = this.f86285A;
                if (abstractC16946bArr == null) {
                    AbstractC19074t.m100223u("avatarItemHolderArray");
                    abstractC16946bArr = null;
                }
                AbstractC16946b abstractC16946b = abstractC16946bArr[i14];
                AbstractC19074t.m100205c(abstractC16946b);
                abstractC16946b.mo88237h();
                Object obj = this.f86305z.get(i14);
                AbstractC19074t.m100207e(obj, "listAvatar[i]");
                C16948d c16948d = (C16948d) obj;
                String m90775b = c16948d.m90775b();
                C18438c c18438c = C18438c.f92957a;
                Context context = getContext();
                AbstractC19074t.m100207e(context, "context");
                String mo88403b = c18438c.m97716b(context).mo88403b();
                if (TextUtils.isEmpty(m90775b)) {
                    str = null;
                    str2 = null;
                    c11 = 1;
                } else {
                    InterfaceC18436a horizontalAvatarBusiness = getHorizontalAvatarBusiness();
                    AbstractC19074t.m100205c(m90775b);
                    if (horizontalAvatarBusiness.mo88230a(m90775b) && !AbstractC19074t.m100204b(mo88403b, c16948d.m90777d())) {
                        str2 = c16948d.m90776c();
                        str = c16948d.m90777d();
                        c11 = 3;
                    } else {
                        str = null;
                        str2 = null;
                        c11 = 2;
                    }
                }
                if (c11 == 3 && str != null && str2 != null) {
                    C27275b.a m139640a = C27275b.f128316a.m139640a(str, false);
                    Drawable[] drawableArr4 = this.f86286B;
                    if (drawableArr4 == null) {
                        AbstractC19074t.m100223u("bitmapAvtArray");
                        drawableArr4 = null;
                    }
                    C26706e.b bVar = C26706e.Companion;
                    Context context2 = getContext();
                    AbstractC19074t.m100207e(context2, "context");
                    C26706e.e m137317a = bVar.m137317a(context2);
                    Context context3 = getContext();
                    AbstractC19074t.m100207e(context3, "context");
                    int m139647d = m139640a.m139647d(context3);
                    Context context4 = getContext();
                    AbstractC19074t.m100207e(context4, "context");
                    drawableArr4[i14] = m137317a.mo137299d(str2, m139647d, m139640a.m139646c(context4));
                } else if (c11 == 2) {
                    m90577c(m90775b, i14);
                } else {
                    Drawable[] drawableArr5 = this.f86286B;
                    if (drawableArr5 == null) {
                        AbstractC19074t.m100223u("bitmapAvtArray");
                        drawableArr5 = null;
                    }
                    drawableArr5[i14] = this.f86293I;
                }
                invalidate();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f86300u != i11) {
            this.f86300u = i11;
            requestLayout();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        int i11 = this.f86298s + (this.f86303x * 2);
        int i12 = this.f86287C;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            Drawable[] drawableArr = this.f86286B;
            Drawable[] drawableArr2 = null;
            if (drawableArr == null) {
                AbstractC19074t.m100223u("bitmapAvtArray");
                drawableArr = null;
            }
            if (drawableArr[i14] != null) {
                Rect rect = this.f86292H;
                int i15 = this.f86298s;
                rect.set(i13, 0, i13 + i15, i15);
                Drawable[] drawableArr3 = this.f86286B;
                if (drawableArr3 == null) {
                    AbstractC19074t.m100223u("bitmapAvtArray");
                    drawableArr3 = null;
                }
                Drawable drawable = drawableArr3[i14];
                AbstractC19074t.m100205c(drawable);
                drawable.setBounds(this.f86292H);
                Drawable[] drawableArr4 = this.f86286B;
                if (drawableArr4 == null) {
                    AbstractC19074t.m100223u("bitmapAvtArray");
                } else {
                    drawableArr2 = drawableArr4;
                }
                Drawable drawable2 = drawableArr2[i14];
                AbstractC19074t.m100205c(drawable2);
                drawable2.draw(canvas);
                if (this.f86303x > 0) {
                    canvas.save();
                    int i16 = this.f86303x;
                    canvas.translate(i13 - i16, 0 - i16);
                    float f11 = i11 / 2.0f;
                    canvas.drawCircle(f11, f11, (i11 - this.f86303x) / 2.0f, this.f86304y);
                    canvas.restore();
                }
                i13 = (i13 + this.f86298s) - this.f86301v;
            }
        }
        if (this.f86290F != null) {
            Rect rect2 = this.f86292H;
            int i17 = this.f86298s;
            rect2.set(i13, 0, i13 + i17, i17);
            this.f86289E.setBounds(this.f86292H);
            this.f86289E.draw(canvas);
            if (this.f86303x > 0) {
                canvas.save();
                int i18 = this.f86303x;
                canvas.translate(i13 - i18, 0 - i18);
                float f12 = (i11 - this.f86303x) / 2.0f;
                float f13 = i11 / 2.0f;
                canvas.drawCircle(f13, f13, f12, this.f86304y);
                canvas.restore();
            }
            canvas.save();
            int i19 = this.f86298s;
            StaticLayout staticLayout = this.f86290F;
            AbstractC19074t.m100205c(staticLayout);
            int width = i13 + ((i19 - staticLayout.getWidth()) / 2);
            int i21 = this.f86298s;
            AbstractC19074t.m100205c(this.f86290F);
            canvas.translate(width, (i21 - r1.getHeight()) / 2);
            StaticLayout staticLayout2 = this.f86290F;
            AbstractC19074t.m100205c(staticLayout2);
            staticLayout2.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int min = Math.min(this.f86300u, this.f86299t);
        int i13 = this.f86298s;
        setMeasuredDimension((i13 * min) - (this.f86301v * (min - 1)), i13);
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86297r;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C25808b c25808b = this.f86297r;
        if (c25808b == null || !c25808b.m133076e(onClickListener)) {
            super.setOnClickListener(onClickListener);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86297r;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }
}
