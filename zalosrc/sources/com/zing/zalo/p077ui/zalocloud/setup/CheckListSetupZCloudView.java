package com.zing.zalo.p077ui.zalocloud.setup;

import ac.C0697c0;
import ac.C0732w;
import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.BackupKeySetupView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.customviews.C13835a;
import com.zing.zalo.p077ui.zalocloud.setup.AbstractC14005a;
import com.zing.zalo.p077ui.zalocloud.setup.CheckListSetupZCloudView;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.InterfaceC19066n;
import hc0.C19978h;
import hc0.C19979i;
import hc0.EnumC19985o;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import me0.AbstractC23222t7;
import mj0.AbstractC23322a;
import p205hc.C19965d;
import p348mi.AbstractC23306f;
import p649xl.AbstractC29932me;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import tg0.C26676b;
import ui0.C27280g;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public final class CheckListSetupZCloudView extends BaseSetupZaloCloudView<AbstractC29932me> {
    public static final C13968a Companion = new C13968a(null);

    /* renamed from: U0 */
    private final InterfaceC24854k f71948U0;

    /* renamed from: V0 */
    private int f71949V0;

    /* renamed from: W0 */
    private boolean f71950W0;

    /* renamed from: X0 */
    private boolean f71951X0;

    /* renamed from: Y0 */
    private boolean f71952Y0;

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.CheckListSetupZCloudView$a */
    /* loaded from: classes6.dex */
    public static final class C13968a {
        private C13968a() {
        }

        public /* synthetic */ C13968a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.zalocloud.setup.CheckListSetupZCloudView$b */
    /* loaded from: classes6.dex */
    public static final class EnumC13969b {

        /* renamed from: p */
        public static final EnumC13969b f71953p = new EnumC13969b("SETUP", 0);

        /* renamed from: q */
        public static final EnumC13969b f71954q = new EnumC13969b("DONE", 1);

        /* renamed from: r */
        public static final EnumC13969b f71955r = new EnumC13969b("RESTART", 2);

        /* renamed from: s */
        public static final EnumC13969b f71956s = new EnumC13969b("RESET_CLOUD", 3);

        /* renamed from: t */
        private static final /* synthetic */ EnumC13969b[] f71957t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f71958u;

        static {
            EnumC13969b[] m77785b = m77785b();
            f71957t = m77785b;
            f71958u = AbstractC30166b.m148796a(m77785b);
        }

        private EnumC13969b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC13969b[] m77785b() {
            return new EnumC13969b[]{f71953p, f71954q, f71955r, f71956s};
        }

        public static EnumC13969b valueOf(String str) {
            return (EnumC13969b) Enum.valueOf(EnumC13969b.class, str);
        }

        public static EnumC13969b[] values() {
            return (EnumC13969b[]) f71957t.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.CheckListSetupZCloudView$c */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13970c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71959a;

        static {
            int[] iArr = new int[EnumC13969b.values().length];
            try {
                iArr[EnumC13969b.f71955r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13969b.f71954q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13969b.f71953p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC13969b.f71956s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f71959a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.CheckListSetupZCloudView$d */
    /* loaded from: classes6.dex */
    static final class C13971d extends AbstractC19075u implements InterfaceC18494a {
        C13971d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C14006b mo12V4() {
            return (C14006b) new C1802w0(CheckListSetupZCloudView.this, new C19978h()).m9378a(C14006b.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.CheckListSetupZCloudView$e */
    /* loaded from: classes6.dex */
    static final class C13972e extends AbstractC19075u implements InterfaceC18505l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zalocloud.setup.CheckListSetupZCloudView$e$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f71962q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long mo12V4() {
                return Long.valueOf(AbstractC0924m0.m3595Y7());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zalocloud.setup.CheckListSetupZCloudView$e$b */
        /* loaded from: classes6.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ CheckListSetupZCloudView f71963q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(CheckListSetupZCloudView checkListSetupZCloudView) {
                super(0);
                this.f71963q = checkListSetupZCloudView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m77789a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m77789a() {
                AbstractC0924m0.m3973kr(this.f71963q.m77757mM().mo124314i());
            }
        }

        C13972e() {
            super(1);
        }

        /* renamed from: a */
        public final void m77787a(AbstractC14005a abstractC14005a) {
            AbstractC19074t.m100208f(abstractC14005a, "event");
            if (AbstractC19074t.m100204b(abstractC14005a, AbstractC14005a.a.f72011a)) {
                if (CheckListSetupZCloudView.this.m77767IM() == EnumC13969b.f71954q) {
                    AbstractC23306f.m120636Y1().m128511C(true);
                    CheckListSetupZCloudView checkListSetupZCloudView = CheckListSetupZCloudView.this;
                    checkListSetupZCloudView.m77754gM(a.f71962q, new b(checkListSetupZCloudView));
                    return;
                }
                return;
            }
            if (AbstractC19074t.m100204b(abstractC14005a, AbstractC14005a.c.f72013a)) {
                CheckListSetupZCloudView.this.m77777TM();
            } else if (AbstractC19074t.m100204b(abstractC14005a, AbstractC14005a.b.f72012a)) {
                CheckListSetupZCloudView.this.m77750wM(EnumC19985o.f98283A, new Bundle());
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77787a((AbstractC14005a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.CheckListSetupZCloudView$f */
    /* loaded from: classes6.dex */
    static final class C13973f extends AbstractC19075u implements InterfaceC18505l {
        C13973f() {
            super(1);
        }

        /* renamed from: a */
        public final void m77790a(C19979i c19979i) {
            if (c19979i.m103752b()) {
                CheckListSetupZCloudView.this.mo49282B8(null, false);
            } else {
                CheckListSetupZCloudView.this.mo49315c4();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77790a((C19979i) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.CheckListSetupZCloudView$g */
    /* loaded from: classes6.dex */
    static final class C13974g implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f71965p;

        C13974g(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f71965p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f71965p;
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
            this.f71965p.mo205i9(obj);
        }
    }

    public CheckListSetupZCloudView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13971d());
        this.f71948U0 = m129210a;
        this.f71949V0 = 1;
    }

    /* renamed from: HM */
    private final C14006b m77766HM() {
        return (C14006b) this.f71948U0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public final EnumC13969b m77767IM() {
        if (this.f71949V0 == 2) {
            return EnumC13969b.f71954q;
        }
        if (this.f71950W0) {
            return EnumC13969b.f71955r;
        }
        if (this.f71951X0) {
            return EnumC13969b.f71956s;
        }
        return EnumC13969b.f71953p;
    }

    /* renamed from: JM */
    private final void m77768JM() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = ((AbstractC29932me) m77756kM()).f138724V.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null && AbstractC32226c.m155415n(this.f72421L0.m92676n2())) {
            marginLayoutParams.topMargin = AbstractC32226c.m155411j(this.f72421L0.m92676n2()).top;
        }
        int i11 = C13970c.f71959a[m77767IM().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3 || i11 == 4) {
                    m77775RM();
                    return;
                }
                return;
            }
            m77772OM();
            m77775RM();
            return;
        }
        if (this.f71952Y0) {
            m77772OM();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m77769KM(CheckListSetupZCloudView checkListSetupZCloudView, View view) {
        AbstractC19074t.m100208f(checkListSetupZCloudView, "this$0");
        AbstractC23306f.m120636Y1().m128516H(true);
        if (checkListSetupZCloudView.f71950W0) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_undone_setup_restart_continue", null, null, null, 14, null);
        }
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_setup_start_btn", null, null, null, 14, null);
        checkListSetupZCloudView.m77766HM().m77911T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static final void m77770LM(CheckListSetupZCloudView checkListSetupZCloudView, View view) {
        AbstractC19074t.m100208f(checkListSetupZCloudView, "this$0");
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_connect_to_zalo_next", null, null, null, 14, null);
        BaseSetupZaloCloudView.m77746xM(checkListSetupZCloudView, EnumC19985o.f98291t, null, 2, null);
    }

    /* renamed from: MM */
    private final boolean m77771MM() {
        return this.f71949V0 == 2;
    }

    /* renamed from: OM */
    private final void m77772OM() {
        ImageView imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(20);
        layoutParams.addRule(15);
        layoutParams.setMargins(AbstractC23222t7.f112566j, 0, 0, 0);
        int i11 = AbstractC23222t7.f112566j;
        imageView.setPadding(i11, 0, i11, i11);
        imageView.setLayoutParams(layoutParams);
        Context context = imageView.getContext();
        if (context == null) {
            return;
        }
        AbstractC19074t.m100205c(context);
        imageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_arrow_left_line_24, AbstractC2807a.icon_primary));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: hc0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckListSetupZCloudView.m77774QM(CheckListSetupZCloudView.this, view);
            }
        });
        ((AbstractC29932me) m77756kM()).f138724V.addView(imageView);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        Button button = new Button(m92689tK);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(21);
        layoutParams2.addRule(15);
        layoutParams2.setMargins(0, 0, AbstractC23222t7.f112566j, 0);
        int i12 = AbstractC23222t7.f112566j;
        button.setPadding(i12, 0, i12, i12);
        button.setLayoutParams(layoutParams2);
        button.setVisibility(8);
        button.m90539c(AbstractC2814h.ButtonSmall_Tertiary);
        button.setText(m92652XI(AbstractC8020f0.str_zcloud_manage_plan_btn));
        button.setOnClickListener(new View.OnClickListener() { // from class: hc0.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckListSetupZCloudView.m77773PM(CheckListSetupZCloudView.this, view);
            }
        });
        ((AbstractC29932me) m77756kM()).f138724V.addView(button);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public static final void m77773PM(CheckListSetupZCloudView checkListSetupZCloudView, View view) {
        AbstractC19074t.m100208f(checkListSetupZCloudView, "this$0");
        checkListSetupZCloudView.m77781g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public static final void m77774QM(CheckListSetupZCloudView checkListSetupZCloudView, View view) {
        AbstractC19074t.m100208f(checkListSetupZCloudView, "this$0");
        checkListSetupZCloudView.m77781g();
    }

    /* renamed from: RM */
    private final void m77775RM() {
        ImageView imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(21);
        layoutParams.addRule(15);
        layoutParams.setMargins(0, 0, AbstractC23222t7.f112566j, 0);
        int i11 = AbstractC23222t7.f112566j;
        imageView.setPadding(i11, 0, i11, i11);
        imageView.setLayoutParams(layoutParams);
        Context context = imageView.getContext();
        if (context == null) {
            return;
        }
        AbstractC19074t.m100205c(context);
        imageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_close_line_24, AbstractC2807a.icon_primary));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: hc0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckListSetupZCloudView.m77776SM(CheckListSetupZCloudView.this, view);
            }
        });
        ((AbstractC29932me) m77756kM()).f138724V.addView(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public static final void m77776SM(CheckListSetupZCloudView checkListSetupZCloudView, View view) {
        AbstractC19074t.m100208f(checkListSetupZCloudView, "this$0");
        checkListSetupZCloudView.m77778UM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public final void m77777TM() {
        Snackbar.C16925c c16925c = Snackbar.Companion;
        FrameLayout frameLayout = ((AbstractC29932me) m77756kM()).f138720R;
        AbstractC19074t.m100207e(frameLayout, "snackBarContainer");
        String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_setup_error);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        Snackbar m90669d = c16925c.m90669d(frameLayout, m92652XI, -1);
        Context context = getContext();
        if (context == null) {
            return;
        }
        AbstractC19074t.m100205c(context);
        m90669d.m90644J(C27280g.m139659b(context, AbstractC23322a.zds_ic_close_circle_solid_24, AbstractC2808b.f150830r60));
        m90669d.m90648N();
    }

    /* renamed from: UM */
    private final void m77778UM() {
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a m90932i = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION);
        String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_dismiss_setup_dialog_title);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        C16972e0.a m90918B = m90932i.m90918B(m92652XI);
        String m92652XI2 = m92652XI(AbstractC8020f0.str_zcloud_dismiss_setup_dialog_description);
        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
        m90918B.m90949z(m92652XI2).m90921E(true).m90937n("zcloud_undone_setup_confirm_stay").m90947x("zcloud_undone_setup_confirm_dismiss").m90942s(AbstractC8020f0.str_leave, new InterfaceC17463d.d() { // from class: hc0.f
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                CheckListSetupZCloudView.m77779VM(CheckListSetupZCloudView.this, interfaceC17463d, i11);
            }
        }).m90933j(AbstractC8020f0.str_stay, new InterfaceC17463d.d() { // from class: hc0.g
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                CheckListSetupZCloudView.m77780WM(interfaceC17463d, i11);
            }
        }).m90927d().mo13822K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public static final void m77779VM(CheckListSetupZCloudView checkListSetupZCloudView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(checkListSetupZCloudView, "this$0");
        AbstractC23306f.m120636Y1().m128516H(true);
        ZaloView m92650VI = checkListSetupZCloudView.m92650VI();
        if (m92650VI != null) {
            m92650VI.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WM */
    public static final void m77780WM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: g */
    private final void m77781g() {
        if (m77767IM() == EnumC13969b.f71955r) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_undone_setup_restart_dismiss", null, null, null, 14, null);
        }
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null && m92662fJ.m93018M0() == 1) {
            m77748tM().m77922T();
        } else {
            finish();
        }
    }

    /* renamed from: NM */
    public final boolean m77784NM() {
        return this.f71952Y0 && this.f71949V0 == 1;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, ac.InterfaceC0733x
    public String getTrackingKey() {
        int i11 = C13970c.f71959a[m77767IM().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3 || i11 == 4) {
                    return "ZCloudSetUpIntro";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "ZCloudCreateCodeDone";
        }
        return "ZCloudSetUpRestart";
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: hM */
    public void mo77755hM() {
        String str;
        String str2;
        if (this.f71949V0 == 1) {
            if (AbstractC0924m0.m3749dd()) {
                str2 = "first_time";
            } else {
                str2 = "quick_action";
            }
            C0697c0.Companion.m1052f(this, "source", str2);
        }
        AbstractC0924m0.m3943jr(false);
        if (m77771MM()) {
            C26676b c26676b = C26676b.f126324a;
            BackupKeySetupView.EnumC11021b m77924V = m77748tM().m77924V();
            if (m77748tM().m77933g0()) {
                str = "resume";
            } else {
                str = "setup";
            }
            c26676b.m136990c0(m77924V, str);
        }
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseSetupZaloCloudView, com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: iM */
    public void mo57631iM() {
        super.mo57631iM();
        this.f71950W0 = m77748tM().m77933g0();
        this.f71951X0 = m77748tM().m77931e0();
        Bundle m92642L3 = m92642L3();
        boolean z11 = false;
        if (m92642L3 != null) {
            z11 = m92642L3.getBoolean("ARG_BACK_BUTTON", false);
        }
        this.f71952Y0 = z11;
        Bundle m92642L32 = m92642L3();
        int i11 = 1;
        if (m92642L32 != null) {
            i11 = m92642L32.getInt("ARG_CURRENT_STEP", 1);
        }
        this.f71949V0 = i11;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.z_cloud_check_list_setup_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        Drawable m139658a;
        List m131505m;
        super.mo57577oM();
        m77768JM();
        RobotoTextView robotoTextView = ((AbstractC29932me) m77756kM()).f138725W;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_setup_checklist_title);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        C16805b.b bVar = C16805b.Companion;
        String format = String.format(m92652XI, Arrays.copyOf(new Object[]{bVar.m89811a().m89800f()}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
        AppCompatImageView appCompatImageView = ((AbstractC29932me) m77756kM()).f138723U;
        if (this.f71949V0 == 1 && m77767IM() == EnumC13969b.f71955r) {
            Context context = getContext();
            if (context == null) {
                return;
            } else {
                m139658a = C27280g.m139660c(context, AbstractC16803z.ic_backup_warning_solid_32, AbstractC2807a.accent_blue_icon);
            }
        } else {
            Context context2 = getContext();
            if (context2 == null) {
                return;
            } else {
                m139658a = C27280g.m139658a(context2, AbstractC16803z.ic_zcloud_setup);
            }
        }
        appCompatImageView.setImageDrawable(m139658a);
        Button button = ((AbstractC29932me) m77756kM()).f138718P;
        int i11 = this.f71949V0;
        if (i11 != 1) {
            if (i11 == 2) {
                ((AbstractC29932me) m77756kM()).f138718P.setText(m92652XI(AbstractC8020f0.str_zcloud_setup_next));
                button.setOnClickListener(new View.OnClickListener() { // from class: hc0.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CheckListSetupZCloudView.m77770LM(CheckListSetupZCloudView.this, view);
                    }
                });
            }
        } else {
            if (m77767IM() == EnumC13969b.f71956s) {
                ((AbstractC29932me) m77756kM()).f138718P.setText(m92652XI(AbstractC8020f0.str_zcloud_setup_next));
            } else {
                ((AbstractC29932me) m77756kM()).f138718P.setText(m92652XI(AbstractC8020f0.str_zcloud_setup_start));
            }
            button.setOnClickListener(new View.OnClickListener() { // from class: hc0.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckListSetupZCloudView.m77769KM(CheckListSetupZCloudView.this, view);
                }
            });
        }
        String m92652XI2 = m92652XI(AbstractC8020f0.str_zcloud_setup_checklist_connect_to_the_cloud);
        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
        String format2 = String.format(m92652XI2, Arrays.copyOf(new Object[]{bVar.m89811a().m89800f()}, 1));
        AbstractC19074t.m100207e(format2, "format(...)");
        String m92652XI3 = m92652XI(AbstractC8020f0.str_zcloud_setup_checklist_connect_to_the_cloud_description);
        AbstractC19074t.m100207e(m92652XI3, "getString(...)");
        String m92652XI4 = m92652XI(AbstractC8020f0.str_zcloud_setup_checklist_connect_to_the_cloud);
        AbstractC19074t.m100207e(m92652XI4, "getString(...)");
        String format3 = String.format(m92652XI4, Arrays.copyOf(new Object[]{bVar.m89811a().m89800f()}, 1));
        AbstractC19074t.m100207e(format3, "format(...)");
        String m92652XI5 = m92652XI(AbstractC8020f0.str_zcloud_setup_checklist_connect_to_the_cloud_description);
        AbstractC19074t.m100207e(m92652XI5, "getString(...)");
        String m92652XI6 = m92652XI(AbstractC8020f0.str_zcloud_setup_checklist_create_data_protection_code);
        AbstractC19074t.m100207e(m92652XI6, "getString(...)");
        String m92652XI7 = m92652XI(AbstractC8020f0.f43880xb5663cd);
        AbstractC19074t.m100207e(m92652XI7, "getString(...)");
        String m92652XI8 = m92652XI(AbstractC8020f0.str_zcloud_setup_checklist_create_data_protection_code);
        AbstractC19074t.m100207e(m92652XI8, "getString(...)");
        String m92652XI9 = m92652XI(AbstractC8020f0.f43880xb5663cd);
        AbstractC19074t.m100207e(m92652XI9, "getString(...)");
        m131505m = AbstractC25368s.m131505m(new C13835a(1, format2, m92652XI3, format3, m92652XI5), new C13835a(2, m92652XI6, m92652XI7, m92652XI8, m92652XI9));
        ((AbstractC29932me) m77756kM()).f138721S.m77116b(m131505m, this.f71949V0);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (m77767IM() != EnumC13969b.f71955r && this.f71949V0 == 1) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m77766HM().m77909R().m9219j(m92657cJ(), new C19965d(new C13972e()));
        m77766HM().m77910S().m9219j(m92657cJ(), new C13974g(new C13973f()));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        if (!this.f71952Y0) {
            return;
        }
        m77781g();
    }
}
