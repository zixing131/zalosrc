package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p382o6.AbstractC24041a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.tabs.a */
/* loaded from: classes3.dex */
public class C6417a extends C6418b {
    /* renamed from: e */
    private static float m33038e(float f11) {
        return (float) (1.0d - Math.cos((f11 * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    private static float m33039f(float f11) {
        return (float) Math.sin((f11 * 3.141592653589793d) / 2.0d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.tabs.C6418b
    /* renamed from: c */
    public void mo33040c(TabLayout tabLayout, View view, View view2, float f11, Drawable drawable) {
        float m33039f;
        float m33038e;
        RectF m33041a = C6418b.m33041a(tabLayout, view);
        RectF m33041a2 = C6418b.m33041a(tabLayout, view2);
        if (m33041a.left < m33041a2.left) {
            m33039f = m33038e(f11);
            m33038e = m33039f(f11);
        } else {
            m33039f = m33039f(f11);
            m33038e = m33038e(f11);
        }
        drawable.setBounds(AbstractC24041a.m125912c((int) m33041a.left, (int) m33041a2.left, m33039f), drawable.getBounds().top, AbstractC24041a.m125912c((int) m33041a.right, (int) m33041a2.right, m33038e), drawable.getBounds().bottom);
    }
}
