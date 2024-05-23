package com.zing.zalo.p077ui.backuprestore.drive;

import ag0.AbstractC0837p0;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.backuprestore.drive.SyncGoogleAccountBaseView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import me0.C23055e5;
import mm0.AbstractC23350e;
import p158fd.C18880d;
import p348mi.AbstractC23306f;
import p421pc.C24720a;
import p484ri.C25804a;
import p605wc.C28911c;
import p640xc.C29574a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import sc.C26220b;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public abstract class SyncGoogleAccountBaseView extends SlidableZaloView {
    public static final C11014a Companion = new C11014a(null);

    /* renamed from: U0 */
    private static final String f55652U0 = "SMLSyncGoogleAccountBaseView";

    /* renamed from: P0 */
    private int f55653P0;

    /* renamed from: Q0 */
    private int f55654Q0;

    /* renamed from: R0 */
    private final InterfaceC24854k f55655R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f55656S0;

    /* renamed from: T0 */
    private boolean f55657T0;

    /* renamed from: com.zing.zalo.ui.backuprestore.drive.SyncGoogleAccountBaseView$a */
    /* loaded from: classes5.dex */
    public static final class C11014a {
        private C11014a() {
        }

        public /* synthetic */ C11014a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.drive.SyncGoogleAccountBaseView$b */
    /* loaded from: classes5.dex */
    static final class C11015b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11015b f55658q = new C11015b();

        C11015b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25804a mo12V4() {
            return AbstractC23306f.m120688m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.drive.SyncGoogleAccountBaseView$c */
    /* loaded from: classes5.dex */
    public static final class C11016c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ C28911c.c f55659A;

        /* renamed from: t */
        int f55660t;

        /* renamed from: u */
        int f55661u;

        /* renamed from: v */
        private /* synthetic */ Object f55662v;

        /* renamed from: w */
        final /* synthetic */ boolean f55663w;

        /* renamed from: x */
        final /* synthetic */ String f55664x;

        /* renamed from: y */
        final /* synthetic */ SyncGoogleAccountBaseView f55665y;

        /* renamed from: z */
        final /* synthetic */ String f55666z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.backuprestore.drive.SyncGoogleAccountBaseView$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f55667t;

            /* renamed from: u */
            final /* synthetic */ boolean f55668u;

            /* renamed from: v */
            final /* synthetic */ SyncGoogleAccountBaseView f55669v;

            /* renamed from: w */
            final /* synthetic */ String f55670w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z11, SyncGoogleAccountBaseView syncGoogleAccountBaseView, String str, Continuation continuation) {
                super(2, continuation);
                this.f55668u = z11;
                this.f55669v = syncGoogleAccountBaseView;
                this.f55670w = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f55668u, this.f55669v, this.f55670w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f55667t == 0) {
                    AbstractC24862s.m129228b(obj);
                    if (this.f55668u && this.f55669v.f55657T0) {
                        try {
                            C26220b.m134826i(SyncGoogleAccountBaseView.f55652U0, "fetchDataDriveFileMetadata", null, 4, null);
                            this.f55669v.m57528pM().m98984D(this.f55670w);
                        } catch (Exception e11) {
                            AbstractC23350e.m122778h(e11);
                        }
                    }
                    return AbstractC29094b.m145341c(1);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.backuprestore.drive.SyncGoogleAccountBaseView$c$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f55671t;

            /* renamed from: u */
            final /* synthetic */ boolean f55672u;

            /* renamed from: v */
            final /* synthetic */ String f55673v;

            /* renamed from: w */
            final /* synthetic */ SyncGoogleAccountBaseView f55674w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z11, String str, SyncGoogleAccountBaseView syncGoogleAccountBaseView, Continuation continuation) {
                super(2, continuation);
                this.f55672u = z11;
                this.f55673v = str;
                this.f55674w = syncGoogleAccountBaseView;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new b(this.f55672u, this.f55673v, this.f55674w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f55671t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (this.f55672u && this.f55673v.length() > 0) {
                        C25804a m57527oM = this.f55674w.m57527oM();
                        String str = this.f55673v;
                        m57527oM.m133006y();
                        m57527oM.m132982A(str, 1);
                        C25804a m57527oM2 = this.f55674w.m57527oM();
                        this.f55671t = 1;
                        obj = m57527oM2.m132999r(this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    }
                    return AbstractC29094b.m145341c(1);
                }
                long longValue = ((Number) obj).longValue();
                C25804a m57527oM3 = this.f55674w.m57527oM();
                C24720a.b bVar = C24720a.Companion;
                m57527oM3.m132990I(longValue, bVar.m128432a().m128422r(), bVar.m128432a().m128423s());
                return AbstractC29094b.m145341c(1);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11016c(boolean z11, String str, SyncGoogleAccountBaseView syncGoogleAccountBaseView, String str2, C28911c.c cVar, Continuation continuation) {
            super(2, continuation);
            this.f55663w = z11;
            this.f55664x = str;
            this.f55665y = syncGoogleAccountBaseView;
            this.f55666z = str2;
            this.f55659A = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static final void m57540t(SyncGoogleAccountBaseView syncGoogleAccountBaseView, C28911c.c cVar, String str) {
            String str2;
            int i11;
            syncGoogleAccountBaseView.mo49315c4();
            if (cVar == null || (str2 = cVar.m144424b()) == null) {
                str2 = "";
            }
            if (cVar != null) {
                i11 = cVar.m144425c();
            } else {
                i11 = 4;
            }
            Intent intent = null;
            if (str2.length() > 0 && i11 == 0) {
                syncGoogleAccountBaseView.m57527oM().m132983B(str2);
                syncGoogleAccountBaseView.m57527oM().m132984C(i11);
                SyncGoogleAccountBaseView.m57531zM(syncGoogleAccountBaseView, str, false, 2, null);
                ToastUtils.showMess(syncGoogleAccountBaseView.f72421L0.m92652XI(AbstractC8020f0.str_toast_reconnect_gdrive_success));
                return;
            }
            if (i11 == 2) {
                try {
                    Context context = syncGoogleAccountBaseView.getContext();
                    AbstractC19074t.m100206d(context, "null cannot be cast to non-null type android.app.Activity");
                    Activity activity = (Activity) context;
                    if (cVar != null) {
                        intent = cVar.m144423a();
                    }
                    activity.startActivityForResult(intent, ZAbstractBase.ZVU_BLEND_GEN_THUMB);
                    return;
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(SyncGoogleAccountBaseView.f55652U0, e11);
                    return;
                }
            }
            if (i11 == 1) {
                ToastUtils.m89262j();
            } else {
                ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            }
            syncGoogleAccountBaseView.mo57507xM();
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C11016c c11016c = new C11016c(this.f55663w, this.f55664x, this.f55665y, this.f55666z, this.f55659A, continuation);
            c11016c.f55662v = obj;
            return c11016c;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x007e  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Deferred m112538b;
            Deferred m112538b2;
            Deferred deferred;
            int i11;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f55661u;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        i11 = this.f55660t;
                        AbstractC24862s.m129228b(obj);
                        if (i11 + ((Number) obj).intValue() > 0) {
                            final SyncGoogleAccountBaseView syncGoogleAccountBaseView = this.f55665y;
                            final C28911c.c cVar = this.f55659A;
                            final String str = this.f55664x;
                            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.backuprestore.drive.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SyncGoogleAccountBaseView.C11016c.m57540t(SyncGoogleAccountBaseView.this, cVar, str);
                                }
                            });
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                deferred = (Deferred) this.f55662v;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f55662v;
                m112538b = BuildersKt__Builders_commonKt.m112538b(coroutineScope, null, null, new b(this.f55663w, this.f55664x, this.f55665y, null), 3, null);
                m112538b2 = BuildersKt__Builders_commonKt.m112538b(coroutineScope, null, null, new a(this.f55663w, this.f55665y, this.f55666z, null), 3, null);
                this.f55662v = m112538b2;
                this.f55661u = 1;
                Object mo112598E = m112538b.mo112598E(this);
                if (mo112598E == m142578e) {
                    return m142578e;
                }
                deferred = m112538b2;
                obj = mo112598E;
            }
            int intValue = ((Number) obj).intValue();
            this.f55662v = null;
            this.f55660t = intValue;
            this.f55661u = 2;
            Object mo112598E2 = deferred.mo112598E(this);
            if (mo112598E2 == m142578e) {
                return m142578e;
            }
            i11 = intValue;
            obj = mo112598E2;
            if (i11 + ((Number) obj).intValue() > 0) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11016c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.drive.SyncGoogleAccountBaseView$d */
    /* loaded from: classes5.dex */
    static final class C11017d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11017d f55675q = new C11017d();

        C11017d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C18880d mo12V4() {
            return new C18880d(C29574a.Companion.m146972c());
        }
    }

    public SyncGoogleAccountBaseView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(C11015b.f55658q);
        this.f55655R0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C11017d.f55675q);
        this.f55656S0 = m129210a2;
        this.f55657T0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public static final void m57526nM(SyncGoogleAccountBaseView syncGoogleAccountBaseView, AccountManagerFuture accountManagerFuture) {
        AbstractC19074t.m100208f(syncGoogleAccountBaseView, "this$0");
        AbstractC19074t.m100208f(accountManagerFuture, "future");
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (bundle.containsKey("authAccount")) {
                String string = bundle.getString("authAccount");
                if (!TextUtils.isEmpty(string)) {
                    AbstractC19074t.m100205c(string);
                    if (syncGoogleAccountBaseView.mo57533qM(string)) {
                        syncGoogleAccountBaseView.m57534rM(string);
                    }
                } else {
                    m57530wM(syncGoogleAccountBaseView, null, 1, null);
                }
            }
        } catch (AuthenticatorException e11) {
            ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            syncGoogleAccountBaseView.mo57507xM();
            AbstractC20110a.f98889a.mo104552e(e11);
        } catch (OperationCanceledException e12) {
            syncGoogleAccountBaseView.mo57507xM();
            AbstractC20110a.f98889a.mo104552e(e12);
        } catch (IOException e13) {
            if (C23055e5.m118272g(true)) {
                ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            }
            syncGoogleAccountBaseView.mo57507xM();
            AbstractC20110a.f98889a.mo104552e(e13);
        } catch (Exception e14) {
            ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            syncGoogleAccountBaseView.mo57507xM();
            AbstractC20110a.f98889a.mo104552e(e14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public final C25804a m57527oM() {
        return (C25804a) this.f55655R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public final C18880d m57528pM() {
        return (C18880d) this.f55656S0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public static final void m57529sM(SyncGoogleAccountBaseView syncGoogleAccountBaseView, String str) {
        String str2;
        int i11;
        AbstractC19074t.m100208f(syncGoogleAccountBaseView, "this$0");
        C25804a m57527oM = syncGoogleAccountBaseView.m57527oM();
        AbstractC19074t.m100207e(m57527oM, "<get-backupRestoreMediaRepo>(...)");
        boolean z11 = false;
        String m132980m = C25804a.m132980m(m57527oM, false, 1, null);
        int m132996n = syncGoogleAccountBaseView.m57527oM().m132996n();
        C28911c m120658e1 = AbstractC23306f.m120658e1();
        AbstractC19074t.m100207e(m120658e1, "provideRefreshGoogleAuthTokenUseCase(...)");
        C28911c.c cVar = (C28911c.c) m120658e1.m101509a(new C28911c.b(m132980m, m132996n, str, true));
        if (cVar == null || (str2 = cVar.m144424b()) == null) {
            str2 = "";
        }
        String str3 = str2;
        if (cVar != null) {
            i11 = cVar.m144425c();
        } else {
            i11 = 4;
        }
        if (str3.length() > 0 && i11 == 0) {
            z11 = true;
        }
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new C11016c(z11, str, syncGoogleAccountBaseView, str3, cVar, null), 3, null);
    }

    /* renamed from: wM */
    public static /* synthetic */ void m57530wM(SyncGoogleAccountBaseView syncGoogleAccountBaseView, Intent intent, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                intent = null;
            }
            syncGoogleAccountBaseView.m57537vM(intent);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setResultFail");
    }

    /* renamed from: zM */
    public static /* synthetic */ void m57531zM(SyncGoogleAccountBaseView syncGoogleAccountBaseView, String str, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            syncGoogleAccountBaseView.mo57508yM(str, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setResultSuccess");
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        boolean z11 = true;
        if (m92642L3 != null) {
            z11 = m92642L3.getBoolean("extra_need_fetch_metadata", true);
        }
        this.f55657T0 = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: mM */
    public final void m57532mM(String str) {
        Bundle bundle;
        if (!TextUtils.isEmpty(str)) {
            bundle = new Bundle();
            bundle.putString("authAccount", str);
        } else {
            bundle = null;
        }
        AccountManager.get(getContext()).addAccount("com.google", null, null, bundle, (Activity) this.f72421L0.m92648SI(), new AccountManagerCallback() { // from class: n40.i
            @Override // android.accounts.AccountManagerCallback
            public final void run(AccountManagerFuture accountManagerFuture) {
                SyncGoogleAccountBaseView.m57526nM(SyncGoogleAccountBaseView.this, accountManagerFuture);
            }
        }, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1003) {
            if (i12 == -1) {
                AbstractC19074t.m100205c(intent);
                String stringExtra = intent.getStringExtra("authAccount");
                if (!TextUtils.isEmpty(stringExtra)) {
                    AbstractC19074t.m100205c(stringExtra);
                    if (mo57533qM(stringExtra)) {
                        m57534rM(stringExtra);
                        return;
                    }
                    return;
                }
                m57530wM(this, null, 1, null);
                return;
            }
            mo57507xM();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: qM */
    public boolean mo57533qM(String str) {
        AbstractC19074t.m100208f(str, "email");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: rM */
    public final void m57534rM(final String str) {
        if (str != null && str.length() != 0) {
            if (!C23055e5.m118272g(true)) {
                mo57507xM();
                return;
            } else {
                mo46829Y();
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: n40.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        SyncGoogleAccountBaseView.m57529sM(SyncGoogleAccountBaseView.this, str);
                    }
                });
                return;
            }
        }
        ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
        mo57507xM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: tM */
    public final void m57535tM(int i11) {
        this.f55653P0 = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: uM */
    public final void m57536uM(int i11) {
        this.f55654Q0 = i11;
    }

    /* renamed from: vM */
    protected void m57537vM(Intent intent) {
        AbstractC20110a.f98889a.mo104548a("ManageGoogleAccountView setResultFail", new Object[0]);
        mo50035CK(0, intent);
        this.f88756W = 0;
        finish();
    }

    /* renamed from: xM */
    protected void mo57507xM() {
        m57530wM(this, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: yM */
    public void mo57508yM(String str, boolean z11) {
        AbstractC20110a.f98889a.mo104548a("ManageGoogleAccountView setResultSuccess", new Object[0]);
        Intent intent = new Intent();
        if (str != null) {
            intent.putExtra("extra_acc_local_auth", str);
        }
        intent.putExtra("return_setted_pass", z11);
        intent.putExtra("extra_from_pos", this.f55654Q0);
        mo50035CK(-1, intent);
        this.f88756W = 0;
        finish();
    }
}
