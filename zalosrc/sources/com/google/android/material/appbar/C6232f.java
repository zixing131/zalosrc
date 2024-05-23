package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.AbstractC1579n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.f */
/* loaded from: classes3.dex */
public class C6232f {

    /* renamed from: a */
    private final View f34829a;

    /* renamed from: b */
    private int f34830b;

    /* renamed from: c */
    private int f34831c;

    /* renamed from: d */
    private int f34832d;

    /* renamed from: e */
    private int f34833e;

    /* renamed from: f */
    private boolean f34834f = true;

    /* renamed from: g */
    private boolean f34835g = true;

    public C6232f(View view) {
        this.f34829a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m31647a() {
        View view = this.f34829a;
        AbstractC1579n0.m7886l0(view, this.f34832d - (view.getTop() - this.f34830b));
        View view2 = this.f34829a;
        AbstractC1579n0.m7883k0(view2, this.f34833e - (view2.getLeft() - this.f34831c));
    }

    /* renamed from: b */
    public int m31648b() {
        return this.f34830b;
    }

    /* renamed from: c */
    public int m31649c() {
        return this.f34832d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m31650d() {
        this.f34830b = this.f34829a.getTop();
        this.f34831c = this.f34829a.getLeft();
    }

    /* renamed from: e */
    public boolean m31651e(int i11) {
        if (this.f34835g && this.f34833e != i11) {
            this.f34833e = i11;
            m31647a();
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m31652f(int i11) {
        if (this.f34834f && this.f34832d != i11) {
            this.f34832d = i11;
            m31647a();
            return true;
        }
        return false;
    }
}
