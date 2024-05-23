package com.zing.zalo.p077ui.backuprestore.encryption.setup.pin;

import ac.C0708i;
import ac.C0732w;
import am.AbstractC0924m0;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.C1802w0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.pin.ZCloudSetUpPinRemind;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import java.util.Arrays;
import me0.AbstractC23136l9;
import me0.C23055e5;
import me0.C23212s8;
import p649xl.AbstractC29807ff;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import r40.C25647a;
import si.C26263i;

/* loaded from: classes5.dex */
public final class ZCloudSetUpPinRemind extends BaseZCloudView<AbstractC29807ff> {
    public static final C11062a Companion = new C11062a(null);

    /* renamed from: R0 */
    private final InterfaceC24854k f55775R0;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.ZCloudSetUpPinRemind$a */
    /* loaded from: classes5.dex */
    public static final class C11062a {
        private C11062a() {
        }

        public /* synthetic */ C11062a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.ZCloudSetUpPinRemind$b */
    /* loaded from: classes5.dex */
    static final class C11063b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11063b f55776q = new C11063b();

        C11063b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Long mo12V4() {
            return Long.valueOf(AbstractC0924m0.m3744d8());
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.ZCloudSetUpPinRemind$c */
    /* loaded from: classes5.dex */
    static final class C11064c extends AbstractC19075u implements InterfaceC18494a {
        C11064c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57731a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57731a() {
            AbstractC0924m0.m4123pr(ZCloudSetUpPinRemind.this.m77757mM().mo124314i());
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.ZCloudSetUpPinRemind$d */
    /* loaded from: classes5.dex */
    static final class C11065d extends AbstractC19075u implements InterfaceC18494a {
        C11065d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C11067b mo12V4() {
            ZaloView m92690uK = ZCloudSetUpPinRemind.this.m92690uK();
            AbstractC19074t.m100207e(m92690uK, "requireParentZaloView(...)");
            return (C11067b) new C1802w0(m92690uK, new C25647a()).m9378a(C11067b.class);
        }
    }

    public ZCloudSetUpPinRemind() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C11065d());
        this.f55775R0 = m129210a;
    }

    /* renamed from: vM */
    private final C11067b m57726vM() {
        return (C11067b) this.f55775R0.getValue();
    }

    /* renamed from: wM */
    public static final void m57727wM(ZCloudSetUpPinRemind zCloudSetUpPinRemind, View view) {
        AbstractC19074t.m100208f(zCloudSetUpPinRemind, "this$0");
        if (!C23055e5.m118272g(true)) {
            return;
        }
        if (C26263i.m135055u().m135071M()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_try_again_wait_optimizing));
            return;
        }
        if (zCloudSetUpPinRemind.m92650VI() instanceof PinCodeSetupContainerView) {
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            ZaloView m92650VI = zCloudSetUpPinRemind.m92650VI();
            AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupContainerView");
            c0708i.m1075f("source", ((PinCodeSetupContainerView) m92650VI).m77749uM(false));
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, "zcloud_setup_pin_reconfirm_understood", null, c0708i, null, 10, null);
        }
        if (zCloudSetUpPinRemind.m57726vM().m57747Z()) {
            zCloudSetUpPinRemind.m57726vM().m57741S();
        } else if (zCloudSetUpPinRemind.m57726vM().m57746Y()) {
            zCloudSetUpPinRemind.m57726vM().m57738P();
        } else {
            zCloudSetUpPinRemind.m57726vM().m57752f0();
        }
    }

    /* renamed from: xM */
    public static final void m57728xM(ZCloudSetUpPinRemind zCloudSetUpPinRemind, View view) {
        AbstractC19074t.m100208f(zCloudSetUpPinRemind, "this$0");
        if (zCloudSetUpPinRemind.m92650VI() instanceof PinCodeSetupContainerView) {
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            ZaloView m92650VI = zCloudSetUpPinRemind.m92650VI();
            AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupContainerView");
            c0708i.m1075f("source", ((PinCodeSetupContainerView) m92650VI).m77749uM(false));
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, "zcloud_setup_pin_reconfirm_redo", null, c0708i, null, 10, null);
        }
        zCloudSetUpPinRemind.m57726vM().m57742T();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ZCloudSetUpPinRemind";
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.z_cloud_set_up_pin_remind_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: nM */
    public void mo57729nM() {
        super.mo57729nM();
        m77754gM(C11063b.f55776q, new C11064c());
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        int i11;
        super.mo57577oM();
        RobotoTextView robotoTextView = ((AbstractC29807ff) m77756kM()).f137809T;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_remember_data_protection_code_description);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        String format = String.format(m92652XI, Arrays.copyOf(new Object[]{C16805b.Companion.m89811a().m89800f()}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
        AppCompatImageView appCompatImageView = ((AbstractC29807ff) m77756kM()).f137808S;
        if (C23212s8.m119603k()) {
            i11 = AbstractC16803z.ic_remember_key_light;
        } else {
            i11 = AbstractC16803z.ic_remember_key_dark;
        }
        appCompatImageView.setImageResource(i11);
        ((AbstractC29807ff) m77756kM()).f137807R.setOnClickListener(new View.OnClickListener() { // from class: r40.d
            public /* synthetic */ ViewOnClickListenerC25650d() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudSetUpPinRemind.m57727wM(ZCloudSetUpPinRemind.this, view);
            }
        });
        ((AbstractC29807ff) m77756kM()).f137806Q.setOnClickListener(new View.OnClickListener() { // from class: r40.e
            public /* synthetic */ ViewOnClickListenerC25651e() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudSetUpPinRemind.m57728xM(ZCloudSetUpPinRemind.this, view);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
    }
}
