package com.zing.zalo.p077ui.backuprestore.drive;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.AbstractC2144f;
import c50.C3297h;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.data.backuprestore.model.media.BackupCloudInfo;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.backuprestore.drive.ManageGoogleAccountView;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.drive.ChooseDriveAccountBottomSheet;
import com.zing.zalo.p077ui.widget.RecyclerViewWithMaxHeight;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import dg0.AbstractC17927b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import p320ld.C22438j;
import p320ld.C22441m;
import p320ld.C22447s;
import p421pc.C24720a;
import p443qc.AbstractC25219c;
import p484ri.C25804a;
import p649xl.C30114x4;
import pm0.C24848g0;
import qm0.AbstractC25370t;
import x60.AbstractC29394g;
import zc0.C31784b;
import zl0.AbstractC32226c;

/* loaded from: classes5.dex */
public final class ManageGoogleAccountView extends SyncGoogleAccountBaseView implements ZaloView.InterfaceC17421f {
    public static final C11008a Companion = new C11008a(null);

    /* renamed from: W0 */
    private C30114x4 f55622W0;

    /* renamed from: X0 */
    private FrameLayout f55623X0;

    /* renamed from: Y0 */
    private KeyEventCallbackC17462c f55624Y0;

    /* renamed from: Z0 */
    private String f55625Z0;

    /* renamed from: a1 */
    private C11011d f55626a1;

    /* renamed from: c1 */
    private BackupCloudInfo f55628c1;

    /* renamed from: d1 */
    private int f55629d1;

    /* renamed from: e1 */
    private String f55630e1;

    /* renamed from: f1 */
    private String f55631f1;

    /* renamed from: g1 */
    private boolean f55632g1;

    /* renamed from: i1 */
    private String f55634i1;

    /* renamed from: j1 */
    private String f55635j1;

    /* renamed from: k1 */
    private String f55636k1;

    /* renamed from: m1 */
    private boolean f55638m1;

    /* renamed from: V0 */
    private final String f55621V0 = "SMLManageGoogleAccountView";

    /* renamed from: b1 */
    private final ArrayList f55627b1 = new ArrayList();

    /* renamed from: h1 */
    private int f55633h1 = 1;

    /* renamed from: l1 */
    private int f55637l1 = 1;

    /* renamed from: com.zing.zalo.ui.backuprestore.drive.ManageGoogleAccountView$a */
    /* loaded from: classes5.dex */
    public static final class C11008a {
        private C11008a() {
        }

        public /* synthetic */ C11008a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.backuprestore.drive.ManageGoogleAccountView$b */
    /* loaded from: classes5.dex */
    public static final class C11009b {

        /* renamed from: a */
        private String f55639a;

        /* renamed from: b */
        private boolean f55640b;

        public C11009b(String str, boolean z11) {
            AbstractC19074t.m100208f(str, "account");
            this.f55639a = str;
            this.f55640b = z11;
        }

        /* renamed from: a */
        public final String m57509a() {
            return this.f55639a;
        }

        /* renamed from: b */
        public final boolean m57510b() {
            return this.f55640b;
        }

        /* renamed from: c */
        public final void m57511c(boolean z11) {
            this.f55640b = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11009b)) {
                return false;
            }
            C11009b c11009b = (C11009b) obj;
            return AbstractC19074t.m100204b(this.f55639a, c11009b.f55639a) && this.f55640b == c11009b.f55640b;
        }

        public int hashCode() {
            return (this.f55639a.hashCode() * 31) + AbstractC2144f.m11520a(this.f55640b);
        }

