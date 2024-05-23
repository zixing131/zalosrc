package p008a2;

import android.content.Context;
import android.content.Intent;
import fn0.AbstractC19074t;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p008a2.AbstractC0086w;
import p119e2.InterfaceC18183h;

/* renamed from: a2.h */
/* loaded from: classes.dex */
public class C0069h {

    /* renamed from: a */
    public final Context f284a;

    /* renamed from: b */
    public final String f285b;

    /* renamed from: c */
    public final InterfaceC18183h.c f286c;

    /* renamed from: d */
    public final AbstractC0086w.e f287d;

    /* renamed from: e */
    public final List f288e;

    /* renamed from: f */
    public final boolean f289f;

    /* renamed from: g */
    public final AbstractC0086w.d f290g;

    /* renamed from: h */
    public final Executor f291h;

    /* renamed from: i */
    public final Executor f292i;

    /* renamed from: j */
    public final Intent f293j;

    /* renamed from: k */
    public final boolean f294k;

    /* renamed from: l */
    public final boolean f295l;

    /* renamed from: m */
    private final Set f296m;

    /* renamed from: n */
    public final String f297n;

    /* renamed from: o */
    public final File f298o;

    /* renamed from: p */
    public final Callable f299p;

    /* renamed from: q */
    public final List f300q;

    /* renamed from: r */
    public final List f301r;

    /* renamed from: s */
    public final boolean f302s;

    public C0069h(Context context, String str, InterfaceC18183h.c cVar, AbstractC0086w.e eVar, List list, boolean z11, AbstractC0086w.d dVar, Executor executor, Executor executor2, Intent intent, boolean z12, boolean z13, Set set, String str2, File file, Callable callable, AbstractC0086w.f fVar, List list2, List list3) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(cVar, "sqliteOpenHelperFactory");
        AbstractC19074t.m100208f(eVar, "migrationContainer");
        AbstractC19074t.m100208f(dVar, "journalMode");
        AbstractC19074t.m100208f(executor, "queryExecutor");
        AbstractC19074t.m100208f(executor2, "transactionExecutor");
        AbstractC19074t.m100208f(list2, "typeConverters");
        AbstractC19074t.m100208f(list3, "autoMigrationSpecs");
        this.f284a = context;
        this.f285b = str;
        this.f286c = cVar;
        this.f287d = eVar;
        this.f288e = list;
        this.f289f = z11;
        this.f290g = dVar;
        this.f291h = executor;
        this.f292i = executor2;
        this.f293j = intent;
        this.f294k = z12;
        this.f295l = z13;
        this.f296m = set;
        this.f297n = str2;
        this.f298o = file;
        this.f299p = callable;
        this.f300q = list2;
        this.f301r = list3;
        this.f302s = intent != null;
    }

    /* renamed from: a */
    public boolean m255a(int i11, int i12) {
        if ((i11 > i12 && this.f295l) || !this.f294k) {
            return false;
        }
        Set set = this.f296m;
        if (set != null && set.contains(Integer.valueOf(i11))) {
            return false;
        }
        return true;
    }
}
