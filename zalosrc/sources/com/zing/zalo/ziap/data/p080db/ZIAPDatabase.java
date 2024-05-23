package com.zing.zalo.ziap.data.p080db;

import aj0.AbstractC0878a;
import aj0.C0881d;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import lj0.C22501b;
import p008a2.AbstractC0086w;
import p008a2.C0085v;

/* loaded from: classes7.dex */
public abstract class ZIAPDatabase extends AbstractC0086w {
    public static final C17089a Companion = new C17089a(null);

    /* renamed from: o */
    private static volatile ZIAPDatabase f87436o;

    /* renamed from: com.zing.zalo.ziap.data.db.ZIAPDatabase$a */
    /* loaded from: classes7.dex */
    public static final class C17089a {
        private C17089a() {
        }

        public /* synthetic */ C17089a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ZIAPDatabase m91401a(Context context) {
            AbstractC19074t.m100208f(context, "context");
            ZIAPDatabase zIAPDatabase = ZIAPDatabase.f87436o;
            if (zIAPDatabase == null) {
                synchronized (this) {
                    AbstractC0086w m365d = C0085v.m327a(context.getApplicationContext(), ZIAPDatabase.class, "ziap.db").m365d();
                    ZIAPDatabase.f87436o = (ZIAPDatabase) m365d;
                    AbstractC19074t.m100207e(m365d, "databaseBuilder(\n       … it\n                    }");
                    zIAPDatabase = (ZIAPDatabase) m365d;
                }
            }
            return zIAPDatabase;
        }
    }

    /* renamed from: I */
    public abstract AbstractC0878a mo91399I();

    /* renamed from: J */
    public final void m91400J(SQLiteDatabase sQLiteDatabase, C22501b c22501b) {
        AbstractC19074t.m100208f(sQLiteDatabase, "db");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        new C0881d(c22501b).m2710a(mo91399I(), sQLiteDatabase);
    }
}
