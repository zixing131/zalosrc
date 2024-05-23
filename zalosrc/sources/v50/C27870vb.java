package v50;

import android.os.Bundle;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19074t;

/* renamed from: v50.vb */
/* loaded from: classes5.dex */
public final class C27870vb {

    /* renamed from: a */
    private final String f130110a;

    /* renamed from: b */
    private String f130111b;

    /* renamed from: c */
    private String f130112c;

    /* renamed from: d */
    private int f130113d;

    /* renamed from: e */
    private long f130114e;

    /* renamed from: f */
    private MessageId f130115f;

    public C27870vb(String str) {
        AbstractC19074t.m100208f(str, "uid");
        this.f130110a = str;
        this.f130111b = "";
        this.f130112c = "";
    }

    /* renamed from: e */
    private final boolean m140774e() {
        if (this.f130110a.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C27870vb m140775a(String str) {
        AbstractC19074t.m100208f(str, "avt");
        this.f130112c = str;
        return this;
    }

    /* renamed from: b */
    public final Bundle m140776b() {
        if (!m140774e()) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_chat_profile_uid", this.f130110a);
            bundle.putString("extra_chat_profile_dpn", this.f130111b);
            bundle.putString("extra_chat_profile_avt", this.f130112c);
            bundle.putInt("extra_chat_profile_type_contact", this.f130113d);
            bundle.putLong("extra_chat_profile_last_action", this.f130114e);
            MessageId messageId = this.f130115f;
            if (messageId != null) {
                bundle.putParcelable("STR_EXTRA_JUMP_TO_MESSAGE_ID", messageId);
            }
            return bundle;
        }
        throw new IllegalArgumentException("Invalid ChatView extras: " + this);
    }

    /* renamed from: c */
    public final C27870vb m140777c(Conversation conversation) {
        if (conversation != null) {
            m140778d(conversation.f42894r);
            m140775a(conversation.f42895s);
            m140782i(conversation.m40998a().f42352K0);
            m140779f(conversation.m40998a().f42336F);
        }
        return this;
    }

    /* renamed from: d */
    public final C27870vb m140778d(String str) {
        AbstractC19074t.m100208f(str, "dpn");
        this.f130111b = str;
        return this;
    }

    /* renamed from: f */
    public final C27870vb m140779f(long j11) {
        this.f130114e = j11;
        return this;
    }

    /* renamed from: g */
    public final C27870vb m140780g(ContactProfile contactProfile) {
        if (contactProfile != null) {
            String str = contactProfile.f42437s;
            AbstractC19074t.m100207e(str, "dpn");
            m140778d(str);
            String str2 = contactProfile.f42446v;
            AbstractC19074t.m100207e(str2, "avt");
            m140775a(str2);
            m140782i(contactProfile.f42352K0);
            m140779f(contactProfile.f42336F);
        }
        return this;
    }

    /* renamed from: h */
    public final C27870vb m140781h(MessageId messageId) {
        this.f130115f = messageId;
        return this;
    }

    /* renamed from: i */
    public final C27870vb m140782i(int i11) {
        this.f130113d = i11;
        return this;
    }

    public String toString() {
        return "ChatViewExtrasBuilder(uid='" + this.f130110a + "', dpn='" + this.f130111b + "', avt='" + this.f130112c + "', typeContact=" + this.f130113d + ", lastAction=" + this.f130114e + ", targetMsg=" + this.f130115f + ")";
    }
}
