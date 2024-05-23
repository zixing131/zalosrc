package p612wk;

import ai.C0862b;
import ai.InterfaceC0861a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zinstant.C17244x0;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import org.json.JSONObject;
import p056cj.C3548p;
import p612wk.AbstractC29080l;
import p716zh.C32020m7;
import p716zh.C32058p1;
import p716zh.C32178x9;
import tk.C26723b;
import tk.InterfaceC26722a;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: wk.a */
/* loaded from: classes3.dex */
public abstract class AbstractC29069a implements InterfaceC26722a {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private final C26723b f134649a;

    /* renamed from: wk.a$a */
    /* loaded from: classes3.dex */
    public static final class a extends l {

        /* renamed from: d */
        private final C3548p f134650d;

        /* renamed from: e */
        private final long f134651e;

        /* renamed from: f */
        private String f134652f;

        /* renamed from: g */
        private CharSequence f134653g;

        /* renamed from: h */
        private String f134654h;

        /* renamed from: i */
        private String f134655i;

        /* renamed from: j */
        private boolean f134656j;

        /* renamed from: k */
        private String f134657k;

        /* renamed from: l */
        private C17945a0 f134658l;

        /* renamed from: m */
        private boolean f134659m;

        /* renamed from: n */
        private int f134660n;

        /* renamed from: o */
        private CharSequence f134661o;

        /* renamed from: p */
        private CharSequence f134662p;

        /* renamed from: q */
        private CharSequence f134663q;

        /* renamed from: r */
        private CharSequence f134664r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, C3548p c3548p, long j11, String str, CharSequence charSequence, String str2, String str3, String str4, boolean z11) {
            super(i11, str3, null);
            AbstractC19074t.m100208f(c3548p, "data");
            AbstractC19074t.m100208f(str, "name");
            AbstractC19074t.m100208f(str2, "avatarUrl");
            AbstractC19074t.m100208f(str3, "subData");
            AbstractC19074t.m100208f(str4, "displayNameAndAvatarUid");
            this.f134650d = c3548p;
            this.f134651e = j11;
            this.f134652f = str;
            this.f134653g = charSequence;
            this.f134654h = str2;
            this.f134655i = str4;
            this.f134656j = z11;
            this.f134659m = true;
        }

        /* renamed from: A */
        public final void m145139A(boolean z11) {
            this.f134659m = z11;
        }

        /* renamed from: d */
        public final String m145140d() {
            return this.f134654h;
        }

        /* renamed from: e */
        public final C17945a0 m145141e() {
            return this.f134658l;
        }

        /* renamed from: f */
        public final C3548p m145142f() {
            return this.f134650d;
        }

        /* renamed from: g */
        public final String m145143g() {
            return this.f134655i;
        }

        /* renamed from: h */
        public final CharSequence m145144h() {
            return this.f134661o;
        }

        /* renamed from: i */
        public final CharSequence m145145i() {
            return this.f134664r;
        }

        /* renamed from: j */
        public final CharSequence m145146j() {
            return this.f134662p;
        }

        /* renamed from: k */
        public final CharSequence m145147k() {
            return this.f134663q;
        }

        /* renamed from: l */
        public final String m145148l() {
            return this.f134657k;
        }

        /* renamed from: m */
        public final int m145149m() {
            return this.f134660n;
        }

        /* renamed from: n */
        public final String m145150n() {
            return this.f134652f;
        }

        /* renamed from: o */
        public final CharSequence m145151o() {
            return this.f134653g;
        }

        /* renamed from: p */
        public final long m145152p() {
            return this.f134651e;
        }

        /* renamed from: q */
        public final boolean m145153q() {
            return this.f134656j;
        }

        /* renamed from: r */
        public final void m145154r(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f134654h = str;
        }

        /* renamed from: s */
        public final void m145155s(C17945a0 c17945a0) {
            this.f134658l = c17945a0;
        }

        /* renamed from: t */
        public final void m145156t(CharSequence charSequence) {
            this.f134661o = charSequence;
        }

        /* renamed from: u */
        public final void m145157u(CharSequence charSequence) {
            this.f134664r = charSequence;
        }

        /* renamed from: v */
        public final void m145158v(CharSequence charSequence) {
            this.f134662p = charSequence;
        }

        /* renamed from: w */
        public final void m145159w(CharSequence charSequence) {
            this.f134663q = charSequence;
        }

        /* renamed from: x */
        public final void m145160x(String str) {
            this.f134657k = str;
        }

        /* renamed from: y */
        public final void m145161y(int i11) {
            this.f134660n = i11;
        }

