package com.zing.zalo.uicontrol;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1923p;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class ScrollControlGridLayoutManager extends GridLayoutManager {

    /* renamed from: R */
    private float f83437R;

    /* renamed from: S */
    private boolean f83438S;

    /* renamed from: com.zing.zalo.uicontrol.ScrollControlGridLayoutManager$a */
    /* loaded from: classes4.dex */
    private static class C16502a extends C1923p {

        /* renamed from: q */
        private final float f83439q;

        C16502a(Context context, float f11) {
            super(context);
            this.f83439q = f11;
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: s */
        public int mo10620s(int i11, int i12, int i13, int i14, int i15) {
            return i13 - i11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: v */
        public float mo10405v(DisplayMetrics displayMetrics) {
            return this.f83439q / displayMetrics.densityDpi;
        }
    }

    public ScrollControlGridLayoutManager(Context context, int i11) {
        super(context, i11);
        this.f83437R = 35.0f;
        this.f83438S = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: G1 */
    public void mo9729G1(RecyclerView recyclerView, RecyclerView.C1899z c1899z, int i11) {
        C16502a c16502a = new C16502a(recyclerView.getContext(), this.f83437R);
        c16502a.m10244p(i11);
        m10090H1(c16502a);
    }

    /* renamed from: h3 */
    public void m87991h3(boolean z11) {
        this.f83438S = z11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: x */
    public boolean mo9757x() {
        if (this.f83438S && super.mo9757x()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: y */
    public boolean mo9758y() {
        if (this.f83438S && super.mo9758y()) {
            return true;
        }
        return false;
    }

    public ScrollControlGridLayoutManager(Context context, int i11, int i12, boolean z11) {
        super(context, i11, i12, z11);
        this.f83437R = 35.0f;
        this.f83438S = true;
    }

    public ScrollControlGridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f83437R = 35.0f;
        this.f83438S = true;
    }
}
