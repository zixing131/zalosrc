package z00;

import a10.C0036a;
import a10.C0037b;
import a10.C0052q;
import android.database.Cursor;
import java.util.Collections;
import java.util.List;
import p008a2.AbstractC0066f0;
import p008a2.AbstractC0074k;
import p008a2.AbstractC0086w;
import p008a2.C0089z;
import p046c2.AbstractC3205a;
import p046c2.AbstractC3206b;
import p119e2.InterfaceC18186k;
import y00.C30247a;
import z00.InterfaceC31142c;

/* renamed from: z00.d */
/* loaded from: classes5.dex */
public final class C31143d implements InterfaceC31142c {

    /* renamed from: a */
    private final AbstractC0086w f143561a;

    /* renamed from: b */
    private final AbstractC0074k f143562b;

    /* renamed from: c */
    private final AbstractC0074k f143563c;

    /* renamed from: d */
    private final AbstractC0074k f143564d;

    /* renamed from: e */
    private final AbstractC0066f0 f143565e;

    /* renamed from: f */
    private final AbstractC0066f0 f143566f;

    /* renamed from: g */
    private final AbstractC0066f0 f143567g;

    /* renamed from: z00.d$a */
    /* loaded from: classes5.dex */
    class a extends AbstractC0074k {
        a(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `ChannelTable` (`userId`,`channel`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0037b c0037b) {
            if (c0037b.m123b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0037b.m123b());
            }
            String m149182b = C30247a.f140500a.m149182b(c0037b.m122a());
            if (m149182b == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149182b);
            }
        }
    }

    /* renamed from: z00.d$b */
    /* loaded from: classes5.dex */
    class b extends AbstractC0074k {
        b(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `UserTable` (`userId`,`user`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0052q c0052q) {
            if (c0052q.m153b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0052q.m153b());
            }
            String m149206z = C30247a.f140500a.m149206z(c0052q.m152a());
            if (m149206z == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149206z);
            }
        }
    }

    /* renamed from: z00.d$c */
    /* loaded from: classes5.dex */
    class c extends AbstractC0074k {
        c(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `ChannelConfigTb` (`id`,`channelConfig`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0036a c0036a) {
            interfaceC18186k.mo220l0(1, c0036a.m121b());
            String m149181a = C30247a.f140500a.m149181a(c0036a.m120a());
            if (m149181a == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, m149181a);
            }
        }
    }

    /* renamed from: z00.d$d */
    /* loaded from: classes5.dex */
    class d extends AbstractC0066f0 {
        d(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM ChannelTable";
        }
    }

    /* renamed from: z00.d$e */
    /* loaded from: classes5.dex */
    class e extends AbstractC0066f0 {
        e(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM UserTable";
        }
    }

    /* renamed from: z00.d$f */
    /* loaded from: classes5.dex */
    class f extends AbstractC0066f0 {
        f(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM ChannelConfigTb";
        }
    }

    public C31143d(AbstractC0086w abstractC0086w) {
        this.f143561a = abstractC0086w;
        this.f143562b = new a(abstractC0086w);
        this.f143563c = new b(abstractC0086w);
        this.f143564d = new c(abstractC0086w);
        this.f143565e = new d(abstractC0086w);
        this.f143566f = new e(abstractC0086w);
        this.f143567g = new f(abstractC0086w);
    }

    /* renamed from: l */
    public static List m151410l() {
        return Collections.emptyList();
    }

    @Override // z00.InterfaceC31142c
    /* renamed from: a */
    public C0036a mo151395a() {
        C0089z m401c = C0089z.m401c("SELECT *FROM ChannelConfigTb", 0);
        this.f143561a.m341d();
        C0036a c0036a = null;
        String string = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143561a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "id");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "channelConfig");
            if (m16306c.moveToFirst()) {
                int i11 = m16306c.getInt(m16303e);
                if (!m16306c.isNull(m16303e2)) {
                    string = m16306c.getString(m16303e2);
                }
                c0036a = new C0036a(i11, C30247a.f140500a.m149184d(string));
            }
            return c0036a;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31142c
    /* renamed from: b */
    public C0052q mo151396b() {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM UserTable", 0);
        this.f143561a.m341d();
        C0052q c0052q = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143561a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "user");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0052q = new C0052q(string, C30247a.f140500a.m149185e(string2));
            }
            return c0052q;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31142c
    /* renamed from: c */
    public void mo151397c(C0037b c0037b) {
        this.f143561a.m342e();
        try {
            InterfaceC31142c.a.m151407a(this, c0037b);
            this.f143561a.m339E();
        } finally {
            this.f143561a.m347j();
        }
    }

    @Override // z00.InterfaceC31142c
    /* renamed from: d */
    public void mo151398d(C0036a c0036a) {
        this.f143561a.m341d();
        this.f143561a.m342e();
        try {
            this.f143564d.m263j(c0036a);
            this.f143561a.m339E();
        } finally {
            this.f143561a.m347j();
        }
    }

    @Override // z00.InterfaceC31142c
    /* renamed from: e */
    public void mo151399e(C0052q c0052q) {
        this.f143561a.m342e();
        try {
            InterfaceC31142c.a.m151409c(this, c0052q);
            this.f143561a.m339E();
        } finally {
            this.f143561a.m347j();
        }
    }

    @Override // z00.InterfaceC31142c
    /* renamed from: f */
    public void mo151400f() {
        this.f143561a.m341d();
        InterfaceC18186k m248b = this.f143567g.m248b();
        this.f143561a.m342e();
        try {
            m248b.mo223w();
            this.f143561a.m339E();
        } finally {
            this.f143561a.m347j();
            this.f143567g.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31142c
    /* renamed from: g */
    public void mo151401g() {
        this.f143561a.m341d();
        InterfaceC18186k m248b = this.f143565e.m248b();
        this.f143561a.m342e();
        try {
            m248b.mo223w();
            this.f143561a.m339E();
        } finally {
            this.f143561a.m347j();
            this.f143565e.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31142c
    /* renamed from: h */
    public void mo151402h(C0037b c0037b) {
        this.f143561a.m341d();
        this.f143561a.m342e();
        try {
            this.f143562b.m263j(c0037b);
            this.f143561a.m339E();
        } finally {
            this.f143561a.m347j();
        }
    }

    @Override // z00.InterfaceC31142c
    /* renamed from: i */
    public void mo151403i(C0036a c0036a) {
        this.f143561a.m342e();
        try {
            InterfaceC31142c.a.m151408b(this, c0036a);
            this.f143561a.m339E();
        } finally {
            this.f143561a.m347j();
        }
    }

    @Override // z00.InterfaceC31142c
    /* renamed from: j */
    public void mo151404j(C0052q c0052q) {
        this.f143561a.m341d();
        this.f143561a.m342e();
        try {
            this.f143563c.m263j(c0052q);
            this.f143561a.m339E();
        } finally {
            this.f143561a.m347j();
        }
    }

    @Override // z00.InterfaceC31142c
    /* renamed from: k */
    public void mo151405k() {
        this.f143561a.m341d();
        InterfaceC18186k m248b = this.f143566f.m248b();
        this.f143561a.m342e();
        try {
            m248b.mo223w();
            this.f143561a.m339E();
        } finally {
            this.f143561a.m347j();
            this.f143566f.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31142c
    /* renamed from: q */
    public C0037b mo151406q() {
        String string;
        C0089z m401c = C0089z.m401c("SELECT *FROM ChannelTable", 0);
        this.f143561a.m341d();
        C0037b c0037b = null;
        String string2 = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143561a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "userId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "channel");
            if (m16306c.moveToFirst()) {
                if (m16306c.isNull(m16303e)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e);
                }
                if (!m16306c.isNull(m16303e2)) {
                    string2 = m16306c.getString(m16303e2);
                }
                c0037b = new C0037b(string, C30247a.f140500a.m149183c(string2));
            }
            return c0037b;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }
}
