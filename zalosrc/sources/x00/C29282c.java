package x00;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.content.SharedPreferences;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.LivestreamConfig;
import com.zing.zalo.shortvideo.data.remote.common.AuthInfo;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import on0.C24329j;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import qm0.AbstractC25379x0;
import vm0.AbstractC28298d;
import w00.AbstractC28684a;
import wm0.AbstractC29104l;
import y00.InterfaceC30248b;

/* renamed from: x00.c */
/* loaded from: classes5.dex */
public final class C29282c implements InterfaceC29280a {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final String f135683A;

    /* renamed from: a */
    private final String f135684a;

    /* renamed from: b */
    private final SharedPreferences f135685b;

    /* renamed from: c */
    private final String f135686c;

    /* renamed from: d */
    private final String f135687d;

    /* renamed from: e */
    private final String f135688e;

    /* renamed from: f */
    private final String f135689f;

    /* renamed from: g */
    private final String f135690g;

    /* renamed from: h */
    private final String f135691h;

    /* renamed from: i */
    private final String f135692i;

    /* renamed from: j */
    private final C24329j f135693j;

    /* renamed from: k */
    private final String f135694k;

    /* renamed from: l */
    private final String f135695l;

    /* renamed from: m */
    private final String f135696m;

    /* renamed from: n */
    private final String f135697n;

    /* renamed from: o */
    private final String f135698o;

    /* renamed from: p */
    private User f135699p;

    /* renamed from: q */
    private Channel f135700q;

    /* renamed from: r */
    private ChannelConfig f135701r;

    /* renamed from: s */
    private boolean f135702s;

    /* renamed from: t */
    private String f135703t;

    /* renamed from: u */
    private Set f135704u;

    /* renamed from: v */
    private Set f135705v;

    /* renamed from: w */
    private Set f135706w;

    /* renamed from: x */
    private Set f135707x;

    /* renamed from: y */
    private final String f135708y;

    /* renamed from: z */
    private final String f135709z;

    /* renamed from: x00.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x00.c$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f135710t;

        /* renamed from: u */
        Object f135711u;

