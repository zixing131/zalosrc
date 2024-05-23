package l30;

import android.os.Bundle;
import android.text.TextUtils;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.List;
import l30.C22033k0;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p173fz.C19172a;
import p304ks.AbstractC21935u;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p716zh.C31890dc;
import p716zh.C31980jc;
import p716zh.C32123ta;

/* renamed from: l30.k0 */
/* loaded from: classes5.dex */
public class C22033k0 {

    /* renamed from: k */
    static volatile C22033k0 f108500k;

    /* renamed from: e */
    h f108505e;

    /* renamed from: f */
    i f108506f;

    /* renamed from: h */
    int f108508h;

    /* renamed from: a */
    boolean f108501a = false;

    /* renamed from: b */
    boolean f108502b = false;

    /* renamed from: c */
    boolean f108503c = false;

    /* renamed from: d */
    boolean f108504d = false;

    /* renamed from: i */
    boolean f108509i = false;

    /* renamed from: j */
    Runnable f108510j = new f();

    /* renamed from: g */
    C23528a f108507g = new C23528a(MainApplication.getAppContext());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l30.k0$a */
    /* loaded from: classes5.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f108511a;

        /* renamed from: b */
        final /* synthetic */ h f108512b;

        /* renamed from: c */
        final /* synthetic */ C31980jc f108513c;

        /* renamed from: d */
        final /* synthetic */ String f108514d;

        /* renamed from: e */
        final /* synthetic */ String f108515e;

