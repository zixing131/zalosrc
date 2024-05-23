package p132ej;

import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import fn0.AbstractC19074t;
import p348mi.AbstractC23306f;

/* renamed from: ej.k */
/* loaded from: classes3.dex */
public final class C18449k extends C18451m {

    /* renamed from: e */
    private final Conversation f92981e;

    public C18449k(Conversation conversation) {
        AbstractC19074t.m100208f(conversation, "latestConversation");
        this.f92981e = conversation;
        this.f92990a = 23;
    }

    @Override // p132ej.C18451m
    /* renamed from: a */
    public String mo97719a() {
        return "-2";
    }

    @Override // p132ej.C18451m
    /* renamed from: c */
    public boolean mo97721c() {
        if (AbstractC23306f.m120606O1().m102741B() > 0 || (!AbstractC23306f.m120606O1().m102753K().isEmpty())) {
            return true;
        }
        return false;
    }
}
