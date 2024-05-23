package ap0;

import android.widget.Toast;
import androidx.work.AbstractC2144f;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.C23046d7;
import p185gc.AbstractC19383g;
import p207he.C20024r;
import zm.voip.service.C32246a;

/* renamed from: ap0.a */
/* loaded from: classes7.dex */
public final class C2279a extends AbstractC19383g {

    /* renamed from: a */
    private final C20024r f9632a;

    /* renamed from: b */
    private final C32246a f9633b;

    /* renamed from: ap0.a$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        private final String f9634a;

        /* renamed from: b */
        private final String f9635b;

        /* renamed from: c */
        private final String f9636c;

        /* renamed from: d */
        private final boolean f9637d;

        /* renamed from: e */
        private final int f9638e;

        /* renamed from: f */
        private final String f9639f;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, boolean z11, int i11) {
            this(str, str2, str3, z11, i11, null, 32, null);
            AbstractC19074t.m100208f(str, "calleeId");
            AbstractC19074t.m100208f(str2, "displayName");
            AbstractC19074t.m100208f(str3, "avatar");
        }

        /* renamed from: a */
        public final String m12008a() {
            return this.f9636c;
        }

        /* renamed from: b */
        public final String m12009b() {
            return this.f9634a;
        }

        /* renamed from: c */
        public final String m12010c() {
            return this.f9635b;
        }

        /* renamed from: d */
        public final String m12011d() {
            return this.f9639f;
        }

        /* renamed from: e */
        public final int m12012e() {
            return this.f9638e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f9634a, aVar.f9634a) && AbstractC19074t.m100204b(this.f9635b, aVar.f9635b) && AbstractC19074t.m100204b(this.f9636c, aVar.f9636c) && this.f9637d == aVar.f9637d && this.f9638e == aVar.f9638e && AbstractC19074t.m100204b(this.f9639f, aVar.f9639f);
        }

        /* renamed from: f */
        public final boolean m12013f() {
            return this.f9637d;
        }

        public int hashCode() {
            return (((((((((this.f9634a.hashCode() * 31) + this.f9635b.hashCode()) * 31) + this.f9636c.hashCode()) * 31) + AbstractC2144f.m11520a(this.f9637d)) * 31) + this.f9638e) * 31) + this.f9639f.hashCode();
        }

        public String toString() {
            return "Params(calleeId=" + this.f9634a + ", displayName=" + this.f9635b + ", avatar=" + this.f9636c + ", isVideo=" + this.f9637d + ", source=" + this.f9638e + ", extraInfo=" + this.f9639f + ")";
        }

        public a(String str, String str2, String str3, boolean z11, int i11, String str4) {
            AbstractC19074t.m100208f(str, "calleeId");
            AbstractC19074t.m100208f(str2, "displayName");
            AbstractC19074t.m100208f(str3, "avatar");
            AbstractC19074t.m100208f(str4, "extraInfo");
            this.f9634a = str;
            this.f9635b = str2;
            this.f9636c = str3;
            this.f9637d = z11;
            this.f9638e = i11;
            this.f9639f = str4;
        }

        public /* synthetic */ a(String str, String str2, String str3, boolean z11, int i11, String str4, int i12, AbstractC19060k abstractC19060k) {
            this(str, str2, str3, z11, i11, (i12 & 32) != 0 ? "" : str4);
        }
    }

    public C2279a() {
        this(null, null, 3, null);
    }

    @Override // p185gc.AbstractC19383g
    /* renamed from: c */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        try {
            C23046d7.m118248k(new SensitiveData("micro_call", "comm_call", null, 4, null), "micro");
            this.f9633b.m155685R();
            this.f9632a.m103955r(aVar.m12009b(), aVar.m12010c(), aVar.m12008a(), aVar.m12013f(), aVar.m12012e(), aVar.m12011d());
        } catch (SensitiveDataException unused) {
            Toast.makeText(MainApplication.Companion.m35500c(), AbstractC8020f0.str_sensitive_micro_block_title, 1).show();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2279a(C20024r c20024r, C32246a c32246a, int i11, AbstractC19060k abstractC19060k) {
        this(c20024r, (i11 & 2) != 0 ? C32246a.f148777h.m155689a() : c32246a);
        if ((i11 & 1) != 0) {
            c20024r = C20024r.m103937c();
            AbstractC19074t.m100207e(c20024r, "getInstance(...)");
        }
    }

    public C2279a(C20024r c20024r, C32246a c32246a) {
        AbstractC19074t.m100208f(c20024r, "voipManager");
        AbstractC19074t.m100208f(c32246a, "backgroundController");
        this.f9632a = c20024r;
        this.f9633b = c32246a;
    }
}
