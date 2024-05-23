package com.zing.zalo.data.entity.chat.message;

import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: com.zing.zalo.data.entity.chat.message.a */
/* loaded from: classes3.dex */
public final class C7940a {

    /* renamed from: a */
    private final MessageId f42923a;

    /* renamed from: b */
    private final boolean f42924b;

    public C7940a(JSONObject jSONObject, String str) {
        AbstractC19074t.m100208f(jSONObject, "json");
        AbstractC19074t.m100208f(str, "ownerId");
        String m96089h = AbstractC18069a.m96089h(jSONObject, "globalMsgId");
        AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
        String m96089h2 = AbstractC18069a.m96089h(jSONObject, "cliMsgId");
        AbstractC19074t.m100207e(m96089h2, "getJSONValue(...)");
        this.f42923a = MessageId.C7932a.m41062g(MessageId.Companion, m96089h2, m96089h, str, null, 8, null);
        this.f42924b = jSONObject.optInt("deleteMsg", 0) == 1;
    }

    /* renamed from: a */
    public final MessageId m41078a() {
        return this.f42923a;
    }

    /* renamed from: b */
    public final boolean m41079b() {
        return !this.f42924b;
    }
}
