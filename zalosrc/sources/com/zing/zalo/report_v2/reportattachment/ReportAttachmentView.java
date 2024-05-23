package com.zing.zalo.report_v2.reportattachment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import au.C2370r0;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.showingphotolib.view.SimpleAnimationTarget;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.report_v2.model.ReportInfoCollected;
import com.zing.zalo.report_v2.model.ReportPhotoAttachment;
import com.zing.zalo.report_v2.reportattachment.ReportAttachmentView;
import com.zing.zalo.report_v2.reportsummary.C9346a;
import com.zing.zalo.report_v2.reportsummary.ReportSummaryView;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import i40.C20275e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m90.EnumC22962a;
import me0.AbstractC23136l9;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import p205hc.InterfaceC19968g;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p409oz.C24585b;
import p458qr.C25470c;
import p458qr.C25471d;
import p466qz.C25569c;
import p466qz.InterfaceC25567a;
import p466qz.InterfaceC25568b;
import p542ub.InterfaceC27218a;
import p649xl.C29964oa;
import p649xl.C29994q4;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import ui0.C27280g;
import v50.C27870vb;

/* loaded from: classes4.dex */
public final class ReportAttachmentView extends BaseZaloView implements InterfaceC25568b, InterfaceC17463d.d {
    public static final C9331a Companion = new C9331a(null);

    /* renamed from: S0 */
    private static int f49444S0 = AbstractC23222t7.f112579p0;

    /* renamed from: M0 */
    private C29964oa f49445M0;

    /* renamed from: N0 */
    private InterfaceC25567a f49446N0;

    /* renamed from: O0 */
    private C23528a f49447O0;

    /* renamed from: P0 */
    private LayoutInflater f49448P0;

    /* renamed from: Q0 */
    private View f49449Q0;

    /* renamed from: R0 */
    private final InterfaceC24854k f49450R0;

    /* renamed from: com.zing.zalo.report_v2.reportattachment.ReportAttachmentView$a */
    /* loaded from: classes4.dex */
    public static final class C9331a {
        private C9331a() {
        }

        public /* synthetic */ C9331a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportattachment.ReportAttachmentView$b */
    /* loaded from: classes4.dex */
    public static final class C9332b {

        /* renamed from: a */
        private final C29994q4 f49451a;

        /* renamed from: b */
        private int f49452b;

        /* renamed from: c */
        private ReportPhotoAttachment f49453c;

        /* renamed from: d */
        private final AnimationTarget f49454d;

        /* renamed from: com.zing.zalo.report_v2.reportattachment.ReportAttachmentView$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends SimpleAnimationTarget {
            a() {
            }

            @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
            public Rect getAnimTargetLocationOnScreen() {
                int[] iArr = new int[2];
                RoundCornerImageView roundCornerImageView = C9332b.this.m50248c().f139089q;
                AbstractC19074t.m100207e(roundCornerImageView, "reportPhotoImv");
                roundCornerImageView.getLocationOnScreen(iArr);
                int i11 = iArr[0];
                int i12 = iArr[1];
                return new Rect(i11, i12, roundCornerImageView.getMeasuredWidth() + i11, roundCornerImageView.getMeasuredHeight() + i12);
            }
        }

        /* renamed from: com.zing.zalo.report_v2.reportattachment.ReportAttachmentView$b$b */
        /* loaded from: classes4.dex */
        public static final class b extends C23999j {
            b() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(interfaceC3968a, "iv");
                AbstractC19074t.m100208f(c23995f, "status");
                super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            }
        }

        public C9332b(C29994q4 c29994q4) {
            AbstractC19074t.m100208f(c29994q4, "binding");
            this.f49451a = c29994q4;
            this.f49454d = new a();
            c29994q4.getRoot().setTag(this);
        }

        /* renamed from: a */
        public final void m50246a(int i11, ReportPhotoAttachment reportPhotoAttachment, C23528a c23528a) {
            AbstractC19074t.m100208f(reportPhotoAttachment, "photoAttachment");
            AbstractC19074t.m100208f(c23528a, "aQuery");
            this.f49452b = i11;
            this.f49453c = reportPhotoAttachment;
            ((C23528a) c23528a.m123612r(this.f49451a.f139089q)).m123579C(reportPhotoAttachment.m50199b(), C23278z2.m120066E(), new b());
        }

