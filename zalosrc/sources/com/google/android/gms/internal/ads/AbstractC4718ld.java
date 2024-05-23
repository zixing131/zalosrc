package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.ld */
/* loaded from: classes2.dex */
public abstract class AbstractC4718ld implements InterfaceC4681kd {

    /* renamed from: I */
    protected static volatile C4719le f23819I;

    /* renamed from: A */
    private double f23820A;

    /* renamed from: B */
    protected float f23821B;

    /* renamed from: C */
    protected float f23822C;

    /* renamed from: D */
    protected float f23823D;

    /* renamed from: E */
    protected float f23824E;

    /* renamed from: H */
    protected DisplayMetrics f23827H;

    /* renamed from: p */
    protected MotionEvent f23828p;

    /* renamed from: y */
    protected double f23837y;

    /* renamed from: z */
    private double f23838z;

    /* renamed from: q */
    protected final LinkedList f23829q = new LinkedList();

    /* renamed from: r */
    protected long f23830r = 0;

    /* renamed from: s */
    protected long f23831s = 0;

    /* renamed from: t */
    protected long f23832t = 0;

    /* renamed from: u */
    protected long f23833u = 0;

    /* renamed from: v */
    protected long f23834v = 0;

    /* renamed from: w */
    protected long f23835w = 0;

    /* renamed from: x */
    protected long f23836x = 0;

    /* renamed from: F */
    private boolean f23825F = false;

