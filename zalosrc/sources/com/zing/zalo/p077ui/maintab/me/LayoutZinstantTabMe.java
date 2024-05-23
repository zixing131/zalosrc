package com.zing.zalo.p077ui.maintab.me;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi0.AbstractC2810d;
import com.zing.zalo.uicontrol.zinstant.ZinstantTabMeItem;
import com.zing.zalo.zdesign.component.Divider;
import fn0.AbstractC19074t;
import ui0.C27280g;
import zl0.AbstractC32232i;

/* loaded from: classes5.dex */
public final class LayoutZinstantTabMe extends LinearLayout {

    /* renamed from: p */
    private ZinstantTabMeItem f63373p;

    /* renamed from: q */
    private Divider f63374q;

    /* renamed from: r */
    private FrameLayout f63375r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutZinstantTabMe(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m67833b(context);
    }

    /* renamed from: a */
    public final void m67832a(C12158a c12158a) {
        ZinstantTabMeItem zinstantTabMeItem;
        if (c12158a != null && (zinstantTabMeItem = this.f63373p) != null) {
            zinstantTabMeItem.m88976f1(c12158a, this.f63375r);
        }
    }

    /* renamed from: b */
    public final void m67833b(Context context) {
        AbstractC19074t.m100208f(context, "context");
        setOrientation(1);
        ZinstantTabMeItem zinstantTabMeItem = new ZinstantTabMeItem(context);
        this.f63373p = zinstantTabMeItem;
        addView(zinstantTabMeItem);
        Divider divider = new Divider(context);
        divider.setLayoutParams(new LinearLayout.LayoutParams(-1, 30));
        divider.m90563c(AbstractC32232i.m155453a(56.0f), 0, 0, 0);
        this.f63374q = divider;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        frameLayout.setBackground(C27280g.m139658a(context, AbstractC2810d.stencils_list_bg));
        this.f63375r = frameLayout;
        frameLayout.addView(this.f63374q);
        FrameLayout frameLayout2 = this.f63375r;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        addView(this.f63375r);
    }

    /* renamed from: c */
    public void m67834c() {
        ZinstantTabMeItem zinstantTabMeItem = this.f63373p;
        if (zinstantTabMeItem != null) {
            zinstantTabMeItem.onPause();
        }
    }

    /* renamed from: d */
    public void m67835d() {
        ZinstantTabMeItem zinstantTabMeItem = this.f63373p;
        if (zinstantTabMeItem != null) {
            zinstantTabMeItem.onResume();
        }
    }

    /* renamed from: e */
    public void m67836e() {
        ZinstantTabMeItem zinstantTabMeItem = this.f63373p;
        if (zinstantTabMeItem != null) {
            zinstantTabMeItem.onStart();
        }
    }

    /* renamed from: f */
    public void m67837f() {
        ZinstantTabMeItem zinstantTabMeItem = this.f63373p;
        if (zinstantTabMeItem != null) {
            zinstantTabMeItem.onStop();
        }
    }

    public final Divider getDivider() {
        return this.f63374q;
    }

    public final FrameLayout getLine() {
        return this.f63375r;
    }

    public final ZinstantTabMeItem getZinstant() {
        return this.f63373p;
    }

    public final void setDivider(Divider divider) {
        this.f63374q = divider;
    }

    public final void setLine(FrameLayout frameLayout) {
        this.f63375r = frameLayout;
    }

    public final void setZinstant(ZinstantTabMeItem zinstantTabMeItem) {
        this.f63373p = zinstantTabMeItem;
    }
}
