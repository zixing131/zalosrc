package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1923p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class SmoothScrollLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    float f83462I;

    /* renamed from: J */
    boolean f83463J;

    /* renamed from: K */
    boolean f83464K;

    /* renamed from: com.zing.zalo.uicontrol.SmoothScrollLinearLayoutManager$a */
    /* loaded from: classes4.dex */
    class C16507a extends C1923p {

        /* renamed from: q */
        final /* synthetic */ int f83465q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16507a(Context context, int i11) {
            super(context);
            this.f83465q = i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1898y
        /* renamed from: a */
        public PointF mo10229a(int i11) {
            return SmoothScrollLinearLayoutManager.this.mo9746d(i11);
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: s */
        public int mo10620s(int i11, int i12, int i13, int i14, int i15) {
            if (SmoothScrollLinearLayoutManager.this.f83464K) {
                return (i13 + ((i14 - i13) / 2)) - (i11 + ((i12 - i11) / 2));
            }
            return super.mo10620s(i11, i12, i13, i14, i15);
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: v */
        public float mo10405v(DisplayMetrics displayMetrics) {
            return (SmoothScrollLinearLayoutManager.this.f83462I / displayMetrics.densityDpi) / this.f83465q;
        }
    }

    public SmoothScrollLinearLayoutManager(Context context) {
        super(context);
        this.f83462I = 600.0f;
        this.f83463J = true;
        this.f83464K = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: G1 */
    public void mo9729G1(RecyclerView recyclerView, RecyclerView.C1899z c1899z, int i11) {
        int i12;
        int i13 = 1;
        if (i11 >= c1899z.m10253b()) {
            i11 = c1899z.m10253b() - 1;
        }
        int m9745c2 = m9745c2();
        int m9740Y1 = m9740Y1();
        if (m9745c2 == -1 && m9740Y1 == -1) {
            i12 = i11 + 1;
        } else if (i11 <= m9740Y1) {
            i12 = m9740Y1 - i11;
        } else if (i11 >= m9745c2) {
            i12 = i11 - m9745c2;
        } else {
            i12 = 0;
        }
        if (i12 > 0) {
            i13 = i12;
        }
        C16507a c16507a = new C16507a(recyclerView.getContext(), i13);
        c16507a.m10244p(i11);
        m10090H1(c16507a);
    }

    /* renamed from: N2 */
    public void m88005N2(float f11) {
        this.f83462I = f11;
    }

    /* renamed from: O2 */
    public void m88006O2(boolean z11) {
        this.f83463J = z11;
    }

    /* renamed from: P2 */
    public void m88007P2(boolean z11) {
        this.f83464K = z11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
    /* renamed from: x */
    public boolean mo9757x() {
        if (this.f83463J && super.mo9757x()) {
            return true;
        }
        return false;
    }

    public SmoothScrollLinearLayoutManager(Context context, int i11, boolean z11) {
        super(context, i11, z11);
        this.f83462I = 600.0f;
        this.f83463J = true;
        this.f83464K = false;
    }
}
