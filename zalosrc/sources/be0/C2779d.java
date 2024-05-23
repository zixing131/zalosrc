package be0;

import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import mh.AbstractC23295a;
import mh.C23298d;
import p185gc.AbstractC19384h;
import p716zh.C32033n5;
import vg.C28081h4;

/* renamed from: be0.d */
/* loaded from: classes4.dex */
public final class C2779d extends AbstractC19384h {

    /* renamed from: a */
    private final C23298d f11036a;

    /* renamed from: b */
    private final C28081h4 f11037b;

    /* renamed from: be0.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f11038a;

        /* renamed from: b */
        private final MessageId f11039b;

        public a(String str, MessageId messageId) {
            AbstractC19074t.m100208f(str, "groupId");
            AbstractC19074t.m100208f(messageId, "messageId");
            this.f11038a = str;
            this.f11039b = messageId;
        }

        /* renamed from: a */
        public final String m13390a() {
            return this.f11038a;
        }

        /* renamed from: b */
        public final MessageId m13391b() {
            return this.f11039b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f11038a, aVar.f11038a) && AbstractC19074t.m100204b(this.f11039b, aVar.f11039b);
        }

        public int hashCode() {
            return (this.f11038a.hashCode() * 31) + this.f11039b.hashCode();
        }

        public String toString() {
            return "Params(groupId=" + this.f11038a + ", messageId=" + this.f11039b + ")";
        }
    }

    /* renamed from: be0.d$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final ArrayList f11040a;

        public b(ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "listDeliveredUid");
            this.f11040a = arrayList;
        }

        /* renamed from: a */
        public final ArrayList m13392a() {
            return this.f11040a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f11040a, ((b) obj).f11040a);
        }

        public int hashCode() {
            return this.f11040a.hashCode();
        }

        public String toString() {
            return "Result(listDeliveredUid=" + this.f11040a + ")";
        }
    }

    public C2779d(C23298d c23298d, C28081h4 c28081h4) {
        AbstractC19074t.m100208f(c23298d, "statusMessageRepo");
        AbstractC19074t.m100208f(c28081h4, "oldGroupDeliveredSeenManager");
        this.f11036a = c23298d;
        this.f11037b = c28081h4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b mo13388b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        if (AbstractC23295a.m120435b()) {
            return new b(this.f11036a.m120477k(aVar.m13390a(), aVar.m13391b()));
        }
        ArrayList arrayList = new ArrayList();
        C32033n5 m141544e = this.f11037b.m141544e(aVar.m13391b().m41045i());
        if (m141544e != null) {
            arrayList.addAll(m141544e.f147500d);
        }
        return new b(arrayList);
    }
}
