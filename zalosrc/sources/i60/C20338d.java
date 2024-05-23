package i60;

import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p241ij.C20568e;

/* renamed from: i60.d */
/* loaded from: classes5.dex */
public final class C20338d {

    /* renamed from: a */
    private final int f100313a;

    /* renamed from: b */
    private final C17945a0 f100314b;

    /* renamed from: c */
    private final MessageId f100315c;

    /* renamed from: d */
    private final C20568e f100316d;

    public C20338d(int i11, C17945a0 c17945a0, MessageId messageId, C20568e c20568e) {
        this.f100313a = i11;
        this.f100314b = c17945a0;
        this.f100315c = messageId;
        this.f100316d = c20568e;
    }

    /* renamed from: a */
    public final int m106043a() {
        return this.f100313a;
    }

    /* renamed from: b */
    public final MessageId m106044b() {
        return this.f100315c;
    }

    /* renamed from: c */
    public final C20568e m106045c() {
        return this.f100316d;
    }

    /* renamed from: d */
    public final C17945a0 m106046d() {
        return this.f100314b;
    }

    /* renamed from: e */
    public final MessageId m106047e() {
        return this.f100315c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20338d)) {
            return false;
        }
        C20338d c20338d = (C20338d) obj;
        return this.f100313a == c20338d.f100313a && AbstractC19074t.m100204b(this.f100314b, c20338d.f100314b) && AbstractC19074t.m100204b(this.f100315c, c20338d.f100315c) && AbstractC19074t.m100204b(this.f100316d, c20338d.f100316d);
    }

    /* renamed from: f */
    public final C20568e m106048f() {
        return this.f100316d;
    }

    /* renamed from: g */
    public final int m106049g() {
        return this.f100313a;
    }

    public int hashCode() {
        int i11 = this.f100313a * 31;
        C17945a0 c17945a0 = this.f100314b;
        int hashCode = (i11 + (c17945a0 == null ? 0 : c17945a0.hashCode())) * 31;
        MessageId messageId = this.f100315c;
        int hashCode2 = (hashCode + (messageId == null ? 0 : messageId.hashCode())) * 31;
        C20568e c20568e = this.f100316d;
        return hashCode2 + (c20568e != null ? c20568e.hashCode() : 0);
    }

    public String toString() {
        return "EventMessageUndoParam(orgMsgType=" + this.f100313a + ", chatContent=" + this.f100314b + ", messageId=" + this.f100315c + ", msgUndoDeleteInfo=" + this.f100316d + ")";
    }

    public /* synthetic */ C20338d(int i11, C17945a0 c17945a0, MessageId messageId, C20568e c20568e, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? -1 : i11, (i12 & 2) != 0 ? null : c17945a0, (i12 & 4) != 0 ? null : messageId, (i12 & 8) != 0 ? null : c20568e);
    }
}
