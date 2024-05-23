package p036bc;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p008a2.AbstractC0066f0;
import p008a2.AbstractC0073j;
import p008a2.AbstractC0074k;
import p008a2.AbstractC0086w;
import p008a2.C0089z;
import p046c2.AbstractC3205a;
import p046c2.AbstractC3206b;
import p119e2.InterfaceC18186k;

/* renamed from: bc.b */
/* loaded from: classes.dex */
public final class C2715b implements InterfaceC2714a {

    /* renamed from: a */
    private final AbstractC0086w f10793a;

    /* renamed from: b */
    private final AbstractC0074k f10794b;

    /* renamed from: c */
    private final AbstractC0073j f10795c;

    /* renamed from: d */
    private final AbstractC0073j f10796d;

    /* renamed from: e */
    private final AbstractC0066f0 f10797e;

    /* renamed from: f */
    private final AbstractC0066f0 f10798f;

    /* renamed from: bc.b$a */
    /* loaded from: classes.dex */
    class a extends AbstractC0074k {
        a(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR ABORT INTO `events` (`actionId`,`eventTime`,`sessionId`,`id`,`source`,`screens`,`customData`,`extraData`) VALUES (?,?,?,nullif(?, 0),?,?,?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C2716c c2716c) {
            if (c2716c.m13218a() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c2716c.m13218a());
            }
            interfaceC18186k.mo220l0(2, c2716c.m13220c());
            interfaceC18186k.mo220l0(3, c2716c.m13224g());
            interfaceC18186k.mo220l0(4, c2716c.m13222e());
            if (c2716c.m13225h() == null) {
                interfaceC18186k.mo222u0(5);
            } else {
                interfaceC18186k.mo219a0(5, c2716c.m13225h());
            }
            if (c2716c.m13223f() == null) {
                interfaceC18186k.mo222u0(6);
            } else {
                interfaceC18186k.mo219a0(6, c2716c.m13223f());
            }
            if (c2716c.m13219b() == null) {
                interfaceC18186k.mo222u0(7);
            } else {
                interfaceC18186k.mo219a0(7, c2716c.m13219b());
            }
            if (c2716c.m13221d() == null) {
                interfaceC18186k.mo222u0(8);
            } else {
                interfaceC18186k.mo219a0(8, c2716c.m13221d());
            }
        }
    }

    /* renamed from: bc.b$b */
    /* loaded from: classes.dex */
    class b extends AbstractC0073j {
        b(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM `events` WHERE `id` = ?";
        }

