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

/* renamed from: bc.e */
/* loaded from: classes.dex */
public final class C2718e implements InterfaceC2717d {

    /* renamed from: a */
    private final AbstractC0086w f10812a;

    /* renamed from: b */
    private final AbstractC0074k f10813b;

    /* renamed from: c */
    private final AbstractC0073j f10814c;

    /* renamed from: d */
    private final AbstractC0073j f10815d;

    /* renamed from: e */
    private final AbstractC0066f0 f10816e;

    /* renamed from: f */
    private final AbstractC0066f0 f10817f;

    /* renamed from: bc.e$a */
    /* loaded from: classes3.dex */
    class a extends AbstractC0074k {
        a(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR ABORT INTO `screens` (`screenId`,`startTime`,`startSource`,`sessionId`,`id`,`endTime`,`endReason`,`extraData`) VALUES (?,?,?,?,nullif(?, 0),?,?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C2719f c2719f) {
            if (c2719f.m13245e() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c2719f.m13245e());
            }
            interfaceC18186k.mo220l0(2, c2719f.m13248h());
            if (c2719f.m13247g() == null) {
                interfaceC18186k.mo222u0(3);
            } else {
                interfaceC18186k.mo219a0(3, c2719f.m13247g());
            }
            interfaceC18186k.mo220l0(4, c2719f.m13246f());
            interfaceC18186k.mo220l0(5, c2719f.m13244d());
            interfaceC18186k.mo220l0(6, c2719f.m13242b());
            interfaceC18186k.mo220l0(7, c2719f.m13241a());
            if (c2719f.m13243c() == null) {
                interfaceC18186k.mo222u0(8);
            } else {
                interfaceC18186k.mo219a0(8, c2719f.m13243c());
            }
        }
    }

    /* renamed from: bc.e$b */
    /* loaded from: classes3.dex */
    class b extends AbstractC0073j {
        b(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM `screens` WHERE `id` = ?";
        }

