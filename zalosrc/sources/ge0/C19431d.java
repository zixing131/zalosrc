package ge0;

import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.social.controls.LikeContactItem;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Iterator;
import p185gc.AbstractC19384h;

/* renamed from: ge0.d */
/* loaded from: classes4.dex */
public final class C19431d extends AbstractC19384h {

    /* renamed from: ge0.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final PrivacyInfo f96392a;

        /* renamed from: b */
        private final PrivacyInfo f96393b;

        public a(PrivacyInfo privacyInfo, PrivacyInfo privacyInfo2) {
            this.f96392a = privacyInfo;
            this.f96393b = privacyInfo2;
        }

        /* renamed from: a */
        public final PrivacyInfo m101582a() {
            return this.f96392a;
        }

        /* renamed from: b */
        public final PrivacyInfo m101583b() {
            return this.f96393b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f96392a, aVar.f96392a) && AbstractC19074t.m100204b(this.f96393b, aVar.f96393b);
        }

        public int hashCode() {
            PrivacyInfo privacyInfo = this.f96392a;
            int hashCode = (privacyInfo == null ? 0 : privacyInfo.hashCode()) * 31;
            PrivacyInfo privacyInfo2 = this.f96393b;
            return hashCode + (privacyInfo2 != null ? privacyInfo2.hashCode() : 0);
        }

        public String toString() {
            return "Params(initialSelectedPrivacy=" + this.f96392a + ", privacyInfo=" + this.f96393b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo13388b(a aVar) {
        boolean z11;
        AbstractC19074t.m100208f(aVar, "params");
        if (aVar.m101582a() != null && aVar.m101583b() != null) {
            z11 = true;
            if (aVar.m101583b().f45973p == aVar.m101582a().f45973p && (!aVar.m101583b().m45151w() || !aVar.m101582a().m45151w() || aVar.m101583b().f45974q.size() == aVar.m101582a().f45974q.size())) {
                HashMap hashMap = new HashMap();
                Iterator it = aVar.m101583b().f45974q.iterator();
                while (it.hasNext()) {
                    LikeContactItem likeContactItem = (LikeContactItem) it.next();
                    if (likeContactItem != null) {
                        String m56333d = likeContactItem.m56333d();
                        AbstractC19074t.m100207e(m56333d, "getUserId(...)");
                        String m56333d2 = likeContactItem.m56333d();
                        AbstractC19074t.m100207e(m56333d2, "getUserId(...)");
                        hashMap.put(m56333d, m56333d2);
                    }
                }
                Iterator it2 = aVar.m101582a().f45974q.iterator();
                while (it2.hasNext()) {
                    if (!hashMap.containsKey(((LikeContactItem) it2.next()).m56333d())) {
                        break;
                    }
                }
            }
            return Boolean.valueOf(z11);
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }
}
