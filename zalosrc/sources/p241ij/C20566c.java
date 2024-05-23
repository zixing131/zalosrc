package p241ij;

import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19074t;

/* renamed from: ij.c */
/* loaded from: classes3.dex */
public final class C20566c {

    /* renamed from: a */
    private final String f101108a;

    /* renamed from: b */
    private final MessageId f101109b;

    /* renamed from: c */
    private final long f101110c;

    /* renamed from: d */
    private final boolean f101111d;

    /* renamed from: e */
    private boolean f101112e;

    public C20566c(String str, MessageId messageId, long j11, boolean z11) {
        AbstractC19074t.m100208f(str, "mConversationId");
        this.f101108a = str;
        this.f101109b = messageId;
        this.f101110c = j11;
        this.f101111d = z11;
        this.f101112e = true;
    }

    /* renamed from: a */
    public final boolean m106987a() {
        return this.f101111d;
    }

    /* renamed from: b */
    public final String m106988b() {
        return this.f101108a;
    }

    /* renamed from: c */
    public final MessageId m106989c() {
        return this.f101109b;
    }

    /* renamed from: d */
    public final long m106990d() {
        return this.f101110c;
    }

    /* renamed from: e */
    public final boolean m106991e() {
        return this.f101112e;
    }

    /* renamed from: f */
    public final void m106992f(boolean z11) {
        this.f101112e = z11;
    }
}
