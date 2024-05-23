package com.zing.zalo.p077ui.mycloud.mediatab;

import a90.C0668f;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import fn0.AbstractC19060k;
import java.util.ArrayList;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p365nk.C23805a;
import u80.InterfaceC27126g2;
import v80.C27947a;

/* loaded from: classes6.dex */
public class MyCloudMediaTabView extends BaseMyCloudTabView {
    public static final C12630a Companion = new C12630a(null);

    /* renamed from: Y0 */
    private static final int f65859Y0 = AbstractC23222t7.f112552c;

    /* renamed from: com.zing.zalo.ui.mycloud.mediatab.MyCloudMediaTabView$a */
    /* loaded from: classes6.dex */
    public static final class C12630a {
        private C12630a() {
        }

        public /* synthetic */ C12630a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m71018a() {
            return MyCloudMediaTabView.f65859Y0;
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.mediatab.MyCloudMediaTabView$b */
    /* loaded from: classes6.dex */
    public static final class C12631b extends GridLayoutManager.AbstractC1865b {
        C12631b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
        /* renamed from: f */
        public int mo9682f(int i11) {
            Integer num;
            C27947a m70360nM = MyCloudMediaTabView.this.m70360nM();
            if (m70360nM != null) {
                num = Integer.valueOf(m70360nM.mo10005m(i11));
            } else {
                num = null;
            }
            if ((num == null || num.intValue() != 2) && ((num == null || num.intValue() != 1) && ((num == null || num.intValue() != 0) && ((num == null || num.intValue() != 12) && ((num == null || num.intValue() != 13) && ((num == null || num.intValue() != 14) && (num == null || num.intValue() != 18))))))) {
                return 1;
            }
            return 3;
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView
    /* renamed from: AM */
    public InterfaceC27126g2 mo70318AM() {
        return new C0668f(this);
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView
    /* renamed from: BM */
    public void mo70320BM() {
        GridLayoutManager gridLayoutManager;
        super.mo70320BM();
        LinearLayoutManager m70369sM = m70369sM();
        if (m70369sM instanceof GridLayoutManager) {
            gridLayoutManager = (GridLayoutManager) m70369sM;
        } else {
            gridLayoutManager = null;
        }
        if (gridLayoutManager != null) {
            gridLayoutManager.m9671f3(new C12631b());
        }
        m70374vM().getRoot().setBackgroundColor(C23212s8.m119606n(AbstractC16781w.PrimaryBackgroundColor));
    }

    /* renamed from: RM */
    public final ArrayList m71015RM() {
        ArrayList m140837S;
        C27947a m70360nM = m70360nM();
        if (m70360nM == null || (m140837S = m70360nM.m140837S()) == null) {
            return new ArrayList();
        }
        return m140837S;
    }

    /* renamed from: SM */
    public final SparseIntArray m71016SM() {
        SparseIntArray m140838T;
        C27947a m70360nM = m70360nM();
        if (m70360nM == null || (m140838T = m70360nM.m140838T()) == null) {
            return new SparseIntArray();
        }
        return m140838T;
    }

    /* renamed from: TM */
    public final SparseArray m71017TM() {
        SparseArray m140839U;
        C27947a m70360nM = m70360nM();
        if (m70360nM == null || (m140839U = m70360nM.m140839U()) == null) {
            return new SparseArray();
        }
        return m140839U;
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MyCloudMediaTabView";
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView
    /* renamed from: oM */
    public C23805a.d mo70361oM() {
        return C23805a.d.f115056p;
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView
    /* renamed from: zM */
    public LinearLayoutManager mo70377zM() {
        return new GridLayoutManager(getContext(), 3);
    }
}
