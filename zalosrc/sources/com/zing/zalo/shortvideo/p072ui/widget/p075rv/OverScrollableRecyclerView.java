package com.zing.zalo.shortvideo.p072ui.widget.p075rv;

import ag0.C0843s0;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hn0.AbstractC20104d;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ln0.AbstractC22543l;
import ln0.C22535d;
import ln0.C22537f;
import pm0.C24848g0;

/* loaded from: classes5.dex */
public class OverScrollableRecyclerView extends RecyclerView {

    /* renamed from: V0 */
    private final ArrayList f54617V0;

    /* renamed from: W0 */
    private float f54618W0;

    /* renamed from: X0 */
    private float f54619X0;

    /* renamed from: Y0 */
    private int f54620Y0;

    /* renamed from: Z0 */
    private int f54621Z0;

    /* renamed from: a1 */
    private int f54622a1;

    /* renamed from: b1 */
    private int f54623b1;

    /* renamed from: c1 */
    private int f54624c1;

    /* renamed from: d1 */
    private int f54625d1;

    /* loaded from: classes5.dex */
    public static class GridLayoutManager extends androidx.recyclerview.widget.GridLayoutManager implements InterfaceC10834e {

        /* renamed from: R */
        private final C10833d f54626R;

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$GridLayoutManager$a */
        /* loaded from: classes5.dex */
        static final class C10824a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: r */
            final /* synthetic */ RecyclerView.C1894u f54628r;

            /* renamed from: s */
            final /* synthetic */ RecyclerView.C1899z f54629s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10824a(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
                super(1);
                this.f54628r = c1894u;
                this.f54629s = c1899z;
            }

