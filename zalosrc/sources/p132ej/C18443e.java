package p132ej;

import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import fn0.AbstractC19074t;
import p716zh.C32058p1;

/* renamed from: ej.e */
/* loaded from: classes3.dex */
public final class C18443e extends C18440b {

    /* renamed from: f */
    private final C32058p1 f92962f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18443e(C32058p1 c32058p1) {
        super(new Conversation(c32058p1));
        AbstractC19074t.m100208f(c32058p1, "deletedInfo");
        this.f92962f = c32058p1;
        this.f92990a = 43;
    }

    @Override // p132ej.C18440b, p132ej.C18451m
    /* renamed from: a */
    public String mo97719a() {
        return this.f92962f.m154674h();
    }

    /* renamed from: v */
    public final C32058p1 m97737v() {
        return this.f92962f;
    }
}
