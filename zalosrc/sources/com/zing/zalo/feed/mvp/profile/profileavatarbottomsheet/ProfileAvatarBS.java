package com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.C8695a;
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
import p427pq.EnumC24904a;
import p649xl.C30136y9;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;

/* loaded from: classes4.dex */
public final class ProfileAvatarBS extends BottomSheet {

    /* renamed from: b1 */
    private C30136y9 f46724b1;

    /* renamed from: c1 */
    private final DefaultBottomSheetAdapter f46725c1 = new DefaultBottomSheetAdapter("");

    /* renamed from: d1 */
    private final InterfaceC24854k f46726d1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C8695a.class), new C8692f(new C8691e(this)), C8693g.f46733q);

    /* renamed from: com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.ProfileAvatarBS$a */
    /* loaded from: classes4.dex */
    public static final class C8687a implements DefaultBottomSheetAdapter.InterfaceC8815i {
        C8687a() {
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.InterfaceC8815i
        /* renamed from: l */
        public void mo46378l(int i11) {
            ProfileAvatarBS.this.m46374LL().m46395Y(i11);
        }

        @Override // com.zing.zalo.feed.mvp.utils.DefaultBottomSheetAdapter.InterfaceC8815i
        /* renamed from: m */
        public void mo46379m(String str, String str2) {
            AbstractC19074t.m100208f(str, "actionType");
            AbstractC19074t.m100208f(str2, "actionData");
            ProfileAvatarBS.this.m46374LL().m46393W(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.ProfileAvatarBS$b */
    /* loaded from: classes4.dex */
    public static final class C8688b extends AbstractC19075u implements InterfaceC18505l {
        C8688b() {
            super(1);
        }

        /* renamed from: a */
        public final void m46380a(List list) {
            DefaultBottomSheetAdapter defaultBottomSheetAdapter = ProfileAvatarBS.this.f46725c1;
            AbstractC19074t.m100205c(list);
            defaultBottomSheetAdapter.m47068O(list);
            ProfileAvatarBS.this.f46725c1.m10008p();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46380a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.ProfileAvatarBS$c */
    /* loaded from: classes4.dex */
    public static final class C8689c extends AbstractC19075u implements InterfaceC18505l {
        C8689c() {
            super(1);
        }

        /* renamed from: a */
        public final void m46381a(C19964c c19964c) {
            C8695a.d dVar = (C8695a.d) c19964c.m103749a();
            if (dVar instanceof C8695a.e) {
                ZaloView m92650VI = ProfileAvatarBS.this.m92650VI();
                if (m92650VI != null) {
                    Intent intent = new Intent();
                    intent.putExtra("EXTRA_TYPE_OPTION", 0);
                    intent.putExtra("EXTRA_OPTION_SELECTED", ((C8695a.e) dVar).m46398a());
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    m92650VI.mo50035CK(-1, intent);
                }
                ProfileAvatarBS.this.close();
            }
            if (dVar instanceof C8695a.b) {
                ZaloView m92650VI2 = ProfileAvatarBS.this.m92650VI();
                if (m92650VI2 != null) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("EXTRA_TYPE_OPTION", 1);
                    C8695a.b bVar = (C8695a.b) dVar;
                    intent2.putExtra("EXTRA_ACTION_TYPE", bVar.m46397b());
                    intent2.putExtra("EXTRA_ACTION_DATA", bVar.m46396a());
                    C24848g0 c24848g02 = C24848g0.f119245a;
                    m92650VI2.mo50035CK(-1, intent2);
                }
                ProfileAvatarBS.this.close();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46381a((C19964c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.ProfileAvatarBS$d */
    /* loaded from: classes4.dex */
    public static final class C8690d implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f46730p;

        C8690d(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f46730p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f46730p;
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
            this.f46730p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.ProfileAvatarBS$e */
    /* loaded from: classes4.dex */
    public static final class C8691e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f46731q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8691e(ZaloView zaloView) {
            super(0);
            this.f46731q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f46731q;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.ProfileAvatarBS$f */
    /* loaded from: classes4.dex */
    public static final class C8692f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f46732q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8692f(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f46732q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f46732q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.ProfileAvatarBS$g */
    /* loaded from: classes4.dex */
    static final class C8693g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8693g f46733q = new C8693g();

        C8693g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C8695a.c();
        }
    }

    /* renamed from: KL */
    private final void m46373KL() {
        m90533zL(EnumC17017m.HUG_CONTENT);
        m90525tL(true);
        m90522qL(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LL */
    public final C8695a m46374LL() {
        return (C8695a) this.f46726d1.getValue();
    }

    /* renamed from: ML */
    private final void m46375ML() {
        String str;
        String m129507c;
        Bundle m92642L3 = m92642L3();
        if (m92642L3 == null || (str = m92642L3.getString("EXTRA_PROFILE_UID")) == null) {
            str = "";
        }
        Bundle m92642L32 = m92642L3();
        if (m92642L32 == null || (m129507c = m92642L32.getString("EXTRA_OPTION_VARIANT")) == null) {
            m129507c = EnumC24904a.f119495q.m129507c();
        }
        AbstractC19074t.m100205c(m129507c);
        m46374LL().m46394X(str, m129507c);
        m46377OL();
    }

    /* renamed from: NL */
    private final void m46376NL() {
        String str;
        DefaultBottomSheetAdapter defaultBottomSheetAdapter = this.f46725c1;
        Bundle m92642L3 = m92642L3();
        C30136y9 c30136y9 = null;
        if (m92642L3 != null) {
            str = m92642L3.getString("EXTRA_PROFILE_UID");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        defaultBottomSheetAdapter.m47070Q(str);
        this.f46725c1.m47069P(new C8687a());
        C30136y9 c30136y92 = this.f46724b1;
        if (c30136y92 == null) {
            AbstractC19074t.m100223u("binding");
            c30136y92 = null;
        }
        c30136y92.f140030r.setAdapter(this.f46725c1);
        C30136y9 c30136y93 = this.f46724b1;
        if (c30136y93 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30136y9 = c30136y93;
        }
        c30136y9.f140030r.setLayoutManager(new LinearLayoutManager(m92689tK()));
    }

    /* renamed from: OL */
    private final void m46377OL() {
        m46374LL().m46391T().m9219j(this, new C8690d(new C8688b()));
        m46374LL().m46392U().m9219j(this, new C8690d(new C8689c()));
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        m46373KL();
        C30136y9 m148740c = C30136y9.m148740c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148740c, "inflate(...)");
        this.f46724b1 = m148740c;
        m46376NL();
        m46375ML();
    }
}
