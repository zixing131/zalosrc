package com.zing.zalo.feed.mvp.bottomsheetmenu.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.BottomSheetMenuContentQuickSettingView;
import com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.C8540a;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import fn0.AbstractC19074t;
import io.C20640d;

/* loaded from: classes4.dex */
public final class BottomSheetMenuContentQuickSettingView extends RelativeLayout {

    /* renamed from: p */
    private int f46151p;

    /* renamed from: q */
    private ViewGroup f46152q;

    /* renamed from: r */
    private RecyclingImageView f46153r;

    /* renamed from: s */
    private RobotoTextView f46154s;

    /* renamed from: t */
    private RobotoTextView f46155t;

    /* renamed from: u */
    private StencilSwitch f46156u;

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.BottomSheetMenuContentQuickSettingView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8539a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetMenuContentQuickSettingView(Context context, int i11) {
        super(context, null);
        AbstractC19074t.m100208f(context, "context");
        this.f46151p = i11;
        LayoutInflater from = LayoutInflater.from(context);
        int i12 = this.f46151p;
        if (i12 != 8) {
            if (i12 != 9) {
                View inflate = from.inflate(AbstractC7409c0.bottom_sheet_menu_content_quick_setting_view, this);
                AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                this.f46152q = (ViewGroup) inflate;
            } else {
                View inflate2 = from.inflate(AbstractC7409c0.bottom_sheet_menu_content_quick_setting_large_view, this);
                AbstractC19074t.m100206d(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
                this.f46152q = (ViewGroup) inflate2;
            }
        } else {
            View inflate3 = from.inflate(AbstractC7409c0.bottom_sheet_menu_content_quick_setting_view, this);
            AbstractC19074t.m100206d(inflate3, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f46152q = (ViewGroup) inflate3;
        }
        View findViewById = this.f46152q.findViewById(AbstractC6918a0.img_icon);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f46153r = (RecyclingImageView) findViewById;
        View findViewById2 = this.f46152q.findViewById(AbstractC6918a0.txt_title);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f46154s = (RobotoTextView) findViewById2;
        View findViewById3 = this.f46152q.findViewById(AbstractC6918a0.txt_des);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        this.f46155t = (RobotoTextView) findViewById3;
        View findViewById4 = this.f46152q.findViewById(AbstractC6918a0.setting_switch);
        AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
        this.f46156u = (StencilSwitch) findViewById4;
    }

    /* renamed from: c */
    public static final void m45474c(C8540a.a aVar, C20640d c20640d, View view) {
        AbstractC19074t.m100208f(c20640d, "$data");
        if (aVar != null) {
            aVar.mo45466xc(c20640d);
        }
    }

    /* renamed from: b */
    public final void m45475b(C20640d c20640d, C8540a.a aVar) {
        AbstractC19074t.m100208f(c20640d, "data");
        if (c20640d.m107574h() != null) {
            this.f46153r.setImageDrawable(c20640d.m107574h());
        } else {
            this.f46153r.setImageResource(c20640d.m107573g());
        }
        if (!TextUtils.isEmpty(c20640d.m107575i())) {
            this.f46154s.setText(c20640d.m107575i());
            this.f46154s.setVisibility(0);
        } else {
            this.f46154s.setVisibility(8);
        }
        if (!TextUtils.isEmpty(c20640d.m107572f())) {
            this.f46155t.setText(c20640d.m107572f());
            this.f46155t.setVisibility(0);
        } else {
            this.f46155t.setVisibility(8);
        }
        this.f46156u.setChecked(c20640d.m107576j());
        this.f46156u.setOnClickListener(new View.OnClickListener() { // from class: ho.e

            /* renamed from: q */
            public final /* synthetic */ C20640d f98888q;

            public /* synthetic */ ViewOnClickListenerC20109e(C20640d c20640d2) {
                r2 = c20640d2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetMenuContentQuickSettingView.m45474c(C8540a.a.this, r2, view);
            }
        });
    }

    public final StencilSwitch getBtnSwitch() {
        return this.f46156u;
    }

    public final InterfaceC8539a getClickListener() {
        return null;
    }

    public final RecyclingImageView getImgIcon() {
        return this.f46153r;
    }

    public final RobotoTextView getTxtDes() {
        return this.f46155t;
    }

    public final RobotoTextView getTxtTitle() {
        return this.f46154s;
    }

    public final int getViewType() {
        return this.f46151p;
    }

    public final void setBtnSwitch(StencilSwitch stencilSwitch) {
        AbstractC19074t.m100208f(stencilSwitch, "<set-?>");
        this.f46156u = stencilSwitch;
    }

    public final void setClickListener(InterfaceC8539a interfaceC8539a) {
    }

    public final void setImgIcon(RecyclingImageView recyclingImageView) {
        AbstractC19074t.m100208f(recyclingImageView, "<set-?>");
        this.f46153r = recyclingImageView;
    }

    public final void setTxtDes(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f46155t = robotoTextView;
    }

    public final void setTxtTitle(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f46154s = robotoTextView;
    }

    public final void setViewType(int i11) {
        this.f46151p = i11;
    }
}
