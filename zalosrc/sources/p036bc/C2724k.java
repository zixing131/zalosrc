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

/* renamed from: bc.k */
/* loaded from: classes.dex */
public final class C2724k implements InterfaceC2723j {

    /* renamed from: a */
    private final AbstractC0086w f10848a;

    /* renamed from: b */
    private final AbstractC0074k f10849b;

    /* renamed from: c */
    private final AbstractC0073j f10850c;

    /* renamed from: d */
    private final AbstractC0073j f10851d;

    /* renamed from: e */
    private final AbstractC0066f0 f10852e;

    /* renamed from: f */
    private final AbstractC0066f0 f10853f;

    /* renamed from: bc.k$a */
    /* loaded from: classes3.dex */
    class a extends AbstractC0074k {
        a(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR ABORT INTO `views` (`name`,`actionTime`,`screenName`,`sessionId`,`id`,`actionType`,`actionData`,`extraData`) VALUES (?,?,?,?,nullif(?, 0),?,?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C2725l c2725l) {
            if (c2725l.m13288f() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c2725l.m13288f());
            }
            interfaceC18186k.mo220l0(2, c2725l.m13284b());
            if (c2725l.m13289g() == null) {
                interfaceC18186k.mo222u0(3);
            } else {
                interfaceC18186k.mo219a0(3, c2725l.m13289g());
            }
            interfaceC18186k.mo220l0(4, c2725l.m13290h());
            interfaceC18186k.mo220l0(5, c2725l.m13287e());
            interfaceC18186k.mo220l0(6, c2725l.m13285c());
            if (c2725l.m13283a() == null) {
                interfaceC18186k.mo222u0(7);
            } else {
                interfaceC18186k.mo219a0(7, c2725l.m13283a());
            }
            if (c2725l.m13286d() == null) {
                interfaceC18186k.mo222u0(8);
            } else {
                interfaceC18186k.mo219a0(8, c2725l.m13286d());
            }
        }
    }

    /* renamed from: bc.k$b */
    /* loaded from: classes3.dex */
    class b extends AbstractC0073j {
        b(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM `views` WHERE `id` = ?";
        }

        @Override // p008a2.AbstractC0073j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo259i(InterfaceC18186k interfaceC18186k, C2725l c2725l) {
            interfaceC18186k.mo220l0(1, c2725l.m13287e());
        }
    }

    /* renamed from: bc.k$c */
    /* loaded from: classes3.dex */
    class c extends AbstractC0073j {
        c(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE OR ABORT `views` SET `name` = ?,`actionTime` = ?,`screenName` = ?,`sessionId` = ?,`id` = ?,`actionType` = ?,`actionData` = ?,`extraData` = ? WHERE `id` = ?";
        }

        @Override // p008a2.AbstractC0073j
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo259i(InterfaceC18186k interfaceC18186k, C2725l c2725l) {
            if (c2725l.m13288f() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c2725l.m13288f());
            }
            interfaceC18186k.mo220l0(2, c2725l.m13284b());
            if (c2725l.m13289g() == null) {
                interfaceC18186k.mo222u0(3);
            } else {
                interfaceC18186k.mo219a0(3, c2725l.m13289g());
            }
            interfaceC18186k.mo220l0(4, c2725l.m13290h());
            interfaceC18186k.mo220l0(5, c2725l.m13287e());
            interfaceC18186k.mo220l0(6, c2725l.m13285c());
            if (c2725l.m13283a() == null) {
                interfaceC18186k.mo222u0(7);
            } else {
                interfaceC18186k.mo219a0(7, c2725l.m13283a());
            }
            if (c2725l.m13286d() == null) {
                interfaceC18186k.mo222u0(8);
            } else {
                interfaceC18186k.mo219a0(8, c2725l.m13286d());
            }
            interfaceC18186k.mo220l0(9, c2725l.m13287e());
        }
    }

    /* renamed from: bc.k$d */
    /* loaded from: classes3.dex */
    class d extends AbstractC0066f0 {
        d(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM views";
        }
    }

    /* renamed from: bc.k$e */
    /* loaded from: classes3.dex */
    class e extends AbstractC0066f0 {
        e(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM views WHERE sessionId=?";
        }
    }

    public C2724k(AbstractC0086w abstractC0086w) {
        this.f10848a = abstractC0086w;
        this.f10849b = new a(abstractC0086w);
        this.f10850c = new b(abstractC0086w);
        this.f10851d = new c(abstractC0086w);
        this.f10852e = new d(abstractC0086w);
        this.f10853f = new e(abstractC0086w);
    }

    /* renamed from: e */
    public static List m13279e() {
        return Collections.emptyList();
    }

    @Override // p036bc.InterfaceC2723j
    /* renamed from: a */
    public void mo13275a() {
        this.f10848a.m341d();
        InterfaceC18186k m248b = this.f10852e.m248b();
        this.f10848a.m342e();
        try {
            m248b.mo223w();
            this.f10848a.m339E();
        } finally {
            this.f10848a.m347j();
            this.f10852e.m251h(m248b);
        }
    }

    @Override // p036bc.InterfaceC2723j
    /* renamed from: b */
    public List mo13276b(long j11) {
        String string;
        String string2;
        String string3;
        String string4;
        C0089z m401c = C0089z.m401c("SELECT * FROM views WHERE sessionId=?", 1);
        m401c.mo220l0(1, j11);
        this.f10848a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f10848a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "name");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "actionTime");
            int m16303e3 = AbstractC3205a.m16303e(m16306c, "screenName");
            int m16303e4 = AbstractC3205a.m16303e(m16306c, "sessionId");
            int m16303e5 = AbstractC3205a.m16303e(m16306c, "id");
            int m16303e6 = AbstractC3205a.m16303e(m16306c, "actionType");
            int m16303e7 = AbstractC3205a.m16303e(m16306c, "actionData");
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
                C2725l c2725l = new C2725l(string, j12, string2, m16306c.getLong(m16303e4));
                c2725l.m13294l(m16306c.getLong(m16303e5));
                c2725l.m13292j(m16306c.getInt(m16303e6));
                if (m16306c.isNull(m16303e7)) {
                    string3 = null;
                } else {
                    string3 = m16306c.getString(m16303e7);
                }
                c2725l.m13291i(string3);
                if (m16306c.isNull(m16303e8)) {
                    string4 = null;
                } else {
                    string4 = m16306c.getString(m16303e8);
                }
                c2725l.m13293k(string4);
                arrayList.add(c2725l);
            }
            return arrayList;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p036bc.InterfaceC2723j
    /* renamed from: c */
    public void mo13277c(long j11) {
        this.f10848a.m341d();
        InterfaceC18186k m248b = this.f10853f.m248b();
        m248b.mo220l0(1, j11);
        this.f10848a.m342e();
        try {
            m248b.mo223w();
            this.f10848a.m339E();
        } finally {
            this.f10848a.m347j();
            this.f10853f.m251h(m248b);
        }
    }

    @Override // p036bc.InterfaceC2723j
    /* renamed from: d */
    public long mo13278d(C2725l c2725l) {
        this.f10848a.m341d();
        this.f10848a.m342e();
        try {
            long m264k = this.f10849b.m264k(c2725l);
            this.f10848a.m339E();
            return m264k;
        } finally {
            this.f10848a.m347j();
        }
    }
}
