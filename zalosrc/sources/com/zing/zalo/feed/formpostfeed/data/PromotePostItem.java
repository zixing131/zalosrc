package com.zing.zalo.feed.formpostfeed.data;

import androidx.annotation.Keep;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.data.NumberTheme;
import com.zing.zalo.feed.data.NumberTheme$$serializer;
import com.zing.zalo.feed.data.TextLocalization;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Locale;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import me0.AbstractC23136l9;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class PromotePostItem {
    public static final Companion Companion = new Companion(null);
    public static final int TYPE_ALBUM = 5;
    public static final int TYPE_BACKGROUND = 3;
    public static final int TYPE_MEMORY = 4;
    public static final int TYPE_OTHER = 0;
    public static final int TYPE_PHOTO = 1;
    public static final int TYPE_VIDEO = 2;
    private String actionData;
    private String actionType;
    private final NumberTheme bgColor;
    private MessagePost caption;
    private final Display icon;
    private String iconUrl;

    /* renamed from: id */
    private int f45911id;
    private String tipCat;
    private final String trackingParams;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final MessagePost m44986a(int i11) {
            String m118675S = AbstractC23136l9.m118675S(new Locale("vi"), i11);
            AbstractC19074t.m100207e(m118675S, "getLocaleStringResource(...)");
            String m118675S2 = AbstractC23136l9.m118675S(new Locale("en"), i11);
            AbstractC19074t.m100207e(m118675S2, "getLocaleStringResource(...)");
            return new MessagePost(new TextLocalization(m118675S, m118675S2), new NumberTheme(AbstractC23136l9.m118639A(AbstractC2808b.light_text_01), AbstractC23136l9.m118639A(AbstractC2808b.dark_text_01)));
        }

        /* renamed from: b */
        public final PromotePostItem m44987b() {
            PromotePostItem promotePostItem = new PromotePostItem(1);
            promotePostItem.setCaption(PromotePostItem.Companion.m44986a(AbstractC8020f0.str_feed_remind_post_photo));
            promotePostItem.setActionType("action.open.postfeed");
            promotePostItem.setActionData("{\"type\":7}");
            return promotePostItem;
        }

        /* renamed from: c */
        public final PromotePostItem m44988c() {
            PromotePostItem promotePostItem = new PromotePostItem(2);
            promotePostItem.setCaption(PromotePostItem.Companion.m44986a(AbstractC8020f0.str_feed_remind_post_video));
            promotePostItem.setActionType("action.open.postfeed");
            promotePostItem.setActionData("{\"type\":8}");
            return promotePostItem;
        }

        public final KSerializer serializer() {
            return PromotePostItem$$serializer.INSTANCE;
        }
    }

    public PromotePostItem() {
        this(0, 1, null);
    }

    public static /* synthetic */ PromotePostItem copy$default(PromotePostItem promotePostItem, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = promotePostItem.f45911id;
        }
        return promotePostItem.copy(i11);
    }

    public static /* synthetic */ void getBgColor$annotations() {
    }

    public static /* synthetic */ void getCaption$annotations() {
    }

    public static /* synthetic */ void getIcon$annotations() {
    }

    public static /* synthetic */ void getIconUrl$annotations() {
    }

    public static /* synthetic */ void getTrackingParams$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(PromotePostItem promotePostItem, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || promotePostItem.f45911id != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, promotePostItem.f45911id);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(promotePostItem.caption, MessagePost.Companion.m44985a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 1, MessagePost$$serializer.INSTANCE, promotePostItem.caption);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || !AbstractC19074t.m100204b(promotePostItem.bgColor, NumberTheme.Companion.m44973a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 2, NumberTheme$$serializer.INSTANCE, promotePostItem.bgColor);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || !AbstractC19074t.m100204b(promotePostItem.icon, Display.Companion.m44980a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 3, Display$$serializer.INSTANCE, promotePostItem.icon);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || !AbstractC19074t.m100204b(promotePostItem.iconUrl, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 4, promotePostItem.iconUrl);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || !AbstractC19074t.m100204b(promotePostItem.tipCat, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 5, promotePostItem.tipCat);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || !AbstractC19074t.m100204b(promotePostItem.actionType, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 6, promotePostItem.actionType);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || !AbstractC19074t.m100204b(promotePostItem.actionData, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 7, promotePostItem.actionData);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || !AbstractC19074t.m100204b(promotePostItem.trackingParams, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 8, promotePostItem.trackingParams);
        }
    }

    public final int component1() {
        return this.f45911id;
    }

    public final PromotePostItem copy(int i11) {
        return new PromotePostItem(i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PromotePostItem) && this.f45911id == ((PromotePostItem) obj).f45911id;
    }

    public final String getActionData() {
        return this.actionData;
    }

    public final String getActionType() {
        return this.actionType;
    }

    public final NumberTheme getBgColor() {
        return this.bgColor;
    }

    public final MessagePost getCaption() {
        return this.caption;
    }

    public final Display getIcon() {
        return this.icon;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.f45911id;
    }

    public final String getTipCat() {
        return this.tipCat;
    }

    public final String getTrackingParams() {
        return this.trackingParams;
    }

    public int hashCode() {
        return this.f45911id;
    }

    public final void setActionData(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.actionData = str;
    }

    public final void setActionType(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.actionType = str;
    }

    public final void setCaption(MessagePost messagePost) {
        AbstractC19074t.m100208f(messagePost, "<set-?>");
        this.caption = messagePost;
    }

    public final void setIconUrl(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.iconUrl = str;
    }

    public final void setId(int i11) {
        this.f45911id = i11;
    }

    public final void setTipCat(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.tipCat = str;
    }

    public String toString() {
        return "PromotePostItem(id=" + this.f45911id + ")";
    }

    public PromotePostItem(int i11) {
        this.f45911id = i11;
        this.caption = MessagePost.Companion.m44985a();
        this.bgColor = NumberTheme.Companion.m44973a();
        this.icon = Display.Companion.m44980a();
        this.iconUrl = "";
        this.tipCat = "";
        this.actionType = "";
        this.actionData = "";
        this.trackingParams = "";
    }

    public /* synthetic */ PromotePostItem(int i11, int i12, MessagePost messagePost, NumberTheme numberTheme, Display display, String str, String str2, String str3, String str4, String str5, AbstractC26805k1 abstractC26805k1) {
        this.f45911id = (i11 & 1) == 0 ? 0 : i12;
        if ((i11 & 2) == 0) {
            this.caption = MessagePost.Companion.m44985a();
        } else {
            this.caption = messagePost;
        }
        if ((i11 & 4) == 0) {
            this.bgColor = NumberTheme.Companion.m44973a();
        } else {
            this.bgColor = numberTheme;
        }
        if ((i11 & 8) == 0) {
            this.icon = Display.Companion.m44980a();
        } else {
            this.icon = display;
        }
        if ((i11 & 16) == 0) {
            this.iconUrl = "";
        } else {
            this.iconUrl = str;
        }
        if ((i11 & 32) == 0) {
            this.tipCat = "";
        } else {
            this.tipCat = str2;
        }
        if ((i11 & 64) == 0) {
            this.actionType = "";
        } else {
            this.actionType = str3;
        }
        if ((i11 & 128) == 0) {
            this.actionData = "";
        } else {
            this.actionData = str4;
        }
        if ((i11 & 256) == 0) {
            this.trackingParams = "";
        } else {
            this.trackingParams = str5;
        }
    }

    public /* synthetic */ PromotePostItem(int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
