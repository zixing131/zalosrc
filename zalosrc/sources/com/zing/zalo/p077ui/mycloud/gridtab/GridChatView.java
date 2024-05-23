package com.zing.zalo.p077ui.mycloud.gridtab;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b90.C2665b;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Arrays;
import me0.AbstractC23222t7;
import p363nh.C23744a;
import p365nk.C23805a;
import u80.InterfaceC27126g2;
import v80.C27947a;

/* loaded from: classes6.dex */
public class GridChatView extends BaseMyCloudTabView {
    public static final C12574a Companion = new C12574a(null);

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.GridChatView$a */
    /* loaded from: classes6.dex */
    public static final class C12574a {
        private C12574a() {
        }

        public /* synthetic */ C12574a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.GridChatView$b */
    /* loaded from: classes6.dex */
    public static final class C12575b extends GridLayoutManager.AbstractC1865b {
        C12575b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
        /* renamed from: f */
        public int mo9682f(int i11) {
            Integer num;
            C27947a m70360nM = GridChatView.this.m70360nM();
            if (m70360nM != null) {
                num = Integer.valueOf(m70360nM.mo10005m(i11));
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 2) {
                return 2;
            }
            if (num != null && num.intValue() == 1) {
                return 2;
            }
            if (num != null && num.intValue() == 0) {
                return 2;
            }
            if (num != null && num.intValue() == 12) {
                return 2;
            }
            if (num != null && num.intValue() == 13) {
                return 2;
            }
            if (num != null && num.intValue() == 14) {
                return 2;
            }
            return 1;
        }
    }

    /* renamed from: UM */
    private final void m70899UM() {
        C27947a m70360nM = m70360nM();
        if (m70360nM != null && m70360nM.m140840V()) {
            m70374vM().f138149r.setPadding(0, 0, 0, 0);
        } else {
            m70374vM().f138149r.setPadding(AbstractC23222t7.f112566j, 0, AbstractC23222t7.f112586t, 0);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView
    /* renamed from: AM */
    public InterfaceC27126g2 mo70318AM() {
        return new C12587a0(this);
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, u80.InterfaceC27130h2
    /* renamed from: Ag */
    public void mo70319Ag(C2665b c2665b) {
        AbstractC19074t.m100208f(c2665b, "data");
        super.mo70319Ag(c2665b);
        m70899UM();
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
            gridLayoutManager.m9671f3(new C12575b());
        }
        RecyclerView.AbstractC1885l itemAnimator = m70374vM().f138149r.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.m10057w(300L);
        }
        RecyclerView.AbstractC1885l itemAnimator2 = m70374vM().f138149r.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.m10035A(200L);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 6);
        bVar.m124119a().m124117e(this, 6053);
        bVar.m124119a().m124117e(this, 6054);
    }

    /* renamed from: QM */
    public final ArrayList m70900QM() {
        ArrayList m140837S;
        C27947a m70360nM = m70360nM();
        if (m70360nM == null || (m140837S = m70360nM.m140837S()) == null) {
            return new ArrayList();
        }
        return m140837S;
    }

    /* renamed from: RM */
    public final SparseIntArray m70901RM() {
        SparseIntArray m140838T;
        C27947a m70360nM = m70360nM();
        if (m70360nM == null || (m140838T = m70360nM.m140838T()) == null) {
            return new SparseIntArray();
        }
        return m140838T;
    }

    /* renamed from: SM */
    public final SparseArray m70902SM() {
        SparseArray m140839U;
        C27947a m70360nM = m70360nM();
        if (m70360nM == null || (m140839U = m70360nM.m140839U()) == null) {
            return new SparseArray();
        }
        return m140839U;
    }

    /* renamed from: TM */
    public final void m70903TM() {
        C12587a0 c12587a0;
        InterfaceC27126g2 m70373uM = m70373uM();
        if (m70373uM instanceof C12587a0) {
            c12587a0 = (C12587a0) m70373uM;
        } else {
            c12587a0 = null;
        }
        if (c12587a0 != null) {
            c12587a0.m70962nr();
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GridChatView";
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView
    /* renamed from: oM */
    public C23805a.d mo70361oM() {
        return C23805a.d.f115057q;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m70903TM();
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 != 6) {
            if (i11 == 6054) {
                InterfaceC27126g2 m70373uM = m70373uM();
                AbstractC19074t.m100206d(m70373uM, "null cannot be cast to non-null type com.zing.zalo.ui.mycloud.gridtab.GridChatViewPresenter");
                ((C12587a0) m70373uM).m70961kr(Arrays.copyOf(objArr, objArr.length));
                return;
            }
            return;
        }
        InterfaceC27126g2 m70373uM2 = m70373uM();
        AbstractC19074t.m100206d(m70373uM2, "null cannot be cast to non-null type com.zing.zalo.ui.mycloud.gridtab.GridChatViewPresenter");
        ((C12587a0) m70373uM2).m70486Wq(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 6);
        bVar.m124119a().m124115b(this, 6053);
        bVar.m124119a().m124115b(this, 6054);
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView
    /* renamed from: zM */
    public LinearLayoutManager mo70377zM() {
        return new GridLayoutManager(getContext(), 2);
    }
}
