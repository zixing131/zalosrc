package z00;

import a10.C0054s;
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

/* renamed from: z00.h */
/* loaded from: classes5.dex */
public final class C31147h implements InterfaceC31146g {

    /* renamed from: a */
    private final AbstractC0086w f143579a;

    /* renamed from: b */
    private final AbstractC0074k f143580b;

    /* renamed from: c */
    private final AbstractC0066f0 f143581c;

    /* renamed from: d */
    private final AbstractC0066f0 f143582d;

    /* renamed from: z00.h$a */
    /* loaded from: classes5.dex */
    class a extends AbstractC0074k {
        a(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `WatchCount` (`channelId`,`videoCount`,`modifiedTime`) VALUES (?,?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0054s c0054s) {
            if (c0054s.m158a() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c0054s.m158a());
            }
            interfaceC18186k.mo220l0(2, c0054s.m160c());
            interfaceC18186k.mo220l0(3, c0054s.m159b());
        }
    }

    /* renamed from: z00.h$b */
    /* loaded from: classes5.dex */
    class b extends AbstractC0066f0 {
        b(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM WatchCount WHERE channelId LIKE ?";
        }
    }

    /* renamed from: z00.h$c */
    /* loaded from: classes5.dex */
    class c extends AbstractC0066f0 {
        c(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM WatchCount WHERE channelId IN (SELECT channelId FROM WatchCount ORDER BY modifiedTime DESC LIMIT -1 OFFSET ?)";
        }
    }

    public C31147h(AbstractC0086w abstractC0086w) {
        this.f143579a = abstractC0086w;
        this.f143580b = new a(abstractC0086w);
        this.f143581c = new b(abstractC0086w);
        this.f143582d = new c(abstractC0086w);
    }

    /* renamed from: e */
    public static List m151426e() {
        return Collections.emptyList();
    }

    @Override // z00.InterfaceC31146g
    /* renamed from: a */
    public void mo151422a(String str) {
        this.f143579a.m341d();
        InterfaceC18186k m248b = this.f143581c.m248b();
        if (str == null) {
            m248b.mo222u0(1);
        } else {
            m248b.mo219a0(1, str);
        }
        this.f143579a.m342e();
        try {
            m248b.mo223w();
            this.f143579a.m339E();
        } finally {
            this.f143579a.m347j();
            this.f143581c.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31146g
    /* renamed from: b */
    public C0054s mo151423b(String str) {
        C0089z m401c = C0089z.m401c("SELECT * FROM WatchCount WHERE channelId LIKE ?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f143579a.m341d();
        C0054s c0054s = null;
        String string = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f143579a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "channelId");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "videoCount");
            int m16303e3 = AbstractC3205a.m16303e(m16306c, "modifiedTime");
            if (m16306c.moveToFirst()) {
                if (!m16306c.isNull(m16303e)) {
                    string = m16306c.getString(m16303e);
                }
                c0054s = new C0054s(string, m16306c.getInt(m16303e2), m16306c.getLong(m16303e3));
            }
            return c0054s;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31146g
    /* renamed from: c */
    public void mo151424c(int i11) {
        this.f143579a.m341d();
        InterfaceC18186k m248b = this.f143582d.m248b();
        m248b.mo220l0(1, i11);
        this.f143579a.m342e();
        try {
            m248b.mo223w();
            this.f143579a.m339E();
        } finally {
            this.f143579a.m347j();
            this.f143582d.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31146g
    /* renamed from: d */
    public void mo151425d(C0054s c0054s) {
        this.f143579a.m341d();
        this.f143579a.m342e();
        try {
            this.f143580b.m263j(c0054s);
            this.f143579a.m339E();
        } finally {
            this.f143579a.m347j();
        }
    }
}
