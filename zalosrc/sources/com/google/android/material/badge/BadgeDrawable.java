package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1579n0;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.C6352s;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23581f;
import p357n6.AbstractC23584i;
import p357n6.AbstractC23585j;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p599w6.AbstractC28774c;
import p599w6.C28775d;
import p706z6.C31689h;

/* loaded from: classes3.dex */
public class BadgeDrawable extends Drawable implements C6352s.b {

    /* renamed from: F */
    private static final int f34837F = AbstractC23586k.Widget_MaterialComponents_Badge;

    /* renamed from: G */
    private static final int f34838G = AbstractC23577b.badgeStyle;

    /* renamed from: A */
    private float f34839A;

    /* renamed from: B */
    private float f34840B;

    /* renamed from: C */
    private float f34841C;

    /* renamed from: D */
    private WeakReference f34842D;

    /* renamed from: E */
    private WeakReference f34843E;

    /* renamed from: p */
    private final WeakReference f34844p;

    /* renamed from: q */
    private final C31689h f34845q;

    /* renamed from: r */
    private final C6352s f34846r;

    /* renamed from: s */
    private final Rect f34847s;

    /* renamed from: t */
    private final float f34848t;

    /* renamed from: u */
    private final float f34849u;

    /* renamed from: v */
    private final float f34850v;

    /* renamed from: w */
    private final SavedState f34851w;

    /* renamed from: x */
    private float f34852x;

    /* renamed from: y */
    private float f34853y;

    /* renamed from: z */
    private int f34854z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.badge.BadgeDrawable$a */
    /* loaded from: classes3.dex */
    public class RunnableC6235a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f34869p;

        /* renamed from: q */
        final /* synthetic */ FrameLayout f34870q;

