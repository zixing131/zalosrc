package p141ex;

import android.os.Debug;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mx.AbstractC23466c;
import mx.AbstractC23473j;
import mx.AbstractC23474k;
import mx.AbstractC23477n;
import mx.C23476m;
import p171fx.AbstractC19160a;
import p171fx.AbstractC19166g;
import p171fx.C19168i;
import zw.AbstractC32562b;

/* renamed from: ex.e */
/* loaded from: classes4.dex */
public abstract class AbstractC18630e {

    /* renamed from: a */
    static List f93735a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static final Object f93736b = new Object();

    /* renamed from: ex.e$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC19160a {

        /* renamed from: b */
        final /* synthetic */ long f93737b;

        /* renamed from: c */
        final /* synthetic */ int f93738c;

        /* renamed from: d */
        final /* synthetic */ Object f93739d;

        /* renamed from: e */
        final /* synthetic */ long f93740e;

        /* renamed from: f */
        final /* synthetic */ long f93741f;

        /* renamed from: g */
        final /* synthetic */ String f93742g;

        /* renamed from: h */
        final /* synthetic */ boolean f93743h;

        /* renamed from: i */
        final /* synthetic */ String f93744i;

        a(long j11, int i11, Object obj, long j12, long j13, String str, boolean z11, String str2) {
            this.f93737b = j11;
            this.f93738c = i11;
            this.f93739d = obj;
            this.f93740e = j12;
            this.f93741f = j13;
            this.f93742g = str;
            this.f93743h = z11;
            this.f93744i = str2;
        }

        @Override // p171fx.AbstractC19160a
        /* renamed from: a */
        public void mo98440a(List list) {
            AbstractC18630e.f93735a.add(AbstractC23477n.m123259g(this.f93737b, this.f93738c, AbstractC23474k.m123238b(this.f93739d, false), this.f93740e, this.f93741f, this.f93742g, this.f93743h, this.f93744i));
        }
    }

    /* renamed from: ex.e$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC19160a {
        b() {
        }

        @Override // p171fx.AbstractC19160a
        /* renamed from: a */
        public void mo98440a(List list) {
            if (AbstractC23473j.m123236a(CoreUtility.getAppContext())) {
                int size = list.size();
                StringBuilder sb2 = new StringBuilder();
                synchronized (AbstractC18630e.f93736b) {
                    for (int i11 = 0; i11 < size; i11++) {
                        try {
                            sb2.append(((AbstractC32562b) list.get(i11)).toString());
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                if (sb2.length() > 0) {
                    AbstractC23466c.m123219v(sb2.toString(), AbstractC23466c.m123212o("worker/"));
                }
                AbstractC19166g.m100573w(System.currentTimeMillis());
            }
        }
    }

    /* renamed from: b */
    public static void m98439b(int i11, Object obj, long j11, long j12, String str, boolean z11, String str2) {
        if (C23476m.m123248f() && !Debug.isDebuggerConnected()) {
            C19168i.m100579c(new a(System.currentTimeMillis(), i11, obj, j11, j12, str, z11, str2));
            if (f93735a.size() > 500 || (!f93735a.isEmpty() && System.currentTimeMillis() - AbstractC19166g.m100556f() > 30000)) {
                C19168i.m100580d(new b(), f93735a);
            }
        }
    }
}