        /* renamed from: z */
        public final void m145162z(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f134652f = str;
        }
    }

    /* renamed from: wk.a$a0 */
    /* loaded from: classes3.dex */
    public static final class a0 {

        /* renamed from: a */
        private final List f134665a;

        /* renamed from: b */
        private final C17244x0 f134666b;

        /* renamed from: c */
        private final String f134667c;

        /* renamed from: d */
        private final String f134668d;

        /* renamed from: e */
        private final JSONObject f134669e;

        /* renamed from: f */
        private final int f134670f;

        public a0(List list, C17244x0 c17244x0, String str, String str2, JSONObject jSONObject, int i11) {
            AbstractC19074t.m100208f(list, "data");
            AbstractC19074t.m100208f(c17244x0, "zinstantApiInfo");
            this.f134665a = list;
            this.f134666b = c17244x0;
            this.f134667c = str;
            this.f134668d = str2;
            this.f134669e = jSONObject;
            this.f134670f = i11;
        }

        /* renamed from: b */
        public static /* synthetic */ a0 m145163b(a0 a0Var, List list, C17244x0 c17244x0, String str, String str2, JSONObject jSONObject, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = a0Var.f134665a;
            }
            if ((i12 & 2) != 0) {
                c17244x0 = a0Var.f134666b;
            }
            C17244x0 c17244x02 = c17244x0;
            if ((i12 & 4) != 0) {
                str = a0Var.f134667c;
            }
            String str3 = str;
            if ((i12 & 8) != 0) {
                str2 = a0Var.f134668d;
            }
            String str4 = str2;
            if ((i12 & 16) != 0) {
                jSONObject = a0Var.f134669e;
            }
            JSONObject jSONObject2 = jSONObject;
            if ((i12 & 32) != 0) {
                i11 = a0Var.f134670f;
            }
            return a0Var.m145164a(list, c17244x02, str3, str4, jSONObject2, i11);
        }

        /* renamed from: a */
        public final a0 m145164a(List list, C17244x0 c17244x0, String str, String str2, JSONObject jSONObject, int i11) {
            AbstractC19074t.m100208f(list, "data");
            AbstractC19074t.m100208f(c17244x0, "zinstantApiInfo");
            return new a0(list, c17244x0, str, str2, jSONObject, i11);
        }

        /* renamed from: c */
        public final List m145165c() {
            return this.f134665a;
        }

        /* renamed from: d */
        public final int m145166d() {
            return this.f134670f;
        }

        /* renamed from: e */
        public final String m145167e() {
            return this.f134667c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return AbstractC19074t.m100204b(this.f134665a, a0Var.f134665a) && AbstractC19074t.m100204b(this.f134666b, a0Var.f134666b) && AbstractC19074t.m100204b(this.f134667c, a0Var.f134667c) && AbstractC19074t.m100204b(this.f134668d, a0Var.f134668d) && AbstractC19074t.m100204b(this.f134669e, a0Var.f134669e) && this.f134670f == a0Var.f134670f;
        }

        /* renamed from: f */
        public final String m145168f() {
            return this.f134668d;
        }

        /* renamed from: g */
        public final JSONObject m145169g() {
            return this.f134669e;
        }

        /* renamed from: h */
        public final C17244x0 m145170h() {
            return this.f134666b;
        }

        public int hashCode() {
            int hashCode = ((this.f134665a.hashCode() * 31) + this.f134666b.hashCode()) * 31;
            String str = this.f134667c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f134668d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            JSONObject jSONObject = this.f134669e;
            return ((hashCode3 + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31) + this.f134670f;
        }

        public String toString() {
            return "ZinstantMiniProgramData(data=" + this.f134665a + ", zinstantApiInfo=" + this.f134666b + ", externalAction=" + this.f134667c + ", externalActionData=" + this.f134668d + ", externalActionDataJson=" + this.f134669e + ", displayItemSize=" + this.f134670f + ")";
        }
    }

    /* renamed from: wk.a$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m145171a(int i11, int i12) {
            return (i11 & i12) != 0;
        }
    }

    /* renamed from: wk.a$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC29069a {

        /* renamed from: b */
        private final List f134671b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(null);
            AbstractC19074t.m100208f(list, "data");
            this.f134671b = list;
        }

        /* renamed from: b */
        public final List m145172b() {
            return this.f134671b;
        }
    }

    /* renamed from: wk.a$d */
    /* loaded from: classes3.dex */
    public static abstract class d extends AbstractC29069a {

        /* renamed from: wk.a$d$a */
        /* loaded from: classes3.dex */
        public static abstract class a extends AbstractC33038d {

            /* renamed from: b */
            private final String f134672b;

            /* renamed from: wk.a$d$a$a */
            /* loaded from: classes3.dex */
            public static final class C33036a extends a {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C33036a(String str) {
                    super(str, null);
                    AbstractC19074t.m100208f(str, "errorContent");
                }
            }

            /* renamed from: wk.a$d$a$b */
            /* loaded from: classes3.dex */
            public static final class b extends a {

                /* renamed from: c */
                public static final b f134673c = new b();

                private b() {
                    super(null, 1, null);
                }
            }

            /* renamed from: wk.a$d$a$c */
            /* loaded from: classes3.dex */
            public static final class c extends a {

                /* renamed from: c */
                public static final c f134674c = new c();

                private c() {
                    super(null, 1, null);
                }
            }

            /* renamed from: wk.a$d$a$d */
            /* loaded from: classes3.dex */
            public static final class C33037d extends a {

                /* renamed from: c */
                public static final C33037d f134675c = new C33037d();

                private C33037d() {
                    super(null, 1, null);
                }
            }

            public /* synthetic */ a(String str, AbstractC19060k abstractC19060k) {
                this(str);
            }

            /* renamed from: b */
            public final String m145173b() {
                return this.f134672b;
            }

            private a(String str) {
                super(null);
                this.f134672b = str;
            }

            public /* synthetic */ a(String str, int i11, AbstractC19060k abstractC19060k) {
                this((i11 & 1) != 0 ? null : str, null);
            }
        }

        /* renamed from: wk.a$d$b */
        /* loaded from: classes3.dex */
        public static final class b extends d {

            /* renamed from: b */
            public static final b f134676b = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: wk.a$d$c */
        /* loaded from: classes3.dex */
        public static final class c extends AbstractC33038d {

            /* renamed from: b */
            public static final c f134677b = new c();

            private c() {
                super(null);
            }
        }

        /* renamed from: wk.a$d$d */
        /* loaded from: classes3.dex */
        public static abstract class AbstractC33038d extends d {
            public /* synthetic */ AbstractC33038d(AbstractC19060k abstractC19060k) {
                this();
            }

            private AbstractC33038d() {
                super(null);
            }
        }

        public /* synthetic */ d(AbstractC19060k abstractC19060k) {
            this();
        }

        private d() {
            super(null);
        }
    }

    /* renamed from: wk.a$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC29069a {

        /* renamed from: b */
        private final int f134678b;

        /* renamed from: c */
        private final MediaStoreItem f134679c;

        /* renamed from: d */
        private final String f134680d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i11, MediaStoreItem mediaStoreItem, String str) {
            super(null);
            AbstractC19074t.m100208f(mediaStoreItem, "data");
            AbstractC19074t.m100208f(str, "subData");
            this.f134678b = i11;
            this.f134679c = mediaStoreItem;
            this.f134680d = str;
        }

        /* renamed from: b */
        public final MediaStoreItem m145174b() {
            return this.f134679c;
        }

        /* renamed from: c */
        public final String m145175c() {
            return this.f134680d;
        }
    }

    /* renamed from: wk.a$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC29069a {
        public static final a Companion = new a(null);

        /* renamed from: b */
        private final String f134681b;

        /* renamed from: c */
        private final int f134682c;

        /* renamed from: wk.a$f$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public f(String str, int i11) {
            super(null);
            this.f134681b = str;
            this.f134682c = i11;
        }

        /* renamed from: b */
        public final f m145176b() {
            return new f(this.f134681b, this.f134682c);
        }

        /* renamed from: c */
        public final f m145177c() {
            return new f(this.f134681b, 15);
        }

        /* renamed from: d */
        public final int m145178d() {
            return this.f134682c;
        }

        /* renamed from: e */
        public final String m145179e() {
            return this.f134681b;
        }
    }

    /* renamed from: wk.a$g */
    /* loaded from: classes3.dex */
    public static abstract class g extends AbstractC29069a {

        /* renamed from: wk.a$g$a */
        /* loaded from: classes3.dex */
        public static final class a extends g {

            /* renamed from: b */
            public static final a f134683b = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: wk.a$g$b */
        /* loaded from: classes3.dex */
        public static final class b extends g {

            /* renamed from: b */
            public static final b f134684b = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: wk.a$g$c */
        /* loaded from: classes3.dex */
        public static final class c extends g {

            /* renamed from: b */
            public static final c f134685b = new c();

            private c() {
                super(null);
            }
        }

        /* renamed from: wk.a$g$d */
        /* loaded from: classes3.dex */
        public static final class d extends g {

            /* renamed from: b */
            private final CharSequence f134686b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(CharSequence charSequence) {
                super(null);
                AbstractC19074t.m100208f(charSequence, "data");
                this.f134686b = charSequence;
            }

            /* renamed from: b */
            public final CharSequence m145180b() {
                return this.f134686b;
            }
        }

        public /* synthetic */ g(AbstractC19060k abstractC19060k) {
            this();
        }

        private g() {
            super(null);
        }
    }

    /* renamed from: wk.a$h */
    /* loaded from: classes3.dex */
    public static final class h {

        /* renamed from: a */
        private final AbstractC29069a f134687a;

        /* renamed from: b */
        private final int f134688b;

        public h(AbstractC29069a abstractC29069a, int i11) {
            AbstractC19074t.m100208f(abstractC29069a, "data");
            this.f134687a = abstractC29069a;
            this.f134688b = i11;
        }

        /* renamed from: a */
        public final AbstractC29069a m145181a() {
            return this.f134687a;
        }

        /* renamed from: b */
        public final int m145182b() {
            return this.f134688b;
        }
    }

    /* renamed from: wk.a$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC29069a {

        /* renamed from: b */
        private final int f134689b;

        /* renamed from: c */
        private final int f134690c;

        /* renamed from: d */
        private final CharSequence f134691d;

        /* renamed from: e */
        private final s f134692e;

        public i(int i11, int i12, CharSequence charSequence, s sVar) {
            super(null);
            this.f134689b = i11;
            this.f134690c = i12;
            this.f134691d = charSequence;
            this.f134692e = sVar;
        }

        /* renamed from: b */
        public final int m145183b() {
            return this.f134689b;
        }

        /* renamed from: c */
        public final int m145184c() {
            return this.f134690c;
        }

        /* renamed from: d */
        public final CharSequence m145185d() {
            return this.f134691d;
        }

        public /* synthetic */ i(int i11, int i12, CharSequence charSequence, s sVar, int i13, AbstractC19060k abstractC19060k) {
            this(i11, i12, (i13 & 4) != 0 ? null : charSequence, (i13 & 8) != 0 ? null : sVar);
        }
    }

    /* renamed from: wk.a$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC29069a {

        /* renamed from: b */
        private final int f134693b;

        /* renamed from: c */
        private final MediaStoreItem f134694c;

        /* renamed from: d */
        private final String f134695d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i11, MediaStoreItem mediaStoreItem, String str) {
            super(null);
            AbstractC19074t.m100208f(mediaStoreItem, "data");
            AbstractC19074t.m100208f(str, "subData");
            this.f134693b = i11;
            this.f134694c = mediaStoreItem;
            this.f134695d = str;
        }

        /* renamed from: b */
        public final MediaStoreItem m145186b() {
            return this.f134694c;
        }

        /* renamed from: c */
        public final String m145187c() {
            return this.f134695d;
        }
    }

    /* renamed from: wk.a$k */
    /* loaded from: classes3.dex */
    public static final class k extends l {

        /* renamed from: d */
        private final C32020m7 f134696d;

        /* renamed from: e */
        private final MessageId f134697e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i11, C32020m7 c32020m7, String str, MessageId messageId) {
            super(i11, str, null);
            AbstractC19074t.m100208f(c32020m7, "data");
            AbstractC19074t.m100208f(str, "subData");
            AbstractC19074t.m100208f(messageId, "messageId");
            this.f134696d = c32020m7;
            this.f134697e = messageId;
        }

        /* renamed from: d */
        public final C32020m7 m145188d() {
            return this.f134696d;
        }

        /* renamed from: e */
        public final MessageId m145189e() {
            return this.f134697e;
        }
    }

    /* renamed from: wk.a$l */
    /* loaded from: classes3.dex */
    public static abstract class l extends AbstractC29069a {

        /* renamed from: b */
        private final int f134698b;

        /* renamed from: c */
        private final String f134699c;

        public /* synthetic */ l(int i11, String str, AbstractC19060k abstractC19060k) {
            this(i11, str);
        }

        /* renamed from: b */
        public final int m145190b() {
            return this.f134698b;
        }

        /* renamed from: c */
        public final String m145191c() {
            return this.f134699c;
        }

        private l(int i11, String str) {
            super(null);
            this.f134698b = i11;
            this.f134699c = str;
        }
    }

    /* renamed from: wk.a$m */
    /* loaded from: classes3.dex */
    public static abstract class m extends AbstractC29069a {

        /* renamed from: b */
        private final int f134700b;

        /* renamed from: c */
        private final C0862b f134701c;

        public /* synthetic */ m(int i11, C0862b c0862b, AbstractC19060k abstractC19060k) {
            this(i11, c0862b);
        }

        /* renamed from: b */
        public final C0862b m145192b() {
            return this.f134701c;
        }

        /* renamed from: c */
        public final int m145193c() {
            return this.f134700b;
        }

        private m(int i11, C0862b c0862b) {
            super(null);
            this.f134700b = i11;
            this.f134701c = c0862b;
        }
    }

    /* renamed from: wk.a$n */
    /* loaded from: classes3.dex */
    public static final class n extends m {

        /* renamed from: d */
        private final boolean f134702d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i11, C0862b c0862b, boolean z11) {
            super(i11, c0862b, null);
            AbstractC19074t.m100208f(c0862b, "data");
            this.f134702d = z11;
        }

        /* renamed from: d */
        public final boolean m145194d() {
            return this.f134702d;
        }
    }

    /* renamed from: wk.a$o */
    /* loaded from: classes3.dex */
    public static final class o extends AbstractC29069a {

        /* renamed from: b */
        private final int f134703b;

        /* renamed from: c */
        private final InterfaceC0861a f134704c;

        /* renamed from: d */
        private CharSequence f134705d;

        /* renamed from: e */
        private CharSequence f134706e;

        /* renamed from: f */
        private String f134707f;

        /* renamed from: g */
        private p f134708g;

        /* renamed from: h */
        private C32058p1 f134709h;

        /* renamed from: i */
        private final CharSequence f134710i;

        /* renamed from: j */
        private final int f134711j;

        /* renamed from: k */
        private final int f134712k;

        /* renamed from: l */
        private final w f134713l;

        /* renamed from: m */
        private final y f134714m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(int i11, InterfaceC0861a interfaceC0861a, CharSequence charSequence, CharSequence charSequence2, String str, p pVar, C32058p1 c32058p1, CharSequence charSequence3, int i12, int i13, w wVar, y yVar) {
            super(null);
            AbstractC19074t.m100208f(interfaceC0861a, "data");
            AbstractC19074t.m100208f(charSequence, "name");
            AbstractC19074t.m100208f(str, "avatarUrl");
            AbstractC19074t.m100208f(pVar, "actionType");
            AbstractC19074t.m100208f(wVar, "taglineType");
            AbstractC19074t.m100208f(yVar, "unreadDotMode");
            this.f134703b = i11;
            this.f134704c = interfaceC0861a;
            this.f134705d = charSequence;
            this.f134706e = charSequence2;
            this.f134707f = str;
            this.f134708g = pVar;
            this.f134709h = c32058p1;
            this.f134710i = charSequence3;
            this.f134711j = i12;
            this.f134712k = i13;
            this.f134713l = wVar;
            this.f134714m = yVar;
        }

        /* renamed from: b */
        public final p m145195b() {
            return this.f134708g;
        }

        /* renamed from: c */
        public final String m145196c() {
            return this.f134707f;
        }

        /* renamed from: d */
        public final int m145197d() {
            return this.f134712k;
        }

        /* renamed from: e */
        public final InterfaceC0861a m145198e() {
            return this.f134704c;
        }

        /* renamed from: f */
        public final C32058p1 m145199f() {
            return this.f134709h;
        }

        /* renamed from: g */
        public final int m145200g() {
            return this.f134703b;
        }

        /* renamed from: h */
        public final CharSequence m145201h() {
            return this.f134705d;
        }

        /* renamed from: i */
        public final CharSequence m145202i() {
            return this.f134706e;
        }

        /* renamed from: j */
        public final w m145203j() {
            return this.f134713l;
        }

        /* renamed from: k */
        public final int m145204k() {
            return this.f134711j;
        }

        /* renamed from: l */
        public final CharSequence m145205l() {
            return this.f134710i;
        }

        /* renamed from: m */
        public final y m145206m() {
            return this.f134714m;
        }

        /* renamed from: n */
        public final void m145207n(p pVar) {
            AbstractC19074t.m100208f(pVar, "<set-?>");
            this.f134708g = pVar;
        }

        /* renamed from: o */
        public final void m145208o(CharSequence charSequence) {
            this.f134706e = charSequence;
        }
    }

    /* renamed from: wk.a$p */
    /* loaded from: classes3.dex */
    public interface p {

        /* renamed from: wk.a$p$a */
        /* loaded from: classes3.dex */
        public static final class a extends j {

            /* renamed from: c */
            public static final a f134715c = new a();

            private a() {
                super(AbstractC8020f0.str_suggest_func_accept_friend, true, null);
            }
        }

        /* renamed from: wk.a$p$b */
        /* loaded from: classes3.dex */
        public static final class b extends j {

            /* renamed from: c */
            public static final b f134716c = new b();

            private b() {
                super(AbstractC8020f0.str_suggest_func_add_friend_new, false, 2, null);
            }
        }

        /* renamed from: wk.a$p$c */
        /* loaded from: classes3.dex */
        public static final class c implements p {

            /* renamed from: a */
            public static final c f134717a = new c();

            private c() {
            }
        }

        /* renamed from: wk.a$p$d */
        /* loaded from: classes3.dex */
        public static final class d implements p {

            /* renamed from: a */
            public static final d f134718a = new d();

            private d() {
            }
        }

        /* renamed from: wk.a$p$e */
        /* loaded from: classes3.dex */
        public static final class e extends j {

            /* renamed from: c */
            public static final e f134719c = new e();

            private e() {
                super(AbstractC8020f0.str_suggest_friend_send_msg, false, 2, null);
            }
        }

        /* renamed from: wk.a$p$f */
        /* loaded from: classes3.dex */
        public static final class f extends j {

            /* renamed from: c */
            public static final f f134720c = new f();

            private f() {
                super(AbstractC8020f0.str_suggest_func_follow_page, false, 2, null);
            }
        }

        /* renamed from: wk.a$p$g */
        /* loaded from: classes3.dex */
        public static abstract class g implements p {

            /* renamed from: a */
            private final int f134721a;

            public /* synthetic */ g(int i11, AbstractC19060k abstractC19060k) {
                this(i11);
            }

            /* renamed from: a */
            public final int m145209a() {
                return this.f134721a;
            }

            private g(int i11) {
                this.f134721a = i11;
            }
        }

        /* renamed from: wk.a$p$h */
        /* loaded from: classes3.dex */
        public static abstract class h implements p {

            /* renamed from: a */
            private final g f134722a;

            /* renamed from: b */
            private final g f134723b;

            public /* synthetic */ h(g gVar, g gVar2, AbstractC19060k abstractC19060k) {
                this(gVar, gVar2);
            }

            /* renamed from: a */
            public final g m145210a() {
                return this.f134722a;
            }

            /* renamed from: b */
            public final g m145211b() {
                return this.f134723b;
            }

            private h(g gVar, g gVar2) {
                this.f134722a = gVar;
                this.f134723b = gVar2;
            }
        }

        /* renamed from: wk.a$p$i */
        /* loaded from: classes3.dex */
        public static final class i extends j {

            /* renamed from: c */
            public static final i f134724c = new i();

            private i() {
                super(AbstractC8020f0.str_suggest_func_add_friend_new, false, 2, null);
            }
        }

        /* renamed from: wk.a$p$j */
        /* loaded from: classes3.dex */
        public static abstract class j implements p {

            /* renamed from: a */
            private final int f134725a;

            /* renamed from: b */
            private final boolean f134726b;

            public /* synthetic */ j(int i11, boolean z11, AbstractC19060k abstractC19060k) {
                this(i11, z11);
            }

            /* renamed from: a */
            public final int m145212a() {
                return this.f134725a;
            }

            /* renamed from: b */
            public final boolean m145213b() {
                return this.f134726b;
            }

            private j(int i11, boolean z11) {
                this.f134725a = i11;
                this.f134726b = z11;
            }

            public /* synthetic */ j(int i11, boolean z11, int i12, AbstractC19060k abstractC19060k) {
                this(i11, (i12 & 2) != 0 ? false : z11, null);
            }
        }

        /* renamed from: wk.a$p$k */
        /* loaded from: classes3.dex */
        public static final class k extends g {

            /* renamed from: b */
            public static final k f134727b = new k();

            private k() {
                super(AbstractC16803z.ic_call_video_call_back_button, null);
            }
        }

        /* renamed from: wk.a$p$l */
        /* loaded from: classes3.dex */
        public static final class l extends g {

            /* renamed from: b */
            public static final l f134728b = new l();

            private l() {
                super(AbstractC16803z.ic_call_audio_call_back_button, null);
            }
        }

        /* renamed from: wk.a$p$m */
        /* loaded from: classes3.dex */
        public static final class m extends h {

            /* renamed from: c */
            public static final m f134729c = new m();

            private m() {
                super(l.f134728b, k.f134727b, null);
            }
        }
    }

    /* renamed from: wk.a$q */
    /* loaded from: classes3.dex */
    public static final class q extends AbstractC29069a {

        /* renamed from: b */
        private final int f134730b;

        /* renamed from: c */
        private final CharSequence f134731c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(int i11, CharSequence charSequence) {
            super(null);
            AbstractC19074t.m100208f(charSequence, "data");
            this.f134730b = i11;
            this.f134731c = charSequence;
        }

        /* renamed from: b */
        public final CharSequence m145214b() {
            return this.f134731c;
        }

        /* renamed from: c */
        public final int m145215c() {
            return this.f134730b;
        }
    }

    /* renamed from: wk.a$r */
    /* loaded from: classes3.dex */
    public static final class r extends AbstractC29069a {

        /* renamed from: b */
        public static final r f134732b = new r();

        private r() {
            super(null);
        }
    }

    /* renamed from: wk.a$s */
    /* loaded from: classes3.dex */
    public static abstract class s extends AbstractC29069a {

        /* renamed from: wk.a$s$a */
        /* loaded from: classes3.dex */
        public static final class a extends s {

            /* renamed from: b */
            public static final a f134733b = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$b */
        /* loaded from: classes3.dex */
        public static final class b extends s {

            /* renamed from: b */
            public static final b f134734b = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$c */
        /* loaded from: classes3.dex */
        public static final class c extends s {

            /* renamed from: b */
            public static final c f134735b = new c();

            private c() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$d */
        /* loaded from: classes3.dex */
        public static final class d extends s {

            /* renamed from: b */
            public static final d f134736b = new d();

            private d() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$e */
        /* loaded from: classes3.dex */
        public static final class e extends s {

            /* renamed from: b */
            public static final e f134737b = new e();

            private e() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$f */
        /* loaded from: classes3.dex */
        public static final class f extends s {

            /* renamed from: b */
            public static final f f134738b = new f();

            private f() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$g */
        /* loaded from: classes3.dex */
        public static final class g extends s {

            /* renamed from: b */
            public static final g f134739b = new g();

            private g() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$h */
        /* loaded from: classes3.dex */
        public static final class h extends s {

            /* renamed from: b */
            public static final h f134740b = new h();

            private h() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$i */
        /* loaded from: classes3.dex */
        public static final class i extends s {

            /* renamed from: b */
            public static final i f134741b = new i();

            private i() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$j */
        /* loaded from: classes3.dex */
        public static final class j extends s {

            /* renamed from: b */
            public static final j f134742b = new j();

            private j() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$k */
        /* loaded from: classes3.dex */
        public static final class k extends s {

            /* renamed from: b */
            public static final k f134743b = new k();

            private k() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$l */
        /* loaded from: classes3.dex */
        public static final class l extends s {

            /* renamed from: b */
            public static final l f134744b = new l();

            private l() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$m */
        /* loaded from: classes3.dex */
        public static final class m extends s {

            /* renamed from: b */
            public static final m f134745b = new m();

            private m() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$n */
        /* loaded from: classes3.dex */
        public static final class n extends s {

            /* renamed from: b */
            public static final n f134746b = new n();

            private n() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$o */
        /* loaded from: classes3.dex */
        public static abstract class o extends s {

            /* renamed from: b */
            private final AbstractC29080l f134747b;

            /* renamed from: c */
            private final s f134748c;

            /* renamed from: wk.a$s$o$a */
            /* loaded from: classes3.dex */
            public static final class a extends o {

                /* renamed from: d */
                public static final a f134749d = new a();

                private a() {
                    super(AbstractC29080l.c.f134883b, null, null);
                }
            }

            /* renamed from: wk.a$s$o$b */
            /* loaded from: classes3.dex */
            public static final class b extends o {

                /* renamed from: d */
                public static final b f134750d = new b();

                private b() {
                    super(AbstractC29080l.d.f134884b, null, null);
                }
            }

            /* renamed from: wk.a$s$o$c */
            /* loaded from: classes3.dex */
            public static final class c extends o {

                /* renamed from: d */
                public static final c f134751d = new c();

                private c() {
                    super(AbstractC29080l.d.f134884b, a.f134733b, null);
                }
            }

            /* renamed from: wk.a$s$o$d */
            /* loaded from: classes3.dex */
            public static final class d extends o {

                /* renamed from: d */
                public static final d f134752d = new d();

                private d() {
                    super(AbstractC29080l.e.f134885b, null, null);
                }
            }

            /* renamed from: wk.a$s$o$e */
            /* loaded from: classes3.dex */
            public static final class e extends o {

                /* renamed from: d */
                public static final e f134753d = new e();

                private e() {
                    super(AbstractC29080l.c.f134883b, d.f134736b, null);
                }
            }

            /* renamed from: wk.a$s$o$f */
            /* loaded from: classes3.dex */
            public static final class f extends o {

                /* renamed from: d */
                public static final f f134754d = new f();

                private f() {
                    super(AbstractC29080l.c.f134883b, e.f134737b, null);
                }
            }

            /* renamed from: wk.a$s$o$g */
            /* loaded from: classes3.dex */
            public static final class g extends o {

                /* renamed from: d */
                public static final g f134755d = new g();

                private g() {
                    super(AbstractC29080l.c.f134883b, g.f134739b, null);
                }
            }

            /* renamed from: wk.a$s$o$h */
            /* loaded from: classes3.dex */
            public static final class h extends o {

                /* renamed from: d */
                public static final h f134756d = new h();

                private h() {
                    super(AbstractC29080l.c.f134883b, i.f134741b, null);
                }
            }

            /* renamed from: wk.a$s$o$i */
            /* loaded from: classes3.dex */
            public static final class i extends o {

                /* renamed from: d */
                public static final i f134757d = new i();

                private i() {
                    super(AbstractC29080l.f.f134886b, null, null);
                }
            }

            /* renamed from: wk.a$s$o$j */
            /* loaded from: classes3.dex */
            public static final class j extends o {

                /* renamed from: d */
                public static final j f134758d = new j();

                private j() {
                    super(AbstractC29080l.d.f134884b, j.f134742b, null);
                }
            }

            /* renamed from: wk.a$s$o$k */
            /* loaded from: classes3.dex */
            public static final class k extends o {

                /* renamed from: d */
                public static final k f134759d = new k();

                private k() {
                    super(AbstractC29080l.d.f134884b, k.f134743b, null);
                }
            }

            /* renamed from: wk.a$s$o$l */
            /* loaded from: classes3.dex */
            public static final class l extends o {

                /* renamed from: d */
                public static final l f134760d = new l();

                private l() {
                    super(AbstractC29080l.c.f134883b, l.f134744b, null);
                }
            }

            /* renamed from: wk.a$s$o$m */
            /* loaded from: classes3.dex */
            public static final class m extends o {

                /* renamed from: d */
                public static final m f134761d = new m();

                private m() {
                    super(AbstractC29080l.g.f134887b, null, null);
                }
            }

            /* renamed from: wk.a$s$o$n */
            /* loaded from: classes3.dex */
            public static final class n extends o {

                /* renamed from: d */
                public static final n f134762d = new n();

                private n() {
                    super(AbstractC29080l.d.f134884b, m.f134745b, null);
                }
            }

            /* renamed from: wk.a$s$o$o */
            /* loaded from: classes3.dex */
            public static final class C33039o extends o {

                /* renamed from: d */
                public static final C33039o f134763d = new C33039o();

                private C33039o() {
                    super(AbstractC29080l.d.f134884b, r.f134772b, null);
                }
            }

            /* renamed from: wk.a$s$o$p */
            /* loaded from: classes3.dex */
            public static final class p extends o {

                /* renamed from: d */
                public static final p f134764d = new p();

                private p() {
                    super(AbstractC29080l.c.f134883b, t.f134774b, null);
                }
            }

            /* renamed from: wk.a$s$o$q */
            /* loaded from: classes3.dex */
            public static final class q extends o {

                /* renamed from: d */
                public static final q f134765d = new q();

                private q() {
                    super(AbstractC29080l.c.f134883b, u.f134775b, null);
                }
            }

            public /* synthetic */ o(AbstractC29080l abstractC29080l, s sVar, AbstractC19060k abstractC19060k) {
                this(abstractC29080l, sVar);
            }

            /* renamed from: b */
            public final s m145216b() {
                return this.f134748c;
            }

            /* renamed from: c */
            public final AbstractC29080l m145217c() {
                return this.f134747b;
            }

            private o(AbstractC29080l abstractC29080l, s sVar) {
                super(null);
                this.f134747b = abstractC29080l;
                this.f134748c = sVar;
            }
        }

        /* renamed from: wk.a$s$p */
        /* loaded from: classes3.dex */
        public static final class p extends s {

            /* renamed from: b */
            private final AbstractC29080l f134766b;

            /* renamed from: c */
            private final AbstractC29073e f134767c;

            /* renamed from: d */
            private final boolean f134768d;

            /* renamed from: e */
            private final boolean f134769e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p(AbstractC29080l abstractC29080l, AbstractC29073e abstractC29073e, boolean z11, boolean z12) {
                super(null);
                AbstractC19074t.m100208f(abstractC29080l, "tabType");
                AbstractC19074t.m100208f(abstractC29073e, "section");
                this.f134766b = abstractC29080l;
                this.f134767c = abstractC29073e;
                this.f134768d = z11;
                this.f134769e = z12;
            }

            /* renamed from: b */
            public final AbstractC29073e m145218b() {
                return this.f134767c;
            }

            /* renamed from: c */
            public final AbstractC29080l m145219c() {
                return this.f134766b;
            }

            public /* synthetic */ p(AbstractC29080l abstractC29080l, AbstractC29073e abstractC29073e, boolean z11, boolean z12, int i11, AbstractC19060k abstractC19060k) {
                this(abstractC29080l, abstractC29073e, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12);
            }
        }

        /* renamed from: wk.a$s$q */
        /* loaded from: classes3.dex */
        public static final class q extends o {

            /* renamed from: d */
            private final boolean f134770d;

            /* renamed from: e */
            private final boolean f134771e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(AbstractC29080l abstractC29080l, s sVar, boolean z11, boolean z12) {
                super(abstractC29080l, sVar, null);
                AbstractC19074t.m100208f(abstractC29080l, "targetTab");
                AbstractC19074t.m100208f(sVar, "targetSeeMore");
                this.f134770d = z11;
                this.f134771e = z12;
            }

            /* renamed from: d */
            public final boolean m145220d() {
                return this.f134771e;
            }

            /* renamed from: e */
            public final boolean m145221e() {
                return this.f134770d;
            }

            public /* synthetic */ q(AbstractC29080l abstractC29080l, s sVar, boolean z11, boolean z12, int i11, AbstractC19060k abstractC19060k) {
                this(abstractC29080l, sVar, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12);
            }
        }

        /* renamed from: wk.a$s$r */
        /* loaded from: classes3.dex */
        public static final class r extends s {

            /* renamed from: b */
            public static final r f134772b = new r();

            private r() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$s */
        /* loaded from: classes3.dex */
        public static final class C33040s extends s {

            /* renamed from: b */
            public static final C33040s f134773b = new C33040s();

            private C33040s() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$t */
        /* loaded from: classes3.dex */
        public static final class t extends s {

            /* renamed from: b */
            public static final t f134774b = new t();

            private t() {
                super(null);
            }
        }

        /* renamed from: wk.a$s$u */
        /* loaded from: classes3.dex */
        public static final class u extends s {

            /* renamed from: b */
            public static final u f134775b = new u();

            private u() {
                super(null);
            }
        }

        public /* synthetic */ s(AbstractC19060k abstractC19060k) {
            this();
        }

        private s() {
            super(null);
        }
    }

    /* renamed from: wk.a$t */
    /* loaded from: classes3.dex */
    public static final class t extends AbstractC29069a {

        /* renamed from: b */
        public static final t f134776b = new t();

        private t() {
            super(null);
        }
    }

    /* renamed from: wk.a$u */
    /* loaded from: classes3.dex */
    public static final class u extends AbstractC29069a {

        /* renamed from: b */
        public static final u f134777b = new u();

        private u() {
            super(null);
        }
    }

    /* renamed from: wk.a$v */
    /* loaded from: classes3.dex */
    public static final class v extends AbstractC29069a {

        /* renamed from: b */
        private final int f134778b;

        /* renamed from: c */
        private final C32178x9 f134779c;

        /* renamed from: d */
        private CharSequence f134780d;

        /* renamed from: e */
        private CharSequence f134781e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(int i11, C32178x9 c32178x9, CharSequence charSequence, CharSequence charSequence2) {
            super(null);
            AbstractC19074t.m100208f(c32178x9, "data");
            this.f134778b = i11;
            this.f134779c = c32178x9;
            this.f134780d = charSequence;
            this.f134781e = charSequence2;
        }

        /* renamed from: b */
        public final C32178x9 m145222b() {
            return this.f134779c;
        }

        /* renamed from: c */
        public final int m145223c() {
            return this.f134778b;
        }

        /* renamed from: d */
        public final CharSequence m145224d() {
            return this.f134780d;
        }

        /* renamed from: e */
        public final CharSequence m145225e() {
            return this.f134781e;
        }

        /* renamed from: f */
        public final void m145226f(CharSequence charSequence) {
            this.f134780d = charSequence;
        }

        /* renamed from: g */
        public final void m145227g(CharSequence charSequence) {
            this.f134781e = charSequence;
        }

        public /* synthetic */ v(int i11, C32178x9 c32178x9, CharSequence charSequence, CharSequence charSequence2, int i12, AbstractC19060k abstractC19060k) {
            this(i11, c32178x9, (i12 & 4) != 0 ? null : charSequence, (i12 & 8) != 0 ? null : charSequence2);
        }
    }

    /* renamed from: wk.a$w */
    /* loaded from: classes3.dex */
    public interface w {

        /* renamed from: wk.a$w$a */
        /* loaded from: classes3.dex */
        public static abstract class a implements w {

            /* renamed from: a */
            private final CharSequence f134782a;

            public /* synthetic */ a(CharSequence charSequence, AbstractC19060k abstractC19060k) {
                this(charSequence);
            }

            /* renamed from: a */
            public final CharSequence m145228a() {
                return this.f134782a;
            }

            private a(CharSequence charSequence) {
                this.f134782a = charSequence;
            }
        }

        /* renamed from: wk.a$w$b */
        /* loaded from: classes3.dex */
        public static final class b implements w {

            /* renamed from: a */
            public static final b f134783a = new b();

            private b() {
            }
        }

        /* renamed from: wk.a$w$c */
        /* loaded from: classes3.dex */
        public static final class c extends a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(CharSequence charSequence) {
                super(charSequence, null);
                AbstractC19074t.m100208f(charSequence, "text");
            }
        }

        /* renamed from: wk.a$w$d */
        /* loaded from: classes3.dex */
        public static final class d implements w {

            /* renamed from: a */
            public static final d f134784a = new d();

            private d() {
            }
        }
    }

    /* renamed from: wk.a$x */
    /* loaded from: classes3.dex */
    public static final class x extends AbstractC29069a {

        /* renamed from: b */
        private final int f134785b;

        /* renamed from: c */
        private final int f134786c;

        /* renamed from: d */
        private final int f134787d;

        /* renamed from: e */
        private final String[] f134788e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(int i11, int i12, int i13, String[] strArr) {
            super(null);
            AbstractC19074t.m100208f(strArr, "params");
            this.f134785b = i11;
            this.f134786c = i12;
            this.f134787d = i13;
            this.f134788e = strArr;
        }

        /* renamed from: b */
        public final String[] m145229b() {
            return this.f134788e;
        }

        /* renamed from: c */
        public final int m145230c() {
            return this.f134787d;
        }

        /* renamed from: d */
        public final int m145231d() {
            return this.f134786c;
        }

        /* renamed from: e */
        public final int m145232e() {
            return this.f134785b;
        }
    }

    /* renamed from: wk.a$y */
    /* loaded from: classes3.dex */
    public static final class y extends Enum {

        /* renamed from: q */
        public static final y f134789q = new y("DOT_NONE", 0, 0);

        /* renamed from: r */
        public static final y f134790r = new y("DOT_RED", 1, 1);

        /* renamed from: s */
        public static final y f134791s = new y("DOT_GRAY", 2, 2);

        /* renamed from: t */
        private static final /* synthetic */ y[] f134792t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f134793u;

        /* renamed from: p */
        private final int f134794p;

        static {
            y[] m145233b = m145233b();
            f134792t = m145233b;
            f134793u = AbstractC30166b.m148796a(m145233b);
        }

        private y(String str, int i11, int i12) {
            super(str, i11);
            this.f134794p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ y[] m145233b() {
            return new y[]{f134789q, f134790r, f134791s};
        }

        public static y valueOf(String str) {
            return (y) Enum.valueOf(y.class, str);
        }

        public static y[] values() {
            return (y[]) f134792t.clone();
        }
    }

    /* renamed from: wk.a$z */
    /* loaded from: classes3.dex */
    public static final class z extends m {

        /* renamed from: d */
        private final a0 f134795d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(int i11, C0862b c0862b, a0 a0Var) {
            super(i11, c0862b, null);
            AbstractC19074t.m100208f(c0862b, "data");
            AbstractC19074t.m100208f(a0Var, "zinstantData");
            this.f134795d = a0Var;
        }

        /* renamed from: d */
        public final a0 m145234d() {
            return this.f134795d;
        }
    }

    public /* synthetic */ AbstractC29069a(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    public final C26723b m145138a() {
        return this.f134649a;
    }

    private AbstractC29069a() {
        this.f134649a = new C26723b(0, 0, null, null, 0, 0, 60, null);
    }
}
