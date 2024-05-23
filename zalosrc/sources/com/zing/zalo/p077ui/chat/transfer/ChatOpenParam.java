package com.zing.zalo.p077ui.chat.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes5.dex */
public final class ChatOpenParam implements Parcelable {
    public static final Parcelable.Creator<ChatOpenParam> CREATOR = new C11716a();

    /* renamed from: p */
    private final boolean f60920p;

    /* renamed from: q */
    private final MessageId f60921q;

    /* renamed from: r */
    private final ChatWindowReference f60922r;

    /* renamed from: s */
    private final String f60923s;

    /* renamed from: t */
    private final String f60924t;

    /* renamed from: com.zing.zalo.ui.chat.transfer.ChatOpenParam$a */
    /* loaded from: classes5.dex */
    public static final class C11716a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChatOpenParam createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ChatOpenParam(parcel.readInt() != 0, (MessageId) parcel.readParcelable(ChatOpenParam.class.getClassLoader()), parcel.readInt() == 0 ? null : ChatWindowReference.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChatOpenParam[] newArray(int i11) {
            return new ChatOpenParam[i11];
        }
    }

    public ChatOpenParam(boolean z11, MessageId messageId, ChatWindowReference chatWindowReference, String str, String str2) {
        this.f60920p = z11;
        this.f60921q = messageId;
        this.f60922r = chatWindowReference;
        this.f60923s = str;
        this.f60924t = str2;
    }

    /* renamed from: a */
    public final MessageId m65289a() {
        return this.f60921q;
    }

    /* renamed from: b */
    public final ChatWindowReference m65290b() {
        return this.f60922r;
    }

    /* renamed from: c */
    public final String m65291c() {
        return this.f60924t;
    }

    /* renamed from: d */
    public final boolean m65292d() {
        return this.f60920p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m65293e() {
        return this.f60923s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatOpenParam)) {
            return false;
        }
        ChatOpenParam chatOpenParam = (ChatOpenParam) obj;
        return this.f60920p == chatOpenParam.f60920p && AbstractC19074t.m100204b(this.f60921q, chatOpenParam.f60921q) && AbstractC19074t.m100204b(this.f60922r, chatOpenParam.f60922r) && AbstractC19074t.m100204b(this.f60923s, chatOpenParam.f60923s) && AbstractC19074t.m100204b(this.f60924t, chatOpenParam.f60924t);
    }

    public int hashCode() {
        int m11520a = AbstractC2144f.m11520a(this.f60920p) * 31;
        MessageId messageId = this.f60921q;
        int hashCode = (m11520a + (messageId == null ? 0 : messageId.hashCode())) * 31;
        ChatWindowReference chatWindowReference = this.f60922r;
        int hashCode2 = (hashCode + (chatWindowReference == null ? 0 : chatWindowReference.hashCode())) * 31;
        String str = this.f60923s;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f60924t;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ChatOpenParam(removeToMainView=" + this.f60920p + ", jumpMsgId=" + this.f60921q + ", lastChatReference=" + this.f60922r + ", sourceStartView=" + this.f60923s + ", linkSource=" + this.f60924t + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f60920p ? 1 : 0);
        parcel.writeParcelable(this.f60921q, i11);
        ChatWindowReference chatWindowReference = this.f60922r;
        if (chatWindowReference == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            chatWindowReference.writeToParcel(parcel, i11);
        }
        parcel.writeString(this.f60923s);
        parcel.writeString(this.f60924t);
    }

    public /* synthetic */ ChatOpenParam(boolean z11, MessageId messageId, ChatWindowReference chatWindowReference, String str, String str2, int i11, AbstractC19060k abstractC19060k) {
        this(z11, messageId, chatWindowReference, str, (i11 & 16) != 0 ? "" : str2);
    }
}
