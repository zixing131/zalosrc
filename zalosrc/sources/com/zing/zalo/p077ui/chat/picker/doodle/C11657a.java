package com.zing.zalo.p077ui.chat.picker.doodle;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.chat.picker.doodle.a */
/* loaded from: classes5.dex */
public final class C11657a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f60602a;

    /* renamed from: b */
    private final String f60603b;

    /* renamed from: c */
    private final String f60604c;

    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C11657a m64964a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("EXTRA_BG_PATH", "");
            String string2 = bundle.getString("STR_SOURCE_START_VIEW", "");
            String string3 = bundle.getString("STR_LOG_CHAT_TYPE", "0");
            AbstractC19074t.m100205c(string);
            AbstractC19074t.m100205c(string2);
            AbstractC19074t.m100205c(string3);
            return new C11657a(string, string2, string3);
        }
    }

    public C11657a(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "bgPath");
        AbstractC19074t.m100208f(str2, "sourceStartView");
        AbstractC19074t.m100208f(str3, "logChatType");
        this.f60602a = str;
        this.f60603b = str2;
        this.f60604c = str3;
    }

    /* renamed from: a */
    public final String m64961a() {
        return this.f60602a;
    }

    /* renamed from: b */
    public final String m64962b() {
        return this.f60604c;
    }

    /* renamed from: c */
    public final String m64963c() {
        return this.f60603b;
    }
}
