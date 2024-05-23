package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.x6 */
/* loaded from: classes.dex */
public abstract class AbstractC5677x6 {

    /* renamed from: g */
    private static volatile AbstractC5626u6 f32899g;

    /* renamed from: k */
    public static final /* synthetic */ int f32903k = 0;

    /* renamed from: a */
    final C5609t6 f32904a;

    /* renamed from: b */
    final String f32905b;

    /* renamed from: c */
    private final Object f32906c;

    /* renamed from: d */
    private volatile int f32907d = -1;

    /* renamed from: e */
    private volatile Object f32908e;

    /* renamed from: f */
    private static final Object f32898f = new Object();

    /* renamed from: h */
    private static final AtomicReference f32900h = new AtomicReference();

    /* renamed from: i */
    private static final C5711z6 f32901i = new C5711z6(C5524o6.f32697a);

    /* renamed from: j */
    private static final AtomicInteger f32902j = new AtomicInteger();

    public /* synthetic */ AbstractC5677x6(C5609t6 c5609t6, String str, Object obj, boolean z11, AbstractC5660w6 abstractC5660w6) {
        if (c5609t6.f32804a != null) {
            this.f32904a = c5609t6;
            this.f32905b = str;
            this.f32906c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: c */
    public static void m30012c() {
        f32902j.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:            r3 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:            throw r3;     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m30013d(Context context) {
        if (f32899g == null && context != null) {
            Object obj = f32898f;
            synchronized (obj) {
                try {
                    if (f32899g == null) {
                        synchronized (obj) {
                            AbstractC5626u6 abstractC5626u6 = f32899g;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (abstractC5626u6 != null) {
                                if (abstractC5626u6.mo29679a() != context) {
                                }
                            }
                            C5286a6.m28874d();
                            AbstractC5694y6.m30043b();
                            C5405h6.m29182d();
                            f32899g = new C5676x5(context, AbstractC5508n7.m29464a(new InterfaceC5423i7() { // from class: com.google.android.gms.internal.measurement.n6

                                /* renamed from: p */
                                public final /* synthetic */ Context f32628p;

                                public /* synthetic */ C5507n6(Context context2) {
                                    r1 = context2;
                                }

                                @Override // com.google.android.gms.internal.measurement.InterfaceC5423i7
                                public final Object zza() {
                                    Context context2 = r1;
                                    int i11 = AbstractC5677x6.f32903k;
                                    return AbstractC5439j6.m29280a(context2);
                                }
                            }));
                            f32902j.incrementAndGet();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    abstract Object mo29526a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:14:0x0043, B:16:0x0049, B:18:0x0053, B:20:0x0074, B:22:0x007c, B:24:0x0084, B:26:0x008a, B:29:0x009c, B:31:0x00a2, B:32:0x009a, B:34:0x00a8, B:36:0x00ac, B:39:0x00b4, B:40:0x00b7, B:41:0x00bb, B:44:0x0068, B:45:0x00c0, B:46:0x00c5, B:49:0x00c6), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:14:0x0043, B:16:0x0049, B:18:0x0053, B:20:0x0074, B:22:0x007c, B:24:0x0084, B:26:0x008a, B:29:0x009c, B:31:0x00a2, B:32:0x009a, B:34:0x00a8, B:36:0x00ac, B:39:0x00b4, B:40:0x00b7, B:41:0x00bb, B:44:0x0068, B:45:0x00c0, B:46:0x00c5, B:49:0x00c6), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:14:0x0043, B:16:0x0049, B:18:0x0053, B:20:0x0074, B:22:0x007c, B:24:0x0084, B:26:0x008a, B:29:0x009c, B:31:0x00a2, B:32:0x009a, B:34:0x00a8, B:36:0x00ac, B:39:0x00b4, B:40:0x00b7, B:41:0x00bb, B:44:0x0068, B:45:0x00c0, B:46:0x00c5, B:49:0x00c6), top: B:4:0x000b }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m30014b() {
        String str;
        C5286a6 c5286a6;
        Object obj;
        String str2;
        Object zzb;
        int i11 = f32902j.get();
        if (this.f32907d < i11) {
            synchronized (this) {
                try {
                    if (this.f32907d < i11) {
                        AbstractC5626u6 abstractC5626u6 = f32899g;
                        AbstractC5355e7 m29081c = AbstractC5355e7.m29081c();
                        Object obj2 = null;
                        if (abstractC5626u6 != null) {
                            m29081c = (AbstractC5355e7) abstractC5626u6.mo29680b().zza();
                            if (m29081c.mo28879b()) {
                                C5303b6 c5303b6 = (C5303b6) m29081c.mo28878a();
                                C5609t6 c5609t6 = this.f32904a;
                                str = c5303b6.m28944a(c5609t6.f32804a, null, c5609t6.f32806c, this.f32905b);
                                if (abstractC5626u6 == null) {
                                    Uri uri = this.f32904a.f32804a;
                                    if (uri != null) {
                                        if (AbstractC5456k6.m29362a(abstractC5626u6.mo29679a(), uri)) {
                                            c5286a6 = C5286a6.m28873a(abstractC5626u6.mo29679a().getContentResolver(), this.f32904a.f32804a, RunnableC5490m6.f32527p);
                                            if (c5286a6 == null && (zzb = c5286a6.zzb(this.f32905b)) != null) {
                                                obj = mo29526a(zzb);
                                            } else {
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                if (!this.f32904a.f32807d) {
                                                    C5405h6 m29181a = C5405h6.m29181a(abstractC5626u6.mo29679a());
                                                    if (this.f32904a.f32807d) {
                                                        str2 = null;
                                                    } else {
                                                        str2 = this.f32905b;
                                                    }
                                                    String zzb2 = m29181a.zzb(str2);
                                                    if (zzb2 != null) {
                                                        obj2 = mo29526a(zzb2);
                                                    }
                                                }
                                                if (obj2 == null) {
                                                    obj = this.f32906c;
                                                } else {
                                                    obj = obj2;
                                                }
                                            }
                                            if (m29081c.mo28879b()) {
                                                if (str == null) {
                                                    obj = this.f32906c;
                                                } else {
                                                    obj = mo29526a(str);
                                                }
                                            }
                                            this.f32908e = obj;
                                            this.f32907d = i11;
                                        }
                                    } else {
                                        AbstractC5694y6.m30042a(abstractC5626u6.mo29679a(), null, RunnableC5490m6.f32527p);
                                    }
                                    c5286a6 = null;
                                    if (c5286a6 == null) {
                                    }
                                    obj = null;
                                    if (obj == null) {
                                    }
                                    if (m29081c.mo28879b()) {
                                    }
                                    this.f32908e = obj;
                                    this.f32907d = i11;
                                } else {
                                    throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                                }
                            }
                        }
                        str = null;
                        if (abstractC5626u6 == null) {
                        }
                    }
                } finally {
                }
            }
        }
        return this.f32908e;
    }
}
