package com.zing.zalo.feed.mvp.bottomsheetmenu.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import fn0.AbstractC19074t;
import io.C20639c;
import on0.AbstractC24341v;

/* loaded from: classes4.dex */
public final class BottomSheetMenuContentView extends TrackingRelativeLayout {

    /* renamed from: q */
    private int f46157q;

    /* renamed from: r */
    private ViewGroup f46158r;

    /* renamed from: s */
    private RecyclingImageView f46159s;

    /* renamed from: t */
    private RobotoTextView f46160t;

    /* renamed from: u */
    private RobotoTextView f46161u;

    /* renamed from: v */
    private RecyclingImageView f46162v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetMenuContentView(Context context, int i11) {
        super(context, null);
        AbstractC19074t.m100208f(context, "context");
        this.f46157q = i11;
        LayoutInflater from = LayoutInflater.from(context);
        int i12 = this.f46157q;
        if (i12 != 5) {
            if (i12 != 6) {
                if (i12 != 7) {
                    View inflate = from.inflate(AbstractC7409c0.bottom_sheet_menu_content_view, this);
                    AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                    this.f46158r = (ViewGroup) inflate;
                } else {
                    View inflate2 = from.inflate(AbstractC7409c0.bottom_sheet_menu_content_small_view, this);
                    AbstractC19074t.m100206d(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
                    this.f46158r = (ViewGroup) inflate2;
                }
            } else {
                View inflate3 = from.inflate(AbstractC7409c0.bottom_sheet_menu_content_large_view, this);
                AbstractC19074t.m100206d(inflate3, "null cannot be cast to non-null type android.view.ViewGroup");
                this.f46158r = (ViewGroup) inflate3;
            }
        } else {
            View inflate4 = from.inflate(AbstractC7409c0.bottom_sheet_menu_content_view, this);
            AbstractC19074t.m100206d(inflate4, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f46158r = (ViewGroup) inflate4;
        }
        View findViewById = this.f46158r.findViewById(AbstractC6918a0.img_icon);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f46159s = (RecyclingImageView) findViewById;
        View findViewById2 = this.f46158r.findViewById(AbstractC6918a0.txt_title);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f46160t = (RobotoTextView) findViewById2;
        View findViewById3 = this.f46158r.findViewById(AbstractC6918a0.txt_des);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        this.f46161u = (RobotoTextView) findViewById3;
        View findViewById4 = this.f46158r.findViewById(AbstractC6918a0.img_red_dot);
        AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
        this.f46162v = (RecyclingImageView) findViewById4;
    }

    /* renamed from: c */
    public final void m45476c(C20639c c20639c) {
        boolean m127128x;
        AbstractC19074t.m100208f(c20639c, "data");
        if (c20639c.m107565j() != null) {
            this.f46159s.setImageDrawable(c20639c.m107565j());
        } else {
            this.f46159s.setImageResource(c20639c.m107564i());
        }
        int i11 = 8;
        if (!TextUtils.isEmpty(c20639c.m107567l())) {
            this.f46160t.setText(c20639c.m107567l());
            this.f46160t.setVisibility(0);
        } else {
            this.f46160t.setVisibility(8);
        }
        if (!TextUtils.isEmpty(c20639c.m107561f())) {
            this.f46161u.setText(c20639c.m107561f());
            this.f46161u.setVisibility(0);
        } else {
            this.f46161u.setVisibility(8);
        }
        RecyclingImageView recyclingImageView = this.f46162v;
        if (c20639c.m107562g()) {
            i11 = 0;
        }
        recyclingImageView.setVisibility(i11);
        m127128x = AbstractC24341v.m127128x(c20639c.m107566k());
        if (!m127128x) {
            setIdTracking(c20639c.m107566k());
            setTrackingExtraData(c20639c.m107563h());
        }
    }

    public final RecyclingImageView getImgIcon() {
        return this.f46159s;
    }

    public final RecyclingImageView getImgRedDot() {
        return this.f46162v;
    }

    @Override // android.view.View
    public final ViewGroup getRootView() {
        return this.f46158r;
    }

    public final RobotoTextView getTxtDes() {
        return this.f46161u;
    }

    public final RobotoTextView getTxtTitle() {
        return this.f46160t;
    }

    public final int getTypeView() {
        return this.f46157q;
    }

    public final void setImgIcon(RecyclingImageView recyclingImageView) {
        AbstractC19074t.m100208f(recyclingImageView, "<set-?>");
        this.f46159s = recyclingImageView;
    }

    public final void setImgRedDot(RecyclingImageView recyclingImageView) {
        AbstractC19074t.m100208f(recyclingImageView, "<set-?>");
        this.f46162v = recyclingImageView;
    }

    public final void setRootView(ViewGroup viewGroup) {
        AbstractC19074t.m100208f(viewGroup, "<set-?>");
        this.f46158r = viewGroup;
    }

    public final void setTxtDes(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f46161u = robotoTextView;
    }

    public final void setTxtTitle(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f46160t = robotoTextView;
    }

    public final void setTypeView(int i11) {
        this.f46157q = i11;
    }
}
