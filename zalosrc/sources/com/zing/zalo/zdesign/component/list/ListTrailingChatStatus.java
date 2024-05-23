package com.zing.zalo.zdesign.component.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Badge;
import fn0.AbstractC19074t;
import ui0.C27280g;

/* loaded from: classes7.dex */
public class ListTrailingChatStatus extends RelativeLayout {

    /* renamed from: p */
    private ImageView f87033p;

    /* renamed from: q */
    private ImageView f87034q;

    /* renamed from: r */
    private RobotoTextView f87035r;

    /* renamed from: s */
    private Badge f87036s;

    /* renamed from: t */
    private Badge f87037t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListTrailingChatStatus(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: a */
    private final void m91088a() {
        ImageView imageView = this.f87033p;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        imageView.setImageDrawable(C27280g.m139660c(context, AbstractC2810d.zds_ic_pin_solid_16, AbstractC2807a.icon_02));
        ImageView imageView2 = this.f87034q;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        imageView2.setImageDrawable(C27280g.m139660c(context2, AbstractC2810d.zds_ic_notif_off_solid_16, AbstractC2807a.icon_02));
    }

    public final Badge getBadgeMention() {
        return this.f87036s;
    }

    public final Badge getBadgeNoti() {
        return this.f87037t;
    }

    public final ImageView getIconMute() {
        return this.f87034q;
    }

    public final ImageView getIconPin() {
        return this.f87033p;
    }

    public final RobotoTextView getTimeContent() {
        return this.f87035r;
    }

    public final void setBadgeMention(Badge badge) {
        AbstractC19074t.m100208f(badge, "<set-?>");
        this.f87036s = badge;
    }

    public final void setBadgeNoti(Badge badge) {
        AbstractC19074t.m100208f(badge, "<set-?>");
        this.f87037t = badge;
    }

    public final void setIconMute(ImageView imageView) {
        AbstractC19074t.m100208f(imageView, "<set-?>");
        this.f87034q = imageView;
    }

    public final void setIconPin(ImageView imageView) {
        AbstractC19074t.m100208f(imageView, "<set-?>");
        this.f87033p = imageView;
    }

    public final void setTimeContent(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f87035r = robotoTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListTrailingChatStatus(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        LayoutInflater.from(context).inflate(AbstractC2812f.item_list_trailing_chat_status, this);
        View findViewById = findViewById(AbstractC2811e.icon_pin_list_trailing);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.icon_pin_list_trailing)");
        this.f87033p = (ImageView) findViewById;
        View findViewById2 = findViewById(AbstractC2811e.icon_mute_list_trailing);
        AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.icon_mute_list_trailing)");
        this.f87034q = (ImageView) findViewById2;
        View findViewById3 = findViewById(AbstractC2811e.time_list_trailing);
        AbstractC19074t.m100207e(findViewById3, "findViewById(R.id.time_list_trailing)");
        this.f87035r = (RobotoTextView) findViewById3;
        View findViewById4 = findViewById(AbstractC2811e.badge_mention_list_trailing);
        AbstractC19074t.m100207e(findViewById4, "findViewById(R.id.badge_mention_list_trailing)");
        this.f87036s = (Badge) findViewById4;
        View findViewById5 = findViewById(AbstractC2811e.badge_number_unread_list_trailing);
        AbstractC19074t.m100207e(findViewById5, "findViewById(R.id.badge_…ber_unread_list_trailing)");
        this.f87037t = (Badge) findViewById5;
        m91088a();
    }
}