        RunnableC6235a(View view, FrameLayout frameLayout) {
            this.f34869p = view;
            this.f34870q = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            BadgeDrawable.this.m31673F(this.f34869p, this.f34870q);
        }
    }

    private BadgeDrawable(Context context) {
        this.f34844p = new WeakReference(context);
        AbstractC6355v.m32634c(context);
        Resources resources = context.getResources();
        this.f34847s = new Rect();
        this.f34845q = new C31689h();
        this.f34848t = resources.getDimensionPixelSize(AbstractC23579d.mtrl_badge_radius);
        this.f34850v = resources.getDimensionPixelSize(AbstractC23579d.mtrl_badge_long_text_horizontal_padding);
        this.f34849u = resources.getDimensionPixelSize(AbstractC23579d.mtrl_badge_with_text_radius);
        C6352s c6352s = new C6352s(this);
        this.f34846r = c6352s;
        c6352s.m32625e().setTextAlign(Paint.Align.CENTER);
        this.f34851w = new SavedState(context);
        m31656A(AbstractC23586k.TextAppearance_MaterialComponents_Badge);
    }

    /* renamed from: A */
    private void m31656A(int i11) {
        Context context = (Context) this.f34844p.get();
        if (context == null) {
            return;
        }
        m31670z(new C28775d(context, i11));
    }

    /* renamed from: D */
    private void m31657D(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != AbstractC23581f.mtrl_anchor_parent) {
            WeakReference weakReference = this.f34843E;
            if (weakReference != null && weakReference.get() == viewGroup) {
                return;
            }
            m31658E(view);
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.setId(AbstractC23581f.mtrl_anchor_parent);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(view.getLayoutParams());
            frameLayout.setMinimumWidth(view.getWidth());
            frameLayout.setMinimumHeight(view.getHeight());
            int indexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeViewAt(indexOfChild);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(view);
            viewGroup.addView(frameLayout, indexOfChild);
            this.f34843E = new WeakReference(frameLayout);
            frameLayout.post(new RunnableC6235a(view, frameLayout));
        }
    }

    /* renamed from: E */
    private static void m31658E(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* renamed from: G */
    private void m31659G() {
        View view;
        Context context = (Context) this.f34844p.get();
        WeakReference weakReference = this.f34842D;
        ViewGroup viewGroup = null;
        if (weakReference != null) {
            view = (View) weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f34847s);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference weakReference2 = this.f34843E;
            if (weakReference2 != null) {
                viewGroup = (FrameLayout) weakReference2.get();
            }
            if (viewGroup != null || AbstractC6236a.f34872a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            m31661b(context, rect2, view);
            AbstractC6236a.m31721f(this.f34847s, this.f34852x, this.f34853y, this.f34840B, this.f34841C);
            this.f34845q.m152439Z(this.f34839A);
            if (!rect.equals(this.f34847s)) {
                this.f34845q.setBounds(this.f34847s);
            }
        }
    }

    /* renamed from: H */
    private void m31660H() {
        this.f34854z = ((int) Math.pow(10.0d, m31677k() - 1.0d)) - 1;
    }

    /* renamed from: b */
    private void m31661b(Context context, Rect rect, View view) {
        int i11;
        float f11;
        float f12;
        float f13;
        int i12 = this.f34851w.f34855A + this.f34851w.f34857C;
        int i13 = this.f34851w.f34866x;
        if (i13 != 8388691 && i13 != 8388693) {
            this.f34853y = rect.top + i12;
        } else {
            this.f34853y = rect.bottom - i12;
        }
        if (m31678l() <= 9) {
            if (!m31680n()) {
                f13 = this.f34848t;
            } else {
                f13 = this.f34849u;
            }
            this.f34839A = f13;
            this.f34841C = f13;
            this.f34840B = f13;
        } else {
            float f14 = this.f34849u;
            this.f34839A = f14;
            this.f34841C = f14;
            this.f34840B = (this.f34846r.m32626f(m31666g()) / 2.0f) + this.f34850v;
        }
        Resources resources = context.getResources();
        if (m31680n()) {
            i11 = AbstractC23579d.mtrl_badge_text_horizontal_edge_offset;
        } else {
            i11 = AbstractC23579d.mtrl_badge_horizontal_edge_offset;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i11);
        int i14 = this.f34851w.f34868z + this.f34851w.f34856B;
        int i15 = this.f34851w.f34866x;
        if (i15 != 8388659 && i15 != 8388691) {
            if (AbstractC1579n0.m7812G(view) == 0) {
                f12 = ((rect.right + this.f34840B) - dimensionPixelSize) - i14;
            } else {
                f12 = (rect.left - this.f34840B) + dimensionPixelSize + i14;
            }
            this.f34852x = f12;
            return;
        }
        if (AbstractC1579n0.m7812G(view) == 0) {
            f11 = (rect.left - this.f34840B) + dimensionPixelSize + i14;
        } else {
            f11 = ((rect.right + this.f34840B) - dimensionPixelSize) - i14;
        }
        this.f34852x = f11;
    }

    /* renamed from: c */
    public static BadgeDrawable m31662c(Context context) {
        return m31663d(context, null, f34838G, f34837F);
    }

    /* renamed from: d */
    private static BadgeDrawable m31663d(Context context, AttributeSet attributeSet, int i11, int i12) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m31667o(context, attributeSet, i11, i12);
        return badgeDrawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static BadgeDrawable m31664e(Context context, SavedState savedState) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m31669q(savedState);
        return badgeDrawable;
    }

    /* renamed from: f */
    private void m31665f(Canvas canvas) {
        Rect rect = new Rect();
        String m31666g = m31666g();
        this.f34846r.m32625e().getTextBounds(m31666g, 0, m31666g.length(), rect);
        canvas.drawText(m31666g, this.f34852x, this.f34853y + (rect.height() / 2), this.f34846r.m32625e());
    }

    /* renamed from: g */
    private String m31666g() {
        if (m31678l() <= this.f34854z) {
            return NumberFormat.getInstance().format(m31678l());
        }
        Context context = (Context) this.f34844p.get();
        if (context == null) {
            return "";
        }
        return context.getString(AbstractC23585j.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.f34854z), "+");
    }

    /* renamed from: o */
    private void m31667o(Context context, AttributeSet attributeSet, int i11, int i12) {
        TypedArray m32639h = AbstractC6355v.m32639h(context, attributeSet, AbstractC23587l.Badge, i11, i12, new int[0]);
        m31687x(m32639h.getInt(AbstractC23587l.Badge_maxCharacterCount, 4));
        if (m32639h.hasValue(AbstractC23587l.Badge_number)) {
            m31688y(m32639h.getInt(AbstractC23587l.Badge_number, 0));
        }
        m31683t(m31668p(context, m32639h, AbstractC23587l.Badge_backgroundColor));
        if (m32639h.hasValue(AbstractC23587l.Badge_badgeTextColor)) {
            m31685v(m31668p(context, m32639h, AbstractC23587l.Badge_badgeTextColor));
        }
        m31684u(m32639h.getInt(AbstractC23587l.Badge_badgeGravity, 8388661));
        m31686w(m32639h.getDimensionPixelOffset(AbstractC23587l.Badge_horizontalOffset, 0));
        m31671B(m32639h.getDimensionPixelOffset(AbstractC23587l.Badge_verticalOffset, 0));
        m32639h.recycle();
    }

    /* renamed from: p */
    private static int m31668p(Context context, TypedArray typedArray, int i11) {
        return AbstractC28774c.m143973a(context, typedArray, i11).getDefaultColor();
    }

    /* renamed from: q */
    private void m31669q(SavedState savedState) {
        m31687x(savedState.f34862t);
        if (savedState.f34861s != -1) {
            m31688y(savedState.f34861s);
        }
        m31683t(savedState.f34858p);
        m31685v(savedState.f34859q);
        m31684u(savedState.f34866x);
        m31686w(savedState.f34868z);
        m31671B(savedState.f34855A);
        m31681r(savedState.f34856B);
        m31682s(savedState.f34857C);
        m31672C(savedState.f34867y);
    }

    /* renamed from: z */
    private void m31670z(C28775d c28775d) {
        Context context;
        if (this.f34846r.m32624d() == c28775d || (context = (Context) this.f34844p.get()) == null) {
            return;
        }
        this.f34846r.m32628h(c28775d, context);
        m31659G();
    }

    /* renamed from: B */
    public void m31671B(int i11) {
        this.f34851w.f34855A = i11;
        m31659G();
    }

    /* renamed from: C */
    public void m31672C(boolean z11) {
        setVisible(z11, false);
        this.f34851w.f34867y = z11;
        if (AbstractC6236a.f34872a && m31675i() != null && !z11) {
            ((ViewGroup) m31675i().getParent()).invalidate();
        }
    }

    /* renamed from: F */
    public void m31673F(View view, FrameLayout frameLayout) {
        this.f34842D = new WeakReference(view);
        boolean z11 = AbstractC6236a.f34872a;
        if (z11 && frameLayout == null) {
            m31657D(view);
        } else {
            this.f34843E = new WeakReference(frameLayout);
        }
        if (!z11) {
            m31658E(view);
        }
        m31659G();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.C6352s.b
    /* renamed from: a */
    public void mo13074a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f34845q.draw(canvas);
            if (m31680n()) {
                m31665f(canvas);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f34851w.f34860r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f34847s.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f34847s.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public CharSequence m31674h() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!m31680n()) {
            return this.f34851w.f34863u;
        }
        if (this.f34851w.f34864v <= 0 || (context = (Context) this.f34844p.get()) == null) {
            return null;
        }
        if (m31678l() <= this.f34854z) {
            return context.getResources().getQuantityString(this.f34851w.f34864v, m31678l(), Integer.valueOf(m31678l()));
        }
        return context.getString(this.f34851w.f34865w, Integer.valueOf(this.f34854z));
    }

    /* renamed from: i */
    public FrameLayout m31675i() {
        WeakReference weakReference = this.f34843E;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public int m31676j() {
        return this.f34851w.f34868z;
    }

    /* renamed from: k */
    public int m31677k() {
        return this.f34851w.f34862t;
    }

    /* renamed from: l */
    public int m31678l() {
        if (m31680n()) {
            return this.f34851w.f34861s;
        }
        return 0;
    }

    /* renamed from: m */
    public SavedState m31679m() {
        return this.f34851w;
    }

    /* renamed from: n */
    public boolean m31680n() {
        if (this.f34851w.f34861s != -1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.C6352s.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: r */
    void m31681r(int i11) {
        this.f34851w.f34856B = i11;
        m31659G();
    }

    /* renamed from: s */
    void m31682s(int i11) {
        this.f34851w.f34857C = i11;
        m31659G();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f34851w.f34860r = i11;
        this.f34846r.m32625e().setAlpha(i11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: t */
    public void m31683t(int i11) {
        this.f34851w.f34858p = i11;
        ColorStateList valueOf = ColorStateList.valueOf(i11);
        if (this.f34845q.m152461z() != valueOf) {
            this.f34845q.m152442c0(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: u */
    public void m31684u(int i11) {
        FrameLayout frameLayout;
        if (this.f34851w.f34866x != i11) {
            this.f34851w.f34866x = i11;
            WeakReference weakReference = this.f34842D;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f34842D.get();
                WeakReference weakReference2 = this.f34843E;
                if (weakReference2 != null) {
                    frameLayout = (FrameLayout) weakReference2.get();
                } else {
                    frameLayout = null;
                }
                m31673F(view, frameLayout);
            }
        }
    }

    /* renamed from: v */
    public void m31685v(int i11) {
        this.f34851w.f34859q = i11;
        if (this.f34846r.m32625e().getColor() != i11) {
            this.f34846r.m32625e().setColor(i11);
            invalidateSelf();
        }
    }

    /* renamed from: w */
    public void m31686w(int i11) {
        this.f34851w.f34868z = i11;
        m31659G();
    }

    /* renamed from: x */
    public void m31687x(int i11) {
        if (this.f34851w.f34862t != i11) {
            this.f34851w.f34862t = i11;
            m31660H();
            this.f34846r.m32629i(true);
            m31659G();
            invalidateSelf();
        }
    }

    /* renamed from: y */
    public void m31688y(int i11) {
        int max = Math.max(0, i11);
        if (this.f34851w.f34861s != max) {
            this.f34851w.f34861s = max;
            this.f34846r.m32629i(true);
            m31659G();
            invalidateSelf();
        }
    }

    /* loaded from: classes3.dex */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6234a();

        /* renamed from: A */
        private int f34855A;

        /* renamed from: B */
        private int f34856B;

        /* renamed from: C */
        private int f34857C;

        /* renamed from: p */
        private int f34858p;

        /* renamed from: q */
        private int f34859q;

        /* renamed from: r */
        private int f34860r;

        /* renamed from: s */
        private int f34861s;

        /* renamed from: t */
        private int f34862t;

        /* renamed from: u */
        private CharSequence f34863u;

        /* renamed from: v */
        private int f34864v;

        /* renamed from: w */
        private int f34865w;

        /* renamed from: x */
        private int f34866x;

        /* renamed from: y */
        private boolean f34867y;

        /* renamed from: z */
        private int f34868z;

        /* renamed from: com.google.android.material.badge.BadgeDrawable$SavedState$a */
        /* loaded from: classes3.dex */
        static class C6234a implements Parcelable.Creator {
            C6234a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Context context) {
            this.f34860r = 255;
            this.f34861s = -1;
            this.f34859q = new C28775d(context, AbstractC23586k.TextAppearance_MaterialComponents_Badge).f133362a.getDefaultColor();
            this.f34863u = context.getString(AbstractC23585j.mtrl_badge_numberless_content_description);
            this.f34864v = AbstractC23584i.mtrl_badge_content_description;
            this.f34865w = AbstractC23585j.mtrl_exceed_max_badge_number_content_description;
            this.f34867y = true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f34858p);
            parcel.writeInt(this.f34859q);
            parcel.writeInt(this.f34860r);
            parcel.writeInt(this.f34861s);
            parcel.writeInt(this.f34862t);
            parcel.writeString(this.f34863u.toString());
            parcel.writeInt(this.f34864v);
            parcel.writeInt(this.f34866x);
            parcel.writeInt(this.f34868z);
            parcel.writeInt(this.f34855A);
            parcel.writeInt(this.f34856B);
            parcel.writeInt(this.f34857C);
            parcel.writeInt(this.f34867y ? 1 : 0);
        }

        protected SavedState(Parcel parcel) {
            this.f34860r = 255;
            this.f34861s = -1;
            this.f34858p = parcel.readInt();
            this.f34859q = parcel.readInt();
            this.f34860r = parcel.readInt();
            this.f34861s = parcel.readInt();
            this.f34862t = parcel.readInt();
            this.f34863u = parcel.readString();
            this.f34864v = parcel.readInt();
            this.f34866x = parcel.readInt();
            this.f34868z = parcel.readInt();
            this.f34855A = parcel.readInt();
            this.f34856B = parcel.readInt();
            this.f34857C = parcel.readInt();
            this.f34867y = parcel.readInt() != 0;
        }
    }
}
