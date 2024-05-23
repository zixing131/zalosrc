package com.zing.zalo.feed.mvp.storyprivacy;

import ac.InterfaceC0733x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.storyprivacy.C8805a;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ProfilePickerView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p205hc.C19964c;
import p205hc.C19965d;
import p401or.C24412b;
import p458qr.C25470c;
import p458qr.C25471d;
import p542ub.InterfaceC27218a;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p649xl.C29859id;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26708g;
import vl0.AbstractC28291a;

/* loaded from: classes4.dex */
public final class StoryPrivacyBottomSheetViewBs extends BottomSheet implements View.OnClickListener, InterfaceC0733x {
    public static final C8795a Companion = new C8795a(null);

    /* renamed from: b1 */
    private final C24412b f47108b1;

    /* renamed from: c1 */
    private C29859id f47109c1;

    /* renamed from: d1 */
    private final InterfaceC29232g f47110d1;

    /* renamed from: e1 */
    private final InterfaceC24854k f47111e1;

    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetViewBs$a */
    /* loaded from: classes4.dex */
    public static final class C8795a {
        private C8795a() {
        }

        public /* synthetic */ C8795a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetViewBs$b */
    /* loaded from: classes4.dex */
    static final class C8796b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8796b f47112q = new C8796b();

        C8796b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8805a mo12V4() {
            return new C8805a();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetViewBs$c */
    /* loaded from: classes4.dex */
    public static final class C8797c implements C8805a.b {
        C8797c() {
        }

        @Override // com.zing.zalo.feed.mvp.storyprivacy.C8805a.b
        /* renamed from: a */
        public void mo47045a(PrivacyInfo privacyInfo) {
            AbstractC19074t.m100208f(privacyInfo, "privacyInfo");
            StoryPrivacyBottomSheetViewBs.this.m47043ML().m127687X(privacyInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetViewBs$d */
    /* loaded from: classes4.dex */
    public static final class C8798d implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f47114p;

        C8798d(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f47114p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f47114p;
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
            this.f47114p.mo205i9(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetViewBs$e */
    /* loaded from: classes4.dex */
    public static final class C8799e extends AbstractC19075u implements InterfaceC18505l {
        C8799e() {
            super(1);
        }

        /* renamed from: a */
        public final void m47046a(List list) {
            C8805a m47037KL = StoryPrivacyBottomSheetViewBs.this.m47037KL();
            AbstractC19074t.m100205c(list);
            m47037KL.m47057L(list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m47046a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetViewBs$f */
    /* loaded from: classes4.dex */
    public static final class C8800f extends AbstractC19075u implements InterfaceC18505l {
        C8800f() {
            super(1);
        }

        /* renamed from: a */
        public final void m47047a(C19964c c19964c) {
            StoryPrivacyBottomSheetViewBs.this.m47043ML().m127686W(0, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m47047a((C19964c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetViewBs$g */
    /* loaded from: classes4.dex */
    public static final class C8801g extends AbstractC19075u implements InterfaceC18505l {
        C8801g() {
            super(1);
        }

        /* renamed from: a */
        public final void m47048a(ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "friendList");
            Bundle m83055pM = ProfilePickerView.m83055pM(arrayList, 100, AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_select_friend_picker_title));
            m83055pM.putBoolean("extra_show_total_selected", true);
            m83055pM.putBoolean("extra_show_text_instead_icon", true);
            m83055pM.putString("extra_menu_done_text", AbstractC23136l9.m118743r0(AbstractC8020f0.str_saved));
            m83055pM.putBoolean("allow_empty_pick", false);
            InterfaceC27218a m92676n2 = StoryPrivacyBottomSheetViewBs.this.m92676n2();
            if (m92676n2 != null && m92676n2.mo35579p() != null) {
                m92676n2.mo35579p().m93066i2(ProfilePickerView.class, m83055pM, 1000, 1, true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m47048a((ArrayList) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetViewBs$h */
    /* loaded from: classes4.dex */
    public static final class C8802h extends AbstractC19075u implements InterfaceC18505l {
        C8802h() {
            super(1);
        }

        /* renamed from: a */
        public final void m47049a(ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "friendList");
            Bundle m83055pM = ProfilePickerView.m83055pM(arrayList, 100, AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_except_friend_picker_title));
            m83055pM.putBoolean("extra_show_total_selected", true);
            m83055pM.putBoolean("extra_show_text_instead_icon", true);
            m83055pM.putString("extra_menu_done_text", AbstractC23136l9.m118743r0(AbstractC8020f0.str_saved));
            m83055pM.putBoolean("allow_empty_pick", false);
            m83055pM.putBoolean("extra_type_exclude_friends", true);
            InterfaceC27218a m92676n2 = StoryPrivacyBottomSheetViewBs.this.m92676n2();
            if (m92676n2 != null && m92676n2.mo35579p() != null) {
                m92676n2.mo35579p().m93066i2(ProfilePickerView.class, m83055pM, 1001, 1, true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m47049a((ArrayList) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetViewBs$i */
    /* loaded from: classes4.dex */
    public static final class C8803i extends AbstractC19075u implements InterfaceC18505l {
        C8803i() {
            super(1);
        }

        /* renamed from: a */
        public final void m47050a(PrivacyInfo privacyInfo) {
            AbstractC19074t.m100208f(privacyInfo, "privacyInfo");
            StoryPrivacyBottomSheetViewBs.this.m47041PL(privacyInfo);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m47050a((PrivacyInfo) obj);
            return C24848g0.f119245a;
        }
    }

    public StoryPrivacyBottomSheetViewBs(C24412b c24412b) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(c24412b, "viewModel");
        this.f47108b1 = c24412b;
        this.f47110d1 = AbstractC29233h.m145990a(new StoryPrivacyBottomSheetViewBs$layoutManagerLazy$1(this));
        m129210a = AbstractC24856m.m129210a(C8796b.f47112q);
        this.f47111e1 = m129210a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KL */
    public final C8805a m47037KL() {
        return (C8805a) this.f47111e1.getValue();
    }

    /* renamed from: LL */
    private final LinearLayoutManager m47038LL() {
        return (LinearLayoutManager) this.f47110d1.getValue();
    }

    /* renamed from: NL */
    private final void m47039NL() {
        int i11;
        this.f47108b1.m127693f0(C8806b.Companion.m47064a(m92642L3()));
        m47042QL();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            i11 = m92642L3.getInt("EXTRA_DATA_RETAIN_KEY", -1);
        } else {
            i11 = -1;
        }
        if (i11 != -1) {
            C25470c m131954b = C25471d.m131951c().m131954b(i11);
            if (m131954b != null) {
                this.f47108b1.m127690b0(m131954b);
                return;
            }
            return;
        }
        this.f47108b1.m127679O();
    }

    /* renamed from: OL */
    private final void m47040OL() {
        m90525tL(true);
        C29859id c29859id = this.f47109c1;
        if (c29859id == null) {
            AbstractC19074t.m100223u("binding");
            c29859id = null;
        }
        m47037KL().m47058M(new C8797c());
        c29859id.f138205t.setLayoutManager(m47038LL());
        c29859id.f138205t.setAdapter(m47037KL());
        c29859id.f138205t.setOverScrollMode(2);
        Context context = getContext();
        if (context != null) {
            AbstractC19074t.m100205c(context);
            C26703b m137293a = C26705d.m137293a(context, AbstractC2814h.header_text_title);
            RobotoTextView robotoTextView = c29859id.f138207v;
            AbstractC19074t.m100207e(robotoTextView, "title");
            new C26708g(robotoTextView).m137319a(m137293a);
            c29859id.f138207v.setTextColor(C23212s8.m119607o(context, AbstractC28291a.header_white_title));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PL */
    public final void m47041PL(PrivacyInfo privacyInfo) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_PRIVACY_INFO_RESULT", privacyInfo);
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.mo50035CK(-1, intent);
        }
        close();
    }

    /* renamed from: QL */
    private final void m47042QL() {
        this.f47108b1.m127685U().m9219j(this, new C8798d(new C8799e()));
        this.f47108b1.m127682R().m9219j(this, new C8798d(new C8800f()));
        this.f47108b1.m127681Q().m9219j(this, new C19965d(new C8801g()));
        this.f47108b1.m127680P().m9219j(this, new C19965d(new C8802h()));
        this.f47108b1.m127683S().m9219j(this, new C19965d(new C8803i()));
    }

    /* renamed from: ML */
    public final C24412b m47043ML() {
        return this.f47108b1;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        C29859id c29859id = this.f47109c1;
        if (c29859id == null) {
            AbstractC19074t.m100223u("binding");
            c29859id = null;
        }
        RelativeLayout relativeLayout = c29859id.f138203r;
        AbstractC19074t.m100207e(relativeLayout, "mainView");
        return relativeLayout;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        Bundle m92642L3;
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        try {
            ZaloView m92650VI = m92650VI();
            int m131953a = C25471d.m131951c().m131953a(this.f47108b1.m127692e0());
            bundle.putInt("EXTRA_DATA_RETAIN_KEY", m131953a);
            if (m92650VI != null && (m92642L3 = m92650VI.m92642L3()) != null) {
                m92642L3.putInt("EXTRA_DATA_RETAIN_KEY", m131953a);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "StoryPrivacyBottomSheetView";
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        m90533zL(EnumC17017m.HUG_CONTENT);
        C29859id m148088c = C29859id.m148088c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148088c, "inflate(...)");
        this.f47109c1 = m148088c;
        m47040OL();
        m47039NL();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 != 1000) {
            if (i11 == 1001 && i12 == -1 && intent != null && intent.hasExtra("extra_selected_profiles")) {
                this.f47108b1.m127686W(3, intent.getParcelableArrayListExtra("extra_selected_profiles"));
                this.f47108b1.m127688Y(intent.getBooleanExtra("extra_is_changed_list", false));
            }
        } else if (i12 == -1 && intent != null && intent.hasExtra("extra_selected_profiles")) {
            this.f47108b1.m127686W(2, intent.getParcelableArrayListExtra("extra_selected_profiles"));
            this.f47108b1.m127689Z(intent.getBooleanExtra("extra_is_changed_list", false));
        }
        super.onActivityResult(i11, i12, intent);
    }
}
