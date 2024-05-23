package jn0;

import fn0.AbstractC19074t;
import java.util.Random;

/* renamed from: jn0.b */
/* loaded from: classes.dex */
public final class C21316b extends AbstractC21315a {

    /* renamed from: r */
    private final a f103809r = new a();

    /* renamed from: jn0.b$a */
    /* loaded from: classes.dex */
    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // jn0.AbstractC21315a
    /* renamed from: j */
    public Random mo110375j() {
        Object obj = this.f103809r.get();
        AbstractC19074t.m100207e(obj, "get(...)");
        return (Random) obj;
    }
}
