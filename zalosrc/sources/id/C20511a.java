package id;

import com.zing.zalo.p062db.C7959d;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import p185gc.AbstractC19381e;
import vi.C28255a;
import vi.C28262h;

/* renamed from: id.a */
/* loaded from: classes3.dex */
public final class C20511a extends AbstractC19381e {

    /* renamed from: id.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final List f100783a;

        /* renamed from: b */
        private final List f100784b;

        public a(List list, List list2) {
            AbstractC19074t.m100208f(list, "listFileMDSingle");
            AbstractC19074t.m100208f(list2, "listFileMDInZip");
            this.f100783a = list;
            this.f100784b = list2;
        }

        /* renamed from: a */
        public final List m106560a() {
            return this.f100784b;
        }

        /* renamed from: b */
        public final List m106561b() {
            return this.f100783a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19381e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a mo93498b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            for (C28255a c28255a : C7959d.Companion.m41850e().m41796j1()) {
                if (c28255a instanceof C28262h) {
                    arrayList2.add(c28255a);
                } else {
                    arrayList.add(c28255a);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return new a(arrayList, arrayList2);
    }
}
