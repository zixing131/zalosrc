package p535u2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p008a2.AbstractC0074k;
import p008a2.AbstractC0086w;
import p008a2.C0089z;
import p046c2.AbstractC3206b;
import p119e2.InterfaceC18186k;

/* renamed from: u2.c */
/* loaded from: classes.dex */
public final class C26953c implements InterfaceC26951b {

    /* renamed from: a */
    private final AbstractC0086w f127450a;

    /* renamed from: b */
    private final AbstractC0074k f127451b;

    /* renamed from: u2.c$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC0074k {
        a(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C26949a c26949a) {
            if (c26949a.m138902b() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c26949a.m138902b());
            }
            if (c26949a.m138901a() == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, c26949a.m138901a());
            }
        }
    }

    public C26953c(AbstractC0086w abstractC0086w) {
        this.f127450a = abstractC0086w;
        this.f127451b = new a(abstractC0086w);
    }

    /* renamed from: e */
    public static List m138911e() {
        return Collections.emptyList();
    }

    @Override // p535u2.InterfaceC26951b
    /* renamed from: a */
    public List mo138905a(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f127450a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127450a, m401c, false, null);
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

    @Override // p535u2.InterfaceC26951b
    /* renamed from: b */
    public boolean mo138906b(String str) {
        boolean z11 = true;
        C0089z m401c = C0089z.m401c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f127450a.m341d();
        boolean z12 = false;
        Cursor m16306c = AbstractC3206b.m16306c(this.f127450a, m401c, false, null);
        try {
            if (m16306c.moveToFirst()) {
                if (m16306c.getInt(0) == 0) {
                    z11 = false;
                }
                z12 = z11;
            }
            return z12;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }

    @Override // p535u2.InterfaceC26951b
    /* renamed from: c */
    public void mo138907c(C26949a c26949a) {
        this.f127450a.m341d();
        this.f127450a.m342e();
        try {
            this.f127451b.m263j(c26949a);
            this.f127450a.m339E();
        } finally {
            this.f127450a.m347j();
        }
    }

    @Override // p535u2.InterfaceC26951b
    /* renamed from: d */
    public boolean mo138908d(String str) {
        boolean z11 = true;
        C0089z m401c = C0089z.m401c("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f127450a.m341d();
        boolean z12 = false;
        Cursor m16306c = AbstractC3206b.m16306c(this.f127450a, m401c, false, null);
        try {
            if (m16306c.moveToFirst()) {
                if (m16306c.getInt(0) == 0) {
                    z11 = false;
                }
                z12 = z11;
            }
            return z12;
        } finally {
            m16306c.close();
            m401c.m406h();
        }
    }
}
