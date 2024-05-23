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

/* renamed from: u2.q */
/* loaded from: classes.dex */
public final class C26970q implements InterfaceC26969p {

    /* renamed from: a */
    private final AbstractC0086w f127482a;

    /* renamed from: b */
    private final AbstractC0074k f127483b;

    /* renamed from: u2.q$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC0074k {
        a(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C26968o c26968o) {
            if (c26968o.m138956a() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c26968o.m138956a());
            }
            if (c26968o.m138957b() == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, c26968o.m138957b());
            }
        }
    }

    public C26970q(AbstractC0086w abstractC0086w) {
        this.f127482a = abstractC0086w;
        this.f127483b = new a(abstractC0086w);
    }

    /* renamed from: c */
    public static List m138960c() {
        return Collections.emptyList();
    }

    @Override // p535u2.InterfaceC26969p
    /* renamed from: a */
    public List mo138958a(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f127482a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127482a, m401c, false, null);
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

    @Override // p535u2.InterfaceC26969p
    /* renamed from: b */
    public void mo138959b(C26968o c26968o) {
        this.f127482a.m341d();
        this.f127482a.m342e();
        try {
            this.f127483b.m263j(c26968o);
            this.f127482a.m339E();
        } finally {
            this.f127482a.m347j();
        }
    }
}
