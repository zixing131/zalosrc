package p241ij;

import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: ij.e */
/* loaded from: classes3.dex */
public final class C20568e {

    /* renamed from: a */
    private final MessageId f101135a;

    /* renamed from: b */
    private final String f101136b;

    /* renamed from: c */
    private final int f101137c;

    /* renamed from: d */
    private final boolean f101138d;

    /* renamed from: e */
    private final boolean f101139e;

    /* renamed from: f */
    private final boolean f101140f;

    /* renamed from: g */
    private final String f101141g;

    public C20568e(MessageId messageId, String str, int i11, boolean z11, boolean z12, boolean z13, String str2) {
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "customMsg");
        this.f101135a = messageId;
        this.f101136b = str;
        this.f101137c = i11;
        this.f101138d = z11;
        this.f101139e = z12;
        this.f101140f = z13;
        this.f101141g = str2;
    }

    /* renamed from: a */
    public final String m107017a() {
        return this.f101141g;
    }

    /* renamed from: b */
    public final MessageId m107018b() {
        return this.f101135a;
    }

    /* renamed from: c */
    public final int m107019c() {
        return this.f101137c;
    }

    /* renamed from: d */
    public final String m107020d() {
        return this.f101136b;
    }

    /* renamed from: e */
    public final boolean m107021e() {
        return this.f101139e;
    }

    /* renamed from: f */
    public final boolean m107022f() {
        return this.f101140f;
    }

    /* renamed from: g */
    public final boolean m107023g() {
        return this.f101138d;
    }

    public /* synthetic */ C20568e(MessageId messageId, String str, int i11, boolean z11, boolean z12, boolean z13, String str2, int i12, AbstractC19060k abstractC19060k) {
        this(messageId, str, i11, z11, z12, z13, (i12 & 64) != 0 ? "" : str2);
    }
}
