package com.zing.zalo.p077ui.zalocloud.migration;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.accounts.Account;
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
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.migration.ZCloudDriveLoginBS;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import dg0.AbstractC17927b;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import java.io.IOException;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.C23055e5;
import p320ld.C22441m;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p421pc.C24720a;
import p484ri.C25804a;
import p605wc.C28911c;
import p649xl.C29811g1;
import p649xl.C30005qf;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wg0.C28989l;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* loaded from: classes6.dex */
public final class ZCloudDriveLoginBS extends BottomSheet {

    /* renamed from: b1 */
    private C29811g1 f71847b1;

    /* renamed from: c1 */
    private C30005qf f71848c1;

    /* renamed from: d1 */
    private String f71849d1;

    /* renamed from: e1 */
    private int f71850e1 = -1;

    /* renamed from: f1 */
    private boolean f71851f1;

    /* renamed from: g1 */
    private final InterfaceC24854k f71852g1;

    /* renamed from: com.zing.zalo.ui.zalocloud.migration.ZCloudDriveLoginBS$a */
    /* loaded from: classes6.dex */
    static final class C13928a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13928a f71853q = new C13928a();

        C13928a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25804a mo12V4() {
            return AbstractC23306f.m120688m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.migration.ZCloudDriveLoginBS$b */
    /* loaded from: classes6.dex */
    public static final class C13929b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f71854t;

        /* renamed from: u */
        private /* synthetic */ Object f71855u;

        /* renamed from: v */
        final /* synthetic */ boolean f71856v;

        /* renamed from: w */
        final /* synthetic */ String f71857w;

        /* renamed from: x */
        final /* synthetic */ ZCloudDriveLoginBS f71858x;

        /* renamed from: y */
        final /* synthetic */ C28911c.c f71859y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zalocloud.migration.ZCloudDriveLoginBS$b$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f71860t;

            /* renamed from: u */
            final /* synthetic */ boolean f71861u;

            /* renamed from: v */
            final /* synthetic */ String f71862v;

            /* renamed from: w */
            final /* synthetic */ ZCloudDriveLoginBS f71863w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z11, String str, ZCloudDriveLoginBS zCloudDriveLoginBS, Continuation continuation) {
                super(2, continuation);
                this.f71861u = z11;
                this.f71862v = str;
                this.f71863w = zCloudDriveLoginBS;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f71861u, this.f71862v, this.f71863w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f71860t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (this.f71861u && this.f71862v.length() > 0) {
                        C25804a m77614TL = this.f71863w.m77614TL();
                        String str = this.f71862v;
                        m77614TL.m133006y();
                        m77614TL.m132982A(str, 1);
                        C25804a m77614TL2 = this.f71863w.m77614TL();
                        this.f71860t = 1;
                        obj = m77614TL2.m132999r(this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    }
                    return AbstractC29094b.m145341c(1);
                }
                long longValue = ((Number) obj).longValue();
                C25804a m77614TL3 = this.f71863w.m77614TL();
                C24720a.b bVar = C24720a.Companion;
                m77614TL3.m132990I(longValue, bVar.m128432a().m128422r(), bVar.m128432a().m128423s());
                return AbstractC29094b.m145341c(1);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13929b(boolean z11, String str, ZCloudDriveLoginBS zCloudDriveLoginBS, C28911c.c cVar, Continuation continuation) {
            super(2, continuation);
            this.f71856v = z11;
            this.f71857w = str;
            this.f71858x = zCloudDriveLoginBS;
            this.f71859y = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static final void m77631t(ZCloudDriveLoginBS zCloudDriveLoginBS, C28911c.c cVar, String str) {
            String str2;
            int i11;
            zCloudDriveLoginBS.m91393c4();
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
                zCloudDriveLoginBS.m77614TL().m132983B(str2);
                zCloudDriveLoginBS.m77614TL().m132984C(i11);
                ZCloudDriveLoginBS.m77626fM(zCloudDriveLoginBS, str, false, 2, null);
                ToastUtils.showMess(zCloudDriveLoginBS.f88762c0.m92652XI(AbstractC8020f0.str_toast_reconnect_gdrive_success));
                return;
            }
            if (i11 == 2) {
                try {
                    Context context = zCloudDriveLoginBS.getContext();
                    AbstractC19074t.m100206d(context, "null cannot be cast to non-null type android.app.Activity");
                    Activity activity = (Activity) context;
                    if (cVar != null) {
                        intent = cVar.m144423a();
                    }
                    activity.startActivityForResult(intent, ZAbstractBase.ZVU_BLEND_GEN_THUMB);
                    return;
                } catch (Exception e11) {
                    C26676b.m136954d("ZDSLoadingZaloView", e11);
                    return;
                }
            }
            if (i11 == 1) {
                ToastUtils.m89262j();
            } else {
                ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            }
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C13929b c13929b = new C13929b(this.f71856v, this.f71857w, this.f71858x, this.f71859y, continuation);
            c13929b.f71855u = obj;
            return c13929b;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Deferred m112538b;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f71854t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                m112538b = BuildersKt__Builders_commonKt.m112538b((CoroutineScope) this.f71855u, null, null, new a(this.f71856v, this.f71857w, this.f71858x, null), 3, null);
                this.f71854t = 1;
                obj = m112538b.mo112598E(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            if (((Number) obj).intValue() > 0) {
                final ZCloudDriveLoginBS zCloudDriveLoginBS = this.f71858x;
                final C28911c.c cVar = this.f71859y;
                final String str = this.f71857w;
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zalocloud.migration.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZCloudDriveLoginBS.C13929b.m77631t(ZCloudDriveLoginBS.this, cVar, str);
                    }
                });
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C13929b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public ZCloudDriveLoginBS() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C13928a.f71853q);
        this.f71852g1 = m129210a;
    }

    /* renamed from: QL */
    private final void m77611QL(String str) {
        Bundle bundle;
        if (!TextUtils.isEmpty(str)) {
            bundle = new Bundle();
            bundle.putString("authAccount", str);
        } else {
            bundle = null;
        }
        AccountManager.get(getContext()).addAccount("com.google", null, null, bundle, (Activity) this.f88762c0.m92648SI(), new AccountManagerCallback() { // from class: dc0.d
            @Override // android.accounts.AccountManagerCallback
            public final void run(AccountManagerFuture accountManagerFuture) {
                ZCloudDriveLoginBS.m77612RL(ZCloudDriveLoginBS.this, accountManagerFuture);
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RL */
    public static final void m77612RL(ZCloudDriveLoginBS zCloudDriveLoginBS, AccountManagerFuture accountManagerFuture) {
        AbstractC19074t.m100208f(zCloudDriveLoginBS, "this$0");
        AbstractC19074t.m100208f(accountManagerFuture, "future");
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (bundle.containsKey("authAccount")) {
                String string = bundle.getString("authAccount");
                if (!TextUtils.isEmpty(string)) {
                    zCloudDriveLoginBS.m77621aM(string);
                } else {
                    m77624dM(zCloudDriveLoginBS, null, 1, null);
                }
            }
        } catch (AuthenticatorException e11) {
            ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            C26676b.m136954d("ZDSLoadingZaloView", e11);
        } catch (OperationCanceledException e12) {
            C26676b.m136954d("ZDSLoadingZaloView", e12);
        } catch (IOException e13) {
            if (C23055e5.m118272g(true)) {
                ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            }
            C26676b.m136954d("ZDSLoadingZaloView", e13);
        } catch (Exception e14) {
            ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            C26676b.m136954d("ZDSLoadingZaloView", e14);
        }
    }

    /* renamed from: SL */
    private final void m77613SL() {
        ZaloView zaloView = this.f88762c0;
        AbstractC19074t.m100207e(zaloView, "mThis");
        String str = null;
        if (!C22441m.m115982a(zaloView)) {
            ZaloView zaloView2 = this.f88762c0;
            AbstractC19074t.m100207e(zaloView2, "mThis");
            C22441m.m115984c(zaloView2, 0, 2, null);
        } else {
            String str2 = this.f71849d1;
            if (str2 == null) {
                AbstractC19074t.m100223u("accountTargetAuth");
            } else {
                str = str2;
            }
            m77615UL(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TL */
    public final C25804a m77614TL() {
        return (C25804a) this.f71852g1.getValue();
    }

    /* renamed from: UL */
    private final void m77615UL(String str) {
        try {
            Account[] accountsByType = AccountManager.get(this.f88762c0.getContext()).getAccountsByType("com.google");
            AbstractC19074t.m100207e(accountsByType, "getAccountsByType(...)");
            for (Account account : accountsByType) {
                if (AbstractC19074t.m100204b(account.name, str)) {
                    m77621aM(str);
                    return;
                }
            }
            m77611QL(str);
        } catch (Exception e11) {
            C26676b.m136954d("ZDSLoadingZaloView", e11);
        }
    }

    /* renamed from: VL */
    private final void m77616VL() {
        C29811g1 c29811g1 = this.f71847b1;
        String str = null;
        if (c29811g1 == null) {
            AbstractC19074t.m100223u("binding");
            c29811g1 = null;
        }
        RobotoTextView robotoTextView = c29811g1.f137837u;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_migration_drive_bts_title);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        String format = String.format(m92652XI, Arrays.copyOf(new Object[]{C16805b.Companion.m89811a().m89800f()}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
        C30005qf c30005qf = this.f71848c1;
        if (c30005qf == null) {
            AbstractC19074t.m100223u("bindingBtnGroup");
            c30005qf = null;
        }
        c30005qf.f139159r.setOnClickListener(new View.OnClickListener() { // from class: dc0.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudDriveLoginBS.m77617WL(ZCloudDriveLoginBS.this, view);
            }
        });
        C30005qf c30005qf2 = this.f71848c1;
        if (c30005qf2 == null) {
            AbstractC19074t.m100223u("bindingBtnGroup");
            c30005qf2 = null;
        }
        c30005qf2.f139158q.setOnClickListener(new View.OnClickListener() { // from class: dc0.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudDriveLoginBS.m77619YL(ZCloudDriveLoginBS.this, view);
            }
        });
        if (this.f71849d1 != null) {
            C29811g1 c29811g12 = this.f71847b1;
            if (c29811g12 == null) {
                AbstractC19074t.m100223u("binding");
                c29811g12 = null;
            }
            RobotoTextView robotoTextView2 = c29811g12.f137835s;
            String str2 = this.f71849d1;
            if (str2 == null) {
                AbstractC19074t.m100223u("accountTargetAuth");
            } else {
                str = str2;
            }
            robotoTextView2.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WL */
    public static final void m77617WL(final ZCloudDriveLoginBS zCloudDriveLoginBS, View view) {
        AbstractC19074t.m100208f(zCloudDriveLoginBS, "this$0");
        AbstractC17927b.Companion.m94536b().mo94527a("THROTTLE_FIRST_CLICK_ACTION_SETUP_ACCOUNT_RESTORE_MEDIA", new Runnable() { // from class: dc0.g
            @Override // java.lang.Runnable
            public final void run() {
                ZCloudDriveLoginBS.m77618XL(ZCloudDriveLoginBS.this);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XL */
    public static final void m77618XL(ZCloudDriveLoginBS zCloudDriveLoginBS) {
        AbstractC19074t.m100208f(zCloudDriveLoginBS, "this$0");
        zCloudDriveLoginBS.m77613SL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YL */
    public static final void m77619YL(ZCloudDriveLoginBS zCloudDriveLoginBS, View view) {
        AbstractC19074t.m100208f(zCloudDriveLoginBS, "this$0");
        zCloudDriveLoginBS.close();
        AbstractC0924m0.m3121Hq(true);
        if (!zCloudDriveLoginBS.f71851f1) {
            C28989l.m144729K(C28989l.Companion.m144769a(), zCloudDriveLoginBS.f71850e1, false, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZL */
    public static final void m77620ZL(ZCloudDriveLoginBS zCloudDriveLoginBS) {
        AbstractC19074t.m100208f(zCloudDriveLoginBS, "$this_run");
        m77624dM(zCloudDriveLoginBS, null, 1, null);
    }

    /* renamed from: aM */
    private final void m77621aM(final String str) {
        if (str != null && str.length() != 0) {
            String str2 = this.f71849d1;
            if (str2 == null) {
                AbstractC19074t.m100223u("accountTargetAuth");
                str2 = null;
            }
            if (!AbstractC19074t.m100204b(str, str2)) {
                AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_account_ggdrive_zcloud_migrate_diff_account_backup);
                return;
            } else {
                if (!C23055e5.m118272g(true)) {
                    return;
                }
                m91392Y();
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: dc0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZCloudDriveLoginBS.m77622bM(ZCloudDriveLoginBS.this, str);
                    }
                });
                return;
            }
        }
        ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bM */
    public static final void m77622bM(ZCloudDriveLoginBS zCloudDriveLoginBS, String str) {
        String str2;
        int i11;
        AbstractC19074t.m100208f(zCloudDriveLoginBS, "this$0");
        C25804a m77614TL = zCloudDriveLoginBS.m77614TL();
        AbstractC19074t.m100207e(m77614TL, "<get-backupRestoreMediaRepo>(...)");
        boolean z11 = false;
        String m132980m = C25804a.m132980m(m77614TL, false, 1, null);
        int m132996n = zCloudDriveLoginBS.m77614TL().m132996n();
        C28911c m120658e1 = AbstractC23306f.m120658e1();
        AbstractC19074t.m100207e(m120658e1, "provideRefreshGoogleAuthTokenUseCase(...)");
        C28911c.c cVar = (C28911c.c) m120658e1.m101509a(new C28911c.b(m132980m, m132996n, str, true));
        if (cVar == null || (str2 = cVar.m144424b()) == null) {
            str2 = "";
        }
        if (cVar != null) {
            i11 = cVar.m144425c();
        } else {
            i11 = 4;
        }
        if (str2.length() > 0 && i11 == 0) {
            z11 = true;
        }
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new C13929b(z11, str, zCloudDriveLoginBS, cVar, null), 3, null);
    }

    /* renamed from: cM */
    private final void m77623cM(Intent intent) {
        mo50035CK(0, intent);
        this.f88756W = 0;
        close();
    }

    /* renamed from: dM */
    static /* synthetic */ void m77624dM(ZCloudDriveLoginBS zCloudDriveLoginBS, Intent intent, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            intent = null;
        }
        zCloudDriveLoginBS.m77623cM(intent);
    }

    /* renamed from: eM */
    private final void m77625eM(String str, boolean z11) {
        Intent intent = new Intent();
        if (str != null) {
            intent.putExtra("extra_acc_local_auth", str);
        }
        intent.putExtra("return_setted_pass", z11);
        intent.putExtra("extra_from_pos", 0);
        mo50035CK(-1, intent);
        this.f88756W = 0;
        C28989l.m144729K(C28989l.Companion.m144769a(), this.f71850e1, false, false, 6, null);
        close();
    }

    /* renamed from: fM */
    static /* synthetic */ void m77626fM(ZCloudDriveLoginBS zCloudDriveLoginBS, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        zCloudDriveLoginBS.m77625eM(str, z11);
    }

    /* renamed from: gM */
    private final void m77627gM() {
        C22447s.f109797a.m116070G0(m92676n2(), new InterfaceC17463d.d() { // from class: dc0.c
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ZCloudDriveLoginBS.m77628hM(interfaceC17463d, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public static final void m77628hM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                C26676b.m136954d("ZDSLoadingZaloView", e11);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        C24848g0 c24848g0;
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                TargetBackupInfo targetBackupInfo = (TargetBackupInfo) m92642L3.getParcelable("extra_target_backup_info");
                if (targetBackupInfo != null) {
                    String m40959o = targetBackupInfo.m40959o();
                    if (m40959o.length() == 0) {
                        m40959o = "";
                    }
                    this.f71849d1 = m40959o;
                    c24848g0 = C24848g0.f119245a;
                } else {
                    c24848g0 = null;
                }
                if (c24848g0 == null) {
                    AbstractC19444a.m101695c(new Runnable() { // from class: dc0.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            ZCloudDriveLoginBS.m77620ZL(ZCloudDriveLoginBS.this);
                        }
                    });
                } else {
                    this.f71850e1 = m92642L3.getInt("JobId", -1);
                    this.f71851f1 = m92642L3.getBoolean("KEY_FROM_CLOUD_MEDIA_HOME", false);
                }
            }
        } catch (Exception e11) {
            C26676b.m136954d("ZDSLoadingZaloView", e11);
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29811g1 m147973c = C29811g1.m147973c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m147973c, "inflate(...)");
        this.f71847b1 = m147973c;
        C30005qf m148421c = C30005qf.m148421c(layoutInflater, linearLayout, false);
        AbstractC19074t.m100207e(m148421c, "inflate(...)");
        this.f71848c1 = m148421c;
        m90533zL(EnumC17017m.DETENTS);
        m90524sL(0.8f);
        C30005qf c30005qf = this.f71848c1;
        if (c30005qf == null) {
            AbstractC19074t.m100223u("bindingBtnGroup");
            c30005qf = null;
        }
        LinearLayout root = c30005qf.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        C24848g0 c24848g0 = C24848g0.f119245a;
        m90526uL(root, layoutParams);
        m77616VL();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        if (i11 == 150) {
            ZaloView zaloView = this.f88762c0;
            AbstractC19074t.m100207e(zaloView, "mThis");
            if (C22441m.m115982a(zaloView)) {
                String str = this.f71849d1;
                if (str == null) {
                    AbstractC19074t.m100223u("accountTargetAuth");
                    str = null;
                }
                m77615UL(str);
                return;
            }
            Context m92648SI = this.f88762c0.m92648SI();
            AbstractC19074t.m100206d(m92648SI, "null cannot be cast to non-null type android.app.Activity");
            if (!AbstractC23034c6.m118111A0((Activity) m92648SI, "android.permission.READ_CONTACTS") && !AbstractC23034c6.m118132R("android.permission.READ_CONTACTS")) {
                m77627gM();
            }
        }
    }
}
