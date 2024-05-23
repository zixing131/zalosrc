package id;

import com.zing.zalo.p062db.C7959d;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p185gc.AbstractC19384h;
import vi.C28260f;
import vi.C28262h;

/* renamed from: id.d */
/* loaded from: classes3.dex */
public final class C20514d extends AbstractC19384h {

    /* renamed from: id.d$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final List f100793a;

        public a(List list) {
            AbstractC19074t.m100208f(list, "listFileMDPhotoInZip");
            this.f100793a = list;
        }

        /* renamed from: a */
        public final List m106576a() {
            return this.f100793a;
        }
    }

    /* renamed from: id.d$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final Map f100794a;

        public b(Map map) {
            AbstractC19074t.m100208f(map, "mapFileMDZip");
            this.f100794a = map;
        }

        /* renamed from: a */
        public final Map m106577a() {
            return this.f100794a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b mo13388b(a aVar) {
        Map m142309k;
        AbstractC19074t.m100208f(aVar, "params");
        HashMap hashMap = new HashMap();
        try {
            hashMap.putAll(C7959d.Companion.m41850e().m41800k1());
            if (!hashMap.isEmpty()) {
                for (C28262h c28262h : aVar.m106576a()) {
                    C28260f c28260f = (C28260f) hashMap.get(c28262h.m142327E());
                    if (c28260f != null && (m142309k = c28260f.m142309k()) != null) {
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return new b(hashMap);
    }
}
