package be0;

import be0.C2780e;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import p185gc.AbstractC19382f;
import p348mi.AbstractC23306f;
import pm0.C24848g0;

/* renamed from: be0.h */
/* loaded from: classes4.dex */
public final class C2783h extends AbstractC19382f {

    /* renamed from: be0.h$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C17945a0 f11069a;

        public a(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "message");
            this.f11069a = c17945a0;
        }

        /* renamed from: a */
        public final C17945a0 m13408a() {
            return this.f11069a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f11069a, ((a) obj).f11069a);
        }

        public int hashCode() {
            return this.f11069a.hashCode();
        }

        public String toString() {
            return "Params(message=" + this.f11069a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19382f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo13397b(a aVar, Continuation continuation) {
        ArrayList m13396a;
        if (aVar.m13408a().m94847A6()) {
            C2780e m120649c0 = AbstractC23306f.m120649c0();
            String m94853B3 = aVar.m13408a().m94853B3();
            AbstractC19074t.m100207e(m94853B3, "getGroupId(...)");
            MessageId m95029V3 = aVar.m13408a().m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            C2780e.b bVar = (C2780e.b) m120649c0.m101509a(new C2780e.a(m94853B3, m95029V3));
            if (bVar != null && (m13396a = bVar.m13396a()) != null) {
                aVar.m13408a().m94866Ca(m13396a);
            }
        }
        return C24848g0.f119245a;
    }
}
