package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.view.menu.C1074g;
import androidx.appcompat.widget.C1211t1;
import androidx.core.content.AbstractC1388a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.AbstractC6335b;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.C6338e;
import com.google.android.material.internal.C6339f;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import p013a7.AbstractC0638a;
import p175g0.AbstractC19178a;
import p193h0.AbstractC19694b;
import p310l0.C21986g;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p599w6.AbstractC28774c;
import p706z6.AbstractC31690i;
import p706z6.C31689h;
import p706z6.C31694m;

/* loaded from: classes3.dex */
public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: A */
    private static final int[] f35667A = {R.attr.state_checked};

    /* renamed from: B */
    private static final int[] f35668B = {-16842910};

    /* renamed from: C */
    private static final int f35669C = AbstractC23586k.Widget_Design_NavigationView;

    /* renamed from: u */
    private final C6338e f35670u;

    /* renamed from: v */
    private final C6339f f35671v;

    /* renamed from: w */
    private final int f35672w;

    /* renamed from: x */
    private final int[] f35673x;

    /* renamed from: y */
    private MenuInflater f35674y;

    /* renamed from: z */
    private ViewTreeObserver.OnGlobalLayoutListener f35675z;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    /* loaded from: classes3.dex */
    class C6369a implements C1072e.a {
        C6369a() {
        }

        @Override // androidx.appcompat.view.menu.C1072e.a
        /* renamed from: a */
        public boolean mo4805a(C1072e c1072e, MenuItem menuItem) {
            NavigationView.this.getClass();
            return false;
        }

        @Override // androidx.appcompat.view.menu.C1072e.a
        /* renamed from: b */
        public void mo4807b(C1072e c1072e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    /* loaded from: classes3.dex */
    public class ViewTreeObserverOnGlobalLayoutListenerC6370b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC6370b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean z11;
            boolean z12;
            boolean z13;
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f35673x);
            boolean z14 = true;
            if (NavigationView.this.f35673x[1] == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            NavigationView.this.f35671v.m32584y(z11);
            NavigationView.this.setDrawTopInsetForeground(z11);
            Activity m32554a = AbstractC6335b.m32554a(NavigationView.this.getContext());
            if (m32554a != null) {
                if (m32554a.findViewById(R.id.content).getHeight() == NavigationView.this.getHeight()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (Color.alpha(m32554a.getWindow().getNavigationBarColor()) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                NavigationView navigationView2 = NavigationView.this;
                if (!z12 || !z13) {
                    z14 = false;
                }
                navigationView2.setDrawBottomInsetForeground(z14);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC6371c {
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.navigationViewStyle);
    }

    /* renamed from: d */
    private ColorStateList m32694d(int i11) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i11, typedValue, true)) {
            return null;
        }
        ColorStateList m103335c = AbstractC19694b.m103335c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(AbstractC19178a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i12 = typedValue.data;
        int defaultColor = m103335c.getDefaultColor();
        int[] iArr = f35668B;
        return new ColorStateList(new int[][]{iArr, f35667A, FrameLayout.EMPTY_STATE_SET}, new int[]{m103335c.getColorForState(iArr, defaultColor), i12, defaultColor});
    }

    /* renamed from: e */
    private final Drawable m32695e(C1211t1 c1211t1) {
        C31689h c31689h = new C31689h(C31694m.m152472b(getContext(), c1211t1.m5730n(AbstractC23587l.NavigationView_itemShapeAppearance, 0), c1211t1.m5730n(AbstractC23587l.NavigationView_itemShapeAppearanceOverlay, 0)).m152519m());
        c31689h.m152442c0(AbstractC28774c.m143974b(getContext(), c1211t1, AbstractC23587l.NavigationView_itemShapeFillColor));
        return new InsetDrawable((Drawable) c31689h, c1211t1.m5722f(AbstractC23587l.NavigationView_itemShapeInsetStart, 0), c1211t1.m5722f(AbstractC23587l.NavigationView_itemShapeInsetTop, 0), c1211t1.m5722f(AbstractC23587l.NavigationView_itemShapeInsetEnd, 0), c1211t1.m5722f(AbstractC23587l.NavigationView_itemShapeInsetBottom, 0));
    }

    /* renamed from: f */
    private boolean m32696f(C1211t1 c1211t1) {
        if (!c1211t1.m5735s(AbstractC23587l.NavigationView_itemShapeAppearance) && !c1211t1.m5735s(AbstractC23587l.NavigationView_itemShapeAppearanceOverlay)) {
            return false;
        }
        return true;
    }

    private MenuInflater getMenuInflater() {
        if (this.f35674y == null) {
            this.f35674y = new C21986g(getContext());
        }
        return this.f35674y;
    }

    /* renamed from: i */
    private void m32697i() {
        this.f35675z = new ViewTreeObserverOnGlobalLayoutListenerC6370b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f35675z);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    /* renamed from: a */
    protected void mo32469a(C1580n1 c1580n1) {
        this.f35671v.m32573d(c1580n1);
    }

    /* renamed from: g */
    public View m32698g(int i11) {
        return this.f35671v.m32583x(i11);
    }

    public MenuItem getCheckedItem() {
        return this.f35671v.m32574e();
    }

    public int getHeaderCount() {
        return this.f35671v.m32575p();
    }

    public Drawable getItemBackground() {
        return this.f35671v.m32576q();
    }

    public int getItemHorizontalPadding() {
        return this.f35671v.m32577r();
    }

    public int getItemIconPadding() {
        return this.f35671v.m32578s();
    }

    public ColorStateList getItemIconTintList() {
        return this.f35671v.m32581v();
    }

    public int getItemMaxLines() {
        return this.f35671v.m32579t();
    }

    public ColorStateList getItemTextColor() {
        return this.f35671v.m32580u();
    }

    public Menu getMenu() {
        return this.f35670u;
    }

    /* renamed from: h */
    public void m32699h(int i11) {
        this.f35671v.m32571K(true);
        getMenuInflater().inflate(i11, this.f35670u);
        this.f35671v.m32571K(false);
        this.f35671v.mo4995l(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC31690i.m152469e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f35675z);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(this.f35672w, 1073741824);
            }
        } else {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), this.f35672w), 1073741824);
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m8457a());
        this.f35670u.m5065S(savedState.f35676r);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f35676r = bundle;
        this.f35670u.m5067U(bundle);
        return savedState;
    }

    public void setCheckedItem(int i11) {
        MenuItem findItem = this.f35670u.findItem(i11);
        if (findItem != null) {
            this.f35671v.m32585z((C1074g) findItem);
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        AbstractC31690i.m152468d(this, f11);
    }

    public void setItemBackground(Drawable drawable) {
        this.f35671v.m32562B(drawable);
    }

    public void setItemBackgroundResource(int i11) {
        setItemBackground(AbstractC1388a.m6964f(getContext(), i11));
    }

    public void setItemHorizontalPadding(int i11) {
        this.f35671v.m32563C(i11);
    }

    public void setItemHorizontalPaddingResource(int i11) {
        this.f35671v.m32563C(getResources().getDimensionPixelSize(i11));
    }

    public void setItemIconPadding(int i11) {
        this.f35671v.m32564D(i11);
    }

    public void setItemIconPaddingResource(int i11) {
        this.f35671v.m32564D(getResources().getDimensionPixelSize(i11));
    }

    public void setItemIconSize(int i11) {
        this.f35671v.m32565E(i11);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f35671v.m32566F(colorStateList);
    }

    public void setItemMaxLines(int i11) {
        this.f35671v.m32567G(i11);
    }

    public void setItemTextAppearance(int i11) {
        this.f35671v.m32568H(i11);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f35671v.m32569I(colorStateList);
    }

    public void setNavigationItemSelectedListener(InterfaceC6371c interfaceC6371c) {
    }

    @Override // android.view.View
    public void setOverScrollMode(int i11) {
        super.setOverScrollMode(i11);
        C6339f c6339f = this.f35671v;
        if (c6339f != null) {
            c6339f.m32570J(i11);
        }
    }

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6368a();

        /* renamed from: r */
        public Bundle f35676r;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
        /* loaded from: classes3.dex */
        static class C6368a implements Parcelable.ClassLoaderCreator {
            C6368a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f35676r = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeBundle(this.f35676r);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationView(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r6), attributeSet, i11);
        ColorStateList m32694d;
        int i12;
        boolean z11;
        int i13 = f35669C;
        C6339f c6339f = new C6339f();
        this.f35671v = c6339f;
        this.f35673x = new int[2];
        Context context2 = getContext();
        C6338e c6338e = new C6338e(context2);
        this.f35670u = c6338e;
        C1211t1 m32640i = AbstractC6355v.m32640i(context2, attributeSet, AbstractC23587l.NavigationView, i11, i13, new int[0]);
        if (m32640i.m5735s(AbstractC23587l.NavigationView_android_background)) {
            AbstractC1579n0.m7807D0(this, m32640i.m5723g(AbstractC23587l.NavigationView_android_background));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C31694m m152519m = C31694m.m152475e(context2, attributeSet, i11, i13).m152519m();
            Drawable background = getBackground();
            C31689h c31689h = new C31689h(m152519m);
            if (background instanceof ColorDrawable) {
                c31689h.m152442c0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            c31689h.m152435R(context2);
            AbstractC1579n0.m7807D0(this, c31689h);
        }
        if (m32640i.m5735s(AbstractC23587l.NavigationView_elevation)) {
            setElevation(m32640i.m5722f(AbstractC23587l.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(m32640i.m5717a(AbstractC23587l.NavigationView_android_fitsSystemWindows, false));
        this.f35672w = m32640i.m5722f(AbstractC23587l.NavigationView_android_maxWidth, 0);
        if (m32640i.m5735s(AbstractC23587l.NavigationView_itemIconTint)) {
            m32694d = m32640i.m5719c(AbstractC23587l.NavigationView_itemIconTint);
        } else {
            m32694d = m32694d(R.attr.textColorSecondary);
        }
        if (m32640i.m5735s(AbstractC23587l.NavigationView_itemTextAppearance)) {
            i12 = m32640i.m5730n(AbstractC23587l.NavigationView_itemTextAppearance, 0);
            z11 = true;
        } else {
            i12 = 0;
            z11 = false;
        }
        if (m32640i.m5735s(AbstractC23587l.NavigationView_itemIconSize)) {
            setItemIconSize(m32640i.m5722f(AbstractC23587l.NavigationView_itemIconSize, 0));
        }
        ColorStateList m5719c = m32640i.m5735s(AbstractC23587l.NavigationView_itemTextColor) ? m32640i.m5719c(AbstractC23587l.NavigationView_itemTextColor) : null;
        if (!z11 && m5719c == null) {
            m5719c = m32694d(R.attr.textColorPrimary);
        }
        Drawable m5723g = m32640i.m5723g(AbstractC23587l.NavigationView_itemBackground);
        if (m5723g == null && m32696f(m32640i)) {
            m5723g = m32695e(m32640i);
        }
        if (m32640i.m5735s(AbstractC23587l.NavigationView_itemHorizontalPadding)) {
            c6339f.m32563C(m32640i.m5722f(AbstractC23587l.NavigationView_itemHorizontalPadding, 0));
        }
        int m5722f = m32640i.m5722f(AbstractC23587l.NavigationView_itemIconPadding, 0);
        setItemMaxLines(m32640i.m5727k(AbstractC23587l.NavigationView_itemMaxLines, 1));
        c6338e.mo5068V(new C6369a());
        c6339f.m32561A(1);
        c6339f.mo4997o(context2, c6338e);
        c6339f.m32566F(m32694d);
        c6339f.m32570J(getOverScrollMode());
        if (z11) {
            c6339f.m32568H(i12);
        }
        c6339f.m32569I(m5719c);
        c6339f.m32562B(m5723g);
        c6339f.m32564D(m5722f);
        c6338e.m5074b(c6339f);
        addView((View) c6339f.m32582w(this));
        if (m32640i.m5735s(AbstractC23587l.NavigationView_menu)) {
            m32699h(m32640i.m5730n(AbstractC23587l.NavigationView_menu, 0));
        }
        if (m32640i.m5735s(AbstractC23587l.NavigationView_headerLayout)) {
            m32698g(m32640i.m5730n(AbstractC23587l.NavigationView_headerLayout, 0));
        }
        m32640i.m5736w();
        m32697i();
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f35670u.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f35671v.m32585z((C1074g) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
