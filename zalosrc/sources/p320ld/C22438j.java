package p320ld;

import ag0.C0815e1;
import ah0.C0860a;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ch0.AbstractC3489d;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.data.zalocloud.model.api.CloudInfoResponse;
import com.zing.zalo.data.zalocloud.model.api.SubscriptionInfo;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.backuprestore.detail.BackupDetailView;
import com.zing.zalo.p077ui.backuprestore.drive.SyncGoogleAccountMediaRestoreView;
import com.zing.zalo.p077ui.backuprestore.intro.BackupRestoreIntroView;
import com.zing.zalo.p077ui.backuprestore.intro.SyncBackupSetupView;
import com.zing.zalo.p077ui.backuprestore.remind.RemindBackupView;
import com.zing.zalo.p077ui.backuprestore.remind.ZCloudNoBackupInfoWarningView;
import com.zing.zalo.p077ui.backuprestore.restore.RestoreMessageStartupView;
import com.zing.zalo.p077ui.backuprestore.settings.SettingBackupRestoreView;
import com.zing.zalo.p077ui.backuprestore.syncmessage.SyncRestoreSetupView;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncMessageForceSetPassView;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncRestoreInputPassView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zalocloud.restore.C13958c;
import com.zing.zalo.p077ui.zalocloud.restore.ZCloudRestoreContainerView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudSetupContainerView;
import com.zing.zalo.zalocloud.info.C16806a;
import com.zing.zalo.zview.C17487o0;
import dh0.C17933b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import me0.AbstractC23152n3;
import nh0.C23793c;
import nl.C23870a;
import og0.C24252c;
import og0.EnumC24251b;
import on0.AbstractC24341v;
import p348mi.AbstractC23306f;
import p487rl.C25820a;
import p542ub.InterfaceC27218a;
import p645xh.C29628e;
import pg0.C24747a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import sc.C26220b;
import si.C26263i;
import tb0.C26626l;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wg0.AbstractC28991n;
import wg0.C28989l;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: ld.j */
/* loaded from: classes3.dex */
public final class C22438j {

    /* renamed from: a */
    public static final C22438j f109770a = new C22438j();

    /* renamed from: b */
    private static AtomicBoolean f109771b = new AtomicBoolean(true);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ld.j$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f109772t;

        /* renamed from: u */
        Object f109773u;

        /* renamed from: v */
        Object f109774v;

        /* renamed from: w */
        Object f109775w;

        /* renamed from: x */
        Object f109776x;

        /* renamed from: y */
        int f109777y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC18494a f109778z;

        /* renamed from: ld.j$a$a */
        /* loaded from: classes3.dex */
        public static final class C32883a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f109779t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18494a f109780u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32883a(InterfaceC18494a interfaceC18494a, Continuation continuation) {
                super(2, continuation);
                this.f109780u = interfaceC18494a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new C32883a(this.f109780u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f109779t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f109780u.mo12V4();
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C32883a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: ld.j$a$b */
        /* loaded from: classes3.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C28989l f109781q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C28989l c28989l) {
                super(1);
                this.f109781q = c28989l;
            }

            /* renamed from: a */
            public final void m115965a(int i11) {
                this.f109781q.m144760j(i11, true, false);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m115965a(((Number) obj).intValue());
                return C24848g0.f119245a;
            }
        }

