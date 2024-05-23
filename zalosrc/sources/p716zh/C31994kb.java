package p716zh;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import au.AbstractC2378v0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.utils.cryptology.AESUtils;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import in.C20627a;
import in.InterfaceC20630d;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23238v2;
import me0.C23055e5;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import su.AbstractC26389c;
import sx.C26408j;

/* renamed from: zh.kb */
/* loaded from: classes.dex */
public class C31994kb {

    /* renamed from: i */
    static final Object f147219i = new Object();

    /* renamed from: j */
    private static volatile C31994kb f147220j;

    /* renamed from: a */
    final int[] f147221a = {AbstractC16803z.icn_tab_message, AbstractC16803z.icn_tab_contact, AbstractC16803z.icn_tab_group, AbstractC16803z.icn_tab_social, AbstractC16803z.icn_tab_discovery, AbstractC16803z.icn_tab_more, AbstractC16803z.icn_tab_me_v2};

    /* renamed from: b */
    final int[] f147222b = {AbstractC16803z.icn_tab_message_o, AbstractC16803z.icn_tab_contact_o, AbstractC16803z.icn_tab_group_o, AbstractC16803z.icn_tab_social_o, AbstractC16803z.icn_tab_discovery_o, AbstractC16803z.icn_tab_more_o, AbstractC16803z.icn_tab_me_v2_o};

    /* renamed from: g */
    AtomicBoolean f147227g = new AtomicBoolean(false);

    /* renamed from: h */
    AtomicBoolean f147228h = new AtomicBoolean(false);

    /* renamed from: f */
    SparseArray f147226f = new SparseArray();

    /* renamed from: c */
    C26408j f147223c = new C26408j();

    /* renamed from: d */
    C26408j.c f147224d = new C26408j.c(AbstractC23309i.m121855e5());

    /* renamed from: e */
    C26408j.c f147225e = new C26408j.c(AbstractC23309i.m121005H9());

