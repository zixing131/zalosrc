package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.view.menu.C1074g;

/* renamed from: com.google.android.material.navigation.a */
/* loaded from: classes3.dex */
public final class C6372a extends C1072e {

    /* renamed from: B */
    private final Class f35679B;

    /* renamed from: C */
    private final int f35680C;

    public C6372a(Context context, Class cls, int i11) {
        super(context);
        this.f35679B = cls;
        this.f35680C = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.C1072e
    /* renamed from: a */
    public MenuItem mo5073a(int i11, int i12, int i13, CharSequence charSequence) {
        if (size() + 1 <= this.f35680C) {
            m5085h0();
            MenuItem mo5073a = super.mo5073a(i11, i12, i13, charSequence);
            if (mo5073a instanceof C1074g) {
                ((C1074g) mo5073a).m5122t(true);
            }
            m5083g0();
            return mo5073a;
        }
        String simpleName = this.f35679B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f35680C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.C1072e, android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f35679B.getSimpleName() + " does not support submenus");
    }
}
