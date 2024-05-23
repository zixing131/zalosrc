package com.zing.zalo.p077ui.zalocloud.connect;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.C1802w0;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zalocloud.connect.ZCloudMediaEmptyView;
import com.zing.zalo.p077ui.zalocloud.home.CloudMediaHomeView;
import com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mm0.AbstractC23350e;
import og0.EnumC24251b;
import p205hc.C19965d;
import p363nh.C23744a;
import p649xl.AbstractC29771df;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import ui0.C27280g;
import wb0.AbstractC28906a;
import wb0.C28907b;
import wb0.C28908c;
import wg0.C28989l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes6.dex */
public final class ZCloudMediaEmptyView extends BaseZCloudView<AbstractC29771df> {
    public static final C13829a Companion = new C13829a(null);

    /* renamed from: R0 */
    private final InterfaceC24854k f71516R0;

    /* renamed from: S0 */
    private EnumC24251b f71517S0;

    /* renamed from: com.zing.zalo.ui.zalocloud.connect.ZCloudMediaEmptyView$a */
    /* loaded from: classes6.dex */
    public static final class C13829a {
        private C13829a() {
        }

        public /* synthetic */ C13829a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.connect.ZCloudMediaEmptyView$b */
    /* loaded from: classes6.dex */
    private static final class EnumC13830b extends Enum {

        /* renamed from: p */
        public static final EnumC13830b f71518p = new EnumC13830b("PROTECT_FILE", 0);

        /* renamed from: q */
        public static final EnumC13830b f71519q = new EnumC13830b("SWITCH_DEVICE", 1);

        /* renamed from: r */
        public static final EnumC13830b f71520r = new EnumC13830b("STORAGE_SPACE", 2);

        /* renamed from: s */
        private static final /* synthetic */ EnumC13830b[] f71521s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f71522t;

        static {
            EnumC13830b[] m77112b = m77112b();
            f71521s = m77112b;
            f71522t = AbstractC30166b.m148796a(m77112b);
        }

