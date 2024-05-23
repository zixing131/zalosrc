package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C1211t1;
import androidx.core.content.AbstractC1388a;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23578c;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;

/* loaded from: classes3.dex */
public class BottomNavigationView extends NavigationBarView {

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC6253a extends NavigationBarView.InterfaceC6366c {
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC6254b extends NavigationBarView.InterfaceC6367d {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.bottomNavigationStyle);
    }

    /* renamed from: g */
    private void m31821g(Context context) {
        View view = new View(context);
        view.setBackgroundColor(AbstractC1388a.m6961c(context, AbstractC23578c.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(AbstractC23579d.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    /* renamed from: h */
    private boolean m31822h() {
        return false;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    /* renamed from: e */
    protected NavigationBarMenuView mo31823e(Context context) {
        return new BottomNavigationMenuView(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    public void setItemHorizontalTranslationEnabled(boolean z11) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.m31820l() != z11) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z11);
            getPresenter().mo4995l(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(InterfaceC6253a interfaceC6253a) {
        setOnItemReselectedListener(interfaceC6253a);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC6254b interfaceC6254b) {
        setOnItemSelectedListener(interfaceC6254b);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, AbstractC23586k.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2 = getContext();
        C1211t1 m32640i = AbstractC6355v.m32640i(context2, attributeSet, AbstractC23587l.BottomNavigationView, i11, i12, new int[0]);
        setItemHorizontalTranslationEnabled(m32640i.m5717a(AbstractC23587l.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        m32640i.m5736w();
        if (m31822h()) {
            m31821g(context2);
        }
    }
}
