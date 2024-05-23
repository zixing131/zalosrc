package p535u2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p008a2.AbstractC0066f0;
import p008a2.AbstractC0074k;
import p008a2.AbstractC0086w;
import p008a2.C0089z;
import p046c2.AbstractC3205a;
import p046c2.AbstractC3206b;
import p119e2.InterfaceC18186k;
import p535u2.InterfaceC26964k;

/* renamed from: u2.l */
/* loaded from: classes.dex */
public final class C26965l implements InterfaceC26964k {

    /* renamed from: a */
    private final AbstractC0086w f127471a;

    /* renamed from: b */
    private final AbstractC0074k f127472b;

    /* renamed from: c */
    private final AbstractC0066f0 f127473c;

    /* renamed from: d */
    private final AbstractC0066f0 f127474d;

    /* renamed from: u2.l$a */
    /* loaded from: classes.dex */
    class a extends AbstractC0074k {
        a(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C26962i c26962i) {
            String str = c26962i.f127468a;
            if (str == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, str);
            }
            interfaceC18186k.mo220l0(2, c26962i.m138937a());
            interfaceC18186k.mo220l0(3, c26962i.f127470c);
        }
    }

    /* renamed from: u2.l$b */
    /* loaded from: classes.dex */
    class b extends AbstractC0066f0 {
        b(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* renamed from: u2.l$c */
    /* loaded from: classes.dex */
    class c extends AbstractC0066f0 {
        c(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C26965l(AbstractC0086w abstractC0086w) {
        this.f127471a = abstractC0086w;
        this.f127472b = new a(abstractC0086w);
        this.f127473c = new b(abstractC0086w);
        this.f127474d = new c(abstractC0086w);
    }

    /* renamed from: h */
    public static List m138951h() {
        return Collections.emptyList();
    }

    @Override // p535u2.InterfaceC26964k
    /* renamed from: a */
    public C26962i mo138942a(C26967n c26967n) {
        return InterfaceC26964k.a.m138949a(this, c26967n);
    }

    @Override // p535u2.InterfaceC26964k
    /* renamed from: b */
    public void mo138943b(C26967n c26967n) {
        InterfaceC26964k.a.m138950b(this, c26967n);
    }

    @Override // p535u2.InterfaceC26964k
    /* renamed from: c */
    public C26962i mo138944c(String str, int i11) {
        C0089z m401c = C0089z.m401c("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        m401c.mo220l0(2, i11);
        this.f127471a.m341d();
        C26962i c26962i = null;
        String string = null;
        Cursor m16306c = AbstractC3206b.m16306c(this.f127471a, m401c, false, null);
        try {
            int m16303e = AbstractC3205a.m16303e(m16306c, "work_spec_id");
            int m16303e2 = AbstractC3205a.m16303e(m16306c, "generation");
            int m16303e3 = AbstractC3205a.m16303e(m16306c, "system_id");
            if (m16306c.moveToFirst()) {
                if (!m16306c.isNull(m16303e)) {
                    string = m16306c.getString(m16303e);
                }
                c26962i = new C26962i(string, m16306c.getInt(m16303e2), m16306c.getInt(m16303e3));
            }
            return c26962i;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p535u2.InterfaceC26964k
    /* renamed from: d */
    public List mo138945d() {
        String string;
        C0089z m401c = C0089z.m401c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f127471a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127471a, m401c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m16306c.getCount());
            while (m16306c.moveToNext()) {
                if (m16306c.isNull(0)) {
                    string = null;
                } else {
                    string = m16306c.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p535u2.InterfaceC26964k
    /* renamed from: e */
    public void mo138946e(C26962i c26962i) {
        this.f127471a.m341d();
        this.f127471a.m342e();
        try {
            this.f127472b.m263j(c26962i);
            this.f127471a.m339E();
        } finally {
            this.f127471a.m347j();
        }
    }

    @Override // p535u2.InterfaceC26964k
    /* renamed from: f */
    public void mo138947f(String str, int i11) {
        this.f127471a.m341d();
        InterfaceC18186k m248b = this.f127473c.m248b();
        if (str == null) {
            m248b.mo222u0(1);
        } else {
            m248b.mo219a0(1, str);
        }
        m248b.mo220l0(2, i11);
        this.f127471a.m342e();
        try {
            m248b.mo223w();
            this.f127471a.m339E();
        } finally {
            this.f127471a.m347j();
            this.f127473c.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26964k
    /* renamed from: g */
    public void mo138948g(String str) {
        this.f127471a.m341d();
        InterfaceC18186k m248b = this.f127474d.m248b();
        if (str == null) {
            m248b.mo222u0(1);
        } else {
            m248b.mo219a0(1, str);
        }
        this.f127471a.m342e();
        try {
            m248b.mo223w();
            this.f127471a.m339E();
        } finally {
            this.f127471a.m347j();
            this.f127474d.m251h(m248b);
        }
    }
}
