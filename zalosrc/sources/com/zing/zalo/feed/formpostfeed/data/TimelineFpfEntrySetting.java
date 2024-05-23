package com.zing.zalo.feed.formpostfeed.data;

import androidx.annotation.Keep;
import com.zing.zalo.feed.formpostfeed.data.MessagePost;
import com.zing.zalo.feed.formpostfeed.data.PromotePostItem;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26788f;
import un0.AbstractC27323a;
import un0.AbstractC27336n;
import un0.C27326d;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class TimelineFpfEntrySetting {
    private final Display avatar;
    private final Element background;
    private String decorHighlight;
    private final Decorations decorations;
    private String feedHint;
    private int flag;
    private MessagePost greetMsg;
    private MessagePost hint;
    private String icon;
    private List<PromotePostItem> promotePost;
    private String suggestHint;
    private String suggestObj;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer[] $childSerializers = {null, null, null, null, null, null, new C26788f(PromotePostItem$$serializer.INSTANCE), null, null, null, null, null};
    private static final AbstractC27323a json = AbstractC27336n.m139941b(null, C8452a.f45912q, 1, null);

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final TimelineFpfEntrySetting m44990a() {
            return new TimelineFpfEntrySetting(null, 1, null);
        }

        /* renamed from: b */
        public final TimelineFpfEntrySetting m44991b(String str) {
            TimelineFpfEntrySetting m44990a;
            List<PromotePostItem> m131505m;
            AbstractC19074t.m100208f(str, "data");
            try {
                AbstractC27323a abstractC27323a = TimelineFpfEntrySetting.json;
                abstractC27323a.mo131586a();
                m44990a = (TimelineFpfEntrySetting) abstractC27323a.m139867d(TimelineFpfEntrySetting.Companion.serializer(), str);
            } catch (Exception unused) {
                m44990a = m44990a();
            }
            if (m44990a.getPromotePost().isEmpty()) {
                PromotePostItem.Companion companion = PromotePostItem.Companion;
                m131505m = AbstractC25368s.m131505m(companion.m44987b(), companion.m44988c());
                m44990a.setPromotePost(m131505m);
            }
            return m44990a;
        }

        public final KSerializer serializer() {
            return TimelineFpfEntrySetting$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.feed.formpostfeed.data.TimelineFpfEntrySetting$a */
    /* loaded from: classes4.dex */
    static final class C8452a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C8452a f45912q = new C8452a();

        C8452a() {
            super(1);
        }

        /* renamed from: a */
        public final void m44992a(C27326d c27326d) {
            AbstractC19074t.m100208f(c27326d, "$this$Json");
            c27326d.m139881f(true);
            c27326d.m139878c(true);
            c27326d.m139882g(true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m44992a((C27326d) obj);
            return C24848g0.f119245a;
        }
    }

    public TimelineFpfEntrySetting() {
        this(null, 1, null);
    }

    public static /* synthetic */ TimelineFpfEntrySetting copy$default(TimelineFpfEntrySetting timelineFpfEntrySetting, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = timelineFpfEntrySetting.icon;
        }
        return timelineFpfEntrySetting.copy(str);
    }

    public static /* synthetic */ void getAvatar$annotations() {
    }

    public static /* synthetic */ void getBackground$annotations() {
    }

    public static /* synthetic */ void getDecorHighlight$annotations() {
    }

    public static /* synthetic */ void getDecorations$annotations() {
    }

    public static /* synthetic */ void getFeedHint$annotations() {
    }

    public static /* synthetic */ void getGreetMsg$annotations() {
    }

    public static /* synthetic */ void getHint$annotations() {
    }

    public static /* synthetic */ void getSuggestHint$annotations() {
    }

    public static /* synthetic */ void getSuggestObj$annotations() {
    }

    public static final TimelineFpfEntrySetting parseFromJson(String str) {
        return Companion.m44991b(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:            if (fn0.AbstractC19074t.m100204b(r5, r1) == false) goto L119;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$app_release(TimelineFpfEntrySetting timelineFpfEntrySetting, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        List m131505m;
        KSerializer[] kSerializerArr = $childSerializers;
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(timelineFpfEntrySetting.icon, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 0, timelineFpfEntrySetting.icon);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || timelineFpfEntrySetting.flag != 1) {
            interfaceC21886d.mo114033x(serialDescriptor, 1, timelineFpfEntrySetting.flag);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || !AbstractC19074t.m100204b(timelineFpfEntrySetting.suggestHint, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 2, timelineFpfEntrySetting.suggestHint);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || !AbstractC19074t.m100204b(timelineFpfEntrySetting.decorHighlight, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 3, timelineFpfEntrySetting.decorHighlight);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || !AbstractC19074t.m100204b(timelineFpfEntrySetting.feedHint, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 4, timelineFpfEntrySetting.feedHint);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || !AbstractC19074t.m100204b(timelineFpfEntrySetting.suggestObj, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 5, timelineFpfEntrySetting.suggestObj);
        }
        if (!interfaceC21886d.mo114019A(serialDescriptor, 6)) {
            List<PromotePostItem> list = timelineFpfEntrySetting.promotePost;
            PromotePostItem.Companion companion = PromotePostItem.Companion;
            m131505m = AbstractC25368s.m131505m(companion.m44987b(), companion.m44988c());
        }
        interfaceC21886d.mo114029i(serialDescriptor, 6, kSerializerArr[6], timelineFpfEntrySetting.promotePost);
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || !AbstractC19074t.m100204b(timelineFpfEntrySetting.greetMsg, MessagePost.Companion.m44985a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 7, MessagePost$$serializer.INSTANCE, timelineFpfEntrySetting.greetMsg);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || !AbstractC19074t.m100204b(timelineFpfEntrySetting.hint, MessagePost.Companion.m44985a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 8, MessagePost$$serializer.INSTANCE, timelineFpfEntrySetting.hint);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || !AbstractC19074t.m100204b(timelineFpfEntrySetting.avatar, Display.Companion.m44980a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 9, Display$$serializer.INSTANCE, timelineFpfEntrySetting.avatar);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || !AbstractC19074t.m100204b(timelineFpfEntrySetting.background, Element.Companion.m44981a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 10, Element$$serializer.INSTANCE, timelineFpfEntrySetting.background);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 11) || !AbstractC19074t.m100204b(timelineFpfEntrySetting.decorations, Decorations.Companion.m44979a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 11, Decorations$$serializer.INSTANCE, timelineFpfEntrySetting.decorations);
        }
    }

    public final String component1() {
        return this.icon;
    }

    public final TimelineFpfEntrySetting copy(String str) {
        AbstractC19074t.m100208f(str, "icon");
        return new TimelineFpfEntrySetting(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimelineFpfEntrySetting) && AbstractC19074t.m100204b(this.icon, ((TimelineFpfEntrySetting) obj).icon);
    }

    public final Display getAvatar() {
        return this.avatar;
    }

    public final Element getBackground() {
        return this.background;
    }

    public final String getDecorHighlight() {
        return this.decorHighlight;
    }

    public final Decorations getDecorations() {
        return this.decorations;
    }

    public final String getFeedHint() {
        return this.feedHint;
    }

    public final MessagePost getGreetMsg() {
        return this.greetMsg;
    }

    public final MessagePost getHint() {
        return this.hint;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final List<PromotePostItem> getPromotePost() {
        return this.promotePost;
    }

    public final String getSuggestHint() {
        return this.suggestHint;
    }

    public final String getSuggestObj() {
        return this.suggestObj;
    }

    public final boolean getUseAvatar() {
        return !AbstractC19074t.m100204b(this.avatar, Display.Companion.m44980a());
    }

    public final boolean getUseBackground() {
        return !AbstractC19074t.m100204b(this.background, Element.Companion.m44981a());
    }

    public final boolean getUseDecorations() {
        return !AbstractC19074t.m100204b(this.decorations, Decorations.Companion.m44979a());
    }

    public int hashCode() {
        return this.icon.hashCode();
    }

    public final boolean isShow() {
        return this.flag != 0;
    }

    public final void setDecorHighlight(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.decorHighlight = str;
    }

    public final void setFeedHint(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.feedHint = str;
    }

    public final void setGreetMsg(MessagePost messagePost) {
        AbstractC19074t.m100208f(messagePost, "<set-?>");
        this.greetMsg = messagePost;
    }

    public final void setHint(MessagePost messagePost) {
        AbstractC19074t.m100208f(messagePost, "<set-?>");
        this.hint = messagePost;
    }

    public final void setIcon(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.icon = str;
    }

    public final void setPromotePost(List<PromotePostItem> list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.promotePost = list;
    }

    public final void setSuggestHint(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.suggestHint = str;
    }

    public final void setSuggestObj(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.suggestObj = str;
    }

    public final String toJsonString() {
        try {
            AbstractC27323a abstractC27323a = json;
            abstractC27323a.mo131586a();
            return abstractC27323a.mo131597b(Companion.serializer(), this);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
    }

    public String toString() {
        return "TimelineFpfEntrySetting(icon=" + this.icon + ")";
    }

    public /* synthetic */ TimelineFpfEntrySetting(int i11, String str, int i12, String str2, String str3, String str4, String str5, List list, MessagePost messagePost, MessagePost messagePost2, Display display, Element element, Decorations decorations, AbstractC26805k1 abstractC26805k1) {
        List<PromotePostItem> m131505m;
        if ((i11 & 1) == 0) {
            this.icon = "";
        } else {
            this.icon = str;
        }
        if ((i11 & 2) == 0) {
            this.flag = 1;
        } else {
            this.flag = i12;
        }
        if ((i11 & 4) == 0) {
            this.suggestHint = "";
        } else {
            this.suggestHint = str2;
        }
        if ((i11 & 8) == 0) {
            this.decorHighlight = "";
        } else {
            this.decorHighlight = str3;
        }
        if ((i11 & 16) == 0) {
            this.feedHint = "";
        } else {
            this.feedHint = str4;
        }
        if ((i11 & 32) == 0) {
            this.suggestObj = "";
        } else {
            this.suggestObj = str5;
        }
        if ((i11 & 64) == 0) {
            PromotePostItem.Companion companion = PromotePostItem.Companion;
            m131505m = AbstractC25368s.m131505m(companion.m44987b(), companion.m44988c());
            this.promotePost = m131505m;
        } else {
            this.promotePost = list;
        }
        if ((i11 & 128) == 0) {
            this.greetMsg = MessagePost.Companion.m44985a();
        } else {
            this.greetMsg = messagePost;
        }
        if ((i11 & 256) == 0) {
            this.hint = MessagePost.Companion.m44985a();
        } else {
            this.hint = messagePost2;
        }
        if ((i11 & 512) == 0) {
            this.avatar = Display.Companion.m44980a();
        } else {
            this.avatar = display;
        }
        if ((i11 & 1024) == 0) {
            this.background = Element.Companion.m44981a();
        } else {
            this.background = element;
        }
        if ((i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.decorations = Decorations.Companion.m44979a();
        } else {
            this.decorations = decorations;
        }
    }

    public TimelineFpfEntrySetting(String str) {
        List<PromotePostItem> m131505m;
        AbstractC19074t.m100208f(str, "icon");
        this.icon = str;
        this.flag = 1;
        this.suggestHint = "";
        this.decorHighlight = "";
        this.feedHint = "";
        this.suggestObj = "";
        PromotePostItem.Companion companion = PromotePostItem.Companion;
        m131505m = AbstractC25368s.m131505m(companion.m44987b(), companion.m44988c());
        this.promotePost = m131505m;
        MessagePost.Companion companion2 = MessagePost.Companion;
        this.greetMsg = companion2.m44985a();
        this.hint = companion2.m44985a();
        this.avatar = Display.Companion.m44980a();
        this.background = Element.Companion.m44981a();
        this.decorations = Decorations.Companion.m44979a();
    }

    public /* synthetic */ TimelineFpfEntrySetting(String str, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str);
    }
}
