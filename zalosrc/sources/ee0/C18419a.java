package ee0;

import am.C0943w;
import android.text.TextUtils;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.p062db.C7959d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19637j;
import ho0.AbstractC20110a;
import me0.AbstractC23184q2;
import org.json.JSONObject;
import p161fg.C18922m;
import p185gc.AbstractC19383g;
import p363nh.C23744a;
import p459qs.C25489b;
import p716zh.C31973j5;
import p716zh.C32076q5;

/* renamed from: ee0.a */
/* loaded from: classes4.dex */
public final class C18419a extends AbstractC19383g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C0943w f92885a;

    /* renamed from: b */
    private final C19637j f92886b;

    /* renamed from: c */
    private final C18922m f92887c;

    /* renamed from: d */
    private final C7959d f92888d;

    /* renamed from: e */
    private final C23744a f92889e;

    /* renamed from: ee0.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ee0.a$b */
    /* loaded from: classes4.dex */
    public static abstract class b {

        /* renamed from: a */
        private final String f92890a;

        /* renamed from: ee0.a$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: b */
            private final int f92891b;

            /* renamed from: c */
            private final String f92892c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, int i11, String str2) {
                super(str, null);
                AbstractC19074t.m100208f(str, "groupId");
                AbstractC19074t.m100208f(str2, "errorMessage");
                this.f92891b = i11;
                this.f92892c = str2;
            }

            /* renamed from: b */
            public final int m97612b() {
                return this.f92891b;
            }
        }

        /* renamed from: ee0.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32815b extends b {

            /* renamed from: b */
            private final C31973j5 f92893b;

            /* renamed from: c */
            private final C32076q5 f92894c;

            /* renamed from: d */
            private final JSONObject f92895d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32815b(String str, C31973j5 c31973j5, C32076q5 c32076q5, JSONObject jSONObject) {
                super(str, null);
                AbstractC19074t.m100208f(str, "groupId");
                AbstractC19074t.m100208f(c31973j5, "newGroupInfo");
                AbstractC19074t.m100208f(c32076q5, "newGroupMemberInfo");
                AbstractC19074t.m100208f(jSONObject, "groupDataJS");
                this.f92893b = c31973j5;
                this.f92894c = c32076q5;
                this.f92895d = jSONObject;
            }

            /* renamed from: b */
            public final JSONObject m97613b() {
                return this.f92895d;
            }

            /* renamed from: c */
            public final C31973j5 m97614c() {
                return this.f92893b;
            }

            /* renamed from: d */
            public final C32076q5 m97615d() {
                return this.f92894c;
            }
        }

        public /* synthetic */ b(String str, AbstractC19060k abstractC19060k) {
            this(str);
        }

        /* renamed from: a */
        public final String m97611a() {
            return this.f92890a;
        }

        private b(String str) {
            this.f92890a = str;
        }
    }

    public C18419a(C0943w c0943w, C19637j c19637j, C18922m c18922m, C7959d c7959d, C23744a c23744a) {
        AbstractC19074t.m100208f(c0943w, "groupDAO");
        AbstractC19074t.m100208f(c19637j, "groupManager");
        AbstractC19074t.m100208f(c18922m, "miniChatController");
        AbstractC19074t.m100208f(c7959d, "databaseChat");
        AbstractC19074t.m100208f(c23744a, "eventBus");
        this.f92885a = c0943w;
        this.f92886b = c19637j;
        this.f92887c = c18922m;
        this.f92888d = c7959d;
        this.f92889e = c23744a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x0007, B:6:0x0011, B:15:0x0025, B:17:0x0052, B:19:0x0056, B:21:0x006c, B:23:0x0074, B:28:0x008a, B:31:0x0093, B:32:0x0099, B:34:0x009f, B:36:0x00a6, B:38:0x00ac, B:39:0x00b1, B:41:0x00b7, B:43:0x00c6, B:44:0x00dd), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x0007, B:6:0x0011, B:15:0x0025, B:17:0x0052, B:19:0x0056, B:21:0x006c, B:23:0x0074, B:28:0x008a, B:31:0x0093, B:32:0x0099, B:34:0x009f, B:36:0x00a6, B:38:0x00ac, B:39:0x00b1, B:41:0x00b7, B:43:0x00c6, B:44:0x00dd), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x0007, B:6:0x0011, B:15:0x0025, B:17:0x0052, B:19:0x0056, B:21:0x006c, B:23:0x0074, B:28:0x008a, B:31:0x0093, B:32:0x0099, B:34:0x009f, B:36:0x00a6, B:38:0x00ac, B:39:0x00b1, B:41:0x00b7, B:43:0x00c6, B:44:0x00dd), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x0007, B:6:0x0011, B:15:0x0025, B:17:0x0052, B:19:0x0056, B:21:0x006c, B:23:0x0074, B:28:0x008a, B:31:0x0093, B:32:0x0099, B:34:0x009f, B:36:0x00a6, B:38:0x00ac, B:39:0x00b1, B:41:0x00b7, B:43:0x00c6, B:44:0x00dd), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo12006b(b bVar) {
        C7904b c7904b;
        boolean z11;
        String str;
        boolean z12;
        AbstractC19074t.m100208f(bVar, "params");
        try {
            String m97611a = bVar.m97611a();
            if (bVar instanceof b.a) {
                int m97612b = ((b.a) bVar).m97612b();
                if (m97612b == 17002 || m97612b == 17005 || m97612b == 17006) {
                    String str2 = "group_" + m97611a;
                    C25489b.m132040r(C25489b.f122105a, str2, "1", false, 4, null);
                    AbstractC23184q2.m119446d(m97611a, str2);
                    this.f92889e.m124116d(52, str2);
                    return;
                }
                return;
            }
            if (bVar instanceof b.C32815b) {
                C31973j5 m4472f = this.f92885a.m4472f(m97611a);
                C31973j5 m97614c = ((b.C32815b) bVar).m97614c();
                C32076q5 m97615d = ((b.C32815b) bVar).m97615d();
                if (m4472f != null) {
                    c7904b = m4472f.m153775o();
                } else {
                    c7904b = null;
                }
                if (c7904b != null) {
                    C7904b m153775o = m4472f.m153775o();
                    AbstractC19074t.m100205c(m153775o);
                    if (TextUtils.isEmpty(m153775o.f42736h)) {
                        z11 = true;
                        if (m4472f != null || (str = m4472f.m153793y()) == null) {
                            str = "";
                        }
                        if (m4472f == null) {
                            z12 = m4472f.m153772m0();
                        } else {
                            z12 = false;
                        }
                        if (m97615d.m154717f() > 0) {
                            this.f92885a.m4477n(m97614c, m97615d);
                        }
                        if (z12 && m97614c.m153772m0()) {
                            this.f92885a.m4467a(m97614c, str);
                        }
                        if (m97614c.m153716G() == 0) {
                            this.f92888d.m41787g3(m97614c.m153730N(), m97614c.m153793y());
                        }
                        if (z11) {
                            this.f92889e.m124116d(27, m97611a, 8, "");
                        }
                        this.f92887c.m99151U("group_" + m97614c.m153781r(), m97614c.m153756e());
                        this.f92886b.m102838U(((b.C32815b) bVar).m97613b());
                    }
                }
                z11 = false;
                if (m4472f != null) {
                }
                str = "";
                if (m4472f == null) {
                }
                if (m97615d.m154717f() > 0) {
                }
                if (z12) {
                    this.f92885a.m4467a(m97614c, str);
                }
                if (m97614c.m153716G() == 0) {
                }
                if (z11) {
                }
                this.f92887c.m99151U("group_" + m97614c.m153781r(), m97614c.m153756e());
                this.f92886b.m102838U(((b.C32815b) bVar).m97613b());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104551d("GetGroupInfoUseCase", e11);
        }
    }
}
