package com.zing.zalo.p077ui.zalocloud.connect;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zalocloud.connect.ZCloudConnectSuccessView;
import com.zing.zalo.p077ui.zalocloud.home.CloudMediaHomeView;
import com.zing.zalo.p077ui.zalocloud.home.ZCloudHomeView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p307kv.AbstractC21954k;
import p542ub.InterfaceC27218a;
import p649xl.C29987pf;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes6.dex */
public final class ZCloudConnectSuccessView extends SlidableZaloView {
    public static final C13826a Companion = new C13826a(null);

    /* renamed from: P0 */
    private EnumC13827b f71509P0 = EnumC13827b.f71511p;

    /* renamed from: Q0 */
    private C29987pf f71510Q0;

    /* renamed from: com.zing.zalo.ui.zalocloud.connect.ZCloudConnectSuccessView$a */
    /* loaded from: classes6.dex */
    public static final class C13826a {
        private C13826a() {
        }

        public /* synthetic */ C13826a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.connect.ZCloudConnectSuccessView$b */
    /* loaded from: classes6.dex */
    public static final class EnumC13827b extends Enum {

        /* renamed from: p */
        public static final EnumC13827b f71511p = new EnumC13827b("CONNECT_FEATURE", 0);

        /* renamed from: q */
        public static final EnumC13827b f71512q = new EnumC13827b("MIGRATE", 1);

        /* renamed from: r */
        private static final /* synthetic */ EnumC13827b[] f71513r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f71514s;

        static {
            EnumC13827b[] m77107b = m77107b();
            f71513r = m77107b;
            f71514s = AbstractC30166b.m148796a(m77107b);
        }

        private EnumC13827b(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC13827b[] m77107b() {
            return new EnumC13827b[]{f71511p, f71512q};
        }

        public static EnumC13827b valueOf(String str) {
            return (EnumC13827b) Enum.valueOf(EnumC13827b.class, str);
        }

        public static EnumC13827b[] values() {
            return (EnumC13827b[]) f71513r.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.connect.ZCloudConnectSuccessView$c */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13828c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71515a;

        static {
            int[] iArr = new int[EnumC13827b.values().length];
            try {
                iArr[EnumC13827b.f71511p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13827b.f71512q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f71515a = iArr;
        }
    }

    /* renamed from: hM */
    private final void m77105hM() {
        int i11 = C13828c.f71515a[this.f71509P0.ordinal()];
        C29987pf c29987pf = null;
        if (i11 != 1) {
            if (i11 == 2) {
                C29987pf c29987pf2 = this.f71510Q0;
                if (c29987pf2 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29987pf2 = null;
                }
                c29987pf2.f139043t.setVisibility(0);
                C29987pf c29987pf3 = this.f71510Q0;
                if (c29987pf3 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29987pf3 = null;
                }
                c29987pf3.f139043t.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_migrate_success_view_subtitle, C16805b.Companion.m89811a().m89800f()));
                C29987pf c29987pf4 = this.f71510Q0;
                if (c29987pf4 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29987pf4 = null;
                }
                c29987pf4.f139044u.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_migrate_success_view_title));
                C29987pf c29987pf5 = this.f71510Q0;
                if (c29987pf5 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29987pf5 = null;
                }
                c29987pf5.f139041r.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_zcloud_got_it));
            }
        } else {
            C29987pf c29987pf6 = this.f71510Q0;
            if (c29987pf6 == null) {
                AbstractC19074t.m100223u("binding");
                c29987pf6 = null;
            }
            c29987pf6.f139043t.setVisibility(8);
            C29987pf c29987pf7 = this.f71510Q0;
            if (c29987pf7 == null) {
                AbstractC19074t.m100223u("binding");
                c29987pf7 = null;
            }
            c29987pf7.f139044u.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_title_connected_with_zcloud, C16805b.Companion.m89811a().m89800f()));
            C29987pf c29987pf8 = this.f71510Q0;
            if (c29987pf8 == null) {
                AbstractC19074t.m100223u("binding");
                c29987pf8 = null;
            }
            c29987pf8.f139041r.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.close));
        }
        C29987pf c29987pf9 = this.f71510Q0;
        if (c29987pf9 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29987pf = c29987pf9;
        }
        c29987pf.f139041r.setOnClickListener(new View.OnClickListener() { // from class: vb0.a
            public /* synthetic */ ViewOnClickListenerC27959a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudConnectSuccessView.m77106iM(ZCloudConnectSuccessView.this, view);
            }
        });
    }

    /* renamed from: iM */
    public static final void m77106iM(ZCloudConnectSuccessView zCloudConnectSuccessView, View view) {
        C17487o0 mo35579p;
        C17487o0 mo35579p2;
        AbstractC19074t.m100208f(zCloudConnectSuccessView, "this$0");
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        if (zCloudConnectSuccessView.f71509P0 == EnumC13827b.f71512q) {
            InterfaceC27218a m92676n2 = zCloudConnectSuccessView.m92676n2();
            if (m92676n2 != null && (mo35579p2 = m92676n2.mo35579p()) != null) {
                mo35579p2.m93069k2(ZCloudHomeView.class, bundle, 1, true);
                return;
            }
            return;
        }
        InterfaceC27218a m92676n22 = zCloudConnectSuccessView.m92676n2();
        if (m92676n22 != null && (mo35579p = m92676n22.mo35579p()) != null) {
            mo35579p.m93069k2(CloudMediaHomeView.class, bundle, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        EnumC13827b enumC13827b;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (enumC13827b = (EnumC13827b) AbstractC21954k.Companion.m114622q(m92642L3, "EXTRA_FLOW", EnumC13827b.class)) != null) {
            this.f71509P0 = enumC13827b;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC7409c0.zcloud_connect_success_view, viewGroup, false);
        C29987pf m148378a = C29987pf.m148378a(inflate);
        AbstractC19074t.m100207e(m148378a, "bind(...)");
        this.f71510Q0 = m148378a;
        m77105hM();
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return false;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "";
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
