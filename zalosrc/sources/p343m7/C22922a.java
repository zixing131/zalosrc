package p343m7;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.internal.zzbx;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p001a.p005d.AbstractC0007b;
import p231i7.AbstractC20362f;
import p258j7.AbstractC20944d;
import p258j7.C20942c;
import p258j7.C20959k0;
import p258j7.C20975s0;
import p258j7.EnumC20967o0;
import p258j7.InterfaceC20938a;
import p258j7.InterfaceC20946e;
import p258j7.InterfaceC20951g0;
import p291k7.AbstractC21547u0;
import p291k7.C21533p1;
import p291k7.C21535q0;
import p291k7.InterfaceC21550v0;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;

/* renamed from: m7.a */
/* loaded from: classes3.dex */
public class C22922a implements InterfaceC20938a {

    /* renamed from: p */
    private static final long f111571p = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: q */
    public static final /* synthetic */ int f111572q = 0;

    /* renamed from: a */
    private final Handler f111573a;

    /* renamed from: b */
    private final Context f111574b;

    /* renamed from: c */
    private final C20975s0 f111575c;

    /* renamed from: d */
    private final InterfaceC21550v0 f111576d;

    /* renamed from: e */
    private final C21535q0 f111577e;

    /* renamed from: f */
    private final C21533p1 f111578f;

    /* renamed from: g */
    private final C21533p1 f111579g;

    /* renamed from: h */
    private final Executor f111580h;

    /* renamed from: i */
    private final InterfaceC20951g0 f111581i;

    /* renamed from: j */
    private final File f111582j;

    /* renamed from: k */
    private final AtomicReference f111583k;

    /* renamed from: l */
    private final Set f111584l;

    /* renamed from: m */
    private final Set f111585m;

    /* renamed from: n */
    private final AtomicBoolean f111586n;

    /* renamed from: o */
    private final C22932k f111587o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C22922a(Context context, File file, C20975s0 c20975s0, InterfaceC21550v0 interfaceC21550v0) {
        Executor m106124a = AbstractC20362f.m106124a();
        C21535q0 c21535q0 = new C21535q0(context);
        C22932k c22932k = new Object() { // from class: m7.k
        };
        this.f111573a = new Handler(Looper.getMainLooper());
        this.f111583k = new AtomicReference();
        this.f111584l = Collections.synchronizedSet(new HashSet());
        this.f111585m = Collections.synchronizedSet(new HashSet());
        this.f111586n = new AtomicBoolean(false);
        this.f111574b = context;
        this.f111582j = file;
        this.f111575c = c20975s0;
        this.f111576d = interfaceC21550v0;
        this.f111580h = m106124a;
        this.f111577e = c21535q0;
        this.f111587o = c22932k;
        this.f111579g = new C21533p1();
        this.f111578f = new C21533p1();
        this.f111581i = EnumC20967o0.INSTANCE;
    }

    /* renamed from: m */
    private final AbstractC22888j m117634m(final int i11) {
        m117637p(new InterfaceC22940s() { // from class: m7.q
            @Override // p343m7.InterfaceC22940s
            /* renamed from: a */
            public final AbstractC20944d mo117658a(AbstractC20944d abstractC20944d) {
                int i12 = i11;
                int i13 = C22922a.f111572q;
                if (abstractC20944d == null) {
                    return null;
                }
                return AbstractC20944d.m109477b(abstractC20944d.mo109485h(), 6, i12, abstractC20944d.mo109479a(), abstractC20944d.mo109487j(), abstractC20944d.m109483f(), abstractC20944d.m109482e());
            }
        });
        return AbstractC22894m.m117603e(new SplitInstallException(i11));
    }