    /* renamed from: G */
    protected boolean f23826G = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4718ld(Context context) {
        try {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21409w2)).booleanValue()) {
                AbstractC4349bc.m20474d();
            } else {
                AbstractC4757me.m24551a(f23819I);
            }
            this.f23827H = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    private final void m24193f() {
        this.f23834v = 0L;
        this.f23830r = 0L;
        this.f23831s = 0L;
        this.f23832t = 0L;
        this.f23833u = 0L;
        this.f23835w = 0L;
        this.f23836x = 0L;
        if (this.f23829q.size() > 0) {
            Iterator it = this.f23829q.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f23829q.clear();
        } else {
            MotionEvent motionEvent = this.f23828p;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f23828p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009d  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String m24194g(Context context, String str, int i11, View view, Activity activity, byte[] bArr) {
        C4608id c4608id;
        String str2;
        int i12;
        Exception exc;
        int i13;
        int i14;
        String m20471a;
        int i15;
        int i16;
        int i17;
        int i18 = i11;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21219d2)).booleanValue();
        C4939ra c4939ra = null;
        if (booleanValue) {
            if (f23819I != null) {
                c4608id = f23819I.m24242d();
            } else {
                c4608id = null;
            }
            if (true != ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21409w2)).booleanValue()) {
                str2 = "te";
            } else {
                str2 = "be";
            }
        } else {
            c4608id = null;
            str2 = null;
        }
        try {
            if (i18 == 3) {
                c4939ra = mo24196b(context, view, activity);
                try {
                    this.f23825F = true;
                    i17 = ZAbstractBase.ZVU_BLEND_PERCENTAGE;
                } catch (Exception e11) {
                    exc = e11;
                    i12 = 3;
                    if (booleanValue) {
                        if (i18 != i12) {
                        }
                        c4608id.m23227c(i14, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (c4939ra != null) {
                        }
                        m20471a = Integer.toString(5);
                        return m20471a;
                    }
                    i13 = 2;
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (c4939ra != null) {
                    }
                    m20471a = Integer.toString(5);
                    return m20471a;
                }
            } else if (i18 == 2) {
                c4939ra = mo24198d(context, view, activity);
                i17 = 1008;
            } else {
                c4939ra = mo24197c(context, null);
                i17 = 1000;
            }
            if (booleanValue && c4608id != null) {
                i12 = 3;
                try {
                    c4608id.m23227c(i17, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e12) {
                    e = e12;
                    exc = e;
                    if (booleanValue && c4608id != null) {
                        if (i18 != i12) {
                            i13 = 2;
                            i14 = ZAbstractBase.ZVU_BLEND_GEN_THUMB;
                        } else {
                            i13 = 2;
                            if (i18 == 2) {
                                i14 = 1009;
                            } else {
                                i18 = 1;
                                i14 = 1001;
                            }
                        }
                        c4608id.m23227c(i14, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis222 = System.currentTimeMillis();
                        if (c4939ra != null) {
                        }
                        m20471a = Integer.toString(5);
                        return m20471a;
                    }
                    i13 = 2;
                    long currentTimeMillis2222 = System.currentTimeMillis();
                    if (c4939ra != null) {
                    }
                    m20471a = Integer.toString(5);
                    return m20471a;
                }
            } else {
                i12 = 3;
            }
        } catch (Exception e13) {
            e = e13;
            i12 = 3;
        }
        i13 = 2;
        long currentTimeMillis22222 = System.currentTimeMillis();
        if (c4939ra != null) {
            try {
            } catch (Exception e14) {
                m20471a = Integer.toString(7);
                if (booleanValue && c4608id != null) {
                    if (i18 == i12) {
                        i16 = 1007;
                    } else if (i18 == i13) {
                        i16 = 1011;
                    } else {
                        i16 = 1005;
                    }
                    c4608id.m23227c(i16, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, e14);
                }
            }
            if (((C4606ib) c4939ra.m25898n()).mo26776f() != 0) {
                m20471a = AbstractC4349bc.m20471a((C4606ib) c4939ra.m25898n(), str);
                if (booleanValue && c4608id != null) {
                    if (i18 == i12) {
                        i15 = 1006;
                    } else if (i18 == i13) {
                        i15 = 1010;
                    } else {
                        i15 = 1004;
                    }
                    c4608id.m23227c(i15, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, null);
                }
                return m20471a;
            }
        }
        m20471a = Integer.toString(5);
        return m20471a;
    }

    /* renamed from: a */
    protected abstract long mo24195a(StackTraceElement[] stackTraceElementArr);

    /* renamed from: b */
    protected abstract C4939ra mo24196b(Context context, View view, Activity activity);

    /* renamed from: c */
    protected abstract C4939ra mo24197c(Context context, C4678ka c4678ka);

    /* renamed from: d */
    protected abstract C4939ra mo24198d(Context context, View view, Activity activity);

    /* renamed from: e */
    protected abstract C4794ne mo24199e(MotionEvent motionEvent);

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final String zze(Context context, String str, View view) {
        return m24194g(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final String zzf(Context context, String str, View view, Activity activity) {
        return m24194g(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final String zzg(Context context) {
        if (!AbstractC4831oe.m25171f()) {
            return m24194g(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final String zzh(Context context, View view, Activity activity) {
        return m24194g(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l11;
        try {
            if (this.f23825F) {
                m24193f();
                this.f23825F = false;
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 2) {
                    double rawX = motionEvent.getRawX();
                    double rawY = motionEvent.getRawY();
                    double d11 = rawX - this.f23838z;
                    double d12 = rawY - this.f23820A;
                    this.f23837y += Math.sqrt((d11 * d11) + (d12 * d12));
                    this.f23838z = rawX;
                    this.f23820A = rawY;
                }
            } else {
                this.f23837y = 0.0d;
                this.f23838z = motionEvent.getRawX();
                this.f23820A = motionEvent.getRawY();
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 != 1) {
                        if (action2 != 2) {
                            if (action2 == 3) {
                                this.f23833u++;
                            }
                        } else {
                            this.f23831s += motionEvent.getHistorySize() + 1;
                            C4794ne mo24199e = mo24199e(motionEvent);
                            Long l12 = mo24199e.f25153d;
                            if (l12 != null && mo24199e.f25156g != null) {
                                this.f23835w += l12.longValue() + mo24199e.f25156g.longValue();
                            }
                            if (this.f23827H != null && (l11 = mo24199e.f25154e) != null && mo24199e.f25157h != null) {
                                this.f23836x += l11.longValue() + mo24199e.f25157h.longValue();
                            }
                        }
                    } else {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.f23828p = obtain;
                        this.f23829q.add(obtain);
                        if (this.f23829q.size() > 6) {
                            ((MotionEvent) this.f23829q.remove()).recycle();
                        }
                        this.f23832t++;
                        this.f23834v = mo24195a(new Throwable().getStackTrace());
                    }
                } catch (zzapv unused) {
                }
            } else {
                this.f23821B = motionEvent.getX();
                this.f23822C = motionEvent.getY();
                this.f23823D = motionEvent.getRawX();
                this.f23824E = motionEvent.getRawY();
                this.f23830r++;
            }
            this.f23826G = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final synchronized void zzl(int i11, int i12, int i13) {
        try {
            if (this.f23828p != null) {
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21199b2)).booleanValue()) {
                    m24193f();
                } else {
                    this.f23828p.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f23827H;
            if (displayMetrics != null) {
                float f11 = displayMetrics.density;
                this.f23828p = MotionEvent.obtain(0L, i13, 1, i11 * f11, i12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f23828p = null;
            }
            this.f23826G = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
