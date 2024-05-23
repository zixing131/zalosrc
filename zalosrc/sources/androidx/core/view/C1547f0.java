package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.core.view.f0 */
/* loaded from: classes2.dex */
public class C1547f0 {

    /* renamed from: a */
    private int f6496a;

    /* renamed from: b */
    private int f6497b;

    public C1547f0(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m7761a() {
        return this.f6496a | this.f6497b;
    }

    /* renamed from: b */
    public void m7762b(View view, View view2, int i11) {
        m7763c(view, view2, i11, 0);
    }

    /* renamed from: c */
    public void m7763c(View view, View view2, int i11, int i12) {
        if (i12 == 1) {
            this.f6497b = i11;
        } else {
            this.f6496a = i11;
        }
    }

    /* renamed from: d */
    public void m7764d(View view) {
        m7765e(view, 0);
    }

    /* renamed from: e */
    public void m7765e(View view, int i11) {
        if (i11 == 1) {
            this.f6497b = 0;
        } else {
            this.f6496a = 0;
        }
    }
}
