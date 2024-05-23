package com.zing.zalo.p077ui.zviews;

import am.AbstractC0924m0;
import android.R;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.core.text.AbstractC1463b;
import b40.C2526d;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p542ub.InterfaceC27218a;
import p649xl.C29959o5;
import p716zh.C31944h6;
import ui0.C27280g;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes6.dex */
public final class JumpLinkSettingBottomView extends BottomPickerView {
    public static final C14501a Companion = new C14501a(null);

    /* renamed from: U0 */
    private String f74551U0 = "";

    /* renamed from: V0 */
    private String f74552V0 = "0";

    /* renamed from: W0 */
    private String f74553W0 = "";

    /* renamed from: X0 */
    private EnumC14502b f74554X0 = EnumC14502b.f74556q;

    /* renamed from: Y0 */
    private C29959o5 f74555Y0;

    /* renamed from: com.zing.zalo.ui.zviews.JumpLinkSettingBottomView$a */
    /* loaded from: classes6.dex */
    public static final class C14501a {
        private C14501a() {
        }

        public /* synthetic */ C14501a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final JumpLinkSettingBottomView m81043a(String str, String str2, String str3) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "logChatType");
            AbstractC19074t.m100208f(str3, "entryPoint");
            JumpLinkSettingBottomView jumpLinkSettingBottomView = new JumpLinkSettingBottomView();
            Bundle m78535kL = BottomPickerView.m78535kL();
            m78535kL.putString("WEB_URL", str);
            m78535kL.putString("LOG_CHAT_TYPE", str2);
            m78535kL.putString("ENTRY_POINT", str3);
            jumpLinkSettingBottomView.mo60305zK(m78535kL);
            return jumpLinkSettingBottomView;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.zviews.JumpLinkSettingBottomView$b */
    /* loaded from: classes6.dex */
    public static final class EnumC14502b {

        /* renamed from: q */
        public static final EnumC14502b f74556q = new EnumC14502b("OPEN_WITH_ZALO", 0, 1);

        /* renamed from: r */
        public static final EnumC14502b f74557r = new EnumC14502b("OPEN_WITH_WEB_BROWSER", 1, 0);

        /* renamed from: s */
        private static final /* synthetic */ EnumC14502b[] f74558s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f74559t;

        /* renamed from: p */
        private final int f74560p;

        static {
            EnumC14502b[] m81044b = m81044b();
            f74558s = m81044b;
            f74559t = AbstractC30166b.m148796a(m81044b);
        }

        private EnumC14502b(String str, int i11, int i12) {
            this.f74560p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC14502b[] m81044b() {
            return new EnumC14502b[]{f74556q, f74557r};
        }

        public static EnumC14502b valueOf(String str) {
            return (EnumC14502b) Enum.valueOf(EnumC14502b.class, str);
        }

        public static EnumC14502b[] values() {
            return (EnumC14502b[]) f74558s.clone();
        }

        /* renamed from: c */
        public final int m81045c() {
            return this.f74560p;
        }
    }

