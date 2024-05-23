package be0;

import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import mh.AbstractC23295a;
import mh.C23298d;
import p185gc.AbstractC19384h;
import p716zh.C32033n5;
import vg.C28081h4;

/* renamed from: be0.e */
/* loaded from: classes4.dex */
public final class C2780e extends AbstractC19384h {

    /* renamed from: a */
    private final C23298d f11041a;

    /* renamed from: b */
    private final C28081h4 f11042b;

    /* renamed from: be0.e$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f11043a;

        /* renamed from: b */
        private final MessageId f11044b;

        public a(String str, MessageId messageId) {
            AbstractC19074t.m100208f(str, "groupId");
            AbstractC19074t.m100208f(messageId, "messageId");
            this.f11043a = str;
            this.f11044b = messageId;
        }

        /* renamed from: a */
        public final String m13394a() {
            return this.f11043a;
        }

        /* renamed from: b */
        public final MessageId m13395b() {
            return this.f11044b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f11043a, aVar.f11043a) && AbstractC19074t.m100204b(this.f11044b, aVar.f11044b);
        }

        public int hashCode() {
            return (this.f11043a.hashCode() * 31) + this.f11044b.hashCode();
        }

        public String toString() {
            return "Params(groupId=" + this.f11043a + ", messageId=" + this.f11044b + ")";
        }
    }

    /* renamed from: be0.e$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final ArrayList f11045a;

        public b(ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "listSeenUid");
            this.f11045a = arrayList;
        }

        /* renamed from: a */
        public final ArrayList m13396a() {
            return this.f11045a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f11045a, ((b) obj).f11045a);
        }

        public int hashCode() {
            return this.f11045a.hashCode();
        }

        public String toString() {
            return "Result(listSeenUid=" + this.f11045a + ")";
        }
    }

    public C2780e(C23298d c23298d, C28081h4 c28081h4) {
        AbstractC19074t.m100208f(c23298d, "statusMessageRepo");
        AbstractC19074t.m100208f(c28081h4, "oldGroupDeliveredSeenManager");
        this.f11041a = c23298d;
        this.f11042b = c28081h4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b mo13388b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        if (AbstractC23295a.m120435b()) {
            return new b(this.f11041a.m120478l(aVar.m13394a(), aVar.m13395b()));
        }
        ArrayList arrayList = new ArrayList();
        C32033n5 m141544e = this.f11042b.m141544e(aVar.m13395b().m41045i());
        if (m141544e != null) {
            arrayList.addAll(m141544e.f147499c);
        }
        return new b(arrayList);
    }
}
