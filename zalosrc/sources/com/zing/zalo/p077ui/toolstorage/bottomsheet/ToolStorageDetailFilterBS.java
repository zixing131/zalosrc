package com.zing.zalo.p077ui.toolstorage.bottomsheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C1916i;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.C19071q;
import java.util.ArrayList;
import p649xl.AbstractC29799f7;
import pm0.C24848g0;
import va0.C27957b;

/* loaded from: classes6.dex */
public final class ToolStorageDetailFilterBS extends BottomSheet {

    /* renamed from: b1 */
    private AbstractC29799f7 f68461b1;

    /* renamed from: c1 */
    private int f68462c1;

    /* renamed from: d1 */
    private C27957b f68463d1;

    /* renamed from: e1 */
    private ArrayList f68464e1 = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.bottomsheet.ToolStorageDetailFilterBS$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13331a extends C19071q implements InterfaceC18505l {
        C13331a(Object obj) {
            super(1, obj, ToolStorageDetailFilterBS.class, "onItemClicked", "onItemClicked(I)V", 0);
        }

        /* renamed from: h */
        public final void m74842h(int i11) {
            ((ToolStorageDetailFilterBS) this.f94922q).m74839KL(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m74842h(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: JL */
    private final void m74838JL() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        this.f68463d1 = new C27957b(this.f68464e1, this.f68462c1, new C13331a(this));
        AbstractC29799f7 abstractC29799f7 = this.f68461b1;
        AbstractC29799f7 abstractC29799f72 = null;
        if (abstractC29799f7 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29799f7 = null;
        }
        abstractC29799f7.f137747P.setLayoutManager(linearLayoutManager);
        AbstractC29799f7 abstractC29799f73 = this.f68461b1;
        if (abstractC29799f73 == null) {
            AbstractC19074t.m100223u("mBinding");
            abstractC29799f73 = null;
        }
        abstractC29799f73.f137747P.setAdapter(this.f68463d1);
        AbstractC29799f7 abstractC29799f74 = this.f68461b1;
        if (abstractC29799f74 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            abstractC29799f72 = abstractC29799f74;
        }
        abstractC29799f72.f137747P.m9816A(new C1916i(getContext(), linearLayoutManager.m9750h()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KL */
    public final void m74839KL(int i11) {
        m74840LL(i11);
    }

    /* renamed from: LL */
    private final void m74840LL(int i11) {
        ZaloView m92650VI;
        Intent intent = new Intent();
        intent.putExtra("EXTRA_PARAM_SELECTED_POS", i11);
        if ((m92650VI() instanceof ToolStorageDetailFilterBottomSheet) && (m92650VI = m92650VI()) != null) {
            m92650VI.mo50035CK(-1, intent);
        }
        close();
    }

    /* renamed from: ML */
    private final void m74841ML() {
        setIdTracking("ts_sort_bottom_sheet");
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        ArrayList<String> arrayList;
        super.mo37111CJ(bundle);
        ArrayList arrayList2 = this.f68464e1;
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            arrayList = m92642L3.getStringArrayList("EXTRA_PARAM_LIST_FILTER");
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList2.addAll(arrayList);
        Bundle m92642L32 = m92642L3();
        int i11 = 0;
        if (m92642L32 != null) {
            i11 = m92642L32.getInt("EXTRA_PARAM_SELECTED_POS", 0);
        }
        this.f68462c1 = i11;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC29799f7 m147943Q = AbstractC29799f7.m147943Q(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m147943Q, "inflate(...)");
        this.f68461b1 = m147943Q;
        m90533zL(EnumC17017m.HUG_CONTENT);
        m74838JL();
        m74841ML();
    }
}
