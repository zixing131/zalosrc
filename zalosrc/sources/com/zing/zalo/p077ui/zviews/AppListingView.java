package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7011b;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23152n3;
import p133ek.AbstractC18458a;
import p325lj.C22499f;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p369ns.AbstractC23933a;
import p716zh.C31907f;
import p716zh.C32192y9;

/* loaded from: classes6.dex */
public class AppListingView extends BaseZaloView implements ZaloView.InterfaceC17421f, InterfaceC0733x {

    /* renamed from: M0 */
    RecyclerView f72154M0;

    /* renamed from: N0 */
    C7011b f72155N0;

    /* renamed from: O0 */
    List f72156O0 = new ArrayList();

    /* renamed from: P0 */
    View f72157P0;

    /* renamed from: Q0 */
    String f72158Q0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fM */
    public /* synthetic */ void m78100fM(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public /* synthetic */ void m78101gM(C31907f c31907f) {
        try {
            if (!TextUtils.isEmpty(c31907f.f146601a)) {
                C22499f m110205h = AbstractC23306f.m120583H().m110205h();
                if (m110205h != null && TextUtils.equals(m110205h.m116333i(), c31907f.f146601a) && !TextUtils.isEmpty(this.f72158Q0)) {
                    m110205h.m116339o(this.f72158Q0, CoreUtility.f89233i, AbstractC23933a.m125288c(m110205h.m116333i()), 1);
                    AbstractC23152n3.m119080y0(MainApplication.getAppContext(), this.f72421L0.m92676n2(), m110205h);
                } else if (c31907f.f146603c == 0) {
                    AbstractC23152n3.m119054l0(MainApplication.getAppContext(), c31907f.f146601a);
                } else {
                    AbstractC23152n3.m119044g0(MainApplication.getAppContext(), c31907f.f146601a);
                }
                finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        List list;
        super.mo37111CJ(bundle);
        C32192y9 c32192y9 = AbstractC23304d.f113404k2;
        if (c32192y9 != null && (list = c32192y9.f148472a) != null) {
            this.f72156O0 = list;
        }
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f72158Q0 = m92642L3.getString("extra_chat_owner_id");
        }
        List list2 = this.f72156O0;
        if (list2 == null || list2.size() == 0) {
            ToastUtils.showMess(this.f72421L0.m92652XI(AbstractC8020f0.error_general));
            finish();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(AbstractC7409c0.app_listing_view, (ViewGroup) null);
        this.f72157P0 = inflate;
        View findViewById = inflate.findViewById(AbstractC6918a0.tv_close);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppListingView.this.m78100fM(view);
            }
        };
        findViewById.setOnClickListener(onClickListener);
        this.f72157P0.setOnClickListener(onClickListener);
        TextView textView = (TextView) this.f72157P0.findViewById(AbstractC6918a0.tv_pr_title);
        C32192y9 c32192y9 = AbstractC23304d.f113404k2;
        if (c32192y9 != null && !TextUtils.isEmpty(c32192y9.f148478g)) {
            if (TextUtils.equals(AbstractC18458a.f93019a, "vi")) {
                str = AbstractC23304d.f113404k2.f148478g;
            } else {
                str = AbstractC23304d.f113404k2.f148479h;
            }
            textView.setText(str);
        } else {
            textView.setText(AbstractC8020f0.share);
        }
        RecyclerView recyclerView = (RecyclerView) this.f72157P0.findViewById(AbstractC6918a0.app_recycler_view);
        this.f72154M0 = recyclerView;
        recyclerView.setItemAnimator(null);
        this.f72154M0.setOverScrollMode(2);
        this.f72154M0.setHasFixedSize(true);
        this.f72154M0.setLayoutManager(new GridLayoutManager(this.f72421L0.m92648SI(), 4));
        C7011b c7011b = new C7011b(this.f72421L0.m92648SI(), this.f72156O0, new C7011b.b() { // from class: com.zing.zalo.ui.zviews.j0
            @Override // com.zing.zalo.adapters.C7011b.b
            /* renamed from: a */
            public final void mo35850a(C31907f c31907f) {
                AppListingView.this.m78101gM(c31907f);
            }
        }, new C23528a(this.f72421L0.m92648SI()));
        this.f72155N0 = c7011b;
        this.f72154M0.setAdapter(c7011b);
        return this.f72157P0;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "AppListingView";
    }
}