        /* renamed from: b */
        public final AnimationTarget m50247b() {
            return this.f49454d;
        }

        /* renamed from: c */
        public final C29994q4 m50248c() {
            return this.f49451a;
        }

        /* renamed from: d */
        public final int m50249d() {
            return this.f49452b;
        }

        /* renamed from: e */
        public final ReportPhotoAttachment m50250e() {
            return this.f49453c;
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportattachment.ReportAttachmentView$c */
    /* loaded from: classes4.dex */
    static final class C9333c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.report_v2.reportattachment.ReportAttachmentView$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends C20275e {
            a() {
            }

            @Override // i40.C20275e
            /* renamed from: h */
            public int mo36887h(int i11) {
                return i11;
            }

            @Override // i40.C20275e
            /* renamed from: s */
            public boolean mo36888s() {
                return true;
            }
        }

        C9333c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a mo12V4() {
            a aVar = new a();
            C29964oa c29964oa = ReportAttachmentView.this.f49445M0;
            if (c29964oa == null) {
                AbstractC19074t.m100223u("binding");
                c29964oa = null;
            }
            aVar.m105861G(new C2370r0(c29964oa.getRoot()));
            return aVar;
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportattachment.ReportAttachmentView$d */
    /* loaded from: classes4.dex */
    public static final class C9334d extends ZdsActionBar.AbstractC16987c {
        C9334d() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            ReportAttachmentView.this.m50205BM();
        }
    }

    public ReportAttachmentView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C9333c());
        this.f49450R0 = m129210a;
    }

