package com.zing.zalo.p077ui.maintab.me;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.p077ui.maintab.me.SettingItemNewView;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.EnumC16980h;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.TrackingImageView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import r70.C25673e;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class SettingItemNewView extends ListItem {

    /* renamed from: G */
    private InterfaceC12137a f63381G;

    /* renamed from: H */
    private ImageView f63382H;

    /* renamed from: I */
    private TrackingImageView f63383I;

    /* renamed from: J */
    private Badge f63384J;

    /* renamed from: K */
    private Badge f63385K;

    /* renamed from: com.zing.zalo.ui.maintab.me.SettingItemNewView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC12137a {
        /* renamed from: a */
        void mo67853a(C25673e c25673e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingItemNewView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        TrackingImageView trackingImageView = new TrackingImageView(context);
        trackingImageView.setLayoutParams(new LinearLayout.LayoutParams(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f)));
        this.f63382H = trackingImageView;
        m90587c(trackingImageView);
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        setLeadingGravity(enumC16952b0);
        this.f63384J = new Badge(context);
        this.f63383I = new TrackingImageView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        setBackground(C27280g.m139658a(context, AbstractC2810d.stencils_list_bg));
        linearLayout.addView(this.f63384J);
        linearLayout.addView(this.f63383I);
        m90589e(linearLayout);
        setTrailingGravity(enumC16952b0);
        Badge badge = new Badge(context);
        C16974f c16974f = new C16974f(context);
        c16974f.m90974x(EnumC16991i.NEW_TEXT);
        Badge badgeTitle = getBadgeTitle();
        CharSequence m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_label_new);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        badgeTitle.setBadgeText(m118743r0);
        badge.m90493g(c16974f);
        this.f63385K = badge;
        setBadgeTitle(badge);
    }

    /* renamed from: q */
    public static final void m67851q(SettingItemNewView settingItemNewView, C25673e c25673e, View view) {
        AbstractC19074t.m100208f(settingItemNewView, "this$0");
        InterfaceC12137a interfaceC12137a = settingItemNewView.f63381G;
        if (interfaceC12137a != null) {
            interfaceC12137a.mo67853a(c25673e);
        }
    }

    public final InterfaceC12137a getListener() {
        return this.f63381G;
    }

    /* renamed from: p */
    public final void m67852p(C25673e c25673e) {
        int i11;
        int i12;
        C16974f c16974f;
        if (c25673e == null) {
            return;
        }
        setIdTracking(c25673e.m132579s());
        ImageView imageView = this.f63382H;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        imageView.setImageDrawable(C27280g.m139659b(context, c25673e.m132566f(), c25673e.m132567g()));
        setTitle(c25673e.m132578r());
        setSubtitle(c25673e.m132564d());
        setBracket(c25673e.m132577q());
        setTitleMaxLine(3);
        setSubtitleColor(c25673e.m132565e());
        setSubtitleMaxLine(3);
        Badge badge = this.f63385K;
        if (c25673e.m132572l()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        badge.setVisibility(i11);
        ImageView iconChevronRight = getIconChevronRight();
        if (c25673e.m132571k()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        iconChevronRight.setVisibility(i12);
        if (!c25673e.m132574n() && !c25673e.m132573m()) {
            this.f63384J.setVisibility(8);
        } else {
            this.f63384J.setVisibility(0);
            if (c25673e.m132574n()) {
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                c16974f = new C16974f(context2);
                c16974f.m90974x(EnumC16991i.SYSTEM_STATUS_WARNING);
            } else {
                Context context3 = getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                c16974f = new C16974f(context3);
                c16974f.m90974x(EnumC16991i.CUSTOM);
                c16974f.m90971u(EnumC16980h.SIZE_16);
                c16974f.m90967q(C27280g.m139660c(c16974f.m90953c(), AbstractC23322a.zds_ic_info_circle_solid_16, AbstractC7354t0.NotificationColor1));
            }
            this.f63384J.m90493g(c16974f);
        }
        if (c25673e.m132575o()) {
            getDivider().setVisibility(0);
            m90591l(AbstractC23136l9.m118742r(56.0f), 0, 0, 0);
        } else {
            getDivider().setVisibility(8);
        }
        setOnClickListener(new View.OnClickListener() { // from class: r70.f

            /* renamed from: q */
            public final /* synthetic */ C25673e f122661q;

            public /* synthetic */ ViewOnClickListenerC25674f(C25673e c25673e2) {
                r2 = c25673e2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingItemNewView.m67851q(SettingItemNewView.this, r2, view);
            }
        });
    }

    public final void setListener(InterfaceC12137a interfaceC12137a) {
        this.f63381G = interfaceC12137a;
    }
}
