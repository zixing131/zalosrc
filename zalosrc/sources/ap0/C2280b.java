package ap0;

import android.widget.Toast;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.List;
import me0.C23046d7;
import p185gc.AbstractC19383g;
import p207he.C20024r;
import p348mi.AbstractC23309i;

/* renamed from: ap0.b */
/* loaded from: classes7.dex */
public final class C2280b extends AbstractC19383g {

    /* renamed from: a */
    private final C20024r f9640a;

    /* renamed from: ap0.b$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        private final List f9641a;

        /* renamed from: b */
        private final int f9642b;

        /* renamed from: c */
        private final String f9643c;

        /* renamed from: d */
        private final String f9644d;

        /* renamed from: e */
        private final int f9645e;

        /* renamed from: f */
        private final String f9646f;

        public a(List list, int i11, String str, String str2, int i12, String str3) {
            AbstractC19074t.m100208f(list, "partners");
            AbstractC19074t.m100208f(str, "groupName");
            this.f9641a = list;
            this.f9642b = i11;
            this.f9643c = str;
            this.f9644d = str2;
            this.f9645e = i12;
            this.f9646f = str3;
        }

        /* renamed from: a */
        public final String m12015a() {
            return this.f9646f;
        }

        /* renamed from: b */
        public final String m12016b() {
            return this.f9644d;
        }

        /* renamed from: c */
        public final int m12017c() {
            return this.f9642b;
        }

        /* renamed from: d */
        public final String m12018d() {
            return this.f9643c;
        }

        /* renamed from: e */
        public final List m12019e() {
            return this.f9641a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f9641a, aVar.f9641a) && this.f9642b == aVar.f9642b && AbstractC19074t.m100204b(this.f9643c, aVar.f9643c) && AbstractC19074t.m100204b(this.f9644d, aVar.f9644d) && this.f9645e == aVar.f9645e && AbstractC19074t.m100204b(this.f9646f, aVar.f9646f);
        }

        /* renamed from: f */
        public final int m12020f() {
            return this.f9645e;
        }

        public int hashCode() {
            int hashCode = ((((this.f9641a.hashCode() * 31) + this.f9642b) * 31) + this.f9643c.hashCode()) * 31;
            String str = this.f9644d;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f9645e) * 31;
            String str2 = this.f9646f;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Params(partners=" + this.f9641a + ", groupId=" + this.f9642b + ", groupName=" + this.f9643c + ", groupAvatar=" + this.f9644d + ", source=" + this.f9645e + ", data=" + this.f9646f + ")";
        }
    }

    public C2280b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        try {
            C23046d7.m118248k(new SensitiveData("micro_call_group", "comm_call", null, 4, null), "micro");
            this.f9640a.m103954q(aVar.m12020f(), AbstractC23309i.m121262O7(), aVar.m12017c(), aVar.m12018d(), aVar.m12016b(), aVar.m12015a(), aVar.m12019e());
        } catch (SensitiveDataException unused) {
            Toast.makeText(MainApplication.Companion.m35500c(), AbstractC8020f0.str_sensitive_micro_block_title, 1).show();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2280b(C20024r c20024r, int i11, AbstractC19060k abstractC19060k) {
        this(c20024r);
        if ((i11 & 1) != 0) {
            c20024r = C20024r.m103937c();
            AbstractC19074t.m100207e(c20024r, "getInstance(...)");
        }
    }

    public C2280b(C20024r c20024r) {
        AbstractC19074t.m100208f(c20024r, "voipManager");
        this.f9640a = c20024r;
    }
}