        /* renamed from: ld.j$a$c */
        /* loaded from: classes3.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C28989l f109782q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C28989l c28989l) {
                super(1);
                this.f109782q = c28989l;
            }

            /* renamed from: a */
            public final void m115966a(int i11) {
                this.f109782q.m144758L(i11, true, false);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m115966a(((Number) obj).intValue());
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC18494a interfaceC18494a, Continuation continuation) {
            super(2, continuation);
            this.f109778z = interfaceC18494a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f109778z, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0186 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            TargetBackupInfo targetBackupInfo;
            C24747a c24747a;
            String str;
            InterfaceC18505l interfaceC18505l;
            InterfaceC18505l interfaceC18505l2;
            String str2;
            InterfaceC18505l interfaceC18505l3;
            InterfaceC18505l interfaceC18505l4;
            C24747a c24747a2;
            TargetBackupInfo targetBackupInfo2;
            MainCoroutineDispatcher m112681c;
            C32883a c32883a;
            CloudInfoResponse cloudInfoResponse;
            List m126596b;
            C24252c c24252c;
            EnumC24251b enumC24251b;
            SubscriptionInfo m41276b;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109777y;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC18505l3 = (InterfaceC18505l) this.f109775w;
                    interfaceC18505l4 = (InterfaceC18505l) this.f109774v;
                    c24747a2 = (C24747a) this.f109773u;
                    targetBackupInfo2 = (TargetBackupInfo) this.f109772t;
                    AbstractC24862s.m129228b(obj);
                    cloudInfoResponse = (CloudInfoResponse) obj;
                    if (cloudInfoResponse == null && (m41276b = cloudInfoResponse.m41276b()) != null && m41276b.m41387a()) {
                        interfaceC18505l4.mo205i9(AbstractC29094b.m145341c(AbstractC28991n.m144822h()));
                    } else {
                        m126596b = C24252c.f117152a.m126596b();
                        if (true ^ m126596b.isEmpty()) {
                            interfaceC18505l3.mo205i9(AbstractC29094b.m145341c(AbstractC28991n.m144820f(m126596b)));
                        }
                    }
                    c24252c = C24252c.f117152a;
                    enumC24251b = EnumC24251b.f117148s;
                    if (c24252c.m126600f(enumC24251b)) {
                        c24747a2.m128509A(false);
                    } else if (C22447s.m116047m0(targetBackupInfo2, false, 2, null) && C26263i.m135012E() && c24252c.m126600f(enumC24251b)) {
                        c24747a2.m128509A(false);
                    } else {
                        C26220b.m134826i("SMLSyncFlowUtils", "completeOnboardingSetup(): checked from login", null, 4, null);
                        c24747a2.m128523g();
                    }
                    m112681c = Dispatchers.m112681c();
                    c32883a = new C32883a(this.f109778z, null);
                    this.f109772t = null;
                    this.f109773u = null;
                    this.f109774v = null;
                    this.f109775w = null;
                    this.f109776x = null;
                    this.f109777y = 3;
                    if (BuildersKt.m112534g(m112681c, c32883a, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                str = (String) this.f109776x;
                interfaceC18505l2 = (InterfaceC18505l) this.f109775w;
                interfaceC18505l = (InterfaceC18505l) this.f109774v;
                c24747a = (C24747a) this.f109773u;
                targetBackupInfo = (TargetBackupInfo) this.f109772t;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                TargetBackupInfo m135058w = C26263i.m135058w();
                C24747a m120636Y1 = AbstractC23306f.m120636Y1();
                AbstractC19074t.m100207e(m120636Y1, "provideZaloCloudCriticalCaseManager(...)");
                C16806a m120643a2 = AbstractC23306f.m120643a2();
                AbstractC19074t.m100207e(m120643a2, "provideZaloCloudInfoManager(...)");
                C23870a m120679j2 = AbstractC23306f.m120679j2();
                AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
                boolean m128534s = m120636Y1.m128534s();
                C28989l m120667g2 = AbstractC23306f.m120667g2();
                AbstractC19074t.m100207e(m120667g2, "provideZaloCloudOnboardingJobManager(...)");
                c cVar = new c(m120667g2);
                b bVar = new b(m120667g2);
                if (m128534s) {
                    m120636Y1.m128516H(true);
                    m120636Y1.m128538x();
                    cVar.mo205i9(AbstractC29094b.m145341c(0));
                    m112681c = Dispatchers.m112681c();
                    c32883a = new C32883a(this.f109778z, null);
                    this.f109772t = null;
                    this.f109773u = null;
                    this.f109774v = null;
                    this.f109775w = null;
                    this.f109776x = null;
                    this.f109777y = 3;
                    if (BuildersKt.m112534g(m112681c, c32883a, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
                String m89840j = m120643a2.m89840j();
                this.f109772t = m135058w;
                this.f109773u = m120636Y1;
                this.f109774v = cVar;
                this.f109775w = bVar;
                this.f109776x = m89840j;
                this.f109777y = 1;
                Object m124797Y = m120679j2.m124797Y(this);
                if (m124797Y == m142578e) {
                    return m142578e;
                }
                targetBackupInfo = m135058w;
                c24747a = m120636Y1;
                str = m89840j;
                obj = m124797Y;
                interfaceC18505l = cVar;
                interfaceC18505l2 = bVar;
            }
            C25820a c25820a = (C25820a) obj;
            if (c25820a == null || (str2 = c25820a.m133136c()) == null) {
                str2 = "";
            }
            if (str.length() == 0) {
                c24747a.m128538x();
                interfaceC18505l.mo205i9(AbstractC29094b.m145341c(0));
            } else if (!AbstractC19074t.m100204b(str2, str)) {
                c24747a.m128509A(true);
                interfaceC18505l.mo205i9(AbstractC29094b.m145341c(AbstractC28991n.m144822h()));
            } else {
                C23870a m120679j22 = AbstractC23306f.m120679j2();
                this.f109772t = targetBackupInfo;
                this.f109773u = c24747a;
                this.f109774v = interfaceC18505l;
                this.f109775w = interfaceC18505l2;
                this.f109776x = null;
                this.f109777y = 2;
                obj = m120679j22.m124785P(this);
                if (obj == m142578e) {
                    return m142578e;
                }
                interfaceC18505l3 = interfaceC18505l2;
                interfaceC18505l4 = interfaceC18505l;
                c24747a2 = c24747a;
                targetBackupInfo2 = targetBackupInfo;
                cloudInfoResponse = (CloudInfoResponse) obj;
                if (cloudInfoResponse == null) {
                }
                m126596b = C24252c.f117152a.m126596b();
                if (true ^ m126596b.isEmpty()) {
                }
                c24252c = C24252c.f117152a;
                enumC24251b = EnumC24251b.f117148s;
                if (c24252c.m126600f(enumC24251b)) {
                }
            }
            m112681c = Dispatchers.m112681c();
            c32883a = new C32883a(this.f109778z, null);
            this.f109772t = null;
            this.f109773u = null;
            this.f109774v = null;
            this.f109775w = null;
            this.f109776x = null;
            this.f109777y = 3;
            if (BuildersKt.m112534g(m112681c, c32883a, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ld.j$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C17487o0 f109783q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C17487o0 c17487o0) {
            super(2);
            this.f109783q = c17487o0;
        }

        /* renamed from: a */
        public final void m115967a(boolean z11, long j11) {
            if (z11) {
                C26626l.m136659W(C26626l.Companion.m136712a(), this.f109783q, null, j11, false, true, false, 40, null);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m115967a(((Boolean) obj).booleanValue(), ((Number) obj2).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ld.j$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Bundle f109784q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Bundle bundle) {
            super(1);
            this.f109784q = bundle;
        }

        /* renamed from: a */
        public final void m115968a(C17487o0 c17487o0) {
            AbstractC19074t.m100208f(c17487o0, "viewManager");
            if (c17487o0.m92993D0(ZCloudSetupContainerView.class) != null) {
                C26676b.m136957g("SMLSyncFlowUtils", "Exist ZaloCloudRestoreView view before", null, 4, null);
            } else {
                c17487o0.m93069k2(ZCloudRestoreContainerView.class, this.f109784q, 1, true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m115968a((C17487o0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ld.j$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Bundle f109785q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Bundle bundle) {
            super(0);
            this.f109785q = bundle;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m115969a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m115969a() {
            Intent m119014P = AbstractC23152n3.m119014P(ZCloudSetupContainerView.class, this.f109785q, false);
            AbstractC19074t.m100207e(m119014P, "makeIntentShowZaloView(...)");
            MainApplication.Companion.m35500c().startActivity(m119014P);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ld.j$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Bundle f109786q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Bundle bundle) {
            super(1);
            this.f109786q = bundle;
        }

        /* renamed from: a */
        public final void m115970a(C17487o0 c17487o0) {
            AbstractC19074t.m100208f(c17487o0, "viewManager");
            if (c17487o0.m92993D0(ZCloudSetupContainerView.class) != null) {
                C26676b.m136957g("SMLSyncFlowUtils", "Exist ZCloudSetupContainerView view before", null, 4, null);
            } else {
                c17487o0.m93069k2(ZCloudSetupContainerView.class, this.f109786q, 1, true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m115970a((C17487o0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ld.j$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Bundle f109787q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Bundle bundle) {
            super(0);
            this.f109787q = bundle;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m115971a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m115971a() {
            Intent m119014P = AbstractC23152n3.m119014P(ZCloudSetupContainerView.class, this.f109787q, false);
            AbstractC19074t.m100207e(m119014P, "makeIntentShowZaloView(...)");
            MainApplication.Companion.m35500c().startActivity(m119014P);
        }
    }

    private C22438j() {
    }

    /* renamed from: A */
    private final void m115927A(C17487o0 c17487o0) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        if (c17487o0 != null) {
            c17487o0.m93069k2(MainTabView.class, null, 0, true);
        }
    }

    /* renamed from: B */
    private final void m115928B(C17487o0 c17487o0, TargetBackupInfo targetBackupInfo) {
        C26220b.m134827j("showEmptyBackupRemindView(): targetBackupInfo=" + targetBackupInfo, null, 2, null);
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        bundle.putParcelable("EXTRA_BACKUP_INFO", targetBackupInfo);
        c17487o0.m93069k2(RemindBackupView.class, bundle, 0, true);
    }

    /* renamed from: C */
    private final void m115929C(C17487o0 c17487o0, TargetBackupInfo targetBackupInfo) {
        C26220b.m134827j("showRestoreMessageStartupView(): targetBackupInfo=" + targetBackupInfo, null, 2, null);
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        bundle.putParcelable("EXTRA_BACKUP_INFO", targetBackupInfo);
        c17487o0.m93069k2(RestoreMessageStartupView.class, bundle, 0, true);
    }

    /* renamed from: D */
    public static final void m115930D(C17487o0 c17487o0, int i11, TargetBackupInfo targetBackupInfo) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        C26220b.m134827j("startFlowSetupBackup(): entryPoint=" + i11, null, 2, null);
        Bundle bundle = new Bundle();
        bundle.putInt("extra_entry_point", i11);
        if (targetBackupInfo != null) {
            bundle.putParcelable("extra_target_backup_info", targetBackupInfo);
        }
        c17487o0.m93066i2(SyncBackupSetupView.class, bundle, 1806, 0, true);
    }

    /* renamed from: E */
    public static final void m115931E(C17487o0 c17487o0, int i11, boolean z11) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        bundle.putInt("EXTRA_FROM_SYNC_ENTRY_POINT", i11);
        bundle.putBoolean("EXTRA_SYNC_AFTER_SET", z11);
        c17487o0.m93066i2(SyncMessageForceSetPassView.class, bundle, 18053, 1, true);
        C0815e1.m2078H("1", i11, "");
    }

    /* renamed from: F */
    public static final void m115932F(C17487o0 c17487o0, int i11, TargetBackupInfo targetBackupInfo, boolean z11) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        C26220b.m134827j("startFlowSetupGoggleAccountBackup(): entryPoint=" + i11, null, 2, null);
        Bundle bundle = new Bundle();
        bundle.putInt("extra_entry_point", i11);
        if (z11) {
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        }
        if (targetBackupInfo != null) {
            bundle.putParcelable("extra_target_backup_info", targetBackupInfo);
        }
        c17487o0.m93066i2(BackupRestoreIntroView.class, bundle, 18055, 1, true);
    }

    /* renamed from: G */
    public static /* synthetic */ void m115933G(C17487o0 c17487o0, int i11, TargetBackupInfo targetBackupInfo, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        m115932F(c17487o0, i11, targetBackupInfo, z11);
    }

    /* renamed from: H */
    public static final void m115934H(C17487o0 c17487o0, TargetBackupInfo targetBackupInfo) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        AbstractC19074t.m100208f(targetBackupInfo, "backupInfo");
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_target_backup_info", targetBackupInfo);
        c17487o0.m93066i2(SyncGoogleAccountMediaRestoreView.class, bundle, 18054, 1, true);
    }

    /* renamed from: I */
    public static final void m115935I(C17487o0 c17487o0, int i11, TargetBackupInfo targetBackupInfo) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        AbstractC19074t.m100208f(targetBackupInfo, "backupInfo");
        C26220b.m134827j("startFlowSetupPasswordRestore(): entryPoint=" + i11, null, 2, null);
        Bundle bundle = new Bundle();
        bundle.putInt("extra_entry_point", i11);
        bundle.putParcelable("extra_target_backup_info", targetBackupInfo);
        c17487o0.m93066i2(SyncRestoreInputPassView.class, bundle, 1805, 1, true);
    }

    /* renamed from: J */
    public static final void m115936J(C17487o0 c17487o0, int i11, TargetBackupInfo targetBackupInfo) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        AbstractC19074t.m100208f(targetBackupInfo, "backupInfo");
        C26220b.m134827j("startFlowSetupRestore(): entryPoint=" + i11 + ", backupInfo=" + targetBackupInfo, null, 2, null);
        Bundle bundle = new Bundle();
        bundle.putInt("extra_entry_point", i11);
        bundle.putParcelable("extra_target_backup_info", targetBackupInfo);
        c17487o0.m93066i2(SyncRestoreSetupView.class, bundle, 1807, 0, true);
    }

    /* renamed from: c */
    public static final void m115938c(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "onComplete");
        BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new a(interfaceC18494a, null), 3, null);
    }

    /* renamed from: f */
    public static final boolean m115939f(C17487o0 c17487o0) {
        boolean z11;
        AbstractC19074t.m100208f(c17487o0, "viewManager");
        if (C26263i.m135058w() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        return m115940g(c17487o0, false, z11);
    }

    /* renamed from: g */
    public static final boolean m115940g(C17487o0 c17487o0, boolean z11, boolean z12) {
        if (c17487o0 == null) {
            C26220b.m134827j("checkShowBackupRestoreStartupView(): view manager is null", null, 2, null);
            return false;
        }
        if (C26263i.m135055u().m135071M()) {
            C26220b.m134827j("checkShowBackupRestoreStartupView(): is syncing", null, 2, null);
            return false;
        }
        boolean m89807v = AbstractC23306f.m120633X1().m89807v();
        C0860a m120691m2 = AbstractC23306f.m120691m2();
        AbstractC19074t.m100207e(m120691m2, "provideZaloCloudSubscriptionManager(...)");
        m120691m2.m2466q();
        if (m89807v && AbstractC3489d.m17513u()) {
            return m115942i(z11, c17487o0);
        }
        if (C22447s.m116046m()) {
            C22447s.m115996C0();
            if (!z11) {
                m115941h(c17487o0);
            }
            return true;
        }
        if (z11 || !C22447s.m116044l(z12)) {
            return false;
        }
        C22447s.m115992A0();
        C22438j c22438j = f109770a;
        if (c22438j.m115952u()) {
            c22438j.m115956y(c17487o0);
        } else {
            c22438j.m115955x(c17487o0);
        }
        return true;
    }

    /* renamed from: h */
    private static final boolean m115941h(C17487o0 c17487o0) {
        TargetBackupInfo m135058w = C26263i.m135058w();
        if (m135058w == null) {
            C26220b.m134827j("startFlowRestoreLogin(): no target backup", null, 2, null);
            return false;
        }
        C22438j c22438j = f109770a;
        if (c22438j.m115949q(m135058w)) {
            c22438j.m115928B(c17487o0, m135058w);
            return true;
        }
        c22438j.m115929C(c17487o0, m135058w);
        return true;
    }

    /* renamed from: i */
    public static final boolean m115942i(boolean z11, C17487o0 c17487o0) {
        AbstractC19074t.m100208f(c17487o0, "viewManager");
        if (!AbstractC23306f.m120633X1().m89807v()) {
            return false;
        }
        if (AbstractC3489d.m17512t() && C22447s.m116046m()) {
            C22447s.m115996C0();
            m115954w(C13958c.b.f71924p);
            return true;
        }
        C24747a m120636Y1 = AbstractC23306f.m120636Y1();
        AbstractC19074t.m100207e(m120636Y1, "provideZaloCloudCriticalCaseManager(...)");
        boolean m128535t = m120636Y1.m128535t();
        C23870a m120679j2 = AbstractC23306f.m120679j2();
        AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
        if (m120679j2.m124790R0()) {
            if (m120679j2.m124788Q0()) {
                C29628e.m147249E0().m147293v1();
                f109770a.m115927A(c17487o0);
            } else {
                C26626l.Companion.m136712a().m136707r(false, new b(c17487o0));
            }
            return true;
        }
        if (m120636Y1.m128529n() || !m120636Y1.m128530o() || z11 || m128535t) {
            return false;
        }
        C22447s.m115996C0();
        m115954w(C13958c.b.f71924p);
        return true;
    }

    /* renamed from: j */
    private final void m115943j(InterfaceC18505l interfaceC18505l, InterfaceC18494a interfaceC18494a) {
        InterfaceC27218a m57112d = ZaloLauncherActivity.Companion.m57112d();
        if (m57112d == null) {
            C26676b.m136957g("SMLSyncFlowUtils", "Activity null", null, 4, null);
            AbstractC23306f.m120636Y1().m128512D(true);
            interfaceC18494a.mo12V4();
            return;
        }
        m57112d.runOnUiThread(new Runnable() { // from class: ld.i

            /* renamed from: q */
            public final /* synthetic */ InterfaceC27218a f109769q;

            public /* synthetic */ RunnableC22437i(InterfaceC27218a m57112d2) {
                r2 = m57112d2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C22438j.m115944k(InterfaceC18505l.this, r2);
            }
        });
    }

    /* renamed from: k */
    public static final void m115944k(InterfaceC18505l interfaceC18505l, InterfaceC27218a interfaceC27218a) {
        AbstractC19074t.m100208f(interfaceC18505l, "$onUseZaloViewManager");
        C17487o0 mo35579p = interfaceC27218a.mo35579p();
        AbstractC19074t.m100207e(mo35579p, "getZaloViewManager(...)");
        interfaceC18505l.mo205i9(mo35579p);
    }

    /* renamed from: l */
    public static final Class m115945l() {
        if (AbstractC23306f.m120676j().m128393J()) {
            return BackupDetailView.class;
        }
        return SettingBackupRestoreView.class;
    }

    /* renamed from: n */
    public static final boolean m115946n(int i11) {
        return !m115948p(i11);
    }

    /* renamed from: o */
    public static final boolean m115947o(int i11) {
        return i11 == 18;
    }

    /* renamed from: p */
    public static final boolean m115948p(int i11) {
        if (i11 != 3 && i11 != 6 && i11 != 17 && i11 != 18) {
            switch (i11) {
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    private final boolean m115949q(TargetBackupInfo targetBackupInfo) {
        if (targetBackupInfo == null || !targetBackupInfo.isValid() || C23793c.Companion.m124321a().mo124314i() - targetBackupInfo.m40950f() <= AbstractC23306f.m120676j().m128421q()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static final Intent m115950r(Bundle bundle, boolean z11) {
        if (AbstractC23306f.m120676j().m128393J()) {
            Intent m119014P = AbstractC23152n3.m119014P(BackupDetailView.class, bundle, z11);
            AbstractC19074t.m100205c(m119014P);
            return m119014P;
        }
        Intent m119014P2 = AbstractC23152n3.m119014P(SettingBackupRestoreView.class, bundle, z11);
        AbstractC19074t.m100205c(m119014P2);
        return m119014P2;
    }

    /* renamed from: s */
    public static /* synthetic */ Intent m115951s(Bundle bundle, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bundle = null;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return m115950r(bundle, z11);
    }

    /* renamed from: u */
    private final boolean m115952u() {
        return AbstractC3489d.m17513u();
    }

    /* renamed from: v */
    public static final void m115953v(C17487o0 c17487o0, Bundle bundle) {
        C26220b.m134827j("showBackupDetailView()", null, 2, null);
        if (AbstractC23306f.m120676j().m128393J()) {
            if (c17487o0 != null) {
                c17487o0.m93069k2(BackupDetailView.class, bundle, 1, true);
            }
        } else if (c17487o0 != null) {
            c17487o0.m93069k2(SettingBackupRestoreView.class, bundle, 1, true);
        }
    }

    /* renamed from: w */
    public static final void m115954w(C13958c.b bVar) {
        AbstractC19074t.m100208f(bVar, "trackingFlow");
        Bundle m77719a = C13958c.Companion.m77719a(bVar);
        f109770a.m115943j(new c(m77719a), new d(m77719a));
    }

    /* renamed from: x */
    private final void m115955x(C17487o0 c17487o0) {
        C26220b.m134827j("showEmptyBackupRemindView()", null, 2, null);
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        c17487o0.m93069k2(RemindBackupView.class, bundle, 0, true);
    }

    /* renamed from: y */
    private final void m115956y(C17487o0 c17487o0) {
        if (!m115952u()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        c17487o0.m93069k2(ZCloudNoBackupInfoWarningView.class, bundle, 0, true);
    }

    /* renamed from: b */
    public final boolean m115957b(C17487o0 c17487o0, int i11, TargetBackupInfo targetBackupInfo, boolean z11) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        if (C26263i.m135011D0(i11, targetBackupInfo)) {
            m115931E(c17487o0, i11, z11);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m115958d(C17487o0 c17487o0, int i11, TargetBackupInfo targetBackupInfo) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        if (!C26263i.m135055u().m135073O()) {
            m115933G(c17487o0, i11, targetBackupInfo, false, 8, null);
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m115959e(C17487o0 c17487o0, int i11, TargetBackupInfo targetBackupInfo) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        if (!m115946n(i11) && targetBackupInfo != null && C26263i.m135047n0(i11, targetBackupInfo)) {
            m115935I(c17487o0, i11, targetBackupInfo);
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final AtomicBoolean m115960m() {
        return f109771b;
    }

    /* renamed from: t */
    public final boolean m115961t(TargetBackupInfo targetBackupInfo, String str) {
        boolean m127127w;
        if (!C22447s.m116057s(targetBackupInfo)) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        AbstractC19074t.m100205c(targetBackupInfo);
        m127127w = AbstractC24341v.m127127w(str, targetBackupInfo.m40959o(), false, 2, null);
        if (m127127w) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public final void m115962z() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_IS_OPT_IN_KEEP_OLD_BACKUP", true);
        m115943j(new e(bundle), new f(bundle));
    }
}
