package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.C6576e;
import com.google.firebase.abt.AbtException;
import com.google.firebase.remoteconfig.C6714a;
import com.google.firebase.remoteconfig.internal.C6722f;
import com.google.firebase.remoteconfig.internal.C6723g;
import com.google.firebase.remoteconfig.internal.C6729m;
import com.google.firebase.remoteconfig.internal.C6731o;
import com.google.firebase.remoteconfig.internal.C6732p;
import com.google.firebase.remoteconfig.internal.C6733q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035b9.InterfaceC2661e;
import p095d8.AbstractC17826k;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.InterfaceC22874c;
import p342m6.InterfaceC22886i;
import p541u9.InterfaceC27200h;
import p672y7.C30805b;

/* renamed from: com.google.firebase.remoteconfig.a */
/* loaded from: classes3.dex */
public class C6714a {

    /* renamed from: m */
    public static final byte[] f36924m = new byte[0];

    /* renamed from: a */
    private final Context f36925a;

    /* renamed from: b */
    private final C6576e f36926b;

    /* renamed from: c */
    private final C30805b f36927c;

    /* renamed from: d */
    private final Executor f36928d;

    /* renamed from: e */
    private final C6722f f36929e;

    /* renamed from: f */
    private final C6722f f36930f;

    /* renamed from: g */
    private final C6722f f36931g;

    /* renamed from: h */
    private final C6729m f36932h;

    /* renamed from: i */
    private final C6731o f36933i;

    /* renamed from: j */
    private final C6732p f36934j;

    /* renamed from: k */
    private final InterfaceC2661e f36935k;

    /* renamed from: l */
    private final C6733q f36936l;

    public C6714a(Context context, C6576e c6576e, InterfaceC2661e interfaceC2661e, C30805b c30805b, Executor executor, C6722f c6722f, C6722f c6722f2, C6722f c6722f3, C6729m c6729m, C6731o c6731o, C6732p c6732p, C6733q c6733q) {
        this.f36925a = context;
        this.f36926b = c6576e;
        this.f36935k = interfaceC2661e;
        this.f36927c = c30805b;
        this.f36928d = executor;
        this.f36929e = c6722f;
        this.f36930f = c6722f2;
        this.f36931g = c6722f3;
        this.f36932h = c6729m;
        this.f36933i = c6731o;
        this.f36934j = c6732p;
        this.f36936l = c6733q;
    }

    /* renamed from: j */
    private static boolean m34307j(C6723g c6723g, C6723g c6723g2) {
        if (c6723g2 != null && c6723g.m34385g().equals(c6723g2.m34385g())) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public /* synthetic */ AbstractC22888j m34308k(AbstractC22888j abstractC22888j, AbstractC22888j abstractC22888j2, AbstractC22888j abstractC22888j3) {
        if (abstractC22888j.mo117588q() && abstractC22888j.mo117584m() != null) {
            C6723g c6723g = (C6723g) abstractC22888j.mo117584m();
            if (abstractC22888j2.mo117588q() && !m34307j(c6723g, (C6723g) abstractC22888j2.mo117584m())) {
                return AbstractC22894m.m117604f(Boolean.FALSE);
            }
            return this.f36930f.m34374k(c6723g).mo117579h(this.f36928d, new InterfaceC22874c() { // from class: u9.g
                public /* synthetic */ C27199g() {
                }

                @Override // p342m6.InterfaceC22874c
                /* renamed from: a */
                public final Object mo27439a(AbstractC22888j abstractC22888j4) {
                    boolean m34311n;
                    m34311n = C6714a.this.m34311n(abstractC22888j4);
                    return Boolean.valueOf(m34311n);
                }
            });
        }
        return AbstractC22894m.m117604f(Boolean.FALSE);
    }

    /* renamed from: l */
    public static /* synthetic */ AbstractC22888j m34309l(C6729m.a aVar) {
        return AbstractC22894m.m117604f(null);
    }

    /* renamed from: m */
    public /* synthetic */ AbstractC22888j m34310m(Void r12) {
        return m34313e();
    }

    /* renamed from: n */
    public boolean m34311n(AbstractC22888j abstractC22888j) {
        if (abstractC22888j.mo117588q()) {
            this.f36929e.m34370d();
            if (abstractC22888j.mo117584m() != null) {
                m34320r(((C6723g) abstractC22888j.mo117584m()).m34382d());
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: q */
    static List m34312q(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: u9.f.<init>(com.google.firebase.remoteconfig.a, m6.j, m6.j):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: e */
    public p342m6.AbstractC22888j m34313e() {
        /*
            r5 = this;
            com.google.firebase.remoteconfig.internal.f r0 = r5.f36929e
            m6.j r0 = r0.m34371e()
            com.google.firebase.remoteconfig.internal.f r1 = r5.f36930f
            m6.j r1 = r1.m34371e()
            r2 = 2
            m6.j[] r2 = new p342m6.AbstractC22888j[r2]
            r3 = 0
            r2[r3] = r0
            r3 = 1
            r2[r3] = r1
            m6.j r2 = p342m6.AbstractC22894m.m117608j(r2)
            java.util.concurrent.Executor r3 = r5.f36928d
            u9.f r4 = new u9.f
            r4.<init>()
            m6.j r0 = r2.mo117581j(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.C6714a.m34313e():m6.j");
    }

    /* renamed from: f */
    public AbstractC22888j m34314f() {
        return this.f36932h.m34419i().mo117589r(AbstractC17826k.m94062a(), new InterfaceC22886i() { // from class: u9.e
            @Override // p342m6.InterfaceC22886i
            /* renamed from: a */
            public final AbstractC22888j mo33968a(Object obj) {
                AbstractC22888j m34309l;
                m34309l = C6714a.m34309l((C6729m.a) obj);
                return m34309l;
            }
        });
    }

    /* renamed from: g */
    public AbstractC22888j m34315g() {
        return m34314f().mo117589r(this.f36928d, new InterfaceC22886i() { // from class: u9.d
            public /* synthetic */ C27196d() {
            }

            @Override // p342m6.InterfaceC22886i
            /* renamed from: a */
            public final AbstractC22888j mo33968a(Object obj) {
                AbstractC22888j m34310m;
                m34310m = C6714a.this.m34310m((Void) obj);
                return m34310m;
            }
        });
    }

    /* renamed from: h */
    public Map m34316h() {
        return this.f36933i.m34438d();
    }

    /* renamed from: i */
    public InterfaceC27200h m34317i() {
        return this.f36934j.m34442c();
    }

    /* renamed from: o */
    public void m34318o(boolean z11) {
        this.f36936l.m34462b(z11);
    }

    /* renamed from: p */
    public void m34319p() {
        this.f36930f.m34371e();
        this.f36931g.m34371e();
        this.f36929e.m34371e();
    }

    /* renamed from: r */
    void m34320r(JSONArray jSONArray) {
        if (this.f36927c == null) {
            return;
        }
        try {
            this.f36927c.m149891m(m34312q(jSONArray));
        } catch (AbtException | JSONException unused) {
        }
    }
}
