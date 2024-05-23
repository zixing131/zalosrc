package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.view.menu.InterfaceC1078k;
import androidx.appcompat.widget.C1211t1;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.AbstractC6359z;
import p013a7.AbstractC0638a;
import p310l0.C21986g;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23587l;
import p599w6.AbstractC28774c;
import p634x6.AbstractC29387b;
import p706z6.AbstractC31690i;
import p706z6.C31689h;

/* loaded from: classes3.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: p */
    private final C6372a f35659p;

    /* renamed from: q */
    private final NavigationBarMenuView f35660q;

    /* renamed from: r */
    private final NavigationBarPresenter f35661r;

    /* renamed from: s */
    private ColorStateList f35662s;

    /* renamed from: t */
    private MenuInflater f35663t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6363a();

        /* renamed from: r */
        Bundle f35664r;

        /* renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$a */
        /* loaded from: classes3.dex */
        static class C6363a implements Parcelable.ClassLoaderCreator {
            C6363a() {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m32688b(Parcel parcel, ClassLoader classLoader) {
            this.f35664r = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeBundle(this.f35664r);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m32688b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$a */
    /* loaded from: classes3.dex */
    class C6364a implements C1072e.a {
        C6364a() {
        }

        @Override // androidx.appcompat.view.menu.C1072e.a
        /* renamed from: a */
        public boolean mo4805a(C1072e c1072e, MenuItem menuItem) {
            NavigationBarView.m32683a(NavigationBarView.this);
            NavigationBarView.m32684b(NavigationBarView.this);
            return false;
        }

        @Override // androidx.appcompat.view.menu.C1072e.a
        /* renamed from: b */
        public void mo4807b(C1072e c1072e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.navigation.NavigationBarView$b */
    /* loaded from: classes3.dex */
    public class C6365b implements AbstractC6359z.d {
        C6365b() {
        }

        @Override // com.google.android.material.internal.AbstractC6359z.d
        /* renamed from: a */
        public C1580n1 mo31803a(View view, C1580n1 c1580n1, AbstractC6359z.e eVar) {
            int i11;
            eVar.f35612d += c1580n1.m8058j();
            boolean z11 = true;
            if (AbstractC1579n0.m7812G(view) != 1) {
                z11 = false;
            }
            int m8059k = c1580n1.m8059k();
            int m8060l = c1580n1.m8060l();
            int i12 = eVar.f35609a;
            if (z11) {
                i11 = m8060l;
            } else {
                i11 = m8059k;
            }
            eVar.f35609a = i12 + i11;
            int i13 = eVar.f35611c;
            if (!z11) {
                m8059k = m8060l;
            }
            eVar.f35611c = i13 + m8059k;
            eVar.m32656a(view);
            return c1580n1;
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC6366c {
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC6367d {
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, i12), attributeSet, i11);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f35661r = navigationBarPresenter;
        Context context2 = getContext();
        C1211t1 m32640i = AbstractC6355v.m32640i(context2, attributeSet, AbstractC23587l.NavigationBarView, i11, i12, AbstractC23587l.NavigationBarView_itemTextAppearanceInactive, AbstractC23587l.NavigationBarView_itemTextAppearanceActive);
        C6372a c6372a = new C6372a(context2, getClass(), getMaxItemCount());
        this.f35659p = c6372a;
        NavigationBarMenuView mo31823e = mo31823e(context2);
        this.f35660q = mo31823e;
        navigationBarPresenter.m32679b(mo31823e);
        navigationBarPresenter.m32678a(1);
        mo31823e.setPresenter(navigationBarPresenter);
        c6372a.m5074b(navigationBarPresenter);
        navigationBarPresenter.mo4997o(getContext(), c6372a);
        if (m32640i.m5735s(AbstractC23587l.NavigationBarView_itemIconTint)) {
            mo31823e.setIconTintList(m32640i.m5719c(AbstractC23587l.NavigationBarView_itemIconTint));
        } else {
            mo31823e.setIconTintList(mo31823e.m32674d(R.attr.textColorSecondary));
        }
        setItemIconSize(m32640i.m5722f(AbstractC23587l.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(AbstractC23579d.mtrl_navigation_bar_item_default_icon_size)));
        if (m32640i.m5735s(AbstractC23587l.NavigationBarView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(m32640i.m5730n(AbstractC23587l.NavigationBarView_itemTextAppearanceInactive, 0));
        }
        if (m32640i.m5735s(AbstractC23587l.NavigationBarView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(m32640i.m5730n(AbstractC23587l.NavigationBarView_itemTextAppearanceActive, 0));
        }
        if (m32640i.m5735s(AbstractC23587l.NavigationBarView_itemTextColor)) {
            setItemTextColor(m32640i.m5719c(AbstractC23587l.NavigationBarView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            AbstractC1579n0.m7807D0(this, m32686d(context2));
        }
        if (m32640i.m5735s(AbstractC23587l.NavigationBarView_elevation)) {
            setElevation(m32640i.m5722f(AbstractC23587l.NavigationBarView_elevation, 0));
        }
        AbstractC1414a.m7197o(getBackground().mutate(), AbstractC28774c.m143974b(context2, m32640i, AbstractC23587l.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(m32640i.m5728l(AbstractC23587l.NavigationBarView_labelVisibilityMode, -1));
        int m5730n = m32640i.m5730n(AbstractC23587l.NavigationBarView_itemBackground, 0);
        if (m5730n != 0) {
            mo31823e.setItemBackgroundRes(m5730n);
        } else {
            setItemRippleColor(AbstractC28774c.m143974b(context2, m32640i, AbstractC23587l.NavigationBarView_itemRippleColor));
        }
        if (m32640i.m5735s(AbstractC23587l.NavigationBarView_menu)) {
            m32687f(m32640i.m5730n(AbstractC23587l.NavigationBarView_menu, 0));
        }
        m32640i.m5736w();
        addView(mo31823e);
        c6372a.mo5068V(new C6364a());
        m32685c();
    }

    /* renamed from: a */
    static /* synthetic */ InterfaceC6366c m32683a(NavigationBarView navigationBarView) {
        navigationBarView.getClass();
        return null;
    }

    /* renamed from: b */
    static /* synthetic */ InterfaceC6367d m32684b(NavigationBarView navigationBarView) {
        navigationBarView.getClass();
        return null;
    }

    /* renamed from: c */
    private void m32685c() {
        AbstractC6359z.m32647b(this, new C6365b());
    }

    /* renamed from: d */
    private C31689h m32686d(Context context) {
        C31689h c31689h = new C31689h();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            c31689h.m152442c0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        c31689h.m152435R(context);
        return c31689h;
    }

    private MenuInflater getMenuInflater() {
        if (this.f35663t == null) {
            this.f35663t = new C21986g(getContext());
        }
        return this.f35663t;
    }

    /* renamed from: e */
    protected abstract NavigationBarMenuView mo31823e(Context context);

    /* renamed from: f */
    public void m32687f(int i11) {
        this.f35661r.m32680d(true);
        getMenuInflater().inflate(i11, this.f35659p);
        this.f35661r.m32680d(false);
        this.f35661r.mo4995l(true);
    }

    public Drawable getItemBackground() {
        return this.f35660q.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f35660q.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f35660q.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f35660q.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f35662s;
    }

    public int getItemTextAppearanceActive() {
        return this.f35660q.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f35660q.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f35660q.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f35660q.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f35659p;
    }

    public InterfaceC1078k getMenuView() {
        return this.f35660q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NavigationBarPresenter getPresenter() {
        return this.f35661r;
    }

    public int getSelectedItemId() {
        return this.f35660q.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC31690i.m152469e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m8457a());
        this.f35659p.m5065S(savedState.f35664r);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f35664r = bundle;
        this.f35659p.m5067U(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        AbstractC31690i.m152468d(this, f11);
    }

    public void setItemBackground(Drawable drawable) {
        this.f35660q.setItemBackground(drawable);
        this.f35662s = null;
    }

    public void setItemBackgroundResource(int i11) {
        this.f35660q.setItemBackgroundRes(i11);
        this.f35662s = null;
    }

    public void setItemIconSize(int i11) {
        this.f35660q.setItemIconSize(i11);
    }

    public void setItemIconSizeRes(int i11) {
        setItemIconSize(getResources().getDimensionPixelSize(i11));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f35660q.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f35662s == colorStateList) {
            if (colorStateList == null && this.f35660q.getItemBackground() != null) {
                this.f35660q.setItemBackground(null);
                return;
            }
            return;
        }
        this.f35662s = colorStateList;
        if (colorStateList == null) {
            this.f35660q.setItemBackground(null);
        } else {
            this.f35660q.setItemBackground(new RippleDrawable(AbstractC29387b.m146551a(colorStateList), null, null));
        }
    }

    public void setItemTextAppearanceActive(int i11) {
        this.f35660q.setItemTextAppearanceActive(i11);
    }

    public void setItemTextAppearanceInactive(int i11) {
        this.f35660q.setItemTextAppearanceInactive(i11);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f35660q.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i11) {
        if (this.f35660q.getLabelVisibilityMode() != i11) {
            this.f35660q.setLabelVisibilityMode(i11);
            this.f35661r.mo4995l(false);
        }
    }

    public void setOnItemReselectedListener(InterfaceC6366c interfaceC6366c) {
    }

    public void setOnItemSelectedListener(InterfaceC6367d interfaceC6367d) {
    }

    public void setSelectedItemId(int i11) {
        MenuItem findItem = this.f35659p.findItem(i11);
        if (findItem != null && !this.f35659p.m5062O(findItem, this.f35661r, 0)) {
            findItem.setChecked(true);
        }
    }
}
