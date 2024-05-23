package com.zing.zalo.p077ui.zalocloud.home;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.core.graphics.drawable.AbstractC1414a;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zalocloud.home.ZcloudManagementMultiSelectBottomView;
import com.zing.zalo.uicontrol.MultiSelectMenuBottomView;
import com.zing.zalo.zdesign.component.TrackingTextView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class ZcloudManagementMultiSelectBottomView extends MultiSelectMenuBottomView {
    public static final C13916a Companion = new C13916a(null);

    /* renamed from: s */
    private InterfaceC13917b f71689s;

    /* renamed from: t */
    private TextView f71690t;

    /* renamed from: u */
    private TextView f71691u;

    /* renamed from: v */
    private TextView f71692v;

    /* renamed from: w */
    private TextView f71693w;

    /* renamed from: x */
    private TextView f71694x;

    /* renamed from: y */
    private TrackingTextView f71695y;

    /* renamed from: z */
    private boolean f71696z;

    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZcloudManagementMultiSelectBottomView$a */
    /* loaded from: classes6.dex */
    public static final class C13916a {
        private C13916a() {
        }

        public /* synthetic */ C13916a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZcloudManagementMultiSelectBottomView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13917b {
        /* renamed from: a */
        void mo75012a();

        /* renamed from: b */
        void mo75013b();

        /* renamed from: c */
        void mo75014c();

        /* renamed from: d */
        void mo75015d();

        /* renamed from: e */
        void mo75016e();

        /* renamed from: f */
        void mo75017f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZcloudManagementMultiSelectBottomView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: l */
    private final void m77415l() {
        int i11 = AbstractC6918a0.zcloud_select_all;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_select_all);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        TextView m87773a = m87773a(i11, m118743r0, C27280g.m139660c(context, AbstractC2810d.zds_ic_check_circle_line_24, AbstractC2807a.accent_blue_icon));
        m87773a.setOnClickListener(new View.OnClickListener() { // from class: bc0.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZcloudManagementMultiSelectBottomView.m77416m(ZcloudManagementMultiSelectBottomView.this, view);
            }
        });
        int i12 = 8;
        m87773a.setVisibility(8);
        this.f71693w = m87773a;
        int i13 = AbstractC6918a0.zcloud_deselect_all;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_deselect_all);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        TextView m87773a2 = m87773a(i13, m118743r02, C27280g.m139660c(context2, AbstractC2810d.zds_ic_minus_circle_line_24, AbstractC2807a.accent_blue_icon));
        m87773a2.setOnClickListener(new View.OnClickListener() { // from class: bc0.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZcloudManagementMultiSelectBottomView.m77418p(ZcloudManagementMultiSelectBottomView.this, view);
            }
        });
        m87773a2.setVisibility(8);
        this.f71694x = m87773a2;
        int i14 = AbstractC6918a0.zcloud_open;
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_open);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        TextView m87773a3 = m87773a(i14, m118743r03, C27280g.m139660c(context3, AbstractC2810d.zds_ic_unhide_line_24, AbstractC2807a.icon_disabled));
        mo77422c(false, m87773a3);
        m87773a3.setOnClickListener(new View.OnClickListener() { // from class: bc0.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZcloudManagementMultiSelectBottomView.m77419q(ZcloudManagementMultiSelectBottomView.this, view);
            }
        });
        this.f71690t = m87773a3;
        int i15 = AbstractC6918a0.zcloud_jump_message;
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_jum_to_original_message);
        AbstractC19074t.m100207e(m118743r04, "getString(...)");
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        TextView m87773a4 = m87773a(i15, m118743r04, C27280g.m139660c(context4, AbstractC2810d.zds_ic_jump_to_original_line_24, AbstractC2807a.icon_disabled));
        mo77422c(false, m87773a4);
        m87773a4.setOnClickListener(new View.OnClickListener() { // from class: bc0.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZcloudManagementMultiSelectBottomView.m77420r(ZcloudManagementMultiSelectBottomView.this, view);
            }
        });
        this.f71691u = m87773a4;
        int i16 = AbstractC6918a0.zcloud_save;
        String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.option_save);
        AbstractC19074t.m100207e(m118743r05, "getString(...)");
        Context context5 = getContext();
        AbstractC19074t.m100207e(context5, "getContext(...)");
        TextView m87773a5 = m87773a(i16, m118743r05, C27280g.m139660c(context5, AbstractC2810d.zds_ic_download_line_24, AbstractC2807a.icon_disabled));
        mo77422c(false, m87773a5);
        m87773a5.setOnClickListener(new View.OnClickListener() { // from class: bc0.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZcloudManagementMultiSelectBottomView.m77421s(ZcloudManagementMultiSelectBottomView.this, view);
            }
        });
        if (this.f71696z) {
            i12 = 0;
        }
        m87773a5.setVisibility(i12);
        AbstractC19074t.m100206d(m87773a5, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.TrackingTextView");
        TrackingTextView trackingTextView = (TrackingTextView) m87773a5;
        this.f71695y = trackingTextView;
        trackingTextView.setIdTracking("download_file_button");
        int i17 = AbstractC6918a0.zcloud_delete;
        String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete);
        AbstractC19074t.m100207e(m118743r06, "getString(...)");
        Context context6 = getContext();
        AbstractC19074t.m100207e(context6, "getContext(...)");
        TextView m87773a6 = m87773a(i17, m118743r06, C27280g.m139660c(context6, AbstractC2810d.zds_ic_delete_line_24, AbstractC2807a.icon_disabled));
        mo77422c(false, m87773a6);
        m87773a6.setOnClickListener(new View.OnClickListener() { // from class: bc0.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZcloudManagementMultiSelectBottomView.m77417n(ZcloudManagementMultiSelectBottomView.this, view);
            }
        });
        this.f71692v = m87773a6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m77416m(ZcloudManagementMultiSelectBottomView zcloudManagementMultiSelectBottomView, View view) {
        AbstractC19074t.m100208f(zcloudManagementMultiSelectBottomView, "this$0");
        InterfaceC13917b interfaceC13917b = zcloudManagementMultiSelectBottomView.f71689s;
        if (interfaceC13917b == null) {
            AbstractC19074t.m100223u("listener");
            interfaceC13917b = null;
        }
        interfaceC13917b.mo75017f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m77417n(ZcloudManagementMultiSelectBottomView zcloudManagementMultiSelectBottomView, View view) {
        AbstractC19074t.m100208f(zcloudManagementMultiSelectBottomView, "this$0");
        InterfaceC13917b interfaceC13917b = zcloudManagementMultiSelectBottomView.f71689s;
        if (interfaceC13917b == null) {
            AbstractC19074t.m100223u("listener");
            interfaceC13917b = null;
        }
        interfaceC13917b.mo75012a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m77418p(ZcloudManagementMultiSelectBottomView zcloudManagementMultiSelectBottomView, View view) {
        AbstractC19074t.m100208f(zcloudManagementMultiSelectBottomView, "this$0");
        InterfaceC13917b interfaceC13917b = zcloudManagementMultiSelectBottomView.f71689s;
        if (interfaceC13917b == null) {
            AbstractC19074t.m100223u("listener");
            interfaceC13917b = null;
        }
        interfaceC13917b.mo75015d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m77419q(ZcloudManagementMultiSelectBottomView zcloudManagementMultiSelectBottomView, View view) {
        AbstractC19074t.m100208f(zcloudManagementMultiSelectBottomView, "this$0");
        InterfaceC13917b interfaceC13917b = zcloudManagementMultiSelectBottomView.f71689s;
        if (interfaceC13917b == null) {
            AbstractC19074t.m100223u("listener");
            interfaceC13917b = null;
        }
        interfaceC13917b.mo75014c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m77420r(ZcloudManagementMultiSelectBottomView zcloudManagementMultiSelectBottomView, View view) {
        AbstractC19074t.m100208f(zcloudManagementMultiSelectBottomView, "this$0");
        InterfaceC13917b interfaceC13917b = zcloudManagementMultiSelectBottomView.f71689s;
        if (interfaceC13917b == null) {
            AbstractC19074t.m100223u("listener");
            interfaceC13917b = null;
        }
        interfaceC13917b.mo75016e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m77421s(ZcloudManagementMultiSelectBottomView zcloudManagementMultiSelectBottomView, View view) {
        AbstractC19074t.m100208f(zcloudManagementMultiSelectBottomView, "this$0");
        InterfaceC13917b interfaceC13917b = zcloudManagementMultiSelectBottomView.f71689s;
        if (interfaceC13917b == null) {
            AbstractC19074t.m100223u("listener");
            interfaceC13917b = null;
        }
        interfaceC13917b.mo75013b();
    }

    @Override // com.zing.zalo.uicontrol.MultiSelectMenuBottomView
    /* renamed from: c */
    public void mo77422c(boolean z11, TextView textView) {
        Drawable[] compoundDrawables;
        Drawable drawable;
        int i11;
        int i12;
        int i13;
        int i14;
        super.mo77422c(z11, textView);
        if (textView != null) {
            textView.setEnabled(z11);
        }
        if (textView != null && (compoundDrawables = textView.getCompoundDrawables()) != null && (drawable = compoundDrawables[1]) != null) {
            int id2 = textView.getId();
            if (id2 == AbstractC6918a0.zcloud_open) {
                Context context = getContext();
                if (z11) {
                    i14 = AbstractC2807a.accent_teal_icon;
                } else {
                    i14 = AbstractC2807a.icon_disabled;
                }
                AbstractC1414a.m7196n(drawable, C23212s8.m119607o(context, i14));
                return;
            }
            if (id2 == AbstractC6918a0.zcloud_jump_message) {
                Context context2 = getContext();
                if (z11) {
                    i13 = AbstractC2807a.accent_sky_blue_icon;
                } else {
                    i13 = AbstractC2807a.icon_disabled;
                }
                AbstractC1414a.m7196n(drawable, C23212s8.m119607o(context2, i13));
                return;
            }
            if (id2 == AbstractC6918a0.zcloud_delete) {
                Context context3 = getContext();
                if (z11) {
                    i12 = AbstractC2807a.accent_red_icon;
                } else {
                    i12 = AbstractC2807a.icon_disabled;
                }
                AbstractC1414a.m7196n(drawable, C23212s8.m119607o(context3, i12));
                return;
            }
            Context context4 = getContext();
            if (z11) {
                i11 = AbstractC2807a.icon_01;
            } else {
                i11 = AbstractC2807a.icon_disabled;
            }
            AbstractC1414a.m7196n(drawable, C23212s8.m119607o(context4, i11));
        }
    }

    public final void setEnableAllBtn(boolean z11) {
        TextView textView = this.f71690t;
        TrackingTextView trackingTextView = null;
        if (textView == null) {
            AbstractC19074t.m100223u("openBtn");
            textView = null;
        }
        mo77422c(z11, textView);
        TextView textView2 = this.f71691u;
        if (textView2 == null) {
            AbstractC19074t.m100223u("jumpMsgBtn");
            textView2 = null;
        }
        mo77422c(z11, textView2);
        TextView textView3 = this.f71692v;
        if (textView3 == null) {
            AbstractC19074t.m100223u("deleteBtn");
            textView3 = null;
        }
        mo77422c(z11, textView3);
        if (this.f71696z) {
            TrackingTextView trackingTextView2 = this.f71695y;
            if (trackingTextView2 == null) {
                AbstractC19074t.m100223u("saveBtn");
            } else {
                trackingTextView = trackingTextView2;
            }
            mo77422c(z11, trackingTextView);
        }
    }

    /* renamed from: u */
    public final void m77423u() {
        TextView textView = this.f71690t;
        TextView textView2 = null;
        if (textView == null) {
            AbstractC19074t.m100223u("openBtn");
            textView = null;
        }
        textView.setVisibility(0);
        TextView textView3 = this.f71691u;
        if (textView3 == null) {
            AbstractC19074t.m100223u("jumpMsgBtn");
            textView3 = null;
        }
        textView3.setVisibility(0);
        if (this.f71696z) {
            TrackingTextView trackingTextView = this.f71695y;
            if (trackingTextView == null) {
                AbstractC19074t.m100223u("saveBtn");
                trackingTextView = null;
            }
            trackingTextView.setVisibility(0);
        }
        TextView textView4 = this.f71693w;
        if (textView4 == null) {
            AbstractC19074t.m100223u("selectAllBtn");
            textView4 = null;
        }
        textView4.setVisibility(8);
        TextView textView5 = this.f71694x;
        if (textView5 == null) {
            AbstractC19074t.m100223u("deselectAllBtn");
        } else {
            textView2 = textView5;
        }
        textView2.setVisibility(8);
    }

    /* renamed from: v */
    public final void m77424v() {
        TextView textView = this.f71694x;
        TextView textView2 = null;
        if (textView == null) {
            AbstractC19074t.m100223u("deselectAllBtn");
            textView = null;
        }
        textView.setVisibility(0);
        TextView textView3 = this.f71693w;
        if (textView3 == null) {
            AbstractC19074t.m100223u("selectAllBtn");
            textView3 = null;
        }
        textView3.setVisibility(8);
        TextView textView4 = this.f71690t;
        if (textView4 == null) {
            AbstractC19074t.m100223u("openBtn");
            textView4 = null;
        }
        textView4.setVisibility(8);
        TextView textView5 = this.f71690t;
        if (textView5 == null) {
            AbstractC19074t.m100223u("openBtn");
            textView5 = null;
        }
        mo77422c(false, textView5);
        TrackingTextView trackingTextView = this.f71695y;
        if (trackingTextView == null) {
            AbstractC19074t.m100223u("saveBtn");
            trackingTextView = null;
        }
        trackingTextView.setVisibility(8);
        TrackingTextView trackingTextView2 = this.f71695y;
        if (trackingTextView2 == null) {
            AbstractC19074t.m100223u("saveBtn");
            trackingTextView2 = null;
        }
        mo77422c(false, trackingTextView2);
        TextView textView6 = this.f71691u;
        if (textView6 == null) {
            AbstractC19074t.m100223u("jumpMsgBtn");
            textView6 = null;
        }
        textView6.setVisibility(4);
        TextView textView7 = this.f71691u;
        if (textView7 == null) {
            AbstractC19074t.m100223u("jumpMsgBtn");
        } else {
            textView2 = textView7;
        }
        mo77422c(false, textView2);
    }

    /* renamed from: w */
    public final void m77425w() {
        TextView textView = this.f71693w;
        TextView textView2 = null;
        if (textView == null) {
            AbstractC19074t.m100223u("selectAllBtn");
            textView = null;
        }
        textView.setVisibility(0);
        TextView textView3 = this.f71694x;
        if (textView3 == null) {
            AbstractC19074t.m100223u("deselectAllBtn");
            textView3 = null;
        }
        textView3.setVisibility(8);
        TextView textView4 = this.f71690t;
        if (textView4 == null) {
            AbstractC19074t.m100223u("openBtn");
            textView4 = null;
        }
        textView4.setVisibility(8);
        TextView textView5 = this.f71690t;
        if (textView5 == null) {
            AbstractC19074t.m100223u("openBtn");
            textView5 = null;
        }
        mo77422c(false, textView5);
        TrackingTextView trackingTextView = this.f71695y;
        if (trackingTextView == null) {
            AbstractC19074t.m100223u("saveBtn");
            trackingTextView = null;
        }
        trackingTextView.setVisibility(8);
        TrackingTextView trackingTextView2 = this.f71695y;
        if (trackingTextView2 == null) {
            AbstractC19074t.m100223u("saveBtn");
            trackingTextView2 = null;
        }
        mo77422c(false, trackingTextView2);
        TextView textView6 = this.f71691u;
        if (textView6 == null) {
            AbstractC19074t.m100223u("jumpMsgBtn");
            textView6 = null;
        }
        textView6.setVisibility(4);
        TextView textView7 = this.f71691u;
        if (textView7 == null) {
            AbstractC19074t.m100223u("jumpMsgBtn");
        } else {
            textView2 = textView7;
        }
        mo77422c(false, textView2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZcloudManagementMultiSelectBottomView(Context context, boolean z11, InterfaceC13917b interfaceC13917b) {
        this(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC13917b, "listener");
        this.f71689s = interfaceC13917b;
        this.f71696z = z11;
        m77415l();
        int i11 = AbstractC23222t7.f112566j;
        setPadding(i11, 0, i11, 0);
    }
}
