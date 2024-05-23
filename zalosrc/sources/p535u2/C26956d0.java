package p535u2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p008a2.AbstractC0066f0;
import p008a2.AbstractC0074k;
import p008a2.AbstractC0086w;
import p008a2.C0089z;
import p046c2.AbstractC3206b;
import p119e2.InterfaceC18186k;
import p535u2.InterfaceC26954c0;

/* renamed from: u2.d0 */
/* loaded from: classes.dex */
public final class C26956d0 implements InterfaceC26954c0 {

    /* renamed from: a */
    private final AbstractC0086w f127455a;

    /* renamed from: b */
    private final AbstractC0074k f127456b;

    /* renamed from: c */
    private final AbstractC0066f0 f127457c;

    /* renamed from: u2.d0$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC0074k {
        a(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C26950a0 c26950a0) {
            if (c26950a0.m138903a() == null) {
                interfaceC18186k.mo222u0(1);
            } else {
                interfaceC18186k.mo219a0(1, c26950a0.m138903a());
            }
            if (c26950a0.m138904b() == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, c26950a0.m138904b());
            }
        }
    }

    /* renamed from: u2.d0$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC0066f0 {
        b(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public C26956d0(AbstractC0086w abstractC0086w) {
        this.f127455a = abstractC0086w;
        this.f127456b = new a(abstractC0086w);
        this.f127457c = new b(abstractC0086w);
    }

    /* renamed from: e */
    public static List m138920e() {
        return Collections.emptyList();
    }

    @Override // p535u2.InterfaceC26954c0
    /* renamed from: a */
    public List mo138913a(String str) {
        String string;
        C0089z m401c = C0089z.m401c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        this.f127455a.m341d();
        Cursor m16306c = AbstractC3206b.m16306c(this.f127455a, m401c, false, null);
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

    @Override // p535u2.InterfaceC26954c0
    /* renamed from: b */
    public void mo138914b(C26950a0 c26950a0) {
        this.f127455a.m341d();
        this.f127455a.m342e();
        try {
            this.f127456b.m263j(c26950a0);
            this.f127455a.m339E();
        } finally {
            this.f127455a.m347j();
        }
    }

    @Override // p535u2.InterfaceC26954c0
    /* renamed from: c */
    public void mo138915c(String str) {
        this.f127455a.m341d();
        InterfaceC18186k m248b = this.f127457c.m248b();
        if (str == null) {
            m248b.mo222u0(1);
        } else {
            m248b.mo219a0(1, str);
        }
        this.f127455a.m342e();
        try {
            m248b.mo223w();
            this.f127455a.m339E();
        } finally {
            this.f127455a.m347j();
            this.f127457c.m251h(m248b);
        }
    }

    @Override // p535u2.InterfaceC26954c0
    /* renamed from: d */
    public void mo138916d(String str, Set set) {
        InterfaceC26954c0.a.m138917a(this, str, set);
    }
}
