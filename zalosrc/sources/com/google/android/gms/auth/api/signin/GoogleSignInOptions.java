package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031b5.AbstractC2552a;
import p517t4.AbstractC26477c;
import p537u4.C27008a;

/* loaded from: classes2.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements C4071a.d, ReflectedParcelable {

    /* renamed from: A */
    public static final GoogleSignInOptions f16048A;

    /* renamed from: B */
    public static final GoogleSignInOptions f16049B;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: F */
    public static final Scope f16053F;

    /* renamed from: G */
    public static final Scope f16054G;

    /* renamed from: H */
    private static Comparator f16055H;

    /* renamed from: p */
    final int f16056p;

    /* renamed from: q */
    private final ArrayList f16057q;

    /* renamed from: r */
    private Account f16058r;

    /* renamed from: s */
    private boolean f16059s;

    /* renamed from: t */
    private final boolean f16060t;

    /* renamed from: u */
    private final boolean f16061u;

    /* renamed from: v */
    private String f16062v;

    /* renamed from: w */
    private String f16063w;

    /* renamed from: x */
    private ArrayList f16064x;

    /* renamed from: y */
    private String f16065y;

    /* renamed from: z */
    private Map f16066z;

    /* renamed from: C */
    public static final Scope f16050C = new Scope("profile");

    /* renamed from: D */
    public static final Scope f16051D = new Scope("email");

    /* renamed from: E */
    public static final Scope f16052E = new Scope("openid");

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f16053F = scope;
        f16054G = new Scope("https://www.googleapis.com/auth/games");
        C4038a c4038a = new C4038a();
        c4038a.m19126b();
        c4038a.m19127c();
        f16048A = c4038a.m19125a();
        C4038a c4038a2 = new C4038a();
        c4038a2.m19128d(scope, new Scope[0]);
        f16049B = c4038a2.m19125a();
        CREATOR = new C4043e();
        f16055H = new C4042d();
    }

    /* synthetic */ GoogleSignInOptions(int i11, ArrayList arrayList, Account account, boolean z11, boolean z12, boolean z13, String str, String str2, Map map, String str3, AbstractC26477c abstractC26477c) {
        this(3, arrayList, account, z11, z12, z13, str, str2, map, str3);
    }

    /* renamed from: D0 */
    public static GoogleSignInOptions m19104D0(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            hashSet.add(new Scope(jSONArray.getString(i11)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z11 = jSONObject.getBoolean("idTokenRequested");
        boolean z12 = jSONObject.getBoolean("serverAuthRequested");
        boolean z13 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z11, z12, z13, str3, str4, new HashMap(), (String) null);
    }

    /* renamed from: O0 */
    public static Map m19114O0(List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.m19136t()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    /* renamed from: F */
    public ArrayList m19116F() {
        return this.f16064x;
    }

    /* renamed from: H0 */
    public final String m19117H0() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f16057q, f16055H);
            Iterator it = this.f16057q.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).m19219t());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f16058r;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f16059s);
            jSONObject.put("forceCodeForRefreshToken", this.f16061u);
            jSONObject.put("serverAuthRequested", this.f16060t);
            if (!TextUtils.isEmpty(this.f16062v)) {
                jSONObject.put("serverClientId", this.f16062v);
            }
            if (!TextUtils.isEmpty(this.f16063w)) {
                jSONObject.put("hostedDomain", this.f16063w);
            }
            return jSONObject.toString();
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* renamed from: J */
    public String m19118J() {
        return this.f16065y;
    }

    /* renamed from: K */
    public ArrayList m19119K() {
        return new ArrayList(this.f16057q);
    }

    /* renamed from: M */
    public String m19120M() {
        return this.f16062v;
    }

    /* renamed from: Q */
    public boolean m19121Q() {
        return this.f16061u;
    }

    /* renamed from: Z */
    public boolean m19122Z() {
        return this.f16059s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:            if (r1.equals(r4.m19124t()) != false) goto L66;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f16064x.size() <= 0 && googleSignInOptions.f16064x.size() <= 0 && this.f16057q.size() == googleSignInOptions.m19119K().size() && this.f16057q.containsAll(googleSignInOptions.m19119K())) {
                Account account = this.f16058r;
                if (account == null) {
                    if (googleSignInOptions.m19124t() == null) {
                    }
                }
                if (TextUtils.isEmpty(this.f16062v)) {
                    if (TextUtils.isEmpty(googleSignInOptions.m19120M())) {
                    }
                } else if (!this.f16062v.equals(googleSignInOptions.m19120M())) {
                }
                if (this.f16061u == googleSignInOptions.m19121Q() && this.f16059s == googleSignInOptions.m19122Z() && this.f16060t == googleSignInOptions.m19123i0()) {
                    if (TextUtils.equals(this.f16065y, googleSignInOptions.m19118J())) {
                        return true;
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f16057q;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((Scope) arrayList2.get(i11)).m19219t());
        }
        Collections.sort(arrayList);
        C27008a c27008a = new C27008a();
        c27008a.m139140a(arrayList);
        c27008a.m139140a(this.f16058r);
        c27008a.m139140a(this.f16062v);
        c27008a.m139142c(this.f16061u);
        c27008a.m139142c(this.f16059s);
        c27008a.m139142c(this.f16060t);
        c27008a.m139140a(this.f16065y);
        return c27008a.m139141b();
    }

    /* renamed from: i0 */
    public boolean m19123i0() {
        return this.f16060t;
    }

    /* renamed from: t */
    public Account m19124t() {
        return this.f16058r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16056p);
        AbstractC2552a.m12907A(parcel, 2, m19119K(), false);
        AbstractC2552a.m12932u(parcel, 3, m19124t(), i11, false);
        AbstractC2552a.m12914c(parcel, 4, m19122Z());
        AbstractC2552a.m12914c(parcel, 5, m19123i0());
        AbstractC2552a.m12914c(parcel, 6, m19121Q());
        AbstractC2552a.m12934w(parcel, 7, m19120M(), false);
        AbstractC2552a.m12934w(parcel, 8, this.f16063w, false);
        AbstractC2552a.m12907A(parcel, 9, m19116F(), false);
        AbstractC2552a.m12934w(parcel, 10, m19118J(), false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    /* loaded from: classes2.dex */
    public static final class C4038a {

        /* renamed from: a */
        private Set f16067a;

        /* renamed from: b */
        private boolean f16068b;

        /* renamed from: c */
        private boolean f16069c;

        /* renamed from: d */
        private boolean f16070d;

        /* renamed from: e */
        private String f16071e;

        /* renamed from: f */
        private Account f16072f;

        /* renamed from: g */
        private String f16073g;

        /* renamed from: h */
        private Map f16074h;

        /* renamed from: i */
        private String f16075i;

        public C4038a() {
            this.f16067a = new HashSet();
            this.f16074h = new HashMap();
        }

        /* renamed from: a */
        public GoogleSignInOptions m19125a() {
            if (this.f16067a.contains(GoogleSignInOptions.f16054G)) {
                Set set = this.f16067a;
                Scope scope = GoogleSignInOptions.f16053F;
                if (set.contains(scope)) {
                    this.f16067a.remove(scope);
                }
            }
            if (this.f16070d && (this.f16072f == null || !this.f16067a.isEmpty())) {
                m19126b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f16067a), this.f16072f, this.f16070d, this.f16068b, this.f16069c, this.f16071e, this.f16073g, this.f16074h, this.f16075i);
        }

        /* renamed from: b */
        public C4038a m19126b() {
            this.f16067a.add(GoogleSignInOptions.f16052E);
            return this;
        }

        /* renamed from: c */
        public C4038a m19127c() {
            this.f16067a.add(GoogleSignInOptions.f16050C);
            return this;
        }

        /* renamed from: d */
        public C4038a m19128d(Scope scope, Scope... scopeArr) {
            this.f16067a.add(scope);
            this.f16067a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: e */
        public C4038a m19129e(String str) {
            this.f16075i = str;
            return this;
        }

        public C4038a(GoogleSignInOptions googleSignInOptions) {
            this.f16067a = new HashSet();
            this.f16074h = new HashMap();
            AbstractC4205o.m19722k(googleSignInOptions);
            this.f16067a = new HashSet(googleSignInOptions.f16057q);
            this.f16068b = googleSignInOptions.f16060t;
            this.f16069c = googleSignInOptions.f16061u;
            this.f16070d = googleSignInOptions.f16059s;
            this.f16071e = googleSignInOptions.f16062v;
            this.f16072f = googleSignInOptions.f16058r;
            this.f16073g = googleSignInOptions.f16063w;
            this.f16074h = GoogleSignInOptions.m19114O0(googleSignInOptions.f16064x);
            this.f16075i = googleSignInOptions.f16065y;
        }
    }

    public GoogleSignInOptions(int i11, ArrayList arrayList, Account account, boolean z11, boolean z12, boolean z13, String str, String str2, ArrayList arrayList2, String str3) {
        this(i11, arrayList, account, z11, z12, z13, str, str2, m19114O0(arrayList2), str3);
    }

    private GoogleSignInOptions(int i11, ArrayList arrayList, Account account, boolean z11, boolean z12, boolean z13, String str, String str2, Map map, String str3) {
        this.f16056p = i11;
        this.f16057q = arrayList;
        this.f16058r = account;
        this.f16059s = z11;
        this.f16060t = z12;
        this.f16061u = z13;
        this.f16062v = str;
        this.f16063w = str2;
        this.f16064x = new ArrayList(map.values());
        this.f16066z = map;
        this.f16065y = str3;
    }
}
