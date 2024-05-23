package b40;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import b40.AbstractC2521a0;
import b40.AbstractC2531f0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: b40.z */
/* loaded from: classes5.dex */
public abstract class AbstractC2551z {

    /* renamed from: b40.z$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC2551z {

        /* renamed from: a */
        private final String f10430a;

        /* renamed from: b */
        private final String f10431b;

        /* renamed from: c */
        private final long f10432c;

        /* renamed from: d */
        private final String f10433d;

        /* renamed from: e */
        private final AbstractC2531f0 f10434e;

        /* renamed from: f */
        private final d f10435f;

        /* renamed from: g */
        private final int f10436g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, long j11, String str3, AbstractC2531f0 abstractC2531f0, d dVar, int i11) {
            super(null);
            AbstractC19074t.m100208f(str, "threadId");
            AbstractC19074t.m100208f(str2, "receiverId");
            AbstractC19074t.m100208f(str3, "entryPoint");
            AbstractC19074t.m100208f(abstractC2531f0, "failedReason");
            this.f10430a = str;
            this.f10431b = str2;
            this.f10432c = j11;
            this.f10433d = str3;
            this.f10434e = abstractC2531f0;
            this.f10435f = dVar;
            this.f10436g = i11;
        }

        @Override // b40.AbstractC2551z
        /* renamed from: b */
        public JSONObject mo12899b() {
            String str;
            Object obj;
            String num;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mts", this.f10432c);
            jSONObject.put("reason", this.f10434e.m12743a());
            d dVar = this.f10435f;
            String str2 = "";
            if (dVar == null || (str = dVar.m12906b()) == null) {
                str = "";
            }
            jSONObject.put("err_uid", str);
            d dVar2 = this.f10435f;
            if (dVar2 == null) {
                obj = "";
            } else {
                obj = Integer.valueOf(dVar2.m12905a());
            }
            jSONObject.put("err_di", obj);
            jSONObject.put("eel", this.f10436g);
            AbstractC2531f0 abstractC2531f0 = this.f10434e;
            if (abstractC2531f0 instanceof AbstractC2531f0.b) {
                EnumC2523b0 m12744b = ((AbstractC2531f0.b) abstractC2531f0).m12744b();
                if (m12744b != null && (num = Integer.valueOf(m12744b.m12639c()).toString()) != null) {
                    str2 = num;
                }
                jSONObject.put("rel", str2);
            }
            jSONObject.put("ep", m12898a(this.f10433d));
            return jSONObject;
        }

        /* renamed from: c */
        public final String m12900c() {
            return this.f10431b;
        }

        /* renamed from: d */
        public final String m12901d() {
            return this.f10430a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f10430a, aVar.f10430a) && AbstractC19074t.m100204b(this.f10431b, aVar.f10431b) && this.f10432c == aVar.f10432c && AbstractC19074t.m100204b(this.f10433d, aVar.f10433d) && AbstractC19074t.m100204b(this.f10434e, aVar.f10434e) && AbstractC19074t.m100204b(this.f10435f, aVar.f10435f) && this.f10436g == aVar.f10436g;
        }

        public int hashCode() {
            int hashCode = ((((((((this.f10430a.hashCode() * 31) + this.f10431b.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f10432c)) * 31) + this.f10433d.hashCode()) * 31) + this.f10434e.hashCode()) * 31;
            d dVar = this.f10435f;
            return ((hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.f10436g;
        }

        public String toString() {
            return "FailedToSend(threadId=" + this.f10430a + ", receiverId=" + this.f10431b + ", timestamp=" + this.f10432c + ", entryPoint=" + this.f10433d + ", failedReason=" + this.f10434e + ", failedUserDevice=" + this.f10435f + ", ackError=" + this.f10436g + ")";
        }
    }

    /* renamed from: b40.z$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC2551z {

        /* renamed from: a */
        private final String f10437a;

        /* renamed from: b */
        private final long f10438b;

        /* renamed from: c */
        private final long f10439c;

        /* renamed from: d */
        private final d f10440d;

        /* renamed from: e */
        private final boolean f10441e;

        /* renamed from: f */
        private final AbstractC2521a0 f10442f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, long j11, long j12, d dVar, boolean z11, AbstractC2521a0 abstractC2521a0) {
            super(null);
            AbstractC19074t.m100208f(str, "threadId");
            AbstractC19074t.m100208f(dVar, "failedUserDevice");
            AbstractC19074t.m100208f(abstractC2521a0, "notRequestingReason");
            this.f10437a = str;
            this.f10438b = j11;
            this.f10439c = j12;
            this.f10440d = dVar;
            this.f10441e = z11;
            this.f10442f = abstractC2521a0;
        }

        @Override // b40.AbstractC2551z
        /* renamed from: b */
        public JSONObject mo12899b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mts", this.f10438b);
            jSONObject.put("gmi", this.f10439c);
            jSONObject.put("si", this.f10440d.m12906b());
            jSONObject.put("fromDI", this.f10440d.m12905a());
            jSONObject.put("cont", this.f10441e ? 1 : 0);
            jSONObject.put("rel", this.f10442f.m12631a());
            AbstractC2521a0 abstractC2521a0 = this.f10442f;
            if (abstractC2521a0 instanceof AbstractC2521a0.g) {
                jSONObject.put("rkel", String.valueOf(((AbstractC2521a0.g) abstractC2521a0).m12635b().m12742c()));
            } else if (abstractC2521a0 instanceof AbstractC2521a0.f) {
                jSONObject.put("rkel", String.valueOf(((AbstractC2521a0.f) abstractC2521a0).m12634c().m12742c()));
                jSONObject.put("rrel", String.valueOf(((AbstractC2521a0.f) this.f10442f).m12633b().m12740c()));
            } else if (abstractC2521a0 instanceof AbstractC2521a0.e) {
                jSONObject.put("rrel", String.valueOf(((AbstractC2521a0.e) abstractC2521a0).m12632b().m12740c()));
            }
            return jSONObject;
        }

        /* renamed from: c */
        public final String m12902c() {
            return this.f10437a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f10437a, bVar.f10437a) && this.f10438b == bVar.f10438b && this.f10439c == bVar.f10439c && AbstractC19074t.m100204b(this.f10440d, bVar.f10440d) && this.f10441e == bVar.f10441e && AbstractC19074t.m100204b(this.f10442f, bVar.f10442f);
        }

        public int hashCode() {
            return (((((((((this.f10437a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f10438b)) * 31) + AbstractC2147g0.m11521a(this.f10439c)) * 31) + this.f10440d.hashCode()) * 31) + AbstractC2144f.m11520a(this.f10441e)) * 31) + this.f10442f.hashCode();
        }

        public String toString() {
            return "NotRequestingResendOnFailed(threadId=" + this.f10437a + ", timestamp=" + this.f10438b + ", globalMessageId=" + this.f10439c + ", failedUserDevice=" + this.f10440d + ", continueRequestResend=" + this.f10441e + ", notRequestingReason=" + this.f10442f + ")";
        }
    }

    /* renamed from: b40.z$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC2551z {

        /* renamed from: a */
        private final String f10443a;

        /* renamed from: b */
        private final String f10444b;

        /* renamed from: c */
        private final long f10445c;

        /* renamed from: d */
        private final long f10446d;

        /* renamed from: e */
        private final String f10447e;

        /* renamed from: f */
        private final d f10448f;

        /* renamed from: g */
        private final int f10449g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, long j11, long j12, String str3, d dVar, int i11) {
            super(null);
            AbstractC19074t.m100208f(str, "threadId");
            AbstractC19074t.m100208f(str2, "receiverId");
            AbstractC19074t.m100208f(str3, "entryPoint");
            AbstractC19074t.m100208f(dVar, "failedUserDevice");
            this.f10443a = str;
            this.f10444b = str2;
            this.f10445c = j11;
            this.f10446d = j12;
            this.f10447e = str3;
            this.f10448f = dVar;
            this.f10449g = i11;
        }

        @Override // b40.AbstractC2551z
        /* renamed from: b */
        public JSONObject mo12899b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mts", this.f10445c);
            jSONObject.put("gmi", this.f10446d);
            jSONObject.put("sid", this.f10448f.m12906b());
            jSONObject.put("sdi", this.f10448f.m12905a());
            jSONObject.put("err", this.f10449g);
            return jSONObject;
        }

        /* renamed from: c */
        public final String m12903c() {
            return this.f10444b;
        }

        /* renamed from: d */
        public final String m12904d() {
            return this.f10443a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC19074t.m100204b(this.f10443a, cVar.f10443a) && AbstractC19074t.m100204b(this.f10444b, cVar.f10444b) && this.f10445c == cVar.f10445c && this.f10446d == cVar.f10446d && AbstractC19074t.m100204b(this.f10447e, cVar.f10447e) && AbstractC19074t.m100204b(this.f10448f, cVar.f10448f) && this.f10449g == cVar.f10449g;
        }

        public int hashCode() {
            return (((((((((((this.f10443a.hashCode() * 31) + this.f10444b.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f10445c)) * 31) + AbstractC2147g0.m11521a(this.f10446d)) * 31) + this.f10447e.hashCode()) * 31) + this.f10448f.hashCode()) * 31) + this.f10449g;
        }

        public String toString() {
            return "ReceiveResendRequest(threadId=" + this.f10443a + ", receiverId=" + this.f10444b + ", timestamp=" + this.f10445c + ", globalMessageId=" + this.f10446d + ", entryPoint=" + this.f10447e + ", failedUserDevice=" + this.f10448f + ", ackError=" + this.f10449g + ")";
        }
    }

    /* renamed from: b40.z$d */
    /* loaded from: classes5.dex */
    public static final class d {

        /* renamed from: a */
        private final String f10450a;

        /* renamed from: b */
        private final int f10451b;

        public d(String str, int i11) {
            AbstractC19074t.m100208f(str, "uid");
            this.f10450a = str;
            this.f10451b = i11;
        }

        /* renamed from: a */
        public final int m12905a() {
            return this.f10451b;
        }

        /* renamed from: b */
        public final String m12906b() {
            return this.f10450a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC19074t.m100204b(this.f10450a, dVar.f10450a) && this.f10451b == dVar.f10451b;
        }

        public int hashCode() {
            return (this.f10450a.hashCode() * 31) + this.f10451b;
        }

        public String toString() {
            return "UserDevice(uid=" + this.f10450a + ", deviceId=" + this.f10451b + ")";
        }
    }

    private AbstractC2551z() {
    }

    public /* synthetic */ AbstractC2551z(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    protected final int m12898a(String str) {
        AbstractC19074t.m100208f(str, "entryPoint");
        int hashCode = str.hashCode();
        if (hashCode != -1717242658) {
            if (hashCode != -379927437) {
                if (hashCode == 2080047874 && str.equals("chat_resend")) {
                    return 3;
                }
            } else if (str.equals("share_outapp")) {
                return 2;
            }
        } else if (str.equals("chat_forward")) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public abstract JSONObject mo12899b();
}
