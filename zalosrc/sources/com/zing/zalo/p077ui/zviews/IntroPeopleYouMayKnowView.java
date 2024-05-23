package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.IntroPeopleYouMayKnowView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23148n;
import me0.C23055e5;
import p348mi.AbstractC23309i;

/* loaded from: classes6.dex */
public class IntroPeopleYouMayKnowView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: M0 */
    int f74418M0 = -1;

    /* renamed from: N0 */
    int f74419N0 = -1;

    /* renamed from: O0 */
    boolean f74420O0 = false;

    /* renamed from: P0 */
    private final InterfaceC0765j f74421P0 = new C0766k();

    /* renamed from: Q0 */
    private final InterfaceC20094a f74422Q0 = new C14480a();

    /* renamed from: com.zing.zalo.ui.zviews.IntroPeopleYouMayKnowView$a */
    /* loaded from: classes6.dex */
    public class C14480a implements InterfaceC20094a {
        C14480a() {
        }

        /* renamed from: d */
        public /* synthetic */ void m80898d() {
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
            IntroPeopleYouMayKnowView.this.m92662fJ().m93069k2(PeopleYouMayKnowView.class, bundle, 1, true);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (c20096c.m104491c() == 515) {
                        ToastUtils.showMess(IntroPeopleYouMayKnowView.this.m92652XI(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                    } else {
                        ToastUtils.showMess(IntroPeopleYouMayKnowView.this.m92652XI(AbstractC8020f0.str_update_failed));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                IntroPeopleYouMayKnowView introPeopleYouMayKnowView = IntroPeopleYouMayKnowView.this;
                introPeopleYouMayKnowView.f74420O0 = false;
                introPeopleYouMayKnowView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                IntroPeopleYouMayKnowView introPeopleYouMayKnowView2 = IntroPeopleYouMayKnowView.this;
                introPeopleYouMayKnowView2.f74420O0 = false;
                introPeopleYouMayKnowView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v4, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    IntroPeopleYouMayKnowView introPeopleYouMayKnowView = IntroPeopleYouMayKnowView.this;
                    int i11 = introPeopleYouMayKnowView.f74418M0;
                    AbstractC23148n.m118851y(i11, introPeopleYouMayKnowView.f74419N0, i11);
                    AbstractC23309i.m121134Kr(0L);
                    IntroPeopleYouMayKnowView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ir
                        public /* synthetic */ RunnableC15746ir() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            IntroPeopleYouMayKnowView.C14480a.this.m80898d();
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                IntroPeopleYouMayKnowView introPeopleYouMayKnowView2 = IntroPeopleYouMayKnowView.this;
                introPeopleYouMayKnowView2.f74420O0 = z11;
                introPeopleYouMayKnowView2.f72421L0.mo78960q3();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.intro_people_you_may_know_view, viewGroup, false);
        inflate.findViewById(AbstractC6918a0.btnNext).setOnClickListener(this);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(m92652XI(AbstractC8020f0.str_suggest_data_mining));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "IntroPeopleYouMayKnowView";
    }

    /* renamed from: o3 */
    void m80896o3(int i11, int i12) {
        try {
            if (this.f74420O0) {
                return;
            }
            mo78950cq(m92652XI(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f74418M0 = i11;
                this.f74419N0 = i12;
                this.f74420O0 = true;
                this.f74421P0.mo1704o8(this.f74422Q0);
                this.f74421P0.mo1699o3(i11, i12);
            } else {
                this.f74420O0 = false;
                ToastUtils.showMess(m92652XI(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.btnNext) {
            if (AbstractC23309i.m121344Qf()) {
                Bundle bundle = new Bundle();
                bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                m92662fJ().m93069k2(PeopleYouMayKnowView.class, bundle, 1, true);
                return;
            }
            m80896o3(20, 1);
        }
    }
}
