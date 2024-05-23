package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.AbstractC6359z;
import com.google.android.material.tabs.TabLayout;
import p382o6.AbstractC24041a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.tabs.b */
/* loaded from: classes3.dex */
public class C6418b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static RectF m33041a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.m32982z() && (view instanceof TabLayout.TabView)) {
            return m33042b((TabLayout.TabView) view, 24);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: b */
    static RectF m33042b(TabLayout.TabView tabView, int i11) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int m32648c = (int) AbstractC6359z.m32648c(tabView.getContext(), i11);
        if (contentWidth < m32648c) {
            contentWidth = m32648c;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i12 = contentWidth / 2;
        return new RectF(left - i12, top - (contentHeight / 2), i12 + left, top + (left / 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo33040c(TabLayout tabLayout, View view, View view2, float f11, Drawable drawable) {
        RectF m33041a = m33041a(tabLayout, view);
        RectF m33041a2 = m33041a(tabLayout, view2);
        drawable.setBounds(AbstractC24041a.m125912c((int) m33041a.left, (int) m33041a2.left, f11), drawable.getBounds().top, AbstractC24041a.m125912c((int) m33041a.right, (int) m33041a2.right, f11), drawable.getBounds().bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m33043d(TabLayout tabLayout, View view, Drawable drawable) {
        RectF m33041a = m33041a(tabLayout, view);
        drawable.setBounds((int) m33041a.left, drawable.getBounds().top, (int) m33041a.right, drawable.getBounds().bottom);
    }
}
