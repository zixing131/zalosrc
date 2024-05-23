package com.zing.zalo.shortvideo.data.p071db;

import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p008a2.AbstractC0086w;
import p008a2.C0085v;
import z00.InterfaceC31140a;
import z00.InterfaceC31142c;
import z00.InterfaceC31144e;
import z00.InterfaceC31146g;

/* loaded from: classes5.dex */
public abstract class ZchDataBase extends AbstractC0086w {
    public static final C9366a Companion = new C9366a(null);

    /* renamed from: o */
    private static final String f49605o = "zch_database";

    /* renamed from: p */
    private static volatile ZchDataBase f49606p;

    /* renamed from: com.zing.zalo.shortvideo.data.db.ZchDataBase$a */
    /* loaded from: classes5.dex */
    public static final class C9366a {
        private C9366a() {
        }

        public /* synthetic */ C9366a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ZchDataBase m50521a() {
            ZchDataBase zchDataBase = ZchDataBase.f49606p;
            if (zchDataBase == null) {
                synchronized (this) {
                    AbstractC0086w m365d = C0085v.m327a(CoreUtility.getAppContext().getApplicationContext(), ZchDataBase.class, ZchDataBase.f49605o).m365d();
                    AbstractC19074t.m100207e(m365d, "build(...)");
                    zchDataBase = (ZchDataBase) m365d;
                    ZchDataBase.f49606p = zchDataBase;
                }
            }
            return zchDataBase;
        }
    }

    /* renamed from: J */
    public abstract InterfaceC31140a mo50517J();

    /* renamed from: K */
    public abstract InterfaceC31142c mo50518K();

    /* renamed from: L */
    public abstract InterfaceC31144e mo50519L();

    /* renamed from: M */
    public abstract InterfaceC31146g mo50520M();
}
