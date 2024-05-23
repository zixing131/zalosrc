package p132ej;

import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import fn0.AbstractC19074t;
import gw.C19669z;

/* renamed from: ej.i */
/* loaded from: classes3.dex */
public final class C18447i extends C18451m {

    /* renamed from: e */
    private final Conversation f92979e;

    public C18447i(Conversation conversation) {
        AbstractC19074t.m100208f(conversation, "firstConversation");
        this.f92979e = conversation;
        this.f92990a = 24;
    }

    @Override // p132ej.C18451m
    /* renamed from: a */
    public String mo97719a() {
        return "-8";
    }

    @Override // p132ej.C18451m
    /* renamed from: c */
    public boolean mo97721c() {
        if (C19669z.f97580b0 > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final Conversation m97764o() {
        return this.f92979e;
    }
}