        private EnumC13830b(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC13830b[] m77112b() {
            return new EnumC13830b[]{f71518p, f71519q, f71520r};
        }

        public static EnumC13830b valueOf(String str) {
            return (EnumC13830b) Enum.valueOf(EnumC13830b.class, str);
        }

        public static EnumC13830b[] values() {
            return (EnumC13830b[]) f71521s.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.connect.ZCloudMediaEmptyView$c */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13831c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71523a;

        static {
            int[] iArr = new int[EnumC13830b.values().length];
            try {
                iArr[EnumC13830b.f71518p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13830b.f71519q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13830b.f71520r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71523a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.connect.ZCloudMediaEmptyView$d */
    /* loaded from: classes6.dex */
    static final class C13832d extends AbstractC19075u implements InterfaceC18494a {
        C13832d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C28907b mo12V4() {
            return (C28907b) new C1802w0(ZCloudMediaEmptyView.this, new C28908c()).m9378a(C28907b.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.connect.ZCloudMediaEmptyView$e */
    /* loaded from: classes6.dex */
    static final class C13833e extends AbstractC19075u implements InterfaceC18505l {
        C13833e() {
            super(1);
        }

        /* renamed from: a */
        public final void m77114a(AbstractC28906a abstractC28906a) {
            AbstractC19074t.m100208f(abstractC28906a, "event");
            if (AbstractC19074t.m100204b(abstractC28906a, AbstractC28906a.a.f133826a)) {
                if (ZCloudMediaEmptyView.this.f71517S0 == EnumC24251b.f117146q) {
                    C28989l.m144729K(C28989l.Companion.m144769a(), 3, false, false, 6, null);
                    C23744a.Companion.m124119a().m124116d(150809, new Object[0]);
                    C17487o0 m92662fJ = ZCloudMediaEmptyView.this.m92662fJ();
                    if (m92662fJ != null) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("IS_IN_MIGRATE_FLOW", true);
                        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        m92662fJ.m93069k2(CloudMediaHomeView.class, bundle, 1, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (abstractC28906a instanceof AbstractC28906a.b) {
                ToastUtils.showMess(ZCloudMediaEmptyView.this.m92652XI(((AbstractC28906a.b) abstractC28906a).m144405a()));
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77114a((AbstractC28906a) obj);
            return C24848g0.f119245a;
        }
    }

    public ZCloudMediaEmptyView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13832d());
        this.f71516R0 = m129210a;
        this.f71517S0 = EnumC24251b.f117146q;
    }

    /* renamed from: uM */
    private final C28907b m77110uM() {
        return (C28907b) this.f71516R0.getValue();
    }

    /* renamed from: vM */
    public static final void m77111vM(ZCloudMediaEmptyView zCloudMediaEmptyView, View view) {
        AbstractC19074t.m100208f(zCloudMediaEmptyView, "this$0");
        zCloudMediaEmptyView.m77110uM().m144408O(zCloudMediaEmptyView.f71517S0);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, ac.InterfaceC0733x
    public String getTrackingKey() {
        if (this.f71517S0 == EnumC24251b.f117146q) {
            return "Cloudmedia_Empty";
        }
        return super.getTrackingKey();
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: iM */
    public void mo57631iM() {
        super.mo57631iM();
        try {
            EnumC24251b.a aVar = EnumC24251b.Companion;
            Bundle m92642L3 = m92642L3();
            int i11 = -1;
            if (m92642L3 != null) {
                i11 = m92642L3.getInt("arg_feature", -1);
            }
            this.f71517S0 = aVar.m126593a(i11);
        } catch (Exception e11) {
            ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            AbstractC23350e.m122776f("SMLZCloudMediaEmptyView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.z_cloud_media_empty_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        super.mo57577oM();
        for (EnumC13830b enumC13830b : EnumC13830b.values()) {
            LinearLayout linearLayout = ((AbstractC29771df) m77756kM()).f137595R;
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            ListItem listItem = new ListItem(m92689tK);
            listItem.m90592m(false);
            listItem.setSubtitleMaxLine(Integer.MAX_VALUE);
            listItem.setBackgroundColor(C23212s8.m119606n(AbstractC2807a.surface_background_alt));
            listItem.setSubtitleColor(C23212s8.m119607o(listItem.getContext(), AbstractC2807a.text_tertiary));
            int i11 = C13831c.f71523a[enumC13830b.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        AppCompatImageView appCompatImageView = new AppCompatImageView(m92689tK());
                        Context m92689tK2 = m92689tK();
                        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
                        appCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK2, AbstractC2810d.zds_ic_storage_line_24, AbstractC2807a.icon_primary));
                        listItem.m90587c(appCompatImageView);
                        listItem.setTitle("");
                        String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_media_empty_description_3);
                        AbstractC19074t.m100207e(m92652XI, "getString(...)");
                        listItem.setSubtitle(m92652XI);
                    }
                } else {
                    AppCompatImageView appCompatImageView2 = new AppCompatImageView(m92689tK());
                    Context m92689tK3 = m92689tK();
                    AbstractC19074t.m100207e(m92689tK3, "requireContext(...)");
                    appCompatImageView2.setImageDrawable(C27280g.m139660c(m92689tK3, AbstractC2810d.zds_ic_device_unknown_line_24, AbstractC2807a.icon_primary));
                    listItem.m90587c(appCompatImageView2);
                    listItem.setTitle("");
                    String m92652XI2 = m92652XI(AbstractC8020f0.str_zcloud_media_empty_description_2);
                    AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                    listItem.setSubtitle(m92652XI2);
                }
            } else {
                AppCompatImageView appCompatImageView3 = new AppCompatImageView(m92689tK());
                Context m92689tK4 = m92689tK();
                AbstractC19074t.m100207e(m92689tK4, "requireContext(...)");
                appCompatImageView3.setImageDrawable(C27280g.m139660c(m92689tK4, AbstractC2810d.zds_ic_gallery_line_24, AbstractC2807a.icon_primary));
                listItem.m90587c(appCompatImageView3);
                listItem.setTitle("");
                String m92652XI3 = m92652XI(AbstractC8020f0.str_zcloud_media_empty_description_1);
                AbstractC19074t.m100207e(m92652XI3, "getString(...)");
                listItem.setSubtitle(m92652XI3);
            }
            linearLayout.addView(listItem);
        }
        ((AbstractC29771df) m77756kM()).f137593P.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_store_on_zcloud, C16805b.Companion.m89811a().m89800f()));
        ((AbstractC29771df) m77756kM()).f137593P.setOnClickListener(new View.OnClickListener() { // from class: vb0.b
            public /* synthetic */ ViewOnClickListenerC27960b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudMediaEmptyView.m77111vM(ZCloudMediaEmptyView.this, view);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m77110uM().m144409P().m9219j(m92657cJ(), new C19965d(new C13833e()));
    }
}
