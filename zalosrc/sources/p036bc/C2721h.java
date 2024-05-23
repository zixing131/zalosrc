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

/* renamed from: bc.h */
/* loaded from: classes.dex */
public final class C2721h implements InterfaceC2720g {

    /* renamed from: a */
    private final AbstractC0086w f10831a;

    /* renamed from: b */
    private final AbstractC0074k f10832b;

    /* renamed from: c */
    private final AbstractC0073j f10833c;

    /* renamed from: d */
    private final AbstractC0073j f10834d;

    /* renamed from: e */
    private final AbstractC0066f0 f10835e;

    /* renamed from: f */
    private final AbstractC0066f0 f10836f;

    /* renamed from: bc.h$a */
    /* loaded from: classes3.dex */
    class a extends AbstractC0074k {
        a(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR ABORT INTO `sessions` (`startTime`,`startSource`,`id`,`endTime`,`endReason`,`extraData`) VALUES (?,?,nullif(?, 0),?,?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C2722i c2722i) {
            interfaceC18186k.mo220l0(1, c2722i.m13270f());
            interfaceC18186k.mo220l0(2, c2722i.m13269e());
            interfaceC18186k.mo220l0(3, c2722i.m13268d());
            interfaceC18186k.mo220l0(4, c2722i.m13266b());
            interfaceC18186k.mo220l0(5, c2722i.m13265a());
            if (c2722i.m13267c() == null) {
                interfaceC18186k.mo222u0(6);
            } else {
                interfaceC18186k.mo219a0(6, c2722i.m13267c());
            }
        }
    }

    /* renamed from: bc.h$b */
    /* loaded from: classes3.dex */
    class b extends AbstractC0073j {
        b(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM `sessions` WHERE `id` = ?";
        }

        @Override // p008a2.AbstractC0073j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo259i(InterfaceC18186k interfaceC18186k, C2722i c2722i) {
            interfaceC18186k.mo220l0(1, c2722i.m13268d());
        }
    }

    /* renamed from: bc.h$c */
    /* loaded from: classes3.dex */
    class c extends AbstractC0073j {
        c(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE OR ABORT `sessions` SET `startTime` = ?,`startSource` = ?,`id` = ?,`endTime` = ?,`endReason` = ?,`extraData` = ? WHERE `id` = ?";
        }

