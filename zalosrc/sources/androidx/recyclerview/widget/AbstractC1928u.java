package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.u */
/* loaded from: classes.dex */
public abstract class AbstractC1928u {

    /* renamed from: a */
    protected final RecyclerView.AbstractC1888o f8213a;

    /* renamed from: b */
    private int f8214b;

    /* renamed from: c */
    final Rect f8215c;

    /* renamed from: androidx.recyclerview.widget.u$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC1928u {
        a(RecyclerView.AbstractC1888o abstractC1888o) {
            super(abstractC1888o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: d */
        public int mo10646d(View view) {
            return this.f8213a.m10132k(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: e */
        public int mo10647e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f8213a.m10118e(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: f */
        public int mo10648f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f8213a.m10140n(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: g */
        public int mo10649g(View view) {
            return this.f8213a.m10121f(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: h */
        public int mo10650h() {
            return this.f8213a.getWidth();
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: i */
        public int mo10651i() {
            return this.f8213a.getWidth() - this.f8213a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: j */
        public int mo10652j() {
            return this.f8213a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: l */
        public int mo10654l() {
            return this.f8213a.m10141n0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: m */
        public int mo10655m() {
            return this.f8213a.m10114c0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: n */
        public int mo10656n() {
            return this.f8213a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: o */
        public int mo10657o() {
            return (this.f8213a.getWidth() - this.f8213a.getPaddingLeft()) - this.f8213a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: q */
        public int mo10659q(View view) {
            this.f8213a.m10138m0(view, true, this.f8215c);
            return this.f8215c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: r */
        public int mo10660r(View view) {
            this.f8213a.m10138m0(view, true, this.f8215c);
            return this.f8215c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: s */
        public void mo10661s(int i11) {
            this.f8213a.mo10080A0(i11);
        }
    }

    /* renamed from: androidx.recyclerview.widget.u$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC1928u {
        b(RecyclerView.AbstractC1888o abstractC1888o) {
            super(abstractC1888o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: d */
        public int mo10646d(View view) {
            return this.f8213a.m10130j(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: e */
        public int mo10647e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f8213a.m10140n(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: f */
        public int mo10648f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f8213a.m10118e(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: g */
        public int mo10649g(View view) {
            return this.f8213a.m10135l(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: h */
        public int mo10650h() {
            return this.f8213a.getHeight();
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: i */
        public int mo10651i() {
            return this.f8213a.getHeight() - this.f8213a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: j */
        public int mo10652j() {
            return this.f8213a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: l */
        public int mo10654l() {
            return this.f8213a.m10114c0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: m */
        public int mo10655m() {
            return this.f8213a.m10141n0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: n */
        public int mo10656n() {
            return this.f8213a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: o */
        public int mo10657o() {
            return (this.f8213a.getHeight() - this.f8213a.getPaddingTop()) - this.f8213a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: q */
        public int mo10659q(View view) {
            this.f8213a.m10138m0(view, true, this.f8215c);
            return this.f8215c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: r */
        public int mo10660r(View view) {
            this.f8213a.m10138m0(view, true, this.f8215c);
            return this.f8215c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC1928u
        /* renamed from: s */
        public void mo10661s(int i11) {
            this.f8213a.mo10081B0(i11);
        }
    }

    /* synthetic */ AbstractC1928u(RecyclerView.AbstractC1888o abstractC1888o, a aVar) {
        this(abstractC1888o);
    }

    /* renamed from: a */
    public static AbstractC1928u m10643a(RecyclerView.AbstractC1888o abstractC1888o) {
        return new a(abstractC1888o);
    }

    /* renamed from: b */
    public static AbstractC1928u m10644b(RecyclerView.AbstractC1888o abstractC1888o, int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                return m10645c(abstractC1888o);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return m10643a(abstractC1888o);
    }

    /* renamed from: c */
    public static AbstractC1928u m10645c(RecyclerView.AbstractC1888o abstractC1888o) {
        return new b(abstractC1888o);
    }

    /* renamed from: d */
    public abstract int mo10646d(View view);

    /* renamed from: e */
    public abstract int mo10647e(View view);

    /* renamed from: f */
    public abstract int mo10648f(View view);

    /* renamed from: g */
    public abstract int mo10649g(View view);

    /* renamed from: h */
    public abstract int mo10650h();

    /* renamed from: i */
    public abstract int mo10651i();

    /* renamed from: j */
    public abstract int mo10652j();

    /* renamed from: k */
    public RecyclerView.AbstractC1888o m10653k() {
        return this.f8213a;
    }

    /* renamed from: l */
    public abstract int mo10654l();

    /* renamed from: m */
    public abstract int mo10655m();

    /* renamed from: n */
    public abstract int mo10656n();

    /* renamed from: o */
    public abstract int mo10657o();

    /* renamed from: p */
    public int m10658p() {
        if (Integer.MIN_VALUE == this.f8214b) {
            return 0;
        }
        return mo10657o() - this.f8214b;
    }

    /* renamed from: q */
    public abstract int mo10659q(View view);

    /* renamed from: r */
    public abstract int mo10660r(View view);

    /* renamed from: s */
    public abstract void mo10661s(int i11);

    /* renamed from: t */
    public void m10662t() {
        this.f8214b = mo10657o();
    }

    private AbstractC1928u(RecyclerView.AbstractC1888o abstractC1888o) {
        this.f8214b = Integer.MIN_VALUE;
        this.f8215c = new Rect();
        this.f8213a = abstractC1888o;
    }
}