        public String toString() {
            return "GoogleAccountItem(account=" + this.f55639a + ", isSelected=" + this.f55640b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.backuprestore.drive.ManageGoogleAccountView$c */
    /* loaded from: classes5.dex */
    public static final class C11010c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private RobotoTextView f55641I;

        /* renamed from: J */
        private RobotoTextView f55642J;

        /* renamed from: K */
        private ImageView f55643K;

        /* renamed from: L */
        private View f55644L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11010c(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            View findViewById = view.findViewById(AbstractC6918a0.tv_account);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            this.f55641I = (RobotoTextView) findViewById;
            View findViewById2 = view.findViewById(AbstractC6918a0.tv_backup_info_account);
            AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
            this.f55642J = (RobotoTextView) findViewById2;
            View findViewById3 = view.findViewById(AbstractC6918a0.ic_choose_or_not);
            AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
            this.f55643K = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(AbstractC6918a0.bottom_line);
            AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
            this.f55644L = findViewById4;
        }

        /* renamed from: i0 */
        public final View m57512i0() {
            return this.f55644L;
        }

        /* renamed from: j0 */
        public final ImageView m57513j0() {
            return this.f55643K;
        }

        /* renamed from: k0 */
        public final RobotoTextView m57514k0() {
            return this.f55641I;
        }

        /* renamed from: l0 */
        public final RobotoTextView m57515l0() {
            return this.f55642J;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.backuprestore.drive.ManageGoogleAccountView$d */
    /* loaded from: classes5.dex */
    public static final class C11011d extends RecyclerView.AbstractC1880g {

        /* renamed from: r */
        private final BackupCloudInfo f55645r;

        /* renamed from: s */
        private final LayoutInflater f55646s;

        /* renamed from: t */
        private final ArrayList f55647t;

        /* renamed from: u */
        private final boolean f55648u;

        public C11011d(Context context, BackupCloudInfo backupCloudInfo) {
            boolean z11;
            AbstractC19074t.m100208f(context, "context");
            this.f55645r = backupCloudInfo;
            Object systemService = context.getSystemService("layout_inflater");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            this.f55646s = (LayoutInflater) systemService;
            this.f55647t = new ArrayList();
            if (backupCloudInfo != null) {
                z11 = backupCloudInfo.isValid();
            } else {
                z11 = false;
            }
            this.f55648u = z11;
        }

        /* renamed from: L */
        public final C11009b m57516L(int i11) {
            if (i11 >= 0 && i11 < mo10003k()) {
                return (C11009b) this.f55647t.get(i11);
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public void mo9990A(C11010c c11010c, int i11) {
            String str;
            CharSequence m127168X0;
            AbstractC19074t.m100208f(c11010c, "viewHolder");
            C11009b m57516L = m57516L(i11);
            if (m57516L != null) {
                try {
                    c11010c.m57514k0().setText(m57516L.m57509a());
                    int i12 = 0;
                    if (this.f55648u && this.f55645r != null && AbstractC19074t.m100204b(m57516L.m57509a(), this.f55645r.m40982a())) {
                        c11010c.m57515l0().setVisibility(0);
                        RobotoTextView m57515l0 = c11010c.m57515l0();
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_backup_info_account_ggdrive);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        Object[] objArr = new Object[2];
                        objArr[0] = C22447s.m116058t(this.f55645r.m40984c());
                        String m40983b = this.f55645r.m40983b();
                        if (m40983b != null) {
                            m127168X0 = AbstractC24342w.m127168X0(m40983b);
                            str = m127168X0.toString();
                        } else {
                            str = null;
                        }
                        objArr[1] = str;
                        String format = String.format(m118743r0, Arrays.copyOf(objArr, 2));
                        AbstractC19074t.m100207e(format, "format(...)");
                        m57515l0.setText(format);
                        c11010c.m57515l0().setFontStyle(6);
                    } else {
                        c11010c.m57515l0().setVisibility(8);
                    }
                    if (m57516L.m57510b()) {
                        c11010c.m57513j0().setImageResource(AbstractC16803z.ic_chosen_acc_ggdrive);
                    } else {
                        c11010c.m57513j0().setImageResource(AbstractC16803z.ic_not_chosen_acc_ggdrive);
                    }
                    View m57512i0 = c11010c.m57512i0();
                    if (i11 == mo10003k() - 1) {
                        i12 = 4;
                    }
                    m57512i0.setVisibility(i12);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public C11010c mo9992C(ViewGroup viewGroup, int i11) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            View inflate = this.f55646s.inflate(AbstractC7409c0.item_google_account_view, viewGroup, false);
            AbstractC19074t.m100205c(inflate);
            return new C11010c(inflate);
        }

        /* renamed from: O */
        public final void m57519O(ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "items");
            ArrayList arrayList2 = this.f55647t;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: k */
        public int mo10003k() {
            return this.f55647t.size();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.drive.ManageGoogleAccountView$e */
    /* loaded from: classes5.dex */
    public static final class C11012e extends ActionBar.C17431a {
        C11012e() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBar.C17431a
        /* renamed from: b */
        public void mo46831b(int i11) {
            super.mo46831b(i11);
            ManageGoogleAccountView.this.mo37491QJ(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.drive.ManageGoogleAccountView$f */
    /* loaded from: classes5.dex */
    public static final class C11013f implements AbstractC29394g.a {

        /* renamed from: a */
        final /* synthetic */ String[] f55650a;

        /* renamed from: b */
        final /* synthetic */ ManageGoogleAccountView f55651b;

        C11013f(String[] strArr, ManageGoogleAccountView manageGoogleAccountView) {
            this.f55650a = strArr;
            this.f55651b = manageGoogleAccountView;
        }

        @Override // x60.AbstractC29394g.a
        /* renamed from: a */
        public void mo57176a() {
            SyncGoogleAccountBaseView.m57530wM(this.f55651b, null, 1, null);
        }

        @Override // x60.AbstractC29394g.a
        /* renamed from: b */
        public void mo57177b(int i11) {
            String[] strArr = this.f55650a;
            if (i11 < strArr.length - 1) {
                this.f55651b.m57534rM(strArr[i11]);
            } else {
                this.f55651b.m57532mM(null);
            }
        }
    }

    /* renamed from: IM */
    private final void m57485IM() {
        C30114x4 c30114x4 = this.f55622W0;
        AbstractC19074t.m100205c(c30114x4);
        c30114x4.f139898w.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_choose_account_ggdrive_empty));
        c30114x4.f139897v.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_choose_account_ggdrive_empty));
        c30114x4.f139892q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_continue_choose_account_ggdrive_empty));
        c30114x4.f139896u.setVisibility(8);
    }

    /* renamed from: JM */
    private final void m57486JM() {
        C30114x4 c30114x4 = this.f55622W0;
        AbstractC19074t.m100205c(c30114x4);
        if (C22447s.m116021W(this.f55633h1)) {
            c30114x4.f139898w.setText("Chọn tài khoản Google Drive để khôi phục ảnh");
        } else {
            c30114x4.f139898w.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_choose_account_ggdrive));
            c30114x4.f139897v.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_choose_account_ggdrive));
        }
        c30114x4.f139892q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_continue_choose_account_ggdrive));
        c30114x4.f139896u.setVisibility(0);
    }

    /* renamed from: KM */
    private final boolean m57487KM(String str) {
        Account[] accountsByType = AccountManager.get(this.f72421L0.getContext()).getAccountsByType("com.google");
        AbstractC19074t.m100207e(accountsByType, "getAccountsByType(...)");
        for (Account account : accountsByType) {
            if (AbstractC19074t.m100204b(account.name, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: LM */
    private final void m57488LM() {
        try {
            if (this.f55637l1 == 1) {
                if (!this.f55627b1.isEmpty()) {
                    int size = this.f55627b1.size();
                    int i11 = this.f55629d1;
                    if (i11 >= 0 && i11 < size) {
                        String m57509a = ((C11009b) this.f55627b1.get(i11)).m57509a();
                        if (AbstractC19074t.m100204b(m57509a, AbstractC23136l9.m118743r0(AbstractC8020f0.sync_choose_account_option_add))) {
                            m57532mM(null);
                            return;
                        } else {
                            m57534rM(m57509a);
                            return;
                        }
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
                    SyncGoogleAccountBaseView.m57530wM(this, null, 1, null);
                    return;
                }
                m57532mM(null);
                return;
            }
            m57532mM(null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: MM */
    private final void m57489MM() {
        if (this.f55622W0 == null && this.f55623X0 != null) {
            this.f55622W0 = C30114x4.m148682c(LayoutInflater.from(getContext()), this.f55623X0, true);
            m57492PM();
        }
    }

    /* renamed from: NM */
    private final boolean m57490NM(ArrayList arrayList, String str) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (AbstractC19074t.m100204b(((C11009b) arrayList.get(i11)).m57509a(), str)) {
                ((C11009b) arrayList.get(this.f55629d1)).m57511c(false);
                this.f55629d1 = i11;
                ((C11009b) arrayList.get(i11)).m57511c(true);
                return true;
            }
        }
        return false;
    }

    /* renamed from: OM */
    private final void m57491OM(String str) {
        if (m57487KM(str)) {
            m57534rM(str);
        } else {
            m57532mM(str);
        }
    }

    /* renamed from: PM */
    private final void m57492PM() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C30114x4 c30114x4 = this.f55622W0;
        AbstractC19074t.m100205c(c30114x4);
        LinearLayout root = c30114x4.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        m57506WM(root);
        C30114x4 c30114x42 = this.f55622W0;
        AbstractC19074t.m100205c(c30114x42);
        c30114x42.f139892q.setOnClickListener(new View.OnClickListener() { // from class: n40.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageGoogleAccountView.m57493QM(ManageGoogleAccountView.this, view);
            }
        });
        C30114x4 c30114x43 = this.f55622W0;
        AbstractC19074t.m100205c(c30114x43);
        c30114x43.f139893r.setOnClickListener(new View.OnClickListener() { // from class: n40.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageGoogleAccountView.m57495SM(ManageGoogleAccountView.this, view);
            }
        });
        C30114x4 c30114x44 = this.f55622W0;
        AbstractC19074t.m100205c(c30114x44);
        ViewGroup.LayoutParams layoutParams = c30114x44.f139895t.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            if (AbstractC32226c.m155415n(this.f72421L0.m92676n2())) {
                marginLayoutParams.topMargin = (AbstractC23136l9.m118655I(AbstractC16802y.backup_restore_margin_top_big) - AbstractC23136l9.m118655I(AbstractC17454d.action_bar_default_height)) - AbstractC32226c.m155411j(this.f72421L0.m92676n2()).top;
            } else {
                marginLayoutParams.topMargin = AbstractC23136l9.m118655I(AbstractC16802y.backup_restore_margin_top_big) - AbstractC23136l9.m118655I(AbstractC17454d.action_bar_default_height);
            }
        }
        if (this.f55637l1 == 1) {
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            this.f55626a1 = new C11011d(m92689tK, this.f55628c1);
            C30114x4 c30114x45 = this.f55622W0;
            AbstractC19074t.m100205c(c30114x45);
            RecyclerViewWithMaxHeight recyclerViewWithMaxHeight = c30114x45.f139896u;
            recyclerViewWithMaxHeight.setLayoutManager(new LinearLayoutManager(recyclerViewWithMaxHeight.getContext()));
            recyclerViewWithMaxHeight.setAdapter(this.f55626a1);
            C30114x4 c30114x46 = this.f55622W0;
            AbstractC19074t.m100205c(c30114x46);
            C31784b.m152808a(c30114x46.f139896u).m152809b(new C31784b.d() { // from class: n40.d
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                    ManageGoogleAccountView.m57497UM(ManageGoogleAccountView.this, recyclerView, i11, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public static final void m57493QM(final ManageGoogleAccountView manageGoogleAccountView, View view) {
        AbstractC19074t.m100208f(manageGoogleAccountView, "this$0");
        AbstractC17927b.Companion.m94536b().mo94527a("THROTTLE_FIRST_CLICK_ACTION_MANAGE_ACCOUNT_GOOGLE", new Runnable() { // from class: n40.g
            @Override // java.lang.Runnable
            public final void run() {
                ManageGoogleAccountView.m57494RM(ManageGoogleAccountView.this);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public static final void m57494RM(ManageGoogleAccountView manageGoogleAccountView) {
        AbstractC19074t.m100208f(manageGoogleAccountView, "this$0");
        manageGoogleAccountView.m57488LM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public static final void m57495SM(final ManageGoogleAccountView manageGoogleAccountView, View view) {
        AbstractC19074t.m100208f(manageGoogleAccountView, "this$0");
        AbstractC17927b.Companion.m94536b().mo94527a("THROTTLE_FIRST_CLICK_ACTION_MANAGE_ACCOUNT_GOOGLE", new Runnable() { // from class: n40.e
            @Override // java.lang.Runnable
            public final void run() {
                ManageGoogleAccountView.m57496TM(ManageGoogleAccountView.this);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public static final void m57496TM(ManageGoogleAccountView manageGoogleAccountView) {
        AbstractC19074t.m100208f(manageGoogleAccountView, "this$0");
        if (manageGoogleAccountView.f55637l1 == 1) {
            manageGoogleAccountView.m57502aN();
        } else {
            SyncGoogleAccountBaseView.m57530wM(manageGoogleAccountView, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public static final void m57497UM(ManageGoogleAccountView manageGoogleAccountView, RecyclerView recyclerView, int i11, View view) {
        String str;
        AbstractC19074t.m100208f(manageGoogleAccountView, "this$0");
        try {
            if (i11 != manageGoogleAccountView.f55629d1) {
                C11011d c11011d = manageGoogleAccountView.f55626a1;
                AbstractC19074t.m100205c(c11011d);
                C11009b m57516L = c11011d.m57516L(manageGoogleAccountView.f55629d1);
                if (m57516L != null) {
                    m57516L.m57511c(false);
                }
                manageGoogleAccountView.f55629d1 = i11;
                C11011d c11011d2 = manageGoogleAccountView.f55626a1;
                AbstractC19074t.m100205c(c11011d2);
                C11009b m57516L2 = c11011d2.m57516L(manageGoogleAccountView.f55629d1);
                if (m57516L2 != null) {
                    m57516L2.m57511c(true);
                }
                C11011d c11011d3 = manageGoogleAccountView.f55626a1;
                AbstractC19074t.m100205c(c11011d3);
                c11011d3.m10008p();
                C11011d c11011d4 = manageGoogleAccountView.f55626a1;
                AbstractC19074t.m100205c(c11011d4);
                C11009b m57516L3 = c11011d4.m57516L(manageGoogleAccountView.f55629d1);
                if (m57516L3 != null) {
                    str = m57516L3.m57509a();
                } else {
                    str = null;
                }
                manageGoogleAccountView.f55630e1 = str;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0104 A[ADDED_TO_REGION] */
    /* renamed from: VM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m57498VM(String str) {
        boolean z11;
        int i11;
        AbstractC20110a.f98889a.mo104548a("invalidateDataListGoogleAccount, selectedAccountParam=" + str + ", mode=" + this.f55637l1, new Object[0]);
        this.f55627b1.clear();
        try {
            Account[] accountsByType = AccountManager.get(this.f72421L0.getContext()).getAccountsByType("com.google");
            AbstractC19074t.m100207e(accountsByType, "getAccountsByType(...)");
            this.f55629d1 = 0;
            int length = accountsByType.length;
            boolean z12 = false;
            boolean z13 = false;
            for (int i12 = 0; i12 < length; i12++) {
                String str2 = accountsByType[i12].name;
                boolean m100204b = AbstractC19074t.m100204b(str2, str);
                if (m100204b) {
                    this.f55629d1 = i12;
                    if (i12 != 0) {
                        this.f55629d1 = 0;
                        z12 = true;
                    }
                    z13 = true;
                }
                if (z12) {
                    ArrayList arrayList = this.f55627b1;
                    AbstractC19074t.m100205c(str2);
                    arrayList.add(0, new C11009b(str2, m100204b));
                    z12 = false;
                } else {
                    ArrayList arrayList2 = this.f55627b1;
                    AbstractC19074t.m100205c(str2);
                    arrayList2.add(new C11009b(str2, m100204b));
                }
            }
            int i13 = this.f55637l1;
            if (i13 == 2) {
                if (!this.f55627b1.isEmpty()) {
                    C30114x4 c30114x4 = this.f55622W0;
                    if (c30114x4 != null) {
                        c30114x4.getRoot().setVisibility(8);
                    }
                    ArrayList arrayList3 = this.f55627b1;
                    if (z13) {
                        i11 = this.f55629d1;
                    } else {
                        i11 = -1;
                    }
                    m57500YM(arrayList3, i11);
                    return;
                }
                m57489MM();
                m57485IM();
                return;
            }
            if (i13 == 4) {
                if (!this.f55627b1.isEmpty()) {
                    m57499XM(this.f55627b1);
                    return;
                } else {
                    m57532mM(null);
                    return;
                }
            }
            if (!this.f55627b1.isEmpty()) {
                String str3 = this.f55634i1;
                if (str3 != null && str3.length() != 0) {
                    ArrayList arrayList4 = this.f55627b1;
                    String str4 = this.f55634i1;
                    AbstractC19074t.m100205c(str4);
                    z11 = m57490NM(arrayList4, str4);
                    this.f55634i1 = "";
                    if (!z13 && !z11) {
                        this.f55629d1 = 0;
                        ((C11009b) this.f55627b1.get(0)).m57511c(true);
                    }
                    this.f55630e1 = ((C11009b) this.f55627b1.get(this.f55629d1)).m57509a();
                    m57486JM();
                    ArrayList arrayList5 = this.f55627b1;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.sync_choose_account_option_add);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    arrayList5.add(new C11009b(m118743r0, false));
                    C11011d c11011d = this.f55626a1;
                    AbstractC19074t.m100205c(c11011d);
                    c11011d.m57519O(this.f55627b1);
                    C11011d c11011d2 = this.f55626a1;
                    AbstractC19074t.m100205c(c11011d2);
                    c11011d2.m10008p();
                    return;
                }
                String str5 = this.f55630e1;
                if (str5 != null && str5.length() != 0) {
                    ArrayList arrayList6 = this.f55627b1;
                    String str6 = this.f55630e1;
                    AbstractC19074t.m100205c(str6);
                    z11 = m57490NM(arrayList6, str6);
                    if (!z13) {
                        this.f55629d1 = 0;
                        ((C11009b) this.f55627b1.get(0)).m57511c(true);
                    }
                    this.f55630e1 = ((C11009b) this.f55627b1.get(this.f55629d1)).m57509a();
                    m57486JM();
                    ArrayList arrayList52 = this.f55627b1;
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.sync_choose_account_option_add);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    arrayList52.add(new C11009b(m118743r02, false));
                    C11011d c11011d3 = this.f55626a1;
                    AbstractC19074t.m100205c(c11011d3);
                    c11011d3.m57519O(this.f55627b1);
                    C11011d c11011d22 = this.f55626a1;
                    AbstractC19074t.m100205c(c11011d22);
                    c11011d22.m10008p();
                    return;
                }
                z11 = false;
                if (!z13) {
                }
                this.f55630e1 = ((C11009b) this.f55627b1.get(this.f55629d1)).m57509a();
                m57486JM();
                ArrayList arrayList522 = this.f55627b1;
                String m118743r022 = AbstractC23136l9.m118743r0(AbstractC8020f0.sync_choose_account_option_add);
                AbstractC19074t.m100207e(m118743r022, "getString(...)");
                arrayList522.add(new C11009b(m118743r022, false));
                C11011d c11011d32 = this.f55626a1;
                AbstractC19074t.m100205c(c11011d32);
                c11011d32.m57519O(this.f55627b1);
                C11011d c11011d222 = this.f55626a1;
                AbstractC19074t.m100205c(c11011d222);
                c11011d222.m10008p();
                return;
            }
            m57485IM();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: XM */
    private final void m57499XM(List list) {
        int m131511r;
        try {
            C17487o0 m92693xK = m92693xK();
            Bundle bundle = new Bundle();
            List list2 = list;
            m131511r = AbstractC25370t.m131511r(list2, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C11009b) it.next()).m57509a());
            }
            bundle.putStringArrayList("PARAM_LIST_ACCOUNT", new ArrayList<>(arrayList));
            C24848g0 c24848g0 = C24848g0.f119245a;
            m92693xK.mo89694j2(ChooseDriveAccountBottomSheet.class, bundle, 1000, "SMLChooseDriveAccountBottomSheet", 1, true);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: YM */
    private final void m57500YM(ArrayList arrayList, int i11) {
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f55624Y0;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            AbstractC20110a.f98889a.mo104548a("chooseGoogleAccountDialog is already shown", new Object[0]);
            return;
        }
        int size = arrayList.size();
        String[] strArr = new String[size + 1];
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            strArr[i12] = ((C11009b) arrayList.get(i12)).m57509a();
        }
        strArr[size] = this.f72421L0.m92652XI(AbstractC8020f0.sync_choose_account_option_add);
        KeyEventCallbackC17462c m146568m = AbstractC29394g.m146568m(this.f72421L0.getContext(), strArr, i11, this.f72421L0.m92652XI(AbstractC8020f0.sync_choose_account_title), new C11013f(strArr, this));
        this.f55624Y0 = m146568m;
        if (m146568m != null) {
            m146568m.m92854E(new InterfaceC17463d.c() { // from class: n40.f
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    ManageGoogleAccountView.m57501ZM(ManageGoogleAccountView.this, interfaceC17463d);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public static final void m57501ZM(ManageGoogleAccountView manageGoogleAccountView, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(manageGoogleAccountView, "this$0");
        SyncGoogleAccountBaseView.m57530wM(manageGoogleAccountView, null, 1, null);
    }

    /* renamed from: aN */
    private final void m57502aN() {
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(7).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_choose_account_setup_backup_ignore_backup_media_title)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_choose_account_setup_backup_ignore_backup_media_desc)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_back), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sync_btn_skip), new InterfaceC17463d.d() { // from class: n40.h
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ManageGoogleAccountView.m57503bN(ManageGoogleAccountView.this, interfaceC17463d, i11);
            }
        });
        C8009j m43152a = aVar.m43152a();
        AbstractC19074t.m100207e(m43152a, "create(...)");
        m43152a.mo13822K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public static final void m57503bN(ManageGoogleAccountView manageGoogleAccountView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(manageGoogleAccountView, "this$0");
        if (manageGoogleAccountView.f55632g1) {
            manageGoogleAccountView.f55631f1 = null;
            C17487o0 m92693xK = manageGoogleAccountView.f72421L0.m92693xK();
            AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
            C22438j.m115931E(m92693xK, manageGoogleAccountView.f55633h1, false);
        } else {
            super.mo57508yM(null, false);
        }
        C25804a m133009a = C25804a.Companion.m133009a();
        m133009a.m133006y();
        long m130483a = AbstractC25219c.d.f120979b.m130483a();
        C24720a.b bVar = C24720a.Companion;
        m133009a.m132990I(m130483a, bVar.m128432a().m128422r(), bVar.m128432a().m128423s());
        m133009a.m132982A("", -1);
    }

    /* renamed from: cN */
    private final void m57504cN() {
        C22447s.f109797a.m116069D0(m92676n2(), new InterfaceC17463d.b(), new InterfaceC17463d.e() { // from class: n40.a
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
            /* renamed from: Tv */
            public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                ManageGoogleAccountView.m57505dN(ManageGoogleAccountView.this, interfaceC17463d);
            }
        }, this.f55638m1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dN */
    public static final void m57505dN(ManageGoogleAccountView manageGoogleAccountView, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(manageGoogleAccountView, "this$0");
        SyncGoogleAccountBaseView.m57530wM(manageGoogleAccountView, null, 1, null);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.drive.SyncGoogleAccountBaseView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        String str2;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            BackupCloudInfo backupCloudInfo = (BackupCloudInfo) m92642L3.getParcelable("extra_cloud_info");
            this.f55628c1 = backupCloudInfo;
            if (backupCloudInfo == null || (str = backupCloudInfo.m40982a()) == null) {
                str = "";
            }
            this.f55625Z0 = str;
            this.f55632g1 = m92642L3.getBoolean("extra_go_to_force_set_pass", false);
            this.f55633h1 = m92642L3.getInt("extra_entry_point", this.f55633h1);
            this.f55635j1 = m92642L3.getString("extra_acc_local_auth", "");
            int i11 = m92642L3.getInt("EXTRA_MODE", 1);
            this.f55637l1 = i11;
            if (i11 != 2 && i11 != 3 && i11 != 4) {
                str2 = this.f55625Z0;
            } else {
                str2 = this.f55635j1;
            }
            this.f55636k1 = str2;
            if (i11 == 3 && (str2 == null || str2.length() == 0)) {
                SyncGoogleAccountBaseView.m57530wM(this, null, 1, null);
                return;
            }
            m57535tM(m92642L3.getInt("extra_from_ep"));
            m57536uM(m92642L3.getInt("extra_from_pos"));
            this.f55638m1 = m92642L3.getBoolean("extra_from_zcloud", false);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (this.f55637l1 == 1) {
            this.f55622W0 = C30114x4.m148682c(LayoutInflater.from(getContext()), viewGroup, false);
            m57492PM();
            C30114x4 c30114x4 = this.f55622W0;
            AbstractC19074t.m100205c(c30114x4);
            LinearLayout root = c30114x4.getRoot();
            AbstractC19074t.m100205c(root);
            return root;
        }
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClickable(true);
        frameLayout.setBackgroundColor(AbstractC23136l9.m118641B(frameLayout.getContext(), AbstractC16801x.transparent));
        this.f55623X0 = frameLayout;
        AbstractC19074t.m100205c(frameLayout);
        return frameLayout;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putString("STATE_SELECTED_ACCOUNT_GG", this.f55630e1);
    }

    /* renamed from: WM */
    public final void m57506WM(View view) {
        ActionBar actionBar;
        int i11;
        AbstractC19074t.m100208f(view, "rootView");
        View findViewById = view.findViewById(AbstractC6918a0.zalo_action_bar);
        if (findViewById instanceof ActionBar) {
            actionBar = (ActionBar) findViewById;
        } else {
            actionBar = null;
        }
        if (actionBar != null) {
            if (C23212s8.m119603k()) {
                i11 = AbstractC16803z.stencils_ic_head_back_black;
            } else {
                i11 = AbstractC16803z.stencils_ic_head_back_white;
            }
            actionBar.setBackButtonImage(i11);
            actionBar.setBackgroundResource(AbstractC16801x.transparent);
            actionBar.setActionBarMenuOnItemClick(new C11012e());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        if (this.f55637l1 == 3) {
            this.f88756W = 0;
        }
        super.finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ManageGoogleAccountView";
    }

    @Override // com.zing.zalo.p077ui.backuprestore.drive.SyncGoogleAccountBaseView, com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        boolean z11;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 18053 && i12 == -1) {
            C3297h.f14104a.m16744l(m92656bJ());
            if (intent != null) {
                z11 = intent.getBooleanExtra("return_setted_pass", false);
            } else {
                z11 = false;
            }
            super.mo57508yM(this.f55631f1, z11);
        }
        if (i11 == 1000) {
            if (i12 == -1 && intent != null) {
                boolean booleanExtra = intent.getBooleanExtra("USE_ANOTHER_ACCOUNT", false);
                String stringExtra = intent.getStringExtra("RESULT_SELECTED_ACCOUNT");
                if (booleanExtra) {
                    m57532mM(null);
                    return;
                } else if (stringExtra != null && stringExtra.length() != 0) {
                    m57534rM(stringExtra);
                    return;
                }
            }
            SyncGoogleAccountBaseView.m57530wM(this, null, 1, null);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 150) {
            BaseZaloView baseZaloView = this.f72421L0;
            AbstractC19074t.m100207e(baseZaloView, "mThis");
            if (C22441m.m115982a(baseZaloView)) {
                if (this.f55637l1 == 3) {
                    String str = this.f55636k1;
                    AbstractC19074t.m100205c(str);
                    m57491OM(str);
                    return;
                }
                m57498VM(this.f55636k1);
                return;
            }
            Context m92648SI = this.f72421L0.m92648SI();
            AbstractC19074t.m100206d(m92648SI, "null cannot be cast to non-null type android.app.Activity");
            if (!AbstractC23034c6.m118111A0((Activity) m92648SI, "android.permission.READ_CONTACTS")) {
                if (!AbstractC23034c6.m118132R("android.permission.READ_CONTACTS")) {
                    m57504cN();
                    return;
                } else {
                    SyncGoogleAccountBaseView.m57530wM(this, null, 1, null);
                    return;
                }
            }
            SyncGoogleAccountBaseView.m57530wM(this, null, 1, null);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            BaseZaloView baseZaloView = this.f72421L0;
            AbstractC19074t.m100207e(baseZaloView, "mThis");
            if (C22441m.m115982a(baseZaloView) && this.f55637l1 == 1) {
                m57498VM(this.f55636k1);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (bundle != null) {
            this.f55634i1 = bundle.getString("STATE_SELECTED_ACCOUNT_GG");
        }
        BaseZaloView baseZaloView = this.f72421L0;
        AbstractC19074t.m100207e(baseZaloView, "mThis");
        if (!C22441m.m115982a(baseZaloView)) {
            if (this.f72421L0.m92648SI() instanceof ZaloActivity) {
                BaseZaloView baseZaloView2 = this.f72421L0;
                AbstractC19074t.m100207e(baseZaloView2, "mThis");
                C22441m.m115984c(baseZaloView2, 0, 2, null);
                return;
            }
            AbstractC23350e.m122774d(this.f55621V0, "Can not request permissions because Activity is not a BaseZaloActivity");
            return;
        }
        int i11 = this.f55637l1;
        if (i11 == 3) {
            String str = this.f55636k1;
            AbstractC19074t.m100205c(str);
            m57491OM(str);
        } else if (i11 == 2 || i11 == 4) {
            m57498VM(this.f55636k1);
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.drive.SyncGoogleAccountBaseView
    /* renamed from: xM */
    protected void mo57507xM() {
        if (this.f55637l1 != 1) {
            SyncGoogleAccountBaseView.m57530wM(this, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.backuprestore.drive.SyncGoogleAccountBaseView
    /* renamed from: yM */
    public void mo57508yM(String str, boolean z11) {
        if (this.f55632g1) {
            this.f55631f1 = str;
            C17487o0 m92693xK = this.f72421L0.m92693xK();
            AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
            C22438j.m115931E(m92693xK, this.f55633h1, false);
            return;
        }
        super.mo57508yM(str, z11);
    }
}
