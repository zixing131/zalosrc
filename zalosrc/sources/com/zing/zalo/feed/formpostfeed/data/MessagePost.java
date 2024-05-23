package com.zing.zalo.feed.formpostfeed.data;

import androidx.annotation.Keep;
import com.zing.zalo.feed.data.NumberTheme;
import com.zing.zalo.feed.data.NumberTheme$$serializer;
import com.zing.zalo.feed.data.TextLocalization;
import com.zing.zalo.feed.data.TextLocalization$$serializer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class MessagePost {
    public static final Companion Companion = new Companion(null);
    private static final MessagePost Default = new MessagePost((TextLocalization) null, (NumberTheme) null, 3, (AbstractC19060k) null);
    private final NumberTheme color;
    private final TextLocalization text;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final MessagePost m44985a() {
            return MessagePost.Default;
        }

        public final KSerializer serializer() {
            return MessagePost$$serializer.INSTANCE;
        }
    }

    public MessagePost() {
        this((TextLocalization) null, (NumberTheme) null, 3, (AbstractC19060k) null);
    }

    public static /* synthetic */ MessagePost copy$default(MessagePost messagePost, TextLocalization textLocalization, NumberTheme numberTheme, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textLocalization = messagePost.text;
        }
        if ((i11 & 2) != 0) {
            numberTheme = messagePost.color;
        }
        return messagePost.copy(textLocalization, numberTheme);
    }

    public static final /* synthetic */ void write$Self$app_release(MessagePost messagePost, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(messagePost.text, TextLocalization.Companion.m44978a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 0, TextLocalization$$serializer.INSTANCE, messagePost.text);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(messagePost.color, NumberTheme.Companion.m44973a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 1, NumberTheme$$serializer.INSTANCE, messagePost.color);
        }
    }

    public final TextLocalization component1() {
        return this.text;
    }

    public final NumberTheme component2() {
        return this.color;
    }

    public final MessagePost copy(TextLocalization textLocalization, NumberTheme numberTheme) {
        AbstractC19074t.m100208f(textLocalization, "text");
        AbstractC19074t.m100208f(numberTheme, "color");
        return new MessagePost(textLocalization, numberTheme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagePost)) {
            return false;
        }
        MessagePost messagePost = (MessagePost) obj;
        return AbstractC19074t.m100204b(this.text, messagePost.text) && AbstractC19074t.m100204b(this.color, messagePost.color);
    }

    public final NumberTheme getColor() {
        return this.color;
    }

    public final TextLocalization getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.color.hashCode();
    }

    public String toString() {
        return "MessagePost(text=" + this.text + ", color=" + this.color + ")";
    }

    public /* synthetic */ MessagePost(int i11, TextLocalization textLocalization, NumberTheme numberTheme, AbstractC26805k1 abstractC26805k1) {
        this.text = (i11 & 1) == 0 ? TextLocalization.Companion.m44978a() : textLocalization;
        if ((i11 & 2) == 0) {
            this.color = NumberTheme.Companion.m44973a();
        } else {
            this.color = numberTheme;
        }
    }

    public MessagePost(TextLocalization textLocalization, NumberTheme numberTheme) {
        AbstractC19074t.m100208f(textLocalization, "text");
        AbstractC19074t.m100208f(numberTheme, "color");
        this.text = textLocalization;
        this.color = numberTheme;
    }

    public /* synthetic */ MessagePost(TextLocalization textLocalization, NumberTheme numberTheme, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? TextLocalization.Companion.m44978a() : textLocalization, (i11 & 2) != 0 ? NumberTheme.Companion.m44973a() : numberTheme);
    }
}
