package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.view.menu.C1074g;
import androidx.appcompat.view.menu.InterfaceC1078k;
import androidx.core.util.C1486h;
import androidx.core.util.InterfaceC1484f;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.accessibility.C1507g0;
import androidx.transition.AbstractC2028r;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.C6353t;
import java.util.HashSet;
import p175g0.AbstractC19178a;
import p193h0.AbstractC19694b;
import p500s1.C26087b;

/* loaded from: classes3.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements InterfaceC1078k {

    /* renamed from: I */
    private static final int[] f35631I = {R.attr.state_checked};

    /* renamed from: J */
    private static final int[] f35632J = {-16842910};

    /* renamed from: A */
    private final ColorStateList f35633A;

    /* renamed from: B */
    private int f35634B;

    /* renamed from: C */
    private int f35635C;

    /* renamed from: D */
    private Drawable f35636D;

    /* renamed from: E */
    private int f35637E;

    /* renamed from: F */
    private SparseArray f35638F;

    /* renamed from: G */
    private NavigationBarPresenter f35639G;

    /* renamed from: H */
    private C1072e f35640H;

    /* renamed from: p */
    private final TransitionSet f35641p;

    /* renamed from: q */
    private final View.OnClickListener f35642q;

    /* renamed from: r */
    private final InterfaceC1484f f35643r;

    /* renamed from: s */
    private final SparseArray f35644s;

    /* renamed from: t */
    private int f35645t;

    /* renamed from: u */
    private NavigationBarItemView[] f35646u;

    /* renamed from: v */
    private int f35647v;

    /* renamed from: w */
    private int f35648w;

    /* renamed from: x */
    private ColorStateList f35649x;

    /* renamed from: y */
    private int f35650y;

    /* renamed from: z */
    private ColorStateList f35651z;

    /* renamed from: com.google.android.material.navigation.NavigationBarMenuView$a */
    /* loaded from: classes3.dex */
    class ViewOnClickListenerC6361a implements View.OnClickListener {
        ViewOnClickListenerC6361a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1074g itemData = ((NavigationBarItemView) view).getItemData();
            if (!NavigationBarMenuView.this.f35640H.m5062O(itemData, NavigationBarMenuView.this.f35639G, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public NavigationBarMenuView(Context context) {
        super(context);
        this.f35643r = new C1486h(5);
        this.f35644s = new SparseArray(5);
        this.f35647v = 0;
        this.f35648w = 0;
        this.f35638F = new SparseArray(5);
        this.f35633A = m32674d(R.attr.textColorSecondary);
        AutoTransition autoTransition = new AutoTransition();
        this.f35641p = autoTransition;
        autoTransition.m10943B0(0);
        autoTransition.mo10915g0(115L);
        autoTransition.mo10918j0(new C26087b());
        autoTransition.m10947t0(new C6353t());
        this.f35642q = new ViewOnClickListenerC6361a();
        AbstractC1579n0.m7823L0(this, 1);
    }

    /* renamed from: g */
    private boolean m32671g(int i11) {
        return i11 != -1;
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemView = (NavigationBarItemView) this.f35643r.mo7484b();
        if (navigationBarItemView == null) {
            return mo31819e(getContext());
        }
        return navigationBarItemView;
    }

    /* renamed from: i */
    private void m32672i() {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < this.f35640H.size(); i11++) {
            hashSet.add(Integer.valueOf(this.f35640H.getItem(i11).getItemId()));
        }
        for (int i12 = 0; i12 < this.f35638F.size(); i12++) {
            int keyAt = this.f35638F.keyAt(i12);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f35638F.delete(keyAt);
            }
        }
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        BadgeDrawable badgeDrawable;
        int id2 = navigationBarItemView.getId();
        if (m32671g(id2) && (badgeDrawable = (BadgeDrawable) this.f35638F.get(id2)) != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
    }

    /* renamed from: c */
    public void m32673c() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f35646u;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f35643r.mo7483a(navigationBarItemView);
                    navigationBarItemView.m32668h();
                }
            }
        }
        if (this.f35640H.size() == 0) {
            this.f35647v = 0;
            this.f35648w = 0;
            this.f35646u = null;
            return;
        }
        m32672i();
        this.f35646u = new NavigationBarItemView[this.f35640H.size()];
        boolean m32675f = m32675f(this.f35645t, this.f35640H.m5054G().size());
        for (int i11 = 0; i11 < this.f35640H.size(); i11++) {
            this.f35639G.m32680d(true);
            this.f35640H.getItem(i11).setCheckable(true);
            this.f35639G.m32680d(false);
            NavigationBarItemView newItem = getNewItem();
            this.f35646u[i11] = newItem;
            newItem.setIconTintList(this.f35649x);
            newItem.setIconSize(this.f35650y);
            newItem.setTextColor(this.f35633A);
            newItem.setTextAppearanceInactive(this.f35634B);
            newItem.setTextAppearanceActive(this.f35635C);
            newItem.setTextColor(this.f35651z);
            Drawable drawable = this.f35636D;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f35637E);
            }
            newItem.setShifting(m32675f);
            newItem.setLabelVisibilityMode(this.f35645t);
            C1074g c1074g = (C1074g) this.f35640H.getItem(i11);
            newItem.mo4971b(c1074g, 0);
            newItem.setItemPosition(i11);
            int itemId = c1074g.getItemId();
            newItem.setOnTouchListener((View.OnTouchListener) this.f35644s.get(itemId));
            newItem.setOnClickListener(this.f35642q);
            int i12 = this.f35647v;
            if (i12 != 0 && itemId == i12) {
                this.f35648w = i11;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f35640H.size() - 1, this.f35648w);
        this.f35648w = min;
        this.f35640H.getItem(min).setChecked(true);
    }

    /* renamed from: d */
    public ColorStateList m32674d(int i11) {
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
        int[] iArr = f35632J;
        return new ColorStateList(new int[][]{iArr, f35631I, ViewGroup.EMPTY_STATE_SET}, new int[]{m103335c.getColorForState(iArr, defaultColor), i12, defaultColor});
    }

    /* renamed from: e */
    protected abstract NavigationBarItemView mo31819e(Context context);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public boolean m32675f(int i11, int i12) {
        if (i11 == -1) {
            if (i12 <= 3) {
                return false;
            }
        } else if (i11 != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f35638F;
    }

    public ColorStateList getIconTintList() {
        return this.f35649x;
    }

    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f35646u;
        if (navigationBarItemViewArr != null && navigationBarItemViewArr.length > 0) {
            return navigationBarItemViewArr[0].getBackground();
        }
        return this.f35636D;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f35637E;
    }

    public int getItemIconSize() {
        return this.f35650y;
    }

    public int getItemTextAppearanceActive() {
        return this.f35635C;
    }

    public int getItemTextAppearanceInactive() {
        return this.f35634B;
    }

    public ColorStateList getItemTextColor() {
        return this.f35651z;
    }

    public int getLabelVisibilityMode() {
        return this.f35645t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C1072e getMenu() {
        return this.f35640H;
    }

    public int getSelectedItemId() {
        return this.f35647v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getSelectedItemPosition() {
        return this.f35648w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1078k
    /* renamed from: h */
    public void mo4980h(C1072e c1072e) {
        this.f35640H = c1072e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m32676j(int i11) {
        int size = this.f35640H.size();
        for (int i12 = 0; i12 < size; i12++) {
            MenuItem item = this.f35640H.getItem(i12);
            if (i11 == item.getItemId()) {
                this.f35647v = i11;
                this.f35648w = i12;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: k */
    public void m32677k() {
        C1072e c1072e = this.f35640H;
        if (c1072e != null && this.f35646u != null) {
            int size = c1072e.size();
            if (size != this.f35646u.length) {
                m32673c();
                return;
            }
            int i11 = this.f35647v;
            for (int i12 = 0; i12 < size; i12++) {
                MenuItem item = this.f35640H.getItem(i12);
                if (item.isChecked()) {
                    this.f35647v = item.getItemId();
                    this.f35648w = i12;
                }
            }
            if (i11 != this.f35647v) {
                AbstractC2028r.m11024a(this, this.f35641p);
            }
            boolean m32675f = m32675f(this.f35645t, this.f35640H.m5054G().size());
            for (int i13 = 0; i13 < size; i13++) {
                this.f35639G.m32680d(true);
                this.f35646u[i13].setLabelVisibilityMode(this.f35645t);
                this.f35646u[i13].setShifting(m32675f);
                this.f35646u[i13].mo4971b((C1074g) this.f35640H.getItem(i13), 0);
                this.f35639G.m32680d(false);
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1507g0.m7571I0(accessibilityNodeInfo).m7622f0(C1507g0.b.m7661b(1, this.f35640H.m5054G().size(), false, 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.f35638F = sparseArray;
        NavigationBarItemView[] navigationBarItemViewArr = this.f35646u;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setBadge(sparseArray.get(navigationBarItemView.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f35649x = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f35646u;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f35636D = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f35646u;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i11) {
        this.f35637E = i11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f35646u;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i11);
            }
        }
    }

    public void setItemIconSize(int i11) {
        this.f35650y = i11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f35646u;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i11);
            }
        }
    }

    public void setItemTextAppearanceActive(int i11) {
        this.f35635C = i11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f35646u;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i11);
                ColorStateList colorStateList = this.f35651z;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i11) {
        this.f35634B = i11;
        NavigationBarItemView[] navigationBarItemViewArr = this.f35646u;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i11);
                ColorStateList colorStateList = this.f35651z;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f35651z = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f35646u;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i11) {
        this.f35645t = i11;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.f35639G = navigationBarPresenter;
    }
}