        a(String str, h hVar, C31980jc c31980jc, String str2, String str3) {
            this.f108511a = str;
            this.f108512b = hVar;
            this.f108513c = c31980jc;
            this.f108514d = str2;
            this.f108515e = str3;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                if (C22033k0.this.m115015j(this.f108514d, this.f108515e)) {
                    this.f108512b.mo17219e(false);
                    C31980jc c31980jc = (C31980jc) C22021e0.f108428l.get(this.f108514d);
                    if (c31980jc != null && c31980jc.f147031x != null) {
                        String str = this.f108513c.f147021F;
                        for (int i11 = 0; i11 < c31980jc.f147031x.size(); i11++) {
                            if (TextUtils.equals(((C32123ta) c31980jc.f147031x.get(i11)).f148138h, str)) {
                                c31980jc.m153820f(this.f108513c);
                                this.f108513c.f147017B = i11;
                                C22033k0 c22033k0 = C22033k0.this;
                                c22033k0.f108501a = true;
                                c22033k0.f108502b = true;
                                c22033k0.m115014i(this.f108512b);
                                return;
                            }
                        }
                    }
                    C22033k0 c22033k02 = C22033k0.this;
                    c22033k02.f108504d = false;
                    c22033k02.f108501a = false;
                    c22033k02.f108502b = false;
                    c22033k02.f108503c = false;
                    if (c20096c != null && c20096c.m104491c() == 5001) {
                        C22033k0.this.m115016p(MainApplication.getAppContext().getString(AbstractC8020f0.str_story_load_fail), g.ERROR_CODE_STORY_VIEWER_BLOCKED);
                    } else {
                        C22033k0.this.m115016p(MainApplication.getAppContext().getString(AbstractC8020f0.str_story_load_fail), g.ERROR_CODE_STORY_LOAD_FAIL);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("list");
                if (optJSONArray != null) {
                    boolean z11 = false;
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        if (this.f108511a.equals(optJSONArray.getString(i11))) {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        if (C22033k0.this.m115015j(this.f108514d, this.f108515e)) {
                            C22033k0 c22033k0 = C22033k0.this;
                            c22033k0.f108501a = true;
                            c22033k0.m115014i(this.f108512b);
                            return;
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(this.f108512b.mo17217c()) && !CoreUtility.f89233i.equals(this.f108512b.mo17216b())) {
                    C22033k0.this.m115016p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_story_error_deleted_new, AbstractC21935u.m114542i(this.f108512b.mo17216b(), this.f108512b.mo17217c())), g.ERROR_CODE_STORY_DELETED_OR_EXPIRED);
                } else {
                    C22033k0.this.m115016p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_error_deleted), g.ERROR_CODE_STORY_DELETED_OR_EXPIRED);
                }
                this.f108513c.m153822n(this.f108511a);
                this.f108512b.mo17219e(false);
                C22033k0 c22033k02 = C22033k0.this;
                c22033k02.f108505e = null;
                c22033k02.m115013g();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: l30.k0$b */
    /* loaded from: classes5.dex */
    public class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f108517a;

        /* renamed from: b */
        final /* synthetic */ String f108518b;

        /* renamed from: c */
        final /* synthetic */ h f108519c;

        b(String str, String str2, h hVar) {
            this.f108517a = str;
            this.f108518b = str2;
            this.f108519c = hVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (C22033k0.this.m115015j(this.f108517a, this.f108518b)) {
                C22033k0 c22033k0 = C22033k0.this;
                c22033k0.f108502b = true;
                c22033k0.m115014i(this.f108519c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (C22033k0.this.m115015j(this.f108517a, this.f108518b)) {
                C22033k0 c22033k0 = C22033k0.this;
                c22033k0.f108502b = true;
                c22033k0.m115014i(this.f108519c);
            }
        }
    }

    /* renamed from: l30.k0$c */
    /* loaded from: classes5.dex */
    public class c implements InterfaceC22016c {

        /* renamed from: a */
        final /* synthetic */ C31980jc f108521a;

        /* renamed from: b */
        final /* synthetic */ C32123ta f108522b;

        c(C31980jc c31980jc, C32123ta c32123ta) {
            this.f108521a = c31980jc;
            this.f108522b = c32123ta;
        }

        @Override // l30.InterfaceC22016c
        /* renamed from: a */
        public void mo114938a() {
            C22033k0.this.m115012u(this.f108521a, this.f108522b);
        }

        @Override // l30.InterfaceC22016c
        /* renamed from: b */
        public void mo114939b() {
            C22033k0.this.m115012u(this.f108521a, this.f108522b);
        }

        @Override // l30.InterfaceC22016c
        /* renamed from: c */
        public void mo114940c() {
            C22033k0.this.m115012u(this.f108521a, this.f108522b);
        }
    }

    /* renamed from: l30.k0$d */
    /* loaded from: classes5.dex */
    public class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f108524a;

        /* renamed from: b */
        final /* synthetic */ String f108525b;

        /* renamed from: c */
        final /* synthetic */ C31980jc f108526c;

        d(String str, String str2, C31980jc c31980jc) {
            this.f108524a = str;
            this.f108525b = str2;
            this.f108526c = c31980jc;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                try {
                    if (c20096c.m104491c() == 5001) {
                        C22033k0.this.m115016p(MainApplication.getAppContext().getString(AbstractC8020f0.str_story_load_fail), g.ERROR_CODE_STORY_VIEWER_BLOCKED);
                        C22033k0.this.f108505e = null;
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    return;
                }
            }
            if (AbstractC22055v0.m115111A(c20096c)) {
                C22033k0.this.m115016p(MainApplication.getAppContext().getString(AbstractC8020f0.str_story_load_fail), g.ERROR_CODE_NOT_KYC);
                C22033k0.this.f108505e = null;
            } else if (C22033k0.this.m115015j(this.f108524a, this.f108525b)) {
                C31980jc c31980jc = this.f108526c;
                if (c31980jc.f147017B < c31980jc.f147031x.size()) {
                    C22033k0 c22033k0 = C22033k0.this;
                    c22033k0.f108501a = true;
                    c22033k0.m115014i(this.f108526c);
                } else {
                    this.f108526c.mo17219e(false);
                    C22033k0 c22033k02 = C22033k0.this;
                    c22033k02.f108504d = false;
                    c22033k02.f108502b = false;
                    c22033k02.f108501a = false;
                    c22033k02.f108503c = false;
                    c22033k02.m115016p(MainApplication.getAppContext().getString(AbstractC8020f0.str_story_load_fail), g.ERROR_CODE_STORY_LOAD_FAIL);
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                if (C22033k0.this.m115015j(this.f108524a, this.f108525b)) {
                    C31980jc c31980jc = this.f108526c;
                    if (c31980jc.f147017B < c31980jc.f147031x.size()) {
                        C22033k0 c22033k0 = C22033k0.this;
                        c22033k0.f108501a = true;
                        c22033k0.m115014i(this.f108526c);
                    } else {
                        this.f108526c.mo17219e(false);
                        C22033k0 c22033k02 = C22033k0.this;
                        c22033k02.f108504d = false;
                        c22033k02.f108502b = false;
                        c22033k02.f108501a = false;
                        c22033k02.f108503c = false;
                        if (!CoreUtility.f89233i.equals(this.f108524a)) {
                            C22033k0 c22033k03 = C22033k0.this;
                            int i11 = AbstractC8020f0.str_story_error_deleted_new;
                            C31980jc c31980jc2 = this.f108526c;
                            c22033k03.m115016p(AbstractC23136l9.m118746s0(i11, AbstractC21935u.m114542i(c31980jc2.f147023p, c31980jc2.f147024q)), g.ERROR_CODE_STORY_DELETED_OR_EXPIRED);
                        } else {
                            C22033k0.this.m115016p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_error_deleted), g.ERROR_CODE_STORY_DELETED_OR_EXPIRED);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: l30.k0$e */
    /* loaded from: classes5.dex */
    public class e extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ long f108528l1;

        e(long j11) {
            this.f108528l1 = j11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (System.currentTimeMillis() - this.f108528l1 < 2000) {
                AbstractC19444a.m101696d(C22033k0.this.f108510j);
                AbstractC19444a.m101695c(C22033k0.this.f108510j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l30.k0$f */
    /* loaded from: classes5.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C22033k0.this.f108505e.mo17219e(false);
                C22033k0 c22033k0 = C22033k0.this;
                c22033k0.f108502b = false;
                c22033k0.f108501a = false;
                c22033k0.f108504d = false;
                c22033k0.f108503c = false;
                i iVar = c22033k0.f108506f;
                if (iVar != null) {
                    iVar.mo45897O();
                }
                Bundle bundle = new Bundle();
                C22033k0 c22033k02 = C22033k0.this;
                int i11 = c22033k02.f108508h;
                if (i11 == 0) {
                    bundle.putBoolean("extra_show_unseen_story", c22033k02.f108505e.mo17222i());
                    bundle.putBoolean("EXTRA_FLAG_VIEW_SELECTED_USER_STORY_ONLY", C22033k0.this.f108509i);
                    bundle.putString("extra_uid", C22033k0.this.f108505e.mo17216b());
                } else {
                    bundle.putInt("extra_view_mode", i11);
                    bundle.putString("extra_uid", C22033k0.this.f108505e.mo17216b());
                    bundle.putString("extra_story_id", C22033k0.this.f108505e.mo17218d());
                }
                C22033k0 c22033k03 = C22033k0.this;
                i iVar2 = c22033k03.f108506f;
                if (iVar2 != null) {
                    iVar2.mo45899b(bundle, c22033k03.f108505e);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: l30.k0$g */
    /* loaded from: classes5.dex */
    public enum g {
        ERROR_CODE_STORY_LOAD_FAIL,
        ERROR_CODE_STORY_DELETED_OR_EXPIRED,
        ERROR_CODE_STORY_VIEWER_BLOCKED,
        ERROR_CODE_NOT_KYC
    }

    /* renamed from: l30.k0$h */
    /* loaded from: classes5.dex */
    public interface h {
        /* renamed from: b */
        String mo17216b();

        /* renamed from: c */
        String mo17217c();

        /* renamed from: d */
        String mo17218d();

        /* renamed from: e */
        void mo17219e(boolean z11);

        /* renamed from: g */
        String mo17220g();

        /* renamed from: h */
        boolean mo17221h();

        /* renamed from: i */
        boolean mo17222i();

        /* renamed from: j */
        C32123ta mo17223j();

        /* renamed from: m */
        boolean mo17224m();

        /* renamed from: q */
        void mo17227q();
    }

    /* renamed from: l30.k0$i */
    /* loaded from: classes5.dex */
    public interface i {
        /* renamed from: O */
        void mo45897O();

        /* renamed from: a */
        void mo45898a(String str, g gVar);

        /* renamed from: b */
        void mo45899b(Bundle bundle, h hVar);
    }

    C22033k0() {
    }

    /* renamed from: h */
    public static synchronized C22033k0 m115006h() {
        C22033k0 c22033k0;
        synchronized (C22033k0.class) {
            try {
                if (f108500k == null) {
                    f108500k = new C22033k0();
                }
                c22033k0 = f108500k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c22033k0;
    }

    /* renamed from: k */
    public /* synthetic */ void m115007k() {
        i iVar = this.f108506f;
        if (iVar != null) {
            iVar.mo45897O();
        }
    }

    /* renamed from: l */
    public /* synthetic */ void m115008l(long j11, int i11, String str, C31890dc c31890dc) {
        if (System.currentTimeMillis() - j11 < 2000) {
            AbstractC19444a.m101696d(this.f108510j);
            AbstractC19444a.m101695c(this.f108510j);
        }
    }

    /* renamed from: m */
    public /* synthetic */ void m115009m(String str, g gVar) {
        i iVar = this.f108506f;
        if (iVar != null) {
            iVar.mo45898a(str, gVar);
        }
    }

    /* renamed from: n */
    public /* synthetic */ void m115010n(C31980jc c31980jc, String str, String str2, h hVar) {
        C22021e0.m114963p().m114992o(c31980jc.f147023p, new b(str, str2, hVar));
    }

    /* renamed from: o */
    public /* synthetic */ void m115011o(C32123ta c32123ta, C31980jc c31980jc) {
        if (c32123ta != null && (c31980jc.f147020E != 0 || !c31980jc.f147019D)) {
            this.f108501a = true;
            m115014i(c31980jc);
        } else {
            C22021e0.m114963p().m114989l(c31980jc.f147023p, new d(c31980jc.mo17216b(), c31980jc.mo17220g(), c31980jc));
        }
    }

    /* renamed from: u */
    public void m115012u(C31980jc c31980jc, C32123ta c32123ta) {
        AbstractC19444a.m101695c(new Runnable() { // from class: l30.f0

            /* renamed from: q */
            public final /* synthetic */ C32123ta f108478q;

            /* renamed from: r */
            public final /* synthetic */ C31980jc f108479r;

            public /* synthetic */ RunnableC22023f0(C32123ta c32123ta2, C31980jc c31980jc2) {
                r2 = c32123ta2;
                r3 = c31980jc2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C22033k0.this.m115011o(r2, r3);
            }
        });
    }

    /* renamed from: g */
    void m115013g() {
        AbstractC19444a.m101695c(new Runnable() { // from class: l30.g0
            public /* synthetic */ RunnableC22025g0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C22033k0.this.m115007k();
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: l30.i0.<init>(l30.k0, long):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: i */
    void m115014i(l30.C22033k0.h r7) {
        /*
            r6 = this;
            boolean r0 = r6.f108501a
            if (r0 == 0) goto Lfe
            boolean r0 = r6.f108502b
            if (r0 == 0) goto Lfe
            boolean r0 = r6.f108503c
            if (r0 != 0) goto Lfe
            r0 = 1
            r6.f108503c = r0
            zh.ta r1 = r7.mo17223j()
            if (r1 == 0) goto Lb5
            n3.a r2 = r6.f108507g
            boolean r2 = r1.m155071K(r2)
            if (r2 == 0) goto L2c
            java.lang.Runnable r0 = r6.f108510j
            r7.mo17224m()
            r1 = 0
            gg0.AbstractC19444a.m101694b(r0, r1)
            r7.mo17227q()
            goto Lfe
        L2c:
            int r7 = r1.f148140i
            r2 = 2000(0x7d0, double:9.88E-321)
            if (r7 != r0) goto L61
            if (r7 != r0) goto L37
            java.lang.String r7 = r1.f148147m
            goto L39
        L37:
            java.lang.String r7 = r1.f148146l
        L39:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Runnable r4 = r6.f108510j
            gg0.AbstractC19444a.m101694b(r4, r2)
            n3.a r2 = r6.f108507g
            com.androidquery.util.j r3 = new com.androidquery.util.j
            android.content.Context r4 = com.zing.zalo.MainApplication.getAppContext()
            r3.<init>(r4)
            n3.b r2 = r2.m123612r(r3)
            n3.a r2 = (p354n3.C23528a) r2
            o3.n r3 = me0.C23278z2.m120099U0()
            l30.k0$e r4 = new l30.k0$e
            r4.<init>(r0)
            r2.m123579C(r7, r3, r4)
            goto Lfe
        L61:
            boolean r7 = r1.m155070J()
            if (r7 == 0) goto L80
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Runnable r7 = r6.f108510j
            gg0.AbstractC19444a.m101694b(r7, r2)
            zh.ac r7 = p716zh.C31845ac.m152996J()
            int r0 = r1.f148116S
            l30.i0 r1 = new l30.i0
            r1.<init>()
            r7.m153057o0(r0, r1)
            goto Lfe
        L80:
            n3.a r7 = r6.f108507g
            java.lang.String r0 = r1.f148146l
            o3.n r2 = me0.C23278z2.m120123e0()
            r3.a r2 = r2.f116266g
            com.androidquery.util.l r7 = r7.m123610p(r0, r2)
            if (r7 != 0) goto Laa
            n3.a r7 = r6.f108507g
            com.androidquery.util.j r0 = new com.androidquery.util.j
            android.content.Context r2 = com.zing.zalo.MainApplication.getAppContext()
            r0.<init>(r2)
            n3.b r7 = r7.m123612r(r0)
            n3.a r7 = (p354n3.C23528a) r7
            java.lang.String r0 = r1.f148146l
            o3.n r1 = me0.C23278z2.m120105X0()
            r7.m123618x(r0, r1)
        Laa:
            java.lang.Runnable r7 = r6.f108510j
            gg0.AbstractC19444a.m101696d(r7)
            java.lang.Runnable r7 = r6.f108510j
            gg0.AbstractC19444a.m101695c(r7)
            goto Lfe
        Lb5:
            r1 = 0
            r7.mo17219e(r1)
            r6.f108502b = r1
            r6.f108501a = r1
            r6.f108503c = r1
            r6.f108504d = r1
            java.lang.String r2 = r7.mo17217c()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Lf3
            java.lang.String r2 = com.zing.zalocore.CoreUtility.f89233i
            java.lang.String r3 = r7.mo17216b()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lf3
            int r2 = com.zing.zalo.AbstractC8020f0.str_story_error_deleted_new
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = r7.mo17216b()
            java.lang.String r7 = r7.mo17217c()
            java.lang.String r7 = p304ks.AbstractC21935u.m114542i(r3, r7)
            r0[r1] = r7
            java.lang.String r7 = me0.AbstractC23136l9.m118746s0(r2, r0)
            l30.k0$g r0 = l30.C22033k0.g.ERROR_CODE_STORY_DELETED_OR_EXPIRED
            r6.m115016p(r7, r0)
            goto Lfe
        Lf3:
            int r7 = com.zing.zalo.AbstractC8020f0.str_story_error_deleted
            java.lang.String r7 = me0.AbstractC23136l9.m118743r0(r7)
            l30.k0$g r0 = l30.C22033k0.g.ERROR_CODE_STORY_DELETED_OR_EXPIRED
            r6.m115016p(r7, r0)
        Lfe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l30.C22033k0.m115014i(l30.k0$h):void");
    }

    /* renamed from: j */
    boolean m115015j(String str, String str2) {
        h hVar = this.f108505e;
        if (hVar != null && hVar.mo17216b().equals(str) && this.f108505e.mo17220g().equals(str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    void m115016p(String str, g gVar) {
        AbstractC19444a.m101695c(new Runnable() { // from class: l30.h0

            /* renamed from: q */
            public final /* synthetic */ String f108487q;

            /* renamed from: r */
            public final /* synthetic */ C22033k0.g f108488r;

            public /* synthetic */ RunnableC22027h0(String str2, C22033k0.g gVar2) {
                r2 = str2;
                r3 = gVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C22033k0.this.m115009m(r2, r3);
            }
        });
    }

    /* renamed from: q */
    public void m115017q(int i11, h hVar, i iVar) {
        C31980jc c31980jc;
        try {
            this.f108508h = i11;
            this.f108506f = iVar;
            String mo17216b = hVar.mo17216b();
            String mo17218d = hVar.mo17218d();
            String mo17220g = hVar.mo17220g();
            if (m115015j(mo17216b, mo17220g) && this.f108504d) {
                return;
            }
            AbstractC19444a.m101696d(this.f108510j);
            h hVar2 = this.f108505e;
            if (hVar2 != null && hVar2.mo17221h()) {
                this.f108505e.mo17219e(false);
            }
            this.f108504d = true;
            this.f108502b = false;
            this.f108501a = false;
            this.f108503c = false;
            this.f108505e = hVar;
            hVar.mo17219e(true);
            m115013g();
            if (i11 == 4) {
                c31980jc = AbstractC22055v0.m115161u(mo17216b);
            } else {
                c31980jc = new C31980jc(mo17216b, "", "", "", false, false);
            }
            c31980jc.f147021F = mo17218d;
            List list = C22021e0.f108432p;
            list.clear();
            list.add(c31980jc);
            C22021e0.m114963p().m114991n(c31980jc.f147023p, i11, new a(mo17218d, hVar, c31980jc, mo17216b, mo17220g));
            int i12 = this.f108508h;
            if (i12 != 3 && i12 != 4) {
                AbstractC19444a.m101694b(new Runnable() { // from class: l30.j0

                    /* renamed from: q */
                    public final /* synthetic */ C31980jc f108495q;

                    /* renamed from: r */
                    public final /* synthetic */ String f108496r;

                    /* renamed from: s */
                    public final /* synthetic */ String f108497s;

                    /* renamed from: t */
                    public final /* synthetic */ C22033k0.h f108498t;

                    public /* synthetic */ RunnableC22031j0(C31980jc c31980jc2, String mo17216b2, String mo17220g2, C22033k0.h hVar3) {
                        r2 = c31980jc2;
                        r3 = mo17216b2;
                        r4 = mo17220g2;
                        r5 = hVar3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C22033k0.this.m115010n(r2, r3, r4, r5);
                    }
                }, 50L);
            } else {
                this.f108502b = true;
                m115014i(hVar3);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    public void m115018r(C31980jc c31980jc, int i11, i iVar) {
        m115019s(c31980jc, i11, false, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:3:0x0001, B:5:0x0015, B:9:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:16:0x004f, B:19:0x0054, B:21:0x005e, B:22:0x0072, B:24:0x007a, B:26:0x0080, B:28:0x0089, B:31:0x0069), top: B:2:0x0001 }] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m115019s(C31980jc c31980jc, int i11, boolean z11, i iVar) {
        C32123ta c32123ta;
        try {
            this.f108508h = 0;
            this.f108509i = z11;
            this.f108506f = iVar;
            if (m115015j(c31980jc.mo17216b(), c31980jc.mo17220g()) && this.f108504d) {
                return;
            }
            c31980jc.m153817G();
            AbstractC19444a.m101696d(this.f108510j);
            h hVar = this.f108505e;
            if (hVar != null && hVar.mo17221h()) {
                this.f108505e.mo17219e(false);
            }
            this.f108504d = true;
            this.f108502b = true;
            this.f108501a = false;
            this.f108503c = false;
            this.f108505e = c31980jc;
            c31980jc.mo17219e(true);
            m115013g();
            if (!c31980jc.f147023p.equals(CoreUtility.f89233i) && c31980jc.f147020E != 0) {
                if (c31980jc.f147017B < c31980jc.f147031x.size()) {
                    c32123ta = (C32123ta) c31980jc.f147031x.get(c31980jc.f147017B);
                    if (C19172a.m100600k("social@story@story_ads@enable", 0) != 1 && C22018d.m114948i(i11)) {
                        C22018d.m114945f(c31980jc, new c(c31980jc, c32123ta));
                        return;
                    } else {
                        m115012u(c31980jc, c32123ta);
                    }
                }
                c32123ta = null;
                if (C19172a.m100600k("social@story@story_ads@enable", 0) != 1) {
                }
                m115012u(c31980jc, c32123ta);
            }
            c31980jc.f147019D = true;
            c31980jc.f147021F = "0";
            c31980jc.f147020E = 0;
            c32123ta = null;
            if (C19172a.m100600k("social@story@story_ads@enable", 0) != 1) {
            }
            m115012u(c31980jc, c32123ta);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: t */
    public void m115020t(i iVar) {
        this.f108506f = iVar;
    }
}
