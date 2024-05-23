package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.view.menu.C1074g;

/* renamed from: com.google.android.material.internal.e */
/* loaded from: classes3.dex */
public class C6338e extends C1072e {
    public C6338e(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C1072e, android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        C1074g c1074g = (C1074g) mo5073a(i11, i12, i13, charSequence);
        C6340g c6340g = new C6340g(m5095w(), this, c1074g);
        c1074g.m5126x(c6340g);
        return c6340g;
    }
}