    /* renamed from: AM */
    private final void m50204AM() {
        C29964oa c29964oa = this.f49445M0;
        InterfaceC25567a interfaceC25567a = null;
        if (c29964oa == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa = null;
        }
        ListItem listItem = c29964oa.f138886r;
        listItem.setIdTracking("REPORT_ATTACHMENT_BTN_ATTACHMENT_MSG");
        Context context = listItem.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        listItem.setBackground(C27280g.m139658a(context, AbstractC2810d.stencils_list_bg));
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(listItem.getContext());
        zAppCompatImageView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        Context context2 = zAppCompatImageView.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_bubble_multiselect_line_24, AbstractC2807a.icon_02));
        listItem.m90587c(zAppCompatImageView);
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        listItem.setLeadingGravity(enumC16952b0);
        listItem.getIconChevronRight().setVisibility(0);
        listItem.m90592m(true);
        listItem.m90591l(AbstractC23136l9.m118712h(listItem.getContext(), 56.0f), 0, 0, 0);
        C29964oa c29964oa2 = this.f49445M0;
        if (c29964oa2 == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa2 = null;
        }
        ListItem listItem2 = c29964oa2.f138887s;
        listItem2.setBackgroundColor(C23212s8.m119607o(listItem2.getContext(), AbstractC2807a.ui_background));
        listItem2.setIdTracking("REPORT_ATTACHMENT_BTN_ATTACHMENT_PHOTO");
        ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(listItem2.getContext());
        zAppCompatImageView2.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        Context context3 = zAppCompatImageView2.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        zAppCompatImageView2.setImageDrawable(C27280g.m139660c(context3, AbstractC23322a.zds_ic_add_photo_line_24, AbstractC2807a.icon_02));
        listItem2.m90587c(zAppCompatImageView2);
        listItem2.setLeadingGravity(enumC16952b0);
        listItem2.m90592m(false);
        C29964oa c29964oa3 = this.f49445M0;
        if (c29964oa3 == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa3 = null;
        }
        c29964oa3.f138888t.setIdTracking("REPORT_ATTACHMENT_BTN_ATTACHMENT_DONE");
        InterfaceC25567a interfaceC25567a2 = this.f49446N0;
        if (interfaceC25567a2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC25567a = interfaceC25567a2;
        }
        interfaceC25567a.mo132109Eh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public final void m50205BM() {
        showDialog(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public static final void m50215mM(C19059j0 c19059j0, ReportAttachmentView reportAttachmentView, View view) {
        AbstractC19074t.m100208f(c19059j0, "$itemPhotoHolder");
        AbstractC19074t.m100208f(reportAttachmentView, "this$0");
        ReportPhotoAttachment m50250e = ((C9332b) c19059j0.f94941p).m50250e();
        if (m50250e != null) {
            InterfaceC25567a interfaceC25567a = reportAttachmentView.f49446N0;
            if (interfaceC25567a == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC25567a = null;
            }
            interfaceC25567a.mo132114xp(m50250e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public static final void m50216nM(C19059j0 c19059j0, ReportAttachmentView reportAttachmentView, View view) {
        AbstractC19074t.m100208f(c19059j0, "$itemPhotoHolder");
        AbstractC19074t.m100208f(reportAttachmentView, "this$0");
        ReportPhotoAttachment m50250e = ((C9332b) c19059j0.f94941p).m50250e();
        if (m50250e != null) {
            reportAttachmentView.m50245wM(((C9332b) c19059j0.f94941p).m50249d(), m50250e.m50199b(), ((C9332b) c19059j0.f94941p).m50247b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public static final void m50217oM(ReportAttachmentView reportAttachmentView, String str, View view) {
        AbstractC19074t.m100208f(reportAttachmentView, "this$0");
        AbstractC19074t.m100208f(str, "$linkAttachmentGuideline");
        InterfaceC27218a m92676n2 = reportAttachmentView.m92676n2();
        if (m92676n2 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", str);
            ZaloWebView.Companion.m87171F(m92676n2, str, bundle);
        }
    }

    /* renamed from: pM */
    private final void m50218pM(LinearLayout linearLayout, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i13;
        C29964oa c29964oa = null;
        if (this.f49449Q0 == null) {
            LayoutInflater layoutInflater = this.f49448P0;
            if (layoutInflater == null) {
                AbstractC19074t.m100223u("layoutInflater");
                layoutInflater = null;
            }
            View inflate = layoutInflater.inflate(AbstractC7409c0.report_btn_add_photo, (ViewGroup) linearLayout, false);
            if (inflate != null) {
                inflate.setOnClickListener(new View.OnClickListener() { // from class: qz.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ReportAttachmentView.m50219qM(ReportAttachmentView.this, view);
                    }
                });
            }
            this.f49449Q0 = inflate;
        }
        View view = this.f49449Q0;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(view);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.width = i11;
                marginLayoutParams.height = i11;
                if (linearLayout.getChildCount() > 0) {
                    i13 = i12;
                } else {
                    i13 = 0;
                }
                marginLayoutParams.leftMargin = i13;
                C29964oa c29964oa2 = this.f49445M0;
                if (c29964oa2 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29964oa = c29964oa2;
                }
                if (c29964oa.f138889u.getChildCount() <= 1) {
                    i12 = 0;
                }
                marginLayoutParams.topMargin = i12;
            }
            linearLayout.addView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public static final void m50219qM(ReportAttachmentView reportAttachmentView, View view) {
        AbstractC19074t.m100208f(reportAttachmentView, "this$0");
        InterfaceC25567a interfaceC25567a = reportAttachmentView.f49446N0;
        if (interfaceC25567a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC25567a = null;
        }
        interfaceC25567a.mo132108De();
    }

    /* renamed from: rM */
    private final LinearLayout m50220rM(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(linearLayout2);
        return linearLayout2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public static final void m50221sM(ReportAttachmentView reportAttachmentView) {
        AbstractC19074t.m100208f(reportAttachmentView, "this$0");
        reportAttachmentView.mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
        reportAttachmentView.finish();
    }

    /* renamed from: tM */
    private final C20275e m50222tM() {
        return (C20275e) this.f49450R0.getValue();
    }

    /* renamed from: uM */
    private final int m50223uM(int i11, int i12, int i13) {
        try {
            Context context = getContext();
            InterfaceC27218a m92676n2 = m92676n2();
            boolean z11 = false;
            if (m92676n2 != null && m92676n2.mo35576n3()) {
                z11 = true;
            }
            return (((AbstractC23136l9.m118728m0(context, z11) - i11) - i12) - (i13 * 2)) / 3;
        } catch (Exception unused) {
            return f49444S0;
        }
    }

    /* renamed from: vM */
    private final C9346a m50224vM(Bundle bundle) {
        int i11;
        C25470c m131954b;
        if (bundle != null) {
            i11 = bundle.getInt("EXTRA_DATA_RETAIN_KEY", -1);
        } else {
            i11 = -1;
        }
        if (i11 != -1 && (m131954b = C25471d.m131951c().m131954b(i11)) != null) {
            return C9346a.Companion.m50318a(m131954b);
        }
        return null;
    }

    /* renamed from: xM */
    private final void m50225xM() {
        C29964oa c29964oa = this.f49445M0;
        C29964oa c29964oa2 = null;
        if (c29964oa == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa = null;
        }
        c29964oa.f138888t.setOnClickListener(new View.OnClickListener() { // from class: qz.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReportAttachmentView.m50226yM(ReportAttachmentView.this, view);
            }
        });
        C29964oa c29964oa3 = this.f49445M0;
        if (c29964oa3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29964oa2 = c29964oa3;
        }
        c29964oa2.f138886r.setOnClickListener(new View.OnClickListener() { // from class: qz.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReportAttachmentView.m50227zM(ReportAttachmentView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static final void m50226yM(ReportAttachmentView reportAttachmentView, View view) {
        AbstractC19074t.m100208f(reportAttachmentView, "this$0");
        InterfaceC25567a interfaceC25567a = reportAttachmentView.f49446N0;
        if (interfaceC25567a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC25567a = null;
        }
        interfaceC25567a.mo132116zg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public static final void m50227zM(ReportAttachmentView reportAttachmentView, View view) {
        AbstractC19074t.m100208f(reportAttachmentView, "this$0");
        InterfaceC25567a interfaceC25567a = reportAttachmentView.f49446N0;
        if (interfaceC25567a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC25567a = null;
        }
        interfaceC25567a.mo132110Gb();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C25569c c25569c = new C25569c(this, C24585b.Companion.m128049a());
        this.f49446N0 = c25569c;
        c25569c.mo995Nd(C9335a.Companion.m50258a(this.f72421L0.m92642L3()), m50224vM(bundle));
        this.f49447O0 = new C23528a(getContext());
        LayoutInflater from = LayoutInflater.from(getContext());
        AbstractC19074t.m100207e(from, "from(...)");
        this.f49448P0 = from;
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: Cj */
    public void mo50228Cj(boolean z11) {
        int i11;
        C29964oa c29964oa = this.f49445M0;
        C29964oa c29964oa2 = null;
        if (c29964oa == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa = null;
        }
        ListItem listItem = c29964oa.f138887s;
        int i12 = 8;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        listItem.setVisibility(i11);
        C29964oa c29964oa3 = this.f49445M0;
        if (c29964oa3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29964oa2 = c29964oa3;
        }
        LinearLayout linearLayout = c29964oa2.f138889u;
        if (z11) {
            i12 = 0;
        }
        linearLayout.setVisibility(i12);
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: D4 */
    public void mo50229D4(ContactProfile contactProfile, String str, ArrayList arrayList) {
        AbstractC19074t.m100208f(contactProfile, "contactProfile");
        AbstractC19074t.m100208f(str, "sessionReportId");
        String mo2478b = contactProfile.mo2478b();
        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
        Bundle m140776b = new C27870vb(mo2478b).m140780g(contactProfile).m140776b();
        m140776b.putBoolean("from_report_message", true);
        m140776b.putString("report_session_id", str);
        if (arrayList != null && (!arrayList.isEmpty())) {
            m140776b.putParcelableArrayList("report_list_msg_id_attached", arrayList);
        }
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(ChatView.class, m140776b, 103, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            Context m92686rK = this.f72421L0.m92686rK();
            AbstractC19074t.m100207e(m92686rK, "requireActivity(...)");
            C16972e0.a aVar = new C16972e0.a(m92686rK);
            aVar.m90931h("report_modal_attachment_confirm_exit_view");
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_attachment_not_save_confirm_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            aVar.m90918B(m118743r0);
            aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_attachment_confirm_not_save_no);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            aVar.m90943t(m118743r02, this);
            aVar.m90947x("report_modal_attachment_confirm_exit_view_no");
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_attachment_confirm_not_save_yes);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            aVar.m90934k(m118743r03, this);
            aVar.m90937n("report_modal_attachment_confirm_exit_view_yes");
            return aVar.m90927d();
        }
        return super.mo39014DJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29964oa m148329c = C29964oa.m148329c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148329c, "inflate(...)");
        this.f49445M0 = m148329c;
        m50204AM();
        m50225xM();
        C29964oa c29964oa = this.f49445M0;
        if (c29964oa == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa = null;
        }
        return c29964oa.getRoot();
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: I */
    public void mo50230I() {
        mo70710wy(new Runnable() { // from class: qz.g
            @Override // java.lang.Runnable
            public final void run() {
                ReportAttachmentView.m50221sM(ReportAttachmentView.this);
            }
        });
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: JD */
    public void mo50231JD(boolean z11) {
        C29964oa c29964oa = this.f49445M0;
        if (c29964oa == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa = null;
        }
        c29964oa.f138888t.setEnabled(z11);
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: JI */
    public void mo50232JI(int i11, int i12) {
        C29964oa c29964oa = this.f49445M0;
        if (c29964oa == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa = null;
        }
        c29964oa.f138887s.setBracket("(" + i11 + "/" + i12 + ")");
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        Integer num;
        InterfaceC25567a interfaceC25567a = null;
        if (interfaceC17463d != null) {
            num = Integer.valueOf(interfaceC17463d.mo92862f());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            interfaceC17463d.dismiss();
            if (i11 == -2) {
                InterfaceC25567a interfaceC25567a2 = this.f49446N0;
                if (interfaceC25567a2 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC25567a = interfaceC25567a2;
                }
                interfaceC25567a.mo132111J5();
            }
        }
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: KE */
    public void mo50233KE() {
        mo50035CK(0, null);
        finish();
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: MF */
    public boolean mo50234MF() {
        ZaloView zaloView;
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            zaloView = m92662fJ.m93004H0();
        } else {
            zaloView = null;
        }
        return zaloView instanceof ReportSummaryView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setLeadingFunctionCallback(new C9334d());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        InterfaceC25567a interfaceC25567a = this.f49446N0;
        if (interfaceC25567a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC25567a = null;
        }
        InterfaceC19968g mo50381fi = interfaceC25567a.mo50381fi();
        if (mo50381fi != null && (mo50381fi instanceof C9346a)) {
            C25470c c25470c = new C25470c();
            C9346a.Companion.m50319b(c25470c, (C9346a) mo50381fi);
            bundle.putInt("EXTRA_DATA_RETAIN_KEY", C25471d.m131951c().m131953a(c25470c));
        }
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: UH */
    public void mo50235UH() {
        C29964oa c29964oa = this.f49445M0;
        if (c29964oa == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa = null;
        }
        c29964oa.f138885q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_attachment_main_desc));
        C29964oa c29964oa2 = this.f49445M0;
        if (c29964oa2 == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa2 = null;
        }
        c29964oa2.f138885q.setOnClickListener(null);
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: X4 */
    public void mo50236X4(boolean z11) {
        int i11;
        C29964oa c29964oa = this.f49445M0;
        if (c29964oa == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa = null;
        }
        ListItem listItem = c29964oa.f138886r;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        listItem.setVisibility(i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        InterfaceC25567a interfaceC25567a = this.f49446N0;
        if (interfaceC25567a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC25567a = null;
        }
        interfaceC25567a.mo132112d();
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: aj */
    public void mo50237aj(ReportInfoCollected reportInfoCollected, int i11) {
        AbstractC19074t.m100208f(reportInfoCollected, "reportInfoCollected");
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("report_info", reportInfoCollected);
            bundle.putInt("source_action", i11);
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
            m92662fJ.m93069k2(ReportSummaryView.class, bundle, 2, true);
        }
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: av */
    public void mo50238av(int i11, ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listMediaItemSelected");
        if (i11 <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("extra_photo_type", 10);
        bundle.putInt("extra_max_selected_items", i11);
        bundle.putBoolean("extra_is_enable_external_selected_items", true);
        bundle.putString("extra_message_reach_limit", AbstractC23136l9.m118746s0(AbstractC8020f0.str_report_attachment_photo_reach_limit, Integer.valueOf(i11)));
        bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_attachment_report_account", "account_report", null, 4, null));
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList("extra_external_selected_items", arrayList);
        }
        bundle.putSerializable("extra_media_picker_source", EnumC22962a.f111693q);
        AbstractC23211s7.m119590w(m92676n2(), 102, bundle);
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: fc */
    public void mo50239fc(int i11, int i12) {
        C29964oa c29964oa = this.f49445M0;
        if (c29964oa == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa = null;
        }
        c29964oa.f138886r.setBracket("(" + i11 + "/" + i12 + ")");
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ReportAttachmentView";
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: he */
    public void mo50240he(final String str) {
        AbstractC19074t.m100208f(str, "linkAttachmentGuideline");
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_attachment_main_desc);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        C29964oa c29964oa = this.f49445M0;
        C29964oa c29964oa2 = null;
        if (c29964oa == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa = null;
        }
        RobotoTextView robotoTextView = c29964oa.f138885q;
        SpannableString spannableString = new SpannableString(m118743r0 + AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_attachment_main_desc_learn_more));
        spannableString.setSpan(new ForegroundColorSpan(AbstractC23136l9.m118639A(AbstractC2808b.f150821b60)), m118743r0.length(), spannableString.length(), 33);
        robotoTextView.setText(spannableString);
        C29964oa c29964oa3 = this.f49445M0;
        if (c29964oa3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29964oa2 = c29964oa3;
        }
        c29964oa2.f138885q.setOnClickListener(new View.OnClickListener() { // from class: qz.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReportAttachmentView.m50217oM(ReportAttachmentView.this, str, view);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        Parcelable[] parcelableArrayExtra;
        ArrayList arrayList;
        InterfaceC25567a interfaceC25567a = null;
        if (i11 != 102) {
            if (i11 != 103) {
                super.onActivityResult(i11, i12, intent);
                return;
            }
            if (i12 == -1) {
                if (intent != null) {
                    arrayList = intent.getParcelableArrayListExtra("extra_report_session_list_attach_msg");
                } else {
                    arrayList = null;
                }
                InterfaceC25567a interfaceC25567a2 = this.f49446N0;
                if (interfaceC25567a2 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC25567a = interfaceC25567a2;
                }
                interfaceC25567a.mo132115yj(arrayList);
                return;
            }
            return;
        }
        if (i12 == -1) {
            ArrayList arrayList2 = new ArrayList();
            if (intent != null && (parcelableArrayExtra = intent.getParcelableArrayExtra("result_selected_items")) != null) {
                for (Parcelable parcelable : parcelableArrayExtra) {
                    if (parcelable instanceof MediaItem) {
                        arrayList2.add(parcelable);
                    }
                }
            }
            InterfaceC25567a interfaceC25567a3 = this.f49446N0;
            if (interfaceC25567a3 == null) {
                AbstractC19074t.m100223u("presenter");
            } else {
                interfaceC25567a = interfaceC25567a3;
            }
            interfaceC25567a.mo132113vk(arrayList2);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m50205BM();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: p8 */
    public void mo50241p8(ReportInfoCollected reportInfoCollected) {
        AbstractC19074t.m100208f(reportInfoCollected, "reportInfoCollected");
        Intent intent = new Intent();
        intent.putExtra("report_info", reportInfoCollected);
        C24848g0 c24848g0 = C24848g0.f119245a;
        mo50035CK(-1, intent);
        finish();
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: pF */
    public void mo50242pF(String str) {
        AbstractC19074t.m100208f(str, "reasonName");
        C29964oa c29964oa = null;
        if (str.length() == 0) {
            C29964oa c29964oa2 = this.f49445M0;
            if (c29964oa2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29964oa = c29964oa2;
            }
            c29964oa.f138890v.setVisibility(8);
            return;
        }
        C29964oa c29964oa3 = this.f49445M0;
        if (c29964oa3 == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa3 = null;
        }
        c29964oa3.f138892x.setText(str);
        C29964oa c29964oa4 = this.f49445M0;
        if (c29964oa4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29964oa = c29964oa4;
        }
        c29964oa.f138890v.setVisibility(0);
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: rb */
    public void mo50243rb(List list, boolean z11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i11;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i12;
        C29964oa c29964oa;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int i13;
        int i14;
        Object obj;
        C9332b c9332b;
        ReportPhotoAttachment m50250e;
        HashMap hashMap = new HashMap();
        C29964oa c29964oa2 = this.f49445M0;
        if (c29964oa2 == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa2 = null;
        }
        int childCount = c29964oa2.f138889u.getChildCount();
        boolean z12 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            C29964oa c29964oa3 = this.f49445M0;
            if (c29964oa3 == null) {
                AbstractC19074t.m100223u("binding");
                c29964oa3 = null;
            }
            View childAt = c29964oa3.f138889u.getChildAt(i15);
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                int childCount2 = viewGroup.getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt2 = viewGroup.getChildAt(i16);
                    if (childAt2 != null) {
                        obj = childAt2.getTag();
                    } else {
                        obj = null;
                    }
                    if (obj instanceof C9332b) {
                        c9332b = (C9332b) obj;
                    } else {
                        c9332b = null;
                    }
                    if (c9332b != null && (m50250e = c9332b.m50250e()) != null) {
                        hashMap.put(m50250e.m50198a(), c9332b);
                    }
                }
                viewGroup.removeAllViews();
            }
        }
        C29964oa c29964oa4 = this.f49445M0;
        if (c29964oa4 == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa4 = null;
        }
        c29964oa4.f138889u.removeAllViews();
        C29964oa c29964oa5 = this.f49445M0;
        if (c29964oa5 == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa5 = null;
        }
        LinearLayout linearLayout = c29964oa5.f138889u;
        AbstractC19074t.m100207e(linearLayout, "llLayoutPhoto");
        LinearLayout m50220rM = m50220rM(linearLayout);
        int m118712h = AbstractC23136l9.m118712h(m92689tK(), 8.0f);
        C29964oa c29964oa6 = this.f49445M0;
        if (c29964oa6 == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa6 = null;
        }
        LinearLayout linearLayout2 = c29964oa6.f138889u;
        AbstractC19074t.m100207e(linearLayout2, "llLayoutPhoto");
        ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i11 = marginLayoutParams.leftMargin;
        } else {
            i11 = 0;
        }
        C29964oa c29964oa7 = this.f49445M0;
        if (c29964oa7 == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa7 = null;
        }
        LinearLayout linearLayout3 = c29964oa7.f138889u;
        AbstractC19074t.m100207e(linearLayout3, "llLayoutPhoto");
        ViewGroup.LayoutParams layoutParams2 = linearLayout3.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else {
            marginLayoutParams2 = null;
        }
        if (marginLayoutParams2 != null) {
            i12 = marginLayoutParams2.rightMargin;
        } else {
            i12 = 0;
        }
        int m50223uM = m50223uM(i11, i12, m118712h);
        int i17 = 3;
        if (list != null) {
            int i18 = 0;
            for (Object obj2 : list) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    AbstractC25368s.m131509q();
                }
                ReportPhotoAttachment reportPhotoAttachment = (ReportPhotoAttachment) obj2;
                if (m50220rM.getChildCount() == i17) {
                    C29964oa c29964oa8 = this.f49445M0;
                    if (c29964oa8 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29964oa8 = null;
                    }
                    LinearLayout linearLayout4 = c29964oa8.f138889u;
                    AbstractC19074t.m100207e(linearLayout4, "llLayoutPhoto");
                    m50220rM = m50220rM(linearLayout4);
                }
                final C19059j0 c19059j0 = new C19059j0();
                Object obj3 = hashMap.get(reportPhotoAttachment.m50198a());
                c19059j0.f94941p = obj3;
                if (obj3 == null || ((C9332b) obj3).m50248c().getRoot().getParent() != null) {
                    LayoutInflater layoutInflater = this.f49448P0;
                    if (layoutInflater == null) {
                        AbstractC19074t.m100223u("layoutInflater");
                        layoutInflater = null;
                    }
                    C29994q4 m148395c = C29994q4.m148395c(layoutInflater, m50220rM, z12);
                    AbstractC19074t.m100207e(m148395c, "inflate(...)");
                    c19059j0.f94941p = new C9332b(m148395c);
                }
                FrameLayout root = ((C9332b) c19059j0.f94941p).m50248c().getRoot();
                ViewGroup.LayoutParams layoutParams3 = root.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                } else {
                    marginLayoutParams3 = null;
                }
                if (marginLayoutParams3 != null) {
                    if (m50220rM.getChildCount() > 0) {
                        i13 = m118712h;
                    } else {
                        i13 = 0;
                    }
                    marginLayoutParams3.leftMargin = i13;
                    C29964oa c29964oa9 = this.f49445M0;
                    if (c29964oa9 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29964oa9 = null;
                    }
                    if (c29964oa9.f138889u.getChildCount() > 1) {
                        i14 = m118712h;
                    } else {
                        i14 = 0;
                    }
                    marginLayoutParams3.topMargin = i14;
                    marginLayoutParams3.width = m50223uM;
                    marginLayoutParams3.height = m50223uM;
                }
                m50220rM.addView(root);
                ((C9332b) c19059j0.f94941p).m50248c().f139090r.setOnClickListener(new View.OnClickListener() { // from class: qz.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ReportAttachmentView.m50215mM(C19059j0.this, this, view);
                    }
                });
                RoundCornerImageView roundCornerImageView = ((C9332b) c19059j0.f94941p).m50248c().f139089q;
                roundCornerImageView.setRoundCornerColor(C23212s8.m119607o(roundCornerImageView.getContext(), AbstractC16781w.PrimaryBackgroundColor));
                roundCornerImageView.setOnClickListener(new View.OnClickListener() { // from class: qz.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ReportAttachmentView.m50216nM(C19059j0.this, this, view);
                    }
                });
                C9332b c9332b2 = (C9332b) c19059j0.f94941p;
                C23528a c23528a = this.f49447O0;
                if (c23528a == null) {
                    AbstractC19074t.m100223u("aQuery");
                    c23528a = null;
                }
                c9332b2.m50246a(i18, reportPhotoAttachment, c23528a);
                i18 = i19;
                z12 = false;
                i17 = 3;
            }
        }
        if (z11) {
            if (m50220rM.getChildCount() == 3) {
                C29964oa c29964oa10 = this.f49445M0;
                if (c29964oa10 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29964oa = null;
                } else {
                    c29964oa = c29964oa10;
                }
                LinearLayout linearLayout5 = c29964oa.f138889u;
                AbstractC19074t.m100207e(linearLayout5, "llLayoutPhoto");
                m50220rM = m50220rM(linearLayout5);
            }
            m50218pM(m50220rM, m50223uM, m118712h);
        }
    }

    @Override // p466qz.InterfaceC25568b
    /* renamed from: vh */
    public void mo50244vh(String str) {
        AbstractC19074t.m100208f(str, "reportNameUid");
        C29964oa c29964oa = this.f49445M0;
        if (c29964oa == null) {
            AbstractC19074t.m100223u("binding");
            c29964oa = null;
        }
        c29964oa.f138891w.setText(str);
    }

    /* renamed from: wM */
    public final void m50245wM(int i11, String str, AnimationTarget animationTarget) {
        AbstractC19074t.m100208f(str, "localPathImage");
        AbstractC19074t.m100208f(animationTarget, "animationTarget");
        InterfaceC25567a interfaceC25567a = this.f49446N0;
        InterfaceC25567a interfaceC25567a2 = interfaceC25567a;
        if (interfaceC25567a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC25567a2 = null;
        }
        ArrayList mo132107Cm = interfaceC25567a2.mo132107Cm();
        if (mo132107Cm.isEmpty()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("medialist", mo132107Cm);
        bundle.putInt("currentIndex", i11);
        bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 11);
        m50222tM().m105865K(i11);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35551H2(animationTarget, str, bundle, m50222tM(), 0);
        }
    }
}
