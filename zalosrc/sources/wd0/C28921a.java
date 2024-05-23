package wd0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import p185gc.AbstractC19383g;
import p263jc.C21216s;

/* renamed from: wd0.a */
/* loaded from: classes4.dex */
public final class C28921a extends AbstractC19383g {
    public static final a Companion = new a(null);

    /* renamed from: wd0.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wd0.a$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f133880a;

        public b(String str) {
            AbstractC19074t.m100208f(str, "ownerId");
            this.f133880a = str;
        }

        /* renamed from: a */
        public final String m144486a() {
            return this.f133880a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        try {
            ((C21216s) C21216s.Companion.m122672a()).m109887m1(bVar.m144486a());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
