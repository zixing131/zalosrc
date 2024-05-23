package com.zing.zalo.analytics.p059db;

import android.content.Context;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import p008a2.AbstractC0086w;
import p008a2.C0085v;
import p036bc.InterfaceC2714a;
import p036bc.InterfaceC2717d;
import p036bc.InterfaceC2720g;
import p036bc.InterfaceC2723j;
import p119e2.InterfaceC18182g;

/* loaded from: classes.dex */
public abstract class AnalyticsRoomDatabase extends AbstractC0086w {
    public static final C7304a Companion = new C7304a(null);

    /* renamed from: o */
    private static volatile AnalyticsRoomDatabase f40025o;

    /* renamed from: com.zing.zalo.analytics.db.AnalyticsRoomDatabase$a */
    /* loaded from: classes.dex */
    public static final class C7304a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.zing.zalo.analytics.db.AnalyticsRoomDatabase$a$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC0086w.b {
            @Override // p008a2.AbstractC0086w.b
            /* renamed from: a */
            public void mo369a(InterfaceC18182g interfaceC18182g) {
                AbstractC19074t.m100208f(interfaceC18182g, "db");
                super.mo369a(interfaceC18182g);
                AbstractC20110a.m104535d("onCreate", new Object[0]);
            }
        }

        private C7304a() {
        }

        public /* synthetic */ C7304a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final AnalyticsRoomDatabase m37245a(Context context) {
            AbstractC19074t.m100208f(context, "context");
            AnalyticsRoomDatabase analyticsRoomDatabase = AnalyticsRoomDatabase.f40025o;
            if (analyticsRoomDatabase == null) {
                synchronized (this) {
                    AbstractC0086w m365d = C0085v.m327a(context.getApplicationContext(), AnalyticsRoomDatabase.class, "analytics.db").m366e().m362a(new a()).m365d();
                    AbstractC19074t.m100207e(m365d, "databaseBuilder(\n       …                 .build()");
                    analyticsRoomDatabase = (AnalyticsRoomDatabase) m365d;
                    AnalyticsRoomDatabase.f40025o = analyticsRoomDatabase;
                }
            }
            return analyticsRoomDatabase;
        }
    }

    /* renamed from: I */
    public abstract InterfaceC2714a mo37241I();

    /* renamed from: J */
    public abstract InterfaceC2717d mo37242J();

    /* renamed from: K */
    public abstract InterfaceC2720g mo37243K();

    /* renamed from: L */
    public abstract InterfaceC2723j mo37244L();
}
