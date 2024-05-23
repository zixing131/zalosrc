package p677yc;

import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import p128ed.C18390e;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23306f;
import sc.C26220b;

/* renamed from: yc.a */
/* loaded from: classes3.dex */
public abstract class AbstractC30897a {

    /* renamed from: a */
    private String f142499a;

    /* renamed from: b */
    private int f142500b;

    /* renamed from: c */
    private boolean f142501c;

    /* renamed from: d */
    private boolean f142502d;

    public AbstractC30897a(String str) {
        AbstractC19074t.m100208f(str, "token");
        this.f142499a = str;
        this.f142501c = true;
    }

    /* renamed from: d */
    public static /* synthetic */ void m150119d(AbstractC30897a abstractC30897a, int[] iArr, TimeUnit timeUnit, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                timeUnit = TimeUnit.SECONDS;
            }
            abstractC30897a.m150122c(iArr, timeUnit);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doTaskWithRetry");
    }

    /* renamed from: h */
    private final void m150120h(String str) {
        AbstractC20110a.f98889a.mo104548a(str, new Object[0]);
        C26220b.m134827j(str, null, 2, null);
    }

    /* renamed from: a */
    protected abstract void mo1205a();

    /* renamed from: b */
    public final void m150121b(int[] iArr) {
        m150119d(this, iArr, null, 2, null);
    }

    /* renamed from: c */
    public final void m150122c(int[] iArr, TimeUnit timeUnit) {
        AbstractC19074t.m100208f(timeUnit, "timeUnit");
        if (iArr != null) {
            String mo1207f = mo1207f();
            int length = iArr.length + 1;
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    this.f142500b = i11;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format("Start task %s - %s - time %d: ", Arrays.copyOf(new Object[]{mo1207f, mo1206e(), Integer.valueOf(i11)}, 3));
                    AbstractC19074t.m100207e(format, "format(...)");
                    m150120h(format);
                    mo1205a();
                    int i12 = this.f142500b;
                    if (i12 > 0) {
                        AbstractC20887g.m109248z(18868, String.valueOf(i12));
                    }
                    String format2 = String.format("Task %s %s success - time %d: ", Arrays.copyOf(new Object[]{mo1207f, mo1206e(), Integer.valueOf(i11)}, 3));
                    AbstractC19074t.m100207e(format2, "format(...)");
                    m150120h(format2);
                    return;
                } catch (BackupRestoreMediaException e11) {
                    m150120h("SyncMediaException: " + e11.getMessage());
                    if (e11.m37267a() != 40302 && e11.m37267a() != 40303) {
                        if (e11.m37267a() == 2003 && this.f142501c) {
                            this.f142501c = false;
                            if (i11 < iArr.length) {
                                String m132995l = AbstractC23306f.m120688m().m132995l(this.f142502d);
                                if (m132995l.length() != 0 && !AbstractC19074t.m100204b(this.f142499a, m132995l)) {
                                    this.f142499a = m132995l;
                                } else {
                                    C18390e.m97413u("GoogleDriveTask refreshToken-fail", false, 2, null);
                                    throw e11;
                                }
                            } else {
                                throw e11;
                            }
                        } else {
                            throw e11;
                        }
                    } else {
                        AbstractC20887g.m109240r(18867, String.valueOf(e11.m37267a()));
                        if (i11 < iArr.length) {
                            try {
                                C19067n0 c19067n02 = C19067n0.f94947a;
                                String format3 = String.format("Wait %d second before retry", Arrays.copyOf(new Object[]{Integer.valueOf(iArr[i11])}, 1));
                                AbstractC19074t.m100207e(format3, "format(...)");
                                m150120h(format3);
                                timeUnit.sleep(iArr[i11]);
                            } catch (InterruptedException e12) {
                                AbstractC20110a.f98889a.mo104551d("InterruptedException white waiting to the next task", new Object[0]);
                                throw e12;
                            }
                        } else {
                            throw e11;
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("Config interval retry sync media must not be null".toString());
    }

    /* renamed from: e */
    public abstract String mo1206e();

    /* renamed from: f */
    public abstract String mo1207f();

    /* renamed from: g */
    public final String m150123g() {
        return this.f142499a;
    }

    /* renamed from: i */
    public final void m150124i(boolean z11) {
        this.f142502d = z11;
    }
}
