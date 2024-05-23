package i60;

import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19074t;
import p511sw.InterfaceC26392a;

/* renamed from: i60.e */
/* loaded from: classes5.dex */
public final class C20339e implements InterfaceC26392a {

    /* renamed from: p */
    private final String f100317p;

    /* renamed from: q */
    private final MessageId f100318q;

    /* renamed from: r */
    private final long f100319r;

    public C20339e(String str, MessageId messageId, long j11) {
        AbstractC19074t.m100208f(str, "ownerId");
        this.f100317p = str;
        this.f100318q = messageId;
        this.f100319r = j11;
    }

    @Override // p511sw.InterfaceC26392a
    /* renamed from: W2 */
    public String mo95039W2() {
        return this.f100317p;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(InterfaceC26392a interfaceC26392a) {
        return InterfaceC26392a.a.m136000a(this, interfaceC26392a);
    }

    @Override // p511sw.InterfaceC26392a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public MessageId getItemId() {
        return this.f100318q;
    }

    @Override // p511sw.InterfaceC26392a
    /* renamed from: o */
    public long mo95213o() {
        return this.f100319r;
    }

    public String toString() {
        return String.valueOf(this.f100318q);
    }
}
