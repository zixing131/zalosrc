package gd;

import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import p128ed.C18390e;
import p185gc.AbstractC19384h;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23306f;

/* renamed from: gd.a */
/* loaded from: classes3.dex */
public final class C19392a extends AbstractC19384h {

    /* renamed from: a */
    private final AbstractC19384h f96224a;

    /* renamed from: b */
    private int[] f96225b;

    /* renamed from: c */
    private TimeUnit f96226c;

    /* renamed from: d */
    private int f96227d;

    /* renamed from: e */
    private boolean f96228e;

    public /* synthetic */ C19392a(AbstractC19384h abstractC19384h, int[] iArr, TimeUnit timeUnit, int i11, AbstractC19060k abstractC19060k) {
        this(abstractC19384h, (i11 & 2) != 0 ? null : iArr, (i11 & 4) != 0 ? TimeUnit.SECONDS : timeUnit);
    }

    /* renamed from: d */
    private final void m101510d(int i11, int[] iArr) {
        try {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("Wait %d second before retry action", Arrays.copyOf(new Object[]{Integer.valueOf(iArr[i11])}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            C18390e.m97413u(format, false, 2, null);
            this.f96226c.sleep(iArr[i11]);
        } catch (InterruptedException e11) {
            AbstractC20110a.f98889a.mo104551d("InterruptedException white waiting to the next action", new Object[0]);
            throw e11;
        }
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v18 */
    @Override // p185gc.AbstractC19384h
    /* renamed from: b */
    protected Object mo13388b(Object obj) {
        String str;
        String str2;
        boolean z11;
        if (obj instanceof InterfaceC19394c) {
            InterfaceC19394c interfaceC19394c = (InterfaceC19394c) obj;
            str2 = interfaceC19394c.mo101516a();
            str = interfaceC19394c.mo101517f();
        } else {
            str = "";
            str2 = "";
        }
        int[] iArr = this.f96225b;
        if (iArr != null) {
            ?? r7 = 0;
            this.f96227d = 0;
            int length = iArr.length;
            int i11 = length + 1;
            Object obj2 = null;
            int i12 = 0;
            while (i12 < i11) {
                try {
                    this.f96227d = i12;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    Object[] objArr = new Object[3];
                    objArr[r7] = str2;
                    objArr[1] = str;
                    objArr[2] = Integer.valueOf(i12);
                    String format = String.format("Start action %s - %s - times %d", Arrays.copyOf(objArr, 3));
                    AbstractC19074t.m100207e(format, "format(...)");
                    C18390e.m97413u(format, r7, 2, null);
                    obj2 = this.f96224a.m101509a(obj);
                    int i13 = this.f96227d;
                    if (i13 > 0) {
                        AbstractC20887g.m109248z(18869, String.valueOf(i13));
                    }
                    Object[] objArr2 = new Object[3];
                    objArr2[r7] = str2;
                    objArr2[1] = str;
                    objArr2[2] = Integer.valueOf(i12);
                    String format2 = String.format("Action %s %s success - times %d", Arrays.copyOf(objArr2, 3));
                    AbstractC19074t.m100207e(format2, "format(...)");
                    C18390e.m97413u(format2, r7, 2, null);
                    break;
                } catch (BackupRestoreMediaException e11) {
                    C18390e.m97413u("SyncMediaException: " + e11.getMessage(), false, 2, null);
                    if (e11.m37267a() == 40302 || e11.m37267a() == 40303) {
                        z11 = false;
                        AbstractC20887g.m109240r(18870, String.valueOf(e11.m37267a()));
                        if (i12 < length) {
                            m101510d(i12, iArr);
                        } else {
                            throw e11;
                        }
                    } else {
                        if (e11.m37267a() == 2003) {
                            AbstractC19384h abstractC19384h = this.f96224a;
                            if ((abstractC19384h instanceof AbstractC19393b) && ((AbstractC19393b) abstractC19384h).m101512c()) {
                                ((AbstractC19393b) this.f96224a).m101514e(false);
                                if (i12 < length) {
                                    String m132995l = AbstractC23306f.m120688m().m132995l(this.f96228e);
                                    if (m132995l.length() != 0 && !AbstractC19074t.m100204b(((AbstractC19393b) this.f96224a).m101513d(), m132995l)) {
                                        ((AbstractC19393b) this.f96224a).m101515f(m132995l);
                                        z11 = false;
                                    } else {
                                        C18390e.m97413u("refreshToken-fail", false, 2, null);
                                        throw e11;
                                    }
                                } else {
                                    throw e11;
                                }
                            }
                        }
                        throw e11;
                    }
                    i12++;
                    r7 = z11;
                }
            }
            return obj2;
        }
        throw new IllegalArgumentException("Config interval retry sync media must not be null".toString());
    }

    /* renamed from: c */
    public final void m101511c(boolean z11) {
        this.f96228e = z11;
    }

    public C19392a(AbstractC19384h abstractC19384h, int[] iArr, TimeUnit timeUnit) {
        AbstractC19074t.m100208f(abstractC19384h, "useCaseWrapped");
        AbstractC19074t.m100208f(timeUnit, "timeUnit");
        this.f96224a = abstractC19384h;
        this.f96225b = iArr;
        this.f96226c = timeUnit;
    }
}