    /* renamed from: zh.kb$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC20630d {
        a() {
        }

        /* renamed from: e */
        public /* synthetic */ void m154253e(String str, String str2, int i11) {
            try {
                File file = new File(str);
                if (AbstractC26389c.m135987c(file).equals(str2)) {
                    File file2 = new File(C31994kb.this.m154240g(i11));
                    if (file2.exists()) {
                        AbstractC23041d2.m118210i(file2);
                    }
                    AbstractC2378v0.m12421d(file, file2);
                    AbstractC23309i.m122358ri(AbstractC20130d.m104881m(file2));
                    AbstractC23309i.m122518vu(AbstractC23309i.m121855e5());
                    C31994kb c31994kb = C31994kb.this;
                    c31994kb.f147225e = c31994kb.f147224d;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: zh.jb.<init>(zh.kb$a, java.lang.String, java.lang.String, int):void, class status: GENERATED_AND_UNLOADED
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
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        @Override // in.InterfaceC20630d
        /* renamed from: a */
        public void mo91783a(java.lang.String r7, boolean r8) {
            /*
                r6 = this;
                r8 = 0
                r0 = 0
                zh.kb r2 = p716zh.C31994kb.this     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                sx.j$c r2 = r2.f147224d     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                int r3 = r2.f125538a     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                java.lang.String r2 = r2.f125546i     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                ag0.b1 r4 = ag0.AbstractC0837p0.m2227h()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                zh.jb r5 = new zh.jb     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                r5.<init>()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
                r4.mo2040a(r5)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L24
            L17:
                p348mi.AbstractC23309i.m122247oi(r0)
                zh.kb r7 = p716zh.C31994kb.this
                java.util.concurrent.atomic.AtomicBoolean r7 = r7.f147227g
                r7.set(r8)
                goto L29
            L22:
                r7 = move-exception
                goto L2a
            L24:
                r7 = move-exception
                r7.printStackTrace()     // Catch: java.lang.Throwable -> L22
                goto L17
            L29:
                return
            L2a:
                p348mi.AbstractC23309i.m122247oi(r0)
                zh.kb r0 = p716zh.C31994kb.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f147227g
                r0.set(r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p716zh.C31994kb.a.mo91783a(java.lang.String, boolean):void");
        }

        @Override // in.InterfaceC20630d
        /* renamed from: b */
        public void mo91784b(int i11, boolean z11) {
            try {
                try {
                    AbstractC23309i.m121770bw(C31994kb.this.f147224d.f125546i, AbstractC23309i.m121786cb(r6) - 1);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                AbstractC23309i.m122247oi(System.currentTimeMillis() + 21600000);
                C31994kb.this.f147227g.set(false);
            }
        }

        @Override // in.InterfaceC20630d
        /* renamed from: c */
        public void mo91785c(long j11, String str) {
        }
    }

    /* renamed from: zh.kb$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        Drawable f147230a;

        /* renamed from: b */
        Drawable f147231b;

        /* renamed from: a */
        Drawable m154254a(int i11) {
            if (i11 == 0) {
                return this.f147230a;
            }
            if (i11 != 1) {
                return null;
            }
            return this.f147231b;
        }
    }

    private C31994kb() {
    }

    /* renamed from: h */
    public static C31994kb m154233h() {
        C31994kb c31994kb = f147220j;
        if (c31994kb == null) {
            synchronized (f147219i) {
                try {
                    c31994kb = f147220j;
                    if (c31994kb == null) {
                        c31994kb = new C31994kb();
                        f147220j = c31994kb;
                    }
                } finally {
                }
            }
        }
        return c31994kb;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[Catch: all -> 0x0038, Exception -> 0x003c, TryCatch #6 {Exception -> 0x003c, all -> 0x0038, blocks: (B:14:0x002b, B:16:0x002f, B:19:0x005b, B:21:0x0065, B:23:0x006d, B:25:0x0073, B:27:0x0086, B:29:0x0094, B:64:0x0040), top: B:13:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m154235b() {
        boolean z11;
        File file;
        if (!C23055e5.m118271f() || !AbstractC23034c6.m118121G() || System.currentTimeMillis() < AbstractC23309i.m121964h0() || this.f147227g.get()) {
            return;
        }
        this.f147227g.set(true);
        try {
        } catch (Exception e11) {
            e = e11;
            z11 = false;
        } catch (Throwable th2) {
            th = th2;
            z11 = false;
        }
        if (this.f147224d != null) {
            if (this.f147228h.get()) {
            }
            if (!TextUtils.isEmpty(this.f147224d.f125543f) && this.f147224d.m136204a() && !this.f147224d.f125548k) {
                file = new File(m154245m(this.f147224d.f125538a));
                if (file.exists()) {
                    String m135987c = AbstractC26389c.m135987c(file);
                    String str = this.f147224d.f125546i;
                    if (!str.equals(m135987c)) {
                        int m121786cb = AbstractC23309i.m121786cb(str);
                        if (m121786cb > 0) {
                            try {
                                AbstractC23309i.m121770bw(str, m121786cb - 1);
                            } catch (Exception e12) {
                                e = e12;
                                z11 = true;
                                e.printStackTrace();
                                if (z11) {
                                }
                                this.f147227g.set(false);
                            } catch (Throwable th3) {
                                th = th3;
                                z11 = true;
                                if (!z11) {
                                }
                                throw th;
                            }
                        }
                    }
                    z11 = false;
                    if (z11) {
                        try {
                            try {
                                m154238e();
                                if (file.exists()) {
                                    file.delete();
                                }
                                C20627a c20627a = new C20627a(false);
                                c20627a.m107419g0(new a());
                                c20627a.m107416d0(false);
                                c20627a.m107420h0(file.getAbsolutePath());
                                c20627a.m107488m(this.f147224d.f125543f);
                            } catch (Throwable th4) {
                                th = th4;
                                if (!z11) {
                                    this.f147227g.set(false);
                                }
                                throw th;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            e.printStackTrace();
                            if (z11) {
                                return;
                            }
                            this.f147227g.set(false);
                        }
                    }
                    if (z11) {
                        return;
                    }
                }
                z11 = true;
                if (z11) {
                }
                if (z11) {
                }
            }
            this.f147227g.set(false);
        }
        this.f147224d = new C26408j.c(AbstractC23309i.m121855e5());
        this.f147225e = new C26408j.c(AbstractC23309i.m121005H9());
        this.f147228h.set(false);
        if (!TextUtils.isEmpty(this.f147224d.f125543f)) {
            file = new File(m154245m(this.f147224d.f125538a));
            if (file.exists()) {
            }
            z11 = true;
            if (z11) {
            }
            if (z11) {
            }
        }
        this.f147227g.set(false);
    }

    /* renamed from: c */
    boolean m154236c(C26408j.c cVar) {
        String m122039j0 = AbstractC23309i.m122039j0();
        File file = new File(m154240g(cVar.f125538a));
        String m104881m = AbstractC20130d.m104881m(file);
        if (file.exists() && m104881m.equals(m122039j0)) {
            return true;
        }
        if (file.exists()) {
            AbstractC23041d2.m118210i(file);
        }
        File file2 = new File(m154245m(cVar.f125538a));
        if (file2.exists() && AbstractC26389c.m135987c(file2).equals(cVar.f125546i)) {
            AbstractC2378v0.m12421d(file2, file);
            AbstractC23309i.m122358ri(AbstractC20130d.m104881m(file));
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void m154237d() {
        SparseArray sparseArray = this.f147226f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
        C26408j.c cVar = this.f147224d;
        if (cVar != null) {
            cVar.f125548k = false;
        }
    }

    /* renamed from: e */
    void m154238e() {
        File file = new File(AbstractC20130d.m104898u0());
        if (!file.exists()) {
            file.mkdir();
        }
    }

    /* renamed from: f */
    File m154239f(int i11, File file, String str) {
        do {
            File file2 = new File(file, AbstractC23136l9.f112241b[i11]);
            if (file2.exists()) {
                file2 = new File(file2, str);
            }
            if (file2.exists()) {
                return file2;
            }
            i11--;
            if (file2.exists()) {
                return null;
            }
        } while (i11 >= 0);
        return null;
    }

    /* renamed from: g */
    String m154240g(int i11) {
        return AbstractC20130d.m104898u0() + i11;
    }

    /* renamed from: i */
    String m154241i(int i11) {
        return AbstractC20130d.m104898u0() + i11 + File.separator + "config";
    }

    /* renamed from: j */
    String m154242j(int i11) {
        return AbstractC20130d.m104898u0() + i11 + File.separator + "resources";
    }

    /* renamed from: k */
    public C26408j.e m154243k() {
        if (this.f147223c == null) {
            this.f147223c = new C26408j();
        }
        return this.f147223c.f125528c;
    }

    /* renamed from: l */
    public Drawable m154244l(Context context, int i11, int i12) {
        b bVar = (b) this.f147226f.get(i11);
        if (bVar != null) {
            return bVar.m154254a(i12);
        }
        b bVar2 = new b();
        switch (i11) {
            case 0:
                bVar2.f147230a = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_tab_message);
                bVar2.f147231b = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_tab_message_o);
                break;
            case 1:
                bVar2.f147230a = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_tab_contact);
                bVar2.f147231b = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_tab_contact_o);
                break;
            case 2:
                bVar2.f147230a = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_tab_group);
                bVar2.f147231b = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_tab_group_o);
                break;
            case 3:
                bVar2.f147230a = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_tab_social);
                bVar2.f147231b = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_tab_social_o);
                break;
            case 4:
                bVar2.f147230a = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_tab_discovery);
                bVar2.f147231b = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_tab_discovery_o);
                break;
            case 5:
                bVar2.f147230a = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_tab_more);
                bVar2.f147231b = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_tab_more_o);
                break;
            case 6:
                bVar2.f147230a = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_tab_me_v2);
                bVar2.f147231b = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_tab_me_v2_o);
                break;
            default:
                bVar2 = null;
                break;
        }
        if (bVar2 == null) {
            return null;
        }
        this.f147226f.put(i11, bVar2);
        return bVar2.m154254a(i12);
    }

    /* renamed from: m */
    String m154245m(int i11) {
        return AbstractC20130d.m104898u0() + i11 + ".theme";
    }

    /* renamed from: o */
    String m154246o(File file) {
        byte[] m89287a;
        String m119725j;
        byte[] m119724i = AbstractC23238v2.m119724i(file);
        if (m119724i != null && (m89287a = AESUtils.m89287a("08A28CB6EDCB292D45A37404632A81E1", m119724i)) != null && (m119725j = AbstractC23238v2.m119725j(m89287a)) != null) {
            return m119725j;
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:3:0x0003, B:5:0x0007, B:7:0x000d, B:11:0x0014, B:13:0x0023, B:15:0x0027, B:17:0x002b, B:19:0x0031, B:21:0x003b, B:23:0x0046, B:25:0x0059, B:27:0x006a, B:29:0x0074, B:42:0x0079, B:44:0x008f, B:46:0x0095), top: B:2:0x0003 }] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m154234n(Context context) {
        boolean z11;
        C26408j.c cVar;
        C26408j.c cVar2;
        try {
            C26408j.c cVar3 = this.f147224d;
            if (cVar3 != null && cVar3.m136207d()) {
                if (this.f147224d.f125548k) {
                    return;
                }
                this.f147223c = null;
                m154238e();
                boolean m154236c = m154236c(this.f147224d);
                if (!m154236c && (cVar = this.f147225e) != null && cVar != (cVar2 = this.f147224d) && !cVar.m136208e(cVar2)) {
                    C26408j.c cVar4 = this.f147225e;
                    if (cVar4.f125538a == this.f147224d.f125538a) {
                        m154236c = m154236c(cVar4);
                        z11 = false;
                        if (m154236c) {
                            File file = new File(m154241i(this.f147224d.f125538a));
                            if (file.exists()) {
                                C26408j c26408j = new C26408j(m154246o(file));
                                this.f147223c = c26408j;
                                if (!c26408j.m136203a()) {
                                    this.f147223c = new C26408j();
                                } else if (z11) {
                                    this.f147224d.f125548k = true;
                                }
                            }
                        }
                    }
                }
                z11 = true;
                if (m154236c) {
                }
            } else {
                this.f147223c = new C26408j();
                C26408j.c cVar5 = new C26408j.c(AbstractC23309i.m121855e5());
                if (!cVar5.m136204a() || !cVar5.m136205b()) {
                    AbstractC23309i.m120799Bp("");
                    AbstractC23309i.m122518vu("");
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            if (this.f147223c == null) {
                this.f147223c = new C26408j();
            }
            m154249r(context);
            C23744a.m124114c().m124116d(12003, new Object[0]);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: q */
    public void m154248q(Context context) {
        AbstractC0837p0.m2227h().mo2040a(new Runnable() { // from class: zh.ib

            /* renamed from: q */
            public final /* synthetic */ Context f146911q;

            public /* synthetic */ RunnableC31964ib(Context context2) {
                r2 = context2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31994kb.this.m154234n(r2);
            }
        });
    }

    /* renamed from: r */
    void m154249r(Context context) {
        File m154239f;
        try {
            C26408j c26408j = this.f147223c;
            C26408j.f[] fVarArr = c26408j.f125528c.f125559g;
            File file = new File(m154242j(c26408j.f125526a.f125530a));
            int m118653H = AbstractC23136l9.m118653H(context);
            for (int i11 = 0; i11 < C26408j.e.f125552i; i11++) {
                b bVar = new b();
                try {
                    C26408j.f fVar = fVarArr[i11];
                    if (fVar != null && (m154239f = m154239f(m118653H, file, fVar.f125561b)) != null && m154239f.exists()) {
                        Bitmap decodeFile = BitmapFactory.decodeFile(m154239f.getAbsolutePath());
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), decodeFile);
                        if (decodeFile != null) {
                            bVar.f147231b = bitmapDrawable;
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
                Drawable drawable = bVar.f147230a;
                if (drawable != null || bVar.f147231b != null) {
                    if (drawable == null) {
                        bVar.f147230a = AbstractC23136l9.m118665N(context, this.f147221a[i11]);
                    }
                    if (bVar.f147231b == null) {
                        bVar.f147231b = AbstractC23136l9.m118665N(context, this.f147222b[i11]);
                    }
                    this.f147226f.put(i11, bVar);
                }
            }
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
    }

    /* renamed from: s */
    public void m154250s() {
        try {
            C26408j.c cVar = this.f147224d;
            if (cVar != null) {
                AbstractC23309i.m121770bw(cVar.f125546i, 3);
            }
            this.f147224d = new C26408j.c("");
            this.f147225e = new C26408j.c("");
            this.f147223c = new C26408j();
            this.f147228h.set(true);
            AbstractC23309i.m122247oi(0L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t */
    public void m154251t(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C26408j.c cVar = new C26408j.c(str);
                if (cVar.m136206c(this.f147224d)) {
                    AbstractC23309i.m120799Bp(str);
                    AbstractC23309i.m122247oi(0L);
                    AbstractC23309i.m121770bw(cVar.f125546i, 3);
                    if (this.f147227g.get()) {
                        this.f147228h.set(true);
                    } else {
                        this.f147224d = new C26408j.c(str);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
