package com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.C8704a;
import com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import java.util.List;
import p205hc.C19964c;
import p457qq.EnumC25467a;
import p649xl.C30153z9;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;

/* loaded from: classes4.dex */
public final class ProfileCoverBS extends BottomSheet {

    /* renamed from: b1 */
    private C30153z9 f46748b1;

    /* renamed from: c1 */
    private final DefaultBottomSheetAdapter f46749c1;

    /* renamed from: d1 */
    private final InterfaceC24854k f46750d1;

    /* renamed from: com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.ProfileCoverBS$a */
    /* loaded from: classes4.dex */
    public static final class C8696a implements DefaultBottomSheetAdapter.InterfaceC8815i {
        C8696a() {
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.InterfaceC8815i
        /* renamed from: l */
        public void mo46378l(int i11) {
            ProfileCoverBS.this.m46402LL().m46417U(i11);
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.InterfaceC8815i
        /* renamed from: m */
        public void mo46379m(String str, String str2) {
            AbstractC19074t.m100208f(str, "actionType");
            AbstractC19074t.m100208f(str2, "actionData");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.ProfileCoverBS$b */
    /* loaded from: classes4.dex */
    public static final class C8697b extends AbstractC19075u implements InterfaceC18505l {
        C8697b() {
            super(1);
        }

        /* renamed from: a */
        public final void m46406a(List list) {
            DefaultBottomSheetAdapter defaultBottomSheetAdapter = ProfileCoverBS.this.f46749c1;
            AbstractC19074t.m100205c(list);
            defaultBottomSheetAdapter.m47068O(list);
            ProfileCoverBS.this.f46749c1.m10008p();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46406a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.ProfileCoverBS$c */
    /* loaded from: classes4.dex */
    public static final class C8698c extends AbstractC19075u implements InterfaceC18505l {
        C8698c() {
            super(1);
        }

        /* renamed from: a */
        public final void m46407a(C19964c c19964c) {
            C8704a.c cVar = (C8704a.c) c19964c.m103749a();
            if (cVar instanceof C8704a.d) {
                ZaloView m92650VI = ProfileCoverBS.this.m92650VI();
                if (m92650VI != null) {
                    Intent intent = new Intent();
                    intent.putExtra("EXTRA_OPTION_SELECTED", ((C8704a.d) cVar).m46418a());
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    m92650VI.mo50035CK(-1, intent);
                }
                ProfileCoverBS.this.close();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46407a((C19964c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.ProfileCoverBS$d */
    /* loaded from: classes4.dex */
    public static final class C8699d implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f46754p;

        C8699d(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f46754p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f46754p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f46754p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.ProfileCoverBS$e */
    /* loaded from: classes4.dex */
    public static final class C8700e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f46755q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8700e(ZaloView zaloView) {
            super(0);
            this.f46755q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f46755q;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.ProfileCoverBS$f */
    /* loaded from: classes4.dex */
    public static final class C8701f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f46756q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8701f(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f46756q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f46756q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.profilecoverbottomsheet.ProfileCoverBS$g */
    /* loaded from: classes4.dex */
    static final class C8702g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8702g f46757q = new C8702g();

        C8702g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C8704a.b();
        }
    }

    public ProfileCoverBS() {
        String string;
        Bundle m92642L3 = m92642L3();
        this.f46749c1 = new DefaultBottomSheetAdapter((m92642L3 == null || (string = m92642L3.getString("EXTRA_PROFILE_UID")) == null) ? "" : string);
        this.f46750d1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C8704a.class), new C8701f(new C8700e(this)), C8702g.f46757q);
    }

    /* renamed from: KL */
    private final void m46401KL() {
        m90533zL(EnumC17017m.HUG_CONTENT);
        m90525tL(true);
        m90522qL(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LL */
    public final C8704a m46402LL() {
        return (C8704a) this.f46750d1.getValue();
    }

    /* renamed from: ML */
    private final void m46403ML() {
        String m131933c;
        Bundle m92642L3 = m92642L3();
        if (m92642L3 == null || (m131933c = m92642L3.getString("EXTRA_OPTION_VARIANT")) == null) {
            m131933c = EnumC25467a.f122043q.m131933c();
        }
        AbstractC19074t.m100205c(m131933c);
        m46402LL().m46416T(m131933c);
        m46405OL();
    }

    /* renamed from: NL */
    private final void m46404NL() {
        this.f46749c1.m47069P(new C8696a());
        C30153z9 c30153z9 = this.f46748b1;
        C30153z9 c30153z92 = null;
        if (c30153z9 == null) {
            AbstractC19074t.m100223u("binding");
            c30153z9 = null;
        }
        c30153z9.f140125r.setAdapter(this.f46749c1);
        C30153z9 c30153z93 = this.f46748b1;
        if (c30153z93 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30153z92 = c30153z93;
        }
        c30153z92.f140125r.setLayoutManager(new LinearLayoutManager(m92689tK()));
    }

    /* renamed from: OL */
    private final void m46405OL() {
        m46402LL().m46414Q().m9219j(this, new C8699d(new C8697b()));
        m46402LL().m46415R().m9219j(this, new C8699d(new C8698c()));
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        m46401KL();
        C30153z9 m148780c = C30153z9.m148780c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148780c, "inflate(...)");
        this.f46748b1 = m148780c;
        m46404NL();
        m46403ML();
    }
}
