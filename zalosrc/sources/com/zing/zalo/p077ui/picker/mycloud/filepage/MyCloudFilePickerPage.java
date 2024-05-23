package com.zing.zalo.p077ui.picker.mycloud.filepage;

import b90.C2665b;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.mycloud.filetab.MyCloudFileTabView;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import p363nh.C23744a;
import p90.InterfaceC24697q;
import pm0.C24848g0;
import q90.C25199b;
import q90.C25201d;
import r90.C25707a;
import u80.InterfaceC27126g2;
import v80.C27947a;

/* loaded from: classes6.dex */
public class MyCloudFilePickerPage extends MyCloudFileTabView implements InterfaceC24697q {

    /* renamed from: Z0 */
    private C25201d.a f66862Z0;

    /* renamed from: a1 */
    private C25199b.a f66863a1;

    @Override // com.zing.zalo.p077ui.mycloud.filetab.MyCloudFileTabView, com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView
    /* renamed from: AM */
    public InterfaceC27126g2 mo70318AM() {
        return new C25707a(this);
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, u80.InterfaceC27130h2
    /* renamed from: Ag */
    public void mo70319Ag(C2665b c2665b) {
        AbstractC19074t.m100208f(c2665b, "data");
        try {
            C24848g0 c24848g0 = null;
            InterfaceC27126g2.a.m139237a(m70373uM(), false, 1, null);
            super.mo70319Ag(c2665b);
            m70373uM().mo70456A5(m70369sM().m9740Y1());
            m70373uM().mo70516zk();
            ZaloView m92650VI = m92650VI();
            if (m92650VI != null) {
                m92650VI.invalidateOptionsMenu();
                c24848g0 = C24848g0.f119245a;
            }
            if (c24848g0 == null) {
                invalidateOptionsMenu();
            }
            m70373uM().mo70494cd(c2665b);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.filetab.MyCloudFileTabView, com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        m70373uM().m139236F2();
    }

    @Override // p90.InterfaceC24697q
    /* renamed from: Kb */
    public void mo72569Kb() {
        m70373uM().mo70480T3();
    }

    @Override // p90.InterfaceC24697q
    /* renamed from: Kz */
    public void mo72570Kz(C25199b.a aVar) {
        this.f66863a1 = aVar;
    }

    @Override // p90.InterfaceC24697q
    /* renamed from: Vt */
    public void mo72571Vt(C25201d.a aVar) {
        this.f66862Z0 = aVar;
    }

    @Override // p90.InterfaceC24697q
    /* renamed from: W3 */
    public void mo72572W3() {
        m70373uM().mo70485W3();
    }

    @Override // p90.InterfaceC24697q
    /* renamed from: Y2 */
    public void mo72573Y2() {
        m70373uM().mo70489Y2();
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, u80.InterfaceC27130h2
    /* renamed from: e1 */
    public C25201d.a mo70352e1() {
        return this.f66862Z0;
    }

    @Override // p90.InterfaceC24697q
    /* renamed from: m0 */
    public void mo72574m0(String str) {
        AbstractC19074t.m100208f(str, "keyWord");
        m70373uM().mo70504m0(str);
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, u80.InterfaceC27130h2
    /* renamed from: p9 */
    public C25199b.a mo70362p9() {
        return this.f66863a1;
    }

    @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView
    /* renamed from: wM */
    public C27947a mo70375wM() {
        C27947a mo70375wM = super.mo70375wM();
        mo70375wM.m140849f0(true);
        mo70375wM.m140853j0(this);
        return mo70375wM;
    }

    @Override // com.zing.zalo.p077ui.mycloud.filetab.MyCloudFileTabView, com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView, com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.Companion.m124119a().m124117e(this, 5208);
    }
}