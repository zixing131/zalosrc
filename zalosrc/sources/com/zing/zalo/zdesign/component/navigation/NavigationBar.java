package com.zing.zalo.zdesign.component.navigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bi0.AbstractC2809c;
import bi0.AbstractC2810d;
import com.zing.zalo.zdesign.component.navigation.NavigationBar;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import li0.AbstractC22492b;
import li0.AbstractC22493c;
import ui0.C27276c;

/* loaded from: classes7.dex */
public final class NavigationBar extends RelativeLayout {

    /* renamed from: p */
    private NavigationTab[] f87055p;

    /* renamed from: q */
    private LinearLayout f87056q;

    /* renamed from: r */
    private List f87057r;

    /* renamed from: s */
    private int f87058s;

    /* renamed from: t */
    private int f87059t;

    /* renamed from: u */
    private boolean f87060u;

    /* renamed from: com.zing.zalo.zdesign.component.navigation.NavigationBar$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC17022a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f87058s = 5;
        this.f87060u = true;
        try {
            LinearLayout linearLayout = new LinearLayout(context);
            this.f87056q = linearLayout;
            addView(linearLayout, new RelativeLayout.LayoutParams(-1, -1));
            setBackgroundResource(AbstractC2810d.navbar_bg);
            setElevation(context.getResources().getDimension(AbstractC2809c.navbar_elevation));
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private final void m91102b() {
    }

    /* renamed from: c */
    private final void m91103c() {
        int i11 = this.f87058s;
        this.f87055p = new NavigationTab[i11];
        for (final int i12 = 0; i12 < i11; i12++) {
            NavigationTab[] navigationTabArr = this.f87055p;
            AbstractC19074t.m100205c(navigationTabArr);
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            navigationTabArr[i12] = new NavigationTab(context, i12);
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(0, C27276c.m139649b(context2, 64));
            NavigationTab[] navigationTabArr2 = this.f87055p;
            AbstractC19074t.m100205c(navigationTabArr2);
            NavigationTab navigationTab = navigationTabArr2[i12];
            AbstractC19074t.m100205c(navigationTab);
            navigationTab.setLayoutParams(layoutParams);
            LinearLayout linearLayout = this.f87056q;
            AbstractC19074t.m100205c(linearLayout);
            NavigationTab[] navigationTabArr3 = this.f87055p;
            AbstractC19074t.m100205c(navigationTabArr3);
            linearLayout.addView(navigationTabArr3[i12]);
            NavigationTab[] navigationTabArr4 = this.f87055p;
            AbstractC19074t.m100205c(navigationTabArr4);
            NavigationTab navigationTab2 = navigationTabArr4[i12];
            AbstractC19074t.m100205c(navigationTab2);
            navigationTab2.setOnClickListener(new View.OnClickListener() { // from class: li0.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NavigationBar.m91104d(NavigationBar.this, i12, view);
                }
            });
        }
        m91105e(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m91104d(NavigationBar navigationBar, int i11, View view) {
        AbstractC19074t.m100208f(navigationBar, "this$0");
        navigationBar.m91106f(i11);
    }

    /* renamed from: e */
    private final void m91105e(int i11) {
        float f11;
        if (this.f87055p == null) {
            return;
        }
        int i12 = this.f87058s;
        for (int i13 = 0; i13 < i12; i13++) {
            NavigationTab[] navigationTabArr = this.f87055p;
            AbstractC19074t.m100205c(navigationTabArr);
            NavigationTab navigationTab = navigationTabArr[i13];
            AbstractC19074t.m100205c(navigationTab);
            if (i13 == i11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            navigationTab.setProgress(f11);
        }
    }

    /* renamed from: f */
    public final void m91106f(int i11) {
        if (this.f87060u) {
            if (this.f87059t == i11) {
                return;
            }
            AbstractC19074t.m100205c(null);
            throw null;
        }
        AbstractC19074t.m100205c(null);
        throw null;
    }

    public final AbstractC22492b getCoordinator() {
        return null;
    }

    public final boolean getEnableTabAnimation() {
        return this.f87060u;
    }

    public final InterfaceC17022a getOnTabClickListener() {
        return null;
    }

    public final AbstractC22493c getStyle() {
        return null;
    }

    public final NavigationTab[] getTabMainView() {
        return this.f87055p;
    }

    public final LinearLayout getTabsContainer() {
        return this.f87056q;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        try {
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth > 0) {
                int i13 = this.f87058s;
                int i14 = measuredWidth / i13;
                int i15 = measuredWidth - ((i13 - 1) * i14);
                if (this.f87055p != null) {
                    for (int i16 = 0; i16 < i13; i16++) {
                        NavigationTab[] navigationTabArr = this.f87055p;
                        AbstractC19074t.m100205c(navigationTabArr);
                        NavigationTab navigationTab = navigationTabArr[i16];
                        AbstractC19074t.m100205c(navigationTab);
                        navigationTab.m91107a(i14, i15);
                    }
                }
            }
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            setMeasuredDimension(measuredWidth, C27276c.m139649b(context, 48));
        } catch (Exception unused) {
        }
    }

    public final void setCoordinator(AbstractC22492b abstractC22492b) {
    }

    public final void setEnableTabAnimation(boolean z11) {
        this.f87060u = z11;
    }

    public final void setItems(List<Object> list) {
        AbstractC19074t.m100208f(list, "items");
        this.f87057r = new ArrayList(list);
        this.f87058s = list.size();
        if (this.f87055p == null) {
            m91103c();
        }
        m91102b();
    }

    public final void setOnTabClickListener(InterfaceC17022a interfaceC17022a) {
    }

    public final void setStyle(AbstractC22493c abstractC22493c) {
        m91102b();
    }

    public final void setTabMainView(NavigationTab[] navigationTabArr) {
        this.f87055p = navigationTabArr;
    }

    public final void setTabsContainer(LinearLayout linearLayout) {
        this.f87056q = linearLayout;
    }
}