            /* renamed from: a */
            public final Integer m56154a(int i11) {
                return Integer.valueOf(GridLayoutManager.super.mo9676u1(i11, this.f54628r, this.f54629s));
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                return m56154a(((Number) obj).intValue());
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$GridLayoutManager$b */
        /* loaded from: classes5.dex */
        public static final class C10825b extends AbstractC19075u implements InterfaceC18505l {
            C10825b() {
                super(1);
            }

            /* renamed from: a */
            public final void m56155a(int i11) {
                GridLayoutManager.super.mo9756v1(i11);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m56155a(((Number) obj).intValue());
                return C24848g0.f119245a;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$GridLayoutManager$c */
        /* loaded from: classes5.dex */
        static final class C10826c extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: r */
            final /* synthetic */ RecyclerView.C1894u f54632r;

            /* renamed from: s */
            final /* synthetic */ RecyclerView.C1899z f54633s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10826c(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
                super(1);
                this.f54632r = c1894u;
                this.f54633s = c1899z;
            }

            /* renamed from: a */
            public final Integer m56156a(int i11) {
                return Integer.valueOf(GridLayoutManager.super.mo9677w1(i11, this.f54632r, this.f54633s));
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                return m56156a(((Number) obj).intValue());
            }
        }

        public /* synthetic */ GridLayoutManager(Context context, int i11, int i12, boolean z11, boolean z12, int i13, AbstractC19060k abstractC19060k) {
            this(context, i11, (i13 & 4) != 0 ? 1 : i12, (i13 & 8) != 0 ? false : z11, (i13 & 16) != 0 ? false : z12);
        }

        /* renamed from: k3 */
        private final int m56151k3() {
            int intValue;
            View mo9732P;
            C22537f m116593p;
            C22535d m116592o;
            int i11;
            int i12;
            int i13;
            if (m10110a() == 0) {
                return 0;
            }
            Integer valueOf = Integer.valueOf(m9740Y1());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf == null || (mo9732P = mo9732P((intValue = valueOf.intValue()))) == null) {
                return 0;
            }
            int m56213u = this.f54626R.m56213u(mo9732P);
            if (intValue == this.f54626R.m56199A()[0]) {
                return m56213u + this.f54626R.m56199A()[1];
            }
            C10833d c10833d = this.f54626R;
            m116593p = AbstractC22543l.m116593p(0, intValue);
            m116592o = AbstractC22543l.m116592o(m116593p, m9668X2());
            int m116547d = m116592o.m116547d();
            int m116548e = m116592o.m116548e();
            int m116549g = m116592o.m116549g();
            if ((m116549g > 0 && m116547d <= m116548e) || (m116549g < 0 && m116548e <= m116547d)) {
                i11 = 0;
                while (true) {
                    Integer num = (Integer) c10833d.m56214v().get(Integer.valueOf(m116547d));
                    if (num != null) {
                        i12 = num.intValue();
                    } else {
                        i12 = 0;
                    }
                    int m9668X2 = m9668X2();
                    for (int i14 = 1; i14 < m9668X2; i14++) {
                        Integer num2 = (Integer) c10833d.m56214v().get(Integer.valueOf(m116547d + i14));
                        if (num2 != null) {
                            i13 = num2.intValue();
                        } else {
                            i13 = 0;
                        }
                        i12 = Math.max(i12, i13);
                    }
                    i11 += i12;
                    if (m116547d == m116548e) {
                        break;
                    }
                    m116547d += m116549g;
                }
            } else {
                i11 = 0;
            }
            c10833d.m56199A()[0] = intValue;
            c10833d.m56199A()[1] = i11;
            return m56213u + i11;
        }

        /* renamed from: l3 */
        private final int m56152l3() {
            int i11;
            C10833d c10833d = this.f54626R;
            int m56200B = c10833d.m56200B();
            if (m56200B < 0) {
                int i12 = 0;
                for (Map.Entry entry : c10833d.m56214v().entrySet()) {
                    int intValue = ((Number) entry.getKey()).intValue();
                    int intValue2 = ((Number) entry.getValue()).intValue();
                    if (intValue % m9668X2() == 0) {
                        int m9668X2 = m9668X2();
                        for (int i13 = 1; i13 < m9668X2; i13++) {
                            Integer num = (Integer) c10833d.m56214v().get(Integer.valueOf(intValue + i13));
                            if (num != null) {
                                i11 = num.intValue();
                            } else {
                                i11 = 0;
                            }
                            intValue2 = Math.max(intValue2, i11);
                        }
                        i12 += intValue2;
                    }
                }
                c10833d.m56206K(i12);
                return i12;
            }
            return m56200B;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: D */
        public int mo9724D(RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(c1899z, "state");
            return Math.min(mo9650F(c1899z), (getWidth() - getPaddingLeft()) - getPaddingRight());
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: E */
        public int mo9648E(RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(c1899z, "state");
            return m56151k3();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: E0 */
        public void mo10087E0(RecyclerView recyclerView) {
            AbstractC19074t.m100208f(recyclerView, "view");
            super.mo10087E0(recyclerView);
            this.f54626R.m56201C(recyclerView);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: F */
        public int mo9650F(RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(c1899z, "state");
            return m56152l3();
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: G */
        public int mo9727G(RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(c1899z, "state");
            return Math.min(mo9653I(c1899z), (getHeight() - getPaddingTop()) - getPaddingBottom());
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: G0 */
        public void mo9728G0(RecyclerView recyclerView, RecyclerView.C1894u c1894u) {
            AbstractC19074t.m100208f(recyclerView, "view");
            AbstractC19074t.m100208f(c1894u, "recycler");
            super.mo9728G0(recyclerView, c1894u);
            this.f54626R.m56202D(recyclerView, c1894u);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: H */
        public int mo9651H(RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(c1899z, "state");
            return m56151k3();
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: I */
        public int mo9653I(RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(c1899z, "state");
            return m56152l3();
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: P0 */
        public void mo9657P0(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo9657P0(recyclerView, i11, i12);
            this.f54626R.m56208U(i11, i12);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: Q0 */
        public void mo9659Q0(RecyclerView recyclerView) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo9659Q0(recyclerView);
            this.f54626R.m56209V();
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: R0 */
        public void mo9661R0(RecyclerView recyclerView, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo9661R0(recyclerView, i11, i12, i13);
            this.f54626R.m56210W(i11, i12);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: S0 */
        public void mo9663S0(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo9663S0(recyclerView, i11, i12);
            this.f54626R.m56211X(i11, i12);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10834e
        /* renamed from: m */
        public boolean mo56153m(int i11, int i12) {
            return this.f54626R.m56212r(i11, i12);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: u1 */
        public int mo9676u1(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
            return this.f54626R.m56204G(i11, new C10824a(c1894u, c1899z));
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: v1 */
        public void mo9756v1(int i11) {
            this.f54626R.m56205H(i11, new C10825b());
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: w1 */
        public int mo9677w1(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
            return this.f54626R.m56204G(i11, new C10826c(c1894u, c1899z));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: x0 */
        public void mo10161x0(View view, int i11, int i12, int i13, int i14) {
            AbstractC19074t.m100208f(view, "child");
            super.mo10161x0(view, i11, i12, i13, i14);
            this.f54626R.m56207T(view);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GridLayoutManager(Context context, int i11, int i12, boolean z11, boolean z12) {
            super(context, i11, i12, z11);
            AbstractC19074t.m100208f(context, "context");
            this.f54626R = new C10833d(this, z12);
        }
    }

    /* loaded from: classes5.dex */
    public static class LinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager implements InterfaceC10834e {

        /* renamed from: I */
        private final C10833d f54634I;

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$LinearLayoutManager$a */
        /* loaded from: classes5.dex */
        static final class C10827a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: r */
            final /* synthetic */ RecyclerView.C1894u f54636r;

            /* renamed from: s */
            final /* synthetic */ RecyclerView.C1899z f54637s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10827a(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
                super(1);
                this.f54636r = c1894u;
                this.f54637s = c1899z;
            }

            /* renamed from: a */
            public final Integer m56162a(int i11) {
                return Integer.valueOf(LinearLayoutManager.super.mo9676u1(i11, this.f54636r, this.f54637s));
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                return m56162a(((Number) obj).intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$LinearLayoutManager$b */
        /* loaded from: classes5.dex */
        public static final class C10828b extends AbstractC19075u implements InterfaceC18505l {
            C10828b() {
                super(1);
            }

            /* renamed from: a */
            public final void m56163a(int i11) {
                LinearLayoutManager.super.mo9756v1(i11);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m56163a(((Number) obj).intValue());
                return C24848g0.f119245a;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$LinearLayoutManager$c */
        /* loaded from: classes5.dex */
        static final class C10829c extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: r */
            final /* synthetic */ RecyclerView.C1894u f54640r;

            /* renamed from: s */
            final /* synthetic */ RecyclerView.C1899z f54641s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10829c(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
                super(1);
                this.f54640r = c1894u;
                this.f54641s = c1899z;
            }

            /* renamed from: a */
            public final Integer m56164a(int i11) {
                return Integer.valueOf(LinearLayoutManager.super.mo9677w1(i11, this.f54640r, this.f54641s));
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                return m56164a(((Number) obj).intValue());
            }
        }

        public /* synthetic */ LinearLayoutManager(Context context, int i11, boolean z11, boolean z12, int i12, AbstractC19060k abstractC19060k) {
            this(context, (i12 & 2) != 0 ? 1 : i11, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? false : z12);
        }

        /* renamed from: Q2 */
        private final int m56160Q2() {
            int intValue;
            View mo9732P;
            int i11;
            if (m10110a() == 0) {
                return 0;
            }
            Integer valueOf = Integer.valueOf(m9740Y1());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf == null || (mo9732P = mo9732P((intValue = valueOf.intValue()))) == null) {
                return 0;
            }
            int m56213u = this.f54634I.m56213u(mo9732P);
            if (m56213u < 0) {
                m56213u = 0;
            }
            if (intValue == this.f54634I.m56199A()[0]) {
                return m56213u + this.f54634I.m56199A()[1];
            }
            C10833d c10833d = this.f54634I;
            int i12 = 0;
            for (int i13 = 0; i13 < intValue; i13++) {
                Integer num = (Integer) c10833d.m56214v().get(Integer.valueOf(i13));
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 0;
                }
                i12 += i11;
            }
            c10833d.m56199A()[0] = intValue;
            c10833d.m56199A()[1] = i12;
            return m56213u + i12;
        }

        /* renamed from: R2 */
        private final int m56161R2() {
            C10833d c10833d = this.f54634I;
            int m56200B = c10833d.m56200B();
            if (m56200B < 0) {
                Iterator it = c10833d.m56214v().entrySet().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    i11 += ((Number) ((Map.Entry) it.next()).getValue()).intValue();
                }
                c10833d.m56206K(i11);
                return i11;
            }
            return m56200B;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: D */
        public int mo9724D(RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(c1899z, "state");
            return Math.min(mo9650F(c1899z), (getWidth() - getPaddingLeft()) - getPaddingRight());
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: E */
        public int mo9648E(RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(c1899z, "state");
            return m56160Q2();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: E0 */
        public void mo10087E0(RecyclerView recyclerView) {
            AbstractC19074t.m100208f(recyclerView, "view");
            super.mo10087E0(recyclerView);
            this.f54634I.m56201C(recyclerView);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: F */
        public int mo9650F(RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(c1899z, "state");
            return m56161R2();
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: G */
        public int mo9727G(RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(c1899z, "state");
            return Math.min(mo9653I(c1899z), (getHeight() - getPaddingTop()) - getPaddingBottom());
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: G0 */
        public void mo9728G0(RecyclerView recyclerView, RecyclerView.C1894u c1894u) {
            AbstractC19074t.m100208f(recyclerView, "view");
            AbstractC19074t.m100208f(c1894u, "recycler");
            super.mo9728G0(recyclerView, c1894u);
            this.f54634I.m56202D(recyclerView, c1894u);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: H */
        public int mo9651H(RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(c1899z, "state");
            return m56160Q2();
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: I */
        public int mo9653I(RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(c1899z, "state");
            return m56161R2();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: P0 */
        public void mo9657P0(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo9657P0(recyclerView, i11, i12);
            this.f54634I.m56208U(i11, i12);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: Q0 */
        public void mo9659Q0(RecyclerView recyclerView) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo9659Q0(recyclerView);
            this.f54634I.m56209V();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: R0 */
        public void mo9661R0(RecyclerView recyclerView, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo9661R0(recyclerView, i11, i12, i13);
            this.f54634I.m56210W(i11, i12);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: S0 */
        public void mo9663S0(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo9663S0(recyclerView, i11, i12);
            this.f54634I.m56211X(i11, i12);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10834e
        /* renamed from: m */
        public boolean mo56153m(int i11, int i12) {
            return this.f54634I.m56212r(i11, i12);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: u1 */
        public int mo9676u1(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
            return this.f54634I.m56204G(i11, new C10827a(c1894u, c1899z));
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: v1 */
        public void mo9756v1(int i11) {
            this.f54634I.m56205H(i11, new C10828b());
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: w1 */
        public int mo9677w1(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
            return this.f54634I.m56204G(i11, new C10829c(c1894u, c1899z));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: x0 */
        public void mo10161x0(View view, int i11, int i12, int i13, int i14) {
            AbstractC19074t.m100208f(view, "child");
            super.mo10161x0(view, i11, i12, i13, i14);
            this.f54634I.m56207T(view);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinearLayoutManager(Context context, int i11, boolean z11, boolean z12) {
            super(context, i11, z11);
            AbstractC19074t.m100208f(context, "context");
            this.f54634I = new C10833d(this, z12);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10830a {
        /* renamed from: a */
        void mo52660a(float f11, float f12);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC10831b {
        /* renamed from: a */
        void mo54127a(float f11, int i11);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC10832c {
        /* renamed from: a */
        void mo53961a();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$d */
    /* loaded from: classes5.dex */
    public static final class C10833d {

        /* renamed from: a */
        private final InterfaceC10834e f54642a;

        /* renamed from: b */
        private final boolean f54643b;

        /* renamed from: c */
        private OverScrollableRecyclerView f54644c;

        /* renamed from: d */
        private Animator f54645d;

        /* renamed from: e */
        private Context f54646e;

        /* renamed from: f */
        private final Map f54647f;

        /* renamed from: g */
        private final int[] f54648g;

        /* renamed from: h */
        private int f54649h;

        /* renamed from: i */
        private int f54650i;

        /* renamed from: j */
        private int f54651j;

        /* renamed from: k */
        private int f54652k;

        /* renamed from: l */
        private int f54653l;

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends RecyclerView.AbstractC1892s {
            a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
            /* renamed from: b */
            public void mo952b(RecyclerView recyclerView, int i11) {
                Animator animator;
                AbstractC19074t.m100208f(recyclerView, "recyclerView");
                if (i11 == 0) {
                    if (C10833d.this.f54651j != 0 && ((animator = C10833d.this.f54645d) == null || !animator.isRunning())) {
                        int i12 = C10833d.this.f54652k | C10833d.this.f54653l;
                        if (i12 != 0) {
                            int i13 = i12 / 60;
                            if (C10833d.this.f54651j * i12 < 0) {
                                C10833d c10833d = C10833d.this;
                                float m56198z = c10833d.m56198z(c10833d.f54651j);
                                C10833d c10833d2 = C10833d.this;
                                c10833d.m56168L(m56198z, c10833d2.m56198z(c10833d2.f54651j - i13));
                            } else {
                                C10833d c10833d3 = C10833d.this;
                                c10833d3.m56170N(c10833d3.m56198z(c10833d3.f54651j), i13, i12);
                            }
                        } else {
                            C10833d c10833d4 = C10833d.this;
                            c10833d4.m56174R(c10833d4.m56198z(c10833d4.f54651j));
                        }
                        C10833d.this.f54652k = 0;
                        C10833d.this.f54653l = 0;
                    }
                    C10833d.this.f54651j = 0;
                }
                C10833d.this.f54650i = i11;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$d$b */
        /* loaded from: classes5.dex */
        public static final class b implements Animator.AnimatorListener {

            /* renamed from: q */
            final /* synthetic */ float f54656q;

            public b(float f11) {
                this.f54656q = f11;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
                C10833d.this.m56174R(this.f54656q);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$d$c */
        /* loaded from: classes5.dex */
        public static final class c implements Animator.AnimatorListener {

            /* renamed from: q */
            final /* synthetic */ int f54658q;

            public c(int i11) {
                this.f54658q = i11;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
                OverScrollableRecyclerView overScrollableRecyclerView = C10833d.this.f54644c;
                if (overScrollableRecyclerView != null) {
                    int i11 = this.f54658q;
                    overScrollableRecyclerView.mo9906x0(i11, i11);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$d$d */
        /* loaded from: classes5.dex */
        public static final class d implements Animator.AnimatorListener {

            /* renamed from: q */
            final /* synthetic */ float f54660q;

            public d(float f11) {
                this.f54660q = f11;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
                C10833d.this.m56174R(this.f54660q);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
            }
        }

        public C10833d(InterfaceC10834e interfaceC10834e, boolean z11) {
            AbstractC19074t.m100208f(interfaceC10834e, "layoutManager");
            this.f54642a = interfaceC10834e;
            this.f54643b = z11;
            this.f54647f = new LinkedHashMap();
            this.f54648g = new int[2];
            this.f54649h = -1;
        }

        /* renamed from: F */
        private final void m56165F(int i11) {
            if (this.f54642a.m56220h() == 0) {
                OverScrollableRecyclerView overScrollableRecyclerView = this.f54644c;
                if (overScrollableRecyclerView != null) {
                    overScrollableRecyclerView.scrollBy(i11, 0);
                    return;
                }
                return;
            }
            OverScrollableRecyclerView overScrollableRecyclerView2 = this.f54644c;
            if (overScrollableRecyclerView2 != null) {
                overScrollableRecyclerView2.scrollBy(0, i11);
            }
        }

        /* renamed from: I */
        private final void m56166I(ValueAnimator valueAnimator, long j11) {
            ContentResolver contentResolver;
            Context applicationContext;
            try {
                Field declaredField = valueAnimator.getClass().getDeclaredField("sDurationScale");
                declaredField.setAccessible(true);
                declaredField.set(declaredField, Float.valueOf(1.0f));
                valueAnimator.setDuration(j11);
            } catch (Exception unused) {
                Context context = this.f54646e;
                if (context != null && (applicationContext = context.getApplicationContext()) != null) {
                    contentResolver = applicationContext.getContentResolver();
                } else {
                    contentResolver = null;
                }
                valueAnimator.setDuration(((float) j11) / Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f));
            }
        }

        /* renamed from: J */
        private final void m56167J(float f11) {
            if (this.f54642a.m56220h() == 0) {
                OverScrollableRecyclerView overScrollableRecyclerView = this.f54644c;
                if (overScrollableRecyclerView != null) {
                    overScrollableRecyclerView.setOffsetX(f11);
                    return;
                }
                return;
            }
            OverScrollableRecyclerView overScrollableRecyclerView2 = this.f54644c;
            if (overScrollableRecyclerView2 != null) {
                overScrollableRecyclerView2.setOffsetY(f11);
            }
        }

        /* renamed from: L */
        public final void m56168L(float f11, float f12) {
            float abs = ((float) 150) * Math.abs(f12 - f11);
            if (m56195w() > 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f12);
                AbstractC19074t.m100205c(ofFloat);
                m56166I(ofFloat, abs / (r1 * 0.25f));
                ofFloat.addListener(new b(f12));
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.shortvideo.ui.widget.rv.d
                    public /* synthetic */ C10840d() {
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        OverScrollableRecyclerView.C10833d.m56169M(OverScrollableRecyclerView.C10833d.this, valueAnimator);
                    }
                });
                ofFloat.setInterpolator(new DecelerateInterpolator(1.5f));
                this.f54645d = ofFloat;
                ofFloat.start();
            }
        }

        /* renamed from: M */
        public static final void m56169M(C10833d c10833d, ValueAnimator valueAnimator) {
            AbstractC19074t.m100208f(c10833d, "this$0");
            AbstractC19074t.m100208f(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c10833d.m56167J(((Float) animatedValue).floatValue());
        }

        /* renamed from: N */
        public final void m56170N(float f11, int i11, int i12) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
            AbstractC19074t.m100205c(ofFloat);
            m56166I(ofFloat, (16 * f11) / i11);
            ofFloat.addListener(new c(i12));
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.shortvideo.ui.widget.rv.a
                public /* synthetic */ C10837a() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    OverScrollableRecyclerView.C10833d.m56171O(OverScrollableRecyclerView.C10833d.this, valueAnimator);
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            this.f54645d = ofFloat;
            ofFloat.start();
        }

        /* renamed from: O */
        public static final void m56171O(C10833d c10833d, ValueAnimator valueAnimator) {
            AbstractC19074t.m100208f(c10833d, "this$0");
            AbstractC19074t.m100208f(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c10833d.m56167J(((Float) animatedValue).floatValue());
        }

        /* renamed from: P */
        private final void m56172P(float f11, float f12) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f12);
            AbstractC19074t.m100205c(ofFloat);
            m56166I(ofFloat, 150L);
            ofFloat.addListener(new d(f12));
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.shortvideo.ui.widget.rv.c
                public /* synthetic */ C10839c() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    OverScrollableRecyclerView.C10833d.m56173Q(OverScrollableRecyclerView.C10833d.this, valueAnimator);
                }
            });
            ofFloat.setInterpolator(new DecelerateInterpolator(1.5f));
            this.f54645d = ofFloat;
            ofFloat.start();
        }

        /* renamed from: Q */
        public static final void m56173Q(C10833d c10833d, ValueAnimator valueAnimator) {
            AbstractC19074t.m100208f(c10833d, "this$0");
            AbstractC19074t.m100208f(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c10833d.m56167J(((Float) animatedValue).floatValue());
        }

        /* renamed from: R */
        public final void m56174R(float f11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
            AbstractC19074t.m100205c(ofFloat);
            m56166I(ofFloat, 500L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.shortvideo.ui.widget.rv.b
                public /* synthetic */ C10838b() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    OverScrollableRecyclerView.C10833d.m56175S(OverScrollableRecyclerView.C10833d.this, valueAnimator);
                }
            });
            ofFloat.setInterpolator(new DecelerateInterpolator(1.5f));
            this.f54645d = ofFloat;
            ofFloat.start();
        }

        /* renamed from: S */
        public static final void m56175S(C10833d c10833d, ValueAnimator valueAnimator) {
            AbstractC19074t.m100208f(c10833d, "this$0");
            AbstractC19074t.m100208f(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c10833d.m56167J(((Float) animatedValue).floatValue());
        }

        /* renamed from: s */
        private final boolean m56193s() {
            if (this.f54642a.m56220h() == 0) {
                OverScrollableRecyclerView overScrollableRecyclerView = this.f54644c;
                if (overScrollableRecyclerView == null || !overScrollableRecyclerView.canScrollHorizontally(-1)) {
                    return false;
                }
            } else {
                OverScrollableRecyclerView overScrollableRecyclerView2 = this.f54644c;
                if (overScrollableRecyclerView2 == null || !overScrollableRecyclerView2.canScrollVertically(-1)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: t */
        private final boolean m56194t() {
            if (this.f54642a.m56220h() == 0) {
                OverScrollableRecyclerView overScrollableRecyclerView = this.f54644c;
                if (overScrollableRecyclerView == null || !overScrollableRecyclerView.canScrollHorizontally(1)) {
                    return false;
                }
            } else {
                OverScrollableRecyclerView overScrollableRecyclerView2 = this.f54644c;
                if (overScrollableRecyclerView2 == null || !overScrollableRecyclerView2.canScrollVertically(1)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: w */
        private final int m56195w() {
            if (this.f54642a.m56220h() == 0) {
                return this.f54642a.getWidth();
            }
            return this.f54642a.getHeight();
        }

        /* renamed from: x */
        private final float m56196x() {
            if (this.f54642a.m56220h() == 0) {
                OverScrollableRecyclerView overScrollableRecyclerView = this.f54644c;
                if (overScrollableRecyclerView == null) {
                    return 0.0f;
                }
                return overScrollableRecyclerView.getOffsetX();
            }
            OverScrollableRecyclerView overScrollableRecyclerView2 = this.f54644c;
            if (overScrollableRecyclerView2 == null) {
                return 0.0f;
            }
            return overScrollableRecyclerView2.getOffsetY();
        }

        /* renamed from: y */
        private final int m56197y(float f11) {
            int m56195w = m56195w();
            if (m56195w > 0) {
                return (int) (Math.signum(f11) * m56195w * (0.5f - ((float) Math.sqrt(0.25f - (Math.abs(f11) / r0)))));
            }
            return 0;
        }

        /* renamed from: z */
        public final float m56198z(int i11) {
            int m56195w = m56195w();
            if (m56195w > 0) {
                float min = Math.min(Math.abs(i11), m56195w / 2);
                return Math.signum(i11) * (((((-1.0f) * min) * min) / m56195w) + min);
            }
            return 0.0f;
        }

        /* renamed from: A */
        public final int[] m56199A() {
            return this.f54648g;
        }

        /* renamed from: B */
        public final int m56200B() {
            return this.f54649h;
        }

        /* renamed from: C */
        public final void m56201C(RecyclerView recyclerView) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            recyclerView.m9826E(new a());
            this.f54646e = recyclerView.getContext();
            this.f54644c = (OverScrollableRecyclerView) recyclerView;
        }

        /* renamed from: D */
        public final void m56202D(RecyclerView recyclerView, RecyclerView.C1894u c1894u) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            AbstractC19074t.m100208f(c1894u, "recycler");
            Animator animator = this.f54645d;
            if (animator != null) {
                animator.cancel();
            }
        }

        /* renamed from: E */
        public final void m56203E() {
            this.f54648g[0] = -1;
            this.f54649h = -1;
        }

        /* renamed from: G */
        public final int m56204G(int i11, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "superFunction");
            if (!m56193s() && !m56194t() && (!this.f54643b || this.f54642a.m56215a() == 0)) {
                return ((Number) interfaceC18505l.mo205i9(Integer.valueOf(i11))).intValue();
            }
            float m56196x = m56196x();
            int i12 = 0;
            if ((m56196x < 0.0f && m56194t()) || (m56196x > 0.0f && m56193s())) {
                m56167J(0.0f);
                this.f54651j = 0;
                m56165F(-((int) m56196x));
            }
            OverScrollableRecyclerView overScrollableRecyclerView = this.f54644c;
            int i13 = 1;
            if (overScrollableRecyclerView != null) {
                overScrollableRecyclerView.requestDisallowInterceptTouchEvent(true);
            }
            Animator animator = this.f54645d;
            if (animator != null && animator.isRunning() && this.f54650i == 1) {
                Animator animator2 = this.f54645d;
                if (animator2 != null) {
                    animator2.cancel();
                }
                this.f54651j = m56197y(m56196x());
            }
            int i14 = this.f54651j;
            if (i14 * i11 <= 0) {
                Number number = (Number) interfaceC18505l.mo205i9(Integer.valueOf(i11));
                int intValue = number.intValue();
                if (i11 != intValue) {
                    int i15 = this.f54651j + (intValue - i11);
                    this.f54651j = i15;
                    m56167J(m56198z(i15));
                    if (this.f54650i == 2) {
                        m56172P(m56196x(), m56196x() - i11);
                    }
                }
                return number.intValue();
            }
            if (Math.abs(i14) > m56195w() / 2) {
                if (this.f54651j <= 0) {
                    i13 = -1;
                }
                this.f54651j = i13 * (m56195w() / 2);
            }
            float m56198z = m56198z(this.f54651j);
            if (Math.abs(m56198z) >= Math.abs(i11)) {
                int m56197y = m56197y(m56198z - i11);
                this.f54651j = m56197y;
                m56167J(m56198z(m56197y));
            } else {
                int i16 = i11 - ((int) m56198z);
                Number number2 = (Number) interfaceC18505l.mo205i9(Integer.valueOf(i16));
                int intValue2 = number2.intValue();
                if (intValue2 == i16) {
                    m56167J(0.0f);
                    this.f54651j = 0;
                } else {
                    int i17 = intValue2 - i16;
                    this.f54651j = i17;
                    m56167J(m56198z(i17));
                }
                i12 = number2.intValue();
            }
            return i12;
        }

        /* renamed from: H */
        public final void m56205H(int i11, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "superFunction");
            OverScrollableRecyclerView overScrollableRecyclerView = this.f54644c;
            if (overScrollableRecyclerView != null) {
                overScrollableRecyclerView.m9866X1();
            }
            interfaceC18505l.mo205i9(Integer.valueOf(i11));
        }

        /* renamed from: K */
        public final void m56206K(int i11) {
            this.f54649h = i11;
        }

        /* renamed from: T */
        public final void m56207T(View view) {
            AbstractC19074t.m100208f(view, "child");
            InterfaceC10834e interfaceC10834e = this.f54642a;
            if (interfaceC10834e.m56220h() == 0) {
                this.f54647f.put(Integer.valueOf(interfaceC10834e.m56216b(view)), Integer.valueOf(interfaceC10834e.m56218e(view)));
            } else {
                this.f54647f.put(Integer.valueOf(interfaceC10834e.m56216b(view)), Integer.valueOf(interfaceC10834e.m56225n(view)));
            }
            m56203E();
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:            if (((java.lang.Integer) r2.put(java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r3.intValue()))) == null) goto L26;     */
        /* renamed from: U */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m56208U(int i11, int i12) {
            int m56221i = this.f54642a.m56221i() - 1;
            int i13 = i11 + i12;
            if (i13 <= m56221i) {
                while (true) {
                    Map map = this.f54647f;
                    Integer num = (Integer) map.get(Integer.valueOf(m56221i - i12));
                    if (num != null) {
                    }
                    if (m56221i == i13) {
                        break;
                    } else {
                        m56221i--;
                    }
                }
            }
            while (i11 < i13) {
                this.f54647f.remove(Integer.valueOf(i11));
                i11++;
            }
            m56203E();
        }

        /* renamed from: V */
        public final void m56209V() {
            this.f54647f.clear();
            m56203E();
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:            if (((java.lang.Integer) r2.put(java.lang.Integer.valueOf(r6), java.lang.Integer.valueOf(r3.intValue()))) == null) goto L49;     */
        /* renamed from: W */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m56210W(int i11, int i12) {
            int i13;
            Integer num = (Integer) this.f54647f.get(Integer.valueOf(i11));
            if (num != null) {
                i13 = num.intValue();
            } else {
                i13 = 0;
            }
            if (i11 < i12) {
                while (i11 < i12) {
                    Map map = this.f54647f;
                    int i14 = i11 + 1;
                    Integer num2 = (Integer) map.get(Integer.valueOf(i14));
                    if (num2 != null) {
                        if (((Integer) map.put(Integer.valueOf(i11), Integer.valueOf(num2.intValue()))) != null) {
                            i11 = i14;
                        }
                    }
                    i11 = i14;
                }
            } else {
                int i15 = i12 + 1;
                if (i15 <= i11) {
                    while (true) {
                        Map map2 = this.f54647f;
                        Integer num3 = (Integer) map2.get(Integer.valueOf(i11 - 1));
                        if (num3 != null) {
                        }
                        if (i11 == i15) {
                            break;
                        } else {
                            i11--;
                        }
                    }
                }
            }
            this.f54647f.put(Integer.valueOf(i12), Integer.valueOf(i13));
            m56203E();
        }

        /* renamed from: X */
        public final void m56211X(int i11, int i12) {
            int m56221i = this.f54642a.m56221i() + i12;
            while (i11 < m56221i) {
                Map map = this.f54647f;
                Integer num = (Integer) map.get(Integer.valueOf(i11 + i12));
                if (num != null) {
                    if (((Integer) map.put(Integer.valueOf(i11), Integer.valueOf(num.intValue()))) != null) {
                        i11++;
                    }
                }
                i11++;
            }
            m56203E();
        }

        /* renamed from: r */
        public final boolean m56212r(int i11, int i12) {
            boolean z11 = this.f54651j == 0;
            if (!z11) {
                this.f54652k = i11;
                this.f54653l = i12;
            }
            return z11;
        }

        /* renamed from: u */
        public final int m56213u(View view) {
            AbstractC19074t.m100208f(view, "child");
            InterfaceC10834e interfaceC10834e = this.f54642a;
            if (interfaceC10834e.m56220h() == 0) {
                if (interfaceC10834e.m56217c()) {
                    return (interfaceC10834e.m56223k(view) + interfaceC10834e.getPaddingRight()) - interfaceC10834e.getWidth();
                }
                return (-interfaceC10834e.m56219f(view)) + interfaceC10834e.getPaddingLeft();
            }
            if (interfaceC10834e.m56217c()) {
                return (interfaceC10834e.m56222j(view) + interfaceC10834e.getPaddingBottom()) - interfaceC10834e.getHeight();
            }
            return (-interfaceC10834e.m56224l(view)) + interfaceC10834e.getPaddingTop();
        }

        /* renamed from: v */
        public final Map m56214v() {
            return this.f54647f;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$e */
    /* loaded from: classes5.dex */
    public interface InterfaceC10834e {
        /* renamed from: a */
        int m56215a();

        /* renamed from: b */
        int m56216b(View view);

        /* renamed from: c */
        boolean m56217c();

        /* renamed from: e */
        int m56218e(View view);

        /* renamed from: f */
        int m56219f(View view);

        int getHeight();

        int getPaddingBottom();

        int getPaddingLeft();

        int getPaddingRight();

        int getPaddingTop();

        int getWidth();

        /* renamed from: h */
        int m56220h();

        /* renamed from: i */
        int m56221i();

        /* renamed from: j */
        int m56222j(View view);

        /* renamed from: k */
        int m56223k(View view);

        /* renamed from: l */
        int m56224l(View view);

        /* renamed from: m */
        boolean mo56153m(int i11, int i12);

        /* renamed from: n */
        int m56225n(View view);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$f */
    /* loaded from: classes5.dex */
    public static final class C10835f implements InterfaceC10830a {

        /* renamed from: a */
        private float f54661a;

        /* renamed from: c */
        final /* synthetic */ InterfaceC10831b f54663c;

        /* renamed from: d */
        final /* synthetic */ float f54664d;

        C10835f(InterfaceC10831b interfaceC10831b, float f11) {
            this.f54663c = interfaceC10831b;
            this.f54664d = f11;
            this.f54661a = OverScrollableRecyclerView.this.f54619X0;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10830a
        /* renamed from: a */
        public void mo52660a(float f11, float f12) {
            if ((f12 > 0.0f || this.f54661a > 0.0f) && OverScrollableRecyclerView.this.getChildCount() > 0) {
                if (f12 > 0.0f) {
                    this.f54663c.mo54127a((Math.max(0.0f, f12) / this.f54664d) / OverScrollableRecyclerView.this.getMeasuredHeight(), OverScrollableRecyclerView.this.getScrollState());
                } else {
                    this.f54663c.mo54127a(0.0f, OverScrollableRecyclerView.this.getScrollState());
                }
            }
            this.f54661a = f12;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView$g */
    /* loaded from: classes5.dex */
    public static final class C10836g implements InterfaceC10830a {

        /* renamed from: a */
        private int f54665a;

        /* renamed from: c */
        final /* synthetic */ float f54667c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC10832c f54668d;

        C10836g(float f11, InterfaceC10832c interfaceC10832c) {
            this.f54667c = f11;
            this.f54668d = interfaceC10832c;
            this.f54665a = OverScrollableRecyclerView.this.getScrollState();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10830a
        /* renamed from: a */
        public void mo52660a(float f11, float f12) {
            if (f12 <= 0.0f && OverScrollableRecyclerView.this.getChildCount() > 0 && this.f54665a == 1 && OverScrollableRecyclerView.this.getScrollState() == 0 && ((-f12) / this.f54667c) / OverScrollableRecyclerView.this.getMeasuredHeight() >= 1.0f) {
                this.f54668d.mo53961a();
            }
            this.f54665a = OverScrollableRecyclerView.this.getScrollState();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverScrollableRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        setOverScrollMode(2);
        this.f54617V0 = new ArrayList();
    }

    /* renamed from: c2 */
    private final int m56140c2(int i11, int i12) {
        return Math.max(Math.abs(i11), Math.abs(i12)) / 3;
    }

    /* renamed from: d2 */
    private final int m56141d2(int i11) {
        return (i11 * Math.abs(i11)) / getMaxFlingVelocity();
    }

    /* renamed from: e2 */
    private final int m56142e2(int i11, boolean z11) {
        if (z11 && Math.abs(i11) >= getMinFlingVelocity() * 10) {
            return Math.max(-getMaxFlingVelocity(), Math.min(i11, getMaxFlingVelocity()));
        }
        return 0;
    }

    /* renamed from: g2 */
    public static /* synthetic */ void m56143g2(OverScrollableRecyclerView overScrollableRecyclerView, InterfaceC10831b interfaceC10831b, float f11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                f11 = 0.1f;
            }
            overScrollableRecyclerView.m56146f2(interfaceC10831b, f11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOnPullToRefreshListener");
    }

    /* renamed from: i2 */
    public static /* synthetic */ void m56144i2(OverScrollableRecyclerView overScrollableRecyclerView, InterfaceC10832c interfaceC10832c, float f11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                f11 = 0.1f;
            }
            overScrollableRecyclerView.m56147h2(interfaceC10832c, f11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOnPushToLoadMoreListener");
    }

    /* renamed from: b2 */
    public final void m56145b2(InterfaceC10830a interfaceC10830a) {
        AbstractC19074t.m100208f(interfaceC10830a, "listener");
        ArrayList arrayList = this.f54617V0;
        interfaceC10830a.mo52660a(this.f54618W0, this.f54619X0);
        arrayList.add(interfaceC10830a);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        Object layoutManager = getLayoutManager();
        if (!(layoutManager instanceof InterfaceC10834e)) {
            return super.canScrollHorizontally(i11);
        }
        boolean m56217c = ((InterfaceC10834e) layoutManager).m56217c();
        if ((!m56217c && i11 < 0) || (m56217c && i11 > 0)) {
            if (computeHorizontalScrollOffset() <= 0) {
                return false;
            }
            return true;
        }
        if (computeHorizontalScrollOffset() >= computeHorizontalScrollRange() - computeHorizontalScrollExtent()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i11) {
        Object layoutManager = getLayoutManager();
        if (!(layoutManager instanceof InterfaceC10834e)) {
            return super.canScrollVertically(i11);
        }
        boolean m56217c = ((InterfaceC10834e) layoutManager).m56217c();
        if ((!m56217c && i11 < 0) || (m56217c && i11 > 0)) {
            if (computeVerticalScrollOffset() <= 0) {
                return false;
            }
            return true;
        }
        if (computeVerticalScrollOffset() >= computeVerticalScrollRange() - computeVerticalScrollExtent()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        canvas.save();
        canvas.translate(this.f54618W0, this.f54619X0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* renamed from: f2 */
    public final void m56146f2(InterfaceC10831b interfaceC10831b, float f11) {
        AbstractC19074t.m100208f(interfaceC10831b, "listener");
        m56145b2(new C10835f(interfaceC10831b, f11));
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        Object layoutManager = getLayoutManager();
        if ((layoutManager instanceof InterfaceC10834e) && ((InterfaceC10834e) layoutManager).m56217c()) {
            return super.getTopFadingEdgeStrength();
        }
        return super.getBottomFadingEdgeStrength();
    }

    @Override // android.view.View
    protected float getLeftFadingEdgeStrength() {
        Object layoutManager = getLayoutManager();
        if ((layoutManager instanceof InterfaceC10834e) && ((InterfaceC10834e) layoutManager).m56217c()) {
            return super.getRightFadingEdgeStrength();
        }
        return super.getLeftFadingEdgeStrength();
    }

    public final float getOffsetX() {
        return this.f54618W0;
    }

    public final float getOffsetY() {
        return this.f54619X0;
    }

    @Override // android.view.View
    protected float getRightFadingEdgeStrength() {
        Object layoutManager = getLayoutManager();
        if ((layoutManager instanceof InterfaceC10834e) && ((InterfaceC10834e) layoutManager).m56217c()) {
            return super.getLeftFadingEdgeStrength();
        }
        return super.getRightFadingEdgeStrength();
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        Object layoutManager = getLayoutManager();
        if ((layoutManager instanceof InterfaceC10834e) && ((InterfaceC10834e) layoutManager).m56217c()) {
            return super.getBottomFadingEdgeStrength();
        }
        return super.getTopFadingEdgeStrength();
    }

    /* renamed from: h2 */
    public final void m56147h2(InterfaceC10832c interfaceC10832c, float f11) {
        AbstractC19074t.m100208f(interfaceC10832c, "listener");
        m56145b2(new C10836g(f11, interfaceC10832c));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOffsetX(this.f54618W0);
        setOffsetY(this.f54619X0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int m104529e;
        int m104529e2;
        boolean z11;
        boolean z12;
        int m104529e3;
        int m104529e4;
        int m104529e5;
        int m104529e6;
        AbstractC19074t.m100208f(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f54621Z0 = actionIndex;
                    this.f54620Y0 = motionEvent.getPointerId(actionIndex);
                    m104529e5 = AbstractC20104d.m104529e(motionEvent.getX(this.f54621Z0));
                    this.f54622a1 = m104529e5;
                    m104529e6 = AbstractC20104d.m104529e(motionEvent.getY(this.f54621Z0));
                    this.f54623b1 = m104529e6;
                }
            } else {
                Integer valueOf = Integer.valueOf(motionEvent.findPointerIndex(this.f54620Y0));
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    return false;
                }
                int intValue = valueOf.intValue();
                this.f54621Z0 = intValue;
                m104529e3 = AbstractC20104d.m104529e(motionEvent.getX(intValue));
                this.f54624c1 = m104529e3 - this.f54622a1;
                m104529e4 = AbstractC20104d.m104529e(motionEvent.getY(this.f54621Z0));
                this.f54625d1 = m104529e4 - this.f54623b1;
            }
        } else {
            this.f54620Y0 = motionEvent.getPointerId(0);
            m104529e = AbstractC20104d.m104529e(motionEvent.getX());
            this.f54622a1 = m104529e;
            m104529e2 = AbstractC20104d.m104529e(motionEvent.getY());
            this.f54623b1 = m104529e2;
        }
        int scrollState = getScrollState();
        if (scrollState != 0) {
            if (scrollState == 2) {
                m9866X1();
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (!super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        RecyclerView.AbstractC1888o layoutManager = getLayoutManager();
        if (layoutManager != null) {
            z11 = layoutManager.mo9757x();
        } else {
            z11 = false;
        }
        RecyclerView.AbstractC1888o layoutManager2 = getLayoutManager();
        if (layoutManager2 != null) {
            z12 = layoutManager2.mo9758y();
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            if ((z11 && Math.abs(this.f54624c1) < Math.abs(this.f54625d1)) || (z12 && Math.abs(this.f54624c1) > Math.abs(this.f54625d1))) {
                m9866X1();
                return false;
            }
            return true;
        }
        return true;
    }

    public final void setOffsetX(float f11) {
        this.f54618W0 = f11;
        invalidate();
        if (isAttachedToWindow()) {
            Iterator it = this.f54617V0.iterator();
            while (it.hasNext()) {
                ((InterfaceC10830a) it.next()).mo52660a(this.f54618W0, this.f54619X0);
            }
        }
    }

    public final void setOffsetY(float f11) {
        this.f54619X0 = f11;
        invalidate();
        if (isAttachedToWindow()) {
            Iterator it = this.f54617V0.iterator();
            while (it.hasNext()) {
                ((InterfaceC10830a) it.next()).mo52660a(this.f54618W0, this.f54619X0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: x0 */
    public boolean mo9906x0(int i11, int i12) {
        int i13;
        int i14;
        RecyclerView.AbstractC1888o layoutManager = getLayoutManager();
        if (layoutManager == 0) {
            return false;
        }
        int m56142e2 = m56142e2(i11, layoutManager.mo9757x());
        int m56142e22 = m56142e2(i12, layoutManager.mo9758y());
        if ((m56142e2 == 0 && m56142e22 == 0) || isLayoutSuppressed()) {
            return false;
        }
        if ((layoutManager instanceof InterfaceC10834e) && !((InterfaceC10834e) layoutManager).mo56153m(m56142e2, m56142e22)) {
            return false;
        }
        float f11 = m56142e2;
        float f12 = m56142e22;
        if (dispatchNestedPreFling(f11, f12)) {
            return false;
        }
        dispatchNestedFling(f11, f12, true);
        RecyclerView.AbstractC1890q onFlingListener = getOnFlingListener();
        if (onFlingListener != null && onFlingListener.mo10175a(m56142e2, m56142e22)) {
            return true;
        }
        if (m56142e2 != 0) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        if (m56142e22 != 0) {
            i14 = 2;
        } else {
            i14 = 0;
        }
        m9860U1(i13 | i14, 1);
        try {
            Field declaredField = RecyclerView.class.getDeclaredField(C0843s0.f2982W);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Class<?> cls = obj.getClass();
            Class<?> cls2 = Integer.TYPE;
            cls.getDeclaredMethod("smoothScrollBy", cls2, cls2, cls2, Interpolator.class).invoke(obj, Integer.valueOf(m56141d2(m56142e2)), Integer.valueOf(m56141d2(m56142e22)), Integer.valueOf(m56140c2(m56142e2, m56142e22)), null);
            return true;
        } catch (Exception unused) {
            return super.mo9906x0(m56142e2, m56142e22);
        }
    }
}
