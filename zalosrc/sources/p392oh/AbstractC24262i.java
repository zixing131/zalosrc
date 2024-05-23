package p392oh;

import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gm.C19500k;
import p461qu.AbstractC25495a;
import ph.C24753f;

/* renamed from: oh.i */
/* loaded from: classes3.dex */
public abstract class AbstractC24262i {
    public static final a Companion = new a(null);

    /* renamed from: oh.i$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C19500k m126659a(MessageId messageId, C24753f c24753f) {
            AbstractC19074t.m100208f(messageId, "messageId");
            AbstractC19074t.m100208f(c24753f, "reactionMsgType");
            C19500k c19500k = new C19500k();
            c19500k.f96820b = messageId.m41045i();
            c19500k.f96819a = messageId.m41047k();
            c19500k.f96821c = messageId.m41051o();
            c19500k.f96822d = AbstractC25495a.m132090o(messageId.m41048l());
            c19500k.f96823e = AbstractC25495a.m132079d(messageId.m41048l()) ? (byte) 1 : (byte) 0;
            c19500k.f96824f = c24753f.m128601n();
            c19500k.f96825g = c24753f.m128595h();
            c19500k.f96826h = c24753f.m128594g();
            c19500k.f96827i = c24753f.m128598k();
            return c19500k;
        }

        /* renamed from: b */
        public final C24753f m126660b(C19500k c19500k) {
            AbstractC19074t.m100208f(c19500k, "reactionItem");
            C24753f.b bVar = C24753f.Companion;
            String str = c19500k.f96825g;
            AbstractC19074t.m100207e(str, "icon");
            int m128620g = bVar.m128620g(str);
            String str2 = c19500k.f96825g;
            AbstractC19074t.m100207e(str2, "icon");
            return new C24753f(m128620g, str2, c19500k.f96824f, c19500k.f96826h, c19500k.f96827i);
        }
    }
}