    /* renamed from: n */
    private final C20959k0 m117635n() {
        try {
            C20959k0 m109512a = this.f111575c.m109512a(this.f111574b.getPackageManager().getPackageInfo(this.f111574b.getPackageName(), 128).applicationInfo.metaData);
            if (m109512a != null) {
                return m109512a;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e11) {
            throw new IllegalStateException("App is not found in PackageManager", e11);
        }
    }

    /* renamed from: o */
    private final AbstractC20944d m117636o() {
        return (AbstractC20944d) this.f111583k.get();
    }

    /* renamed from: p */
    private final synchronized AbstractC20944d m117637p(InterfaceC22940s interfaceC22940s) {
        AbstractC20944d m117636o = m117636o();
        AbstractC20944d mo117658a = interfaceC22940s.mo117658a(m117636o);
        AtomicReference atomicReference = this.f111583k;
        while (!AbstractC0007b.m4a(atomicReference, m117636o, mo117658a)) {
            if (atomicReference.get() != m117636o) {
                return null;
            }
        }
        return mo117658a;
    }

    /* renamed from: q */
    private static String m117638q(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m117639r(List list, List list2, List list3, long j11, boolean z11) {
        this.f111581i.zza().mo109495a(list, new C22939r(this, list2, list3, j11, z11, list));
    }

    /* renamed from: s */
    private final void m117640s(final AbstractC20944d abstractC20944d) {
        this.f111573a.post(new Runnable() { // from class: m7.g
            @Override // java.lang.Runnable
            public final void run() {
                C22922a.this.m117644i(abstractC20944d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final void m117641t(List list, List list2, long j11) {
        this.f111584l.addAll(list);
        this.f111585m.addAll(list2);
        Long valueOf = Long.valueOf(j11);
        m117642u(5, 0, valueOf, valueOf, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final boolean m117642u(final int i11, final int i12, final Long l11, final Long l12, final List list, final Integer num, final List list2) {
        AbstractC20944d m117637p = m117637p(new InterfaceC22940s() { // from class: m7.h
            @Override // p343m7.InterfaceC22940s
            /* renamed from: a */
            public final AbstractC20944d mo117658a(AbstractC20944d abstractC20944d) {
                AbstractC20944d abstractC20944d2;
                int intValue;
                long longValue;
                long longValue2;
                List list3;
                List list4;
                Integer num2 = num;
                int i13 = i11;
                int i14 = i12;
                Long l13 = l11;
                Long l14 = l12;
                List list5 = list;
                List list6 = list2;
                int i15 = C22922a.f111572q;
                if (abstractC20944d == null) {
                    abstractC20944d2 = AbstractC20944d.m109477b(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList());
                } else {
                    abstractC20944d2 = abstractC20944d;
                }
                if (num2 == null) {
                    intValue = abstractC20944d2.mo109485h();
                } else {
                    intValue = num2.intValue();
                }
                if (l13 == null) {
                    longValue = abstractC20944d2.mo109479a();
                } else {
                    longValue = l13.longValue();
                }
                if (l14 == null) {
                    longValue2 = abstractC20944d2.mo109487j();
                } else {
                    longValue2 = l14.longValue();
                }
                if (list5 == null) {
                    list3 = abstractC20944d2.m109483f();
                } else {
                    list3 = list5;
                }
                if (list6 == null) {
                    list4 = abstractC20944d2.m109482e();
                } else {
                    list4 = list6;
                }
                return AbstractC20944d.m109477b(intValue, i13, i14, longValue, longValue2, list3, list4);
            }
        });
        if (m117637p != null) {
            m117640s(m117637p);
            return true;
        }
        return false;
    }

    @Override // p258j7.InterfaceC20938a
    /* renamed from: a */
    public final AbstractC22888j mo109459a(final int i11) {
        try {
            AbstractC20944d m117637p = m117637p(new InterfaceC22940s() { // from class: m7.i
                @Override // p343m7.InterfaceC22940s
                /* renamed from: a */
                public final AbstractC20944d mo117658a(final AbstractC20944d abstractC20944d) {
                    final int i12 = i11;
                    return (AbstractC20944d) zzbx.m33402c(new Callable() { // from class: m7.p
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int mo109486i;
                            AbstractC20944d abstractC20944d2 = AbstractC20944d.this;
                            int i13 = i12;
                            int i14 = C22922a.f111572q;
                            if (abstractC20944d2 != null && i13 == abstractC20944d2.mo109485h() && ((mo109486i = abstractC20944d2.mo109486i()) == 1 || mo109486i == 2 || mo109486i == 8 || mo109486i == 9 || mo109486i == 7)) {
                                return AbstractC20944d.m109477b(i13, 7, abstractC20944d2.mo109480c(), abstractC20944d2.mo109479a(), abstractC20944d2.mo109487j(), abstractC20944d2.m109483f(), abstractC20944d2.m109482e());
                            }
                            throw new SplitInstallException(-3);
                        }
                    });
                }
            });
            if (m117637p != null) {
                m117640s(m117637p);
            }
            return AbstractC22894m.m117604f(null);
        } catch (zzbx e11) {
            return AbstractC22894m.m117603e(e11.m33404b(SplitInstallException.class));
        }
    }

    @Override // p258j7.InterfaceC20938a
    /* renamed from: b */
    public final Set mo109460b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f111575c.m109513c());
        hashSet.addAll(this.f111584l);
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x011c, code lost:            if (r1.contains(r14) == false) goto L41;     */
    @Override // p258j7.InterfaceC20938a
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC22888j mo109461c(final C20942c c20942c) {
        Integer mo117656a;
        File[] fileArr;
        Iterator it;
        try {
            AbstractC20944d m117637p = m117637p(new InterfaceC22940s() { // from class: m7.l
                @Override // p343m7.InterfaceC22940s
                /* renamed from: a */
                public final AbstractC20944d mo117658a(final AbstractC20944d abstractC20944d) {
                    final C20942c c20942c2 = C20942c.this;
                    return (AbstractC20944d) zzbx.m33402c(new Callable() { // from class: m7.o
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int mo109485h;
                            AbstractC20944d abstractC20944d2 = AbstractC20944d.this;
                            C20942c c20942c3 = c20942c2;
                            int i11 = C22922a.f111572q;
                            if (abstractC20944d2 != null && !abstractC20944d2.m109481d()) {
                                throw new SplitInstallException(-1);
                            }
                            if (abstractC20944d2 == null) {
                                mo109485h = 1;
                            } else {
                                mo109485h = 1 + abstractC20944d2.mo109485h();
                            }
                            return AbstractC20944d.m109477b(mo109485h, 1, 0, 0L, 0L, c20942c3.m109470b(), new ArrayList());
                        }
                    });
                }
            });
            if (m117637p != null) {
                int mo109485h = m117637p.mo109485h();
                final ArrayList arrayList = new ArrayList();
                Iterator it2 = c20942c.m109469a().iterator();
                while (it2.hasNext()) {
                    arrayList.add(((Locale) it2.next()).getLanguage());
                }
                HashSet hashSet = new HashSet();
                final ArrayList arrayList2 = new ArrayList();
                File[] listFiles = this.f111582j.listFiles(new FileFilter() { // from class: m7.m
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        int i11 = C22922a.f111572q;
                        return file.getName().endsWith(".apk");
                    }
                });
                if (listFiles != null) {
                    int i11 = 0;
                    long j11 = 0;
                    while (i11 < listFiles.length) {
                        File file = listFiles[i11];
                        String m111205a = AbstractC21547u0.m111205a(file);
                        String m117638q = m117638q(m111205a);
                        hashSet.add(m111205a);
                        if (c20942c.m109470b().contains(m117638q)) {
                            String m117638q2 = m117638q(m111205a);
                            HashSet hashSet2 = new HashSet(this.f111577e.m111192a());
                            Map m109501a = m117635n().m109501a(Arrays.asList(m117638q2));
                            HashSet hashSet3 = new HashSet();
                            Iterator it3 = m109501a.values().iterator();
                            while (it3.hasNext()) {
                                hashSet3.addAll((Set) it3.next());
                            }
                            HashSet hashSet4 = new HashSet();
                            Iterator it4 = hashSet2.iterator();
                            while (it4.hasNext()) {
                                String str = (String) it4.next();
                                File[] fileArr2 = listFiles;
                                if (str.contains("_")) {
                                    it = it4;
                                    str = str.split("_", -1)[0];
                                } else {
                                    it = it4;
                                }
                                hashSet4.add(str);
                                listFiles = fileArr2;
                                it4 = it;
                            }
                            fileArr = listFiles;
                            hashSet4.addAll(this.f111585m);
                            hashSet4.addAll(arrayList);
                            HashSet hashSet5 = new HashSet();
                            for (Map.Entry entry : m109501a.entrySet()) {
                                if (hashSet4.contains(entry.getKey())) {
                                    hashSet5.addAll((Collection) entry.getValue());
                                }
                            }
                            if (hashSet3.contains(m111205a)) {
                            }
                            j11 += file.length();
                            arrayList2.add(file);
                            break;
                            i11++;
                            listFiles = fileArr;
                        } else {
                            fileArr = listFiles;
                        }
                        List<Locale> m109469a = c20942c.m109469a();
                        ArrayList arrayList3 = new ArrayList(this.f111584l);
                        arrayList3.addAll(Arrays.asList("", "base"));
                        Map m109501a2 = m117635n().m109501a(arrayList3);
                        for (Locale locale : m109469a) {
                            if (m109501a2.containsKey(locale.getLanguage()) && ((Set) m109501a2.get(locale.getLanguage())).contains(m111205a)) {
                                j11 += file.length();
                                arrayList2.add(file);
                                break;
                            }
                        }
                        i11++;
                        listFiles = fileArr;
                    }
                    String obj = hashSet.toString();
                    String valueOf = String.valueOf(c20942c.m109470b());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("availableSplits ");
                    sb2.append(obj);
                    sb2.append(" want ");
                    sb2.append(valueOf);
                    if (c20942c.m109470b().size() != 1 || (mo117656a = (Integer) ((AbstractC22943v) this.f111576d.zza()).mo117657b().get(c20942c.m109470b().get(0))) == null) {
                        mo117656a = ((AbstractC22943v) this.f111576d.zza()).mo117656a();
                    }
                    if (mo117656a != null) {
                        return m117634m(mo117656a.intValue());
                    }
                    if (!hashSet.containsAll(new HashSet(c20942c.m109470b()))) {
                        return m117634m(-2);
                    }
                    Long valueOf2 = Long.valueOf(j11);
                    List m109470b = c20942c.m109470b();
                    Integer valueOf3 = Integer.valueOf(mo109485h);
                    m117642u(1, 0, 0L, valueOf2, m109470b, valueOf3, arrayList);
                    this.f111580h.execute(new Runnable() { // from class: m7.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22922a.this.m117646k(arrayList2, arrayList);
                        }
                    });
                    return AbstractC22894m.m117604f(valueOf3);
                }
                return m117634m(-5);
            }
            return m117634m(-100);
        } catch (zzbx e11) {
            return m117634m(((SplitInstallException) e11.m33404b(SplitInstallException.class)).m33386c());
        }
    }

    @Override // p258j7.InterfaceC20938a
    /* renamed from: d */
    public final void mo109462d(InterfaceC20946e interfaceC20946e) {
        this.f111579g.m111188a(interfaceC20946e);
    }

    @Override // p258j7.InterfaceC20938a
    /* renamed from: e */
    public final boolean mo109463e(AbstractC20944d abstractC20944d, Activity activity, int i11) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void m117643h(final long j11, final List list, final List list2, final List list3) {
        long j12 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            j12 = Math.min(j11, j12 + (j11 / 3));
            m117642u(2, 0, Long.valueOf(j12), Long.valueOf(j11), null, null, null);
            SystemClock.sleep(f111571p);
            AbstractC20944d m117636o = m117636o();
            if (m117636o.mo109486i() == 9 || m117636o.mo109486i() == 7 || m117636o.mo109486i() == 6) {
                return;
            }
        }
        this.f111580h.execute(new Runnable() { // from class: m7.f
            @Override // java.lang.Runnable
            public final void run() {
                C22922a.this.m117645j(list, list2, list3, j11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void m117644i(AbstractC20944d abstractC20944d) {
        this.f111578f.m111189b(abstractC20944d);
        this.f111579g.m111189b(abstractC20944d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void m117645j(List list, List list2, List list3, long j11) {
        if (this.f111586n.get()) {
            m117642u(6, -6, null, null, null, null, null);
        } else if (this.f111581i.zza() != null) {
            m117639r(list, list2, list3, j11, false);
        } else {
            m117641t(list2, list3, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void m117646k(List list, final List list2) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String m111205a = AbstractC21547u0.m111205a(file);
            Uri fromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(fromFile, this.f111574b.getContentResolver().getType(fromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", m117638q(m111205a));
            intent.putExtra("split_id", m111205a);
            arrayList.add(intent);
            arrayList2.add(m117638q(AbstractC21547u0.m111205a(file)));
        }
        AbstractC20944d m117636o = m117636o();
        if (m117636o == null) {
            return;
        }
        final long mo109487j = m117636o.mo109487j();
        this.f111580h.execute(new Runnable() { // from class: m7.j
            @Override // java.lang.Runnable
            public final void run() {
                C22922a.this.m117643h(mo109487j, arrayList, arrayList2, list2);
            }
        });
    }
}