        @Override // p008a2.AbstractC0073j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo259i(InterfaceC18186k interfaceC18186k, C2722i c2722i) {
            interfaceC18186k.mo220l0(1, c2722i.m13270f());
            interfaceC18186k.mo220l0(2, c2722i.m13269e());
            interfaceC18186k.mo220l0(3, c2722i.m13268d());
            interfaceC18186k.mo220l0(4, c2722i.m13266b());
            interfaceC18186k.mo220l0(5, c2722i.m13265a());
            if (c2722i.m13267c() == null) {
                interfaceC18186k.mo222u0(6);
            } else {
                interfaceC18186k.mo219a0(6, c2722i.m13267c());
            }
            interfaceC18186k.mo220l0(7, c2722i.m13268d());
        }
    }

    /* renamed from: bc.h$d */
    /* loaded from: classes3.dex */
    class d extends AbstractC0066f0 {
        d(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM sessions";
        }
    }

    /* renamed from: bc.h$e */
    /* loaded from: classes3.dex */
    class e extends AbstractC0066f0 {
        e(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM sessions WHERE cast(endTime as number) < ? and cast(endTime as number) != 0 and id != ?";
        }
    }

    public C2721h(AbstractC0086w abstractC0086w) {
        this.f10831a = abstractC0086w;
        this.f10832b = new a(abstractC0086w);
        this.f10833c = new b(abstractC0086w);
        this.f10834d = new c(abstractC0086w);
        this.f10835e = new d(abstractC0086w);
        this.f10836f = new e(abstractC0086w);
    }

    /* renamed from: i */
    public static List m13261i() {
        return Collections.emptyList();
    }

    @Override // p036bc.InterfaceC2720g
    /* renamed from: a */
    public void mo13253a() {
        this.f10831a.m341d();
        InterfaceC18186k m248b = this.f10835e.m248b();
        this.f10831a.m342e();
        try {
            m248b.mo223w();
            this.f10831a.m339E();
        } finally {
            this.f10831a.m347j();
            this.f10835e.m251h(m248b);
        }
    }

    @Override // p036bc.InterfaceC2720g
    /* renamed from: b */
    public long mo13254b() {
        long j11;
        C0089z m401c = C0089z.m401c("SELECT COUNT(*) FROM sessions", 0);
        this.f10831a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f10831a, m401c, false, null);
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

    @Override // p036bc.InterfaceC2720g
    /* renamed from: c */
    public int mo13255c(List list) {
        this.f10831a.m341d();
        this.f10831a.m342e();
        try {
            int m261k = this.f10833c.m261k(list);
            this.f10831a.m339E();
            return m261k;
        } finally {
            this.f10831a.m347j();
        }
    }

    @Override // p036bc.InterfaceC2720g
    /* renamed from: d */
    public List mo13256d() {
        String string;
        C0089z m401c = C0089z.m401c("SELECT * FROM sessions", 0);
        this.f10831a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f10831a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "startTime");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "startSource");
            int m16303e3 = AbstractC3205a.m16303e(m16306c, "id");
            int m16303e4 = AbstractC3205a.m16303e(m16306c, "endTime");
            int m16303e5 = AbstractC3205a.m16303e(m16306c, "endReason");
            int m16303e6 = AbstractC3205a.m16303e(m16306c, "extraData");
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                C2722i c2722i = new C2722i(m16306c.getLong(m16303e), m16306c.getInt(m16303e2));
                c2722i.m13274j(m16306c.getLong(m16303e3));
                c2722i.m13272h(m16306c.getLong(m16303e4));
                c2722i.m13271g(m16306c.getInt(m16303e5));
                if (m16306c.isNull(m16303e6)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e6);
                }
                c2722i.m13273i(string);
                arrayList.add(c2722i);
            }
            return arrayList;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p036bc.InterfaceC2720g
    /* renamed from: e */
    public int mo13257e(C2722i c2722i) {
        this.f10831a.m341d();
        this.f10831a.m342e();
        try {
            int m260j = this.f10834d.m260j(c2722i);
            this.f10831a.m339E();
            return m260j;
        } finally {
            this.f10831a.m347j();
        }
    }

    @Override // p036bc.InterfaceC2720g
    /* renamed from: f */
    public int mo13258f(long j11, long j12) {
        this.f10831a.m341d();
        InterfaceC18186k m248b = this.f10836f.m248b();
        m248b.mo220l0(1, j11);
        m248b.mo220l0(2, j12);
        this.f10831a.m342e();
        try {
            int mo223w = m248b.mo223w();
            this.f10831a.m339E();
            return mo223w;
        } finally {
            this.f10831a.m347j();
            this.f10836f.m251h(m248b);
        }
    }

    @Override // p036bc.InterfaceC2720g
    /* renamed from: g */
    public List mo13259g(long j11, long j12) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT * FROM sessions WHERE id != ? LIMIT ?", 2);
        m401c.mo220l0(1, j12);
        m401c.mo220l0(2, j11);
        this.f10831a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f10831a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "startTime");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "startSource");
            int m16303e3 = AbstractC3205a.m16303e(m16306c, "id");
            int m16303e4 = AbstractC3205a.m16303e(m16306c, "endTime");
            int m16303e5 = AbstractC3205a.m16303e(m16306c, "endReason");
            int m16303e6 = AbstractC3205a.m16303e(m16306c, "extraData");
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                C2722i c2722i = new C2722i(m16306c.getLong(m16303e), m16306c.getInt(m16303e2));
                c2722i.m13274j(m16306c.getLong(m16303e3));
                c2722i.m13272h(m16306c.getLong(m16303e4));
                c2722i.m13271g(m16306c.getInt(m16303e5));
                if (m16306c.isNull(m16303e6)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e6);
                }
                c2722i.m13273i(string);
                arrayList.add(c2722i);
            }
            return arrayList;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p036bc.InterfaceC2720g
    /* renamed from: h */
    public long mo13260h(C2722i c2722i) {
        this.f10831a.m341d();
        this.f10831a.m342e();
        try {
            long m264k = this.f10832b.m264k(c2722i);
            this.f10831a.m339E();
            return m264k;
        } finally {
            this.f10831a.m347j();
        }
    }
}
