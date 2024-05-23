package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.flexbox.b */
/* loaded from: classes2.dex */
public class C4004b {

    /* renamed from: e */
    int f15863e;

    /* renamed from: f */
    int f15864f;

    /* renamed from: g */
    int f15865g;

    /* renamed from: h */
    int f15866h;

    /* renamed from: i */
    int f15867i;

    /* renamed from: j */
    float f15868j;

    /* renamed from: k */
    float f15869k;

    /* renamed from: l */
    int f15870l;

    /* renamed from: m */
    int f15871m;

    /* renamed from: o */
    int f15873o;

    /* renamed from: p */
    int f15874p;

    /* renamed from: a */
    int f15859a = Integer.MAX_VALUE;

    /* renamed from: b */
    int f15860b = Integer.MAX_VALUE;

    /* renamed from: c */
    int f15861c = Integer.MIN_VALUE;

    /* renamed from: d */
    int f15862d = Integer.MIN_VALUE;

    /* renamed from: n */
    List f15872n = new ArrayList();

    /* renamed from: a */
    public int m18958a() {
        return this.f15865g;
    }

    /* renamed from: b */
    public int m18959b() {
        return this.f15866h - this.f15867i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m18960c(View view, int i11, int i12, int i13, int i14) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f15859a = Math.min(this.f15859a, (view.getLeft() - flexItem.mo18916d0()) - i11);
        this.f15860b = Math.min(this.f15860b, (view.getTop() - flexItem.mo18910A()) - i12);
        this.f15861c = Math.max(this.f15861c, view.getRight() + flexItem.mo18919s0() + i13);
        this.f15862d = Math.max(this.f15862d, view.getBottom() + flexItem.mo18915c0() + i14);
    }
}
