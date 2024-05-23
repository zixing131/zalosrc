package z00;

import a10.C0053r;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p008a2.AbstractC0066f0;
import p008a2.AbstractC0074k;
import p008a2.AbstractC0086w;
import p008a2.C0089z;
import p046c2.AbstractC3205a;
import p046c2.AbstractC3206b;
import p046c2.AbstractC3208d;
import p119e2.InterfaceC18186k;
import z00.InterfaceC31144e;

/* renamed from: z00.f */
/* loaded from: classes5.dex */
public final class C31145f implements InterfaceC31144e {

    /* renamed from: a */
    private final AbstractC0086w f143574a;

    /* renamed from: b */
    private final AbstractC0074k f143575b;

    /* renamed from: c */
    private final AbstractC0066f0 f143576c;

    /* renamed from: z00.f$a */
    /* loaded from: classes5.dex */
    class a extends AbstractC0074k {
        a(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `tb_view_history` (`rowid`,`user_id`,`video_id`,`timestamp`) VALUES (nullif(?, 0),?,?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0053r c0053r) {
            interfaceC18186k.mo220l0(1, c0053r.m154a());
            if (c0053r.m156c() == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, c0053r.m156c());
            }
            if (c0053r.m157d() == null) {
                interfaceC18186k.mo222u0(3);
            } else {
                interfaceC18186k.mo219a0(3, c0053r.m157d());
            }
            interfaceC18186k.mo220l0(4, c0053r.m155b());
        }
    }

    /* renamed from: z00.f$b */
    /* loaded from: classes5.dex */
    class b extends AbstractC0066f0 {
        b(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM tb_view_history WHERE user_id != ? OR rowid NOT IN (SELECT rowid FROM tb_view_history ORDER BY timestamp DESC LIMIT ?)";
        }
    }

    public C31145f(AbstractC0086w abstractC0086w) {
        this.f143574a = abstractC0086w;
        this.f143575b = new a(abstractC0086w);
        this.f143576c = new b(abstractC0086w);
    }

    /* renamed from: f */
    public static List m151420f() {
        return Collections.emptyList();
    }

    @Override // z00.InterfaceC31144e
    /* renamed from: a */
    public List mo151414a(int i11) {
        String string;
        String string2;
        C0089z m401c = C0089z.m401c("SELECT * FROM tb_view_history ORDER BY timestamp DESC LIMIT ?", 1);
        m401c.mo220l0(1, i11);
        this.f143574a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f143574a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "rowid");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "user_id");
            int m16303e3 = AbstractC3205a.m16303e(m16306c, "video_id");
            int m16303e4 = AbstractC3205a.m16303e(m16306c, "timestamp");
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                int i12 = m16306c.getInt(m16303e);
                if (m16306c.isNull(m16303e2)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e2);
                }
                if (m16306c.isNull(m16303e3)) {
                    string2 = null;
                } else {
                    string2 = m16306c.getString(m16303e3);
                }
                arrayList.add(new C0053r(i12, string, string2, m16306c.getLong(m16303e4)));
            }
            return arrayList;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // z00.InterfaceC31144e
    /* renamed from: b */
    public void mo151415b(C0053r c0053r) {
        this.f143574a.m341d();
        this.f143574a.m342e();
        try {
            this.f143575b.m263j(c0053r);
            this.f143574a.m339E();
        } finally {
            this.f143574a.m347j();
        }
    }

    @Override // z00.InterfaceC31144e
    /* renamed from: c */
    public void mo151416c(C0053r c0053r) {
        this.f143574a.m342e();
        try {
            InterfaceC31144e.a.m151419a(this, c0053r);
            this.f143574a.m339E();
        } finally {
            this.f143574a.m347j();
        }
    }

    @Override // z00.InterfaceC31144e
    /* renamed from: d */
    public void mo151417d(String str, int i11) {
        this.f143574a.m341d();
        InterfaceC18186k m248b = this.f143576c.m248b();
        if (str == null) {
            m248b.mo222u0(1);
        } else {
            m248b.mo219a0(1, str);
        }
        m248b.mo220l0(2, i11);
        this.f143574a.m342e();
        try {
            m248b.mo223w();
            this.f143574a.m339E();
        } finally {
            this.f143574a.m347j();
            this.f143576c.m251h(m248b);
        }
    }

    @Override // z00.InterfaceC31144e
    /* renamed from: e */
    public List mo151418e(String str, List list) {
        String string;
        String string2;
        StringBuilder m16310b = AbstractC3208d.m16310b();
        m16310b.append("SELECT * FROM tb_view_history WHERE user_id = ");
        m16310b.append("?");
        m16310b.append(" AND video_id IN (");
        int size = list.size();
        AbstractC3208d.m16309a(m16310b, size);
        m16310b.append(")");
        C0089z m401c = C0089z.m401c(m16310b.toString(), size + 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        Iterator it = list.iterator();
        int i11 = 2;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 == null) {
                m401c.mo222u0(i11);
            } else {
                m401c.mo219a0(i11, str2);
            }
            i11++;
        }
        this.f143574a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f143574a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "rowid");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "user_id");
            int m16303e3 = AbstractC3205a.m16303e(m16306c, "video_id");
            int m16303e4 = AbstractC3205a.m16303e(m16306c, "timestamp");
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                int i12 = m16306c.getInt(m16303e);
                if (m16306c.isNull(m16303e2)) {
                    string = null;
                } else {
                    string = m16306c.getString(m16303e2);
                }
                if (m16306c.isNull(m16303e3)) {
                    string2 = null;
                } else {
                    string2 = m16306c.getString(m16303e3);
                }
                arrayList.add(new C0053r(i12, string, string2, m16306c.getLong(m16303e4)));
            }
            return arrayList;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }
}
