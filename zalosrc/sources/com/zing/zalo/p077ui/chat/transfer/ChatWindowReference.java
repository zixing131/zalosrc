package com.zing.zalo.p077ui.chat.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes5.dex */
public final class ChatWindowReference implements Parcelable {
    public static final Parcelable.Creator<ChatWindowReference> CREATOR = new C11717a();

    /* renamed from: p */
    private final String f60925p;

    /* renamed from: q */
    private final String f60926q;

    /* renamed from: r */
    private final MessageId f60927r;

    /* renamed from: s */
    private final boolean f60928s;

    /* renamed from: com.zing.zalo.ui.chat.transfer.ChatWindowReference$a */
    /* loaded from: classes5.dex */
    public static final class C11717a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChatWindowReference createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ChatWindowReference(parcel.readString(), parcel.readString(), (MessageId) parcel.readParcelable(ChatWindowReference.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChatWindowReference[] newArray(int i11) {
            return new ChatWindowReference[i11];
        }
    }

    public ChatWindowReference(String str, String str2, MessageId messageId, boolean z11) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(str2, "threadName");
        this.f60925p = str;
        this.f60926q = str2;
        this.f60927r = messageId;
        this.f60928s = z11;
    }

    /* renamed from: a */
    public final MessageId m65296a() {
        return this.f60927r;
    }

    /* renamed from: b */
    public final boolean m65297b() {
        return this.f60928s;
    }

    /* renamed from: c */
    public final String m65298c() {
        return this.f60925p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatWindowReference)) {
            return false;
        }
        ChatWindowReference chatWindowReference = (ChatWindowReference) obj;
        return AbstractC19074t.m100204b(this.f60925p, chatWindowReference.f60925p) && AbstractC19074t.m100204b(this.f60926q, chatWindowReference.f60926q) && AbstractC19074t.m100204b(this.f60927r, chatWindowReference.f60927r) && this.f60928s == chatWindowReference.f60928s;
    }

    public int hashCode() {
        int hashCode = ((this.f60925p.hashCode() * 31) + this.f60926q.hashCode()) * 31;
        MessageId messageId = this.f60927r;
        return ((hashCode + (messageId == null ? 0 : messageId.hashCode())) * 31) + AbstractC2144f.m11520a(this.f60928s);
    }

    public String toString() {
        return "ChatWindowReference(threadId=" + this.f60925p + ", threadName=" + this.f60926q + ", lastMessageId=" + this.f60927r + ", showBackEntryPoint=" + this.f60928s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f60925p);
        parcel.writeString(this.f60926q);
        parcel.writeParcelable(this.f60927r, i11);
        parcel.writeInt(this.f60928s ? 1 : 0);
    }

    public /* synthetic */ ChatWindowReference(String str, String str2, MessageId messageId, boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this(str, str2, messageId, (i11 & 8) != 0 ? true : z11);
    }
}