    /* renamed from: rL */
    private final Bundle m81036rL() {
        int m40666e = TrackingSource.m40666e();
        String m40669h = TrackingSource.m40669h(m40666e);
        AbstractC19074t.m100207e(m40669h, "genSourceParamChat(...)");
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_WEB_URL", this.f74551U0);
        bundle.putInt("EXTRA_SOURCE_LINK", m40666e);
        if (!TextUtils.isEmpty(m40669h)) {
            bundle.putString("EXTRA_SOURCE_PARAM", m40669h);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sL */
    public static final void m81037sL(JumpLinkSettingBottomView jumpLinkSettingBottomView, View view) {
        AbstractC19074t.m100208f(jumpLinkSettingBottomView, "this$0");
        jumpLinkSettingBottomView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tL */
    public static final void m81038tL(JumpLinkSettingBottomView jumpLinkSettingBottomView, View view) {
        AbstractC19074t.m100208f(jumpLinkSettingBottomView, "this$0");
        jumpLinkSettingBottomView.m81042xL(EnumC14502b.f74557r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uL */
    public static final void m81039uL(JumpLinkSettingBottomView jumpLinkSettingBottomView, View view) {
        AbstractC19074t.m100208f(jumpLinkSettingBottomView, "this$0");
        jumpLinkSettingBottomView.m81041wL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vL */
    public static final void m81040vL(JumpLinkSettingBottomView jumpLinkSettingBottomView, View view) {
        AbstractC19074t.m100208f(jumpLinkSettingBottomView, "this$0");
        jumpLinkSettingBottomView.m81042xL(EnumC14502b.f74556q);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("WEB_URL");
            String str = "";
            if (string == null) {
                string = "";
            } else {
                AbstractC19074t.m100205c(string);
            }
            this.f74551U0 = string;
            String string2 = m92642L3.getString("LOG_CHAT_TYPE");
            if (string2 == null) {
                string2 = "0";
            } else {
                AbstractC19074t.m100205c(string2);
            }
            this.f74552V0 = string2;
            String string3 = m92642L3.getString("ENTRY_POINT");
            if (string3 != null) {
                AbstractC19074t.m100205c(string3);
                str = string3;
            }
            this.f74553W0 = str;
        }
        int m2893A1 = AbstractC0924m0.m2893A1();
        EnumC14502b enumC14502b = EnumC14502b.f74556q;
        if (m2893A1 != enumC14502b.m81045c()) {
            enumC14502b = EnumC14502b.f74557r;
        }
        this.f74554X0 = enumC14502b;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        int i11;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C29959o5 c29959o5 = this.f74555Y0;
        C29959o5 c29959o52 = null;
        if (c29959o5 == null) {
            AbstractC19074t.m100223u("binding");
            c29959o5 = null;
        }
        ListItem listItem = c29959o5.f138863t;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_jump_link_open_with_zalo);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        listItem.setTitle(m118743r0);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_jump_link_open_with_zalo_des);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        listItem.setSubtitle(m118743r02);
        listItem.setSubtitleMaxLine(2);
        listItem.setIdTracking("bottom_sheet_open_link_with_zalo");
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(listItem.getContext());
        Context context = zAppCompatImageView.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139658a(context, AbstractC16803z.ic_logo_zalo));
        ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(listItem.getContext());
        Context context2 = zAppCompatImageView2.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        zAppCompatImageView2.setImageDrawable(C27280g.m139659b(context2, AbstractC16803z.ic_check_line_24, AbstractC2808b.f150821b60));
        listItem.m90587c(zAppCompatImageView);
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        listItem.setLeadingGravity(enumC16952b0);
        listItem.m90589e(zAppCompatImageView2);
        listItem.setTrailingGravity(enumC16952b0);
        int i12 = 4;
        if (this.f74554X0 == EnumC14502b.f74556q) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        listItem.setTrailingItemVisibility(i11);
        listItem.m90591l(AbstractC23136l9.m118742r(64.0f), 0, 0, 0);
        listItem.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.qs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                JumpLinkSettingBottomView.m81040vL(JumpLinkSettingBottomView.this, view2);
            }
        });
        C29959o5 c29959o53 = this.f74555Y0;
        if (c29959o53 == null) {
            AbstractC19074t.m100223u("binding");
            c29959o53 = null;
        }
        c29959o53.f138860q.setText(AbstractC1463b.m7440a(AbstractC23136l9.m118743r0(AbstractC8020f0.str_jump_link_foot_note), 0));
        C29959o5 c29959o54 = this.f74555Y0;
        if (c29959o54 == null) {
            AbstractC19074t.m100223u("binding");
            c29959o54 = null;
        }
        ListItem listItem2 = c29959o54.f138862s;
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_jump_link_open_with_web);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        listItem2.setTitle(m118743r03);
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_jump_link_open_with_web_des);
        AbstractC19074t.m100207e(m118743r04, "getString(...)");
        listItem2.setSubtitle(m118743r04);
        listItem2.setSubtitleMaxLine(2);
        listItem2.setIdTracking("bottom_sheet_open_link_with_web");
        ZAppCompatImageView zAppCompatImageView3 = new ZAppCompatImageView(listItem2.getContext());
        Context context3 = zAppCompatImageView3.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        zAppCompatImageView3.setImageDrawable(C27280g.m139658a(context3, AbstractC16803z.ic_global));
        ZAppCompatImageView zAppCompatImageView4 = new ZAppCompatImageView(listItem2.getContext());
        Context context4 = zAppCompatImageView4.getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        zAppCompatImageView4.setImageDrawable(C27280g.m139659b(context4, AbstractC16803z.ic_check_line_24, AbstractC2808b.f150821b60));
        listItem2.m90587c(zAppCompatImageView3);
        listItem2.setLeadingGravity(enumC16952b0);
        listItem2.m90592m(false);
        listItem2.m90589e(zAppCompatImageView4);
        listItem2.setTrailingGravity(enumC16952b0);
        if (this.f74554X0 == EnumC14502b.f74557r) {
            i12 = 0;
        }
        listItem2.setTrailingItemVisibility(i12);
        listItem2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.rs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                JumpLinkSettingBottomView.m81038tL(JumpLinkSettingBottomView.this, view2);
            }
        });
        C29959o5 c29959o55 = this.f74555Y0;
        if (c29959o55 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29959o52 = c29959o55;
        }
        Button button = c29959o52.f138864u;
        button.setIdTracking("bottom_sheet_open_link_button");
        button.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                JumpLinkSettingBottomView.m81039uL(JumpLinkSettingBottomView.this, view2);
            }
        });
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: aL */
    protected int mo78533aL() {
        return R.style.Theme.Material.Light.Dialog.Alert;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: eL */
    public View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29959o5 m148314c = C29959o5.m148314c(layoutInflater);
        AbstractC19074t.m100205c(m148314c);
        this.f74555Y0 = m148314c;
        m148314c.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ts
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JumpLinkSettingBottomView.m81037sL(JumpLinkSettingBottomView.this, view);
            }
        });
        FrameLayout root = m148314c.getRoot();
        AbstractC19074t.m100207e(root, "run(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: jL */
    public void mo62729jL(WindowManager.LayoutParams layoutParams) {
        super.mo62729jL(layoutParams);
        if (layoutParams != null) {
            layoutParams.height = -1;
            layoutParams.width = -1;
            layoutParams.dimAmount = 0.75f;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.layout_jump_link_setting_bottom_view;
    }

    /* renamed from: wL */
    public final void m81041wL() {
        EnumC14502b enumC14502b = this.f74554X0;
        if (enumC14502b == EnumC14502b.f74556q) {
            ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
            InterfaceC27218a m92692wK = m92692wK();
            AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
            c15403a.m87171F(m92692wK, this.f74551U0, m81036rL());
        } else if (enumC14502b == EnumC14502b.f74557r) {
            InterfaceC27218a m92692wK2 = m92692wK();
            AbstractC19074t.m100207e(m92692wK2, "requireZaloActivity(...)");
            C31944h6.m153534S(m92692wK2, this.f74551U0, m81036rL());
        }
        AbstractC0924m0.m4292vi(this.f74554X0.m81045c());
        AbstractC0924m0.m3760do(true);
        finish();
    }

    /* renamed from: xL */
    public final void m81042xL(EnumC14502b enumC14502b) {
        int i11;
        AbstractC19074t.m100208f(enumC14502b, "mode");
        if (enumC14502b != this.f74554X0) {
            this.f74554X0 = enumC14502b;
            C29959o5 c29959o5 = this.f74555Y0;
            C29959o5 c29959o52 = null;
            if (c29959o5 == null) {
                AbstractC19074t.m100223u("binding");
                c29959o5 = null;
            }
            ListItem listItem = c29959o5.f138863t;
            int i12 = 4;
            if (this.f74554X0 == EnumC14502b.f74556q) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            listItem.setTrailingItemVisibility(i11);
            C29959o5 c29959o53 = this.f74555Y0;
            if (c29959o53 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29959o52 = c29959o53;
            }
            ListItem listItem2 = c29959o52.f138862s;
            if (this.f74554X0 == EnumC14502b.f74557r) {
                i12 = 0;
            }
            listItem2.setTrailingItemVisibility(i12);
            C2526d.f10270a.m12731w0(this.f74552V0, this.f74553W0, this.f74554X0.m81045c());
        }
    }
}
