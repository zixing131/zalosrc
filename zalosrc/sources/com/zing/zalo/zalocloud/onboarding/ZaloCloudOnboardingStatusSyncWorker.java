package com.zing.zalo.zalocloud.onboarding;

import am.AbstractC0924m0;
import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC2252t;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.zing.zalo.data.zalocloud.model.api.UpdateMigrationStatusParams;
import com.zing.zalo.data.zalocloud.model.api.UpdateMigrationSubStatusParams;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import nl.C23870a;
import og0.C24252c;
import og0.EnumC24251b;
import p348mi.AbstractC23306f;
import pm0.AbstractC24862s;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wg0.AbstractC28991n;
import wm0.AbstractC29096d;

/* loaded from: classes7.dex */
public final class ZaloCloudOnboardingStatusSyncWorker extends CoroutineWorker {
    public static final C16876a Companion = new C16876a(null);

    /* renamed from: com.zing.zalo.zalocloud.onboarding.ZaloCloudOnboardingStatusSyncWorker$a */
    /* loaded from: classes7.dex */
    public static final class C16876a {
        private C16876a() {
        }

        public /* synthetic */ C16876a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.onboarding.ZaloCloudOnboardingStatusSyncWorker$b */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C16877b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f85878a;

        static {
            int[] iArr = new int[EnumC24251b.values().length];
            try {
                iArr[EnumC24251b.f117146q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24251b.f117147r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24251b.f117148s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f85878a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.onboarding.ZaloCloudOnboardingStatusSyncWorker$c */
    /* loaded from: classes7.dex */
    public static final class C16878c extends AbstractC29096d {

        /* renamed from: s */
        Object f85879s;

        /* renamed from: t */
        int f85880t;

        /* renamed from: u */
        int f85881u;

        /* renamed from: v */
        int f85882v;

        /* renamed from: w */
        int f85883w;

        /* renamed from: x */
        /* synthetic */ Object f85884x;

        /* renamed from: z */
        int f85886z;

        C16878c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85884x = obj;
            this.f85886z |= Integer.MIN_VALUE;
            return ZaloCloudOnboardingStatusSyncWorker.this.mo11443d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZaloCloudOnboardingStatusSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC19074t.m100208f(context, "appContext");
        AbstractC19074t.m100208f(workerParameters, "params");
    }

    /* renamed from: j */
    private final int m90160j() {
        return AbstractC0924m0.m2957C7();
    }

    /* renamed from: k */
    private final int m90161k() {
        return AbstractC0924m0.m2986D7();
    }

    /* renamed from: l */
    private final int m90162l() {
        return AbstractC0924m0.m3044F7();
    }

    /* renamed from: m */
    private final int m90163m() {
        return AbstractC0924m0.m3015E7();
    }

    /* renamed from: n */
    private final void m90164n(int i11) {
        AbstractC0924m0.m2947Bq(i11);
    }

    /* renamed from: o */
    private final void m90165o(int i11) {
        AbstractC0924m0.m2976Cq(i11);
    }

    /* renamed from: p */
    private final void m90166p(int i11) {
        AbstractC0924m0.m3034Eq(i11);
    }

    /* renamed from: q */
    private final void m90167q(int i11) {
        AbstractC0924m0.m3005Dq(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01e8 A[Catch: Exception -> 0x0042, CancellationException -> 0x0244, TryCatch #2 {CancellationException -> 0x0244, Exception -> 0x0042, blocks: (B:11:0x003d, B:12:0x01e0, B:14:0x01e8, B:17:0x01f7, B:22:0x0050, B:25:0x0149, B:28:0x015a, B:31:0x016b, B:34:0x017b, B:36:0x0181, B:38:0x0187, B:40:0x018d, B:42:0x0193, B:44:0x01a0, B:48:0x0173, B:52:0x0162, B:56:0x0151, B:60:0x0098, B:62:0x00a4, B:65:0x00ec, B:67:0x00f8, B:75:0x0103, B:76:0x0107, B:78:0x010d, B:90:0x0121, B:92:0x0127, B:99:0x012e, B:100:0x0133, B:82:0x0134, B:102:0x0139, B:104:0x00af, B:105:0x00b3, B:107:0x00b9, B:119:0x00cd, B:121:0x00d3, B:128:0x00da, B:129:0x00df, B:111:0x00e0, B:131:0x00e5), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01f7 A[Catch: Exception -> 0x0042, CancellationException -> 0x0244, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0244, Exception -> 0x0042, blocks: (B:11:0x003d, B:12:0x01e0, B:14:0x01e8, B:17:0x01f7, B:22:0x0050, B:25:0x0149, B:28:0x015a, B:31:0x016b, B:34:0x017b, B:36:0x0181, B:38:0x0187, B:40:0x018d, B:42:0x0193, B:44:0x01a0, B:48:0x0173, B:52:0x0162, B:56:0x0151, B:60:0x0098, B:62:0x00a4, B:65:0x00ec, B:67:0x00f8, B:75:0x0103, B:76:0x0107, B:78:0x010d, B:90:0x0121, B:92:0x0127, B:99:0x012e, B:100:0x0133, B:82:0x0134, B:102:0x0139, B:104:0x00af, B:105:0x00b3, B:107:0x00b9, B:119:0x00cd, B:121:0x00d3, B:128:0x00da, B:129:0x00df, B:111:0x00e0, B:131:0x00e5), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo11443d(Continuation continuation) {
        C16878c c16878c;
        Object obj;
        Object m142578e;
        int i11;
        boolean m144791C;
        boolean z11;
        boolean m144791C2;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        ZaloCloudOnboardingStatusSyncWorker zaloCloudOnboardingStatusSyncWorker;
        try {
            if (continuation instanceof C16878c) {
                c16878c = (C16878c) continuation;
                int i19 = c16878c.f85886z;
                if ((i19 & Integer.MIN_VALUE) != 0) {
                    c16878c.f85886z = i19 - Integer.MIN_VALUE;
                    obj = c16878c.f85884x;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = c16878c.f85886z;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            i16 = c16878c.f85883w;
                            i17 = c16878c.f85882v;
                            i18 = c16878c.f85881u;
                            i15 = c16878c.f85880t;
                            zaloCloudOnboardingStatusSyncWorker = (ZaloCloudOnboardingStatusSyncWorker) c16878c.f85879s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        C26676b.m136957g("SMLZCloudOnboardingStatusSyncWorker", "Start sync migration to server: lastSyncedStatus=" + m90163m() + ", lastSyncedBackupStatus=" + m90160j() + ", lastSyncedMyCloudStatus=" + m90162l() + ", lastSyncedCloudMediaStatus=" + m90161k(), null, 4, null);
                        int i21 = 2;
                        if (AbstractC28991n.m144839y()) {
                            i12 = 3;
                        } else {
                            List m126597c = C24252c.f117152a.m126597c();
                            if (!(m126597c instanceof Collection) || !m126597c.isEmpty()) {
                                Iterator it = m126597c.iterator();
                                while (it.hasNext()) {
                                    int i22 = C16877b.f85878a[((EnumC24251b) it.next()).ordinal()];
                                    if (i22 != 1) {
                                        if (i22 != 2) {
                                            if (i22 == 3) {
                                                if (AbstractC28991n.m144795G() && AbstractC28991n.m144789A()) {
                                                }
                                                z11 = false;
                                                break;
                                            }
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        m144791C = AbstractC28991n.m144793E();
                                    } else {
                                        m144791C = AbstractC28991n.m144791C();
                                    }
                                    if (!m144791C) {
                                        z11 = false;
                                        break;
                                    }
                                }
                            }
                            z11 = true;
                            List m126597c2 = C24252c.f117152a.m126597c();
                            if (!(m126597c2 instanceof Collection) || !m126597c2.isEmpty()) {
                                Iterator it2 = m126597c2.iterator();
                                while (it2.hasNext()) {
                                    int i23 = C16877b.f85878a[((EnumC24251b) it2.next()).ordinal()];
                                    if (i23 != 1) {
                                        if (i23 != 2) {
                                            if (i23 == 3) {
                                                if (!AbstractC28991n.m144795G() && !AbstractC28991n.m144789A()) {
                                                }
                                                z12 = true;
                                                break;
                                            }
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        m144791C2 = AbstractC28991n.m144793E();
                                    } else {
                                        m144791C2 = AbstractC28991n.m144791C();
                                    }
                                    if (m144791C2) {
                                        z12 = true;
                                        break;
                                    }
                                }
                            }
                            z12 = false;
                            if (z11) {
                                i12 = 2;
                            } else if (z12) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                        }
                        if (AbstractC28991n.m144840z()) {
                            i13 = 3;
                        } else if (AbstractC28991n.m144789A()) {
                            i13 = 2;
                        } else {
                            i13 = 0;
                        }
                        if (AbstractC28991n.m144792D()) {
                            i14 = 3;
                        } else if (AbstractC28991n.m144793E()) {
                            i14 = 2;
                        } else {
                            i14 = 0;
                        }
                        if (AbstractC28991n.m144790B()) {
                            i21 = 3;
                        } else if (!AbstractC28991n.m144791C()) {
                            i21 = 0;
                        }
                        if (i12 == m90163m() && i13 == m90160j() && i14 == m90162l() && i21 == m90161k()) {
                            C26676b.m136957g("SMLZCloudOnboardingStatusSyncWorker", "Migration status has already synced", null, 4, null);
                            AbstractC2252t.a m11891c = AbstractC2252t.a.m11891c();
                            AbstractC19074t.m100207e(m11891c, "success(...)");
                            return m11891c;
                        }
                        UpdateMigrationSubStatusParams updateMigrationSubStatusParams = new UpdateMigrationSubStatusParams(i14, i13, i21);
                        String str = Build.MODEL;
                        AbstractC19074t.m100207e(str, "MODEL");
                        int i24 = i14;
                        UpdateMigrationStatusParams updateMigrationStatusParams = new UpdateMigrationStatusParams(i12, updateMigrationSubStatusParams, 1, str, AbstractC23306f.m120579F1().mo124314i());
                        C23870a m120679j2 = AbstractC23306f.m120679j2();
                        c16878c.f85879s = this;
                        c16878c.f85880t = i12;
                        c16878c.f85881u = i13;
                        c16878c.f85882v = i24;
                        c16878c.f85883w = i21;
                        c16878c.f85886z = 1;
                        Object m124847z1 = m120679j2.m124847z1(updateMigrationStatusParams, c16878c);
                        if (m124847z1 == m142578e) {
                            return m142578e;
                        }
                        i15 = i12;
                        obj = m124847z1;
                        i16 = i21;
                        i17 = i24;
                        i18 = i13;
                        zaloCloudOnboardingStatusSyncWorker = this;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        C26676b.m136957g("SMLZCloudOnboardingStatusSyncWorker", "Error while syncing migration status to server, retry later", null, 4, null);
                        AbstractC2252t.a m11890b = AbstractC2252t.a.m11890b();
                        AbstractC19074t.m100207e(m11890b, "retry(...)");
                        return m11890b;
                    }
                    C26676b.m136957g("SMLZCloudOnboardingStatusSyncWorker", "Migration status synced to server: status=" + i15 + ", backupStatus=" + i18 + ", myCloudStatus=" + i17 + ", cloudMediaStatus=" + i16, null, 4, null);
                    zaloCloudOnboardingStatusSyncWorker.m90167q(i15);
                    zaloCloudOnboardingStatusSyncWorker.m90164n(i18);
                    zaloCloudOnboardingStatusSyncWorker.m90166p(i17);
                    zaloCloudOnboardingStatusSyncWorker.m90165o(i16);
                    AbstractC2252t.a m11891c2 = AbstractC2252t.a.m11891c();
                    AbstractC19074t.m100207e(m11891c2, "success(...)");
                    return m11891c2;
                }
            }
            if (i11 == 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } catch (CancellationException unused) {
            C26676b.m136952b("SMLZCloudOnboardingStatusSyncWorker", "onCancelled()");
            AbstractC2252t.a m11889a = AbstractC2252t.a.m11889a();
            AbstractC19074t.m100207e(m11889a, "failure(...)");
            return m11889a;
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudOnboardingStatusSyncWorker", e11);
            AbstractC2252t.a m11890b2 = AbstractC2252t.a.m11890b();
            AbstractC19074t.m100207e(m11890b2, "retry(...)");
            return m11890b2;
        }
        c16878c = new C16878c(continuation);
        obj = c16878c.f85884x;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16878c.f85886z;
    }
}