        @Override // p008a2.AbstractC0073j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo259i(InterfaceC18186k interfaceC18186k, C2719f c2719f) {
            interfaceC18186k.mo220l0(1, c2719f.m13244d());
        }
    }

    /* renamed from: bc.e$c */
    /* loaded from: classes3.dex */
    class c extends AbstractC0073j {
        c(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE OR ABORT `screens` SET `screenId` = ?,`startTime` = ?,`startSource` = ?,`sessionId` = ?,`id` = ?,`endTime` = ?,`endReason` = ?,`extraData` = ? WHERE `id` = ?";
        }

        @Override // p008a2.AbstractC0073j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo259i(InterfaceC18186k interfaceC18186k, C2719f c2719f) {
            if (c2719f.m13245e() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c2719f.m13245e());
            }
            interfaceC18186k.mo220l0(2, c2719f.m13248h());
            if (c2719f.m13247g() == null) {
                interfaceC18186k.mo222u0(3);
            } else {
                interfaceC18186k.mo219a0(3, c2719f.m13247g());
            }
            interfaceC18186k.mo220l0(4, c2719f.m13246f());
            interfaceC18186k.mo220l0(5, c2719f.m13244d());
            interfaceC18186k.mo220l0(6, c2719f.m13242b());
            interfaceC18186k.mo220l0(7, c2719f.m13241a());
            if (c2719f.m13243c() == null) {
                interfaceC18186k.mo222u0(8);
            } else {
                interfaceC18186k.mo219a0(8, c2719f.m13243c());
            }
            interfaceC18186k.mo220l0(9, c2719f.m13244d());
        }
    }

    /* renamed from: bc.e$d */
    /* loaded from: classes3.dex */
    class d extends AbstractC0066f0 {
        d(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM screens";
        }
    }

    /* renamed from: bc.e$e */
    /* loaded from: classes3.dex */
    class e extends AbstractC0066f0 {
        e(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM screens WHERE sessionId=?";
        }
    }

    public C2718e(AbstractC0086w abstractC0086w) {
        this.f10812a = abstractC0086w;
        this.f10813b = new a(abstractC0086w);
        this.f10814c = new b(abstractC0086w);
        this.f10815d = new c(abstractC0086w);
        this.f10816e = new d(abstractC0086w);
        this.f10817f = new e(abstractC0086w);
    }

    /* renamed from: g */
    public static List m13237g() {
        return Collections.emptyList();
    }

    @Override // p036bc.InterfaceC2717d
    /* renamed from: a */
    public void mo13231a() {
        this.f10812a.m341d();
        InterfaceC18186k m248b = this.f10816e.m248b();
        this.f10812a.m342e();
        try {
            m248b.mo223w();
            this.f10812a.m339E();
        } finally {
            this.f10812a.m347j();
            this.f10816e.m251h(m248b);
        }
    }

    @Override // p036bc.InterfaceC2717d
    /* renamed from: b */
    public void mo13232b(C2719f c2719f) {
        this.f10812a.m341d();
        this.f10812a.m342e();
        try {
            this.f10814c.m260j(c2719f);
            this.f10812a.m339E();
        } finally {
            this.f10812a.m347j();
        }
    }

    @Override // p036bc.InterfaceC2717d
    /* renamed from: c */
    public long mo13233c(C2719f c2719f) {
        this.f10812a.m341d();
        this.f10812a.m342e();
        try {
            long m264k = this.f10813b.m264k(c2719f);
            this.f10812a.m339E();
            return m264k;
        } finally {
            this.f10812a.m347j();
        }
    }

    @Override // p036bc.InterfaceC2717d
    /* renamed from: d */
    public void mo13234d(C2719f c2719f) {
        this.f10812a.m341d();
        this.f10812a.m342e();
        try {
            this.f10815d.m260j(c2719f);
            this.f10812a.m339E();
        } finally {
            this.f10812a.m347j();
        }
    }

    @Override // p036bc.InterfaceC2717d
    /* renamed from: e */
    public void mo13235e(long j11) {
        this.f10812a.m341d();
        InterfaceC18186k m248b = this.f10817f.m248b();
        m248b.mo220l0(1, j11);
        this.f10812a.m342e();
        try {
            m248b.mo223w();
            this.f10812a.m339E();
        } finally {
            this.f10812a.m347j();
            this.f10817f.m251h(m248b);
        }
    }

    @Override // p036bc.InterfaceC2717d
    /* renamed from: f */
    public List mo13236f(long j11) {
        String string;
        String string2;
        String string3;
        C0089z m401c = C0089z.m401c("SELECT * FROM screens WHERE sessionId=?", 1);
        m401c.mo220l0(1, j11);
        this.f10812a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f10812a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "screenId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "startTime");
            int m16303e3 = AbstractC3205a.m16303e(m16306c, "startSource");
            int m16303e4 = AbstractC3205a.m16303e(m16306c, "sessionId");
            int m16303e5 = AbstractC3205a.m16303e(m16306c, "id");
            int m16303e6 = AbstractC3205a.m16303e(m16306c, "endTime");
            int m16303e7 = AbstractC3205a.m16303e(m16306c, "endReason");
            int m16303e8 = AbstractC3205a.m16303e(m16306c, "extraData");
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                long j12 = m16306c.getLong(m16303e2);
                if (m16306c.isNull(m16303e3)) {
                    string2 = null;
                } else {
                    string2 = m16306c.getString(m16303e3);
                }
                C2719f c2719f = new C2719f(string, j12, string2, m16306c.getLong(m16303e4));
                c2719f.m13252l(m16306c.getLong(m16303e5));
                c2719f.m13250j(m16306c.getLong(m16303e6));
                c2719f.m13249i(m16306c.getInt(m16303e7));
                if (m16306c.isNull(m16303e8)) {
                    string3 = null;
                } else {
                    string3 = m16306c.getString(m16303e8);
                }
                c2719f.m13251k(string3);
                arrayList.add(c2719f);
            }
            return arrayList;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }
}