        /* renamed from: v */
        int f135712v;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0095 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C29282c c29282c;
            InterfaceC30248b interfaceC30248b;
            C29282c c29282c2;
            InterfaceC30248b interfaceC30248b2;
            Object mo50540C;
            C29282c c29282c3;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f135712v;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            c29282c3 = (C29282c) this.f135710t;
                            AbstractC24862s.m129228b(obj);
                            c29282c3.f135701r = (ChannelConfig) obj;
                            C29282c.this.f135702s = true;
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c29282c2 = (C29282c) this.f135711u;
                    interfaceC30248b2 = (InterfaceC30248b) this.f135710t;
                    AbstractC24862s.m129228b(obj);
                    c29282c2.f135700q = (Channel) obj;
                    C29282c c29282c4 = C29282c.this;
                    this.f135710t = c29282c4;
                    this.f135711u = null;
                    this.f135712v = 3;
                    mo50540C = interfaceC30248b2.mo50540C(this);
                    if (mo50540C != m142578e) {
                        return m142578e;
                    }
                    c29282c3 = c29282c4;
                    obj = mo50540C;
                    c29282c3.f135701r = (ChannelConfig) obj;
                    C29282c.this.f135702s = true;
                    return C24848g0.f119245a;
                }
                c29282c = (C29282c) this.f135711u;
                interfaceC30248b = (InterfaceC30248b) this.f135710t;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                if (C29282c.this.f135685b.contains("zch_session") && !C29282c.this.f135702s) {
                    InterfaceC30248b m143685s = AbstractC28684a.Companion.m143685s();
                    c29282c = C29282c.this;
                    this.f135710t = m143685s;
                    this.f135711u = c29282c;
                    this.f135712v = 1;
                    Object mo50543F = m143685s.mo50543F(this);
                    if (mo50543F == m142578e) {
                        return m142578e;
                    }
                    interfaceC30248b = m143685s;
                    obj = mo50543F;
                } else {
                    return C24848g0.f119245a;
                }
            }
            c29282c.f135699p = (User) obj;
            c29282c2 = C29282c.this;
            this.f135710t = interfaceC30248b;
            this.f135711u = c29282c2;
            this.f135712v = 2;
            obj = interfaceC30248b.mo50538A(this);
            if (obj == m142578e) {
                return m142578e;
            }
            interfaceC30248b2 = interfaceC30248b;
            c29282c2.f135700q = (Channel) obj;
            C29282c c29282c42 = C29282c.this;
            this.f135710t = c29282c42;
            this.f135711u = null;
            this.f135712v = 3;
            mo50540C = interfaceC30248b2.mo50540C(this);
            if (mo50540C != m142578e) {
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C29282c(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f135684a = "zchannel_cache";
        this.f135685b = context.getSharedPreferences("zchannel_cache", 0);
        this.f135686c = "keyboardHeight";
        this.f135687d = "adVersion";
        this.f135688e = "lastCommentIdentityType";
        this.f135689f = "showUserGuideSwipeLeft";
        this.f135690g = "notSwipeUpSessionCount";
        this.f135691h = "autoScrollVideo";
        this.f135692i = "search_history";
        this.f135693j = new C24329j("\\*+");
        this.f135694k = "oldCategoriesNotiValue";
        this.f135695l = "showReddotIcProfile";
        this.f135696m = "showReddotChannelNoti";
        this.f135697n = "showReddotUserNoti";
        this.f135698o = "showReddotNotiByCategories";
        this.f135703t = "";
        this.f135706w = new LinkedHashSet();
        this.f135707x = new LinkedHashSet();
        this.f135708y = "recentShareOption";
        this.f135709z = "newVideoTooltipInfo";
        this.f135683A = "saveShownToastTime";
    }

    /* renamed from: i0 */
    private final void m146359i0() {
        List<String> m131505m;
        List<String> m131505m2;
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        m131505m = AbstractC25368s.m131505m("22", "23", "24", "20", "11", "30", "31");
        for (String str : m131505m) {
            edit.remove(this.f135694k + "_" + str);
        }
        edit.remove(this.f135695l);
        edit.remove(this.f135696m);
        edit.remove(this.f135697n);
        m131505m2 = AbstractC25368s.m131505m("22", "23", "24", "20", "11", "30", "31");
        for (String str2 : m131505m2) {
            edit.remove(this.f135698o + "_" + str2);
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m146360j0(C29282c c29282c) {
        AbstractC19074t.m100208f(c29282c, "this$0");
        BuildersKt__BuildersKt.m112536b(null, new b(null), 1, null);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: A */
    public void mo146299A(boolean z11) {
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putBoolean(this.f135691h, z11);
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: B */
    public void mo146300B(int i11) {
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putInt(this.f135689f, i11);
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: C */
    public int mo146301C() {
        return this.f135685b.getInt(this.f135687d, 0);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: D */
    public void mo146302D(boolean z11) {
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putBoolean(this.f135696m, z11);
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: E */
    public void mo146303E(int i11) {
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putInt(this.f135690g, i11);
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: F */
    public boolean mo146304F() {
        return this.f135685b.getBoolean(this.f135697n, false);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: G */
    public void mo146305G(String str) {
        AbstractC19074t.m100208f(str, "toastId");
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putLong(this.f135683A + "_" + str, System.currentTimeMillis());
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: H */
    public String mo146306H() {
        if (!AbstractC19074t.m100204b(CoreUtility.f89233i, this.f135685b.getString("zch_zid", null))) {
            return null;
        }
        return this.f135685b.getString("zch_session", null);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: I */
    public void mo146307I() {
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putString("zch_session", "");
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: J */
    public void mo146308J() {
        this.f135704u = null;
        this.f135705v = null;
        this.f135706w.clear();
        this.f135707x.clear();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: K */
    public void mo146309K(String str) {
        AbstractC19074t.m100208f(str, "info");
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putString(this.f135709z, str);
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: L */
    public boolean mo146310L(AuthInfo authInfo) {
        boolean z11;
        AbstractC19074t.m100208f(authInfo, "data");
        String string = this.f135685b.getString("zch_zid", null);
        String str = CoreUtility.f89233i;
        if (string != null && !AbstractC19074t.m100204b(string, str)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            m146359i0();
        }
        this.f135699p = authInfo.m51521c();
        this.f135700q = authInfo.m51519a();
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putString("zch_zid", str);
        edit.putString("zch_session", authInfo.m51520b());
        edit.apply();
        return z11;
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: M */
    public void mo146311M(Channel channel) {
        if (channel == null) {
            return;
        }
        this.f135700q = channel;
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: N */
    public int mo146312N() {
        return this.f135685b.getInt(this.f135688e, 1);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: O */
    public void mo146313O(String str) {
        AbstractC19074t.m100208f(str, "id");
        this.f135707x.add(str);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: P */
    public int mo146314P() {
        return this.f135685b.getInt(this.f135686c, 0);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: Q */
    public void mo146315Q(boolean z11) {
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putBoolean(this.f135695l, z11);
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: R */
    public void mo146316R(String str) {
        Set m131553g;
        AbstractC19074t.m100208f(str, "id");
        Set set = this.f135704u;
        if (set == null) {
            m131553g = AbstractC25379x0.m131553g(str);
            this.f135704u = m131553g;
        } else if (set != null) {
            set.add(str);
        }
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: S */
    public void mo146317S(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        mo146318T(str);
        String string = this.f135685b.getString(this.f135692i, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            arrayList.addAll(this.f135693j.m127021i(string, 0));
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            str = ((Object) str) + "*" + arrayList.get(i11);
            if (i11 + 2 == 10) {
                break;
            }
        }
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putString(this.f135692i, str);
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: T */
    public void mo146318T(String str) {
        String str2 = null;
        if (str == null) {
            SharedPreferences sharedPreferences = this.f135685b;
            AbstractC19074t.m100207e(sharedPreferences, "sharePref");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            AbstractC19074t.m100207e(edit, "editor");
            edit.putString(this.f135692i, null);
            edit.apply();
            return;
        }
        String string = this.f135685b.getString(this.f135692i, null);
        if (string == null) {
            return;
        }
        int i11 = 0;
        ArrayList arrayList = new ArrayList(this.f135693j.m127021i(string, 0));
        arrayList.remove(str);
        String str3 = "";
        for (Object obj : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            String str4 = (String) obj;
            if (i11 != 0) {
                str4 = "*" + str4;
            }
            str3 = ((Object) str3) + str4;
            i11 = i12;
        }
        SharedPreferences sharedPreferences2 = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences2, "sharePref");
        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
        AbstractC19074t.m100207e(edit2, "editor");
        String str5 = this.f135692i;
        if (str3.length() != 0) {
            str2 = str3;
        }
        edit2.putString(str5, str2);
        edit2.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: U */
    public String mo146319U() {
        return this.f135685b.getString(this.f135709z, null);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: V */
    public boolean mo146320V() {
        if (!AbstractC19074t.m100204b(CoreUtility.f89233i, this.f135685b.getString("zch_zid", null))) {
            return false;
        }
        return this.f135685b.getBoolean(this.f135695l, false);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: W */
    public Integer mo146321W() {
        Set set = this.f135704u;
        if (set != null) {
            return Integer.valueOf(set.size());
        }
        return null;
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: X */
    public long mo146322X(String str) {
        AbstractC19074t.m100208f(str, "toastId");
        return this.f135685b.getLong(this.f135683A + "_" + str, 0L);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: Y */
    public void mo146323Y() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: x00.b
            @Override // java.lang.Runnable
            public final void run() {
                C29282c.m146360j0(C29282c.this);
            }
        });
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: Z */
    public void mo146324Z(boolean z11) {
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putBoolean(this.f135697n, z11);
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: a */
    public ChannelConfig mo146325a() {
        return this.f135701r;
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: a0 */
    public void mo146326a0(int i11) {
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putInt(this.f135688e, i11);
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: b */
    public User mo146327b() {
        return this.f135699p;
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: c */
    public boolean mo146328c() {
        return this.f135685b.getBoolean(this.f135691h, false);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: d */
    public boolean mo146329d(String str) {
        AbstractC19074t.m100208f(str, "id");
        return this.f135706w.contains(str);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: e */
    public void mo146330e(long j11, String str) {
        AbstractC19074t.m100208f(str, "id");
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putLong(this.f135694k + "_" + str, j11);
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: f */
    public int mo146331f() {
        return this.f135685b.getInt(this.f135689f, 2);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: g */
    public boolean mo146332g() {
        return this.f135685b.getBoolean(this.f135696m, false);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: h */
    public void mo146333h(String str) {
        AbstractC19074t.m100208f(str, "option");
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putString(this.f135708y, str);
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: i */
    public void mo146334i(int i11) {
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putInt(this.f135687d, i11);
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: j */
    public void mo146335j(boolean z11, String str) {
        AbstractC19074t.m100208f(str, "id");
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putBoolean(this.f135697n + "_" + str, z11);
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: k */
    public void mo146336k(User user) {
        AbstractC19074t.m100208f(user, "user");
        this.f135699p = user;
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: l */
    public void mo146337l(String str) {
        Set m131553g;
        AbstractC19074t.m100208f(str, "id");
        Set set = this.f135705v;
        if (set == null) {
            m131553g = AbstractC25379x0.m131553g(str);
            this.f135705v = m131553g;
        } else if (set != null) {
            set.add(str);
        }
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: m */
    public List mo146338m() {
        List m127021i;
        String string = this.f135685b.getString(this.f135692i, null);
        if (string == null || (m127021i = this.f135693j.m127021i(string, 0)) == null) {
            return new ArrayList();
        }
        return m127021i;
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: n */
    public void mo146339n(String str) {
        AbstractC19074t.m100208f(str, "domain");
        this.f135703t = str;
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: o */
    public void mo146340o(int i11) {
        SharedPreferences sharedPreferences = this.f135685b;
        AbstractC19074t.m100207e(sharedPreferences, "sharePref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        AbstractC19074t.m100207e(edit, "editor");
        edit.putInt(this.f135686c, i11);
        edit.apply();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: p */
    public String mo146341p() {
        return this.f135685b.getString(this.f135708y, null);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: q */
    public Channel mo146342q() {
        return this.f135700q;
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: r */
    public String mo146343r() {
        String str;
        LivestreamConfig m51427d;
        ChannelConfig mo146325a = mo146325a();
        if (mo146325a != null && (m51427d = mo146325a.m51427d()) != null) {
            str = m51427d.m51473a();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0 && !AbstractC19074t.m100204b(this.f135703t, str)) {
            this.f135703t = str;
        }
        return this.f135703t;
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: s */
    public void mo146344s() {
        Set set = this.f135705v;
        if (set != null) {
            if (set != null) {
                set.clear();
                return;
            }
            return;
        }
        this.f135705v = new LinkedHashSet();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: t */
    public void mo146345t() {
        Set set = this.f135704u;
        if (set != null) {
            if (set != null) {
                set.clear();
                return;
            }
            return;
        }
        this.f135704u = new LinkedHashSet();
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: u */
    public int mo146346u() {
        return this.f135685b.getInt(this.f135690g, Integer.MIN_VALUE);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: v */
    public boolean mo146347v(String str) {
        AbstractC19074t.m100208f(str, "id");
        return this.f135685b.getBoolean(this.f135697n + "_" + str, false);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: w */
    public long mo146348w(String str) {
        AbstractC19074t.m100208f(str, "id");
        return this.f135685b.getLong(this.f135694k + "_" + str, -1L);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: x */
    public void mo146349x(String str) {
        AbstractC19074t.m100208f(str, "id");
        this.f135706w.add(str);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: y */
    public boolean mo146350y(String str) {
        AbstractC19074t.m100208f(str, "id");
        return this.f135707x.contains(str);
    }

    @Override // x00.InterfaceC29280a
    /* renamed from: z */
    public Integer mo146351z() {
        Set set = this.f135705v;
        if (set != null) {
            return Integer.valueOf(set.size());
        }
        return null;
    }
}
