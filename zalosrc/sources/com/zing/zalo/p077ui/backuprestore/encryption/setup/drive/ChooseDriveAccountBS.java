package com.zing.zalo.p077ui.backuprestore.encryption.setup.drive;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C1916i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.C19071q;
import java.util.ArrayList;
import mm0.AbstractC23350e;
import p40.C24637b;
import p649xl.C29722b2;
import pm0.C24848g0;

/* loaded from: classes5.dex */
public final class ChooseDriveAccountBS extends BottomSheet {

    /* renamed from: b1 */
    public C29722b2 f55693b1;

    /* renamed from: c1 */
    private C24637b f55694c1;

    /* renamed from: d1 */
    private boolean f55695d1 = true;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.drive.ChooseDriveAccountBS$a */
    /* loaded from: classes5.dex */
    /* synthetic */ class C11023a extends C19071q implements InterfaceC18505l {
        C11023a(Object obj) {
            super(1, obj, ChooseDriveAccountBS.class, "onSelectedAccount", "onSelectedAccount(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m57591h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((ChooseDriveAccountBS) this.f94922q).m57586OL(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57591h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.drive.ChooseDriveAccountBS$b */
    /* loaded from: classes5.dex */
    /* synthetic */ class C11024b extends C19071q implements InterfaceC18494a {
        C11024b(Object obj) {
            super(0, obj, ChooseDriveAccountBS.class, "onChooseAnotherAccount", "onChooseAnotherAccount()V", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57592h();
            return C24848g0.f119245a;
        }

        /* renamed from: h */
        public final void m57592h() {
            ((ChooseDriveAccountBS) this.f94922q).m57585NL();
        }
    }

    /* renamed from: LL */
    private final void m57583LL() {
        try {
            ArrayList arrayList = new ArrayList();
            Account[] accountsByType = AccountManager.get(this.f88762c0.getContext()).getAccountsByType("com.google");
            AbstractC19074t.m100207e(accountsByType, "getAccountsByType(...)");
            for (Account account : accountsByType) {
                arrayList.add(account.name);
            }
            if (this.f55695d1) {
                arrayList.add(m92652XI(AbstractC8020f0.sync_choose_account_option_add));
            }
            C24637b c24637b = this.f55694c1;
            if (c24637b != null) {
                c24637b.m128178P(arrayList);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLChooseDriveAccountBottomSheet", e11);
        }
    }

    /* renamed from: ML */
    private final void m57584ML() {
        RecyclerView recyclerView = m57589KL().f137293q;
        recyclerView.setAdapter(this.f55694c1);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        m57589KL().f137293q.m9816A(new C1916i(recyclerView.getContext(), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NL */
    public final void m57585NL() {
        m57587QL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OL */
    public final void m57586OL(String str) {
        m57588RL(str);
    }

    /* renamed from: QL */
    private final void m57587QL() {
        ZaloView m92650VI;
        Intent intent = new Intent();
        intent.putExtra("USE_ANOTHER_ACCOUNT", true);
        if ((m92650VI() instanceof ChooseDriveAccountBottomSheet) && (m92650VI = m92650VI()) != null) {
            m92650VI.mo50035CK(-1, intent);
        }
        close();
    }

    /* renamed from: RL */
    private final void m57588RL(String str) {
        ZaloView m92650VI;
        Intent intent = new Intent();
        intent.putExtra("RESULT_SELECTED_ACCOUNT", str);
        if ((m92650VI() instanceof ChooseDriveAccountBottomSheet) && (m92650VI = m92650VI()) != null) {
            m92650VI.mo50035CK(-1, intent);
        }
        close();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        boolean z11 = true;
        if (m92642L3 != null) {
            z11 = m92642L3.getBoolean("EXTRA_IS_OPTION_ADD_ANOTHER_ACCOUNT", true);
        }
        this.f55695d1 = z11;
        this.f55694c1 = new C24637b(new C11023a(this), new C11024b(this), this.f55695d1);
    }

    /* renamed from: KL */
    public final C29722b2 m57589KL() {
        C29722b2 c29722b2 = this.f55693b1;
        if (c29722b2 != null) {
            return c29722b2;
        }
        AbstractC19074t.m100223u("mBinding");
        return null;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        LinearLayout root = m57589KL().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: PL */
    public final void m57590PL(C29722b2 c29722b2) {
        AbstractC19074t.m100208f(c29722b2, "<set-?>");
        this.f55693b1 = c29722b2;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        close();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29722b2 m147752c = C29722b2.m147752c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m147752c, "inflate(...)");
        m57590PL(m147752c);
        m90533zL(EnumC17017m.DETENTS);
        m90524sL(0.3f);
        m90525tL(true);
        m57584ML();
        m57583LL();
    }
}