        @Override // p008a2.AbstractC0073j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo259i(InterfaceC18186k interfaceC18186k, C2716c c2716c) {
            interfaceC18186k.mo220l0(1, c2716c.m13222e());
        }
    }

    /* renamed from: bc.b$c */
    /* loaded from: classes.dex */
    class c extends AbstractC0073j {
        c(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE OR ABORT `events` SET `actionId` = ?,`eventTime` = ?,`sessionId` = ?,`id` = ?,`source` = ?,`screens` = ?,`customData` = ?,`extraData` = ? WHERE `id` = ?";
        }

        @Override // p008a2.AbstractC0073j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo259i(InterfaceC18186k interfaceC18186k, C2716c c2716c) {
            if (c2716c.m13218a() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c2716c.m13218a());
            }
            interfaceC18186k.mo220l0(2, c2716c.m13220c());
            interfaceC18186k.mo220l0(3, c2716c.m13224g());
            interfaceC18186k.mo220l0(4, c2716c.m13222e());
            if (c2716c.m13225h() == null) {
                interfaceC18186k.mo222u0(5);
            } else {
                interfaceC18186k.mo219a0(5, c2716c.m13225h());
            }
            if (c2716c.m13223f() == null) {
                interfaceC18186k.mo222u0(6);
            } else {
                interfaceC18186k.mo219a0(6, c2716c.m13223f());
            }
            if (c2716c.m13219b() == null) {
                interfaceC18186k.mo222u0(7);
            } else {
                interfaceC18186k.mo219a0(7, c2716c.m13219b());
            }
            if (c2716c.m13221d() == null) {
                interfaceC18186k.mo222u0(8);
            } else {
                interfaceC18186k.mo219a0(8, c2716c.m13221d());
            }
            interfaceC18186k.mo220l0(9, c2716c.m13222e());
        }
    }

    /* renamed from: bc.b$d */
    /* loaded from: classes.dex */
    class d extends AbstractC0066f0 {
        d(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM events";
        }
    }

    /* renamed from: bc.b$e */
    /* loaded from: classes.dex */
    class e extends AbstractC0066f0 {
        e(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM events WHERE cast(eventTime as number) < ?";
        }
    }

    public C2715b(AbstractC0086w abstractC0086w) {
        this.f10793a = abstractC0086w;
        this.f10794b = new a(abstractC0086w);
        this.f10795c = new b(abstractC0086w);
        this.f10796d = new c(abstractC0086w);
        this.f10797e = new d(abstractC0086w);
        this.f10798f = new e(abstractC0086w);
    }

    /* renamed from: i */
    public static List m13214i() {
        return Collections.emptyList();
    }

    @Override // p036bc.InterfaceC2714a
    /* renamed from: a */
    public void mo13206a() {
        this.f10793a.m341d();
        InterfaceC18186k m248b = this.f10797e.m248b();
        this.f10793a.m342e();
        try {
            m248b.mo223w();
            this.f10793a.m339E();
        } finally {
            this.f10793a.m347j();
            this.f10797e.m251h(m248b);
        }
    }

    @Override // p036bc.InterfaceC2714a
    /* renamed from: b */
    public long mo13207b() {
        long j11;
        C0089z m401c = C0089z.m401c("SELECT COUNT(*) FROM events", 0);
        this.f10793a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f10793a, m401c, false, null);
        try {
            if (m16306c.moveToFirst()) {
                j11 = m16306c.getLong(0);
            } else {
                j11 = 0;
            }
            return j11;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p036bc.InterfaceC2714a
    /* renamed from: c */
    public int mo13208c(List list) {
        this.f10793a.m341d();
        this.f10793a.m342e();
        try {
            int m261k = this.f10795c.m261k(list);
            this.f10793a.m339E();
            return m261k;
        } finally {
            this.f10793a.m347j();
        }
    }

    @Override // p036bc.InterfaceC2714a
    /* renamed from: d */
    public List mo13209d() {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        C0089z m401c = C0089z.m401c("SELECT * FROM events", 0);
        this.f10793a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f10793a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "actionId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "eventTime");
            int m16303e3 = AbstractC3205a.m16303e(m16306c, "sessionId");
            int m16303e4 = AbstractC3205a.m16303e(m16306c, "id");
            int m16303e5 = AbstractC3205a.m16303e(m16306c, "source");
            int m16303e6 = AbstractC3205a.m16303e(m16306c, "screens");
            int m16303e7 = AbstractC3205a.m16303e(m16306c, "customData");
            int m16303e8 = AbstractC3205a.m16303e(m16306c, "extraData");
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                C2716c c2716c = new C2716c(string, m16306c.getLong(m16303e2), m16306c.getLong(m16303e3));
                c2716c.m13228k(m16306c.getLong(m16303e4));
                if (m16306c.isNull(m16303e5)) {
                    string2 = null;
                } else {
                    string2 = m16306c.getString(m16303e5);
                }
                c2716c.m13230m(string2);
                if (m16306c.isNull(m16303e6)) {
                    string3 = null;
                } else {
                    string3 = m16306c.getString(m16303e6);
                }
                c2716c.m13229l(string3);
                if (m16306c.isNull(m16303e7)) {
                    string4 = null;
                } else {
                    string4 = m16306c.getString(m16303e7);
                }
                c2716c.m13226i(string4);
                if (m16306c.isNull(m16303e8)) {
                    string5 = null;
                } else {
                    string5 = m16306c.getString(m16303e8);
                }
                c2716c.m13227j(string5);
                arrayList.add(c2716c);
            }
            return arrayList;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p036bc.InterfaceC2714a
    /* renamed from: e */
    public List mo13210e(long j11) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        C0089z m401c = C0089z.m401c("SELECT * FROM events ORDER BY id ASC LIMIT ?", 1);
        m401c.mo220l0(1, j11);
        this.f10793a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f10793a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "actionId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "eventTime");
            int m16303e3 = AbstractC3205a.m16303e(m16306c, "sessionId");
            int m16303e4 = AbstractC3205a.m16303e(m16306c, "id");
            int m16303e5 = AbstractC3205a.m16303e(m16306c, "source");
            int m16303e6 = AbstractC3205a.m16303e(m16306c, "screens");
            int m16303e7 = AbstractC3205a.m16303e(m16306c, "customData");
            int m16303e8 = AbstractC3205a.m16303e(m16306c, "extraData");
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                C2716c c2716c = new C2716c(string, m16306c.getLong(m16303e2), m16306c.getLong(m16303e3));
                c2716c.m13228k(m16306c.getLong(m16303e4));
                if (m16306c.isNull(m16303e5)) {
                    string2 = null;
                } else {
                    string2 = m16306c.getString(m16303e5);
                }
                c2716c.m13230m(string2);
                if (m16306c.isNull(m16303e6)) {
                    string3 = null;
                } else {
                    string3 = m16306c.getString(m16303e6);
                }
                c2716c.m13229l(string3);
                if (m16306c.isNull(m16303e7)) {
                    string4 = null;
                } else {
                    string4 = m16306c.getString(m16303e7);
                }
                c2716c.m13226i(string4);
                if (m16306c.isNull(m16303e8)) {
                    string5 = null;
                } else {
                    string5 = m16306c.getString(m16303e8);
                }
                c2716c.m13227j(string5);
                arrayList.add(c2716c);
            }
            return arrayList;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p036bc.InterfaceC2714a
    /* renamed from: f */
    public long mo13211f(C2716c c2716c) {
        this.f10793a.m341d();
        this.f10793a.m342e();
        try {
            long m264k = this.f10794b.m264k(c2716c);
            this.f10793a.m339E();
            return m264k;
        } finally {
            this.f10793a.m347j();
        }
    }

    @Override // p036bc.InterfaceC2714a
    /* renamed from: g */
    public int mo13212g(long j11) {
        this.f10793a.m341d();
        InterfaceC18186k m248b = this.f10798f.m248b();
        m248b.mo220l0(1, j11);
        this.f10793a.m342e();
        try {
            int mo223w = m248b.mo223w();
            this.f10793a.m339E();
            return mo223w;
        } finally {
            this.f10793a.m347j();
            this.f10798f.m251h(m248b);
        }
    }

    @Override // p036bc.InterfaceC2714a
    /* renamed from: h */
    public List mo13213h(long j11) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        C0089z m401c = C0089z.m401c("SELECT * FROM events LIMIT ?", 1);
        m401c.mo220l0(1, j11);
        this.f10793a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f10793a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "actionId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "eventTime");
            int m16303e3 = AbstractC3205a.m16303e(m16306c, "sessionId");
            int m16303e4 = AbstractC3205a.m16303e(m16306c, "id");
            int m16303e5 = AbstractC3205a.m16303e(m16306c, "source");
            int m16303e6 = AbstractC3205a.m16303e(m16306c, "screens");
            int m16303e7 = AbstractC3205a.m16303e(m16306c, "customData");
            int m16303e8 = AbstractC3205a.m16303e(m16306c, "extraData");
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                C2716c c2716c = new C2716c(string, m16306c.getLong(m16303e2), m16306c.getLong(m16303e3));
                c2716c.m13228k(m16306c.getLong(m16303e4));
                if (m16306c.isNull(m16303e5)) {
                    string2 = null;
                } else {
                    string2 = m16306c.getString(m16303e5);
                }
                c2716c.m13230m(string2);
                if (m16306c.isNull(m16303e6)) {
                    string3 = null;
                } else {
                    string3 = m16306c.getString(m16303e6);
                }
                c2716c.m13229l(string3);
                if (m16306c.isNull(m16303e7)) {
                    string4 = null;
                } else {
                    string4 = m16306c.getString(m16303e7);
                }
                c2716c.m13226i(string4);
                if (m16306c.isNull(m16303e8)) {
                    string5 = null;
                } else {
                    string5 = m16306c.getString(m16303e8);
                }
                c2716c.m13227j(string5);
                arrayList.add(c2716c);
            }
            return arrayList;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }
}
